package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fgui extends fgtv {
    public fgui(int i, int i2) {
        super(i, i2);
    }

    @Override // defpackage.fgtv
    protected final String b() {
        return "nth-last-of-type";
    }

    @Override // defpackage.fgtv
    protected final int c(fgrs fgrsVar) {
        int i = 0;
        if (fgrsVar.A() == null) {
            return 0;
        }
        fgte fgteVarC = fgrsVar.A().C();
        for (int iK = fgrsVar.k(); iK < fgteVarC.size(); iK++) {
            if (((fgrs) fgteVarC.get(iK)).e.equals(fgrsVar.e)) {
                i++;
            }
        }
        return i;
    }
}
