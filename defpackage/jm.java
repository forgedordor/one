package defpackage;

import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jm implements oo {
    final /* synthetic */ jz a;

    public jm(jz jzVar) {
        this.a = jzVar;
    }

    @Override // defpackage.oo
    public final void a(oc ocVar, boolean z) {
        this.a.B(ocVar);
    }

    @Override // defpackage.oo
    public final boolean b(oc ocVar) {
        Window.Callback callbackX = this.a.x();
        if (callbackX == null) {
            return true;
        }
        callbackX.onMenuOpened(108, ocVar);
        return true;
    }
}
