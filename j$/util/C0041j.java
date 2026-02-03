package j$.util;

import java.util.RandomAccess;

/* renamed from: j$.util.j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0041j extends C0039h implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    private Object writeReplace() {
        return new C0039h(this.c);
    }

    @Override // j$.util.C0039h, java.util.List
    public final java.util.List subList(int i, int i2) {
        C0041j c0041j;
        synchronized (this.b) {
            c0041j = new C0041j(this.c.subList(i, i2), this.b);
        }
        return c0041j;
    }
}
