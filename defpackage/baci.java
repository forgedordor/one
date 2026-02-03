package defpackage;

import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class baci implements cqci {
    public final HashSet a = new HashSet();
    public final Object b = new Object();

    public final void a() {
        HashSet hashSet;
        synchronized (this.b) {
            hashSet = (HashSet) this.a.clone();
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((bach) it.next()).a();
        }
    }

    @Override // defpackage.cqci
    public final void i(int i) {
        a();
    }
}
