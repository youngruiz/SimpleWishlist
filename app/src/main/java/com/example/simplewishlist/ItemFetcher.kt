package com.example.simplewishlist

class ItemFetcher {
    companion object {
        val itemName = listOf("Mouth Wash", "Pencils", "Soap")
        val itemUrl = listOf("amazon.com", "target.com", "walmart.com")
        val itemPrice = listOf("6.99", "3.99", "4.99")
        fun getItems(): MutableList<Item> {
            var items : MutableList<Item> = ArrayList()
            for (i in 0..2) {
                val item = Item(itemName[i], itemUrl[i], itemPrice[i])
                items.add(item)
            }
            return items
        }

//        fun getNext5Emails(): MutableList<Email> {
//            var newEmails : MutableList<Email> = ArrayList()
//            for (i in 10..14) {
//                val email = Email(senders[i], title, summary)
//                newEmails.add(email)
//            }
//            return newEmails
//        }
    }
}