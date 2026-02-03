package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgub extends fguu {
    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        for (fgry fgryVar : fgrsVar2.M()) {
            if (!(fgryVar instanceof fgrj) && !(fgryVar instanceof fgsc) && !(fgryVar instanceof fgrn)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return ":empty";
    }
}
