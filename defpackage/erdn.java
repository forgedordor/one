package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class erdn {
    final long[] a;
    final long[] b;
    final long[] c;

    public erdn(long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = jArr3;
    }

    final void a(erdn erdnVar, int i) {
        erdm.a(this.a, erdnVar.a, i);
        erdm.a(this.b, erdnVar.b, i);
        erdm.a(this.c, erdnVar.c, i);
    }

    public void b(long[] jArr, long[] jArr2) {
        System.arraycopy(jArr2, 0, jArr, 0, 10);
    }

    erdn() {
        this(new long[10], new long[10], new long[10]);
    }

    public erdn(erdn erdnVar) {
        this.a = Arrays.copyOf(erdnVar.a, 10);
        this.b = Arrays.copyOf(erdnVar.b, 10);
        this.c = Arrays.copyOf(erdnVar.c, 10);
    }
}
