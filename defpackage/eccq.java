package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eccq implements eccr {
    final /* synthetic */ Bundle a;

    public eccq(Bundle bundle) {
        this.a = bundle;
    }

    @Override // defpackage.eccr
    public final void a(ecdj ecdjVar) {
        if (ecdjVar instanceof ecdg) {
            Bundle bundle = new Bundle();
            ((ecdg) ecdjVar).a();
            String strG = eccs.G(ecdjVar);
            strG.getClass();
            this.a.putBundle(strG, bundle);
        }
    }
}
