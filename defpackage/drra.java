package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drra extends wv {
    public final View s;
    public final TextView t;
    public final ImageView u;

    public drra(View view) {
        super(view);
        this.u = (ImageView) ley.b(view, R.id.emoji_picker_header_icon);
        this.t = (TextView) view.findViewById(R.id.emoji_picker_header_text);
        View viewFindViewById = view.findViewById(R.id.emoji_picker_header_underline);
        this.s = (viewFindViewById == null || viewFindViewById.getVisibility() != 0) ? null : viewFindViewById;
    }

    final void C(boolean z) {
        View view = this.s;
        if (view == null) {
            this.a.setSelected(z);
            return;
        }
        this.u.setSelected(z);
        view.setVisibility(true != z ? 8 : 0);
        view.setSelected(z);
    }
}
