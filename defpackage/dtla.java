package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtla implements View.OnLayoutChangeListener {
    final /* synthetic */ dtli a;

    public dtla(dtli dtliVar) {
        this.a = dtliVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        dtli dtliVar = this.a;
        dtliVar.m();
        dtliVar.n(dtliVar.a());
        dtliVar.removeOnLayoutChangeListener(this);
    }
}
