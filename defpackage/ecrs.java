package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecrs extends ClickableSpan {
    final /* synthetic */ ecrv a;

    public ecrs(ecrv ecrvVar) {
        this.a = ecrvVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.a();
    }
}
