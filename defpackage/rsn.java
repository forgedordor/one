package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rsn implements rrx {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.rrx
    public final void m() {
        Iterator it = rvk.h(this.a).iterator();
        while (it.hasNext()) {
            ((rua) it.next()).m();
        }
    }

    @Override // defpackage.rrx
    public final void n() {
        Iterator it = rvk.h(this.a).iterator();
        while (it.hasNext()) {
            ((rua) it.next()).n();
        }
    }

    @Override // defpackage.rrx
    public final void o() {
        Iterator it = rvk.h(this.a).iterator();
        while (it.hasNext()) {
            ((rua) it.next()).o();
        }
    }
}
