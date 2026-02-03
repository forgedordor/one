package defpackage;

import android.app.Notification;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdei {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper");
    public static final cczv b = cdag.f(cdag.b, "background_service_duration_seconds", 65);
    public final ains c;
    private final fcsu d;
    private final eosc e;
    private final fcsu f;
    private final apqx g;
    private final eosd h;
    private final fcsu i;
    private final arra j;
    private final cqba k;

    public cdei(fcsu fcsuVar, cqba cqbaVar, fcsu fcsuVar2, ains ainsVar, eosc eoscVar, fcsu fcsuVar3, apqx apqxVar, eosd eosdVar, arra arraVar) {
        this.d = fcsuVar;
        this.k = cqbaVar;
        this.i = fcsuVar2;
        this.c = ainsVar;
        this.e = eoscVar;
        this.f = fcsuVar3;
        this.g = apqxVar;
        this.h = eosdVar;
        this.j = arraVar;
    }

    public static boolean b(int i, int i2) {
        return i == 1 || i2 == 1;
    }

    private final void d(boolean z, boolean z2, boolean z3) {
        if (!z && !z2) {
            if (!z3) {
                return;
            } else {
                z3 = true;
            }
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper", "attachToWakelockOrService", 189, "TickleHandlerHelper.java")).q("Prewarm service starting");
        eieu eieuVarK = eiiy.k("TickleHandlerHelper::backgroundService");
        try {
            eiju eijuVarG = eiju.g(this.h.schedule(new Runnable() { // from class: cdef
                @Override // java.lang.Runnable
                public final void run() {
                    ekrw ekrwVarH2 = cdei.a.h();
                    ekrwVarH2.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ekrwVarH2).h("com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper", "attachToWakelockOrService", 195, "TickleHandlerHelper.java")).q("Prewarm service can finish now");
                }
            }, ((Long) b.e()).longValue(), TimeUnit.SECONDS));
            eieuVarK.b(eijuVarG);
            if (z) {
                try {
                    ((caxe) this.f.b()).b(eijuVarG);
                } catch (Throwable th) {
                    ekrw ekrwVarJ = a.j();
                    ekrwVarJ.X(eksq.a, "BugleNetwork");
                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper", "attachToWakelockOrService", BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED, "TickleHandlerHelper.java")).q("Wakelock or service can't be attached.");
                }
            } else {
                if (z2) {
                    try {
                        ((caxe) this.f.b()).a(eijuVarG);
                    } catch (Throwable th2) {
                        ekrw ekrwVarJ2 = a.j();
                        ekrwVarJ2.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(th2)).h("com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper", "attachToWakelockOrService", 211, "TickleHandlerHelper.java")).q("Unable to attachService.");
                    }
                }
                if (z3) {
                    try {
                        ((caxe) this.f.b()).c(eijuVarG);
                    } catch (Throwable th3) {
                        ekrw ekrwVarJ3 = a.j();
                        ekrwVarJ3.X(eksq.a, "BugleNetwork");
                        ((ekrd) ((ekrd) ((ekrd) ekrwVarJ3).g(th3)).h("com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper", "attachToWakelockOrService", 218, "TickleHandlerHelper.java")).q("Unable to attachWakelock.");
                    }
                }
            }
            eieuVarK.close();
        } catch (Throwable th4) {
            try {
                eieuVarK.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public final eiju a(ejvr ejvrVar, ezol ezolVar, final String str, final String str2) {
        return ((eiju) ejvrVar.apply(ezolVar)).e(Throwable.class, new ejvr() { // from class: cdeg
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekrw ekrwVarI = cdei.a.i();
                ekrwVarI.X(eksq.a, "BugleNetwork");
                ((ekrd) ((ekrd) ((ekrd) ekrwVarI).g((Throwable) obj)).h("com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper", "invokeFunction", 236, "TickleHandlerHelper.java")).t("TickleHandlerHelper: %s", str);
                this.a.c.c(str2);
                return null;
            }
        }, this.e);
    }

    public final void c(String str, final ezol ezolVar, final ejvr ejvrVar, ejvr ejvrVar2, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i) {
        int i2 = i;
        boolean z6 = this.k.a;
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleNetwork");
        ekrd ekrdVar = (ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/fcm/impl/TickleHandlerHelper", "handleNonDittoTickle", 109, "TickleHandlerHelper.java");
        Boolean boolValueOf = Boolean.valueOf(z);
        Boolean boolValueOf2 = Boolean.valueOf(z6);
        String str3 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "SMS" : "RCS_PERSISTENT_BIND_CHANNEL_CONNECTION_ERROR" : "RCS_PERSISTENT_BIND_CHANNEL" : "FCM";
        if (i2 == 0) {
            throw null;
        }
        ekrdVar.K("Handling non-Ditto firebase tickle. Type: [%s], ID: [%s], isHighPriority: [%b], isForeground: [%b], tickleSource: [%s]", str2, str, boolValueOf, boolValueOf2, str3);
        if (((eoth) ((arqw) this.j).a.b()).a("bugle.handle_rcs_bind_channel_tickle_as_foreground")) {
            if (i2 != 2) {
                if (i2 == 3) {
                    i2 = 3;
                }
            }
            a(ejvrVar, ezolVar, "Failed to bind in response to tickle", "Bugle.Fcm.Phone.Bind.Failure.Count");
            if (i2 == 2) {
                d(z3, z4, z5);
                return;
            }
            return;
        }
        if (z6) {
            a(ejvrVar, ezolVar, "Failed to bind in response to tickle", "Bugle.Fcm.Phone.Bind.Failure.Count");
            if (((eoth) ((aovs) this.g).a.b()).a("bugle.enable_service_wakelock_after_message_received")) {
                d(z3, z4, z5);
                return;
            }
            return;
        }
        eiju eijuVarA = a(ejvrVar2, ezolVar, "Failed to pull messages in response to tickle", "Bugle.Fcm.Phone.Pull.Failure.Count");
        if (z2) {
            eijuVarA.i(new eooz() { // from class: cdeh
                @Override // defpackage.eooz
                public final ListenableFuture a(Object obj) {
                    return this.a.a(ejvrVar, ezolVar, "Failed to bind in response to tickle after pulling", "Bugle.Fcm.Phone.BindAfterPull.Failure.Count");
                }
            }, eoqg.a);
            d(z3, z4, z5);
        }
        Notification notificationB = z ? ((cgbn) this.i.b()).b() : null;
        if (notificationB == null) {
            ((egoc) this.d.b()).h(eijuVarA);
            return;
        }
        caxe caxeVar = (caxe) this.f.b();
        ((egoc) this.d.b()).h(eijuVarA);
        caxeVar.e(eijuVarA, notificationB, 12);
    }
}
