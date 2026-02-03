package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzas implements dyyv {
    public dyyv a;
    public final List b = new ArrayList();

    public dzas(dyyv dyyvVar, dyyv dyyvVar2) {
        this.a = new dzar(this, dyyvVar, dyyvVar2);
    }

    @Override // defpackage.dyyv
    public final ListenableFuture a() {
        return this.a.a();
    }

    @Override // defpackage.dyyv
    public final ListenableFuture b(String str) {
        return this.a.b(str);
    }

    @Override // defpackage.dyyv
    public final ListenableFuture c() {
        return this.a.c();
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
        return this.a.f(str, i);
    }

    @Override // defpackage.dyyv
    public final ListenableFuture g(String str, int i) {
        return this.a.g(str, i);
    }
}
