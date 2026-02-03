package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bhs extends bhr {
    public final List a = new ArrayList();

    public bhs(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bhr bhrVar = (bhr) it.next();
            if (!(bhrVar instanceof bht)) {
                this.a.add(bhrVar);
            }
        }
    }

    @Override // defpackage.bhr
    public final void a(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bhr) it.next()).a(i);
        }
    }

    @Override // defpackage.bhr
    public final void b(int i, bib bibVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bhr) it.next()).b(i, bibVar);
        }
    }

    @Override // defpackage.bhr
    public final void c(int i, bhv bhvVar) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bhr) it.next()).c(i, bhvVar);
        }
    }

    @Override // defpackage.bhr
    public final void d(int i) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bhr) it.next()).d(i);
        }
    }
}
