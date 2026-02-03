package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fgrq implements fguw {
    final /* synthetic */ StringBuilder a;

    public fgrq(StringBuilder sb) {
        this.a = sb;
    }

    @Override // defpackage.fguw
    public final void a(fgry fgryVar, int i) {
        if (fgryVar instanceof fgsb) {
            fgrs.D(this.a, (fgsb) fgryVar);
            return;
        }
        if (fgryVar instanceof fgrs) {
            fgrs fgrsVar = (fgrs) fgryVar;
            StringBuilder sb = this.a;
            if (sb.length() > 0) {
                if ((fgrsVar.H() || fgrsVar.Z()) && !fgsb.p(sb)) {
                    sb.append(' ');
                }
            }
        }
    }

    @Override // defpackage.fguw
    public final void b(fgry fgryVar, int i) {
        if (fgryVar instanceof fgrs) {
            fgrs fgrsVar = (fgrs) fgryVar;
            fgry fgryVarP = fgryVar.P();
            if (fgrsVar.H()) {
                if ((fgryVarP instanceof fgsb) || ((fgryVarP instanceof fgrs) && !((fgrs) fgryVarP).e.e)) {
                    StringBuilder sb = this.a;
                    if (fgsb.p(sb)) {
                        return;
                    }
                    sb.append(' ');
                }
            }
        }
    }
}
