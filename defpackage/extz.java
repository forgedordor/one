package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class extz {
    public final Deque a = new ArrayDeque(16);

    public static final void f(String str) throws IOException {
        throw new IOException(str);
    }

    public static final void g(String str, Object... objArr) throws IOException {
        f(String.format(str, objArr));
    }

    public final long a() {
        Deque deque = this.a;
        if (deque.isEmpty()) {
            return 0L;
        }
        return ((Long) deque.peek()).longValue();
    }

    public final void b() throws IOException {
        Deque deque = this.a;
        if (deque.isEmpty()) {
            return;
        }
        g("data item not completed, stackSize: %s scope: %s", Integer.valueOf(deque.size()), Long.valueOf(a()));
    }

    public final void c(long j) throws IOException {
        long jA = a();
        if (jA != j) {
            if (jA != -1) {
                if (jA != -2) {
                    return;
                } else {
                    jA = -2;
                }
            }
            g("expected non-string scope or scope %s but found %s", Long.valueOf(j), Long.valueOf(jA));
        }
    }

    public final void d(long j) {
        this.a.push(Long.valueOf(j));
    }

    public final void e(long j) {
        Deque deque = this.a;
        deque.pop();
        deque.push(Long.valueOf(j));
    }
}
