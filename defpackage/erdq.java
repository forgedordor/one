package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erdq {
    final long[] a;
    final long[] b;
    final long[] c;

    public erdq(long[] jArr, long[] jArr2, long[] jArr3) {
        this.a = jArr;
        this.b = jArr2;
        this.c = jArr3;
    }

    static void b(erdq erdqVar, erdp erdpVar) {
        erdq erdqVar2 = erdpVar.a;
        long[] jArr = erdqVar.a;
        long[] jArr2 = erdqVar2.a;
        long[] jArr3 = erdpVar.b;
        erdz.b(jArr, jArr2, jArr3);
        long[] jArr4 = erdqVar.b;
        long[] jArr5 = erdqVar2.b;
        long[] jArr6 = erdqVar2.c;
        erdz.b(jArr4, jArr5, jArr6);
        erdz.b(erdqVar.c, jArr6, jArr3);
    }

    public final byte[] a() {
        long[] jArr = new long[10];
        long[] jArr2 = new long[10];
        long[] jArr3 = new long[10];
        erdz.a(jArr, this.c);
        erdz.b(jArr2, this.a, jArr);
        erdz.b(jArr3, this.b, jArr);
        byte[] bArrK = erdz.k(jArr3);
        bArrK[31] = (byte) ((erds.a(jArr2) << 7) ^ bArrK[31]);
        return bArrK;
    }

    public erdq() {
        this(new long[10], new long[10], new long[10]);
    }

    public erdq(erdp erdpVar) {
        this();
        b(this, erdpVar);
    }

    public erdq(erdq erdqVar) {
        this.a = Arrays.copyOf(erdqVar.a, 10);
        this.b = Arrays.copyOf(erdqVar.b, 10);
        this.c = Arrays.copyOf(erdqVar.c, 10);
    }
}
