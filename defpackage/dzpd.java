package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzpd extends dzpl implements dzix, dzlo {
    private final Context a;
    private final dzjh b;
    private final dzpw c;
    private final dzor d;
    private final dzpc e;
    private final ArrayMap f;
    private final Executor g;
    private final dzlm h;
    private final fcsu i;
    private final dzpn j;
    private final fcsu k;

    /* JADX WARN: Type inference failed for: r3v2, types: [eygg, java.lang.Object] */
    public dzpd(dzln dzlnVar, Context context, dzjh dzjhVar, eygg<dzph> eyggVar, dzor dzorVar, fcsu<dzpe> fcsuVar, fcsu<fehf> fcsuVar2, Executor executor, dzpx dzpxVar, fcsu<Boolean> fcsuVar3, dzpm dzpmVar, dzpn dzpnVar, ejwi ejwiVar, fcsu<Long> fcsuVar4) {
        ArrayMap arrayMap = new ArrayMap();
        this.f = arrayMap;
        ejwl.l(true);
        this.g = executor;
        this.h = dzlnVar.a(executor, eyggVar, fcsuVar2);
        this.a = context;
        this.b = dzjhVar;
        this.i = fcsuVar;
        this.d = dzorVar;
        dzpc dzpcVar = new dzpc(context, arrayMap, fcsuVar3);
        this.e = dzpcVar;
        ?? B = dzpxVar.a.b();
        B.getClass();
        eosd eosdVar = (eosd) dzpxVar.b.b();
        eosdVar.getClass();
        this.c = new dzpw(B, eosdVar, dzpcVar);
        this.j = dzpnVar;
        this.k = fcsuVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ feig d(dzpd dzpdVar, feif feifVar) {
        fcsu fcsuVar = dzpdVar.k;
        int iIntValue = ((Long) fcsuVar.b()).intValue();
        if (iIntValue == 0 || iIntValue == 1) {
            feifVar.d(fedp.b);
            return (feig) feifVar.build();
        }
        if (iIntValue != 2) {
            if (iIntValue == 3) {
                return (feig) feifVar.build();
            }
            ekrd ekrdVar = (ekrd) dzfq.a.j();
            ekrdVar.V(1, TimeUnit.HOURS);
            ((ekrd) ekrdVar.h("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "stopAsFuture", 267, "FrameMetricServiceImpl.java")).t("Unsupported experimental jank collection configuration: %s", new dziq(((Long) fcsuVar.b()).longValue()));
            feifVar.d(fedp.b);
            return (feig) feifVar.build();
        }
        evsl evslVar = fedp.b;
        fedp fedpVar = (fedp) feifVar.b(evslVar);
        if (fedpVar.c.size() != fedpVar.d.size()) {
            ekrd ekrdVar2 = (ekrd) dzfq.a.j();
            ekrdVar2.V(1, TimeUnit.HOURS);
            ((ekrd) ekrdVar2.h("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "filterJankyFrames", 288, "FrameMetricServiceImpl.java")).D("Experimental jank data is invalid, clearing extension. Deadline count %s != Total Duration count %s.", new dziq(fedpVar.c.size()), new dziq(fedpVar.d.size()));
            feifVar.d(evslVar);
            return (feig) feifVar.build();
        }
        fedo fedoVar = (fedo) fedp.a.createBuilder();
        for (int i = 0; i < fedpVar.c.size(); i++) {
            long jA = fedpVar.c.a(i);
            long jA2 = fedpVar.d.a(i);
            if (jA2 >= jA) {
                fedoVar.copyOnWrite();
                fedp fedpVar2 = (fedp) fedoVar.instance;
                evta evtaVar = fedpVar2.c;
                if (!evtaVar.c()) {
                    fedpVar2.c = evsn.mutableCopy(evtaVar);
                }
                fedpVar2.c.g(jA);
                fedoVar.copyOnWrite();
                fedp fedpVar3 = (fedp) fedoVar.instance;
                evta evtaVar2 = fedpVar3.d;
                if (!evtaVar2.c()) {
                    fedpVar3.d = evsn.mutableCopy(evtaVar2);
                }
                fedpVar3.d.g(jA2);
            }
        }
        feifVar.e(evslVar, (fedp) fedoVar.build());
        return (feig) feifVar.build();
    }

    private static dzlf l(feig feigVar, dzpf dzpfVar) {
        dzle dzleVarN = dzlf.n();
        feiw feiwVar = (feiw) feix.a.createBuilder();
        feiwVar.copyOnWrite();
        feix feixVar = (feix) feiwVar.instance;
        feigVar.getClass();
        feixVar.l = feigVar;
        feixVar.b |= 1024;
        dzleVarN.f((feix) feiwVar.build());
        dzos dzosVar = (dzos) dzpfVar;
        dzkw dzkwVar = (dzkw) dzleVarN;
        dzkwVar.b = dzosVar.b;
        dzpp dzppVar = dzosVar.a;
        dzox dzoxVar = (dzox) dzppVar;
        dzkwVar.c = true != dzoxVar.b ? null : "Activity";
        dzkwVar.a = dzppVar.e();
        dzleVarN.c(dzoxVar.a != null);
        return dzleVarN.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ListenableFuture m(final dzpf dzpfVar) {
        dzpe dzpeVar;
        feio feioVar;
        int i;
        if (!this.h.d()) {
            return eorv.a;
        }
        ArrayMap arrayMap = this.f;
        synchronized (arrayMap) {
            dzpeVar = (dzpe) arrayMap.remove(((dzos) dzpfVar).a);
            if (arrayMap.isEmpty()) {
                this.c.j();
            }
        }
        if (dzpeVar == null) {
            ((ekrd) ((ekrd) dzfq.a.h()).h("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "stopAsFuture", 226, "FrameMetricServiceImpl.java")).t("Measurement not found: %s", new dziu(((dzox) ((dzos) dzpfVar).a).a));
            return eorv.a;
        }
        dzpn dzpnVar = this.j;
        String strE = ((dzos) dzpfVar).a.e();
        int i2 = 0;
        if (Build.VERSION.SDK_INT >= 29 && Trace.isEnabled()) {
            Trace.endAsyncSection(String.format("J<%s>", strE), 352691800);
            for (dzps dzpsVar : ((dzpv) dzpnVar.b.b()).c) {
                int iA = dzpu.a(dzpsVar.b);
                if (iA == 0) {
                    iA = 1;
                }
                switch (iA - 1) {
                    case 1:
                        i = 0;
                        break;
                    case 2:
                        i = dzpeVar.g;
                        break;
                    case 3:
                        i = dzpeVar.i;
                        break;
                    case 4:
                        i = dzpeVar.j;
                        break;
                    case 5:
                        i = dzpeVar.k;
                        break;
                    case 6:
                        i = dzpeVar.l;
                        break;
                    case 7:
                        i = dzpeVar.n;
                        break;
                    default:
                        ((ekrd) ((ekrd) dzfq.a.e()).h("com/google/android/libraries/performance/primes/metrics/jank/JankPerfettoTrigger", "endTraceSectionAndEmitCounters", 153, "JankPerfettoTrigger.java")).t("UNKNOWN COUNTER with %s as the name", dzpsVar.c);
                        continue;
                }
                Trace.setCounter(dzpsVar.c.replace("%EVENT_NAME%", strE), i);
            }
        }
        if (dzpeVar.i == 0) {
            return eorv.a;
        }
        fcsu fcsuVar = dzpnVar.b;
        if (((dzpv) fcsuVar.b()).d) {
            ((dzph) dzpnVar.c.b()).e();
            long millis = TimeUnit.SECONDS.toMillis(9L);
            Long.valueOf(millis).getClass();
            if (dzpeVar.n <= millis && dzpeVar.g != 0) {
                dzly dzlyVar = (dzly) dzpnVar.a.b();
                String strReplace = ((dzpv) fcsuVar.b()).b.replace("%PACKAGE_NAME%", dzpnVar.d.getPackageName());
                strReplace.getClass();
                dzlyVar.a(strReplace);
            }
        }
        long jA = dzpeVar.c.a() - dzpeVar.d;
        feif feifVar = (feif) feig.a.createBuilder();
        feifVar.copyOnWrite();
        feig feigVar = (feig) feifVar.instance;
        feigVar.b |= 16;
        feigVar.g = ((int) jA) + 1;
        int i3 = dzpeVar.g;
        feifVar.copyOnWrite();
        feig feigVar2 = (feig) feifVar.instance;
        feigVar2.b |= 1;
        feigVar2.c = i3;
        int i4 = dzpeVar.i;
        feifVar.copyOnWrite();
        feig feigVar3 = (feig) feifVar.instance;
        feigVar3.b |= 2;
        feigVar3.d = i4;
        int i5 = dzpeVar.j;
        feifVar.copyOnWrite();
        feig feigVar4 = (feig) feifVar.instance;
        feigVar4.b |= 4;
        feigVar4.e = i5;
        int i6 = dzpeVar.l;
        feifVar.copyOnWrite();
        feig feigVar5 = (feig) feifVar.instance;
        feigVar5.b |= 32;
        feigVar5.h = i6;
        int i7 = dzpeVar.n;
        feifVar.copyOnWrite();
        feig feigVar6 = (feig) feifVar.instance;
        feigVar6.b |= 64;
        feigVar6.i = i7;
        int i8 = dzpeVar.k;
        feifVar.copyOnWrite();
        feig feigVar7 = (feig) feifVar.instance;
        feigVar7.b |= 8;
        feigVar7.f = i8;
        int i9 = dzpeVar.o;
        if (i9 != Integer.MIN_VALUE) {
            int[] iArr = dzpeVar.f;
            int[] iArr2 = dzpe.b;
            fein feinVar = (fein) feio.a.createBuilder();
            int i10 = 0;
            while (true) {
                if (i10 >= 52) {
                    if (iArr[51] > 0) {
                        feinVar.a(i9 + 1);
                        feinVar.b(0);
                    }
                    feioVar = (feio) feinVar.build();
                } else if (iArr2[i10] > i9) {
                    feinVar.b(0);
                    feinVar.a(i9 + 1);
                    feioVar = (feio) feinVar.build();
                } else {
                    int i11 = iArr[i10];
                    if (i11 > 0 || (i10 > 0 && iArr[i10 - 1] > 0)) {
                        feinVar.b(i11);
                        feinVar.a(iArr2[i10]);
                    }
                    i10++;
                }
            }
            feifVar.copyOnWrite();
            feig feigVar8 = (feig) feifVar.instance;
            feioVar.getClass();
            feigVar8.o = feioVar;
            feigVar8.b |= 2048;
            int i12 = dzpeVar.h;
            feifVar.copyOnWrite();
            feig feigVar9 = (feig) feifVar.instance;
            feigVar9.b |= 512;
            feigVar9.m = i12;
            int i13 = dzpeVar.m;
            feifVar.copyOnWrite();
            feig feigVar10 = (feig) feifVar.instance;
            feigVar10.b |= 1024;
            feigVar10.n = i13;
        }
        while (i2 < 29) {
            int i14 = i2 + 1;
            int[] iArr3 = dzpeVar.e;
            if (iArr3[i2] > 0) {
                feid feidVar = (feid) feie.a.createBuilder();
                int i15 = iArr3[i2];
                feidVar.copyOnWrite();
                feie feieVar = (feie) feidVar.instance;
                feieVar.b |= 1;
                feieVar.c = i15;
                int[] iArr4 = dzpe.a;
                int i16 = iArr4[i2];
                feidVar.copyOnWrite();
                feie feieVar2 = (feie) feidVar.instance;
                feieVar2.b |= 2;
                feieVar2.d = i16;
                if (i14 < 29) {
                    int i17 = iArr4[i14] - 1;
                    feidVar.copyOnWrite();
                    feie feieVar3 = (feie) feidVar.instance;
                    feieVar3.b |= 4;
                    feieVar3.e = i17;
                }
                feifVar.copyOnWrite();
                feig feigVar11 = (feig) feifVar.instance;
                feie feieVar4 = (feie) feidVar.build();
                feieVar4.getClass();
                evtg evtgVar = feigVar11.k;
                if (!evtgVar.c()) {
                    feigVar11.k = evsn.mutableCopy(evtgVar);
                }
                feigVar11.k.add(feieVar4);
            }
            i2 = i14;
        }
        final feif feifVar2 = (feif) ((feig) feifVar.build()).toBuilder();
        ejwi ejwiVarA = dzoy.a(this.a);
        if (ejwiVarA.g()) {
            int iIntValue = ((Float) ejwiVarA.c()).intValue();
            feifVar2.copyOnWrite();
            feig feigVar12 = (feig) feifVar2.instance;
            feigVar12.b |= 256;
            feigVar12.l = iIntValue;
        }
        return !feifVar2.c(fedp.b) ? this.h.b(l((feig) feifVar2.build(), dzpfVar)) : eooq.g(eork.m(new Callable() { // from class: dzoz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return dzpd.d(this.a, feifVar2);
            }
        }, this.g), new eooz() { // from class: dzpa
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return this.a.h.b(dzpd.l((feig) obj, dzpfVar));
            }
        }, eoqg.a);
    }

    private final void o(dzpp dzppVar) {
        if (this.h.c(dzppVar.e())) {
            ArrayMap arrayMap = this.f;
            synchronized (arrayMap) {
                if (arrayMap.size() >= 25) {
                    ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 167, "FrameMetricServiceImpl.java")).t("Too many concurrent measurements, ignoring %s", dzppVar);
                    return;
                }
                dzpe dzpeVar = (dzpe) arrayMap.put(dzppVar, (dzpe) this.i.b());
                if (dzpeVar != null) {
                    arrayMap.put(dzppVar, dzpeVar);
                    ((ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME, 181, "FrameMetricServiceImpl.java")).t("measurement already started: %s", dzppVar);
                    return;
                }
                if (arrayMap.size() == 1) {
                    this.c.i();
                }
                String strE = dzppVar.e();
                if (Build.VERSION.SDK_INT >= 29 && Trace.isEnabled()) {
                    Trace.beginAsyncSection(String.format("J<%s>", strE), 352691800);
                }
            }
        }
    }

    public ListenableFuture<Void> b(Activity activity) {
        dzpp dzppVarD = dzpp.d(activity);
        ejud ejudVar = ejud.a;
        return m(new dzos(dzppVarD, null, ejudVar, ejudVar));
    }

    @Override // defpackage.dzpl
    public ListenableFuture<Void> c(dzpj dzpjVar) {
        dzox dzoxVar;
        dzow dzowVar = (dzow) dzpjVar;
        dzfh dzfhVar = dzowVar.b;
        if (dzfhVar != null) {
            ejyb.e(dzfhVar);
            dzoxVar = new dzox(null, dzfhVar, false);
        } else {
            dzoxVar = new dzox(dzowVar.a, null, false);
        }
        return m(new dzos(dzoxVar, dzowVar.c, dzowVar.d, dzowVar.e));
    }

    public void e(Activity activity) {
        o(dzpp.d(activity));
    }

    @Override // defpackage.dzpl
    public void f(dzfh dzfhVar) {
        o(new dzox(null, dzfhVar, false));
    }

    @Override // defpackage.dzix
    public void i(dzfh dzfhVar) {
        ArrayMap arrayMap = this.f;
        synchronized (arrayMap) {
            arrayMap.clear();
        }
    }

    @Override // defpackage.dzlo
    public void n() {
        dzjh dzjhVar = this.b;
        dzjhVar.a(this.c);
        dzjhVar.a(this.d);
    }

    @Override // defpackage.dzix
    public /* synthetic */ void j(dzfh dzfhVar) {
    }
}
