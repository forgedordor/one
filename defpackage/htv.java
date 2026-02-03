package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htv extends hty {
    public static final htv a = new htv();

    private htv() {
        super(1, 1);
    }

    @Override // defpackage.hty
    protected final void a(hud hudVar, hlw hlwVar, hre hreVar, hqs hqsVar, htz htzVar) {
        Object objC = hudVar.c(0);
        boolean z = objC instanceof hqu;
        int iA = hudVar.a(0);
        if (z) {
            hqsVar.b((hqu) objC);
        }
        Object objX = hreVar.x(hreVar.q, iA, objC);
        if (objX instanceof hqu) {
            hqsVar.a((hqu) objX, hreVar.g() - hreVar.o(hreVar.q, iA), -1, -1);
        } else if (objX instanceof hpx) {
            ((hpx) objX).b();
        }
    }
}
