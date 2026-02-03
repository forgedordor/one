package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzhi implements dzhg {
    final fcsu a;
    final fcsu b;
    final fcsu c;
    final fcsu d;

    public dzhi(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
    }

    @Override // defpackage.dzhg
    public final ListenableFuture<dzgw> a() {
        return eork.i(new dzhh(this));
    }
}
