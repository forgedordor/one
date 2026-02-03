package defpackage;

import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class he extends hi {
    private final gc j;

    /* JADX WARN: Illegal instructions before constructor call */
    public he(int i, int i2, gc gcVar) {
        ea eaVar = gcVar.a;
        eaVar.getClass();
        super(i, i2, eaVar);
        this.j = gcVar;
    }

    @Override // defpackage.hi
    public final void a() {
        super.a();
        this.a.t = false;
        this.j.e();
    }

    @Override // defpackage.hi
    public final void b() {
        if (this.e) {
            return;
        }
        super.b();
        int i = this.i;
        if (i != 2) {
            if (i == 3) {
                ea eaVar = this.j.a;
                eaVar.getClass();
                View viewN = eaVar.N();
                if (fr.ad(2)) {
                    Log.v("FragmentManager", "Clearing focus " + viewN.findFocus() + " on view " + viewN + " for Fragment " + eaVar);
                }
                viewN.clearFocus();
                return;
            }
            return;
        }
        gc gcVar = this.j;
        ea eaVar2 = gcVar.a;
        eaVar2.getClass();
        View viewFindFocus = eaVar2.Q.findFocus();
        if (viewFindFocus != null) {
            eaVar2.au(viewFindFocus);
            if (fr.ad(2)) {
                Log.v("FragmentManager", a.i(eaVar2, viewFindFocus, "requestFocus: Saved focused view ", " for Fragment "));
            }
        }
        View viewN2 = this.a.N();
        if (viewN2.getParent() == null) {
            if (fr.ad(2)) {
                Log.v("FragmentManager", a.j(viewN2, eaVar2, "Adding fragment ", " view ", " to container in onStart"));
            }
            gcVar.b();
            viewN2.setAlpha(0.0f);
        }
        if (viewN2.getAlpha() == 0.0f && viewN2.getVisibility() == 0) {
            if (fr.ad(2)) {
                Log.v("FragmentManager", a.h(viewN2, "Making view ", " INVISIBLE in onStart"));
            }
            viewN2.setVisibility(4);
        }
        viewN2.setAlpha(eaVar2.u());
        if (fr.ad(2)) {
            Log.v("FragmentManager", "Setting view alpha to " + eaVar2.u() + " in onStart");
        }
    }
}
