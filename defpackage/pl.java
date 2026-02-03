package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pl implements Runnable {
    final /* synthetic */ ps a;
    private final po b;

    public pl(ps psVar, po poVar) {
        this.a = psVar;
        this.b = poVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oa oaVar;
        ps psVar = this.a;
        oc ocVar = psVar.c;
        if (ocVar != null && (oaVar = ocVar.b) != null) {
            oaVar.H(ocVar);
        }
        View view = (View) psVar.f;
        if (view != null && view.getWindowToken() != null) {
            po poVar = this.b;
            if (poVar.i()) {
                psVar.j = poVar;
            }
        }
        psVar.l = null;
    }
}
