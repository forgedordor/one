package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duhv implements dugs {
    public final dulr a;
    public final Executor b;
    private final durk c;
    private final duof d;
    private final dulr e;
    private final dult f;
    private final Uri g;
    private final Uri h;
    private final ecev i;
    private final dtpi j;

    public duhv(durk durkVar, duof duofVar, dulr dulrVar, dulr dulrVar2, Uri uri, Uri uri2, dult dultVar, ecev ecevVar, Executor executor, dtpi dtpiVar) {
        this.c = durkVar;
        this.d = duofVar;
        this.e = dulrVar2;
        this.a = dulrVar;
        this.g = uri;
        this.h = uri2;
        this.f = dultVar;
        this.i = ecevVar;
        this.b = executor;
        this.j = dtpiVar;
    }

    private static ListenableFuture q() {
        return eork.h(new IllegalStateException("Migration flag had unexpected state"));
    }

    private final void r(Uri uri) throws ecgh {
        ecev ecevVar = this.i;
        if (ecevVar.h(uri)) {
            ecevVar.f(uri);
        }
    }

    @Override // defpackage.dugs
    public final ListenableFuture a(final dtqy dtqyVar) {
        int iOrdinal = this.f.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.a(dtqyVar) : eika.k(n(this.d.a(dtqyVar)), new eooz() { // from class: duhs
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duhv duhvVar = this.a;
                final dutw dutwVar = (dutw) obj;
                return eika.k(duhvVar.n(duhvVar.a.a(dtqyVar)), new eooz() { // from class: dugx
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return duhvVar.o(dutwVar, (dutw) obj2, 1096);
                    }
                }, duhvVar.b);
            }
        }, this.b) : this.d.a(dtqyVar);
    }

    @Override // defpackage.dugs
    public final ListenableFuture b() {
        int iOrdinal = this.f.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.b() : eika.k(n(this.d.b()), new eooz() { // from class: duhb
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duhv duhvVar = this.a;
                final dutw dutwVar = (dutw) obj;
                return eika.k(duhvVar.n(duhvVar.a.b()), new eooz() { // from class: duhj
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return duhvVar.o(dutwVar, (dutw) obj2, 1099);
                    }
                }, duhvVar.b);
            }
        }, this.b) : this.d.b();
    }

    @Override // defpackage.dugs
    public final ListenableFuture c() {
        final Comparator comparator = new Comparator() { // from class: duhu
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return duuj.e(((duon) obj).b()).compareTo(duuj.e(((duon) obj2).b()));
            }
        };
        int iOrdinal = this.f.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.c() : eika.k(n(this.d.c()), new eooz() { // from class: dugu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duhv duhvVar = this.a;
                final dutw dutwVar = (dutw) obj;
                ListenableFuture listenableFutureN = duhvVar.n(duhvVar.a.c());
                final Comparator comparator2 = comparator;
                return eika.k(listenableFutureN, new eooz() { // from class: duhi
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return duhvVar.p(dutwVar, (dutw) obj2, comparator2, 1093);
                    }
                }, duhvVar.b);
            }
        }, this.b) : this.d.c();
    }

    @Override // defpackage.dugs
    public final ListenableFuture d() {
        final Comparator comparator = new Comparator() { // from class: duhe
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return duuj.e((dtrw) obj).compareTo(duuj.e((dtrw) obj2));
            }
        };
        int iOrdinal = this.f.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.d() : eika.k(n(this.d.d()), new eooz() { // from class: duhn
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duhv duhvVar = this.a;
                final dutw dutwVar = (dutw) obj;
                ListenableFuture listenableFutureN = duhvVar.n(duhvVar.a.d());
                final Comparator comparator2 = comparator;
                return eika.k(listenableFutureN, new eooz() { // from class: duhm
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return duhvVar.p(dutwVar, (dutw) obj2, comparator2, 1092);
                    }
                }, duhvVar.b);
            }
        }, this.b) : this.d.d();
    }

    @Override // defpackage.dugs
    public final ListenableFuture e() {
        int iOrdinal = this.f.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.e() : eika.k(n(this.d.e()), new eooz() { // from class: duhr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duhv duhvVar = this.a;
                final dutw dutwVar = (dutw) obj;
                return eika.k(duhvVar.n(duhvVar.a.e()), new eooz() { // from class: dugz
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return duhvVar.o(dutwVar, (dutw) obj2, 1095);
                    }
                }, duhvVar.b);
            }
        }, this.b) : this.d.e();
    }

    @Override // defpackage.dugs
    public final ListenableFuture f() {
        int iOrdinal = this.f.a().ordinal();
        if (iOrdinal == 1) {
            try {
                try {
                    r(this.g);
                    r(this.h);
                    return eorv.a;
                } catch (Throwable th) {
                    r(this.h);
                    throw th;
                }
            } catch (IOException e) {
                return eork.h(e);
            }
        }
        if (iOrdinal == 2) {
            try {
                r(this.h);
                return eorv.a;
            } catch (IOException e2) {
                return eork.h(e2);
            }
        }
        if (iOrdinal != 3) {
            return q();
        }
        try {
            r(this.g);
            return eorv.a;
        } catch (IOException e3) {
            return eork.h(e3);
        }
    }

    @Override // defpackage.dugs
    public final ListenableFuture g(final dtrw dtrwVar) {
        int iOrdinal = this.f.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.g(dtrwVar) : eika.k(n(this.d.g(dtrwVar)), new eooz() { // from class: duhq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duhv duhvVar = this.a;
                final dutw dutwVar = (dutw) obj;
                return eika.k(duhvVar.n(duhvVar.a.g(dtrwVar)), new eooz() { // from class: dugt
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return duhvVar.o(dutwVar, (dutw) obj2, 1087);
                    }
                }, duhvVar.b);
            }
        }, this.b) : this.d.g(dtrwVar);
    }

    @Override // defpackage.dugs
    public final ListenableFuture h(final dtrw dtrwVar) {
        int iOrdinal = this.f.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.h(dtrwVar) : eika.k(n(this.d.h(dtrwVar)), new eooz() { // from class: duhf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duhv duhvVar = this.a;
                final dutw dutwVar = (dutw) obj;
                return eika.k(duhvVar.n(duhvVar.a.h(dtrwVar)), new eooz() { // from class: duht
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return duhvVar.o(dutwVar, (dutw) obj2, 1090);
                    }
                }, duhvVar.b);
            }
        }, this.b) : this.d.h(dtrwVar);
    }

    @Override // defpackage.dugs
    public final ListenableFuture i(final dtrw dtrwVar) {
        int iOrdinal = this.f.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.i(dtrwVar) : eika.k(n(this.d.i(dtrwVar)), new eooz() { // from class: duhd
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duhv duhvVar = this.a;
                final dutw dutwVar = (dutw) obj;
                return eika.k(duhvVar.n(duhvVar.a.i(dtrwVar)), new eooz() { // from class: duhp
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return duhvVar.o(dutwVar, (dutw) obj2, 1089);
                    }
                }, duhvVar.b);
            }
        }, this.b) : this.d.i(dtrwVar);
    }

    @Override // defpackage.dugs
    public final ListenableFuture j(final List list) {
        int iOrdinal = this.f.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.j(list) : eika.k(n(this.d.j(list)), new eooz() { // from class: duho
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duhv duhvVar = this.a;
                final dutw dutwVar = (dutw) obj;
                return eika.k(duhvVar.n(duhvVar.a.j(list)), new eooz() { // from class: dugv
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return duhvVar.o(dutwVar, (dutw) obj2, 1094);
                    }
                }, duhvVar.b);
            }
        }, this.b) : this.d.j(list);
    }

    @Override // defpackage.dugs
    public final ListenableFuture k() {
        int iOrdinal = this.f.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.k() : eika.k(n(this.d.k()), new eooz() { // from class: duhk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duhv duhvVar = this.a;
                final dutw dutwVar = (dutw) obj;
                return eika.k(duhvVar.n(duhvVar.a.k()), new eooz() { // from class: dugw
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return duhvVar.o(dutwVar, (dutw) obj2, 1098);
                    }
                }, duhvVar.b);
            }
        }, this.b) : this.d.k();
    }

    @Override // defpackage.dugs
    public final ListenableFuture l(final dtrw dtrwVar, final dtqy dtqyVar) {
        int iOrdinal = this.f.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.l(dtrwVar, dtqyVar) : eika.k(n(this.d.l(dtrwVar, dtqyVar)), new eooz() { // from class: duhl
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duhv duhvVar = this.a;
                final dutw dutwVar = (dutw) obj;
                return eika.k(duhvVar.n(duhvVar.a.l(dtrwVar, dtqyVar)), new eooz() { // from class: duha
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return duhvVar.o(dutwVar, (dutw) obj2, 1088);
                    }
                }, duhvVar.b);
            }
        }, this.b) : this.d.l(dtrwVar, dtqyVar);
    }

    @Override // defpackage.dugs
    public final ListenableFuture m(final List list) {
        int iOrdinal = this.f.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? q() : this.e.m(list) : eika.k(n(this.d.m(list)), new eooz() { // from class: dugy
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duhv duhvVar = this.a;
                final dutw dutwVar = (dutw) obj;
                return eika.k(duhvVar.n(duhvVar.a.m(list)), new eooz() { // from class: duhc
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return duhvVar.o(dutwVar, (dutw) obj2, 1097);
                    }
                }, duhvVar.b);
            }
        }, this.b) : this.d.m(list);
    }

    public final ListenableFuture n(ListenableFuture listenableFuture) {
        ejvr ejvrVar = new ejvr() { // from class: duhg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return new dutw(true, obj, null);
            }
        };
        Executor executor = this.b;
        return eika.e(eika.j(listenableFuture, ejvrVar, executor), Exception.class, new ejvr() { // from class: duhh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return new dutw(false, null, (Exception) obj);
            }
        }, executor);
    }

    public final ListenableFuture o(dutw dutwVar, dutw dutwVar2, int i) {
        int iN = this.j.n();
        if (durt.a(iN)) {
            if (dutwVar.equals(dutwVar2)) {
                this.c.k(1107, iN);
            } else {
                this.c.k(i, iN);
            }
        }
        return dutwVar.a ? eork.i(dutwVar.a()) : eork.h((Throwable) dutwVar.b());
    }

    public final ListenableFuture p(dutw dutwVar, dutw dutwVar2, Comparator comparator, int i) {
        int iN = this.j.n();
        if (durt.a(iN)) {
            if (dutw.e(dutwVar, dutwVar2, comparator)) {
                this.c.k(1106, iN);
            } else {
                this.c.k(i, iN);
            }
        }
        if (dutwVar.a) {
            List list = (List) dutwVar.a();
            list.getClass();
            return eork.i(list);
        }
        Object objB = dutwVar.b();
        objB.getClass();
        return eork.h((Throwable) objB);
    }
}
