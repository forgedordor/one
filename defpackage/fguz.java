package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fguz {
    public static fgte a(String str, final fgrs fgrsVar) {
        fgqz.e(str);
        final fguu fguuVarA = fgux.a(str);
        fgqz.g(fguuVarA);
        final fgte fgteVar = new fgte();
        fguv.a(new fguw() { // from class: fgsz
            @Override // defpackage.fguw
            public final void a(fgry fgryVar, int i) {
                if (fgryVar instanceof fgrs) {
                    fgrs fgrsVar2 = (fgrs) fgryVar;
                    if (fguuVarA.a(fgrsVar, fgrsVar2)) {
                        fgteVar.add(fgrsVar2);
                    }
                }
            }

            @Override // defpackage.fguw
            public final /* synthetic */ void b(fgry fgryVar, int i) {
            }
        }, fgrsVar);
        return fgteVar;
    }
}
