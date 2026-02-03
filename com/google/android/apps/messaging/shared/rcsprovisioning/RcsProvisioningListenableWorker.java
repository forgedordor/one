package com.google.android.apps.messaging.shared.rcsprovisioning;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.rcsprovisioning.RcsProvisioningListenableWorker;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.apwv;
import defpackage.arur;
import defpackage.auvh;
import defpackage.cebq;
import defpackage.cgbe;
import defpackage.cgbn;
import defpackage.chyx;
import defpackage.chza;
import defpackage.chzz;
import defpackage.ckhg;
import defpackage.ckhv;
import defpackage.ckhw;
import defpackage.cmlb;
import defpackage.cogw;
import defpackage.cqbm;
import defpackage.cqzr;
import defpackage.dfpi;
import defpackage.dggn;
import defpackage.dggo;
import defpackage.dgie;
import defpackage.dgng;
import defpackage.dgnh;
import defpackage.dgqr;
import defpackage.dgrs;
import defpackage.dheq;
import defpackage.dhiz;
import defpackage.ehli;
import defpackage.eieh;
import defpackage.eifp;
import defpackage.eigp;
import defpackage.eiiy;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ejvr;
import defpackage.ejwk;
import defpackage.eksl;
import defpackage.eksp;
import defpackage.enxe;
import defpackage.enxx;
import defpackage.enxy;
import defpackage.eoqg;
import defpackage.eosc;
import defpackage.kog;
import defpackage.koi;
import defpackage.kol;
import defpackage.pzs;
import defpackage.qaa;
import defpackage.qam;
import defpackage.qan;
import defpackage.qao;
import defpackage.qap;
import defpackage.qaq;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class RcsProvisioningListenableWorker extends qaq implements dgie {
    private final cqbm A;
    private final long B;
    private final boolean C;
    private int D;
    private final cogw E;
    private volatile String F;
    private final ckhw G;
    private final long H;
    private final eigp I;
    private final cqzr J;
    private final cgbn K;
    private final cebq L;
    private final arur M;
    public final Context f;
    public final ckhg g;
    public dgng h;
    public qap i;
    public final String j;
    public final enxe k;
    public final String l;
    public kog m;
    public final eosc n;
    public eiju o;
    public final dgnh p;
    public final cmlb q;
    public final Optional r;
    public final boolean s;
    public final apwv t;
    public int u;
    private final dgrs w;
    private final dheq x;
    private final dgqr y;
    private final chzz z;
    private static final AtomicLong v = new AtomicLong(0);
    public static final eksp e = eksp.c("BugleRcsWorker");

    /* compiled from: PG */
    public interface a {
        eosc A();

        apwv av();

        arur ax();

        eigp b();

        cebq bU();

        cgbn bY();

        cqbm cC();

        chzz ck();

        ckhg cn();

        ckhw co();

        cmlb cr();

        dgng dn();

        /* renamed from: do */
        dgnh mo79do();

        dgqr dp();

        dgrs dq();

        dheq dr();

        cqzr k();

        cogw y();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcsProvisioningListenableWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        dgrs dgrsVarDq = p(context).dq();
        ckhg ckhgVarCn = p(context).cn();
        dheq dheqVarDr = p(context).dr();
        dgqr dgqrVarDp = p(context).dp();
        chzz chzzVarCk = p(context).ck();
        cqbm cqbmVarCC = p(context).cC();
        cogw cogwVarY = p(context).y();
        ckhw ckhwVarCo = p(context).co();
        eigp eigpVarB = p(context).b();
        cqzr cqzrVarK = p(context).k();
        cgbn cgbnVarBY = p(context).bY();
        eosc eoscVarA = p(context).A();
        dgnh dgnhVarMo79do = p(context).mo79do();
        cmlb cmlbVarCr = p(context).cr();
        cebq cebqVarBU = p(context).bU();
        apwv apwvVarAv = p(context).av();
        arur arurVarAx = p(context).ax();
        this.i = new qam();
        this.o = null;
        this.f = context;
        this.j = String.valueOf(v.getAndIncrement());
        this.H = cogwVarY.f().toEpochMilli();
        pzs pzsVar = workerParameters.b;
        this.B = pzsVar.b("scheduled_time_sec", 0L);
        this.C = pzsVar.h("is_config_refresh");
        this.w = dgrsVarDq;
        this.g = ckhgVarCn;
        this.x = dheqVarDr;
        this.y = dgqrVarDp;
        this.z = chzzVarCk;
        this.A = cqbmVarCC;
        this.E = cogwVarY;
        this.G = ckhwVarCo;
        this.I = eigpVarB;
        this.J = cqzrVarK;
        this.K = cgbnVarBY;
        this.n = eoscVarA;
        this.p = dgnhVarMo79do;
        this.q = cmlbVarCr;
        this.L = cebqVarBU;
        this.t = apwvVarAv;
        enxe enxeVarB = enxe.b(pzsVar.a("trigger_event", 0));
        this.k = enxeVarB == null ? enxe.UNDEFINED_TRIGGER_EVENT : enxeVarB;
        this.l = ejwk.b(pzsVar.d("worker_id"));
        boolean zH = pzsVar.h("use_sim_subscription_info");
        this.s = zH;
        if (zH) {
            this.r = Optional.ofNullable(pzsVar.d("rcs_provisioning_id")).map(new Function() { // from class: ckha
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new dggp((String) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            this.r = Optional.empty();
        }
        this.M = arurVarAx;
    }

    public static String c(String str, Object[] objArr) {
        return objArr.length == 0 ? str : String.format(Locale.US, str, objArr);
    }

    private static a p(Context context) {
        return (a) ehli.a(context, a.class);
    }

    private final eifp q(String str) {
        try {
            return this.I.c(str, "com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningListenableWorker", "getRootOrSpanTrace", 501);
        } catch (IllegalStateException unused) {
            eiiy.e();
            return eiiy.k(str);
        }
    }

    private final eiju r() {
        this.u = 2;
        return eiju.g(kol.a(new koi() { // from class: ckgx
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                final RcsProvisioningListenableWorker rcsProvisioningListenableWorker = this.a;
                rcsProvisioningListenableWorker.m = kogVar;
                rcsProvisioningListenableWorker.o = eijx.f(new Runnable() { // from class: ckhb
                    @Override // java.lang.Runnable
                    public final void run() {
                        char c;
                        RcsProvisioningListenableWorker rcsProvisioningListenableWorker2 = rcsProvisioningListenableWorker;
                        if (rcsProvisioningListenableWorker2.s) {
                            cmlb cmlbVar = rcsProvisioningListenableWorker2.q;
                            Optional optional = rcsProvisioningListenableWorker2.r;
                            cmmh cmmhVar = (cmmh) cmlbVar.j((dggn) optional.orElseThrow()).orElse(null);
                            if (cmmhVar == null) {
                                ((eksl) ((eksl) RcsProvisioningListenableWorker.e.j()).h("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningListenableWorker", "logw", 635, "RcsProvisioningListenableWorker.java")).I("[seqId=%s][workId=%s] %s", rcsProvisioningListenableWorker2.j, rcsProvisioningListenableWorker2.l, RcsProvisioningListenableWorker.c("Cannot start provisioning engine. Unable to obtain sim info for sim id: %s", new Object[]{optional.orElseThrow()}));
                                return;
                            }
                            dgnh dgnhVar = rcsProvisioningListenableWorker2.p;
                            boolean zA = rcsProvisioningListenableWorker2.t.a();
                            Optional optionalOf = Optional.of(cmmhVar);
                            Context context = dgnhVar.a;
                            deyo deyoVar = dgnhVar.b;
                            dgnm dgnmVar = dgnhVar.c;
                            Optional optional2 = dgnhVar.d;
                            dgkn dgknVar = dgnhVar.e;
                            dgnj dgnjVar = dgnhVar.f;
                            dheq dheqVar = dgnhVar.g;
                            dgkj dgkjVar = dgnhVar.h;
                            Optional optional3 = dgnhVar.m;
                            dgrs dgrsVar = dgnhVar.i;
                            c = 0;
                            dgsy dgsyVar = dgnhVar.j;
                            eosc eoscVar = dgnhVar.k;
                            crmx crmxVar = dgnhVar.l;
                            dgtg dgtgVar = dgnhVar.n;
                            dcdt dcdtVar = dgnhVar.o;
                            cmlb cmlbVar2 = dgnhVar.z;
                            fcsu fcsuVar = dgnhVar.K;
                            crny crnyVar = dgnhVar.p;
                            dgjq dgjqVar = dgnhVar.Z;
                            fcsu fcsuVar2 = dgnhVar.L;
                            dgix dgixVar = dgnhVar.q;
                            cqbm cqbmVar = dgnhVar.A;
                            fcsu fcsuVar3 = dgnhVar.M;
                            dgjo dgjoVar = dgnhVar.r;
                            cebq cebqVar = dgnhVar.B;
                            fcsu fcsuVar4 = dgnhVar.N;
                            dgjp dgjpVar = dgnhVar.Y;
                            cebf cebfVar = dgnhVar.C;
                            fcsu fcsuVar5 = dgnhVar.O;
                            dgnt dgntVar = dgnhVar.s;
                            fdjx fdjxVar = dgnhVar.D;
                            fcsu fcsuVar6 = dgnhVar.P;
                            dgnq dgnqVar = dgnhVar.t;
                            fcyh fcyhVar = dgnhVar.E;
                            fcsu fcsuVar7 = dgnhVar.Q;
                            cqbm cqbmVar2 = dgnhVar.u;
                            eosc eoscVar2 = dgnhVar.F;
                            fcsu fcsuVar8 = dgnhVar.R;
                            Optional optional4 = dgnhVar.v;
                            dejx dejxVar = dgnhVar.G;
                            aiul aiulVar = dgnhVar.T;
                            rcsProvisioningListenableWorker2.h = new dgng(context, deyoVar, dgnmVar, optional2, dgknVar, dgnjVar, dheqVar, dgkjVar, optional3, dgrsVar, dgsyVar, eoscVar, crmxVar, dgtgVar, dcdtVar, crnyVar, dgixVar, dgjoVar, dgjpVar, dgntVar, dgnqVar, cqbmVar2, optional4, dgnhVar.w, dgnhVar.x, dgnhVar.y, true, optionalOf, cmlbVar2, dgjqVar, cqbmVar, cebqVar, cebfVar, fdjxVar, fcyhVar, eoscVar2, dejxVar, dgnhVar.H, dgnhVar.I, dgnhVar.J, zA, fcsuVar, fcsuVar2, fcsuVar3, fcsuVar4, fcsuVar5, fcsuVar6, fcsuVar7, fcsuVar8, Optional.of(dgnhVar.S), Optional.of(aiulVar), dgnhVar.U, dgnhVar.V, dgnhVar.W, dgnhVar.X);
                        } else {
                            c = 0;
                            rcsProvisioningListenableWorker2.h = ((RcsProvisioningListenableWorker.a) ehli.a(rcsProvisioningListenableWorker2.f, RcsProvisioningListenableWorker.a.class)).dn();
                        }
                        dgng dgngVar = rcsProvisioningListenableWorker2.h;
                        dgngVar.getClass();
                        dgngVar.J = Optional.of(rcsProvisioningListenableWorker2);
                        dgng dgngVar2 = rcsProvisioningListenableWorker2.h;
                        enxe enxeVar = rcsProvisioningListenableWorker2.k;
                        dgngVar2.W = enxeVar;
                        dgngVar2.X = rcsProvisioningListenableWorker2.l;
                        String strName = enxeVar.name();
                        Object[] objArr = new Object[1];
                        objArr[c] = strName;
                        rcsProvisioningListenableWorker2.m("Starting StateMachine, trigger is %s", objArr);
                        dgng dgngVar3 = rcsProvisioningListenableWorker2.h;
                        dgngVar3.getClass();
                        dgngVar3.R();
                    }
                }, rcsProvisioningListenableWorker.n);
                auvh.h(rcsProvisioningListenableWorker.o);
                return "RCS Provisioning Task";
            }
        }));
    }

    private final void s(String str) {
        this.G.b(str).k(auvh.b(), eoqg.a);
    }

    private final void t(int i, String str) {
        this.D = this.G.a(str);
        int i2 = i - 1;
        if (i2 == 0) {
            this.u = 4;
            String strK = k();
            dgrs dgrsVar = this.w;
            long jF = dgrsVar.f(strK).f();
            if (jF > 0) {
                this.g.f(strK, Duration.ofSeconds(jF), true, enxe.RCS_CONFIGURATION_UPDATED);
            }
            if (this.s) {
                ((chza) this.A.a()).p((dggn) this.r.orElseThrow(new Supplier() { // from class: ckhc
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        eksp ekspVar = RcsProvisioningListenableWorker.e;
                        throw new IllegalStateException("RCS Provisioning Id should not be empty");
                    }
                }), chyx.RCS_CONFIGURATION_UPDATE);
            } else {
                ((chza) this.A.a()).n(chyx.RCS_CONFIGURATION_UPDATE);
            }
            String strK2 = k();
            m("Configuration is updated for SIM %s, notifying listeners", dhiz.SIM_ID.c(strK2));
            this.y.s(strK2, Optional.of(dgrsVar.f(strK2)));
            s(strK2);
            this.i = new qao();
        } else if (i2 == 1) {
            m("RCS is disabled, shutting down Provisioning Task", new Object[0]);
            this.u = 6;
            this.i = new qao();
        } else if (i2 == 2) {
            m("Provisioning Engine needs user input, shutting down Provisioning Task", new Object[0]);
            this.u = 5;
            s(k());
            this.i = new qao();
        } else if (i2 != 4) {
            m("Provisioning Engine entered RetryState, provisioning task will be rescheduled with exponential backoff", new Object[0]);
            this.u = 7;
            u(k(), 3);
        } else {
            m("Provisioning Engine needs manual msisdn entry, shutting down Provisioning Task", new Object[0]);
            this.u = 5;
            if (dfpi.z() ? this.L.c(str).x : dfpi.U()) {
                this.g.m(k(), Duration.ofMillis(dfpi.p()), 3, enxe.MANUAL_MSISDN_ENTRY_REQUIRED);
            }
            this.i = new qao();
        }
        l();
    }

    private final void u(String str, final int i) {
        eiju eijuVarC = this.G.c(str);
        ejvr ejvrVar = new ejvr() { // from class: ckgz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Duration duration = (Duration) obj;
                cqca.i("Bugle", "Scheduling custom retry");
                RcsProvisioningListenableWorker rcsProvisioningListenableWorker = this.a;
                rcsProvisioningListenableWorker.g.m(rcsProvisioningListenableWorker.k(), duration, i, enxe.STATE_MACHINE_RETRY);
                return duration;
            }
        };
        eoqg eoqgVar = eoqg.a;
        eijuVarC.h(ejvrVar, eoqgVar).k(auvh.b(), eoqgVar);
        this.i = new qao();
    }

    @Override // defpackage.qaq
    public final ListenableFuture a() throws Resources.NotFoundException {
        if (this.G.a(k()) >= ((Integer) ckhv.c.e()).intValue()) {
            return super.a();
        }
        this.J.c();
        int i = cgbe.FOREGROUND_SERVICE.G;
        Notification notificationC = this.K.c(this.f.getString(R.string.rcs_foreground_service_message_v2));
        notificationC.getClass();
        return eijx.e(new qaa(i, notificationC, 0));
    }

    @Override // defpackage.qaq
    public final ListenableFuture b() {
        m("RCS provisioning task has started", new Object[0]);
        if (this.M.a()) {
            eifp eifpVarQ = q("RcsProvisioningListenableWorker: startWork");
            try {
                eiju eijuVarR = r();
                eifpVarQ.close();
                return eijuVarR;
            } catch (Throwable th) {
                try {
                    eifpVarQ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        eieh eiehVarC = this.I.c("RcsProvisioningListenableWorker: startWork", "com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningListenableWorker", "startWork", 477);
        try {
            eiju eijuVarR2 = r();
            eiehVarC.close();
            return eijuVarR2;
        } catch (Throwable th3) {
            try {
                eiehVarC.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.qaq
    public final void d() {
        m("Provisioning task is stopped by the system", new Object[0]);
        this.u = 3;
        u(k(), 2);
        l();
    }

    public final String k() {
        return this.s ? dggo.a((dggn) this.r.orElseThrow(new Supplier() { // from class: ckgy
            @Override // java.util.function.Supplier
            public final Object get() {
                eksp ekspVar = RcsProvisioningListenableWorker.e;
                throw new IllegalStateException("RCS Provisioning Id should not be empty");
            }
        })).a : this.x.f();
    }

    public final void l() {
        int i = 1;
        m("finish provisioning task with result %s", this.i);
        m("RCS provisioning task has finished with result %s", this.i);
        enxx enxxVar = (enxx) enxy.a.createBuilder();
        enxxVar.copyOnWrite();
        enxy enxyVar = (enxy) enxxVar.instance;
        enxyVar.b |= 1;
        enxyVar.c = this.C;
        long j = this.B;
        long seconds = j != 0 ? TimeUnit.MILLISECONDS.toSeconds(this.H) - j : 0L;
        enxxVar.copyOnWrite();
        enxy enxyVar2 = (enxy) enxxVar.instance;
        enxyVar2.b |= 2;
        enxyVar2.d = seconds;
        long epochMilli = this.E.f().toEpochMilli() - this.H;
        enxxVar.copyOnWrite();
        enxy enxyVar3 = (enxy) enxxVar.instance;
        enxyVar3.b |= 4;
        enxyVar3.e = epochMilli;
        String str = this.j;
        enxxVar.copyOnWrite();
        enxy enxyVar4 = (enxy) enxxVar.instance;
        str.getClass();
        enxyVar4.b |= 8;
        enxyVar4.f = str;
        int i2 = this.u;
        enxxVar.copyOnWrite();
        enxy enxyVar5 = (enxy) enxxVar.instance;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        enxyVar5.g = i3;
        enxyVar5.b |= 16;
        qap qapVar = this.i;
        if (qapVar.equals(new qao())) {
            i = 3;
        } else if (qapVar.equals(new qan())) {
            i = 2;
        } else if (qapVar.equals(new qam())) {
            i = 4;
        }
        enxxVar.copyOnWrite();
        enxy enxyVar6 = (enxy) enxxVar.instance;
        enxyVar6.h = i - 1;
        enxyVar6.b |= 32;
        int iE = e();
        enxxVar.copyOnWrite();
        enxy enxyVar7 = (enxy) enxxVar.instance;
        enxyVar7.b |= 64;
        enxyVar7.i = iE;
        String str2 = this.l;
        enxxVar.copyOnWrite();
        enxy enxyVar8 = (enxy) enxxVar.instance;
        enxyVar8.b |= 128;
        enxyVar8.j = str2;
        String strB = ejwk.b(this.F);
        enxxVar.copyOnWrite();
        enxy enxyVar9 = (enxy) enxxVar.instance;
        enxyVar9.b |= 256;
        enxyVar9.k = strB;
        int i4 = this.D;
        enxxVar.copyOnWrite();
        enxy enxyVar10 = (enxy) enxxVar.instance;
        enxyVar10.b |= 512;
        enxyVar10.l = i4;
        this.z.e((enxy) enxxVar.build());
        eiju eijuVar = this.o;
        if (eijuVar != null) {
            auvh.h(eijuVar.h(new ejvr() { // from class: ckhd
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    dgng dgngVar = this.a.h;
                    if (dgngVar != null) {
                        dgngVar.L();
                    }
                    return true;
                }
            }, this.n));
        } else {
            dgng dgngVar = this.h;
            if (dgngVar != null) {
                dgngVar.L();
            }
        }
        kog kogVar = this.m;
        if (kogVar != null) {
            kogVar.b(this.i);
        }
    }

    public final void m(String str, Object... objArr) {
        ((eksl) ((eksl) e.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningListenableWorker", "logi", 631, "RcsProvisioningListenableWorker.java")).I("[seqId=%s][workId=%s] %s", this.j, this.l, c(str, objArr));
    }

    @Override // defpackage.dgie
    public final void n(String str) {
        this.F = str;
    }

    @Override // defpackage.dgie
    public final void o(int i, String str) {
        m("Received a provisioning state changed event from the provisioning engine %s", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "MANUAL_MSISDN_ENTRY_REQUIRED" : "RETRY" : "USER_INPUT_REQUIRED" : "RCS_DISABLED" : "CONFIGURATION_UPDATED");
        if (this.M.a()) {
            eifp eifpVarQ = q("RcsProvisioningListenableWorker: RcsProvisioningStateChanged");
            try {
                t(i, str);
                eifpVarQ.close();
                return;
            } catch (Throwable th) {
                try {
                    eifpVarQ.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        eieh eiehVarC = this.I.c("RcsProvisioningListenableWorker: RcsProvisioningStateChanged", "com/google/android/apps/messaging/shared/rcsprovisioning/RcsProvisioningListenableWorker", "onRcsProvisioningStateChanged", 231);
        try {
            t(i, str);
            eiehVarC.close();
        } catch (Throwable th3) {
            try {
                eiehVarC.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }
}
