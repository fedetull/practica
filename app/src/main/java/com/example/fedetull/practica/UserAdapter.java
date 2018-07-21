package com.example.fedetull.practica;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class UserAdapter extends ArrayAdapter<User>{
    public UserAdapter(Context context,  List<User> items){
        super(context, 0,items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        User user = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.user_item, parent, false);

        }
        TextView textNombre= convertView.findViewById(R.id.textNombre);
        TextView textDireccion= convertView.findViewById(R.id.textDireccion);

        textNombre.setText(user.getName());
        textDireccion.setText(user.getAddress());
    return convertView;
    }

}
