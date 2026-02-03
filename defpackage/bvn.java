package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bvn implements biu {
    public final bvv a;
    private final biu b;
    private final bvu c;
    private final bdq d;

    public bvn(biu biuVar, bdq bdqVar, bvj bvjVar) {
        this.b = biuVar;
        this.d = bdqVar;
        bgz bgzVar = (bgz) biuVar;
        this.c = new bvu(bgzVar.b, bvjVar);
        this.a = new bvv(bgzVar.a);
    }

    @Override // defpackage.biu
    public final boolean H() {
        return false;
    }

    @Override // defpackage.biu
    public final /* synthetic */ boolean I() {
        return bis.b(this);
    }

    @Override // defpackage.ayv
    public final /* synthetic */ ayx b() {
        throw null;
    }

    @Override // defpackage.biu, defpackage.ayv
    public final /* synthetic */ azd c() {
        return bis.a(this);
    }

    @Override // defpackage.biu
    public final /* synthetic */ big d() {
        return bij.a;
    }

    @Override // defpackage.biu
    public final bin e() {
        return this.c;
    }

    @Override // defpackage.biu
    public final bir f() {
        return this.a;
    }

    @Override // defpackage.biu
    public final blm g() {
        return this.b.g();
    }

    @Override // defpackage.biu
    public final ListenableFuture h() {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.biu
    public final void o(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.biu
    public final void s(Collection collection) {
        throw new UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // defpackage.bdq
    public final void u(bdr bdrVar) {
        box.b();
        this.d.u(bdrVar);
    }

    @Override // defpackage.bdq
    public final void v(bdr bdrVar) {
        box.b();
        this.d.v(bdrVar);
    }

    @Override // defpackage.bdq
    public final void w(bdr bdrVar) {
        box.b();
        this.d.w(bdrVar);
    }

    @Override // defpackage.bdq
    public final void x(bdr bdrVar) {
        box.b();
        this.d.x(bdrVar);
    }

    @Override // defpackage.biu
    public final /* synthetic */ void P() {
    }

    @Override // defpackage.biu
    public final /* synthetic */ void A(boolean z) {
    }

    @Override // defpackage.biu
    public final /* synthetic */ void B(big bigVar) {
    }
}
