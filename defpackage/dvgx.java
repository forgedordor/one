package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvgx implements dvdf {
    public final ejxr a;
    private final Executor b;
    private final eoqr c = new eoqr();

    public dvgx(ejxr ejxrVar, Executor executor) {
        this.a = ejxrVar;
        this.b = executor;
    }

    private final ListenableFuture j(eooy eooyVar) {
        return this.c.b(eiid.c(eooyVar), this.b);
    }

    private static void k(ListenableFuture listenableFuture) {
        eork.r(eoqt.t(listenableFuture), new dvgw(), eoqg.a);
    }

    @Override // defpackage.dvdf
    public final ListenableFuture a() {
        return j(new eooy() { // from class: dvgd
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return ((eiju) this.a.a.get()).i(new eooz() { // from class: dvge
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return ((dvdf) obj).a();
                    }
                }, eoqg.a);
            }
        });
    }

    @Override // defpackage.dvdf
    public final ListenableFuture b() {
        return j(new eooy() { // from class: dvgp
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return ((eiju) this.a.a.get()).i(new eooz() { // from class: dvgi
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return ((dvdf) obj).b();
                    }
                }, eoqg.a);
            }
        });
    }

    @Override // defpackage.dvdf
    public final ListenableFuture c(final dvde dvdeVar, final int i) {
        return j(new eooy() { // from class: dvgf
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                eiju eijuVar = (eiju) this.a.a.get();
                final dvde dvdeVar2 = dvdeVar;
                final int i2 = i;
                return eijuVar.i(new eooz() { // from class: dvgh
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return ((dvdf) obj).c(dvdeVar2, i2);
                    }
                }, eoqg.a);
            }
        });
    }

    @Override // defpackage.dvdf
    public final ListenableFuture d() {
        return j(new eooy() { // from class: dvgj
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                return ((eiju) this.a.a.get()).i(new eooz() { // from class: dvgo
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return ((dvdf) obj).d();
                    }
                }, eoqg.a);
            }
        });
    }

    @Override // defpackage.dvdf
    public final ListenableFuture e(final dvde dvdeVar, final int i) {
        return j(new eooy() { // from class: dvgv
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                eiju eijuVar = (eiju) this.a.a.get();
                final dvde dvdeVar2 = dvdeVar;
                final int i2 = i;
                return eijuVar.i(new eooz() { // from class: dvgm
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return ((dvdf) obj).e(dvdeVar2, i2);
                    }
                }, eoqg.a);
            }
        });
    }

    @Override // defpackage.dvdf
    public final ListenableFuture f(final byte[] bArr, final eudi eudiVar) {
        return j(new eooy() { // from class: dvgg
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                eiju eijuVar = (eiju) this.a.a.get();
                final byte[] bArr2 = bArr;
                final eudi eudiVar2 = eudiVar;
                return eijuVar.i(new eooz() { // from class: dvgq
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return ((dvdf) obj).f(bArr2, eudiVar2);
                    }
                }, eoqg.a);
            }
        });
    }

    @Override // defpackage.dvdf
    public final void g(final dvdd dvddVar, final Executor executor) {
        k(j(new eooy() { // from class: dvgu
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                eiju eijuVar = (eiju) this.a.a.get();
                final dvdd dvddVar2 = dvddVar;
                final Executor executor2 = executor;
                return eijuVar.h(new ejvr() { // from class: dvgs
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ((dvdf) obj).g(dvddVar2, executor2);
                        return null;
                    }
                }, eoqg.a);
            }
        }));
    }

    @Override // defpackage.dvdf
    public final void h(final dvdd dvddVar) {
        k(j(new eooy() { // from class: dvgk
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                eiju eijuVar = (eiju) this.a.a.get();
                final dvdd dvddVar2 = dvddVar;
                return eijuVar.h(new ejvr() { // from class: dvgl
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ((dvdf) obj).h(dvddVar2);
                        return null;
                    }
                }, eoqg.a);
            }
        }));
    }

    @Override // defpackage.dvdf
    public final ListenableFuture i(final byte[] bArr) {
        return j(new eooy() { // from class: dvgn
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                eiju eijuVar = (eiju) this.a.a.get();
                final byte[] bArr2 = bArr;
                return eijuVar.i(new eooz() { // from class: dvgt
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        return ((dvdf) obj).i(bArr2);
                    }
                }, eoqg.a);
            }
        });
    }
}
