package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htn extends hty {
    public static final htn a = new htn();

    private htn() {
        super(0, 0, 3);
    }

    @Override // defpackage.hty
    protected final void a(hud hudVar, hlw hlwVar, hre hreVar, hqs hqsVar, htz htzVar) {
        if (hreVar.n != 0) {
            hmz.j("Cannot reset when inserting");
        }
        hreVar.I();
        hreVar.q = 0;
        hreVar.r = hreVar.e() - hreVar.h;
        hreVar.i = 0;
        hreVar.j = 0;
        hreVar.o = 0;
    }
}
