package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzhf implements dzhg {
    final eygg a;

    public dzhf(eygg<dznt> eyggVar) {
        this.a = eyggVar;
    }

    @Override // defpackage.dzhg
    public ListenableFuture<dzgw> a() {
        return eork.i(new dzhe(this));
    }
}
