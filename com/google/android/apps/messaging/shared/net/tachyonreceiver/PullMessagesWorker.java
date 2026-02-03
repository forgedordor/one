package com.google.android.apps.messaging.shared.net.tachyonreceiver;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.cczi;
import defpackage.cdag;
import defpackage.cezu;
import defpackage.cfic;
import defpackage.cfyx;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.ehli;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.ezok;
import defpackage.ezol;
import defpackage.felm;
import defpackage.pzh;
import defpackage.pzn;
import defpackage.pzs;
import defpackage.pzz;
import defpackage.qam;
import defpackage.qao;
import defpackage.qaq;
import defpackage.qau;
import defpackage.qav;
import defpackage.qbq;
import j$.util.Optional;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class PullMessagesWorker extends qaq {
    private static final cqce e = cqce.g("BugleNetwork", "PullMessagesWorker");
    private static final cczi f = cdag.f(cdag.b, "initialDelaySeconds", 10);
    private final Context g;

    /* compiled from: PG */
    public interface a {
        eigp b();

        Optional eV();
    }

    public PullMessagesWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.g = context;
    }

    public static void c(Context context, ezol ezolVar) {
        cqbd cqbdVarA = e.a();
        cqbdVarA.I("Scheduling pull retry");
        cqbdVarA.A("app", ezolVar.d);
        cqbdVarA.r();
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        qau qauVar = new qau(PullMessagesWorker.class);
        qauVar.d("pull_messages_worker");
        qauVar.g(pzhVar.a());
        pzn pznVar = new pzn();
        pznVar.e("pull_messages_app", ezolVar.d);
        pznVar.e("pull_messages_id", ezolVar.c);
        qauVar.j(pznVar.a());
        qauVar.h(((Long) f.e()).longValue(), TimeUnit.SECONDS);
        qav qavVar = (qav) qauVar.b();
        qbq.a(context).g("pull_messages_" + ezolVar.d + ezolVar.c, pzz.a, qavVar);
    }

    @Override // defpackage.qaq
    public final ListenableFuture b() {
        eiju eijuVarE;
        a aVar = (a) ehli.a(this.g, a.class);
        if (aVar.eV().isEmpty()) {
            e.m("Skip pull messages due to absent PullMessagesWorkerHelper");
            return eijx.e(new qao());
        }
        pzs pzsVarF = f();
        String strD = pzsVarF.d("pull_messages_app");
        String strD2 = pzsVarF.d("pull_messages_id");
        if (TextUtils.isEmpty(strD) || TextUtils.isEmpty(strD2)) {
            e.m("Skip pull messages due to empty parameter");
            return eijx.e(new qam());
        }
        eieh eiehVarC = aVar.b().c("PullMessagesWorker.startWork", "com/google/android/apps/messaging/shared/net/tachyonreceiver/PullMessagesWorker", "startWork", 81);
        try {
            Object obj = aVar.eV().get();
            cqce cqceVar = cfyx.a;
            cqbd cqbdVarC = cqceVar.c();
            cqbdVarC.I("PullMessagesWorkerHelper started");
            cqbdVarC.A("app", strD);
            cqbdVarC.r();
            if (TextUtils.equals(strD, "RCS")) {
                if (cezu.a()) {
                    cqceVar.p("Handling phone number PullMessages retry");
                    ezok ezokVar = (ezok) ezol.a.createBuilder();
                    felm felmVar = felm.PHONE_NUMBER;
                    ezokVar.copyOnWrite();
                    ((ezol) ezokVar.instance).b = felmVar.a();
                    ezokVar.copyOnWrite();
                    ((ezol) ezokVar.instance).d = "RCS";
                    ezokVar.copyOnWrite();
                    ezol ezolVar = (ezol) ezokVar.instance;
                    strD2.getClass();
                    ezolVar.c = strD2;
                    eijuVarE = ((cfyx) obj).b.c((ezol) ezokVar.build());
                } else {
                    cqceVar.m("Skip pull work. Phone registration is not enabled.");
                    eijuVarE = eijx.e(new qao());
                }
            } else {
                Map map = ((cfyx) obj).c;
                if (map.containsKey(strD)) {
                    cfic cficVar = (cfic) map.get(strD);
                    if (cficVar == null) {
                        cqceVar.m(defpackage.a.a(strD, "Skip pull work. ", " GAIA bind manager is not enabled."));
                        eijuVarE = eijx.e(new qao());
                    } else {
                        cqceVar.p(defpackage.a.a(strD, "Handling ", " PullMessages retry"));
                        ezok ezokVar2 = (ezok) ezol.a.createBuilder();
                        felm felmVar2 = felm.EMAIL;
                        ezokVar2.copyOnWrite();
                        ((ezol) ezokVar2.instance).b = felmVar2.a();
                        ezokVar2.copyOnWrite();
                        ezol ezolVar2 = (ezol) ezokVar2.instance;
                        strD.getClass();
                        ezolVar2.d = strD;
                        ezokVar2.copyOnWrite();
                        ezol ezolVar3 = (ezol) ezokVar2.instance;
                        strD2.getClass();
                        ezolVar3.c = strD2;
                        eijuVarE = cficVar.c((ezol) ezokVar2.build());
                    }
                } else {
                    cqbd cqbdVarC2 = cqceVar.c();
                    cqbdVarC2.I("Skip pull work. Unrecognized app name");
                    cqbdVarC2.A("app", strD);
                    cqbdVarC2.r();
                    eijuVarE = eijx.e(new qao());
                }
            }
            eiehVarC.close();
            return eijuVarE;
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
