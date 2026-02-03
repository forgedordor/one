package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgti extends fguu {
    private final String a;

    public fgti(String str) {
        fgqz.e(str);
        this.a = fgrb.a(str);
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        fgrh fgrhVarV = fgrsVar2.v();
        ArrayList arrayList = new ArrayList(fgrhVarV.a);
        for (int i = 0; i < fgrhVarV.a; i++) {
            if (!fgrh.o(fgrhVarV.b[i])) {
                arrayList.add(new fgrf(fgrhVarV.b[i], (String) fgrhVarV.c[i], fgrhVarV));
            }
        }
        Iterator it = DesugarCollections.unmodifiableList(arrayList).iterator();
        while (it.hasNext()) {
            if (fgrb.a(((fgrf) it.next()).a).startsWith(this.a)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format("[^%s]", this.a);
    }
}
