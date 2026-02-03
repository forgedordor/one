package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqle {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/ditto/DittoRequestSubIdProvider");
    private final crny b;

    public cqle(crny crnyVar) {
        crnyVar.getClass();
        this.b = crnyVar;
    }

    public final Optional a(epes epesVar) {
        int iB;
        int i;
        epesVar.getClass();
        epeo epeoVar = (epeo) epep.a.createBuilder();
        epeoVar.getClass();
        evsn evsnVarBuild = epeoVar.build();
        evsnVarBuild.getClass();
        if (!fdbq.f(epesVar, (epep) evsnVarBuild) && (iB = eper.b(epesVar.b)) != 0 && iB == 4 && (i = epesVar.c) != -1) {
            return Optional.of(Integer.valueOf(i));
        }
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleNetwork");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/ditto/DittoRequestSubIdProvider", "getSubId", 28, "DittoRequestSubIdProvider.kt")).q("No valid subId set.");
        crny crnyVar = this.b;
        if (crnyVar.a() == 1) {
            ekrw ekrwVarH2 = ekrgVar.h();
            ekrwVarH2.X(ekrzVar, "BugleNetwork");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/util/ditto/DittoRequestSubIdProvider", "getSubId", 33, "DittoRequestSubIdProvider.kt")).q("No valid subId found, but there is only one active subscription. Falling back to the default SMS subId.");
            return Optional.of(Integer.valueOf(crnyVar.c()));
        }
        ekrw ekrwVarJ = ekrgVar.j();
        ekrwVarJ.X(ekrzVar, "BugleNetwork");
        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/util/ditto/DittoRequestSubIdProvider", "getSubId", 39, "DittoRequestSubIdProvider.kt")).q("Falied to retrieve subId.");
        return Optional.empty();
    }
}
