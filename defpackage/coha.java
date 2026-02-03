package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.common.Feature;
import com.google.android.gms.time.trustedtime.dto.GlobalState;
import com.google.android.gms.time.trustedtime.dto.TimeSignalResult;
import com.google.android.gms.time.trustedtime.internal.ITrustedTimeService;
import j$.time.Instant;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coha {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/time/clock/TrustedTimeWrapper");
    public final fdjx b;
    private final cogw c;
    private final fdkf d;

    public coha(Context context, fdjx fdjxVar, cogw cogwVar) throws Throwable {
        defn defnVar;
        defn defnVar2;
        defn defnVarE;
        context.getClass();
        fdjxVar.getClass();
        cogwVar.getClass();
        this.b = fdjxVar;
        this.c = cogwVar;
        dehx dehxVar = new dehx(context);
        final Context applicationContext = context.getApplicationContext();
        synchronized (dehxVar.b) {
            if (dehxVar.m == null) {
                final deio deioVar = dehxVar.a;
                Context context2 = dehxVar.c;
                synchronized (deioVar.b) {
                    defn defnVar3 = deioVar.c;
                    if (defnVar3 != null) {
                        deioVar.d++;
                        defnVarE = defnVar3.e(eoqg.a, new deeq() { // from class: deij
                            @Override // defpackage.deeq
                            public final Object a(defn defnVar4) {
                                return defnVar4.m() ? degc.c((dein) defnVar4.i()) : dejd.a(defnVar4);
                            }
                        });
                    } else {
                        Context applicationContext2 = context2.getApplicationContext();
                        deii deiiVar = deioVar.e;
                        final dehr dehrVar = new dehr(applicationContext2);
                        deioVar.d = 1;
                        synchronized (dehrVar.b) {
                            if (dehrVar.n) {
                                throw new IllegalStateException("dispose() has been called");
                            }
                            if (dehrVar.m == null) {
                                dciz dcizVar = new dciz();
                                dcizVar.b = new Feature[]{dego.a};
                                dcizVar.c = 29801;
                                dcizVar.a = new dcir() { // from class: dehl
                                    @Override // defpackage.dcir
                                    public final void a(Object obj, Object obj2) {
                                        deix deixVar = (deix) obj;
                                        int i = dehr.o;
                                        deho dehoVar = new deho((defr) obj2);
                                        ITrustedTimeService iTrustedTimeService = (ITrustedTimeService) deixVar.w();
                                        Context context3 = deixVar.c;
                                        iTrustedTimeService.retrieveGlobalState(dehoVar, ddlh.a());
                                    }
                                };
                                defn defnVarJ = dehrVar.j(dcizVar.a());
                                final dehq dehqVar = new dehq();
                                final eoqg eoqgVar = eoqg.a;
                                dehrVar.m = defnVarJ.e(eoqgVar, new deeq() { // from class: dehg
                                    @Override // defpackage.deeq
                                    public final Object a(defn defnVar4) {
                                        int i = dehr.o;
                                        dehq dehqVar2 = dehqVar;
                                        if (defnVar4.m()) {
                                            dehqVar2.a = (GlobalState) defnVar4.i();
                                            return degc.c(dehqVar2);
                                        }
                                        dehqVar2.a();
                                        return dejd.a(defnVar4);
                                    }
                                }).e(eoqgVar, new deeq() { // from class: dehh
                                    @Override // defpackage.deeq
                                    public final Object a(defn defnVar4) {
                                        if (!defnVar4.m()) {
                                            return dejd.a(defnVar4);
                                        }
                                        dehq dehqVar2 = (dehq) defnVar4.i();
                                        GlobalState globalState = dehqVar2.a;
                                        if (globalState == null) {
                                            dehqVar2.a();
                                            return degc.b(new IllegalStateException("taskChainState.globalState unexpectedly null"));
                                        }
                                        dehr dehrVar2 = dehrVar;
                                        Context context3 = dehrVar2.c;
                                        dehqVar2.b = new dehe(context3, dehrVar2, globalState, kxj.e(context3));
                                        return degc.c(dehqVar2);
                                    }
                                }).e(eoqgVar, new deeq() { // from class: dehi
                                    @Override // defpackage.deeq
                                    public final Object a(defn defnVar4) {
                                        if (!defnVar4.m()) {
                                            return dejd.a(defnVar4);
                                        }
                                        dehr dehrVar2 = dehrVar;
                                        dehq dehqVar2 = (dehq) defnVar4.i();
                                        synchronized (dehrVar2.b) {
                                            if (dehrVar2.n) {
                                                dehqVar2.a();
                                                return degc.b(new IllegalStateException("dispose() called"));
                                            }
                                            final dehe deheVar = dehqVar2.b;
                                            if (deheVar == null) {
                                                dehqVar2.a();
                                                return degc.b(new IllegalStateException("taskChainState.timeSignalSupplier unexpectedly null"));
                                            }
                                            deis deisVar = deheVar.a;
                                            lbz lbzVar = new lbz() { // from class: dehd
                                                @Override // defpackage.lbz
                                                public final void accept(Object obj) {
                                                    deheVar.c((TimeSignalResult) obj);
                                                }
                                            };
                                            synchronized (((deiu) deisVar).d) {
                                                BroadcastReceiver broadcastReceiver = ((deiu) deisVar).e;
                                                if (broadcastReceiver != null) {
                                                    throw new IllegalStateException(a.J(broadcastReceiver, "timeSignalReceiver != null, timeSignalReceiver="));
                                                }
                                                deit deitVar = new deit(lbzVar);
                                                ((deiu) deisVar).e = deitVar;
                                                deiu.a.incrementAndGet();
                                                IntentFilter intentFilter = new IntentFilter(((deiu) deisVar).c.b);
                                                deht.a.n().D("Registering broadcast receiver=%s with filter=%s", deitVar, intentFilter);
                                                kxj.h(((deiu) deisVar).b, deitVar, intentFilter, "com.google.android.gms.time.permission.SEND_TRUSTED_TIME_SIGNAL");
                                            }
                                            return degc.c(dehqVar2);
                                        }
                                    }
                                }).e(eoqgVar, new deeq() { // from class: dehj
                                    @Override // defpackage.deeq
                                    public final Object a(defn defnVar4) {
                                        Executor executor = eoqgVar;
                                        if (!defnVar4.m()) {
                                            return dejd.a(defnVar4);
                                        }
                                        dehr dehrVar2 = dehrVar;
                                        final dehq dehqVar2 = (dehq) defnVar4.i();
                                        synchronized (dehrVar2.b) {
                                            if (dehrVar2.n) {
                                                dehqVar2.a();
                                                return degc.b(new IllegalStateException("dispose() called"));
                                            }
                                            dciz dcizVar2 = new dciz();
                                            dcizVar2.b = new Feature[]{dego.a};
                                            dcizVar2.c = 29822;
                                            dcizVar2.a = new dcir() { // from class: dehm
                                                @Override // defpackage.dcir
                                                public final void a(Object obj, Object obj2) {
                                                    deix deixVar = (deix) obj;
                                                    int i = dehr.o;
                                                    dehp dehpVar = new dehp((defr) obj2);
                                                    ITrustedTimeService iTrustedTimeService = (ITrustedTimeService) deixVar.w();
                                                    Context context3 = deixVar.c;
                                                    iTrustedTimeService.getLatestTimeSignal(dehpVar, ddlh.a());
                                                }
                                            };
                                            return dehrVar2.j(dcizVar2.a()).e(executor, new deeq() { // from class: dehf
                                                @Override // defpackage.deeq
                                                public final Object a(defn defnVar5) {
                                                    int i = dehr.o;
                                                    boolean zM = defnVar5.m();
                                                    dehq dehqVar3 = dehqVar2;
                                                    if (!zM) {
                                                        dehqVar3.a();
                                                        return dejd.a(defnVar5);
                                                    }
                                                    dehe deheVar = dehqVar3.b;
                                                    if (deheVar == null) {
                                                        dehqVar3.a();
                                                        return degc.b(new IllegalStateException("taskChainState.timeSignalSupplier unexpectedly null"));
                                                    }
                                                    TimeSignalResult timeSignalResult = (TimeSignalResult) defnVar5.i();
                                                    if (timeSignalResult != null) {
                                                        deheVar.c(timeSignalResult);
                                                    }
                                                    return degc.c(dehqVar3);
                                                }
                                            });
                                        }
                                    }
                                }).e(eoqgVar, new deeq() { // from class: dehk
                                    @Override // defpackage.deeq
                                    public final Object a(defn defnVar4) {
                                        if (!defnVar4.m()) {
                                            return dejd.a(defnVar4);
                                        }
                                        dehr dehrVar2 = dehrVar;
                                        dehq dehqVar2 = (dehq) defnVar4.i();
                                        synchronized (dehrVar2.b) {
                                            dehe deheVar = dehqVar2.b;
                                            if (deheVar == null) {
                                                dehqVar2.a();
                                                return degc.b(new IllegalStateException("taskChainState.timeSignalSupplier unexpectedly null"));
                                            }
                                            if (!dehrVar2.n) {
                                                return degc.c(deheVar);
                                            }
                                            dehqVar2.a();
                                            return degc.b(new IllegalStateException("dispose() called"));
                                        }
                                    }
                                });
                            }
                            defnVar2 = dehrVar.m;
                        }
                        eoqg eoqgVar2 = eoqg.a;
                        defn defnVarE2 = defnVar2.e(eoqgVar2, new deeq() { // from class: deik
                            @Override // defpackage.deeq
                            public final Object a(defn defnVar4) {
                                deio deioVar2 = deioVar;
                                if (defnVar4.m()) {
                                    return degc.c(new dein(deioVar2, (deic) defnVar4.i(), new dehz(eoqg.a, new dzfh("ShareableTimeSignalSupplierAdapter"))));
                                }
                                dehrVar.a();
                                synchronized (deioVar2.b) {
                                    deioVar2.c = null;
                                    deioVar2.d = 0;
                                }
                                return dejd.a(defnVar4);
                            }
                        });
                        deioVar.c = defnVarE2;
                        defnVarE = defnVarE2.e(eoqgVar2, new deeq() { // from class: deil
                            @Override // defpackage.deeq
                            public final Object a(defn defnVar4) {
                                return defnVar4.m() ? degc.c((deih) defnVar4.i()) : dejd.a(defnVar4);
                            }
                        });
                    }
                }
                dehxVar.m = defnVarE.e(eoqg.a, new deeq() { // from class: dehw
                    @Override // defpackage.deeq
                    public final Object a(defn defnVar4) {
                        return defnVar4.m() ? degc.c(new dehv((deih) defnVar4.i())) : dejd.a(defnVar4);
                    }
                });
            }
            defnVar = dehxVar.m;
        }
        eoqg eoqgVar3 = eoqg.a;
        defn defnVarC = defnVar.e(eoqgVar3, new deeq() { // from class: degr
            @Override // defpackage.deeq
            public final Object a(defn defnVar4) {
                if (!defnVar4.m()) {
                    return dejd.a(defnVar4);
                }
                Context context3 = applicationContext;
                return degc.c(new deip(new deiw(new dejb((deic) defnVar4.i()), new dehc(kxj.e(context3), new dzfh("TrustedTimeClientAdapter"))), new deiz(context3)));
            }
        }).c(eoqgVar3, new deeq() { // from class: cogx
            @Override // defpackage.deeq
            public final Object a(defn defnVar4) {
                if (defnVar4.m()) {
                    return (degs) defnVar4.i();
                }
                ekrw ekrwVarJ = coha.a.j();
                ekrwVarJ.X(eksq.a, "BugleE2eeMls");
                ((ekrd) ((ekrd) ekrwVarJ).g(defnVar4.h()).h("com/google/android/apps/messaging/shared/time/clock/TrustedTimeWrapper", "initializeTrustedTimeClientTask$lambda$0", 57, "TrustedTimeWrapper.kt")).q("Unable to initialize trusted client [ctor]");
                return null;
            }
        });
        final fdjd fdjdVar = new fdjd();
        if (defnVarC.l()) {
            Exception excH = defnVarC.h();
            if (excH != null) {
                fdjdVar.a(excH);
            } else if (((defv) defnVarC).d) {
                fdjdVar.t(null);
            } else {
                fdjdVar.R(defnVarC.i());
            }
        } else {
            defnVarC.o(febj.a, new defb() { // from class: febk
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.defb
                public final void a(defn defnVar4) throws Throwable {
                    fdjc fdjcVar = fdjdVar;
                    Exception excH2 = defnVar4.h();
                    if (excH2 != null) {
                        fdjcVar.a(excH2);
                    } else if (((defv) defnVar4).d) {
                        fdjcVar.t(null);
                    } else {
                        ((fdme) fdjcVar).R(defnVar4.i());
                    }
                }
            });
        }
        this.d = new febl(fdjdVar);
    }

    public final Instant a() {
        Instant instantA;
        fdkf fdkfVar = this.d;
        if (!fdkfVar.y()) {
            Instant instantF = this.c.f();
            instantF.getClass();
            return instantF;
        }
        degs degsVar = (degs) fdkfVar.d();
        if (degsVar != null && (instantA = degsVar.a()) != null) {
            return instantA;
        }
        Instant instantF2 = this.c.f();
        instantF2.getClass();
        return instantF2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.fcxy r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.cogy
            if (r0 == 0) goto L13
            r0 = r5
            cogy r0 = (defpackage.cogy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cogy r0 = new cogy
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            fcyl r1 = defpackage.fcyl.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fctl.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.fctl.b(r5)
            fdkf r5 = r4.d
            r0.c = r3
            java.lang.Object r5 = r5.c(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            j$.time.Instant r5 = r4.a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coha.b(fcxy):java.lang.Object");
    }
}
