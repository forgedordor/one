package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzhd implements dzhg {
    public final diep a;
    public final fcsu b;

    public dzhd(diep diepVar, fcsu fcsuVar) {
        this.a = diepVar;
        this.b = fcsuVar;
    }

    @Override // defpackage.dzhg
    public final ListenableFuture<dzgw> a() {
        return eork.i(new dzhc(this));
    }
}
