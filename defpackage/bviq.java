package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import j$.time.Duration;
import j$.time.Instant;
import j$.time.temporal.Temporal;
import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bviq implements bvio {
    public static final /* synthetic */ int a = 0;
    private static final ekrg b = ekrg.c("com/google/android/apps/messaging/shared/datamodel/ditto/analytics/DittoClearcutLoggerImpl");
    private static final ekhx c = ekhx.s(ewyb.ATTEMPT_TO_LAUNCH_VERIFICATION_PROMPT, ewyb.ATTEMPT_TO_LAUNCH_VERIFICATION_PROMPT_FROM_NOTIFICATION, ewyb.SHOW_VERIFICATION_PROMPT_NOTIFICATION);
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final bvir g;
    private final fcsu h;
    private final eosc i;
    private aill j;
    private final Context k;
    private final AtomicReference l = new AtomicReference();
    private final AtomicReference m = new AtomicReference();
    private int n = -1;
    private int o = -1;
    private ewyy p;
    private final aprp q;
    private final fcsu r;

    public bviq(Context context, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, bvir bvirVar, fcsu fcsuVar4, aprp aprpVar, fcsu fcsuVar5, eosc eoscVar) {
        this.k = context;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = bvirVar;
        this.h = fcsuVar4;
        this.q = aprpVar;
        this.r = fcsuVar5;
        this.i = eoscVar;
    }

    private static String B(String str) {
        int i = elcz.a;
        return elcx.a.c(str, StandardCharsets.UTF_8).toString().substring(0, 32);
    }

    private static void C() {
        ekrw ekrwVarE = b.e();
        ekrwVarE.X(eksq.a, "DittoClearcutLogger");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/datamodel/ditto/analytics/DittoClearcutLoggerImpl", "logClearcutDisabled", 145, "DittoClearcutLoggerImpl.java")).q("Clearcut loggings are disabled.");
    }

    private final void D(ewyp ewypVar, ewxu ewxuVar) {
        AtomicReference atomicReference = this.l;
        Instant instantNow = Instant.now();
        if (atomicReference.get() == null || Duration.between((Temporal) atomicReference.get(), instantNow).compareTo(Duration.ofSeconds(5L)) > 0) {
            Context context = this.k;
            this.n = ceox.a(context);
            this.o = ceox.b(context);
            atomicReference.set(instantNow);
        }
        int i = this.n;
        if (i != -1) {
            if (ewypVar != null) {
                ewypVar.copyOnWrite();
                ewys ewysVar = (ewys) ewypVar.instance;
                ewys ewysVar2 = ewys.a;
                ewysVar.l = i;
            }
            if (ewxuVar != null) {
                int i2 = this.n;
                ewxuVar.copyOnWrite();
                ewxv ewxvVar = (ewxv) ewxuVar.instance;
                ewxv ewxvVar2 = ewxv.a;
                ewxvVar.f = i2;
            }
        }
        int i3 = this.o;
        if (i3 != -1) {
            if (i3 == 0) {
                if (ewypVar != null) {
                    ewypVar.copyOnWrite();
                    ewys ewysVar3 = (ewys) ewypVar.instance;
                    ewys ewysVar4 = ewys.a;
                    ewysVar3.m = ewxt.a(2);
                }
                if (ewxuVar != null) {
                    ewxuVar.copyOnWrite();
                    ewxv ewxvVar3 = (ewxv) ewxuVar.instance;
                    ewxv ewxvVar4 = ewxv.a;
                    ewxvVar3.g = ewxt.a(2);
                    return;
                }
                return;
            }
            if (i3 != 1) {
                if (ewypVar != null) {
                    ewypVar.copyOnWrite();
                    ewys ewysVar5 = (ewys) ewypVar.instance;
                    ewys ewysVar6 = ewys.a;
                    ewysVar5.m = ewxt.a(4);
                }
                if (ewxuVar != null) {
                    ewxuVar.copyOnWrite();
                    ewxv ewxvVar5 = (ewxv) ewxuVar.instance;
                    ewxv ewxvVar6 = ewxv.a;
                    ewxvVar5.g = ewxt.a(4);
                    return;
                }
                return;
            }
            if (ewypVar != null) {
                ewypVar.copyOnWrite();
                ewys ewysVar7 = (ewys) ewypVar.instance;
                ewys ewysVar8 = ewys.a;
                ewysVar7.m = ewxt.a(3);
            }
            if (ewxuVar != null) {
                ewxuVar.copyOnWrite();
                ewxv ewxvVar7 = (ewxv) ewxuVar.instance;
                ewxv ewxvVar8 = ewxv.a;
                ewxvVar7.g = ewxt.a(3);
            }
        }
    }

    private static boolean E(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        cqce cqceVar = cmvy.a;
        if (!alwh.i(str)) {
            return true;
        }
        ekrw ekrwVarJ = b.j();
        ekrwVarJ.X(eksq.a, "DittoClearcutLogger");
        ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/ditto/analytics/DittoClearcutLoggerImpl", "canLogSessionId", 1137, "DittoClearcutLoggerImpl.java")).q("Preventing unexpected logging of sessionId containing email address");
        return false;
    }

    private static ewyz F(int i) {
        ewyz ewyzVar = (ewyz) ewzc.a.createBuilder();
        ewyzVar.copyOnWrite();
        ((ewzc) ewyzVar.instance).e = ewzb.a(i);
        ewyzVar.copyOnWrite();
        ((ewzc) ewyzVar.instance).g = ewza.a(8);
        return ewyzVar;
    }

    private final void G(String str, String str2, int i, int i2, int i3, int i4, String str3, int i5, int i6) {
        H("", str, str2, i, i2, i3, i4, str3, i5, i6, -1);
    }

    private final void H(String str, String str2, String str3, int i, int i2, int i3, int i4, String str4, int i5, int i6, int i7) {
        int i8;
        String str5;
        ewyr ewyrVar;
        if (!this.g.a()) {
            C();
            return;
        }
        int i9 = i2 - 1;
        ewyz ewyzVarF = F(2);
        switch (i9) {
            case 1:
                i8 = 3;
                break;
            case 2:
                i8 = 4;
                break;
            case 3:
                i8 = 5;
                break;
            case 4:
                i8 = 6;
                break;
            case 5:
                i8 = 7;
                break;
            case 6:
                i8 = 8;
                break;
            case 7:
                i8 = 9;
                break;
            case 8:
                i8 = 10;
                break;
            case 9:
                i8 = 11;
                break;
            case 10:
                i8 = 12;
                break;
            case 11:
                i8 = 13;
                break;
            case 12:
            default:
                i8 = 14;
                break;
            case 13:
                i8 = 15;
                break;
            case 14:
                i8 = 16;
                break;
        }
        ewyp ewypVar = (ewyp) ewys.a.createBuilder();
        ewypVar.copyOnWrite();
        ((ewys) ewypVar.instance).c = 1;
        ewypVar.copyOnWrite();
        ((ewys) ewypVar.instance).d = ewyq.a(i8);
        if (i != -1) {
            ewypVar.copyOnWrite();
            ((ewys) ewypVar.instance).b = i;
        }
        if (i3 != -1) {
            ewypVar.copyOnWrite();
            ((ewys) ewypVar.instance).g = i3;
        }
        if (i4 != -1) {
            ewypVar.copyOnWrite();
            ((ewys) ewypVar.instance).i = i4;
        }
        if (!TextUtils.isEmpty(str2)) {
            ewypVar.copyOnWrite();
            ewys ewysVar = (ewys) ewypVar.instance;
            str2.getClass();
            ewysVar.e = str2;
        }
        if (E(str3)) {
            ewypVar.copyOnWrite();
            ewys ewysVar2 = (ewys) ewypVar.instance;
            str3.getClass();
            str5 = str3;
            ewysVar2.f = str5;
        } else {
            str5 = str3;
        }
        if (!TextUtils.isEmpty(str4)) {
            ewypVar.copyOnWrite();
            ewys ewysVar3 = (ewys) ewypVar.instance;
            str4.getClass();
            ewysVar3.h = str4;
        }
        if (!TextUtils.isEmpty(str)) {
            ewypVar.copyOnWrite();
            ewys ewysVar4 = (ewys) ewypVar.instance;
            str.getClass();
            ewysVar4.o = str;
        }
        if (i5 != -1) {
            ewypVar.copyOnWrite();
            ((ewys) ewypVar.instance).j = i5;
        }
        if (i6 != -1) {
            ewypVar.copyOnWrite();
            ((ewys) ewypVar.instance).k = i6;
        }
        try {
            Context context = this.k;
            int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, "com.google.android.ims.binding.SystemBindingService"));
            if (componentEnabledSetting == 1) {
                ewyrVar = ewyr.ENABLED;
            } else {
                if (componentEnabledSetting != 2) {
                    throw new IllegalStateException(a.g(componentEnabledSetting, "Unexpected component state: "));
                }
                ewyrVar = ewyr.DISABLED;
            }
        } catch (IllegalStateException unused) {
            ewyrVar = ewyr.UNKNOWN_STATE;
        }
        ekrw ekrwVarF = b.f();
        ekrwVarF.X(eksq.a, "DittoClearcutLogger");
        ((ekrd) ((ekrd) ekrwVarF).h("com/google/android/apps/messaging/shared/datamodel/ditto/analytics/DittoClearcutLoggerImpl", "logDittoGrpcMessage", 478, "DittoClearcutLoggerImpl.java")).t("System binding state: %s", ewyrVar);
        ewypVar.copyOnWrite();
        ((ewys) ewypVar.instance).n = ewyrVar.a();
        boolean z = !((cqhz) this.r.b()).a();
        ewyzVarF.copyOnWrite();
        ewzc ewzcVar = (ewzc) ewyzVarF.instance;
        ewzc ewzcVar2 = ewzc.a;
        ewzcVar.b |= 2;
        ewzcVar.j = z;
        int i10 = i7 != 0 ? i7 != 1 ? i7 != 2 ? 0 : 4 : 3 : 2;
        if (i10 != 0) {
            ewypVar.copyOnWrite();
            ((ewys) ewypVar.instance).p = i10 - 2;
        }
        D(ewypVar, null);
        ewyzVarF.copyOnWrite();
        ewzc ewzcVar3 = (ewzc) ewyzVarF.instance;
        ewys ewysVar5 = (ewys) ewypVar.build();
        ewysVar5.getClass();
        ewzcVar3.d = ewysVar5;
        ewzcVar3.c = 3;
        A(ewyzVarF, bvir.b(str5));
    }

    private final void I(String str, String str2, int i) {
        int i2 = 5;
        ewyz ewyzVarF = F(5);
        boolean z = !((cqhz) this.r.b()).a();
        ewyzVarF.copyOnWrite();
        ewzc ewzcVar = (ewzc) ewyzVarF.instance;
        ewzc ewzcVar2 = ewzc.a;
        ewzcVar.b |= 2;
        ewzcVar.j = z;
        int i3 = i - 1;
        if (i3 == 2) {
            i2 = 4;
        } else if (i3 != 3) {
            i2 = i3 != 4 ? 7 : 6;
        }
        ewzh ewzhVar = (ewzh) ewzi.a.createBuilder();
        ewzhVar.copyOnWrite();
        ((ewzi) ewzhVar.instance).b = i2 - 2;
        String strB = B(str);
        ewzhVar.copyOnWrite();
        ewzi ewziVar = (ewzi) ewzhVar.instance;
        strB.getClass();
        ewziVar.c = strB;
        ewzhVar.copyOnWrite();
        ewzi ewziVar2 = (ewzi) ewzhVar.instance;
        str2.getClass();
        ewziVar2.d = str2;
        ewzi ewziVar3 = (ewzi) ewzhVar.build();
        ewyzVarF.copyOnWrite();
        ewzc ewzcVar3 = (ewzc) ewyzVarF.instance;
        ewziVar3.getClass();
        ewzcVar3.d = ewziVar3;
        ewzcVar3.c = 6;
        A(ewyzVarF, 2);
    }

    private final void J(ewyb ewybVar, int i, String str, String str2, int i2, Integer num, Integer num2) {
        if (!this.g.a()) {
            C();
            return;
        }
        fcsu fcsuVar = this.r;
        ewyz ewyzVarF = F(14);
        boolean z = !((cqhz) fcsuVar.b()).a();
        ewyzVarF.copyOnWrite();
        ewzc ewzcVar = (ewzc) ewyzVarF.instance;
        ewzc ewzcVar2 = ewzc.a;
        ewzcVar.b |= 2;
        ewzcVar.j = z;
        ewxy ewxyVar = (ewxy) ewyo.a.createBuilder();
        ewxyVar.copyOnWrite();
        ((ewyo) ewxyVar.instance).d = ewybVar.a();
        ewxyVar.copyOnWrite();
        ((ewyo) ewxyVar.instance).e = ewyf.a(i2);
        ewxyVar.copyOnWrite();
        ((ewyo) ewxyVar.instance).f = str;
        ewxyVar.copyOnWrite();
        ((ewyo) ewxyVar.instance).g = str2;
        if (this.q.a()) {
            ewxyVar.copyOnWrite();
            ((ewyo) ewxyVar.instance).h = ewyc.a(i);
        }
        ewxz ewxzVar = (ewxz) ewya.a.createBuilder();
        if (num != null) {
            int iIntValue = num.intValue();
            ewxzVar.copyOnWrite();
            ewya ewyaVar = (ewya) ewxzVar.instance;
            ewyaVar.b |= 1;
            ewyaVar.e = iIntValue;
        }
        if (num2 != null) {
            int iIntValue2 = num2.intValue();
            ewxzVar.copyOnWrite();
            ewya ewyaVar2 = (ewya) ewxzVar.instance;
            ewyaVar2.b |= 2;
            ewyaVar2.f = iIntValue2;
        }
        ewya ewyaVar3 = (ewya) ewxzVar.build();
        int i3 = ewyaVar3.b;
        if ((i3 & 1) != 0 || (i3 & 2) != 0) {
            ewxyVar.copyOnWrite();
            ewyo ewyoVar = (ewyo) ewxyVar.instance;
            ewyaVar3.getClass();
            ewyoVar.c = ewyaVar3;
            ewyoVar.b = 5;
        }
        ewyo ewyoVar2 = (ewyo) ewxyVar.build();
        ewyzVarF.copyOnWrite();
        ewzc ewzcVar3 = (ewzc) ewyzVarF.instance;
        ewyoVar2.getClass();
        ewzcVar3.d = ewyoVar2;
        ewzcVar3.c = 18;
        A(ewyzVarF, 3);
    }

    final void A(ewyz ewyzVar, int i) {
        ewyy ewyyVar;
        bvir bvirVar = this.g;
        if (bvirVar.a()) {
            AtomicReference atomicReference = this.m;
            Instant instantNow = Instant.now();
            if (atomicReference.get() == null || Duration.between((Temporal) atomicReference.get(), instantNow).compareTo(Duration.ofSeconds(5L)) > 0) {
                Intent intentRegisterReceiver = this.k.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    ewyyVar = ewyy.a;
                } else {
                    int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
                    int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
                    int intExtra3 = intentRegisterReceiver.getIntExtra("status", -1);
                    if (intExtra2 == 0) {
                        ewyx ewyxVar = (ewyx) ewyy.a.createBuilder();
                        ewyxVar.copyOnWrite();
                        ((ewyy) ewyxVar.instance).c = intExtra3;
                        ewyyVar = (ewyy) ewyxVar.build();
                    } else {
                        float f = intExtra2;
                        ewyx ewyxVar2 = (ewyx) ewyy.a.createBuilder();
                        ewyxVar2.copyOnWrite();
                        ((ewyy) ewyxVar2.instance).b = (int) ((intExtra / f) * 100.0f);
                        ewyxVar2.copyOnWrite();
                        ((ewyy) ewyxVar2.instance).c = intExtra3;
                        ewyyVar = (ewyy) ewyxVar2.build();
                    }
                }
                this.p = ewyyVar;
                atomicReference.set(instantNow);
            }
            ewyy ewyyVar2 = this.p;
            ewyzVar.copyOnWrite();
            ewzc ewzcVar = (ewzc) ewyzVar.instance;
            ewzc ewzcVar2 = ewzc.a;
            ewyyVar2.getClass();
            ewzcVar.i = ewyyVar2;
            ewzcVar.b |= 1;
            ewzp ewzpVar = (ewzp) ewzq.a.createBuilder();
            ewzpVar.copyOnWrite();
            ewzq ewzqVar = (ewzq) ewzpVar.instance;
            ewzc ewzcVar3 = (ewzc) ewyzVar.build();
            ewzcVar3.getClass();
            ewzqVar.c = ewzcVar3;
            ewzqVar.b |= 1;
            final ewzq ewzqVar2 = (ewzq) ewzpVar.build();
            final dbyl dbylVarC = bvirVar.c(i);
            if (dbylVarC != null) {
                auvh.h(((aisn) this.h.b()).a().h(new ejvr() { // from class: bvip
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        int i2 = bviq.a;
                        if (!((Boolean) obj).booleanValue()) {
                            return null;
                        }
                        dbyk dbykVarJ = dbylVarC.j(ewzqVar2);
                        dbykVarJ.j(-1);
                        dbykVarJ.c();
                        return null;
                    }
                }, this.i));
            }
        }
    }

    @Override // defpackage.bvio
    public final void a() {
        ecem.b();
        bvir bvirVar = this.g;
        boolean zI = ((cqpz) bvirVar.g.b()).i("bugle_enable_analytics", true);
        if (zI) {
            bvirVar.b = (aill) bvirVar.a.b();
            Context context = bvirVar.f;
            List list = dbyl.m;
            bvirVar.c = new dbyi(context, "COMMS_MESSAGES_WEB").c();
            bvirVar.d = dbyl.h(context, "COMMS_MESSAGES_WEB").c();
        }
        bvirVar.e.set(zI);
        if (bvirVar.a()) {
            this.j = bvirVar.b;
        }
    }

    @Override // defpackage.bvio
    public final void b(boolean z, int i) {
        if (!this.g.a()) {
            C();
            return;
        }
        fcsu fcsuVar = this.r;
        ewyz ewyzVarF = F(12);
        boolean z2 = !((cqhz) fcsuVar.b()).a();
        ewyzVarF.copyOnWrite();
        ewzc ewzcVar = (ewzc) ewyzVarF.instance;
        ewzc ewzcVar2 = ewzc.a;
        ewzcVar.b |= 2;
        ewzcVar.j = z2;
        elho elhoVarB = ((aixn) this.e.b()).b(-1);
        exmt exmtVarB = exmt.b(i);
        if (exmtVarB == null) {
            exmtVarB = exmt.UNKNOWN;
        }
        ewxr ewxrVar = (ewxr) ewxs.a.createBuilder();
        ewxrVar.copyOnWrite();
        ewxs ewxsVar = (ewxs) ewxrVar.instance;
        elhoVarB.getClass();
        ewxsVar.e = elhoVarB;
        ewxsVar.b |= 1;
        ewxrVar.copyOnWrite();
        ((ewxs) ewxrVar.instance).c = z;
        ewxrVar.copyOnWrite();
        ((ewxs) ewxrVar.instance).d = exmtVarB.a();
        ewxs ewxsVar2 = (ewxs) ewxrVar.build();
        ewyzVarF.copyOnWrite();
        ewzc ewzcVar3 = (ewzc) ewyzVarF.instance;
        ewxsVar2.getClass();
        ewzcVar3.d = ewxsVar2;
        ewzcVar3.c = 16;
        A(ewyzVarF, 4);
    }

    @Override // defpackage.bvio
    public final void c(String str, String str2) {
        if (this.g.a()) {
            I(str, str2, 6);
        } else {
            C();
        }
    }

    @Override // defpackage.bvio
    public final void d(int i) {
        H("", "", "", -1, 15, -1, -1, "", -1, -1, i);
    }

    @Override // defpackage.bvio
    public final void e(String str, int i, int i2) {
        G("", "", -1, 7, -1, -1, str, i, i2);
    }

    @Override // defpackage.bvio
    public final void f(String str, String str2, int i, int i2, String str3) {
        g(str, str2, i, i2, -1, str3);
    }

    @Override // defpackage.bvio
    public final void g(String str, String str2, int i, int i2, int i3, String str3) {
        G(str, str2, i, 4, i2, i3, str3, -1, -1);
    }

    @Override // defpackage.bvio
    public final void h(String str, String str2, int i, String str3, int i2) {
        H("", str, str2, i, 8, i2, -1, str3, -1, -1, -1);
    }

    @Override // defpackage.bvio
    public final void i(String str, String str2, String str3, int i, String str4, int i2) {
        H(str, str2, str3, i, 8, i2, -1, str4, -1, -1, -1);
    }

    @Override // defpackage.bvio
    public final void j(String str, String str2, String str3, int i, int i2, int i3, String str4) {
        H(str, str2, str3, i, 4, i2, i3, str4, -1, -1, -1);
    }

    @Override // defpackage.bvio
    public final void k(String str, String str2, int i, String str3) {
        G(str, str2, i, 2, -1, -1, str3, -1, -1);
    }

    @Override // defpackage.bvio
    public final void l(String str, String str2, int i, String str3) {
        G(str, str2, i, 3, -1, -1, str3, -1, -1);
    }

    @Override // defpackage.bvio
    public final void m(String str, String str2, int i, String str3, int i2) {
        G(str, str2, i, 6, i2, -1, str3, -1, -1);
    }

    @Override // defpackage.bvio
    public final void n(String str, String str2, int i, String str3) {
        G(str, str2, i, 5, -1, -1, str3, -1, -1);
    }

    @Override // defpackage.bvio
    public final void o(String str, String str2) {
        if (this.g.a()) {
            I(str, str2, 4);
        } else {
            C();
        }
    }

    @Override // defpackage.bvio
    public final void p(String str) {
        if (!this.g.a()) {
            C();
            return;
        }
        I(str, (String) Optional.ofNullable(((crqv) this.d.b()).f("tachyon_registration_id", "")).orElse(""), 3);
        ekrw ekrwVarH = b.h();
        ekrwVarH.X(eksq.a, "DittoClearcutLogger");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/datamodel/ditto/analytics/DittoClearcutLoggerImpl", "logDittoQrCodeScannedEvent", 719, "DittoClearcutLoggerImpl.java")).t("Scanned QR code. hash: %s", B(str));
    }

    @Override // defpackage.bvio
    public final void q(elxr elxrVar, exmt exmtVar, boolean z, int i) throws NumberFormatException {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!this.g.a()) {
            C();
            return;
        }
        Optional optionalOfNullable = Optional.ofNullable(((crqv) this.d.b()).f("tachyon_registration_id", ""));
        elhn elhnVarA = ((aixn) this.e.b()).a(-1);
        elhnVarA.copyOnWrite();
        elho elhoVar = (elho) elhnVarA.instance;
        evsy evsyVar = elho.a;
        elhoVar.c &= -5;
        elhoVar.f = false;
        elho elhoVar2 = (elho) elhnVarA.build();
        boolean z2 = i == 2 || i == 5;
        if (z2) {
            ewyz ewyzVarF = F(8);
            boolean z3 = !((cqhz) this.r.b()).a();
            ewyzVarF.copyOnWrite();
            i2 = -1;
            ewzc ewzcVar = (ewzc) ewyzVarF.instance;
            ewzc ewzcVar2 = ewzc.a;
            ewzcVar.b |= 2;
            ewzcVar.j = z3;
            int iOrdinal = elxrVar.ordinal();
            if (iOrdinal == 0) {
                i4 = 2;
            } else if (iOrdinal == 1) {
                i4 = 3;
            } else if (iOrdinal == 2) {
                i4 = 4;
            } else if (iOrdinal == 3) {
                i4 = 5;
            } else {
                if (iOrdinal != 4) {
                    throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(elxrVar))));
                }
                i4 = 6;
            }
            int i6 = i - 1;
            ewxu ewxuVar = (ewxu) ewxv.a.createBuilder();
            String str = (String) optionalOfNullable.orElse("");
            ewxuVar.copyOnWrite();
            ewxv ewxvVar = (ewxv) ewxuVar.instance;
            str.getClass();
            ewxvVar.c = str;
            ewxuVar.copyOnWrite();
            ((ewxv) ewxuVar.instance).d = i4 - 2;
            int i7 = z ? 4 : 3;
            ewxuVar.copyOnWrite();
            ((ewxv) ewxuVar.instance).e = i7 - 2;
            if (i6 == 1) {
                i3 = 3;
                i5 = 3;
            } else if (i6 != 2) {
                i3 = 3;
                i5 = i6 != 3 ? 6 : 5;
            } else {
                i3 = 3;
                i5 = 4;
            }
            ewxuVar.copyOnWrite();
            ((ewxv) ewxuVar.instance).j = i5 - 2;
            ewxuVar.copyOnWrite();
            ewxv ewxvVar2 = (ewxv) ewxuVar.instance;
            elhoVar2.getClass();
            ewxvVar2.i = elhoVar2;
            ewxvVar2.b |= 1;
            D(null, ewxuVar);
            ewxuVar.copyOnWrite();
            ((ewxv) ewxuVar.instance).h = exmtVar.a();
            ewxv ewxvVar3 = (ewxv) ewxuVar.build();
            ewyzVarF.copyOnWrite();
            ewzc ewzcVar3 = (ewzc) ewyzVarF.instance;
            ewxvVar3.getClass();
            ewzcVar3.d = ewxvVar3;
            ewzcVar3.c = 9;
            A(ewyzVarF, i == 5 ? i3 : i == 2 ? 2 : 1);
        } else {
            i2 = -1;
            i3 = 3;
        }
        if (!z2) {
            int i8 = i - 1;
            ellg ellgVar = (ellg) ellh.a.createBuilder();
            ellf ellfVar = ellf.DITTO_BINDING_STATUS;
            ellgVar.copyOnWrite();
            ellh ellhVar = (ellh) ellgVar.instance;
            ellhVar.j = ellfVar.f11do;
            ellhVar.b |= 1;
            elxs elxsVar = (elxs) elxu.a.createBuilder();
            String str2 = (String) optionalOfNullable.orElse("");
            elxsVar.copyOnWrite();
            elxu elxuVar = (elxu) elxsVar.instance;
            str2.getClass();
            elxuVar.b |= 1;
            elxuVar.c = str2;
            elxsVar.copyOnWrite();
            elxu elxuVar2 = (elxu) elxsVar.instance;
            elxuVar2.d = elxrVar.f;
            elxuVar2.b |= 2;
            int i9 = true != z ? 2 : i3;
            elxsVar.copyOnWrite();
            elxu elxuVar3 = (elxu) elxsVar.instance;
            elxuVar3.e = i9 - 1;
            elxuVar3.b |= 4;
            AtomicReference atomicReference = this.l;
            Instant instantNow = Instant.now();
            if (atomicReference.get() == null || Duration.between((Temporal) atomicReference.get(), instantNow).compareTo(Duration.ofSeconds(5L)) > 0) {
                Context context = this.k;
                this.n = ceox.a(context);
                this.o = ceox.b(context);
                atomicReference.set(instantNow);
            }
            int i10 = this.n;
            int i11 = i2;
            if (i10 != i11) {
                elxsVar.copyOnWrite();
                elxu elxuVar4 = (elxu) elxsVar.instance;
                elxuVar4.b |= 8;
                elxuVar4.f = i10;
            }
            int i12 = this.o;
            if (i12 != i11) {
                if (i12 == 0) {
                    elxsVar.copyOnWrite();
                    elxu elxuVar5 = (elxu) elxsVar.instance;
                    elxuVar5.g = 0;
                    elxuVar5.b |= 16;
                } else if (i12 != 1) {
                    elxsVar.copyOnWrite();
                    elxu elxuVar6 = (elxu) elxsVar.instance;
                    elxuVar6.g = 2;
                    elxuVar6.b |= 16;
                } else {
                    elxsVar.copyOnWrite();
                    elxu elxuVar7 = (elxu) elxsVar.instance;
                    elxuVar7.g = 1;
                    elxuVar7.b |= 16;
                }
            }
            elxsVar.copyOnWrite();
            elxu elxuVar8 = (elxu) elxsVar.instance;
            elxuVar8.h = exmtVar.a();
            elxuVar8.b |= 32;
            elxsVar.copyOnWrite();
            elxu elxuVar9 = (elxu) elxsVar.instance;
            elhoVar2.getClass();
            elxuVar9.i = elhoVar2;
            elxuVar9.b |= 64;
            elxsVar.copyOnWrite();
            elxu elxuVar10 = (elxu) elxsVar.instance;
            elxuVar10.j = i8;
            elxuVar10.b |= 128;
            elxu elxuVar11 = (elxu) elxsVar.build();
            ellgVar.copyOnWrite();
            ellh ellhVar2 = (ellh) ellgVar.instance;
            elxuVar11.getClass();
            ellhVar2.ad = elxuVar11;
            ellhVar2.c |= Integer.MIN_VALUE;
            this.j.j(ellgVar);
        }
        ekrw ekrwVarF = b.f();
        ekrwVarF.X(eksq.a, "DittoClearcutLogger");
        ((ekrd) ((ekrd) ekrwVarF).h("com/google/android/apps/messaging/shared/datamodel/ditto/analytics/DittoClearcutLoggerImpl", "logDittoBindingStatusEvent", 699, "DittoClearcutLoggerImpl.java")).t("Binding status: %s", elxrVar);
    }

    @Override // defpackage.bvio
    public final void r(String str, int i) {
        int i2;
        if (!this.g.a()) {
            C();
            return;
        }
        fcsu fcsuVar = this.r;
        ewyz ewyzVarF = F(4);
        boolean z = !((cqhz) fcsuVar.b()).a();
        ewyzVarF.copyOnWrite();
        ewzc ewzcVar = (ewzc) ewyzVarF.instance;
        ewzc ewzcVar2 = ewzc.a;
        ewzcVar.b |= 2;
        ewzcVar.j = z;
        int i3 = i - 1;
        if (i3 != 25) {
            switch (i3) {
                case 10:
                    i2 = 12;
                    break;
                case 11:
                    i2 = 13;
                    break;
                case 12:
                    i2 = 14;
                    break;
                case 13:
                    i2 = 15;
                    break;
                case 14:
                    i2 = 16;
                    break;
                case 15:
                    i2 = 17;
                    break;
                case 16:
                    i2 = 18;
                    break;
                case 17:
                    i2 = 19;
                    break;
                case 18:
                    i2 = 20;
                    break;
                case 19:
                    i2 = 21;
                    break;
                case 20:
                    i2 = 22;
                    break;
                case 21:
                    i2 = 23;
                    break;
                case 22:
                    i2 = 24;
                    break;
                default:
                    throw new IllegalArgumentException("unknown enum value: ".concat(Integer.toString(i3)));
            }
        } else {
            i2 = 27;
        }
        ewzl ewzlVar = (ewzl) ewzm.a.createBuilder();
        ewzlVar.copyOnWrite();
        ((ewzm) ewzlVar.instance).c = 6;
        ewzlVar.copyOnWrite();
        ((ewzm) ewzlVar.instance).d = i2 - 2;
        if (E(str)) {
            ewzlVar.copyOnWrite();
            ewzm ewzmVar = (ewzm) ewzlVar.instance;
            str.getClass();
            ewzmVar.b = str;
        }
        ewzm ewzmVar2 = (ewzm) ewzlVar.build();
        ewyzVarF.copyOnWrite();
        ewzc ewzcVar3 = (ewzc) ewyzVarF.instance;
        ewzmVar2.getClass();
        ewzcVar3.d = ewzmVar2;
        ewzcVar3.c = 5;
        A(ewyzVarF, bvir.b(str));
    }

    @Override // defpackage.bvio
    public final void s(ewyb ewybVar, int i, String str, String str2, Integer num, Integer num2) {
        J(ewybVar, i, str, str2, 3, num, num2);
    }

    @Override // defpackage.bvio
    public final void t(ewyb ewybVar, int i, String str, String str2, epnh epnhVar, exmt exmtVar) {
        if (!this.g.a()) {
            C();
            return;
        }
        fcsu fcsuVar = this.r;
        ewyz ewyzVarF = F(14);
        boolean z = !((cqhz) fcsuVar.b()).a();
        ewyzVarF.copyOnWrite();
        ewzc ewzcVar = (ewzc) ewyzVarF.instance;
        ewzc ewzcVar2 = ewzc.a;
        ewzcVar.b |= 2;
        ewzcVar.j = z;
        ewxz ewxzVar = (ewxz) ewya.a.createBuilder();
        ewxzVar.copyOnWrite();
        ((ewya) ewxzVar.instance).c = exmtVar.a();
        ewxzVar.copyOnWrite();
        ((ewya) ewxzVar.instance).d = epnhVar.a();
        ewya ewyaVar = (ewya) ewxzVar.build();
        ewxy ewxyVar = (ewxy) ewyo.a.createBuilder();
        ewxyVar.copyOnWrite();
        ((ewyo) ewxyVar.instance).d = ewybVar.a();
        ewxyVar.copyOnWrite();
        ((ewyo) ewxyVar.instance).e = ewyf.a(6);
        ewxyVar.copyOnWrite();
        ewyo ewyoVar = (ewyo) ewxyVar.instance;
        str.getClass();
        ewyoVar.f = str;
        ewxyVar.copyOnWrite();
        ((ewyo) ewxyVar.instance).g = str2;
        ewxyVar.copyOnWrite();
        ewyo ewyoVar2 = (ewyo) ewxyVar.instance;
        ewyaVar.getClass();
        ewyoVar2.c = ewyaVar;
        ewyoVar2.b = 5;
        if (this.q.a()) {
            ewxyVar.copyOnWrite();
            ((ewyo) ewxyVar.instance).h = ewyc.a(i);
        }
        ewyo ewyoVar3 = (ewyo) ewxyVar.build();
        ewyzVarF.copyOnWrite();
        ewzc ewzcVar3 = (ewzc) ewyzVarF.instance;
        ewyoVar3.getClass();
        ewzcVar3.d = ewyoVar3;
        ewzcVar3.c = 18;
        A(ewyzVarF, 3);
    }

    @Override // defpackage.bvio
    public final void u(ewyb ewybVar, int i, String str, String str2, Integer num, Integer num2) {
        J(ewybVar, i, str, str2, 4, num, num2);
    }

    @Override // defpackage.bvio
    public final void v(int i, String str, int i2) {
        if (!this.g.a()) {
            C();
            return;
        }
        fcsu fcsuVar = this.r;
        ewyz ewyzVarF = F(14);
        boolean z = !((cqhz) fcsuVar.b()).a();
        ewyzVarF.copyOnWrite();
        ewzc ewzcVar = (ewzc) ewyzVarF.instance;
        ewzc ewzcVar2 = ewzc.a;
        ewzcVar.b |= 2;
        ewzcVar.j = z;
        ewxy ewxyVar = (ewxy) ewyo.a.createBuilder();
        ewyb ewybVar = ewyb.VERIFICATION_PROMPT_CLOSED;
        ewxyVar.copyOnWrite();
        ((ewyo) ewxyVar.instance).d = ewybVar.a();
        ewxyVar.copyOnWrite();
        ((ewyo) ewxyVar.instance).e = ewyf.a(5);
        ewxyVar.copyOnWrite();
        ewyo ewyoVar = (ewyo) ewxyVar.instance;
        str.getClass();
        ewyoVar.g = str;
        ewyi ewyiVar = (ewyi) ewyj.a.createBuilder();
        ewyiVar.copyOnWrite();
        ((ewyj) ewyiVar.instance).b = i2 - 2;
        ewyj ewyjVar = (ewyj) ewyiVar.build();
        ewxyVar.copyOnWrite();
        ewyo ewyoVar2 = (ewyo) ewxyVar.instance;
        ewyjVar.getClass();
        ewyoVar2.c = ewyjVar;
        ewyoVar2.b = 10;
        if (this.q.a()) {
            ewxyVar.copyOnWrite();
            ((ewyo) ewxyVar.instance).h = ewyc.a(i);
        }
        ewyo ewyoVar3 = (ewyo) ewxyVar.build();
        ewyzVarF.copyOnWrite();
        ewzc ewzcVar3 = (ewzc) ewyzVarF.instance;
        ewyoVar3.getClass();
        ewzcVar3.d = ewyoVar3;
        ewzcVar3.c = 18;
        A(ewyzVarF, 3);
    }

    @Override // defpackage.bvio
    public final void w(int i, String str, ewyb ewybVar) {
        if (!this.g.a()) {
            C();
            return;
        }
        if (!c.contains(ewybVar)) {
            ekrw ekrwVarJ = b.j();
            ekrwVarJ.X(eksq.a, "DittoClearcutLogger");
            ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/ditto/analytics/DittoClearcutLoggerImpl", "logGaiaPairingVerificationPromptEvent", 1057, "DittoClearcutLoggerImpl.java")).q("This is not a verificationPromptEvent, skip logging");
            return;
        }
        fcsu fcsuVar = this.r;
        ewyz ewyzVarF = F(14);
        boolean z = !((cqhz) fcsuVar.b()).a();
        ewyzVarF.copyOnWrite();
        ewzc ewzcVar = (ewzc) ewyzVarF.instance;
        ewzc ewzcVar2 = ewzc.a;
        ewzcVar.b |= 2;
        ewzcVar.j = z;
        ewxy ewxyVar = (ewxy) ewyo.a.createBuilder();
        ewxyVar.copyOnWrite();
        ((ewyo) ewxyVar.instance).d = ewybVar.a();
        ewxyVar.copyOnWrite();
        ((ewyo) ewxyVar.instance).e = ewyf.a(5);
        ewxyVar.copyOnWrite();
        ewyo ewyoVar = (ewyo) ewxyVar.instance;
        str.getClass();
        ewyoVar.g = str;
        if (this.q.a()) {
            ewxyVar.copyOnWrite();
            ((ewyo) ewxyVar.instance).h = ewyc.a(i);
        }
        ewyo ewyoVar2 = (ewyo) ewxyVar.build();
        ewyzVarF.copyOnWrite();
        ewzc ewzcVar3 = (ewzc) ewyzVarF.instance;
        ewyoVar2.getClass();
        ewzcVar3.d = ewyoVar2;
        ewzcVar3.c = 18;
        A(ewyzVarF, 3);
    }

    @Override // defpackage.bvio
    public final void x(int i, String str, int i2) {
        if (!this.g.a()) {
            C();
            return;
        }
        fcsu fcsuVar = this.r;
        ewyz ewyzVarF = F(14);
        boolean z = !((cqhz) fcsuVar.b()).a();
        ewyzVarF.copyOnWrite();
        ewzc ewzcVar = (ewzc) ewyzVarF.instance;
        ewzc ewzcVar2 = ewzc.a;
        ewzcVar.b |= 2;
        ewzcVar.j = z;
        ewxy ewxyVar = (ewxy) ewyo.a.createBuilder();
        ewyb ewybVar = ewyb.VERIFICATION_PROMPT_LAUNCHED;
        ewxyVar.copyOnWrite();
        ((ewyo) ewxyVar.instance).d = ewybVar.a();
        ewxyVar.copyOnWrite();
        ((ewyo) ewxyVar.instance).e = ewyf.a(5);
        ewxyVar.copyOnWrite();
        ewyo ewyoVar = (ewyo) ewxyVar.instance;
        str.getClass();
        ewyoVar.g = str;
        ewyk ewykVar = (ewyk) ewyl.a.createBuilder();
        ewykVar.copyOnWrite();
        ewyl ewylVar = (ewyl) ewykVar.instance;
        if (i2 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        ewylVar.b = i2 - 2;
        ewyl ewylVar2 = (ewyl) ewykVar.build();
        ewxyVar.copyOnWrite();
        ewyo ewyoVar2 = (ewyo) ewxyVar.instance;
        ewylVar2.getClass();
        ewyoVar2.c = ewylVar2;
        ewyoVar2.b = 9;
        if (this.q.a()) {
            ewxyVar.copyOnWrite();
            ((ewyo) ewxyVar.instance).h = ewyc.a(i);
        }
        ewyo ewyoVar3 = (ewyo) ewxyVar.build();
        ewyzVarF.copyOnWrite();
        ewzc ewzcVar3 = (ewzc) ewyzVarF.instance;
        ewyoVar3.getClass();
        ewzcVar3.d = ewyoVar3;
        ewzcVar3.c = 18;
        A(ewyzVarF, 3);
    }

    @Override // defpackage.bvio
    public final void y(int i, String str, Integer num) {
        if (!this.g.a()) {
            C();
            return;
        }
        fcsu fcsuVar = this.r;
        ewyz ewyzVarF = F(14);
        boolean z = !((cqhz) fcsuVar.b()).a();
        ewyzVarF.copyOnWrite();
        ewzc ewzcVar = (ewzc) ewyzVarF.instance;
        ewzc ewzcVar2 = ewzc.a;
        ewzcVar.b |= 2;
        ewzcVar.j = z;
        ewym ewymVar = (ewym) ewyn.a.createBuilder();
        ewymVar.copyOnWrite();
        ewyn ewynVar = (ewyn) ewymVar.instance;
        str.getClass();
        ewynVar.c = str;
        int iIntValue = num.intValue();
        ewymVar.copyOnWrite();
        ewyn ewynVar2 = (ewyn) ewymVar.instance;
        ewynVar2.b |= 1;
        ewynVar2.d = iIntValue;
        ewxy ewxyVar = (ewxy) ewyo.a.createBuilder();
        ewyb ewybVar = ewyb.WRONG_EMOJI_CODE;
        ewxyVar.copyOnWrite();
        ((ewyo) ewxyVar.instance).d = ewybVar.a();
        ewxyVar.copyOnWrite();
        ((ewyo) ewxyVar.instance).e = ewyf.a(5);
        ewyn ewynVar3 = (ewyn) ewymVar.build();
        ewxyVar.copyOnWrite();
        ewyo ewyoVar = (ewyo) ewxyVar.instance;
        ewynVar3.getClass();
        ewyoVar.c = ewynVar3;
        ewyoVar.b = 8;
        if (this.q.a()) {
            ewxyVar.copyOnWrite();
            ((ewyo) ewxyVar.instance).h = ewyc.a(i);
        }
        ewyo ewyoVar2 = (ewyo) ewxyVar.build();
        ewyzVarF.copyOnWrite();
        ewzc ewzcVar3 = (ewzc) ewyzVarF.instance;
        ewyoVar2.getClass();
        ewzcVar3.d = ewyoVar2;
        ewzcVar3.c = 18;
        A(ewyzVarF, 3);
    }

    @Override // defpackage.bvio
    public final void z(int i, int i2, int i3) {
        if (!this.g.a()) {
            C();
            return;
        }
        ellg ellgVar = (ellg) ellh.a.createBuilder();
        ellf ellfVar = ellf.BUGLE_TABLET_MODE_SWITCH;
        ellgVar.copyOnWrite();
        ellh ellhVar = (ellh) ellgVar.instance;
        ellhVar.j = ellfVar.f11do;
        ellhVar.b |= 1;
        eltt elttVar = (eltt) eltw.a.createBuilder();
        elttVar.copyOnWrite();
        eltw eltwVar = (eltw) elttVar.instance;
        eltwVar.c = i - 1;
        eltwVar.b |= 1;
        elttVar.copyOnWrite();
        eltw eltwVar2 = (eltw) elttVar.instance;
        eltwVar2.d = i2 - 1;
        eltwVar2.b |= 2;
        elttVar.copyOnWrite();
        eltw eltwVar3 = (eltw) elttVar.instance;
        eltwVar3.b |= 4;
        eltwVar3.e = i3;
        boolean zE = ((crnp) this.f.b()).e();
        elttVar.copyOnWrite();
        eltw eltwVar4 = (eltw) elttVar.instance;
        eltwVar4.b |= 8;
        eltwVar4.f = zE;
        eltw eltwVar5 = (eltw) elttVar.build();
        ellgVar.copyOnWrite();
        ellh ellhVar2 = (ellh) ellgVar.instance;
        eltwVar5.getClass();
        ellhVar2.aM = eltwVar5;
        ellhVar2.e |= 65536;
        this.j.j(ellgVar);
    }
}
