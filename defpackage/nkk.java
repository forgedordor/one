package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nkk implements nlu {
    final /* synthetic */ nkw a;

    public nkk(nkw nkwVar) {
        this.a = nkwVar;
    }

    @Override // defpackage.nlu
    public final void a(nlw nlwVar) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((nkr) it.next()).y(mcw.a(nlwVar));
        }
    }

    @Override // defpackage.nlu
    public final void b() {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((nkr) it.next()).z();
        }
    }

    @Override // defpackage.nlu
    public final void d() {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((nkr) it.next()).B();
        }
    }

    @Override // defpackage.nlu
    public final void e(mde mdeVar) {
        Iterator it = this.a.h.iterator();
        while (it.hasNext()) {
            ((nkr) it.next()).C(mdeVar);
        }
    }

    @Override // defpackage.nlu
    public final /* synthetic */ void c() {
    }
}
