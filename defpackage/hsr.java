package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsr extends hty {
    public static final hsr a = new hsr();

    private hsr() {
        super(0, 2, 1);
    }

    @Override // defpackage.hty
    protected final void a(hud hudVar, hlw hlwVar, hre hreVar, hqs hqsVar, htz htzVar) {
        hxg hxgVar = (hxg) hudVar.c(1);
        int i = hxgVar != null ? hxgVar.a : 0;
        hsm hsmVar = (hsm) hudVar.c(0);
        if (i > 0) {
            hlwVar = new hpc(hlwVar, i);
        }
        hsmVar.b(hlwVar, hreVar, hqsVar, htzVar != null ? new hub(htzVar, hreVar) : null);
    }
}
