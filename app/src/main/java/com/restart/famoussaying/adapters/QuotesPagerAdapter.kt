package com.restart.famoussaying.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.restart.famoussaying.R
import com.restart.famoussaying.data.Quote

class QuotesPagerAdapter(
    private val quotes: List<Quote>
) : RecyclerView.Adapter<QuotesPagerAdapter.QuoteViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        QuoteViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_quote, parent, false)
        )

    override fun onBindViewHolder(holder: QuoteViewHolder, position: Int) {

        holder.bind(quotes[position])
    }

    override fun getItemCount() = quotes.size


    class QuoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val quoteTextview: TextView = itemView.findViewById(R.id.quoteTextView)
        private val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)

        fun bind(quote: Quote){
            quoteTextview.text = quote.quote
            nameTextView.text = quote.name
        }
    }

}