package com.alisson.biblioteca.enums;

import java.math.BigDecimal;

public enum TaxaCategoria {
    ALTA{
      @Override
      public BigDecimal PercentualReajuste(){
          return new BigDecimal("0.15");
      }
    },
    MEDIA{
        @Override
        public BigDecimal PercentualReajuste(){
            return new BigDecimal("0.1");
        }
    },
    BAIXA{
        @Override
        public BigDecimal PercentualReajuste(){
            return new BigDecimal("0.03");
        }
    };

    public abstract BigDecimal PercentualReajuste();
}
