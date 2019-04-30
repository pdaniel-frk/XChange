package org.knowm.xchange.deribit.v2.dto.marketdata.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.knowm.xchange.deribit.v2.dto.DeribitError;
import org.knowm.xchange.deribit.v2.dto.DeribitResponse;
import org.knowm.xchange.deribit.v2.dto.marketdata.DeribitTicker;

public class DeribitTickerResponse extends DeribitResponse<DeribitTicker> {

  public DeribitTickerResponse(
      @JsonProperty("jsonrpc") String jsonRPC,
      @JsonProperty("id") long id,
      @JsonProperty("result") DeribitTicker result,
      @JsonProperty("error") DeribitError error,
      @JsonProperty("testnet") boolean testnet,
      @JsonProperty("usOut") long usOut,
      @JsonProperty("usIn") long usIn,
      @JsonProperty("usDiff") long usDiff) {

    super(jsonRPC, id, result, error, testnet, usOut, usIn, usDiff);
  }
}
