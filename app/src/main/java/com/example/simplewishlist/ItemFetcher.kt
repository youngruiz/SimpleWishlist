package com.example.simplewishlist

class ItemFetcher {
    companion object {
        var itemName = listOf("Mouth Wash", "Pencils", "Soap", "Notebook", "Eraser")
        var itemUrl = listOf("amazon.com", "target.com", "walmart.com", "officemax.com", "amazon.com")
        var itemPrice = listOf("6.99", "3.99", "4.99", "0.99", "0.99")
        fun getItems(): MutableList<Item> {
            var items : MutableList<Item> = ArrayList()
            for (i in 0..itemName.size-1) {
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