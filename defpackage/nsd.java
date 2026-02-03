package defpackage;

import java.util.ArrayDeque;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nsd {
    public final byte[] a = new byte[8];
    public final ArrayDeque b = new ArrayDeque();
    public final nsi c = new nsi();
    public int d;
    public int e;
    public long f;
    public nse g;

    public final long a(nns nnsVar, int i) {
        nnsVar.j(this.a, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (r0[i2] & 255);
        }
        return j;
    }
}
