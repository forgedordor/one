package defpackage;

import android.os.StrictMode;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzni implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ dznj a;
    private final Thread.UncaughtExceptionHandler b;

    public dzni(dznj dznjVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = dznjVar;
        this.b = uncaughtExceptionHandler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        eiix eiixVarA;
        dzol dzolVarA;
        eiix eiixVarA2;
        int i;
        fehw fehwVar;
        int i2;
        Iterator it;
        eoik eoikVar;
        dznp dznpVar;
        try {
            try {
                dznj dznjVar = this.a;
                String name = thread.getName();
                StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                dznd dzndVar = dznjVar.g;
                feho fehoVarA = dzndVar.a(dznjVar.a);
                String name2 = th.getClass().getName();
                for (Throwable cause = th.getCause(); cause != null && cause != cause.getCause(); cause = cause.getCause()) {
                    name2 = cause.getClass().getName();
                }
                int i3 = 1;
                eoii eoiiVarA = eoli.a(th, true);
                Iterator it2 = ((Set) dzndVar.a.b()).iterator();
                while (it2.hasNext()) {
                    dznp dznpVar2 = (dznp) it2.next();
                    int i4 = i3;
                    eoih eoihVar = ((eoin) eoiiVarA.instance).e;
                    if (eoihVar == null) {
                        eoihVar = eoih.a;
                    }
                    if ((eoihVar.b & 2) != 0) {
                        String str = eoihVar.d;
                        String strA = dznpVar2.a();
                        if (!str.equals(strA)) {
                            eoie eoieVar = (eoie) eoihVar.toBuilder();
                            eoieVar.copyOnWrite();
                            eoih eoihVar2 = (eoih) eoieVar.instance;
                            strA.getClass();
                            eoihVar2.b |= 2;
                            eoihVar2.d = strA;
                            eoih eoihVar3 = (eoih) eoieVar.build();
                            eoiiVarA.copyOnWrite();
                            eoin eoinVar = (eoin) eoiiVarA.instance;
                            eoihVar3.getClass();
                            eoinVar.e = eoihVar3;
                            eoinVar.b |= 1;
                        }
                    }
                    eoin eoinVar2 = (eoin) eoiiVarA.instance;
                    if (eoinVar2.c == 4) {
                        eoik eoikVar2 = (eoik) eoinVar2.d;
                        eoij eoijVar = null;
                        int i5 = 0;
                        while (i5 < eoikVar2.b.size()) {
                            eoim eoimVar = (eoim) eoikVar2.b.get(i5);
                            eoih eoihVar4 = eoimVar.c;
                            if (eoihVar4 == null) {
                                eoihVar4 = eoih.a;
                            }
                            Iterator it3 = it2;
                            if ((eoihVar4.b & 2) != 0) {
                                String str2 = eoihVar4.d;
                                eoikVar = eoikVar2;
                                String strA2 = dznpVar2.a();
                                if (!str2.equals(strA2)) {
                                    if (eoijVar == null) {
                                        eoijVar = (eoij) eoikVar.toBuilder();
                                    }
                                    eoil eoilVar = (eoil) eoimVar.toBuilder();
                                    eoie eoieVar2 = (eoie) eoihVar4.toBuilder();
                                    eoieVar2.copyOnWrite();
                                    eoih eoihVar5 = (eoih) eoieVar2.instance;
                                    strA2.getClass();
                                    dznpVar = dznpVar2;
                                    eoihVar5.b |= 2;
                                    eoihVar5.d = strA2;
                                    eoih eoihVar6 = (eoih) eoieVar2.build();
                                    eoilVar.copyOnWrite();
                                    eoim eoimVar2 = (eoim) eoilVar.instance;
                                    eoihVar6.getClass();
                                    eoimVar2.c = eoihVar6;
                                    eoimVar2.b |= 1;
                                    eoim eoimVar3 = (eoim) eoilVar.build();
                                    eoijVar.copyOnWrite();
                                    eoik eoikVar3 = (eoik) eoijVar.instance;
                                    eoimVar3.getClass();
                                    eoikVar3.a();
                                    eoikVar3.b.set(i5, eoimVar3);
                                }
                                i5++;
                                it2 = it3;
                                eoikVar2 = eoikVar;
                                dznpVar2 = dznpVar;
                            } else {
                                eoikVar = eoikVar2;
                            }
                            dznpVar = dznpVar2;
                            i5++;
                            it2 = it3;
                            eoikVar2 = eoikVar;
                            dznpVar2 = dznpVar;
                        }
                        it = it2;
                        if (eoijVar != null) {
                            eoik eoikVar4 = (eoik) eoijVar.build();
                            eoiiVarA.copyOnWrite();
                            eoin eoinVar3 = (eoin) eoiiVarA.instance;
                            eoikVar4.getClass();
                            eoinVar3.d = eoikVar4;
                            eoinVar3.c = 4;
                        }
                    } else {
                        it = it2;
                        for (int i6 = 0; i6 < ((eoin) eoiiVarA.instance).f.size(); i6++) {
                            eoih eoihVar7 = (eoih) ((eoin) eoiiVarA.instance).f.get(i6);
                            if ((eoihVar7.b & 2) != 0) {
                                String str3 = eoihVar7.d;
                                String strA3 = dznpVar2.a();
                                if (!str3.equals(strA3)) {
                                    eoie eoieVar3 = (eoie) eoihVar7.toBuilder();
                                    eoieVar3.copyOnWrite();
                                    eoih eoihVar8 = (eoih) eoieVar3.instance;
                                    strA3.getClass();
                                    eoihVar8.b |= 2;
                                    eoihVar8.d = strA3;
                                    eoih eoihVar9 = (eoih) eoieVar3.build();
                                    eoiiVarA.copyOnWrite();
                                    eoin eoinVar4 = (eoin) eoiiVarA.instance;
                                    eoihVar9.getClass();
                                    eoinVar4.a();
                                    eoinVar4.f.set(i6, eoihVar9);
                                }
                            }
                        }
                    }
                    i3 = i4;
                    it2 = it;
                }
                int i7 = i3;
                fehoVarA.copyOnWrite();
                fehu fehuVar = (fehu) fehoVarA.instance;
                fehu fehuVar2 = fehu.a;
                name.getClass();
                fehuVar.b |= 8;
                fehuVar.f = name;
                Class<?> cls = th.getClass();
                int i8 = cls == OutOfMemoryError.class ? 3 : NullPointerException.class.isAssignableFrom(cls) ? 2 : RuntimeException.class.isAssignableFrom(cls) ? 4 : Error.class.isAssignableFrom(cls) ? 5 : i7;
                fehoVarA.copyOnWrite();
                fehu fehuVar3 = (fehu) fehoVarA.instance;
                fehuVar3.g = i8 - 1;
                fehuVar3.b |= 16;
                fehoVarA.copyOnWrite();
                fehu fehuVar4 = (fehu) fehoVarA.instance;
                name2.getClass();
                fehuVar4.b |= 128;
                fehuVar4.h = name2;
                eoin eoinVar5 = (eoin) eoiiVarA.build();
                fehoVarA.copyOnWrite();
                fehu fehuVar5 = (fehu) fehoVarA.instance;
                eoinVar5.getClass();
                fehuVar5.i = eoinVar5;
                fehuVar5.b |= 256;
                int i9 = eict.a;
                dznn dznnVar = (dznn) dznjVar.d.b();
                if (dznnVar.b && (eiixVarA2 = eict.a(th)) != null) {
                    ekgb ekgbVarC = eiixVarA2.a.c();
                    int i10 = dznnVar.c;
                    int i11 = dznnVar.d;
                    int i12 = dznnVar.e;
                    List listF = ekjz.f(ekgbVarC);
                    ArrayList arrayListD = ekjz.d(Math.min(((ekoe) ekgbVarC).c, i11));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    int i13 = 0;
                    int length = 0;
                    while (i13 < listF.size()) {
                        int i14 = i13 + 1;
                        if (i14 > i11) {
                            fehwVar = (fehw) fehx.a.createBuilder();
                            int size = listF.size() - i13;
                            fehwVar.copyOnWrite();
                            fehx fehxVar = (fehx) fehwVar.instance;
                            fehxVar.b |= 1;
                            fehxVar.c = size;
                        } else {
                            int i15 = i11;
                            String str4 = (String) listF.get(i13);
                            List list = listF;
                            if (Math.min(str4.length(), i10) + length > i12) {
                                fehwVar = (fehw) fehx.a.createBuilder();
                                int size2 = list.size() - i13;
                                fehwVar.copyOnWrite();
                                fehx fehxVar2 = (fehx) fehwVar.instance;
                                fehxVar2.b |= 2;
                                fehxVar2.d = size2;
                            } else {
                                if (str4.length() > i10) {
                                    i2 = i12;
                                    arrayListD.add(str4.substring(0, i10));
                                    arrayList.add(Integer.valueOf(i13));
                                    arrayList2.add(Integer.valueOf(str4.length() - i10));
                                    length += i10;
                                } else {
                                    i2 = i12;
                                    arrayListD.add(str4);
                                    length += str4.length();
                                }
                                i13 = i14;
                                i12 = i2;
                                listF = list;
                                i11 = i15;
                            }
                        }
                        i = 0;
                    }
                    i = 0;
                    fehwVar = null;
                    if (!arrayList.isEmpty()) {
                        if (fehwVar == null) {
                            fehwVar = (fehw) fehx.a.createBuilder();
                        }
                        int size3 = arrayList.size();
                        for (int i16 = i; i16 < size3; i16++) {
                            int size4 = (arrayListD.size() - ((Integer) arrayList.get(i16)).intValue()) - 1;
                            fehwVar.copyOnWrite();
                            fehx fehxVar3 = (fehx) fehwVar.instance;
                            fehx fehxVar4 = fehx.a;
                            evsx evsxVar = fehxVar3.e;
                            if (!evsxVar.c()) {
                                fehxVar3.e = evsn.mutableCopy(evsxVar);
                            }
                            fehxVar3.e.h(size4);
                        }
                        fehwVar.copyOnWrite();
                        fehx fehxVar5 = (fehx) fehwVar.instance;
                        fehx fehxVar6 = fehx.a;
                        evsx evsxVar2 = fehxVar5.f;
                        if (!evsxVar2.c()) {
                            fehxVar5.f = evsn.mutableCopy(evsxVar2);
                        }
                        evpz.addAll(arrayList2, fehxVar5.f);
                    }
                    fehv fehvVar = (fehv) fehy.a.createBuilder();
                    List listF2 = ekjz.f(arrayListD);
                    fehvVar.copyOnWrite();
                    fehy fehyVar = (fehy) fehvVar.instance;
                    evtg evtgVar = fehyVar.c;
                    if (!evtgVar.c()) {
                        fehyVar.c = evsn.mutableCopy(evtgVar);
                    }
                    evpz.addAll(listF2, fehyVar.c);
                    if (fehwVar != null) {
                        fehx fehxVar7 = (fehx) fehwVar.build();
                        fehvVar.copyOnWrite();
                        fehy fehyVar2 = (fehy) fehvVar.instance;
                        fehxVar7.getClass();
                        fehyVar2.d = fehxVar7;
                        fehyVar2.b |= 1;
                    }
                    fehy fehyVar3 = (fehy) fehvVar.build();
                    fehoVarA.copyOnWrite();
                    fehu fehuVar6 = (fehu) fehoVarA.instance;
                    fehyVar3.getClass();
                    fehuVar6.k = fehyVar3;
                    fehuVar6.b |= 1024;
                }
                fehu fehuVar7 = (fehu) fehoVarA.build();
                ejwi ejwiVarI = (!((Boolean) dznjVar.h.a.b()).booleanValue() || (eiixVarA = eict.a(th)) == null || (dzolVarA = dzol.a(eiixVarA.a.b())) == null) ? ejud.a : ejwi.i((dzok) dzolVarA.b.get());
                dznjVar.l(fehuVar7, (dzok) ejwiVarI.f());
            } catch (Exception e) {
                ((ekrd) ((ekrd) ((ekrd) dzfq.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl$PrimesUncaughtExceptionHandler", "uncaughtException", 179, "CrashMetricServiceImpl.java")).q("Failed to record crash.");
            }
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Throwable th2) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.b;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, th);
            }
            throw th2;
        }
    }
}
