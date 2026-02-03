package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class damk {
    public static final eksp a = eksp.c("BugleWearable");
    public static final cczv b = cdag.m(cdag.b, "simulate_roaming_in_eu", false);
    public final fctc c;
    public final fctc d;
    private final crny e;

    public damk(crny crnyVar) {
        crnyVar.getClass();
        this.e = crnyVar;
        this.c = fctd.a(new fdae() { // from class: dami
            @Override // defpackage.fdae
            public final Object invoke() {
                boolean zT;
                if (((Boolean) damk.b.e()).booleanValue()) {
                    eksl ekslVar = (eksl) damk.a.h();
                    ekslVar.X(cqnc.S, "WearSubscriptionUtil");
                    ekslVar.q("Device is simulating roaming in EU and isMccInEU sets to true ");
                    zT = true;
                } else {
                    String strV = this.a.a().v();
                    eksl ekslVar2 = (eksl) damk.a.h();
                    ekslVar2.X(cqnc.S, "WearSubscriptionUtil");
                    ekslVar2.t("isMccInEu: simOperator=%s", strV);
                    strV.getClass();
                    zT = fdgn.t(strV, "2");
                }
                return Boolean.valueOf(zT);
            }
        });
        this.d = fctd.a(new fdae() { // from class: damj
            @Override // defpackage.fdae
            public final Object invoke() {
                boolean zB;
                if (((Boolean) damk.b.e()).booleanValue()) {
                    eksl ekslVar = (eksl) damk.a.h();
                    ekslVar.X(cqnc.S, "WearSubscriptionUtil");
                    ekslVar.q("Device is simulating roaming in EU and isRoaming sets to true ");
                    zB = true;
                } else {
                    zB = this.a.a().B();
                    eksl ekslVar2 = (eksl) damk.a.h();
                    ekslVar2.X(cqnc.S, "WearSubscriptionUtil");
                    ekslVar2.t("isRoaming: %b", Boolean.valueOf(zB));
                }
                return Boolean.valueOf(zB);
            }
        });
    }

    public final crof a() {
        crny crnyVar = this.e;
        return crnyVar.h(crnyVar.c());
    }
}
