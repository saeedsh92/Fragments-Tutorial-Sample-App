package ss.com.fragments.viewpager.onefragment;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import ss.com.fragments.R;

/**
 * @author S.Shahini
 * @since 12/31/17
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {
    private ArrayList<News> newsList;
    private Context context;

    public NewsAdapter(Context context, ArrayList<News> newsList) {
        this.context = context;
        this.newsList = newsList;
    }

    @Override
    public NewsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new NewsViewHolder(LayoutInflater.from(context).inflate(R.layout.item_news,parent,false));
    }

    @Override
    public void onBindViewHolder(NewsViewHolder holder, int position) {
        holder.bindNews(newsList.get(position));
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class NewsViewHolder extends RecyclerView.ViewHolder {
        private TextView titleTextView;
        private TextView descriptionTextView;

        public NewsViewHolder(View itemView) {
            super(itemView);
            this.titleTextView = itemView.findViewById(R.id.tv_news_title);
            this.descriptionTextView = itemView.findViewById(R.id.tv_news_description);
        }

        public void bindNews(News news) {
            titleTextView.setText(news.getTitle());
            descriptionTextView.setText(news.getDescription());
        }
    }
}
