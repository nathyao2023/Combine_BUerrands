package com.example.myapplication.ui.delivery;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

import java.util.List;

public class DeliveryAdapter extends RecyclerView.Adapter<DeliveryAdapter.ViewHolder> {
    private List<DeliveryFragment.Order> orders;

    public DeliveryAdapter(List<DeliveryFragment.Order> orders) {
        this.orders = orders;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_order, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DeliveryFragment.Order order = orders.get(position);

        holder.orderName.setText(order.getName());
        holder.startAddress.setText(order.getStartAddress());
        holder.endAddress.setText(order.getEndAddress());
    }

    @Override
    public int getItemCount() {
        return orders.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView orderName;
        public TextView startAddress;
        public TextView endAddress;
        public Button acceptButton;

        public ViewHolder(View view) {
            super(view);
            orderName = view.findViewById(R.id.order_name);
            startAddress = view.findViewById(R.id.start_address);
            endAddress = view.findViewById(R.id.end_address);
            acceptButton = view.findViewById(R.id.accept_button);
        }
    }
}





//
//public class OrderListAdapter extends RecyclerView.Adapter<OrderListAdapter.ViewHolder> {
//
//    private List<Order> orderList;
//
//    public OrderListAdapter(List<Order> orderList) {
//        this.orderList = orderList;
//    }
//
//    public void setOrderList(List<Order> orderList) {
//        this.orderList = orderList;
//        notifyDataSetChanged();
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        View view = LayoutInflater.from(parent.getContext())
//                .inflate(R.layout.order_item, parent, false);
//        return new ViewHolder(view);
//    }
//
//    @NonNull
//    @Override
//    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
//        return null;
//    }
//
//    @Override
//    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
//        Order order = orderList.get(position);
//        holder.name.setText(order.getName());
//        holder.startAddress.setText(order.getStartAddress());
//        holder.deliveryAddress.setText(order.getDeliveryAddress());
//        holder.checkBox.setChecked(order.isChecked());
//        holder.checkBox.setOnClickListener(v -> {
//            CheckBox checkBox = (CheckBox) v;
//            order.setChecked(checkBox.isChecked());
//        });
//    }
//
//    @Override
//    public int getItemCount() {
//        return orderList.size();
//    }
//
//    public static class ViewHolder extends RecyclerView.ViewHolder {
//        public TextView name;
//        public TextView from;
//        public TextView to;
//        public CheckBox checkBox;
//
//        public ViewHolder(@NonNull View itemView) {
//            super(itemView);
//            name = itemView.findViewById(R.id.order_name);
//            from = itemView.findViewById(R.id.order_startAddress);
//            to = itemView.findViewById(R.id.order_deliveryAddress);
//            checkBox = itemView.findViewById(R.id.order_checkbox);
//        }
//    }
//}
