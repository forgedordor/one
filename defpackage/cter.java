package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cter extends ArrayAdapter {
    final /* synthetic */ ctes a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cter(ctes ctesVar, Context context, List list) {
        super(context, R.layout.sms_free_storage_action_item_view, list);
        this.a = ctesVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(final int i, View view, ViewGroup viewGroup) {
        TextView textView = view instanceof TextView ? (TextView) view : (TextView) LayoutInflater.from(getContext()).inflate(R.layout.sms_free_storage_action_item_view, viewGroup, false);
        textView.setText((String) getItem(i));
        textView.setOnClickListener(new View.OnClickListener() { // from class: cteq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ctes ctesVar = this.a.a;
                ctesVar.hh();
                ctev ctevVar = new ctev();
                Bundle bundle = new Bundle();
                bundle.putInt("action_index", i);
                ctevVar.at(bundle);
                fr frVar = ctesVar.B;
                if (frVar != null) {
                    ctevVar.t(frVar, null);
                }
            }
        });
        return textView;
    }
}
