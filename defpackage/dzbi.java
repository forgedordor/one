package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzbi implements dyyv {
    private final dyyv a;
    private final dzbk b;
    private final dzbn c;

    public dzbi(dyyv dyyvVar, int i, dyws dywsVar, String str) {
        this.a = dyyvVar;
        this.c = new dzbn(dyyvVar, i, dywsVar, str);
        this.b = new dzbk(dyyvVar, i, dywsVar, str);
    }

    @Override // defpackage.dyyv
    public final ListenableFuture a() {
        return this.c.a(true);
    }

    @Override // defpackage.dyyv
    public final ListenableFuture b(String str) {
        dzbn dzbnVar = this.c;
        ListenableFuture listenableFutureB = dzbnVar.a.b(str);
        eika.l(listenableFutureB, new dzbm(dzbnVar), eoqg.a);
        return listenableFutureB;
    }

    @Override // defpackage.dyyv
    public final ListenableFuture c() {
        return this.c.a(false);
    }

    @Override // defpackage.dyyv
    public final void d(eglg eglgVar) {
        this.a.d(eglgVar);
    }

    @Override // defpackage.dyyv
    public final void e(eglg eglgVar) {
        this.a.e(eglgVar);
    }

    @Override // defpackage.dyyv
    public final ListenableFuture f(String str, int i) {
        return this.b.a(true, str, i);
    }

    @Override // defpackage.dyyv
    public final ListenableFuture g(String str, int i) {
        return this.b.a(false, str, i);
    }
}
