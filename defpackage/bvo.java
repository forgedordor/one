package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bvo extends bhr {
    final /* synthetic */ bvp a;

    public bvo(bvp bvpVar) {
        this.a = bvpVar;
    }

    @Override // defpackage.bhr
    public final void b(int i, bib bibVar) {
        Iterator it = this.a.a.iterator();
        while (it.hasNext()) {
            bml bmlVar = ((bdr) it.next()).q;
            Iterator it2 = bmlVar.e().iterator();
            while (it2.hasNext()) {
                ((bhr) it2.next()).b(i, new bvq(bibVar, bmlVar.g.j, -1L));
            }
        }
    }
}
