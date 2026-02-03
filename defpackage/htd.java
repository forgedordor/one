package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class htd extends hty {
    public static final htd a = new htd();

    private htd() {
        super(1, 2);
    }

    @Override // defpackage.hty
    protected final void a(hud hudVar, hlw hlwVar, hre hreVar, hqs hqsVar, htz htzVar) {
        Object objInvoke = ((fdae) hudVar.c(0)).invoke();
        hlv hlvVar = (hlv) hudVar.c(1);
        int iA = hudVar.a(0);
        hreVar.R(hreVar.a(hlvVar), objInvoke);
        hlwVar.j(iA, objInvoke);
        hlwVar.d(objInvoke);
    }

    @Override // defpackage.hty
    protected final hlv b(hud hudVar) {
        return (hlv) hudVar.c(1);
    }
}
