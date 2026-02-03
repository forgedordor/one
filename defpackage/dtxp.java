package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtxp extends lxl {
    final /* synthetic */ dtws a;
    final /* synthetic */ Executor b;

    public dtxp(dtws dtwsVar, Executor executor) {
        this.a = dtwsVar;
        this.b = executor;
    }

    @Override // defpackage.lxl, defpackage.lxk
    public final lxd a(Class cls) {
        return new dtxq(this.a, this.b);
    }
}
