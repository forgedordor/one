package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bgz implements biu {
    public final bgy a;
    public final bgw b;
    private final biu c;

    public bgz(biu biuVar, bgy bgyVar) {
        this.c = biuVar;
        this.a = bgyVar;
        this.b = new bgw(biuVar.e(), bgyVar.b.b());
    }

    @Override // defpackage.biu
    public final void A(boolean z) {
        this.c.A(z);
    }

    @Override // defpackage.biu
    public final void B(big bigVar) {
        this.c.B(bigVar);
    }

    @Override // defpackage.biu
    public final boolean H() {
        return this.c.H();
    }

    @Override // defpackage.biu
    public final boolean I() {
        return this.c.I();
    }

    @Override // defpackage.biu
    public final void P() {
        this.c.P();
    }

    @Override // defpackage.ayv
    public final ayx b() {
        throw null;
    }

    @Override // defpackage.biu, defpackage.ayv
    public final azd c() {
        return this.a;
    }

    @Override // defpackage.biu
    public final big d() {
        return this.c.d();
    }

    @Override // defpackage.biu
    public final bin e() {
        return this.b;
    }

    @Override // defpackage.biu
    public final bir f() {
        return this.a;
    }

    @Override // defpackage.biu
    public final blm g() {
        return this.c.g();
    }

    @Override // defpackage.biu
    public final ListenableFuture h() {
        return this.c.h();
    }

    @Override // defpackage.biu
    public final void o(Collection collection) {
        this.c.o(collection);
    }

    @Override // defpackage.biu
    public final void s(Collection collection) {
        this.c.s(collection);
    }

    @Override // defpackage.bdq
    public final void u(bdr bdrVar) {
        this.c.u(bdrVar);
    }

    @Override // defpackage.bdq
    public final void v(bdr bdrVar) {
        this.c.v(bdrVar);
    }

    @Override // defpackage.bdq
    public final void w(bdr bdrVar) {
        this.c.w(bdrVar);
    }

    @Override // defpackage.bdq
    public final void x(bdr bdrVar) {
        this.c.x(bdrVar);
    }
}
