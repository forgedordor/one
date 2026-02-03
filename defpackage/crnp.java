package defpackage;

import android.app.role.RoleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.provider.Telephony;
import android.telephony.TelephonyManager;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crnp {
    public static final eksp a = eksp.c("Bugle");
    public final Context b;
    public final ejxr c;
    public final ejxr d;
    public final ejxr e;
    private ejxr f;
    private ejxr g;

    public crnp(final Context context) {
        this.b = context;
        context.getClass();
        this.c = ejxx.a(new ejxr() { // from class: crnj
            @Override // defpackage.ejxr
            public final Object get() {
                return context.getPackageManager();
            }
        });
        this.d = ejxx.a(new ejxr() { // from class: crnk
            @Override // defpackage.ejxr
            public final Object get() {
                crnp crnpVar = this.a;
                TelephonyManager telephonyManager = (TelephonyManager) crnpVar.b.getSystemService("phone");
                if (telephonyManager == null) {
                    return null;
                }
                ejxr ejxrVar = crnpVar.c;
                boolean zHasSystemFeature = ((PackageManager) ejxrVar.get()).hasSystemFeature("android.hardware.type.watch");
                boolean zHasSystemFeature2 = ((PackageManager) ejxrVar.get()).hasSystemFeature("android.hardware.telephony");
                if (zHasSystemFeature) {
                    if (!zHasSystemFeature2) {
                        eksl ekslVar = (eksl) crnp.a.h();
                        ekslVar.X(cqnc.S, "PhoneConfiguration");
                        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/util/phone/PhoneConfiguration", "getTelephonyManager", 99, "PhoneConfiguration.java")).q("Watch has non-null TelephonyManager but no FEATURE_TELEPHONY; overriding TelephonyManager to be null");
                        return null;
                    }
                } else if (!zHasSystemFeature2) {
                    eksl ekslVar2 = (eksl) crnp.a.j();
                    ekslVar2.X(cqnc.S, "PhoneConfiguration");
                    ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/util/phone/PhoneConfiguration", "getTelephonyManager", 107, "PhoneConfiguration.java")).q("Phone has non-null TelephonyManager but no FEATURE_TELEPHONY");
                    return telephonyManager;
                }
                return telephonyManager;
            }
        });
        this.e = ejxx.a(new ejxr() { // from class: crnl
            @Override // defpackage.ejxr
            public final Object get() {
                eksp ekspVar = crnp.a;
                if (craf.c) {
                    return abo$$ExternalSyntheticApiModelOutline0.m(context.getSystemService(abo$$ExternalSyntheticApiModelOutline0.m42m()));
                }
                return null;
            }
        });
        this.f = ejxx.b(new ejxr() { // from class: crnm
            @Override // defpackage.ejxr
            public final Object get() {
                eksp ekspVar = crnp.a;
                return Telephony.Sms.getDefaultSmsPackage(context);
            }
        }, Duration.ofMinutes(1L));
        this.g = h();
    }

    private final synchronized ejxr g() {
        return ejxx.b(new ejxr() { // from class: crnn
            @Override // defpackage.ejxr
            public final Object get() {
                return this.a.b();
            }
        }, Duration.ofMinutes(1L));
    }

    private final ejxr h() {
        return ejxx.b(new ejxr() { // from class: crno
            @Override // defpackage.ejxr
            public final Object get() {
                RoleManager roleManagerM = abo$$ExternalSyntheticApiModelOutline0.m(this.a.e.get());
                boolean z = false;
                if (roleManagerM != null && roleManagerM.isRoleHeld("android.app.role.SMS")) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }, Duration.ofMinutes(1L));
    }

    public final synchronized String a() {
        return (String) this.f.get();
    }

    public final synchronized String b() {
        return Telephony.Sms.getDefaultSmsPackage(this.b);
    }

    public final synchronized void c() {
        ((eksl) ((eksl) a.h()).h("com/google/android/apps/messaging/shared/util/phone/PhoneConfiguration", "updateDefaultSmsApp", 183, "PhoneConfiguration.java")).q("Updating default SMS app");
        this.f = g();
        this.g = h();
    }

    public final boolean d() {
        eieu eieuVarK = eiiy.k("PhoneConfiguration#isDefaultSmsApp");
        try {
            boolean zBooleanValue = craf.c ? ((Boolean) this.g.get()).booleanValue() : this.b.getPackageName().equals(a());
            eieuVarK.close();
            return zBooleanValue;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean e() {
        TelephonyManager telephonyManager = (TelephonyManager) this.d.get();
        boolean z = false;
        if (telephonyManager != null && telephonyManager.isSmsCapable()) {
            z = true;
        }
        ekrw ekrwVarN = a.n();
        ekrwVarN.X(cqnc.S, "PhoneConfiguration");
        ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/util/phone/PhoneConfiguration", "isSmsCapable", 123, "PhoneConfiguration.java")).t("isSmsCapable: %b", Boolean.valueOf(z));
        return z;
    }

    public final boolean f() {
        return e() && d();
    }
}
