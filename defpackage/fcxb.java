package defpackage;

import java.util.ConcurrentModificationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fcxb {
    public final fcxe a;
    public int b;
    public int c = -1;
    private int d;

    public fcxb(fcxe fcxeVar) {
        this.a = fcxeVar;
        this.d = fcxeVar.f;
        b();
    }

    public final void a() {
        if (this.a.f != this.d) {
            throw new ConcurrentModificationException();
        }
    }

    public final void b() {
        while (true) {
            int i = this.b;
            fcxe fcxeVar = this.a;
            if (i >= fcxeVar.e || fcxeVar.d[i] >= 0) {
                return;
            } else {
                this.b = i + 1;
            }
        }
    }

    public final boolean hasNext() {
        return this.b < this.a.e;
    }

    public final void remove() {
        a();
        if (this.c == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        fcxe fcxeVar = this.a;
        fcxeVar.f();
        fcxeVar.g(this.c);
        this.c = -1;
        this.d = fcxeVar.f;
    }
}
