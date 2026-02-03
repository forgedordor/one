package defpackage;

import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drip implements Runnable {
    final /* synthetic */ List a;
    final /* synthetic */ int b;
    final /* synthetic */ driq c;

    public drip(driq driqVar, List list, int i) {
        this.a = list;
        this.b = i;
        this.c = driqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        drir drirVar = this.c.d;
        eg egVarG = drirVar.G();
        boolean zIsDestroyed = egVarG.isDestroyed();
        if (egVarG == 0 || egVarG.isFinishing() || zIsDestroyed) {
            Log.w("HatsLibMultiChoiceFrag", "Activity was null, finishing or destroyed while attempting to navigate to the next next page. Likely the user rotated the device before the Runnable executed.");
            return;
        }
        List list = this.a;
        int i = this.b;
        drirVar.d = ((erwr) list.get(i)).b;
        drirVar.e = i;
        drirVar.ag.b();
        Log.d("HatsLibMultiChoiceFrag", "User selected response: ".concat(String.valueOf(String.valueOf(list.get(i)))));
        ((driv) egVarG).D();
        drhw.c().b().b = false;
    }
}
