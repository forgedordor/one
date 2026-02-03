package defpackage;

import android.app.NotificationManager;
import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgdh {
    public static final eksp a = eksp.c("BugleNotifications");
    public final fcsu b;
    public final ejxr c;
    private final Context d;

    public cgdh(Context context, fcsu fcsuVar, final fcsu fcsuVar2) {
        this.d = context;
        this.b = fcsuVar;
        this.c = new ejxr() { // from class: cgdg
            @Override // defpackage.ejxr
            public final Object get() {
                eksp ekspVar = cgdh.a;
                cmgk cmgkVar = (cmgk) fcsuVar2.b();
                cmgg cmggVarC = cmgh.c();
                cmggVarC.d(cmfn.NOTIFICATION_METRICS_COUNTERS);
                cmggVarC.f(envp.a);
                return cmgkVar.a(cmggVarC.a());
            }
        };
    }

    public static envi a(envi enviVar, MessageCoreData messageCoreData) {
        boolean z = messageCoreData.cX() || messageCoreData.cY();
        boolean z2 = messageCoreData.cO() || messageCoreData.cQ();
        boolean z3 = messageCoreData.dg() || messageCoreData.di();
        envi enviVar2 = envi.MESSAGE_TYPE_UNKNOWN;
        envi enviVar3 = z ? envi.MESSAGE_TYPE_RCS : enviVar2;
        if (z2) {
            enviVar3 = envi.MESSAGE_TYPE_MMS;
        }
        if (z3) {
            enviVar3 = envi.MESSAGE_TYPE_SMS;
        }
        return (enviVar == enviVar2 || enviVar == enviVar3) ? enviVar3 : envi.MESSAGE_TYPE_HYBRID;
    }

    public static int c(Throwable th) {
        if (th instanceof NullPointerException) {
            return 2;
        }
        if (th instanceof SecurityException) {
            return 3;
        }
        if (th instanceof IllegalArgumentException) {
            return 5;
        }
        if (th instanceof IllegalStateException) {
            return 6;
        }
        return th instanceof RuntimeException ? 4 : 1;
    }

    public final boolean b() {
        NotificationManager notificationManager = (NotificationManager) this.d.getSystemService("notification");
        return (notificationManager == null || !craf.e || notificationManager.getBubblePreference() == 0) ? false : true;
    }

    public final void d(int i) {
        envw envwVar = (envw) envy.a.createBuilder();
        envr envrVar = envr.a;
        envwVar.copyOnWrite();
        envy envyVar = (envy) envwVar.instance;
        envrVar.getClass();
        envyVar.d = envrVar;
        envyVar.c = 3;
        envwVar.copyOnWrite();
        envy envyVar2 = (envy) envwVar.instance;
        envyVar2.g = i - 1;
        envyVar2.b |= 4;
        envy envyVar3 = (envy) envwVar.build();
        aill aillVar = (aill) this.b.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.NOTIFICATION_METRICS_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        envyVar3.getClass();
        ellhVar2.bh = envyVar3;
        ellhVar2.f |= 2048;
        aillVar.j(ellgVar);
    }

    public final void e(int i, Duration duration) {
        f(Optional.empty(), i, duration);
    }

    public final void f(Optional optional, int i, Duration duration) {
        envj envjVar = (envj) envl.a.createBuilder();
        envjVar.copyOnWrite();
        envl envlVar = (envl) envjVar.instance;
        envlVar.c = i - 1;
        envlVar.b |= 1;
        long millis = duration.toMillis();
        envjVar.copyOnWrite();
        envl envlVar2 = (envl) envjVar.instance;
        envlVar2.b |= 2;
        envlVar2.d = millis;
        final envw envwVar = (envw) envy.a.createBuilder();
        boolean zB = b();
        envwVar.copyOnWrite();
        envy envyVar = (envy) envwVar.instance;
        envyVar.b |= 2;
        envyVar.f = zB;
        envl envlVar3 = (envl) envjVar.build();
        envwVar.copyOnWrite();
        envy envyVar2 = (envy) envwVar.instance;
        envlVar3.getClass();
        envyVar2.d = envlVar3;
        envyVar2.c = 5;
        envwVar.copyOnWrite();
        envy envyVar3 = (envy) envwVar.instance;
        envyVar3.g = 1;
        envyVar3.b |= 4;
        optional.ifPresent(new Consumer() { // from class: cgdf
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                envw envwVar2 = envwVar;
                envwVar2.copyOnWrite();
                envy envyVar4 = (envy) envwVar2.instance;
                envy envyVar5 = envy.a;
                envyVar4.e = ((envi) obj).g;
                envyVar4.b |= 1;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        aill aillVar = (aill) this.b.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.NOTIFICATION_METRICS_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        envy envyVar4 = (envy) envwVar.build();
        envyVar4.getClass();
        ellhVar2.bh = envyVar4;
        ellhVar2.f |= 2048;
        aillVar.j(ellgVar);
    }

    public final void g(envi enviVar, int i, int i2, Optional optional) {
        envs envsVar = (envs) envv.a.createBuilder();
        envsVar.copyOnWrite();
        envv envvVar = (envv) envsVar.instance;
        envvVar.c = i - 1;
        envvVar.b |= 1;
        envsVar.copyOnWrite();
        envv envvVar2 = (envv) envsVar.instance;
        envvVar2.d = i2 - 1;
        envvVar2.b |= 2;
        optional.isPresent();
        boolean zBooleanValue = ((Boolean) optional.get()).booleanValue();
        envsVar.copyOnWrite();
        envv envvVar3 = (envv) envsVar.instance;
        envvVar3.b |= 4;
        envvVar3.e = zBooleanValue;
        envw envwVar = (envw) envy.a.createBuilder();
        envwVar.copyOnWrite();
        envy envyVar = (envy) envwVar.instance;
        envyVar.e = enviVar.g;
        envyVar.b |= 1;
        boolean zB = b();
        envwVar.copyOnWrite();
        envy envyVar2 = (envy) envwVar.instance;
        envyVar2.b |= 2;
        envyVar2.f = zB;
        envwVar.copyOnWrite();
        envy envyVar3 = (envy) envwVar.instance;
        envv envvVar4 = (envv) envsVar.build();
        envvVar4.getClass();
        envyVar3.d = envvVar4;
        envyVar3.c = 4;
        envwVar.copyOnWrite();
        envy envyVar4 = (envy) envwVar.instance;
        envyVar4.g = 1;
        envyVar4.b |= 4;
        envy envyVar5 = (envy) envwVar.build();
        aill aillVar = (aill) this.b.b();
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.NOTIFICATION_METRICS_EVENT;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        envyVar5.getClass();
        ellhVar2.bh = envyVar5;
        ellhVar2.f |= 2048;
        aillVar.j(ellgVar);
    }
}
