package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class fgtv extends fguu {
    protected final int a;
    protected final int b;

    public fgtv(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        fgrs fgrsVarA = fgrsVar2.A();
        if (fgrsVarA != null && !(fgrsVarA instanceof fgrm)) {
            int iC = c(fgrsVar2);
            int i = this.a;
            if (i == 0) {
                return iC == this.b;
            }
            int i2 = iC - this.b;
            if (i2 * i >= 0 && i2 % i == 0) {
                return true;
            }
        }
        return false;
    }

    protected abstract String b();

    protected abstract int c(fgrs fgrsVar);

    public String toString() {
        int i = this.a;
        if (i == 0) {
            return String.format(":%s(%d)", b(), Integer.valueOf(this.b));
        }
        int i2 = this.b;
        return i2 == 0 ? String.format(":%s(%dn)", b(), Integer.valueOf(i)) : String.format(":%s(%dn%+d)", b(), Integer.valueOf(i), Integer.valueOf(i2));
    }
}
