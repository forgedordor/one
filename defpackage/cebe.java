package defpackage;

import android.content.Context;
import android.os.Build;
import j$.util.Optional;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cebe {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor");
    public final ekgp b;
    public final fcsu c;
    private final Context d;
    private final fcsu e;

    public cebe(Map map, fcsu fcsuVar, Context context, fcsu fcsuVar2) {
        this.d = context;
        this.b = ekgp.j(map);
        this.c = fcsuVar;
        this.e = fcsuVar2;
    }

    private static etse b(Context context, etsf etsfVar) {
        etsk etskVar = (etsk) etsl.a.createBuilder();
        String str = Build.DEVICE;
        etskVar.copyOnWrite();
        etsl etslVar = (etsl) etskVar.instance;
        str.getClass();
        etslVar.b = str;
        String str2 = Build.MANUFACTURER;
        etskVar.copyOnWrite();
        etsl etslVar2 = (etsl) etskVar.instance;
        str2.getClass();
        etslVar2.c = str2;
        etsl etslVar3 = (etsl) etskVar.build();
        etrz etrzVar = (etrz) etsa.a.createBuilder();
        etrzVar.copyOnWrite();
        ((etsa) etrzVar.instance).b = "com.google.android.apps.messaging";
        long jA = dhla.a(context);
        etrzVar.copyOnWrite();
        ((etsa) etrzVar.instance).c = jA;
        etsa etsaVar = (etsa) etrzVar.build();
        etsd etsdVar = (etsd) etse.a.createBuilder();
        etsdVar.copyOnWrite();
        ((etse) etsdVar.instance).d = etsfVar.a();
        etsdVar.copyOnWrite();
        etse etseVar = (etse) etsdVar.instance;
        etslVar3.getClass();
        etseVar.e = etslVar3;
        etseVar.b |= 1;
        etsdVar.a(etsaVar);
        return (etse) etsdVar.build();
    }

    private static String c(String str) {
        try {
            return str.substring(0, 8);
        } catch (StringIndexOutOfBoundsException e) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", "getImsiPrefix", (char) 255, "MobileConfigurationBugleAccessor.java")).q("MobileConfigurationBugleAccessor: failed to obtain imsiPrefix");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(ekgb ekgbVar) {
        ekph ekphVar;
        ekqg ekqgVar;
        String str;
        int i;
        int i2;
        String str2;
        String str3;
        cmmh cmmhVar;
        String str4;
        String str5;
        String strC;
        cebe cebeVar = this;
        ejwl.a(!ekgbVar.isEmpty());
        ekgi ekgiVar = new ekgi();
        etsf etsfVar = etsf.CONFIGURATION_TYPE_RCS_ONBOARDING_FLAGS;
        etsf etsfVar2 = etsf.CONFIGURATION_TYPE_MESSAGES_XMS_CARRIER_CONFIG_FLAGS;
        etsf etsfVar3 = etsf.CONFIGURATION_TYPE_RCS_UPI_POLICY_FLAGS;
        etsf etsfVar4 = etsf.CONFIGURATION_TYPE_RENUMBERINGS_CONFIGURATION_WITH_VERSION;
        ekhx ekhxVarT = ekhx.t(etsfVar, etsfVar2, etsfVar3, etsfVar4);
        ekph ekphVar2 = new ekph(etsfVar4);
        ekqg ekqgVarListIterator = ekhxVarT.listIterator();
        while (true) {
            String str6 = "registerParametersInternal";
            if (!ekqgVarListIterator.hasNext()) {
                break;
            }
            etsf etsfVar5 = (etsf) ekqgVarListIterator.next();
            if (ekphVar2.contains(etsfVar5)) {
                ekgiVar.i(cebg.c(etsfVar5.name(), etsfVar5).d(), b(cebeVar.d, etsfVar5));
            } else {
                int size = ekgbVar.size();
                int i3 = 0;
                while (i3 < size) {
                    String str7 = (String) ekgbVar.get(i3);
                    try {
                        String strD = cebg.c(str7, etsfVar5).d();
                        Context context = cebeVar.d;
                        ekphVar = ekphVar2;
                        try {
                            cmmhVar = (cmmh) ((cmlb) cebeVar.e.b()).j(new dggp(str7)).orElseThrow();
                            str4 = cmmhVar.k;
                            ekqgVar = ekqgVarListIterator;
                            try {
                                str5 = cmmhVar.l;
                                i = size;
                            } catch (NoSuchElementException e) {
                                e = e;
                                str = str6;
                                i = size;
                                i2 = i3;
                                str2 = str7;
                                ekrw ekrwVarJ = a.j();
                                ekrwVarJ.X(eksq.a, "Bugle");
                                str3 = str;
                                ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(e)).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", str3, 121, "MobileConfigurationBugleAccessor.java")).t("MobileConfigurationBugleAccessor: No SimSubscriptionInfo found for simId: %s", cqcv.b(str2));
                                i3 = i2 + 1;
                                cebeVar = this;
                                str6 = str3;
                                ekphVar2 = ekphVar;
                                ekqgVarListIterator = ekqgVar;
                                size = i;
                            }
                        } catch (NoSuchElementException e2) {
                            e = e2;
                            ekqgVar = ekqgVarListIterator;
                            str = str6;
                            i = size;
                            i2 = i3;
                            str2 = str7;
                            ekrw ekrwVarJ2 = a.j();
                            ekrwVarJ2.X(eksq.a, "Bugle");
                            str3 = str;
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2).g(e)).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", str3, 121, "MobileConfigurationBugleAccessor.java")).t("MobileConfigurationBugleAccessor: No SimSubscriptionInfo found for simId: %s", cqcv.b(str2));
                            i3 = i2 + 1;
                            cebeVar = this;
                            str6 = str3;
                            ekphVar2 = ekphVar;
                            ekqgVarListIterator = ekqgVar;
                            size = i;
                        }
                        try {
                            strC = c(cmmhVar.f);
                            i2 = i3;
                        } catch (NoSuchElementException e3) {
                            e = e3;
                            str = str6;
                            i2 = i3;
                            str2 = str7;
                            ekrw ekrwVarJ22 = a.j();
                            ekrwVarJ22.X(eksq.a, "Bugle");
                            str3 = str;
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ22).g(e)).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", str3, 121, "MobileConfigurationBugleAccessor.java")).t("MobileConfigurationBugleAccessor: No SimSubscriptionInfo found for simId: %s", cqcv.b(str2));
                            i3 = i2 + 1;
                            cebeVar = this;
                            str6 = str3;
                            ekphVar2 = ekphVar;
                            ekqgVarListIterator = ekqgVar;
                            size = i;
                        }
                        try {
                            String str8 = cmmhVar.t;
                            boolean z = cmmhVar.o;
                            str2 = str7;
                            try {
                                int i4 = cmmhVar.m;
                                ettn ettnVar = (ettn) etto.a.createBuilder();
                                ettnVar.copyOnWrite();
                                str = str6;
                                try {
                                    etto ettoVar = (etto) ettnVar.instance;
                                    str8.getClass();
                                    ettoVar.d = str8;
                                    ettnVar.copyOnWrite();
                                    etto ettoVar2 = (etto) ettnVar.instance;
                                    str4.getClass();
                                    ettoVar2.b = str4;
                                    ettnVar.copyOnWrite();
                                    etto ettoVar3 = (etto) ettnVar.instance;
                                    str5.getClass();
                                    ettoVar3.c = str5;
                                    ettnVar.copyOnWrite();
                                    ((etto) ettnVar.instance).f = i4;
                                    ettnVar.copyOnWrite();
                                    ((etto) ettnVar.instance).g = z;
                                    if (strC.startsWith(String.valueOf(str4).concat(String.valueOf(str5)))) {
                                        ettnVar.copyOnWrite();
                                        etto ettoVar4 = (etto) ettnVar.instance;
                                        strC.getClass();
                                        ettoVar4.e = strC;
                                    }
                                    String str9 = cmmhVar.p;
                                    ettnVar.copyOnWrite();
                                    etto ettoVar5 = (etto) ettnVar.instance;
                                    str9.getClass();
                                    ettoVar5.h = str9;
                                    etto ettoVar6 = (etto) ettnVar.build();
                                    etsd etsdVar = (etsd) b(context, etsfVar5).toBuilder();
                                    etsdVar.copyOnWrite();
                                    etse etseVar = (etse) etsdVar.instance;
                                    ettoVar6.getClass();
                                    etseVar.f = ettoVar6;
                                    etseVar.b |= 2;
                                    ekgiVar.i(strD, (etse) etsdVar.build());
                                    str3 = str;
                                } catch (NoSuchElementException e4) {
                                    e = e4;
                                    ekrw ekrwVarJ222 = a.j();
                                    ekrwVarJ222.X(eksq.a, "Bugle");
                                    str3 = str;
                                    ((ekrd) ((ekrd) ((ekrd) ekrwVarJ222).g(e)).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", str3, 121, "MobileConfigurationBugleAccessor.java")).t("MobileConfigurationBugleAccessor: No SimSubscriptionInfo found for simId: %s", cqcv.b(str2));
                                    i3 = i2 + 1;
                                    cebeVar = this;
                                    str6 = str3;
                                    ekphVar2 = ekphVar;
                                    ekqgVarListIterator = ekqgVar;
                                    size = i;
                                }
                            } catch (NoSuchElementException e5) {
                                e = e5;
                                str = str6;
                            }
                        } catch (NoSuchElementException e6) {
                            e = e6;
                            str = str6;
                            str2 = str7;
                            ekrw ekrwVarJ2222 = a.j();
                            ekrwVarJ2222.X(eksq.a, "Bugle");
                            str3 = str;
                            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ2222).g(e)).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", str3, 121, "MobileConfigurationBugleAccessor.java")).t("MobileConfigurationBugleAccessor: No SimSubscriptionInfo found for simId: %s", cqcv.b(str2));
                            i3 = i2 + 1;
                            cebeVar = this;
                            str6 = str3;
                            ekphVar2 = ekphVar;
                            ekqgVarListIterator = ekqgVar;
                            size = i;
                        }
                    } catch (NoSuchElementException e7) {
                        e = e7;
                        ekphVar = ekphVar2;
                    }
                    i3 = i2 + 1;
                    cebeVar = this;
                    str6 = str3;
                    ekphVar2 = ekphVar;
                    ekqgVarListIterator = ekqgVar;
                    size = i;
                }
                cebeVar = this;
            }
        }
        fcsu fcsuVar = cebeVar.c;
        if (((Optional) fcsuVar.b()).isEmpty()) {
            ekrw ekrwVarJ3 = a.j();
            ekrwVarJ3.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ3).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", "registerParametersInternal", 129, "MobileConfigurationBugleAccessor.java")).q("MobileConfigurationBugleAccessor: Could not access MobileConfigurationApi");
        } else {
            ekgp ekgpVarC = ekgiVar.c();
            ekrw ekrwVarE = a.e();
            ekrwVarE.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/MobileConfigurationBugleAccessor", "registerParametersInternal", 136, "MobileConfigurationBugleAccessor.java")).t("MobileConfigurationBugleAccessor: Registered configuration: %s", ekgpVarC.keySet());
            ((diff) ((Optional) fcsuVar.b()).get()).d(ekgpVarC);
        }
    }
}
