package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwe implements zvz {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/replies/ReplyReactConditionsValidatorImpl");
    private final fduj b;
    private final fdpl c;
    private final fdpl d;
    private final fdpl e;
    private final apwf f;

    public zwe(fduj fdujVar, fdpl fdplVar, fdpl fdplVar2, fdpl fdplVar3, apwf apwfVar) {
        fdujVar.getClass();
        fdplVar.getClass();
        fdplVar2.getClass();
        this.b = fdujVar;
        this.c = fdplVar;
        this.d = fdplVar2;
        this.e = fdplVar3;
        this.f = apwfVar;
    }

    public static final boolean d(ajlj ajljVar) {
        return ajljVar == ajlj.ONE_ON_ONE || ajljVar == ajlj.GROUP;
    }

    public static final boolean e(ajlt ajltVar) {
        String strC;
        amvr amvrVarG = ajltVar.g();
        if ((amvrVarG instanceof amvw) && (strC = ((amvw) amvrVarG).c()) != null && strC.length() > 0) {
            return true;
        }
        if (amvrVarG instanceof amwf) {
            amwf amwfVar = (amwf) amvrVarG;
            if (amwfVar.c() != null) {
                String strC2 = amwfVar.c();
                strC2.getClass();
                return strC2.length() > 0;
            }
        }
        return false;
    }

    private final fdpl f(ajlt ajltVar, boolean z, boolean z2) {
        zwc zwcVar = new zwc(this.b);
        zwd zwdVar = new zwd(ajltVar, z2, this, z, null);
        return fdud.b(this.c, zwcVar, this.d, this.e, zwdVar);
    }

    @Override // defpackage.zvz
    public final fdpl a(ajlt ajltVar, boolean z) {
        ajltVar.getClass();
        return f(ajltVar, z, true);
    }

    @Override // defpackage.zvz
    public final fdpl b(ajlt ajltVar) {
        ajltVar.getClass();
        return f(ajltVar, false, false);
    }

    @Override // defpackage.zvz
    public final boolean c(ajlt ajltVar, ajlj ajljVar) {
        ajltVar.getClass();
        if (ajltVar.C() == 3 && ajltVar.a() == ajls.b && d(ajljVar)) {
            return (this.f.a() && (ajltVar instanceof ytm)) ? false : true;
        }
        return false;
    }
}
