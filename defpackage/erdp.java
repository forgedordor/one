package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erdp {
    final erdq a;
    final long[] b;

    public erdp(erdq erdqVar, long[] jArr) {
        this.a = erdqVar;
        this.b = jArr;
    }

    public erdp() {
        this(new erdq(), new long[10]);
    }

    public erdp(erdp erdpVar) {
        this.a = new erdq(erdpVar.a);
        this.b = Arrays.copyOf(erdpVar.b, 10);
    }
}
