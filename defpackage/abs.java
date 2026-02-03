package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class abs {
    private final CopyOnWriteArrayList a = new CopyOnWriteArrayList();
    public boolean b;
    public fdae c;

    public abs(boolean z) {
        this.b = z;
    }

    public abstract void b();

    public final void e(aap aapVar) {
        this.a.add(aapVar);
    }

    public final void f() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((aap) it.next()).b();
        }
    }

    public final void g(aap aapVar) {
        this.a.remove(aapVar);
    }

    public final void h(boolean z) {
        this.b = z;
        fdae fdaeVar = this.c;
        if (fdaeVar != null) {
            fdaeVar.invoke();
        }
    }

    public void a() {
    }

    public void c(aao aaoVar) {
    }

    public void d(aao aaoVar) {
    }
}
