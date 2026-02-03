package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mok {
    public final Deque a;
    public final Deque b;
    public final int c;
    private final boolean d;

    public mok(boolean z, int i) {
        this.c = i;
        this.d = z;
        this.a = new ArrayDeque(i);
        this.b = new ArrayDeque(i);
    }

    private final Iterator h() {
        return ekeh.b(this.a, this.b).iterator();
    }

    private final void i(may mayVar, int i, int i2) {
        Deque deque = this.a;
        mee.c(deque.isEmpty());
        mee.c(this.b.isEmpty());
        for (int i3 = 0; i3 < this.c; i3++) {
            deque.add(mayVar.d(mev.c(i, i2, this.d), i, i2));
        }
    }

    public final int a() {
        return !g() ? this.c : this.a.size();
    }

    public final maz b() {
        Deque deque = this.a;
        if (deque.isEmpty()) {
            throw new IllegalStateException("Textures are all in use. Please release in-use textures before calling useTexture.");
        }
        maz mazVar = (maz) deque.remove();
        this.b.add(mazVar);
        return mazVar;
    }

    public final void c() {
        Iterator itH = h();
        while (itH.hasNext()) {
            ((maz) itH.next()).a();
        }
        this.a.clear();
        this.b.clear();
    }

    public final void d(may mayVar, int i, int i2) {
        if (!g()) {
            i(mayVar, i, i2);
            return;
        }
        maz mazVar = (maz) h().next();
        if (mazVar.d == i && mazVar.e == i2) {
            return;
        }
        c();
        i(mayVar, i, i2);
    }

    public final void e() {
        Deque deque = this.a;
        Deque deque2 = this.b;
        deque.addAll(deque2);
        deque2.clear();
    }

    public final void f() {
        Deque deque = this.b;
        mee.c(!deque.isEmpty());
        this.a.add((maz) deque.remove());
    }

    public final boolean g() {
        return h().hasNext();
    }
}
