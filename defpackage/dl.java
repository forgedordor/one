package defpackage;

import android.util.Log;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dl implements lvz {
    final /* synthetic */ dn a;

    public dl(dn dnVar) {
        this.a = dnVar;
    }

    @Override // defpackage.lvz
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (((lvj) obj) != null) {
            dn dnVar = this.a;
            if (dnVar.c) {
                View viewN = dnVar.N();
                if (viewN.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                if (dnVar.d != null) {
                    if (fr.ad(3)) {
                        Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + dnVar.d);
                    }
                    dnVar.d.setContentView(viewN);
                }
            }
        }
    }
}
