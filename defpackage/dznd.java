package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dznd {
    public final eygg a;
    private final dzjt b;

    public dznd(dzjt dzjtVar, eygg eyggVar) {
        this.b = dzjtVar;
        this.a = eyggVar;
    }

    public final feho a(dzfh dzfhVar) {
        feho fehoVar = (feho) fehu.a.createBuilder();
        fehoVar.copyOnWrite();
        fehu fehuVar = (fehu) fehoVar.instance;
        fehuVar.b |= 1;
        fehuVar.c = true;
        String strD = dzfh.d(dzfhVar);
        if (strD != null) {
            fehoVar.copyOnWrite();
            fehu fehuVar2 = (fehu) fehoVar.instance;
            fehuVar2.b |= 4;
            fehuVar2.e = strD;
        }
        try {
            feha fehaVar = (feha) fehb.a.createBuilder();
            fegz fegzVarA = this.b.a();
            fehaVar.copyOnWrite();
            fehb fehbVar = (fehb) fehaVar.instance;
            fegzVarA.getClass();
            fehbVar.c = fegzVarA;
            fehbVar.b |= 1;
            fehoVar.copyOnWrite();
            fehu fehuVar3 = (fehu) fehoVar.instance;
            fehb fehbVar2 = (fehb) fehaVar.build();
            fehbVar2.getClass();
            fehuVar3.d = fehbVar2;
            fehuVar3.b |= 2;
            return fehoVar;
        } catch (RuntimeException e) {
            ((ekrd) ((ekrd) ((ekrd) dzfq.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricFactory", "newCrash", 'V', "CrashMetricFactory.java")).q("Failed to get process stats.");
            return fehoVar;
        }
    }
}
