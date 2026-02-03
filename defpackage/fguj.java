package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fguj extends fgtv {
    public fguj(int i, int i2) {
        super(i, i2);
    }

    @Override // defpackage.fgtv
    protected final String b() {
        return "nth-of-type";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fgtv
    protected final int c(fgrs fgrsVar) {
        int i = 0;
        if (fgrsVar.A() == null) {
            return 0;
        }
        fgte fgteVarC = fgrsVar.A().C();
        int size = fgteVarC.size();
        int i2 = 0;
        while (i < size) {
            fgrs fgrsVar2 = (fgrs) fgteVarC.get(i);
            if (fgrsVar2.e.equals(fgrsVar.e)) {
                i2++;
            }
            i++;
            if (fgrsVar2 == fgrsVar) {
                break;
            }
        }
        return i2;
    }
}
