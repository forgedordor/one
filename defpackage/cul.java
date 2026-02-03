package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cul extends cts {
    public cul() {
        this((byte[]) null);
    }

    public final void a(int i) {
        long[] jArr = this.a;
        int length = jArr.length;
        if (length < i) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i, (length * 3) / 2));
            jArrCopyOf.getClass();
            this.a = jArrCopyOf;
        }
    }

    public final void b(long j) {
        a(this.b + 1);
        long[] jArr = this.a;
        int i = this.b;
        jArr[i] = j;
        this.b = i + 1;
    }

    public cul(int i) {
        super(i);
    }

    public /* synthetic */ cul(byte[] bArr) {
        super(16);
    }
}
