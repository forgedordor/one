package defpackage;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duis implements duoc {
    public final durk a;
    public final duoi b;
    public final dump c;
    public final Executor d;
    public final dtpi e;
    private final dump f;
    private final Uri g;
    private final Uri h;
    private final dult i;
    private final ecev j;

    public duis(durk durkVar, duoi duoiVar, dump dumpVar, dump dumpVar2, Uri uri, Uri uri2, dult dultVar, ecev ecevVar, Executor executor, dtpi dtpiVar) {
        this.a = durkVar;
        this.b = duoiVar;
        this.c = dumpVar;
        this.f = dumpVar2;
        this.g = uri;
        this.h = uri2;
        this.i = dultVar;
        this.j = ecevVar;
        this.d = executor;
        this.e = dtpiVar;
    }

    private static ListenableFuture j() {
        return eork.h(new IllegalStateException("Migration flag had unexpected state"));
    }

    private final void k(Uri uri) throws ecgh {
        ecev ecevVar = this.j;
        if (ecevVar.h(uri)) {
            ecevVar.f(uri);
        }
    }

    @Override // defpackage.duoc
    public final ListenableFuture a() {
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? j() : this.f.a() : eika.k(b(this.b.a()), new eooz() { // from class: duib
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duis duisVar = this.a;
                final dutw dutwVar = (dutw) obj;
                return eika.k(duisVar.b(duisVar.c.a()), new eooz() { // from class: duii
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return duisVar.i(dutwVar, (dutw) obj2, 1104);
                    }
                }, duisVar.d);
            }
        }, this.d) : this.b.a();
    }

    public final ListenableFuture b(ListenableFuture listenableFuture) {
        ejvr ejvrVar = new ejvr() { // from class: duio
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return new dutw(true, obj, null);
            }
        };
        Executor executor = this.d;
        return eika.e(eika.j(listenableFuture, ejvrVar, executor), Exception.class, new ejvr() { // from class: duip
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return new dutw(false, null, (Exception) obj);
            }
        }, executor);
    }

    @Override // defpackage.duoc
    public final ListenableFuture c() {
        final Comparator comparator = new Comparator() { // from class: duim
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return duuj.e((dtsd) obj).compareTo(duuj.e((dtsd) obj2));
            }
        };
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? j() : this.f.c() : eika.k(b(this.b.c()), new eooz() { // from class: duin
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duis duisVar = this.a;
                final dutw dutwVar = (dutw) obj;
                ListenableFuture listenableFutureB = duisVar.b(duisVar.c.c());
                final Comparator comparator2 = comparator;
                return eika.k(listenableFutureB, new eooz() { // from class: duih
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        dutw dutwVar2 = (dutw) obj2;
                        duis duisVar2 = duisVar;
                        int iN = duisVar2.e.n();
                        dutw dutwVar3 = dutwVar;
                        if (durt.a(iN)) {
                            if (dutw.e(dutwVar3, dutwVar2, comparator2)) {
                                duisVar2.a.k(1106, iN);
                            } else {
                                duisVar2.a.k(1103, iN);
                            }
                        }
                        if (dutwVar3.a) {
                            List list = (List) dutwVar3.a();
                            list.getClass();
                            return eork.i(list);
                        }
                        Object objB = dutwVar3.b();
                        objB.getClass();
                        return eork.h((Throwable) objB);
                    }
                }, duisVar.d);
            }
        }, this.d) : this.b.c();
    }

    @Override // defpackage.duoc
    public final ListenableFuture d() {
        int iOrdinal = this.i.a().ordinal();
        try {
            if (iOrdinal == 1) {
                try {
                    k(this.g);
                    return this.b.d();
                } finally {
                    k(this.h);
                }
            }
            if (iOrdinal == 2) {
                try {
                    return eika.k(this.b.d(), new eooz() { // from class: duhx
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            final duis duisVar = this.a;
                            final Boolean bool = (Boolean) obj;
                            return eika.k(duisVar.b.c(), new eooz() { // from class: duid
                                @Override // defpackage.eooz
                                public final ListenableFuture a(Object obj2) {
                                    final List list = (List) obj2;
                                    final ArrayList arrayList = new ArrayList();
                                    Iterator it = list.iterator();
                                    while (true) {
                                        final duis duisVar2 = duisVar;
                                        if (!it.hasNext()) {
                                            final Boolean bool2 = bool;
                                            return dvat.a(arrayList).b(new eooy() { // from class: duiq
                                                @Override // defpackage.eooy
                                                public final ListenableFuture a() {
                                                    ListenableFuture listenableFutureI = eork.i(true);
                                                    int i = 0;
                                                    while (true) {
                                                        List list2 = list;
                                                        final duis duisVar3 = duisVar2;
                                                        if (i >= list2.size()) {
                                                            final Boolean bool3 = bool2;
                                                            return eika.j(listenableFutureI, new ejvr() { // from class: duif
                                                                @Override // defpackage.ejvr
                                                                public final Object apply(Object obj3) {
                                                                    boolean z = false;
                                                                    if (((Boolean) obj3).booleanValue() && bool3.booleanValue()) {
                                                                        z = true;
                                                                    }
                                                                    return Boolean.valueOf(z);
                                                                }
                                                            }, duisVar3.d);
                                                        }
                                                        List list3 = arrayList;
                                                        final dtsd dtsdVar = (dtsd) list2.get(i);
                                                        final dtsh dtshVar = (dtsh) eork.q((Future) list3.get(i));
                                                        listenableFutureI = eika.k(listenableFutureI, new eooz() { // from class: duie
                                                            @Override // defpackage.eooz
                                                            public final ListenableFuture a(Object obj3) {
                                                                duis duisVar4 = duisVar3;
                                                                final Boolean bool4 = (Boolean) obj3;
                                                                return eika.j(duisVar4.c.h(dtsdVar, dtshVar), new ejvr() { // from class: duhy
                                                                    @Override // defpackage.ejvr
                                                                    public final Object apply(Object obj4) {
                                                                        boolean z = false;
                                                                        if (((Boolean) obj4).booleanValue() && bool4.booleanValue()) {
                                                                            z = true;
                                                                        }
                                                                        return Boolean.valueOf(z);
                                                                    }
                                                                }, duisVar4.d);
                                                            }
                                                        }, duisVar3.d);
                                                        i++;
                                                    }
                                                }
                                            }, duisVar2.d);
                                        }
                                        arrayList.add(duisVar2.b.e((dtsd) it.next()));
                                    }
                                }
                            }, duisVar.d);
                        }
                    }, this.d);
                } catch (IOException e) {
                    return eork.h(e);
                }
            }
            if (iOrdinal != 3) {
                return j();
            }
            try {
                k(this.g);
                return this.f.d();
            } catch (IOException e2) {
                return eork.h(e2);
            }
        } catch (IOException e3) {
            return eork.h(e3);
        }
    }

    @Override // defpackage.duoc
    public final ListenableFuture e(final dtsd dtsdVar) {
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? j() : this.f.e(dtsdVar) : eika.k(b(this.b.e(dtsdVar)), new eooz() { // from class: duic
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duis duisVar = this.a;
                final dutw dutwVar = (dutw) obj;
                return eika.k(duisVar.b(duisVar.c.e(dtsdVar)), new eooz() { // from class: duil
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return duisVar.i(dutwVar, (dutw) obj2, 1100);
                    }
                }, duisVar.d);
            }
        }, this.d) : this.b.e(dtsdVar);
    }

    @Override // defpackage.duoc
    public final ListenableFuture f(final ekhx ekhxVar) {
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? j() : this.f.f(ekhxVar) : eika.k(b(this.b.f(ekhxVar)), new eooz() { // from class: duig
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duis duisVar = this.a;
                final dutw dutwVar = (dutw) obj;
                return eika.k(duisVar.b(duisVar.c.f(ekhxVar)), new eooz() { // from class: duir
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return duisVar.i(dutwVar, (dutw) obj2, 1100);
                    }
                }, duisVar.d);
            }
        }, this.d) : this.b.f(ekhxVar);
    }

    @Override // defpackage.duoc
    public final ListenableFuture g(final dtsd dtsdVar) {
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? j() : this.f.g(dtsdVar) : eika.k(b(this.b.g(dtsdVar)), new eooz() { // from class: duij
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duis duisVar = this.a;
                final dutw dutwVar = (dutw) obj;
                return eika.k(duisVar.b(duisVar.c.g(dtsdVar)), new eooz() { // from class: duia
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return duisVar.i(dutwVar, (dutw) obj2, 1102);
                    }
                }, duisVar.d);
            }
        }, this.d) : this.b.g(dtsdVar);
    }

    @Override // defpackage.duoc
    public final ListenableFuture h(final dtsd dtsdVar, final dtsh dtshVar) {
        int iOrdinal = this.i.a().ordinal();
        return iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? j() : this.f.h(dtsdVar, dtshVar) : eika.k(b(this.b.h(dtsdVar, dtshVar)), new eooz() { // from class: duik
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final duis duisVar = this.a;
                final dutw dutwVar = (dutw) obj;
                return eika.k(duisVar.b(duisVar.c.h(dtsdVar, dtshVar)), new eooz() { // from class: duhz
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return duisVar.i(dutwVar, (dutw) obj2, 1101);
                    }
                }, duisVar.d);
            }
        }, this.d) : this.b.h(dtsdVar, dtshVar);
    }

    public final ListenableFuture i(dutw dutwVar, dutw dutwVar2, int i) {
        int iN = this.e.n();
        if (durt.a(iN)) {
            if (dutwVar.equals(dutwVar2)) {
                this.a.k(1106, iN);
            } else {
                this.a.k(i, iN);
            }
        }
        return dutwVar.a ? eork.i(dutwVar.a()) : eork.h((Throwable) dutwVar.b());
    }
}
