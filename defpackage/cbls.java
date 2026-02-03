package defpackage;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.DesugarCollections;
import j$.util.Map;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbls implements cbkt {
    public static final cqce a = cqce.g("BugleWorkQueue", "WorkQueueWorkerImpl");
    static final cczv b = cdag.p(151866670);
    public final fcsu c;
    public final eosc d;
    public final eosd e;
    public final dqsn f;
    public final eygg g;
    public final cbbj h;
    public final cogw i;
    public final cden k;
    public final aipo l;
    public final cbfv m;
    final cayi n;
    public final Executor j = eoqg.a;
    private final Map o = DesugarCollections.synchronizedMap(new HashMap());

    public cbls(fcsu fcsuVar, eosc eoscVar, eosd eosdVar, dqsn dqsnVar, eygg eyggVar, cbbj cbbjVar, cogw cogwVar, cden cdenVar, aipo aipoVar, cbfv cbfvVar) {
        this.c = fcsuVar;
        this.d = eoscVar;
        this.e = eosdVar;
        this.f = dqsnVar;
        this.g = eyggVar;
        this.h = cbbjVar;
        this.i = cogwVar;
        this.k = cdenVar;
        this.l = aipoVar;
        this.m = cbfvVar;
        this.n = new cayi(dqsnVar);
    }

    public static int d(ekgb ekgbVar) {
        Stream map = Collection.EL.stream(ekgbVar).map(new Function() { // from class: cbli
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(((cbdg) obj).m());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return ((ekgb) map.collect(ekcv.a)).hashCode();
    }

    @Override // defpackage.cbkt
    public final eiju a(final String str, final cazk cazkVar) {
        cbaz cbazVar = (cbaz) this.c.b();
        String str2 = ((caxn) cazkVar).a;
        final int iA = cbazVar.a(str2);
        cqbd cqbdVarD = a.d();
        cqbdVarD.I("startWork");
        cqbdVarD.A("src", str);
        cqbdVarD.A("queue", str2);
        cqbdVarD.r();
        eoqr eoqrVar = (eoqr) Map.EL.computeIfAbsent(this.o, str2, new Function() { // from class: cbkw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cqce cqceVar = cbls.a;
                return new eoqr();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cbfd cbfdVarA = cbfi.a();
        cbfdVarA.A("WorkQueueWorkerImpl#startWork");
        cbfdVarA.e(new Function() { // from class: cbkx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cbfh cbfhVar = (cbfh) obj;
                cbfhVar.g(((caxn) cazkVar).a);
                cbfhVar.f(new Date(this.a.i.f().toEpochMilli()));
                return cbfhVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cbeg cbegVar = cbfi.c;
        cbfdVarA.d(new cbfa(cbegVar.j), new cbfa(cbegVar.a));
        cbfdVarA.y(iA);
        final cbfb cbfbVarB = cbfdVarA.b();
        return eiju.g(eoqrVar.b(eiid.c(new eooy() { // from class: cbky
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final cbls cblsVar = this.a;
                cblsVar.n.d();
                final String str3 = str;
                final cazk cazkVar2 = cazkVar;
                final cbfb cbfbVar = cbfbVarB;
                final int i = iA;
                return (ListenableFuture) cblsVar.f.c("WorkQueueWorkerImpl.startWork", new ejxr() { // from class: cbla
                    @Override // defpackage.ejxr
                    public final Object get() {
                        String str4 = ((caxn) cazkVar2).a;
                        return cblsVar.f(str3, str4, cbfbVar, i);
                    }
                });
            }
        }), this.d));
    }

    @Override // defpackage.cbkt
    public final eiju b(final String str, final String str2) {
        final int iA = ((cbaz) this.c.b()).a(str2);
        cqbd cqbdVarD = a.d();
        cqbdVarD.I("startWork");
        cqbdVarD.A("src", str);
        cqbdVarD.A("queue", str2);
        cqbdVarD.r();
        eoqr eoqrVar = (eoqr) Map.EL.computeIfAbsent(this.o, str2, new Function() { // from class: cbln
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cqce cqceVar = cbls.a;
                return new eoqr();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cbfd cbfdVarA = cbfi.a();
        cbfdVarA.A("WorkQueueWorkerImpl#startWork");
        cbfdVarA.e(new Function() { // from class: cblo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cbfh cbfhVar = (cbfh) obj;
                cbfhVar.g(str2);
                cbfhVar.f(new Date(this.a.i.f().toEpochMilli()));
                return cbfhVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        cbeg cbegVar = cbfi.c;
        cbfdVarA.d(new cbfa(cbegVar.j), new cbfa(cbegVar.a));
        cbfdVarA.y(iA);
        final cbfb cbfbVarB = cbfdVarA.b();
        return eiju.g(eoqrVar.b(eiid.c(new eooy() { // from class: cblp
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final cbls cblsVar = this.a;
                cblsVar.n.d();
                final String str3 = str;
                final String str4 = str2;
                final cbfb cbfbVar = cbfbVarB;
                final int i = iA;
                return (ListenableFuture) cblsVar.f.c("WorkQueueWorkerImpl.startWork", new ejxr() { // from class: cblk
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return cblsVar.f(str3, str4, cbfbVar, i);
                    }
                });
            }
        }), this.d));
    }

    @Override // defpackage.cbkt
    public final void c(final caxw caxwVar, final Pattern pattern) {
        final cayi cayiVar = this.n;
        cayiVar.c(new Runnable() { // from class: cayh
            @Override // java.lang.Runnable
            public final void run() {
                caxw caxwVar2 = caxwVar;
                caxwVar2.b("PWQ Execution State:");
                cayi cayiVar2 = cayiVar;
                caxv caxvVarA = caxwVar2.a();
                try {
                    for (Map.Entry entry : cayiVar2.c.entrySet()) {
                        Pattern pattern2 = pattern;
                        if (pattern2 == null || pattern2.matcher(((caye) entry.getValue()).a).matches()) {
                            caxwVar2.b(String.valueOf(entry.getKey()) + " ==> " + String.valueOf(entry.getValue()));
                        }
                    }
                    caxvVarA.close();
                } catch (Throwable th) {
                    try {
                        caxvVarA.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
    }

    final cbcw e(final cazg cazgVar, final ekgb ekgbVar, final cbcw cbcwVar, final cayd caydVar) {
        this.n.d();
        return cbcwVar.g() ? cbcwVar : (cbcw) this.f.c("WorkQueueWorkerImpl#handleResultInner", new ejxr() { // from class: cblm
            @Override // defpackage.ejxr
            public final Object get() {
                Boolean bool = true;
                final cbls cblsVar = this.a;
                final ekgb ekgbVar2 = ekgbVar;
                final cayd caydVar2 = caydVar;
                final cbcw cbcwVar2 = cbcwVar;
                final cazg cazgVar2 = cazgVar;
                ejxr ejxrVar = new ejxr() { // from class: cblb
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x00d9  */
                    /* JADX WARN: Removed duplicated region for block: B:7:0x0037  */
                    @Override // defpackage.ejxr
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object get() {
                        /*
                            Method dump skipped, instructions count: 360
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.cblb.get():java.lang.Object");
                    }
                };
                bool.getClass();
                return (cbcw) cblsVar.n.b(ejxrVar);
            }
        });
    }

    public final eiju f(final String str, final String str2, final cbfb cbfbVar, final int i) {
        return (eiju) this.n.b(new ejxr() { // from class: cbkv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejxr
            public final Object get() {
                caxl caxlVar;
                ainv ainvVarA;
                final cbls cblsVar = this.a;
                fcsu fcsuVar = cblsVar.c;
                final ekgb ekgbVarZ = cbfbVar.z();
                cayw caywVar = new cayw(cblsVar.n, (cbaz) fcsuVar.b());
                while (caywVar.e < ekgbVarZ.size()) {
                    cbdg cbdgVar = (cbdg) ekgbVarZ.get(caywVar.e);
                    if (caywVar.h && !TextUtils.isEmpty(cbdgVar.o())) {
                        break;
                    }
                    String str3 = caywVar.c;
                    if (str3 == null || str3.equals(cbdgVar.r())) {
                        caywVar.f.h(cbdgVar);
                        caywVar.e++;
                        caywVar.c = cbdgVar.r();
                        caywVar.a.a(cbdgVar).a = cbdgVar.r();
                        int i2 = caywVar.g + 1;
                        caywVar.g = i2;
                        caywVar.h = true;
                        if (i2 >= ((caxl) caywVar.b.c(cbdgVar.r()).a()).c || cbdgVar.o() != null) {
                            caywVar.a(null);
                            if (cbdgVar.o() != null) {
                                break;
                            }
                        }
                    } else {
                        caywVar.a(cbdgVar.r());
                    }
                }
                if (caywVar.g > 0) {
                    caywVar.d.h(caywVar.f.g());
                }
                final String str4 = str2;
                ekgb ekgbVarG = caywVar.d.g();
                cqbd cqbdVarD = cbls.a.d();
                cqbdVarD.I("initiateExecution");
                cqbdVarD.A("queue", str4);
                cqbdVarD.y("rows", ekgbVarZ.size());
                int i3 = ((ekoe) ekgbVarG).c;
                cqbdVarD.y("tranches", i3);
                cqbdVarD.r();
                if (ekgbVarG.isEmpty()) {
                    return eijx.e(cbks.NO_RETRY);
                }
                int i4 = 0;
                eiju eijuVarE = eijx.e(cbcw.i());
                int i5 = 0;
                while (i5 < i3) {
                    final ekgb ekgbVar = (ekgb) ekgbVarG.get(i5);
                    cbdg cbdgVar2 = (cbdg) ekgbVar.get(i4);
                    cblsVar.g(ekgbVar, cayd.SUBMITTED);
                    final cazg cazgVarC = ((cbaz) fcsuVar.b()).c(cbdgVar2.r());
                    caxl caxlVar2 = (caxl) cazgVarC.a();
                    elgm elgmVar = caxlVar2.h;
                    if (elgmVar != null) {
                        caxlVar = caxlVar2;
                        ainvVarA = cblsVar.l.a("Bugle.DataModel.ActionBreakdown.Execution.Latency", elgmVar, String.valueOf(cbdgVar2.m()));
                    } else {
                        caxlVar = caxlVar2;
                        ainvVarA = null;
                    }
                    final cblr cblrVar = new cblr(cblsVar, cbdgVar2, str, ekgbVar, cazgVarC);
                    final Duration duration = caxlVar.i;
                    if (duration != null && duration.compareTo(Duration.ZERO) > 0) {
                        eijuVarE = eijuVarE.i(new eooz() { // from class: cblj
                            @Override // defpackage.eooz
                            public final ListenableFuture a(Object obj) {
                                return cblsVar.e.schedule(new eopa((cbcw) obj), duration.toMillis(), TimeUnit.MILLISECONDS);
                            }
                        }, eoqg.a);
                    }
                    final eiju eijuVar = eijuVarE;
                    final ainv ainvVar = ainvVarA;
                    eooz eoozVar = new eooz() { // from class: cblc
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.eooz
                        public final ListenableFuture a(Object obj) {
                            final cbcw cbcwVar = (cbcw) obj;
                            final cbls cblsVar2 = cblsVar;
                            final eiju eijuVar2 = eijuVar;
                            final ekgb ekgbVar2 = ekgbVar;
                            Optional optional = (Optional) cblsVar2.n.b(new ejxr() { // from class: cblf
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.ejxr
                                public final Object get() {
                                    if (!eijuVar2.isCancelled()) {
                                        ekgb ekgbVar3 = ekgbVar2;
                                        cbls cblsVar3 = cblsVar2;
                                        cbdg cbdgVar3 = (cbdg) ekgbVar3.get(0);
                                        cayi cayiVar = cblsVar3.n;
                                        if (cayiVar.g(cbdgVar3)) {
                                            cbcw cbcwVar2 = cbcwVar;
                                            if (!cbcwVar2.e() && cbcwVar2.f()) {
                                                return Optional.of(cbcw.n());
                                            }
                                            if (cbcwVar2.g()) {
                                                return Optional.of(cbcw.n());
                                            }
                                            if (cayiVar.a((cbdg) ekgbVar3.get(0)).d(cayd.CANCELLED)) {
                                                return Optional.of(cbcwVar2);
                                            }
                                            cqbd cqbdVarD2 = cbls.a.d();
                                            cqbdVarD2.I("executing tranche");
                                            cqbdVarD2.y("trancheId", cbls.d(ekgbVar3));
                                            cqbdVarD2.A("queue", ((cbdg) ekgbVar3.get(0)).q());
                                            cqbdVarD2.z("delay", cblsVar3.i.f().toEpochMilli() - ((cbdg) ekgbVar3.get(0)).n());
                                            cqbdVarD2.r();
                                            cblsVar3.g(ekgbVar3, cayd.EXECUTING);
                                            return Optional.empty();
                                        }
                                    }
                                    throw new CancellationException();
                                }
                            });
                            if (optional.isPresent()) {
                                return eijx.e((cbcw) optional.get());
                            }
                            final cazg cazgVar = cazgVarC;
                            cogw cogwVar = cblsVar2.i;
                            eieu eieuVarB = cazgVar.b();
                            final long epochMilli = cogwVar.f().toEpochMilli();
                            cbbj cbbjVar = cblsVar2.h;
                            synchronized (cbbjVar.d) {
                                cbbjVar.e.add(new cbbi(cbbjVar.b.f().toEpochMilli(), 6, new cbbh(cbbjVar, cazgVar, (Long[]) Collection.EL.stream(ekgbVar2).map(new Function() { // from class: cbbd
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj2) {
                                        cczv cczvVar = cbbj.a;
                                        return Long.valueOf(((cbdg) obj2).m());
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                }).toArray(new IntFunction() { // from class: cbbe
                                    @Override // java.util.function.IntFunction
                                    public final Object apply(int i6) {
                                        cczv cczvVar = cbbj.a;
                                        return new Long[i6];
                                    }
                                }), null)));
                            }
                            final cayy cayyVar = cblrVar;
                            eiju eijuVarS = cazgVar.s(cayyVar, ekgbVar2);
                            eieuVarB.b(eijuVarS);
                            final eiju eijuVarH = eijuVarS.h(new ejvr() { // from class: cblg
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj2) {
                                    cbcw cbcwVar2 = (cbcw) obj2;
                                    cqbd cqbdVarD2 = cbls.a.d();
                                    cqbdVarD2.I("handler execution");
                                    ekgb ekgbVar3 = ekgbVar2;
                                    cqbdVarD2.y("trancheId", cbls.d(ekgbVar3));
                                    cazg cazgVar2 = cazgVar;
                                    cqbdVarD2.A("handlerName", cazgVar2.e());
                                    cqbdVarD2.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, ((cbdg) ekgbVar3.get(0)).r());
                                    cbls cblsVar3 = cblsVar2;
                                    cqbdVarD2.z("duration", cblsVar3.i.f().toEpochMilli() - epochMilli);
                                    cqbdVarD2.y("attemptCount", ((caxm) ((cblr) cayyVar).b).c);
                                    cqbdVarD2.y("maxAttempts", ((caxl) cazgVar2.a()).d);
                                    cqbdVarD2.r();
                                    cbbj cbbjVar2 = cblsVar3.h;
                                    synchronized (cbbjVar2.d) {
                                        cbbjVar2.e.add(new cbbi(cbbjVar2.b.f().toEpochMilli(), 7, new cbbh(cbbjVar2, cazgVar2, (Long[]) Collection.EL.stream(ekgbVar3).map(new Function() { // from class: cbbb
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj3) {
                                                cczv cczvVar = cbbj.a;
                                                return Long.valueOf(((cbdg) obj3).m());
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }).toArray(new IntFunction() { // from class: cbbc
                                            @Override // java.util.function.IntFunction
                                            public final Object apply(int i6) {
                                                cczv cczvVar = cbbj.a;
                                                return new Long[i6];
                                            }
                                        }), cbcwVar2)));
                                    }
                                    return cbcwVar2;
                                }
                            }, cblsVar2.e);
                            int size = ekgbVar2.size();
                            for (int i6 = 0; i6 < size; i6++) {
                                final cbdg cbdgVar3 = (cbdg) ekgbVar2.get(i6);
                                cblsVar2.n.b(new ejxr() { // from class: cbkz
                                    @Override // defpackage.ejxr
                                    public final Object get() {
                                        cayi cayiVar = cblsVar2.n;
                                        cbdg cbdgVar4 = cbdgVar3;
                                        if (!cayiVar.g(cbdgVar4)) {
                                            throw new CancellationException();
                                        }
                                        cayiVar.a(cbdgVar4).c = eijuVarH;
                                        return null;
                                    }
                                });
                            }
                            ainv ainvVar2 = ainvVar;
                            if (ainvVar2 == null) {
                                return eijuVarH;
                            }
                            eijuVarH.k(new cblq(ainvVar2), eoqg.a);
                            return eijuVarH;
                        }
                    };
                    eosc eoscVar = cblsVar.d;
                    eijuVarE = eijuVar.i(eoozVar, eoscVar).e(Throwable.class, new ejvr() { // from class: cbld
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            ekgb ekgbVar2 = ekgbVar;
                            Throwable th = (Throwable) obj;
                            cbcw cbcwVarK = cbcw.k();
                            String strR = ((cbdg) ekgbVar2.get(0)).r();
                            boolean z = th instanceof CancellationException;
                            cbls cblsVar2 = cblsVar;
                            if (z) {
                                cqbd cqbdVarE = cbls.a.e();
                                cqbdVarE.I("got CancellationException");
                                cqbdVarE.y("trancheId", cbls.d(ekgbVar2));
                                cqbdVarE.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, strR);
                                cqbdVarE.r();
                                cbcwVarK = cbcw.m();
                            } else if (th instanceof TimeoutException) {
                                cqbd cqbdVarE2 = cbls.a.e();
                                cqbdVarE2.I("got TimeoutException");
                                cqbdVarE2.y("trancheId", cbls.d(ekgbVar2));
                                cqbdVarE2.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, strR);
                                cqbdVarE2.r();
                                cbcwVarK = cbcw.m();
                            } else {
                                cqbd cqbdVarB = cbls.a.b();
                                cqbdVarB.I("got throwable executing work");
                                cqbdVarB.y("trancheId", cbls.d(ekgbVar2));
                                cqbdVarB.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, strR);
                                cqbdVarB.A("exception", th.getClass().getName());
                                cqbdVarB.s(th);
                                if (((Boolean) cbls.b.e()).booleanValue()) {
                                    cblsVar2.k.b(th);
                                }
                            }
                            cazg cazgVar = cazgVarC;
                            cqbd cqbdVarE3 = cbls.a.e();
                            cqbdVarE3.I(Log.getStackTraceString(th));
                            cqbdVarE3.r();
                            return cblsVar2.e(cazgVar, ekgbVar2, cbcwVarK, cayd.COMPLETED);
                        }
                    }, eoscVar).h(new ejvr() { // from class: cble
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            return cblsVar.e(cazgVarC, ekgbVar, (cbcw) obj, cayd.COMPLETED);
                        }
                    }, cblsVar.j);
                    i5++;
                    i4 = 0;
                }
                final int i6 = i;
                return eijuVarE.h(new ejvr() { // from class: cblh
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        cbcw cbcwVar = (cbcw) obj;
                        cqbd cqbdVarD2 = cbls.a.d();
                        cqbdVarD2.I("completion");
                        cqbdVarD2.A("queue", str4);
                        cqbdVarD2.A("result", cbcwVar);
                        cqbdVarD2.r();
                        if (cbcwVar.e() || !cbcwVar.f()) {
                            return ekgbVarZ.size() == i6 ? cbks.CONTINUE : cbks.NO_RETRY;
                        }
                        return cbks.RETRY;
                    }
                }, cblsVar.j);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(ekgb ekgbVar, cayd caydVar) {
        int size = ekgbVar.size();
        for (int i = 0; i < size; i++) {
            this.n.a((cbdg) ekgbVar.get(i)).c(caydVar);
        }
    }
}
