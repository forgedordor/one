package defpackage;

import android.service.notification.StatusBarNotification;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgqd {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSettingsStore");
    public final eosc b;
    public final cmfo c;
    private final fcsu d;
    private final cglm e;
    private final eosc f;

    public cgqd(eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, fcsu fcsuVar2, cglm cglmVar) {
        this.f = eoscVar;
        this.b = eoscVar2;
        cmgk cmgkVar = (cmgk) fcsuVar.b();
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.INCOMING_MESSAGE_NOTIFICATION_SETTINGS);
        cmggVarC.f(cgqg.a);
        this.c = cmgkVar.a(cmggVarC.a());
        this.d = fcsuVar2;
        this.e = cglmVar;
    }

    public final eiju a() {
        return ((cgoh) this.d.b()).a((List) Collection.EL.stream(this.e.c(cglf.NT_INCOMING_MESSAGE)).filter(new cgli()).map(new Function() { // from class: cglj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((StatusBarNotification) obj).getNotification().extras;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.toCollection(new cglh()))).a().h(new ejvr() { // from class: cgqa
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                final cgpd cgpdVar = (cgpd) obj;
                return (cgqg) this.a.c.m(new ejvr() { // from class: cgpx
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        cgqe cgqeVar = (cgqe) cgqg.a.createBuilder();
                        cgqeVar.copyOnWrite();
                        cgqg cgqgVar = (cgqg) cgqeVar.instance;
                        cgpd cgpdVar2 = cgpdVar;
                        cgpdVar2.getClass();
                        cgqgVar.c = cgpdVar2;
                        cgqgVar.b |= 1;
                        return (cgqg) cgqeVar.build();
                    }
                });
            }
        }, this.f).e(evtj.class, new ejvr() { // from class: cgqb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrw ekrwVarJ = cgqd.a.j();
                ekrwVarJ.X(eksq.a, "BugleNotifications");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g((evtj) obj)).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSettingsStore", "saveNotificationState", 131, "IncomingMessageSettingsStore.java")).q("Error updating data from incoming message settings store");
                return cgqg.a;
            }
        }, this.b).h(new ejvr() { // from class: cgqc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrw ekrwVarH = cgqd.a.h();
                ekrwVarH.X(eksq.a, "BugleNotifications");
                ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/notification2o/incomingmessage/IncomingMessageSettingsStore", "saveNotificationState", 138, "IncomingMessageSettingsStore.java")).q("Saved current notification state");
                return null;
            }
        }, eoqg.a);
    }
}
