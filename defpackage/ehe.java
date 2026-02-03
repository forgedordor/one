package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ehe implements hnx {
    final /* synthetic */ ehg a;
    final /* synthetic */ View b;

    public ehe(ehg ehgVar, View view) {
        this.a = ehgVar;
        this.b = view;
    }

    @Override // defpackage.hnx
    public final void a() {
        ehg ehgVar = this.a;
        int i = ehgVar.i - 1;
        ehgVar.i = i;
        if (i == 0) {
            View view = this.b;
            int[] iArr = ley.a;
            len.k(view, null);
            lgb.d(view, null);
            view.removeOnAttachStateChangeListener(ehgVar.j);
        }
    }
}
