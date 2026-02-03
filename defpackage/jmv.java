package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmv extends fdbr implements fdap {
    final /* synthetic */ View a;
    final /* synthetic */ View b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmv(View view, View view2) {
        super(1);
        this.a = view;
        this.b = view2;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        View view = (View) obj;
        return Boolean.valueOf(jmx.b(this.a, view, view.getNextFocusForwardId()) == this.b);
    }
}
