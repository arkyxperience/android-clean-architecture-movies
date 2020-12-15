package leopoldoromacho.com.udemy9thdec20.presentation.tv

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import leopoldoromacho.com.udemy9thdec20.R
import leopoldoromacho.com.udemy9thdec20.data.model.TvShow.TvShow
import leopoldoromacho.com.udemy9thdec20.databinding.ListItemBinding


class TvAdapter(): RecyclerView.Adapter<MyViewHolder>() {
    private val tvList = ArrayList<TvShow>()

    fun setList(tvShows:List<TvShow>){
        tvList.clear()
        tvList.addAll(tvShows)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding : ListItemBinding = DataBindingUtil.inflate(
            layoutInflater,
            R.layout.list_item,
            parent,
            false
        )
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return tvList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(tvList[position])
    }
}
