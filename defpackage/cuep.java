package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.provider.Telephony;
import android.system.OsConstants;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.dqru;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuep extends cmwg {
    public static final eksp a = eksp.c("BugleStartup");
    public final Context b;
    public final eosc c;
    public final fcsu d;
    public final cogw e;
    public final fcsu f;
    public final Optional g;
    public final apsl h;
    public final fcsu i;
    private final fcsu j;
    private final fcsu l;
    private final fcsu m;
    private final fcsu n;

    public cuep(Context context, fcsu fcsuVar, fcsu fcsuVar2, eosc eoscVar, fcsu fcsuVar3, fcsu fcsuVar4, cogw cogwVar, fcsu fcsuVar5, fcsu fcsuVar6, Optional optional, apsl apslVar, fcsu fcsuVar7) {
        this.b = context;
        this.j = fcsuVar;
        this.l = fcsuVar2;
        this.c = eoscVar;
        this.m = fcsuVar3;
        this.d = fcsuVar4;
        this.e = cogwVar;
        this.n = fcsuVar5;
        this.f = fcsuVar6;
        this.g = optional;
        this.h = apslVar;
        this.i = fcsuVar7;
    }

    @Override // defpackage.cohg
    public final eieu a() {
        return eiiy.k("PhoneAsyncAppCreateStartupTask");
    }

    @Override // defpackage.cmwg
    public final eiju b() throws Throwable {
        if (!((dqoj) dqru.c).j) {
            throw new IllegalStateException("do not use the bugle database on non-primary processes");
        }
        ((dqru.a) ehli.a(dqru.b, dqru.a.class)).fG();
        if (((crnp) this.f.b()).e()) {
            this.n.b();
            Context context = this.b;
            dfcp.b(context);
            dfcp.a(context);
        }
        szw szwVar = (szw) this.m.b();
        szwVar.a(((crqv) this.l.b()).a(), szg.a(szwVar.a, new ekph(szwVar.b)));
        final aijc aijcVar = (aijc) this.j.b();
        eiju eijuVarF = eijx.f(new Runnable() { // from class: aijb
            @Override // java.lang.Runnable
            public final void run() {
                final aijc aijcVar2 = aijcVar;
                aijcVar2.p.b();
                ((ccyw) aijcVar2.o.b()).d(aijcVar2.c);
                fcsu fcsuVar = aijcVar2.e;
                ((ains) fcsuVar.b()).i();
                ((aipo) aijcVar2.f.b()).g();
                ((aipo) aijcVar2.g.b()).g();
                ((aipo) aijcVar2.h.b()).g();
                ((ajhd) aijcVar2.i.b()).k();
                ((bvio) aijcVar2.j.b()).a();
                aiux aiuxVar = (aiux) aijcVar2.k.b();
                ecem.b();
                boolean zI = ((cqpz) aiuxVar.c.b()).i("bugle_enable_analytics", true);
                if (zI) {
                    aiuxVar.b = (aill) aiuxVar.a.b();
                }
                aiuxVar.d.set(zI);
                ((cqpz) aijcVar2.d.b()).g(new Runnable() { // from class: aiiz
                    @Override // java.lang.Runnable
                    public final void run() {
                        aijcVar2.a();
                    }
                });
                aijcVar2.a();
                boolean zE = ((crnp) aijcVar2.l.b()).e();
                Optional optionalA = ((cnwj) aijcVar2.q.b()).a();
                if (zE && optionalA.isPresent()) {
                    cqca.l("BugleDatabase", "full sync request on startup for reason [" + optionalA.get().toString() + "]");
                    ((cmqf) aijcVar2.m.b()).k((enqq) optionalA.get());
                }
                if (craf.l.get()) {
                    ((ains) fcsuVar.b()).c("Bugle.OsUtil.GetProcessName.Failure.Count");
                    if (((Boolean) ((cczi) aijc.b.get()).e()).booleanValue()) {
                        ((eksl) ((eksl) ((eksl) ((eksp) aijc.a.get()).j()).g((Throwable) craf.m.get())).h("com/google/android/apps/messaging/shared/SharedAsyncAppCreateStartupTask", "run", 160, "SharedAsyncAppCreateStartupTask.java")).q("Failure detected retrieving process name from in process data.");
                    }
                }
            }
        }, aijcVar.n);
        eooz eoozVar = new eooz() { // from class: cuel
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final cuet cuetVar = (cuet) this.a.d.b();
                return craf.d ? cuet.b.b().h(new ejvr() { // from class: cues
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        if (!((Boolean) obj2).booleanValue()) {
                            return null;
                        }
                        cuet cuetVar2 = cuetVar;
                        ActivityManager activityManager = (ActivityManager) cuetVar2.d.b();
                        Context context2 = cuetVar2.c;
                        int i = 0;
                        List historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(context2.getPackageName(), 0, 0);
                        String strA = craf.a(context2);
                        Iterator it = historicalProcessExitReasons.iterator();
                        while (it.hasNext()) {
                            ApplicationExitInfo applicationExitInfoM = aee$$ExternalSyntheticApiModelOutline0.m(it.next());
                            if (TextUtils.equals(applicationExitInfoM.getProcessName(), strA)) {
                                switch (applicationExitInfoM.getReason()) {
                                    case 1:
                                        i = 1;
                                        break;
                                    case 2:
                                        if (applicationExitInfoM.getStatus() != OsConstants.SIGILL) {
                                            if (applicationExitInfoM.getStatus() != OsConstants.SIGABRT) {
                                                if (applicationExitInfoM.getStatus() != OsConstants.SIGBUS) {
                                                    if (applicationExitInfoM.getStatus() != OsConstants.SIGKILL) {
                                                        if (applicationExitInfoM.getStatus() != OsConstants.SIGSEGV) {
                                                            i = 2;
                                                            break;
                                                        } else {
                                                            i = 111;
                                                            break;
                                                        }
                                                    } else {
                                                        i = 109;
                                                        break;
                                                    }
                                                } else {
                                                    i = 107;
                                                    break;
                                                }
                                            } else {
                                                i = 106;
                                                break;
                                            }
                                        } else {
                                            i = 104;
                                            break;
                                        }
                                    case 3:
                                        i = 3;
                                        break;
                                    case 4:
                                        i = 4;
                                        break;
                                    case 5:
                                        i = 5;
                                        break;
                                    case 6:
                                        i = 6;
                                        break;
                                    case 7:
                                        i = 7;
                                        break;
                                    case 8:
                                        i = 8;
                                        break;
                                    case 9:
                                        i = 9;
                                        break;
                                    case 10:
                                        i = 10;
                                        break;
                                    case 11:
                                        i = 11;
                                        break;
                                    case 12:
                                        i = 12;
                                        break;
                                    case 13:
                                        i = 13;
                                        break;
                                }
                                ((eksl) cuet.a.n().h("com/google/android/apps/messaging/startup/ProcessHistoryLogger", "logApplicationExitReasonInternal", 87, "ProcessHistoryLogger.java")).B("%s process exit reason: %d", strA, i);
                                ((ains) cuetVar2.e.b()).e("Bugle.Process.Main.ExitReason.Count", i);
                                return null;
                            }
                        }
                        return null;
                    }
                }, cuetVar.f) : eijx.e(null);
            }
        };
        eosc eoscVar = this.c;
        return eijuVarF.i(eoozVar, eoscVar).i(new eooz() { // from class: cuem
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final cuep cuepVar = this.a;
                return !((crnp) cuepVar.f.b()).e() ? eijx.e(null) : (cqbe.j() || ((Long) ccze.D.e()).longValue() == 0) ? eijx.e(null) : eijx.f(new Runnable() { // from class: cuek
                    @Override // java.lang.Runnable
                    public final void run() {
                        long jLongValue = ((Long) ccze.D.e()).longValue();
                        if (jLongValue == 0) {
                            return;
                        }
                        cuep cuepVar2 = cuepVar;
                        ContentResolver contentResolver = cuepVar2.b.getContentResolver();
                        final Uri uriBuild = Telephony.Sms.CONTENT_URI.buildUpon().appendPath("raw").build();
                        try {
                            int iDelete = contentResolver.delete(uriBuild, a.u(cuepVar2.e.f().toEpochMilli() - jLongValue, "deleted = 0 AND date < "), null);
                            if (cuepVar2.h.a()) {
                                ((awlc) cuepVar2.i.b()).d(new Consumer() { // from class: cuen
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void z(Object obj2) {
                                        eksp ekspVar = cuep.a;
                                        ((cmvv) obj2).b(uriBuild);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                            } else {
                                cuepVar2.g.ifPresent(new Consumer() { // from class: cueo
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void z(Object obj2) {
                                        eksp ekspVar = cuep.a;
                                        ((cmvv) ((fcsu) obj2).b()).b(uriBuild);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                        return Consumer$CC.$default$andThen(this, consumer);
                                    }
                                });
                            }
                            ((eksl) cuep.a.n().h("com/google/android/apps/messaging/startup/PhoneAsyncAppCreateStartupTask", "cleanTelephonyRawMessages", 123, "PhoneAsyncAppCreateStartupTask.java")).r("%d raw messages are deleted from Telephony", iDelete);
                        } catch (Exception e) {
                            ((eksl) ((eksl) ((eksl) cuep.a.i()).g(e)).h("com/google/android/apps/messaging/startup/PhoneAsyncAppCreateStartupTask", "cleanTelephonyRawMessages", '}', "PhoneAsyncAppCreateStartupTask.java")).q("cannot remove raw messages");
                        }
                    }
                }, cuepVar.c);
            }
        }, eoscVar);
    }

    @Override // defpackage.cmwz
    public final boolean c() {
        return false;
    }
}
