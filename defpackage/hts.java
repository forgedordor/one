package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hts extends hty {
    public static final hts a = new hts();

    private hts() {
        super(1, 2);
    }

    @Override // defpackage.hty
    protected final void a(hud hudVar, hlw hlwVar, hre hreVar, hqs hqsVar, htz htzVar) {
        int iG;
        Object objC = hudVar.c(0);
        hlv hlvVar = (hlv) hudVar.c(1);
        boolean z = objC instanceof hqu;
        int iA = hudVar.a(0);
        if (z) {
            hqsVar.b((hqu) objC);
        }
        int iA2 = hreVar.a(hlvVar);
        Object objX = hreVar.x(iA2, iA, objC);
        if (!(objX instanceof hqu)) {
            if (objX instanceof hpx) {
                ((hpx) objX).b();
                return;
            }
            return;
        }
        int iG2 = hreVar.g() - hreVar.o(iA2, iA);
        hqu hquVar = (hqu) objX;
        hlv hlvVar2 = hquVar.b;
        int iA3 = -1;
        if (hlvVar2 == null || !hlvVar2.a()) {
            iG = -1;
        } else {
            iA3 = hreVar.a(hlvVar2);
            iG = hreVar.g() - hreVar.p(iA3);
        }
        hqsVar.a(hquVar, iG2, iA3, iG);
    }
}
