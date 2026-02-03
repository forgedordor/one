package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class noy {
    private final byte[] a = new byte[10];
    private boolean b;
    private int c;
    private long d;
    private int e;
    private int f;
    private int g;

    public final void a(nox noxVar, now nowVar) {
        if (this.c > 0) {
            noxVar.o(this.d, this.e, this.f, this.g, nowVar);
            this.c = 0;
        }
    }

    public final void b() {
        this.b = false;
        this.c = 0;
    }

    public final void c(nox noxVar, long j, int i, int i2, int i3, now nowVar) {
        mee.d(this.g <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(noxVar, nowVar);
            }
        }
    }

    public final void d(nns nnsVar) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.a;
        nnsVar.i(bArr, 0, 10);
        nnsVar.k();
        int[] iArr = nmt.a;
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
            this.b = true;
        }
    }
}
