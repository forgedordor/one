package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fguh extends fgtv {
    public fguh(int i, int i2) {
        super(i, i2);
    }

    @Override // defpackage.fgtv
    protected final String b() {
        return "nth-last-child";
    }

    @Override // defpackage.fgtv
    protected final int c(fgrs fgrsVar) {
        if (fgrsVar.A() == null) {
            return 0;
        }
        return fgrsVar.A().C().size() - fgrsVar.k();
    }
}
