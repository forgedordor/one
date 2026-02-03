package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvkr {
    public static final cqce a = cqce.g("BugleNetwork", "DittoDesktops");
    public static final cczv b;
    public static final cczv c;
    public static final cczv d;
    public final cogw e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    private final eosc i;
    private final crqv j;
    private final egej k;
    private final fcsu l;

    static {
        cdag.j(cdag.b, "max_persistent_active_dittos", 2);
        b = cdag.j(cdag.b, "max_pwa_pairing_count", 1);
        c = cdag.j(cdag.b, "max_satellite_pairing_count", 2);
        d = cdag.j(cdag.b, "max_non_persistent_active_dittos", 1);
    }

    public bvkr(cogw cogwVar, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, crqv crqvVar, egej egejVar, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.e = cogwVar;
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.i = eoscVar;
        this.j = crqvVar;
        this.k = egejVar;
        this.l = fcsuVar3;
        this.h = fcsuVar4;
    }

    public static final eiju D(List list, Function function) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bvix bvixVar = (bvix) it.next();
            String strE = bvixVar.e();
            if (TextUtils.isEmpty(strE)) {
                a.m("Skip running the task on the desktop due to empty request Id.");
            } else {
                bviw bviwVarG = bvix.g();
                bviwVarG.b(bvixVar.d());
                bviu bviuVar = (bviu) bviwVarG;
                bviuVar.a = strE;
                bviwVarG.c(bvixVar.b());
                bviwVarG.d(bvixVar.f());
                bviuVar.b = bvixVar.c();
                arrayList.add((eiju) function.apply(bviwVarG.a()));
            }
        }
        return eijx.a(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
    
        if (r2.f != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bvdm e(defpackage.epnq r2) {
        /*
            int r0 = r2.g
            int r0 = defpackage.epnn.a(r0)
            r1 = 1
            if (r0 != 0) goto La
            r0 = r1
        La:
            int r0 = r0 + (-2)
            if (r0 == r1) goto L1f
            r1 = 2
            if (r0 == r1) goto L1c
            r1 = 3
            if (r0 == r1) goto L19
            boolean r2 = r2.f
            if (r2 == 0) goto L1f
            goto L1c
        L19:
            bvdm r2 = defpackage.bvdm.PWA
            return r2
        L1c:
            bvdm r2 = defpackage.bvdm.SATELLITE
            return r2
        L1f:
            bvdm r2 = defpackage.bvdm.WEB
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bvkr.e(epnq):bvdm");
    }

    public static boolean r(bowp bowpVar, String str) {
        return cssr.f(bowpVar.r(), str);
    }

    public static boolean w(epnq epnqVar) {
        int iA = epnn.a(epnqVar.g);
        if (iA == 0) {
            iA = 1;
        }
        int i = iA - 2;
        if (i != 1) {
            return i == 2 || i == 3 || epnqVar.f;
        }
        return false;
    }

    public final boolean A(final ezol ezolVar) {
        eieu eieuVarK = eiiy.k("DittoDesktops#setDesktopInactive");
        try {
            String[] strArr = bpab.a;
            bozy bozyVar = new bozy();
            bozyVar.ap("setDesktopInactive1");
            bozyVar.f(new Function() { // from class: bvjj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bpaa bpaaVar = (bpaa) obj;
                    cqce cqceVar = bvkr.a;
                    bpaaVar.b(ezolVar.c);
                    return bpaaVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bozyVar.c(false);
            bozyVar.e("");
            boolean z = bozyVar.b().e() > 0;
            eieuVarK.close();
            return z;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean B(final ezol ezolVar, final String str) {
        eieu eieuVarK = eiiy.k("DittoDesktops#setDesktopInactive");
        try {
            String[] strArr = bpab.a;
            bozy bozyVar = new bozy();
            bozyVar.ap("setDesktopInactive2");
            bozyVar.f(new Function() { // from class: bvji
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bpaa bpaaVar = (bpaa) obj;
                    cqce cqceVar = bvkr.a;
                    bpaaVar.b(ezolVar.c);
                    int iIntValue = bpab.c().intValue();
                    if (iIntValue < 58010) {
                        dqru.x("request_id", iIntValue);
                    }
                    bpaaVar.ap(new dqpj("desktop.request_id", 1, String.valueOf(str)));
                    return bpaaVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bozyVar.c(false);
            bozyVar.e("");
            boolean z = bozyVar.b().e() > 0;
            eieuVarK.close();
            return z;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean C(final ezol ezolVar) {
        eieu eieuVarK = eiiy.k("DittoDesktops#updateStoredDesktopIdsLastConnectionTime");
        try {
            String[] strArr = bpab.a;
            bozy bozyVar = new bozy();
            bozyVar.al();
            bozyVar.ap("updateStoredDesktopIdsLastConnectionTime");
            bozyVar.f(new Function() { // from class: bvkb
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bpaa bpaaVar = (bpaa) obj;
                    cqce cqceVar = bvkr.a;
                    bpaaVar.b(ezolVar.c);
                    return bpaaVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bozyVar.a.put("last_connection_time", Long.valueOf(this.e.f().toEpochMilli()));
            bozyVar.d(-1L);
            int iE = bozyVar.b().e();
            ((bxlc) this.f.b()).g();
            boolean z = iE > 0;
            eieuVarK.close();
            return z;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final int a() {
        return o().size();
    }

    public final int b(boolean z) {
        eieu eieuVarK = eiiy.k("DittoDesktops#setIsActiveForQrDesktopsWithRequestId");
        try {
            String[] strArr = bpab.a;
            bozy bozyVar = new bozy();
            bozyVar.ap("setIsActiveForQrDesktopsWithRequestId");
            bozyVar.f(new Function() { // from class: bvkl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bpaa bpaaVar = (bpaa) obj;
                    cqce cqceVar = bvkr.a;
                    bpaaVar.d(bvdu.ANONYMOUS);
                    bpaaVar.e();
                    bpaaVar.f();
                    return bpaaVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bozyVar.c(z);
            int iE = bozyVar.b().e();
            eieuVarK.close();
            return iE;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final long c(final ezol ezolVar) {
        bozw bozwVarA = bpab.a();
        bozwVarA.A("getStoredStoredGetUpdatesRequestTime");
        bozwVarA.f(new Function() { // from class: bvkq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpaa bpaaVar = (bpaa) obj;
                cqce cqceVar = bvkr.a;
                bpaaVar.b(ezolVar.c);
                return bpaaVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bozwVarA.e(new Function() { // from class: bvja
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cqce cqceVar = bvkr.a;
                return ((boyn) obj).w;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bozwVarA.y(1);
        boyp boypVar = (boyp) bozwVarA.b().p();
        try {
            long jC = boypVar.moveToFirst() ? boypVar.c() : -1L;
            boypVar.close();
            return jC;
        } catch (Throwable th) {
            try {
                boypVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final bajj d(final ezol ezolVar) {
        bajj bajjVar;
        eieu eieuVarK = eiiy.k("DittoDesktops#getDesktopEncryptionKeys");
        try {
            bozw bozwVarA = bpab.a();
            bozwVarA.A("getDesktopEncryptionKeys");
            bozwVarA.f(new Function() { // from class: bvkp
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bpaa bpaaVar = (bpaa) obj;
                    cqce cqceVar = bvkr.a;
                    bpaaVar.b(ezolVar.c);
                    return bpaaVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            boyp boypVar = (boyp) bozwVarA.b().p();
            try {
                if (boypVar.moveToFirst()) {
                    bajjVar = new bajj(boypVar.m(), boypVar.n());
                    boypVar.close();
                } else {
                    boypVar.close();
                    bajjVar = null;
                }
                eieuVarK.close();
                return bajjVar;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final bvix f(final String str) {
        bvix bvixVarA;
        eieu eieuVarK = eiiy.k("DittoDesktops#getDesktop");
        try {
            bozw bozwVarA = bpab.a();
            bozwVarA.A("getDesktop");
            bozwVarA.f(new Function() { // from class: bvjg
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bpaa bpaaVar = (bpaa) obj;
                    cqce cqceVar = bvkr.a;
                    bpaaVar.b(str);
                    return bpaaVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            boyp boypVar = (boyp) bozwVarA.b().p();
            try {
                if (boypVar.moveToFirst()) {
                    bvks bvksVarG = g(boypVar.i(), boypVar.j(), m((bowp) boypVar.cQ()));
                    bviw bviwVarG = bvix.g();
                    bviwVarG.b(bvksVarG.a);
                    bviwVarG.e(boypVar.e());
                    bviwVarG.c(boypVar.g());
                    bviwVarG.d(boypVar.l());
                    ((bviu) bviwVarG).b = bvksVarG;
                    String strK = boypVar.k();
                    if (strK != null) {
                        ((bviu) bviwVarG).a = strK;
                    }
                    bvixVarA = bviwVarG.a();
                    boypVar.close();
                } else {
                    a.m("getDesktop returning null because it did not find a matching id.");
                    boypVar.close();
                    bvixVarA = null;
                }
                eieuVarK.close();
                return bvixVarA;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final bvks g(String str, String str2, Optional optional) {
        if (str2 == null) {
            return new bvks(bvfe.b(str, bvdu.ANONYMOUS), str, Optional.empty());
        }
        return new bvks(bvfe.b(str2, bvdu.GAIA), str, optional);
    }

    public final eiju h() {
        byte[] bArrR = this.j.r("ditto_active_desktop_id");
        if (bArrR == null) {
            return eijx.e(Optional.empty());
        }
        try {
            ezol ezolVar = (ezol) evsn.parseFrom(ezol.a, bArrR, evrr.a());
            if (!x(ezolVar)) {
                return eijx.e(Optional.empty());
            }
            if (!((cdio) this.l.b()).a()) {
                return eijx.e(Optional.empty());
            }
            String strN = n(ezolVar.c);
            return ejwk.c(strN) ? eijx.e(Optional.empty()) : eiju.g(this.k.c(strN)).h(new ejvr() { // from class: bvjr
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return Optional.of((efwo) obj);
                }
            }, eoqg.a);
        } catch (evtj e) {
            return eijx.d(e);
        }
    }

    public final eiju i(final String str) {
        return eijx.g(new Callable() { // from class: bvjc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqce cqceVar = bvkr.a;
                ecem.b();
                bozw bozwVarA = bpab.a();
                bozwVarA.A("DittoDesktops#getGaiaDesktops");
                bozwVarA.f(new Function() { // from class: bvjp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bpaa bpaaVar = (bpaa) obj;
                        cqce cqceVar2 = bvkr.a;
                        bpaaVar.d(bvdu.GAIA);
                        return bpaaVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bozwVarA.d(new bozt(bpab.c.c));
                Stream stream = Collection.EL.stream(bozwVarA.b().z());
                final String str2 = str;
                Stream streamFilter = stream.filter(new Predicate() { // from class: bvjq
                    public final /* synthetic */ Predicate and(Predicate predicate) {
                        return Predicate$CC.$default$and(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    /* renamed from: negate */
                    public final /* synthetic */ Predicate mo538negate() {
                        return Predicate$CC.$default$negate(this);
                    }

                    public final /* synthetic */ Predicate or(Predicate predicate) {
                        return Predicate$CC.$default$or(this, predicate);
                    }

                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return bvkr.r((bowp) obj, str2);
                    }
                });
                int i = ekgb.d;
                return (ekgb) streamFilter.collect(ekcv.a);
            }
        }, this.i);
    }

    public final eiju j(final Function function) {
        Callable callable = new Callable() { // from class: bvjl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.l();
            }
        };
        eosc eoscVar = this.i;
        return eijx.g(callable, eoscVar).i(new eooz() { // from class: bvjm
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return bvkr.D((List) obj, function);
            }
        }, eoscVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ekgb k(ekgb ekgbVar) {
        ezol ezolVarA;
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        int size = ekgbVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            bowp bowpVar = (bowp) ekgbVar.get(i2);
            if (((cdio) this.l.b()).a()) {
                String strR = bowpVar.r();
                if (!bowpVar.p().equals(bvdu.GAIA) || ejwk.c(strR)) {
                    ezolVarA = bvfe.b(bowpVar.q(), bowpVar.p());
                } else {
                    ezolVarA = bvfe.b(strR, bowpVar.p());
                }
            } else {
                ezolVarA = bvfe.a(bowpVar.q());
            }
            bviw bviwVarG = bvix.g();
            bviwVarG.b(ezolVarA);
            bowpVar.aA(15, "request_id");
            bviu bviuVar = (bviu) bviwVarG;
            bviuVar.a = ejwk.b(bowpVar.p);
            bviwVarG.e(bowpVar.n());
            bviwVarG.c(bowpVar.o());
            bowpVar.aA(16, "is_persistent");
            bviwVarG.d(bowpVar.q);
            bviuVar.b = new bvks(ezolVarA, bowpVar.q(), m(bowpVar));
            ekfwVar.h(bviwVarG.a());
        }
        return ekfwVar.g();
    }

    public final ekgb l() {
        eieu eieuVarK = eiiy.k("DittoDesktops#getActiveDesktops");
        try {
            bozw bozwVarA = bpab.a();
            bozwVarA.A("getActiveDesktops");
            bozwVarA.f(new Function() { // from class: bvjn
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bpaa bpaaVar = (bpaa) obj;
                    cqce cqceVar = bvkr.a;
                    bpaaVar.c();
                    return bpaaVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bozwVarA.f(new Function() { // from class: bvjo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bpaa bpaaVar = (bpaa) obj;
                    cqce cqceVar = bvkr.a;
                    bpaaVar.e();
                    bpaaVar.f();
                    return bpaaVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            ekgb ekgbVarK = k(bozwVarA.b().z());
            eieuVarK.close();
            return ekgbVarK;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Optional m(bowp bowpVar) {
        return (!((cdio) this.l.b()).a() || bowpVar.u() == null) ? Optional.empty() : Optional.of(evqs.x(bowpVar.u()));
    }

    public final String n(final String str) {
        bozw bozwVarA = bpab.a();
        bozwVarA.A("getEmailForPairedDevice");
        bozwVarA.f(new Function() { // from class: bvkd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpaa bpaaVar = (bpaa) obj;
                cqce cqceVar = bvkr.a;
                bpaaVar.b(str);
                return bpaaVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bozwVarA.e(new Function() { // from class: bvke
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cqce cqceVar = bvkr.a;
                return ((boyn) obj).u;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bozwVarA.y(1);
        boyp boypVar = (boyp) bozwVarA.b().p();
        try {
            if (boypVar.moveToFirst()) {
                String strJ = boypVar.j();
                if (strJ != null) {
                    boypVar.close();
                    return strJ;
                }
            }
            boypVar.close();
            return "";
        } catch (Throwable th) {
            try {
                boypVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final List o() {
        eieu eieuVarK = eiiy.k("DittoDesktops#getStoredDesktopIds");
        try {
            bozw bozwVarA = bpab.a();
            bozwVarA.A("getStoredDesktopIds");
            bozwVarA.e(new Function() { // from class: bvkm
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    cqce cqceVar = bvkr.a;
                    return ((boyn) obj).b;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            boyp boypVar = (boyp) bozwVarA.b().q(bpab.c.b);
            try {
                ekgb ekgbVarH = boypVar.h();
                boypVar.close();
                List list = (List) Collection.EL.stream(ekgbVarH).map(new Function() { // from class: bvkn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return bvfe.a((String) obj);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toCollection(new Supplier() { // from class: bvko
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new ArrayList();
                    }
                }));
                eieuVarK.close();
                return list;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean p(final Optional optional) {
        ecem.b();
        String[] strArr = bpab.a;
        bpaa bpaaVar = new bpaa();
        bpaaVar.d(bvdu.GAIA);
        if (optional.isEmpty()) {
            bozw bozwVarA = bpab.a();
            bozwVarA.A("areAnyDesktopPairedOverGaia");
            bozwVarA.k(new bozz(bpaaVar));
            return bozwVarA.b().U();
        }
        bozw bozwVarA2 = bpab.a();
        bozwVarA2.A("DittoDesktops#areAnyDesktopPairedOverGaia");
        bozwVarA2.k(new bozz(bpaaVar));
        return Collection.EL.stream(bozwVarA2.b().z()).filter(new Predicate() { // from class: bvjd
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                cqce cqceVar = bvkr.a;
                return bvkr.r((bowp) obj, (String) optional.get());
            }
        }).findFirst().isPresent();
    }

    public final boolean q() {
        ecem.b();
        bozw bozwVarA = bpab.a();
        bozwVarA.A("areAnyDesktopPairedOverQr");
        bozwVarA.f(new Function() { // from class: bvkg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpaa bpaaVar = (bpaa) obj;
                cqce cqceVar = bvkr.a;
                bpaaVar.d(bvdu.ANONYMOUS);
                return bpaaVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bozwVarA.b().U();
    }

    public final boolean s(final bvks bvksVar) {
        boolean z;
        eieu eieuVarK = eiiy.k("DittoDesktops#deleteScannedDesktopWithDittoIdContainer");
        try {
            String[] strArr = bpab.a;
            bozp bozpVar = new bozp();
            bozpVar.f("deleteScannedDesktopWithDittoIdContainer");
            bozpVar.c(new Function() { // from class: bvje
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bpaa bpaaVar = (bpaa) obj;
                    cqce cqceVar = bvkr.a;
                    bpaaVar.b(bvksVar.b);
                    return bpaaVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int iD = bozpVar.d();
            cqbd cqbdVarC = a.c();
            cqbdVarC.y("NumOfDesktopsDeleted", iD);
            cqbdVarC.I("Desktops have been cleaned up");
            cqbdVarC.r();
            if (iD > 0) {
                fcsu fcsuVar = this.f;
                ((bxlc) fcsuVar.b()).f(bvksVar.d);
                ((bxlc) fcsuVar.b()).g();
                z = true;
            } else {
                z = false;
            }
            eieuVarK.close();
            return z;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    public final boolean t(final ezol ezolVar) {
        boolean z;
        eieu eieuVarK = eiiy.k("DittoDesktops#deleteScannedDesktop");
        try {
            String[] strArr = bpab.a;
            bozp bozpVar = new bozp();
            bozpVar.f("deleteScannedDesktop");
            bozpVar.c(new Function() { // from class: bvkh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bpaa bpaaVar = (bpaa) obj;
                    cqce cqceVar = bvkr.a;
                    bpaaVar.b(ezolVar.c);
                    return bpaaVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            int iD = bozpVar.d();
            cqbd cqbdVarC = a.c();
            cqbdVarC.y("NumOfDesktopsDeleted", iD);
            cqbdVarC.I("Desktops have been cleaned up");
            cqbdVarC.r();
            if (iD > 0) {
                ((bxlc) this.f.b()).f(ezolVar);
                z = true;
            } else {
                z = false;
            }
            eieuVarK.close();
            return z;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean u() {
        return !l().isEmpty();
    }

    public final boolean v(final ezol ezolVar) {
        bozw bozwVarA = bpab.a();
        bozwVarA.A("isActiveDesktop");
        bozwVarA.f(new Function() { // from class: bvkf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpaa bpaaVar = (bpaa) obj;
                cqce cqceVar = bvkr.a;
                bpaaVar.b(ezolVar.c);
                bpaaVar.c();
                return bpaaVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bozwVarA.b().U();
    }

    public final boolean x(final ezol ezolVar) {
        bozw bozwVarA = bpab.a();
        bozwVarA.A("isDesktopPairedOverGaia");
        bozwVarA.f(new Function() { // from class: bvju
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpaa bpaaVar = (bpaa) obj;
                cqce cqceVar = bvkr.a;
                bpaaVar.b(ezolVar.c);
                bpaaVar.d(bvdu.GAIA);
                return bpaaVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bozwVarA.b().U();
    }

    public final boolean y(ezol ezolVar) {
        if (ezolVar == null) {
            return false;
        }
        Iterator it = o().iterator();
        while (it.hasNext()) {
            if (((ezol) it.next()).c.equals(ezolVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final boolean z(final ezol ezolVar, String str) {
        eieu eieuVarK = eiiy.k("DittoDesktops#setDesktopActive");
        try {
            String[] strArr = bpab.a;
            bozy bozyVar = new bozy();
            bozyVar.al();
            bozyVar.ap("setDesktopActive");
            bozyVar.f(new Function() { // from class: bvkk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    bpaa bpaaVar = (bpaa) obj;
                    cqce cqceVar = bvkr.a;
                    bpaaVar.b(ezolVar.c);
                    return bpaaVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            bozyVar.c(true);
            bozyVar.e(str);
            boolean z = bozyVar.b().e() > 0;
            eieuVarK.close();
            return z;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
