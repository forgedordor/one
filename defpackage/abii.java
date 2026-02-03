package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abii extends abs {
    final /* synthetic */ abij a;
    final /* synthetic */ Activity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abii(abij abijVar, Activity activity) {
        super(true);
        this.a = abijVar;
        this.d = activity;
    }

    @Override // defpackage.abs
    public final void b() {
        abij abijVar = this.a;
        auvw.k(abijVar.d, null, null, new abih(abijVar, null), 3);
        h(false);
        ((abi) this.d).c().d();
    }
}
