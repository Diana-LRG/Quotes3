package com.example.quotes3.core.utils

import com.example.quotes3.domain.model.QuoteModel

interface CellClickListener  {
    fun onCellClickListener(quoteModel: QuoteModel)
}