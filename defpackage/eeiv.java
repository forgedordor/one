package defpackage;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.material.datepicker.MaterialCalendarGridView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeiv extends wv {
    final TextView s;
    final MaterialCalendarGridView t;

    public eeiv(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.s = textView;
        ley.q(textView, true);
        this.t = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
