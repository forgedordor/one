package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hti extends hty {
    public static final hti a = new hti();

    private hti() {
        super(1, 1);
    }

    @Override // defpackage.hty
    protected final void a(hud hudVar, hlw hlwVar, hre hreVar, hqs hqsVar, htz htzVar) {
        hlv hlvVar = (hlv) hudVar.c(0);
        int iA = hudVar.a(0);
        hlwVar.h();
        hlwVar.i(iA, hreVar.w(hreVar.a(hlvVar)));
    }

    @Override // defpackage.hty
    protected final hlv b(hud hudVar) {
        return (hlv) hudVar.c(0);
    }
}
