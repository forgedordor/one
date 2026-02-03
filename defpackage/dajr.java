package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dajr extends ClickableSpan {
    final /* synthetic */ View.OnClickListener a;

    public dajr(View.OnClickListener onClickListener) {
        this.a = onClickListener;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.onClick(view);
    }
}
