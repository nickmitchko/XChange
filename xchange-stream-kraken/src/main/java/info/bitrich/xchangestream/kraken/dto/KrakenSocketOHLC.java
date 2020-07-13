package info.bitrich.xchangestream.kraken.dto;

import java.math.BigDecimal;
import org.knowm.xchange.kraken.dto.marketdata.KrakenOHLC;

public class KrakenSocketOHLC extends KrakenOHLC {

  private long endTime;

  public KrakenSocketOHLC(
      long time,
      long endTime,
      BigDecimal open,
      BigDecimal high,
      BigDecimal low,
      BigDecimal close,
      BigDecimal vwap,
      BigDecimal volume,
      long count) {
    super(time, open, high, low, close, vwap, volume, count);
    this.endTime = endTime;
  }

  public long getEndTime() {
    return endTime;
  }

  public void setEndTime(long endTime) {
    this.endTime = endTime;
  }
}
