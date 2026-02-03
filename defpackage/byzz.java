package defpackage;

import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byzz {
    public static final cczi a = cdag.e(cdag.b, "batch_restore_max_retry", 2);
    static final ejxr b = cdag.w(192093368, "terminate_restore_when_cms_not_enabled");
    public static final cqce c = cqce.g("BugleCms", "CmsWorker");
    public final aurx d;
    public final cpup e;
    public final byym f;
    public final eosc g;
    public final eosc h;
    public final aukz i;
    public final fcsu j;
    public final autx k;
    public final fcsu l;
    public int m = 0;
    public final byeq n;

    public byzz(fcsu fcsuVar, fcsu fcsuVar2, aurx aurxVar, aukz aukzVar, cpup cpupVar, byym byymVar, autx autxVar, byeq byeqVar, eosc eoscVar, eosc eoscVar2) {
        this.j = fcsuVar;
        this.l = fcsuVar2;
        this.d = aurxVar;
        this.e = cpupVar;
        this.f = byymVar;
        this.n = byeqVar;
        this.k = autxVar;
        this.g = eoscVar;
        this.h = eoscVar2;
        this.i = aukzVar;
    }

    public final eiju a(final pzs pzsVar, final String str, final bzaa bzaaVar, final boolean z) {
        eiju eijuVarI = ((Boolean) ((cczi) b.get()).e()).booleanValue() ? this.d.m.b().i(new eooz() { // from class: byzj
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cczi ccziVar = byzz.a;
                return !((Boolean) obj).booleanValue() ? eijx.d(new byzy()) : eijx.e(null);
            }
        }, eoqg.a) : eijx.e(null);
        eooz eoozVar = new eooz() { // from class: byzk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cczi ccziVar = byzz.a;
                return bzaaVar.d(str);
            }
        };
        eosc eoscVar = this.g;
        return eijuVarI.i(eoozVar, eoscVar).i(new eooz() { // from class: byzl
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final cpvs cpvsVar = (cpvs) obj;
                ekgb ekgbVar = cpvsVar.a;
                final boolean zC = ejwk.c(str);
                final int size = ekgbVar.size();
                final byzz byzzVar = this.a;
                final bzaa bzaaVar2 = bzaaVar;
                aurx aurxVar = byzzVar.d;
                eiju eijuVarJ = aurxVar.j();
                eooz eoozVar2 = new eooz() { // from class: byyu
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        String strH = bzaaVar2.h();
                        String strD = cakn.d(strH);
                        byzz byzzVar2 = byzzVar;
                        fcsu fcsuVar = byzzVar2.j;
                        ((ains) fcsuVar.b()).e(strD, size);
                        ((ains) fcsuVar.b()).e(cakn.b(strH), ((Integer) obj2).intValue());
                        return byzzVar2.d.j();
                    }
                };
                eoqg eoqgVar = eoqg.a;
                eijuVarJ.i(eoozVar2, eoqgVar);
                boolean zC2 = bzaaVar2.c().c();
                final boolean z2 = z;
                return !zC2 ? byzzVar.b(cpvsVar, bzaaVar2, z2) : aurxVar.j().i(new eooz() { // from class: byyv
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        Integer num = (Integer) obj2;
                        int iIntValue = num.intValue();
                        int iIntValue2 = ((Integer) byzz.a.e()).intValue();
                        final byzz byzzVar2 = byzzVar;
                        final cpvs cpvsVar2 = cpvsVar;
                        final bzaa bzaaVar3 = bzaaVar2;
                        final boolean z3 = z2;
                        if (iIntValue > iIntValue2) {
                            cqbd cqbdVarE = byzz.c.e();
                            cqbdVarE.I("Max try limit of batch restore exceeded! Falling back to one-by-one restore!");
                            cqbdVarE.A("retried count", num);
                            cqbdVarE.r();
                            return byzzVar2.b(cpvsVar2, bzaaVar3, z3);
                        }
                        final boolean z4 = zC;
                        final long jA = ((cogw) byzzVar2.l.b()).a();
                        eiju eijuVarH = eijx.h(new eooy() { // from class: byyq
                            @Override // defpackage.eooy
                            public final ListenableFuture a() {
                                final bykl byklVarC = bzaaVar3.c();
                                byklVarC.getClass();
                                Optional optionalEmpty = Optional.empty();
                                if (!byklVarC.c()) {
                                    throw new UnsupportedOperationException("Batch restore is not supported yet.");
                                }
                                cpvs cpvsVar3 = cpvsVar2;
                                return byklVarC.a((ekgb) Collection.EL.stream(cpvsVar3.a).filter(new Predicate() { // from class: bykm
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
                                    public final boolean test(Object obj3) {
                                        return byklVarC.b(obj3);
                                    }
                                }).collect(ekcv.a), optionalEmpty, z4);
                            }
                        }, byzzVar2.g);
                        eooz eoozVar3 = new eooz() { // from class: byzb
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj3) throws Exception {
                                Exception exc = (Exception) obj3;
                                if (!(exc instanceof cpyv) || !((cpyv) exc).b.equals(cpyz.NO_RETRY)) {
                                    cqbd cqbdVarE2 = byzz.c.e();
                                    cqbdVarE2.I("Retriable failure found during batch message restore! Retrying now!");
                                    cqbdVarE2.s(exc);
                                    throw exc;
                                }
                                boolean z5 = z3;
                                bzaa bzaaVar4 = bzaaVar3;
                                cpvs cpvsVar3 = cpvsVar2;
                                byzz byzzVar3 = byzzVar2;
                                cqbd cqbdVarE3 = byzz.c.e();
                                cqbdVarE3.I("Unretriable failure found during batch message restore! It will not retry! Falling back to one-by-one restore!");
                                cqbdVarE3.s(exc);
                                return byzzVar3.b(cpvsVar3, bzaaVar4, z5).h(new ejvr() { // from class: byzd
                                    @Override // defpackage.ejvr
                                    public final Object apply(Object obj4) {
                                        cczi ccziVar = byzz.a;
                                        return ekoj.a;
                                    }
                                }, eoqg.a);
                            }
                        };
                        eoqg eoqgVar2 = eoqg.a;
                        return eijuVarH.f(Exception.class, eoozVar3, eoqgVar2).h(new ejvr() { // from class: byzm
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj3) {
                                byzzVar2.c(bzaaVar3.h(), jA);
                                return cpvsVar2.b;
                            }
                        }, eoqgVar2);
                    }
                }, eoqgVar);
            }
        }, eoscVar).i(new eooz() { // from class: byzn
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                byzz byzzVar = this.a;
                byzzVar.m++;
                return byzzVar.d.w((String) obj);
            }
        }, eoqg.a).i(new eooz() { // from class: byzo
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                String str2 = (String) obj;
                boolean zIsEmpty = TextUtils.isEmpty(str2);
                byzz byzzVar = this.a;
                final bzaa bzaaVar2 = bzaaVar;
                final pzs pzsVar2 = pzsVar;
                if (!zIsEmpty) {
                    return byzzVar.a(pzsVar2, str2, bzaaVar2, z);
                }
                byzz.c.p("Doing post execution for ".concat(String.valueOf(bzaaVar2.getClass().getSimpleName())));
                return byzzVar.d.w("POST_RESTORE_PAGE_TOKEN").i(new eooz() { // from class: byzi
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        cczi ccziVar = byzz.a;
                        return bzaaVar2.e(pzsVar2);
                    }
                }, byzzVar.g);
            }
        }, eoscVar).f(cpyy.class, new eooz() { // from class: byzp
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final cpyy cpyyVar = (cpyy) obj;
                int i = cpyyVar.a;
                byzz byzzVar = this.a;
                return byzzVar.e.a(i).i(new eooz() { // from class: byzt
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        cczi ccziVar = byzz.a;
                        return ((Boolean) obj2).booleanValue() ? eijx.e(null) : eijx.d(cpyyVar);
                    }
                }, byzzVar.g);
            }
        }, eoscVar).f(cpmb.class, new eooz() { // from class: byzq
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                this.a.k.g();
                return eijx.d((cpmb) obj);
            }
        }, eoscVar);
    }

    public final eiju b(final cpvs cpvsVar, final bzaa bzaaVar, boolean z) {
        final long jA = ((cogw) this.l.b()).a();
        final ekgp ekgpVar = (ekgp) Collection.EL.stream(cpvsVar.a).collect(ekcv.a(new Function() { // from class: byyx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return bzaaVar.g(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: byyy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(final Object obj) {
                final bzaa bzaaVar2 = bzaaVar;
                return eijx.h(new eooy() { // from class: byzs
                    @Override // defpackage.eooy
                    public final ListenableFuture a() {
                        Object obj2 = obj;
                        obj2.getClass();
                        bykl byklVarC = bzaaVar2.c();
                        return !byklVarC.b(obj2) ? eijx.e(null) : byklVarC.d(obj2);
                    }
                }, this.a.g);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
        final String strH = bzaaVar.h();
        if (!z) {
            return eijx.l(ekgpVar.values()).a(new Callable() { // from class: byzc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    this.a.c(strH, jA);
                    return cpvsVar.b;
                }
            }, this.g);
        }
        eijw eijwVarJ = eijx.j(ekgpVar.values());
        eooy eooyVar = new eooy() { // from class: byyz
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                byzz byzzVar = this.a;
                byzzVar.c(strH, jA);
                bzaa bzaaVar2 = bzaaVar;
                final emec emecVarF = bzaaVar2.f();
                final bmra bmraVarB = bzaaVar2.b();
                final byym byymVar = byzzVar.f;
                eiju eijuVarJ = ((aurx) byymVar.c.b()).j();
                final ekgp ekgpVar2 = ekgpVar;
                return eijuVarJ.i(new eooz() { // from class: byyd
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj) {
                        Integer num = (Integer) obj;
                        ekgi ekgiVar = new ekgi();
                        ekgi ekgiVar2 = new ekgi();
                        for (Map.Entry entry : ekgpVar2.entrySet()) {
                            String str = (String) entry.getKey();
                            eiju eijuVar = (eiju) entry.getValue();
                            try {
                                eork.q(eijuVar);
                            } catch (ExecutionException e) {
                                Throwable cause = e.getCause();
                                cause.getClass();
                                if ((cause instanceof cpyv) && cpyz.NO_RETRY.equals(((cpyv) cause).b)) {
                                    ekgiVar.i(str, cause);
                                } else {
                                    if (Status.c(e).getCode().equals(Status.Code.UNAVAILABLE) || num.intValue() < ((Integer) cpyl.b.e()).intValue()) {
                                        return eijuVar;
                                    }
                                    ekgiVar2.i(str, cause);
                                }
                            }
                        }
                        final ekgp ekgpVarC = ekgiVar.c();
                        final ekgp ekgpVarC2 = ekgiVar2.c();
                        final int iIntValue = num.intValue();
                        if (ekgpVarC.isEmpty() && ekgpVarC2.isEmpty()) {
                            return eijx.e(null);
                        }
                        final bmra bmraVar = bmraVarB;
                        final emec emecVar = emecVarF;
                        final byym byymVar2 = byymVar;
                        Runnable runnable = new Runnable() { // from class: byye
                            @Override // java.lang.Runnable
                            public final void run() {
                                ekfn ekfnVarValues = ((ekgp) ekgpVarC).values();
                                ekfn ekfnVarValues2 = ((ekgp) ekgpVarC2).values();
                                emdw emdwVar = (emdw) emdx.a.createBuilder();
                                emdwVar.copyOnWrite();
                                emdx emdxVar = (emdx) emdwVar.instance;
                                emdxVar.b |= 1;
                                emdxVar.e = iIntValue;
                                Stream map = Collection.EL.stream(ekfnVarValues).map(new Function() { // from class: aukl
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return auls.a((Throwable) obj2);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                int i = ekgb.d;
                                Collector collector = ekcv.a;
                                Iterable iterable = (Iterable) map.collect(collector);
                                emdwVar.copyOnWrite();
                                emdx emdxVar2 = (emdx) emdwVar.instance;
                                evsx evsxVar = emdxVar2.c;
                                if (!evsxVar.c()) {
                                    emdxVar2.c = evsn.mutableCopy(evsxVar);
                                }
                                Iterator it = iterable.iterator();
                                while (it.hasNext()) {
                                    emdxVar2.c.h(((emcn) it.next()).bs);
                                }
                                Iterable iterable2 = (Iterable) Collection.EL.stream(ekfnVarValues2).map(new Function() { // from class: aukl
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        return auls.a((Throwable) obj2);
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).collect(collector);
                                emdwVar.copyOnWrite();
                                emdx emdxVar3 = (emdx) emdwVar.instance;
                                evsx evsxVar2 = emdxVar3.d;
                                if (!evsxVar2.c()) {
                                    emdxVar3.d = evsn.mutableCopy(evsxVar2);
                                }
                                Iterator it2 = iterable2.iterator();
                                while (it2.hasNext()) {
                                    emdxVar3.d.h(((emcn) it2.next()).bs);
                                }
                                byym byymVar3 = byymVar2;
                                emec emecVar2 = emecVar;
                                emdx emdxVar4 = (emdx) emdwVar.build();
                                emcw emcwVar = (emcw) emcx.a.createBuilder();
                                aukz aukzVar = byymVar3.d;
                                emec emecVarC = aukzVar.c(emecVar2);
                                emcwVar.copyOnWrite();
                                emcx emcxVar = (emcx) emcwVar.instance;
                                emcxVar.c = emecVarC.s;
                                emcxVar.b |= 1;
                                emcwVar.copyOnWrite();
                                emcx emcxVar2 = (emcx) emcwVar.instance;
                                emcxVar2.d = 5;
                                emcxVar2.b |= 2;
                                emcwVar.copyOnWrite();
                                emcx emcxVar3 = (emcx) emcwVar.instance;
                                emdxVar4.getClass();
                                emcxVar3.h = emdxVar4;
                                emcxVar3.b |= 32;
                                emcwVar.a(aukzVar.b());
                                emcwVar.a(aukzVar.b());
                                aukzVar.m((emcx) emcwVar.build());
                            }
                        };
                        eosc eoscVar = byymVar2.g;
                        return eijx.f(runnable, eoscVar).i(new eooz() { // from class: byyf
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                final Map map = ekgpVarC;
                                final bmra bmraVar2 = bmraVar;
                                final Map map2 = ekgpVarC2;
                                return byymVar2.j.b("CmsRestoreFailureMapper#logSkippedFailures", new Runnable() { // from class: byyj
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        bmra bmraVar3;
                                        cqce cqceVar = byym.a;
                                        ArrayList arrayList = new ArrayList();
                                        Iterator<E> it = ((ekgp) map).entrySet().iterator();
                                        while (true) {
                                            bmraVar3 = bmraVar2;
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Map.Entry entry2 = (Map.Entry) it.next();
                                            String str2 = (String) entry2.getKey();
                                            Throwable th = (Throwable) entry2.getValue();
                                            cqbd cqbdVarE = byym.a.e();
                                            cqbdVarE.I("Skipping non-retriable restore failure");
                                            cqbdVarE.A("cmsId", str2);
                                            cqbdVarE.A("cmsDataType", bmraVar3);
                                            cqbdVarE.s(th);
                                            String[] strArr = bmqy.a;
                                            bmoz bmozVar = new bmoz();
                                            bmozVar.k(str2);
                                            bmozVar.j(bmraVar3);
                                            bmozVar.c(bmqz.INITIAL_RESTORE_NON_RETRIABLE);
                                            bmozVar.l(auls.a(th));
                                            arrayList.add(bmozVar.a());
                                        }
                                        Map map3 = map2;
                                        bmqy.f((bmou[]) ekis.s(arrayList, bmou.class));
                                        ArrayList arrayList2 = new ArrayList();
                                        for (Map.Entry entry3 : ((ekgp) map3).entrySet()) {
                                            String str3 = (String) entry3.getKey();
                                            Throwable th2 = (Throwable) entry3.getValue();
                                            cqbd cqbdVarE2 = byym.a.e();
                                            cqbdVarE2.I("Skipping max-retried restore failure");
                                            cqbdVarE2.A("cmsId", str3);
                                            cqbdVarE2.A("cmsDataType", bmraVar3);
                                            cqbdVarE2.s(th2);
                                            bmoz bmozVar2 = new bmoz();
                                            bmozVar2.k(str3);
                                            bmozVar2.j(bmraVar3);
                                            bmozVar2.c(bmqz.INITIAL_RESTORE_MAX_RETRIED);
                                            bmozVar2.l(auls.a(th2));
                                            arrayList2.add(bmozVar2.a());
                                        }
                                        bmqy.f((bmou[]) ekis.s(arrayList2, bmou.class));
                                    }
                                });
                            }
                        }, eoscVar).i(new eooz() { // from class: byyg
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj2) {
                                final ekfn ekfnVarValues = ((ekgp) ekgpVarC).values();
                                final ekfn ekfnVarValues2 = ((ekgp) ekgpVarC2).values();
                                final byym byymVar3 = byymVar2;
                                return byymVar3.h.a() ? ((aurx) byymVar3.c.b()).o().i(new eooz() { // from class: byyk
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj3) {
                                        eiju eijuVarH;
                                        Integer num2 = (Integer) obj3;
                                        final int i = 0;
                                        for (Throwable th : ekfnVarValues) {
                                            if (num2.intValue() + i >= ((Integer) byym.b.e()).intValue()) {
                                                break;
                                            }
                                            cpri.c("CMS restore failure", th);
                                            i++;
                                        }
                                        for (Throwable th2 : ekfnVarValues2) {
                                            if (num2.intValue() + i >= ((Integer) byym.b.e()).intValue()) {
                                                break;
                                            }
                                            cpri.c("CMS restore failure", th2);
                                            i++;
                                        }
                                        final byym byymVar4 = byymVar3;
                                        synchronized (byymVar4.i) {
                                            eijuVarH = ((aurx) byymVar4.c.b()).o().i(new eooz() { // from class: byyl
                                                @Override // defpackage.eooz
                                                public final ListenableFuture a(Object obj4) {
                                                    return ((aurx) byymVar4.c.b()).x(((Integer) obj4).intValue() + i);
                                                }
                                            }, byymVar4.f).h(new ejvr() { // from class: byyc
                                                @Override // defpackage.ejvr
                                                public final Object apply(Object obj4) {
                                                    cqce cqceVar = byym.a;
                                                    return null;
                                                }
                                            }, eoqg.a);
                                        }
                                        return eijuVarH;
                                    }
                                }, byymVar3.f) : ((aurx) byymVar3.c.b()).o().i(new eooz() { // from class: byyb
                                    @Override // defpackage.eooz
                                    public final ListenableFuture a(Object obj3) {
                                        final byym byymVar4;
                                        Integer numValueOf = (Integer) obj3;
                                        ArrayList arrayList = new ArrayList();
                                        Iterator it = ekfnVarValues.iterator();
                                        while (true) {
                                            byymVar4 = byymVar3;
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Throwable th = (Throwable) it.next();
                                            if (numValueOf.intValue() >= ((Integer) byym.b.e()).intValue()) {
                                                break;
                                            }
                                            int iIntValue2 = numValueOf.intValue() + 1;
                                            cden cdenVar = byymVar4.e;
                                            numValueOf = Integer.valueOf(iIntValue2);
                                            arrayList.add(cdenVar.b(th));
                                        }
                                        for (Throwable th2 : ekfnVarValues2) {
                                            if (numValueOf.intValue() >= ((Integer) byym.b.e()).intValue()) {
                                                break;
                                            }
                                            int iIntValue3 = numValueOf.intValue() + 1;
                                            cden cdenVar2 = byymVar4.e;
                                            numValueOf = Integer.valueOf(iIntValue3);
                                            arrayList.add(cdenVar2.b(th2));
                                        }
                                        final int iIntValue4 = numValueOf.intValue();
                                        return eijx.l(arrayList).b(new eooy() { // from class: byyh
                                            @Override // defpackage.eooy
                                            public final ListenableFuture a() {
                                                return ((aurx) byymVar4.c.b()).x(iIntValue4).h(new ejvr() { // from class: byyi
                                                    @Override // defpackage.ejvr
                                                    public final Object apply(Object obj4) {
                                                        cqce cqceVar = byym.a;
                                                        return null;
                                                    }
                                                }, eoqg.a);
                                            }
                                        }, byymVar4.f);
                                    }
                                }, byymVar3.f);
                            }
                        }, byymVar2.f);
                    }
                }, byymVar.f);
            }
        };
        eosc eoscVar = this.g;
        return eijwVarJ.b(eooyVar, eoscVar).h(new ejvr() { // from class: byza
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cczi ccziVar = byzz.a;
                return cpvsVar.b;
            }
        }, eoscVar);
    }

    public final void c(String str, long j) {
        ((ains) this.j.b()).g(cakn.c(str), ((cogw) this.l.b()).a() - j);
    }

    public final eiju d(final pzs pzsVar, final bzaa bzaaVar, final boolean z, final cbcu cbcuVar) {
        eiju eijuVarK = this.d.k();
        eooz eoozVar = new eooz() { // from class: byzu
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                aumq aumqVar = (aumq) obj;
                String str = aumqVar.h;
                boolean zEquals = str.equals("POST_RESTORE_PAGE_TOKEN");
                final bzaa bzaaVar2 = bzaaVar;
                final pzs pzsVar2 = pzsVar;
                if (zEquals) {
                    return bzaaVar2.e(pzsVar2);
                }
                final boolean z2 = z;
                final byzz byzzVar = this.a;
                if (!"RESTORE_DONE_PAGE_TOKEN".equals(str)) {
                    return byzzVar.a(pzsVar2, str, bzaaVar2, z2);
                }
                aumn aumnVarA = bzaaVar2.a();
                aumn aumnVarB = aumn.b(aumqVar.o);
                if (aumnVarB == null) {
                    aumnVarB = aumn.UNSPECIFIED_STAGE;
                }
                if (aumnVarA.equals(aumnVarB)) {
                    return eijx.e(null);
                }
                cqbd cqbdVarC = byzz.c.c();
                cqbdVarC.I("Updating stage and clearing page token");
                cqbdVarC.A("stage", bzaaVar2.a());
                cqbdVarC.r();
                return byzzVar.n.b("CmsRestoreRunner#updateRestoreStage", new Runnable() { // from class: byzr
                    @Override // java.lang.Runnable
                    public final void run() {
                        aurx aurxVar = byzzVar.d;
                        aurxVar.Z(bzaaVar2.a());
                        aurxVar.F();
                    }
                }).i(new eooz() { // from class: byzh
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return byzzVar.a(pzsVar2, "", bzaaVar2, z2);
                    }
                }, byzzVar.h);
            }
        };
        eosc eoscVar = this.g;
        eiju eijuVarI = eijuVarK.i(eoozVar, eoscVar).i(new eooz() { // from class: byzv
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.d.w("RESTORE_DONE_PAGE_TOKEN");
            }
        }, this.h);
        ejvr ejvrVar = new ejvr() { // from class: byzw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cczi ccziVar = byzz.a;
                return new qao();
            }
        };
        eoqg eoqgVar = eoqg.a;
        return eijuVarI.h(ejvrVar, eoqgVar).e(axkg.class, new ejvr() { // from class: byzx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.i.e(bzaaVar.f());
                byzz.c.s("Restore work failed because account is not linked", (axkg) obj);
                return new qam();
            }
        }, eoscVar).e(byzy.class, new ejvr() { // from class: byyr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqbd cqbdVarC = byzz.c.c();
                cqbdVarC.I("Terminating restore because CMS sync is disabled");
                cqbdVarC.s((byzy) obj);
                return new qam();
            }
        }, eoqgVar).e(cpmb.class, new ejvr() { // from class: byys
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                cqbd cqbdVarB = byzz.c.b();
                cqbdVarB.I("Terminating restore because of a page token cycle");
                cqbdVarB.s((cpmb) obj);
                return new qam();
            }
        }, eoqgVar).f(Exception.class, new eooz() { // from class: byyt
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Exception exc = (Exception) obj;
                byzz.c.s("Unexpected exception; worker will retry", exc);
                final byzz byzzVar = this.a;
                final bzaa bzaaVar2 = bzaaVar;
                eiju eijuVarH = byzzVar.d.j().h(new ejvr() { // from class: byze
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        byzzVar.i.n(bzaaVar2.f(), ((Integer) obj2).intValue(), exc);
                        return null;
                    }
                }, byzzVar.g);
                eooz eoozVar2 = new eooz() { // from class: byzf
                    @Override // defpackage.eooz
                    public final ListenableFuture a(Object obj2) {
                        return byzzVar.d.A(new Function() { // from class: auof
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                aumg aumgVar = (aumg) obj3;
                                cqce cqceVar = aurx.a;
                                int i = ((aumq) aumgVar.instance).n + 1;
                                aumgVar.copyOnWrite();
                                aumq aumqVar = (aumq) aumgVar.instance;
                                aumqVar.b |= 1024;
                                aumqVar.n = i;
                                return aumgVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }, new Function() { // from class: auog
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo536andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return Integer.valueOf(((aumq) obj3).n);
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                    }
                };
                eoqg eoqgVar2 = eoqg.a;
                return eijuVarH.i(eoozVar2, eoqgVar2).h(new ejvr() { // from class: byzg
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cqbd cqbdVarC = byzz.c.c();
                        cqbdVarC.I("Incremented page attempt count.");
                        cqbdVarC.A("attemptCount", (Integer) obj2);
                        cqbdVarC.r();
                        return new qan();
                    }
                }, eoqgVar2);
            }
        }, eoqgVar).h(new ejvr() { // from class: byyw
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                qap qapVar = (qap) obj;
                if (new qao().equals(qapVar)) {
                    return cbcw.i();
                }
                if (new qan().equals(qapVar)) {
                    return this.a.m > 0 ? cbcw.j(ekgb.r(cbcuVar)) : cbcw.m();
                }
                if (new qam().equals(qapVar)) {
                    return cbcw.k();
                }
                throw new IllegalArgumentException(String.format("Unknown Result type was found in CmsRestoreBackupKeyWorkHandler! Result is: [%s]", qapVar));
            }
        }, eoqgVar);
    }
}
