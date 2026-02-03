package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecwo extends wv {
    final TextView s;
    final TextView t;

    public ecwo(View view) {
        super(view);
        this.s = (TextView) view.findViewById(R.id.country_code_selection_item_name);
        this.t = (TextView) view.findViewById(R.id.country_code_selection_item_code);
    }
}
