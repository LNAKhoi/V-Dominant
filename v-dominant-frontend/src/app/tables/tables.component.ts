import {AfterViewInit, Component, OnInit} from '@angular/core';

declare interface TableData {
    headerRow: string[];
    dataRows: string[][];
}

@Component({
  selector: 'app-tables',
  templateUrl: './tables.component.html',
  styleUrls: ['./tables.component.css']
})
export class TablesComponent implements AfterViewInit {
    symbol = 'OANDA:XAUUSD';
    interval = 'H';
    height = 620;

    ngAfterViewInit(): void {
        if ((window as any).TradingView) {
            this.createWidget();
            return;
        }

        const script = document.createElement('script');
        script.id = 'tradingview-widget-script';
        script.src = 'https://s3.tradingview.com/tv.js';
        script.onload = () => this.createWidget();
        document.head.appendChild(script);
    }

    private createWidget() {
        try {
            new (window as any).TradingView.widget({
                container_id: 'tv_chart',
                width: '100%',
                height: this.height,
                symbol: this.symbol,
                interval: this.interval,
                timezone: 'Etc/UTC',
                theme: 'light',
                style: '1',
                locale: 'en',
                toolbar_bg: '#f1f3f6',
                enable_publishing: false,
                allow_symbol_change: true,
                details: false
                // studies: [ 'MACD@tv-basicstudies', 'RSI@tv-basicstudies' ]
            });
        } catch (e) {
            console.error('TradingView widget error', e);
        }
    }
}
