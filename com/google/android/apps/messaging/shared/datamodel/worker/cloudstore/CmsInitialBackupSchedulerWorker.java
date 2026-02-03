package com.google.android.apps.messaging.shared.datamodel.worker.cloudstore;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.apps.messaging.shared.datamodel.worker.cloudstore.CmsInitialBackupSchedulerWorker;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.aukz;
import defpackage.autx;
import defpackage.axkg;
import defpackage.axlf;
import defpackage.byjx;
import defpackage.byqj;
import defpackage.cogw;
import defpackage.cpmd;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.efwo;
import defpackage.ehli;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.ejvr;
import defpackage.ejwl;
import defpackage.eooz;
import defpackage.eoqg;
import defpackage.eosc;
import defpackage.fcsu;
import defpackage.pza;
import defpackage.pzh;
import defpackage.pzj;
import defpackage.pzs;
import defpackage.pzz;
import defpackage.qaq;
import defpackage.qau;
import defpackage.qav;
import defpackage.qbq;
import j$.time.Duration;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class CmsInitialBackupSchedulerWorker extends qaq {
    public static final cqce e = cqce.g("BugleCms", "CmsInitialBackupSchedulerWorker");
    public static final Duration f = Duration.ofSeconds(5);
    public final Context g;
    public final byjx h;
    public final aukz i;
    public final fcsu j;
    public final autx k;
    public final cogw l;
    private final axlf m;
    private final eosc n;
    private final eigp o;

    /* compiled from: PG */
    public interface a {
        byqj bx();

        cpmd fu();
    }

    /* compiled from: PG */
    public interface b {
        Context S();

        aukz aF();

        axlf aJ();

        eigp b();

        byjx bL();

        fcsu gy();

        autx i();

        eosc q();

        cogw y();
    }

    public CmsInitialBackupSchedulerWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        b bVar = (b) ehli.a(context, b.class);
        this.g = bVar.S();
        this.m = bVar.aJ();
        this.n = bVar.q();
        this.o = bVar.b();
        this.h = bVar.bL();
        this.i = bVar.aF();
        this.j = bVar.gy();
        this.k = bVar.i();
        this.l = bVar.y();
    }

    public static int c(pzs pzsVar, String str) {
        int iA = pzsVar.a(str, -2);
        ejwl.b(iA != -2, "Missing int input data.");
        return iA;
    }

    public static long k(pzs pzsVar, String str) {
        long jB = pzsVar.b(str, -2L);
        ejwl.b(jB != -2, "Missing long input data.");
        return jB;
    }

    @Override // defpackage.qaq
    public final ListenableFuture b() {
        cqbd cqbdVarA = e.a();
        cqbdVarA.I("startWork");
        cqbdVarA.r();
        eigp eigpVar = this.o;
        final pzs pzsVarF = f();
        eieh eiehVarC = eigpVar.c("CmsInitialBackupSchedulerWorker.startWork", "com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsInitialBackupSchedulerWorker", "startWork", 156);
        try {
            eiju eijuVarI = this.m.b(pzsVarF.a("account_id", -1)).i(new eooz() { // from class: byql
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:110:0x05a9  */
                /* JADX WARN: Removed duplicated region for block: B:113:0x05ae  */
                /* JADX WARN: Removed duplicated region for block: B:114:0x05b1  */
                /* JADX WARN: Removed duplicated region for block: B:117:0x060b  */
                /* JADX WARN: Removed duplicated region for block: B:118:0x0630  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x0255  */
                /* JADX WARN: Removed duplicated region for block: B:54:0x0301  */
                /* JADX WARN: Removed duplicated region for block: B:57:0x030c  */
                /* JADX WARN: Removed duplicated region for block: B:69:0x03bc  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x045e  */
                /* JADX WARN: Removed duplicated region for block: B:85:0x0466  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x050d  */
                @Override // defpackage.eooz
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r48) {
                    /*
                        Method dump skipped, instructions count: 1770
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.byql.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                }
            }, this.n);
            ejvr ejvrVar = new ejvr() { // from class: byqm
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    CmsInitialBackupSchedulerWorker.e.s("Account not linked", (axkg) obj);
                    return new qam();
                }
            };
            eoqg eoqgVar = eoqg.a;
            eiju eijuVarF = eijuVarI.e(axkg.class, ejvrVar, eoqgVar).f(Throwable.class, new eooz() { // from class: byqn
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    cqce cqceVar = CmsInitialBackupSchedulerWorker.e;
                    return eijx.e(new qan());
                }
            }, eoqgVar);
            eiehVarC.close();
            return eijuVarF;
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.qaq
    public final void d() {
        cqbd cqbdVarA = e.a();
        cqbdVarA.I("Stopped.");
        cqbdVarA.r();
    }

    public final void l(efwo efwoVar, pzs pzsVar) {
        pzh pzhVar = new pzh();
        pzhVar.c(4);
        pzj pzjVarA = pzhVar.a();
        qau qauVar = new qau(CmsInitialBackupSchedulerWorker.class);
        qauVar.d("CmsPwqInitWorkRequest");
        qauVar.d(String.valueOf(efwoVar.a()));
        qauVar.f(pza.b, 1L, TimeUnit.SECONDS);
        qauVar.g(pzjVarA);
        qauVar.j(pzsVar);
        qauVar.h(f.getSeconds(), TimeUnit.SECONDS);
        qbq.a(this.g).g("CmsInitialWork", pzz.a, (qav) qauVar.b());
    }
}
