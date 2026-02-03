package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgtb extends fgtd {
    public fgtb(Collection collection) {
        super(collection);
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        int i = this.b;
        do {
            i--;
            if (i < 0) {
                return true;
            }
        } while (((fguu) this.a.get(i)).a(fgrsVar, fgrsVar2));
        return false;
    }

    public final String toString() {
        return fgre.a(this.a, "");
    }

    public fgtb(fguu... fguuVarArr) {
        super(Arrays.asList(fguuVarArr));
    }
}
