package lat.pam.recycleviewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import lat.pam.recycleviewsample.ItemViewModel


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)


        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)


        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemViewModel>()

        data.add(ItemViewModel("Udin", 1247050101))
        data.add(ItemViewModel("Sopo", 1247050102))
        data.add(ItemViewModel("Jarwo", 1247050103))
        data.add(ItemViewModel("Ijat", 1247050104))
        data.add(ItemViewModel("Kiko", 1247050105))
        data.add(ItemViewModel("Ying", 1247050106))
        data.add(ItemViewModel("Yaya", 1247050107))
        data.add(ItemViewModel("Ros", 1247050108))
        data.add(ItemViewModel("Gopal ", 1247050109))
        data.add(ItemViewModel("Mail", 1247050110))

        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)
        Log.d("test string","Jumlah data: "+data.size)


        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }
}
