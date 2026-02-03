package defpackage;

import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnqm extends dnqo {
    private final TextView s;

    public dnqm(View view) {
        super(view);
        this.s = (TextView) view;
    }

    @Override // defpackage.dnqo
    public final void C(dnqu dnquVar) {
        dnquVar.getClass();
        String str = ((dnqt) dnquVar).a;
        TextView textView = this.s;
        textView.setText(str);
        textView.setContentDescription(str);
    }
}
