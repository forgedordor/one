package defpackage;

import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgtc extends fgtd {
    public fgtc() {
    }

    @Override // defpackage.fguu
    public final boolean a(fgrs fgrsVar, fgrs fgrsVar2) {
        for (int i = 0; i < this.b; i++) {
            if (((fguu) this.a.get(i)).a(fgrsVar, fgrsVar2)) {
                return true;
            }
        }
        return false;
    }

    public final void b(fguu fguuVar) {
        this.a.add(fguuVar);
        c();
    }

    public final String toString() {
        return fgre.a(this.a, ", ");
    }

    public fgtc(Collection collection) {
        if (this.b > 1) {
            this.a.add(new fgtb(collection));
        } else {
            this.a.addAll(collection);
        }
        c();
    }
}
