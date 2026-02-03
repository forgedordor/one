package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aiop implements ainw {
    private static final eksp a = eksp.c("BugleClearcutLogger");
    private final fcsu b;
    private final fcsu c;
    private final fcsu d;

    public aiop(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
        this.d = fcsuVar3;
    }

    @Override // defpackage.ainw
    public final elku a() {
        if (!((crnp) this.d.b()).e()) {
            return ((aimt) this.b.b()).b();
        }
        aimt aimtVar = (aimt) this.b.b();
        aimtVar.c(((crny) this.c.b()).f());
        return aimtVar.b();
    }

    @Override // defpackage.ainw
    public final elku b(String str) {
        aimt aimtVar = (aimt) this.b.b();
        if (dhim.c(str)) {
            String str2 = (String) ejxk.b('@').i(str).get(1);
            elkq elkqVar = aimtVar.b;
            elkqVar.copyOnWrite();
            elku elkuVar = (elku) elkqVar.instance;
            elku elkuVar2 = elku.a;
            str.getClass();
            elkuVar.b |= 8;
            elkuVar.f = str;
            elkqVar.copyOnWrite();
            elku elkuVar3 = (elku) elkqVar.instance;
            str2.getClass();
            elkuVar3.b |= 16;
            elkuVar3.g = str2;
        } else {
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/analytics/common/PhoneDimensionsProvider", "getCustomDimensionsForRbm", 50, "PhoneDimensionsProvider.java")).q("Can't set custom RBM info in UMA counter: RBM bot id is not an email");
        }
        return aimtVar.b();
    }
}
