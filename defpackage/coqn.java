package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class coqn extends cayv {
    public static final eksp a = eksp.c("BugleFileTransfer");
    public static final cczi b = cdag.e(cdag.b, "file_download_failed_handler_max_retry", 3);
    public static final cczi c = cdag.e(cdag.b, "file_download_failed_handler_retry_delay", 2000);
    public final eosc d;
    public final eosc e;
    public final fcsu f;
    public final Optional g;
    public final atnt h;
    public final fcsu i;
    private final cosz j;
    private final fcsu k;

    public coqn(eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, cosz coszVar, Optional optional, fcsu fcsuVar2, atnt atntVar, fcsu fcsuVar3) {
        this.d = eoscVar;
        this.e = eoscVar2;
        this.f = fcsuVar;
        this.j = coszVar;
        this.g = optional;
        this.k = fcsuVar2;
        this.h = atntVar;
        this.i = fcsuVar3;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        if (((Boolean) ((cczi) ateo.a.get()).e()).booleanValue()) {
            return caya.l().a();
        }
        caxz caxzVarL = caya.l();
        caxzVarL.c(((Integer) b.e()).intValue());
        caxzVarL.g(((Integer) c.e()).intValue());
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("FileDownloadFailedHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return coqp.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final coqp coqpVar = (coqp) evuhVar;
        final basd basdVarA = basd.a(coqpVar.c);
        eiju eijuVarI = this.j.a(basdVarA).i(new eooz() { // from class: coqk
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                Optional optional = (Optional) obj;
                if (optional.isEmpty()) {
                    return eijx.e(cbcw.k());
                }
                final MessageCoreData messageCoreData = (MessageCoreData) optional.get();
                if (messageCoreData.cy()) {
                    eksl ekslVar = (eksl) coqn.a.h();
                    ekslVar.X(cqnc.s, messageCoreData.A());
                    ekslVar.X(cqnc.b, messageCoreData.C());
                    ekslVar.X(cqnc.f, messageCoreData.F());
                    ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadFailedHandler", "processPendingWorkItemAsync", 132, "FileDownloadFailedHandler.java")).q("Message has already finished downloading. Skipping failure handler.");
                    return eijx.e(cbcw.i());
                }
                coqp coqpVar2 = coqpVar;
                final coqn coqnVar = this.a;
                if (!((Boolean) ((cczi) ateo.a.get()).e()).booleanValue()) {
                    final elpg elpgVar = coqpVar2.e;
                    if (elpgVar == null) {
                        elpgVar = elpg.b;
                    }
                    final String str = coqpVar2.f;
                    if (messageCoreData.k() == 105) {
                        eksl ekslVar2 = (eksl) coqn.a.h();
                        ekslVar2.X(cqnc.s, messageCoreData.A());
                        ekslVar2.X(cqnc.b, messageCoreData.C());
                        ekslVar2.X(cqnc.f, messageCoreData.F());
                        ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadFailedHandler", "updateMessageFailedInDb", 209, "FileDownloadFailedHandler.java")).q("Message failed in auto download state. Updating message to manual download state.");
                        messageCoreData.bU(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
                    } else {
                        eksl ekslVar3 = (eksl) coqn.a.h();
                        ekslVar3.X(cqnc.s, messageCoreData.A());
                        ekslVar3.X(cqnc.b, messageCoreData.C());
                        ekslVar3.X(cqnc.f, messageCoreData.F());
                        ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadFailedHandler", "updateMessageFailedInDb", 217, "FileDownloadFailedHandler.java")).q("Message failed in manual download state. Updating message to download failed state.");
                        messageCoreData.bU(106);
                    }
                    coqnVar.g.ifPresent(new Consumer() { // from class: coqh
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj2) {
                            eksp ekspVar = coqn.a;
                            MessageCoreData messageCoreData2 = messageCoreData;
                            messageCoreData2.u();
                            messageCoreData2.k();
                            ((cdzq) obj2).a();
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    Callable callable = new Callable() { // from class: coqi
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(((baxe) coqnVar.f.b()).U(messageCoreData));
                        }
                    };
                    eosc eoscVar = coqnVar.e;
                    return eijx.g(callable, eoscVar).h(new ejvr() { // from class: coqj
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj2) {
                            elpg elpgVar2 = elpgVar;
                            cbcu cbcuVarC = cggg.c();
                            emwy emwyVar = elpgVar2.ak;
                            if (emwyVar == null) {
                                emwyVar = emwy.a;
                            }
                            String str2 = str;
                            coqnVar.k(messageCoreData, emwyVar, str2);
                            return cbcw.j(ekgb.r(cbcuVarC));
                        }
                    }, eoscVar);
                }
                elpg elpgVar2 = coqpVar2.e;
                if (elpgVar2 == null) {
                    elpgVar2 = elpg.b;
                }
                emwy emwyVar = elpgVar2.ak;
                if (emwyVar == null) {
                    emwyVar = emwy.a;
                }
                String str2 = coqpVar2.f;
                long jA = messageCoreData.a();
                long jLongValue = ((Long) coqnVar.i.b()).longValue();
                int iA = messageCoreData.a() + 1;
                emwt emwtVar = (emwt) emwyVar.toBuilder();
                emwtVar.copyOnWrite();
                emwy emwyVar2 = (emwy) emwtVar.instance;
                emwyVar2.b |= 16;
                emwyVar2.i = iA;
                if (jA >= jLongValue) {
                    emxb emxbVar = (emxb) emxe.a.createBuilder();
                    emxbVar.copyOnWrite();
                    emxe emxeVar = (emxe) emxbVar.instance;
                    emxeVar.c = 1;
                    emxeVar.b |= 1;
                    emxe emxeVar2 = (emxe) emxbVar.build();
                    emwtVar.copyOnWrite();
                    emwy emwyVar3 = (emwy) emwtVar.instance;
                    emxeVar2.getClass();
                    emwyVar3.h = emxeVar2;
                    emwyVar3.b |= 8;
                }
                coqnVar.k(messageCoreData, (emwy) emwtVar.build(), str2);
                emxe emxeVar3 = ((emwy) emwtVar.instance).h;
                if (emxeVar3 == null) {
                    emxeVar3 = emxe.a;
                }
                eksl ekslVar4 = (eksl) coqn.a.h();
                ekslVar4.X(cqnc.f, messageCoreData.F());
                eksl ekslVar5 = (eksl) ekslVar4.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadFailedHandler", "executeRetryStrategy", 187, "FileDownloadFailedHandler.java");
                int iA2 = emxd.a(emxeVar3.c);
                ekslVar5.I("Executing retry strategy [%s] for failed file download after a delay %d seconds. Attempt count: %d", (iA2 == 0 || iA2 == 1) ? "UNKNOWN_RETRY_TYPE" : iA2 != 2 ? iA2 != 3 ? iA2 != 4 ? "RETRY_AFTER_REGISTRATION_REFRESH" : "RETRY_AFTER_REPROVISIONING" : "RETRY_AFTER_DELAY" : "NO_RETRY", Long.valueOf(emxeVar3.d), Integer.valueOf(iA));
                atnt atntVar = coqnVar.h;
                int iA3 = emxd.a(emxeVar3.c);
                if (iA3 == 0) {
                    iA3 = 1;
                }
                int i = iA3 - 1;
                return (i != 1 ? i != 2 ? i != 3 ? atntVar.c.a(Duration.ZERO, coqnVar) : atntVar.b : atntVar.c.a(Duration.ofSeconds(emxeVar3.d), coqnVar) : atntVar.a).a(messageCoreData).h(new ejvr() { // from class: coqm
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        eksp ekspVar = coqn.a;
                        return cbcw.i();
                    }
                }, coqnVar.d);
            }
        }, this.e);
        return ((Boolean) ((cczi) ateo.a.get()).e()).booleanValue() ? eijuVarI : eijuVarI.f(cond.class, new eooz() { // from class: coql
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cond condVar = (cond) obj;
                eksl ekslVar = (eksl) ((eksl) coqn.a.j()).g(condVar);
                ekslVar.X(cqnc.f, basdVarA);
                ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/transfer/incoming/FileDownloadFailedHandler", "processPendingWorkItemAsync", 158, "FileDownloadFailedHandler.java")).q("Failed to complete file transfer failed processing.");
                return condVar.d().booleanValue() ? eijx.e(cbcw.m()) : eijx.e(cbcw.k());
            }
        }, this.d);
    }

    public final void k(MessageCoreData messageCoreData, final emwy emwyVar, final String str) {
        final coor coorVar = (coor) this.k.b();
        coorVar.b(messageCoreData, "Bugle.Download.Failure.Attachment.Size.Bucket.Rcs");
        coorVar.f(messageCoreData, 7, new Consumer() { // from class: cool
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                elof elofVar = (elof) obj;
                elofVar.copyOnWrite();
                elpg elpgVar = (elpg) elofVar.instance;
                evsy evsyVar = elpg.a;
                emwy emwyVar2 = emwyVar;
                emwyVar2.getClass();
                elpgVar.ak = emwyVar2;
                elpgVar.e |= 4;
                emwq emwqVar = (emwq) emws.a.createBuilder();
                String strA = coor.a(str);
                emwqVar.copyOnWrite();
                emws emwsVar = (emws) emwqVar.instance;
                strA.getClass();
                emwsVar.b |= 2;
                emwsVar.d = strA;
                int iA = emwp.a(((Long) coorVar.c.b()).intValue());
                if (iA == 0) {
                    iA = 1;
                }
                emwqVar.copyOnWrite();
                emws emwsVar2 = (emws) emwqVar.instance;
                emwsVar2.e = iA - 1;
                emwsVar2.b |= 4;
                emws emwsVar3 = (emws) emwqVar.build();
                elofVar.copyOnWrite();
                elpg elpgVar2 = (elpg) elofVar.instance;
                emwsVar3.getClass();
                elpgVar2.aq = emwsVar3;
                elpgVar2.e |= 256;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
