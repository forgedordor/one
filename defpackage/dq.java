package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dq extends dx {
    final /* synthetic */ ea a;

    public dq(ea eaVar) {
        this.a = eaVar;
    }

    @Override // defpackage.dx
    public final void a() {
        ea eaVar = this.a;
        eaVar.ad.a();
        lwu.c(eaVar);
        Bundle bundle = eaVar.h;
        eaVar.ad.b(bundle != null ? bundle.getBundle("registryState") : null);
    }
}
