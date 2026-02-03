package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aikp implements ailg, dzke, dzro {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/analytics/BuglePrimesMetricExtensionProvider");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;

    public aikp(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4) {
        this.b = fcsuVar;
        this.c = fcsuVar3;
        this.d = fcsuVar4;
        this.e = fcsuVar2;
    }

    @Override // defpackage.dzro
    public final ejwi a() {
        return ejwi.j(b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcsu
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final feeg b() {
        feeb feebVar;
        feef feefVar = (feef) feeg.a.createBuilder();
        evsl evslVar = fedt.b;
        ekrg ekrgVar = a;
        ekrw ekrwVarE = ekrgVar.e();
        ekrz ekrzVar = eksq.a;
        ekrwVarE.X(ekrzVar, "Bugle");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/analytics/BuglePrimesMetricExtensionProvider", "buildMetricExtension", 106, "BuglePrimesMetricExtensionProvider.java")).q("Building primes metric with custom extension for all sims.");
        fedq fedqVar = (fedq) fedt.a.createBuilder();
        fcsu fcsuVar = this.c;
        if (((crma) fcsuVar.b()).p() && ((crma) fcsuVar.b()).k()) {
            for (crof crofVar : ((crny) this.d.b()).m()) {
                String strU = crofVar.u();
                String strQ = crofVar.q();
                feea feeaVar = (feea) feeb.a.createBuilder();
                if (strU == null) {
                    strU = "UNKNOWN";
                }
                feeaVar.copyOnWrite();
                feeb feebVar2 = (feeb) feeaVar.instance;
                ekrg ekrgVar2 = ekrgVar;
                feebVar2.b |= 1;
                feebVar2.c = strU;
                if (strQ == null) {
                    strQ = "UNKNOWN";
                }
                feeaVar.copyOnWrite();
                feeb feebVar3 = (feeb) feeaVar.instance;
                feebVar3.b |= 2;
                feebVar3.d = strQ;
                int iA = crofVar.a();
                Optional optionalI = ((cmlb) this.b.b()).i(iA);
                if (optionalI.isEmpty()) {
                    ekrw ekrwVarJ = ekrgVar2.j();
                    ekrwVarJ.X(ekrzVar, "Bugle");
                    ekrd ekrdVar = (ekrd) ekrwVarJ;
                    ekrdVar.X(cqnc.w, Integer.valueOf(iA));
                    ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/analytics/BuglePrimesMetricExtensionProvider", "buildSimInfo", 138, "BuglePrimesMetricExtensionProvider.java")).q("No subscription info to log for Primes crash metrics");
                    feebVar = (feeb) feeaVar.build();
                } else {
                    cmmh cmmhVar = (cmmh) optionalI.get();
                    enwr enwrVar = ((dggw) this.e.b()).b(cmmhVar.c).a;
                    String str = cmmhVar.k;
                    feeaVar.copyOnWrite();
                    feeb feebVar4 = (feeb) feeaVar.instance;
                    str.getClass();
                    feebVar4.b |= 8;
                    feebVar4.f = str;
                    String str2 = cmmhVar.l;
                    feeaVar.copyOnWrite();
                    feeb feebVar5 = (feeb) feeaVar.instance;
                    str2.getClass();
                    feebVar5.b |= 16;
                    feebVar5.g = str2;
                    int i = true != cmmhVar.o ? 1 : 2;
                    feeaVar.copyOnWrite();
                    feeb feebVar6 = (feeb) feeaVar.instance;
                    feebVar6.e = i - 1;
                    feebVar6.b |= 4;
                    feeaVar.copyOnWrite();
                    feeb feebVar7 = (feeb) feeaVar.instance;
                    feebVar7.h = enwrVar.N;
                    feebVar7.b |= 32;
                    feebVar = (feeb) feeaVar.build();
                }
                fedqVar.copyOnWrite();
                fedt fedtVar = (fedt) fedqVar.instance;
                feebVar.getClass();
                evtg evtgVar = fedtVar.i;
                if (!evtgVar.c()) {
                    fedtVar.i = evsn.mutableCopy(evtgVar);
                }
                fedtVar.i.add(feebVar);
                ekrgVar = ekrgVar2;
            }
        }
        feefVar.e(evslVar, (fedt) fedqVar.build());
        return (feeg) feefVar.build();
    }

    @Override // defpackage.dzke
    public final feeg d() {
        return b();
    }
}
