/**
 * Copyright (C) 2012 - 2014 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.xchange.coinbase.dto.account;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.xeiam.xchange.coinbase.dto.CoinbasePagedResult;

/**
 * @author jamespedwards42
 */
public class CoinbaseRecurringPayments extends CoinbasePagedResult {

  private final List<CoinbaseRecurringPayment> recurringPayments;

  private CoinbaseRecurringPayments(@JsonProperty("recurring_payments") final List<CoinbaseRecurringPayment> recurringPayments, @JsonProperty("total_count") final int totalCount,
      @JsonProperty("num_pages") final int numPages, @JsonProperty("current_page") final int currentPage) {

    super(totalCount, numPages, currentPage);
    this.recurringPayments = recurringPayments;
  }

  public List<CoinbaseRecurringPayment> getRecurringPayments() {

    return recurringPayments;
  }

  @Override
  public String toString() {

    return "CoinbaseRecurringPayments [recurringPayments=" + recurringPayments + "]";
  }

}
