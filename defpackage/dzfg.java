package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzfg implements eyif {
    public static dzfj a(fcsu fcsuVar, fcsu fcsuVar2) {
        if (!ecem.g()) {
            dzfa dzfaVar = (dzfa) fcsuVar2.b();
            if (!dzfa.b()) {
                ekrd ekrdVar = (ekrd) ((ekrd) dzfq.a.j()).h("com/google/android/libraries/performance/primes/CrashOnBadPrimesConfiguration", "observedBackgroundInitialization", 29, "CrashOnBadPrimesConfiguration.java");
                String str = dzfaVar.a;
                ekrdVar.t("Primes init triggered from background in package: %s", str);
                if (!dzfaVar.a()) {
                    throw new IllegalStateException(String.format("Primes init triggered from background in package: %s", str));
                }
            }
        }
        return new dzfj((dzfk) fcsuVar.b());
    }

    @Override // defpackage.fcsu
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
