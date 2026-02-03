package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uqh extends wv {
    final View s;
    final TextView t;
    final ImageView u;

    public uqh(View view) {
        super(view);
        this.s = view;
        this.t = (TextView) view.findViewById(R.id.group_name);
        this.u = (ImageView) view.findViewById(R.id.edit_group_name);
    }
}
