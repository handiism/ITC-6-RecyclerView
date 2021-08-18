package id.handiism.languages;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private final Context context;
    private final ArrayList<Language> list;

    public Adapter(Context context, ArrayList<Language> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // set view holder
        return new Adapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        // change view based on position
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public void onBind(Language language) {
            // change view based on arraylist
            CardView cardView = itemView.findViewById(R.id.card_view);
            View logo = itemView.findViewById(R.id.view_logo);
            TextView title = itemView.findViewById(R.id.tv_language);

            logo.setBackground(AppCompatResources.getDrawable(context, language.getImage()));
            title.setText(language.getName());

            // show detailed information of programming language by clicking recycler view item
            cardView.setOnClickListener(view -> {
                // initialize view
                View dialogView = LayoutInflater.from(context).inflate(R.layout.dialog, null);
                View viewLogo = dialogView.findViewById(R.id.view_logo);

                TextView tvTitle = dialogView.findViewById(R.id.tv_title);
                TextView tvInventorName = dialogView.findViewById(R.id.tv_inventor_name);
                TextView tvDescriptionDetail = dialogView.findViewById(R.id.tv_description_detail);

                // change view based on recycler view position
                viewLogo.setBackground(AppCompatResources.getDrawable(context, language.getImage()));
                tvTitle.setText(language.getName());
                tvInventorName.setText(language.getInventor());
                tvDescriptionDetail.setText(language.getDescription());

                // start dialog view
                AlertDialog.Builder builder = new AlertDialog.Builder(context, R.style.WrapContentDialog);
                builder.setView(dialogView);
                final AlertDialog alertDialog = builder.show();
                alertDialog.show();
            });
        }
    }
}
