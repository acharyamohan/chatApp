package com.example.chat3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {

    private List<MessageItem> messageList;

    public MessageAdapter(List<MessageItem> messageList) {
        this.messageList = messageList;
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_message, parent, false);
        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        MessageItem messageItem = messageList.get(position);
        holder.senderNameTextView.setText(messageItem.getSenderName());
        holder.messageContentTextView.setText(messageItem.getMessage());
        holder.timestampTextView.setText(messageItem.getTimestamp());
    }

    @Override
    public int getItemCount() {
        return messageList.size();
    }

    public void addMessage(MessageItem message) {
        messageList.add(0, message);  // Add to the beginning of the list
        notifyItemInserted(0);
        // Optionally, scroll to the top after adding a new message
        // You might need to pass the RecyclerView to this method or use an interface to do this
    }

    static class MessageViewHolder extends RecyclerView.ViewHolder {
        TextView senderNameTextView;
        TextView messageContentTextView;
        TextView timestampTextView;

        public MessageViewHolder(@NonNull View itemView) {
            super(itemView);
            senderNameTextView = itemView.findViewById(R.id.sender_name);
            messageContentTextView = itemView.findViewById(R.id.message_content);
            timestampTextView = itemView.findViewById(R.id.timestamp);
        }
    }
}