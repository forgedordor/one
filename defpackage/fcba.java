package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcba extends fbzg {
    private static final fcay b = new fcat();
    private static final fcay c = new fcau();
    private static final fcay d = new fcav();
    private static final fcay e = new fcaw();
    private static final fcaz f = new fcax();
    public int a;
    private final Deque g;
    private Deque h;
    private boolean i;

    public fcba() {
        new ArrayDeque(2);
        this.g = new ArrayDeque();
    }

    private final int m(fcaz fcazVar, int i, Object obj, int i2) {
        a(i);
        Deque deque = this.g;
        if (!deque.isEmpty()) {
            p();
        }
        while (i > 0 && !deque.isEmpty()) {
            fcix fcixVar = (fcix) deque.peek();
            int iMin = Math.min(i, fcixVar.f());
            i2 = fcazVar.a(fcixVar, iMin, obj, i2);
            i -= iMin;
            this.a -= iMin;
            p();
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    private final int n(fcay fcayVar, int i, Object obj, int i2) {
        try {
            return m(fcayVar, i, obj, i2);
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    private final void o() {
        if (!this.i) {
            ((fcix) this.g.remove()).close();
            return;
        }
        Deque deque = this.h;
        Deque deque2 = this.g;
        deque.add((fcix) deque2.remove());
        fcix fcixVar = (fcix) deque2.peek();
        if (fcixVar != null) {
            fcixVar.b();
        }
    }

    private final void p() {
        if (((fcix) this.g.peek()).f() == 0) {
            o();
        }
    }

    @Override // defpackage.fbzg, defpackage.fcix
    public final void b() {
        if (this.h == null) {
            this.h = new ArrayDeque(Math.min(this.g.size(), 16));
        }
        while (!this.h.isEmpty()) {
            ((fcix) this.h.remove()).close();
        }
        this.i = true;
        fcix fcixVar = (fcix) this.g.peek();
        if (fcixVar != null) {
            fcixVar.b();
        }
    }

    @Override // defpackage.fbzg, defpackage.fcix
    public final void c() {
        if (!this.i) {
            throw new InvalidMarkException();
        }
        Deque deque = this.g;
        fcix fcixVar = (fcix) deque.peek();
        if (fcixVar != null) {
            int iF = fcixVar.f();
            fcixVar.c();
            this.a += fcixVar.f() - iF;
        }
        while (true) {
            fcix fcixVar2 = (fcix) this.h.pollLast();
            if (fcixVar2 == null) {
                return;
            }
            fcixVar2.c();
            deque.addFirst(fcixVar2);
            this.a += fcixVar2.f();
        }
    }

    @Override // defpackage.fbzg, defpackage.fcix, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        while (true) {
            Deque deque = this.g;
            if (deque.isEmpty()) {
                break;
            } else {
                ((fcix) deque.remove()).close();
            }
        }
        if (this.h != null) {
            while (!this.h.isEmpty()) {
                ((fcix) this.h.remove()).close();
            }
        }
    }

    @Override // defpackage.fbzg, defpackage.fcix
    public final boolean d() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            if (!((fcix) it.next()).d()) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.fcix
    public final int e() {
        return n(b, 1, null, 0);
    }

    @Override // defpackage.fcix
    public final int f() {
        return this.a;
    }

    @Override // defpackage.fcix
    public final fcix g(int i) {
        fcix fcixVarG;
        int i2;
        fcix fcixVarG2;
        if (i <= 0) {
            return fcjb.a;
        }
        a(i);
        this.a -= i;
        fcix fcixVar = null;
        fcba fcbaVar = null;
        while (true) {
            Deque deque = this.g;
            fcix fcixVar2 = (fcix) deque.peek();
            int iF = fcixVar2.f();
            if (iF > i) {
                fcixVarG2 = fcixVar2.g(i);
                i2 = 0;
            } else {
                if (this.i) {
                    fcixVarG = fcixVar2.g(iF);
                    o();
                } else {
                    fcixVarG = (fcix) deque.poll();
                }
                fcix fcixVar3 = fcixVarG;
                i2 = i - iF;
                fcixVarG2 = fcixVar3;
            }
            if (fcixVar == null) {
                fcixVar = fcixVarG2;
            } else {
                if (fcbaVar == null) {
                    fcbaVar = new fcba(i2 != 0 ? Math.min(deque.size() + 2, 16) : 2);
                    fcbaVar.h(fcixVar);
                    fcixVar = fcbaVar;
                }
                fcbaVar.h(fcixVarG2);
            }
            if (i2 <= 0) {
                return fcixVar;
            }
            i = i2;
        }
    }

    public final void h(fcix fcixVar) {
        boolean z = this.i && this.g.isEmpty();
        if (fcixVar instanceof fcba) {
            fcba fcbaVar = (fcba) fcixVar;
            while (true) {
                Deque deque = fcbaVar.g;
                if (deque.isEmpty()) {
                    break;
                } else {
                    this.g.add((fcix) deque.remove());
                }
            }
            this.a += fcbaVar.a;
            fcbaVar.a = 0;
            fcbaVar.close();
        } else {
            this.g.add(fcixVar);
            this.a += fcixVar.f();
        }
        if (z) {
            ((fcix) this.g.peek()).b();
        }
    }

    @Override // defpackage.fcix
    public final void i(ByteBuffer byteBuffer) {
        n(e, byteBuffer.remaining(), byteBuffer, 0);
    }

    @Override // defpackage.fcix
    public final void j(OutputStream outputStream, int i) {
        m(f, i, outputStream, 0);
    }

    @Override // defpackage.fcix
    public final void k(byte[] bArr, int i, int i2) {
        n(d, i2, bArr, i);
    }

    @Override // defpackage.fcix
    public final void l(int i) {
        n(c, i, null, 0);
    }

    public fcba(int i) {
        new ArrayDeque(2);
        this.g = new ArrayDeque(i);
    }
}
