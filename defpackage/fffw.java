package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fffw {
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public fffw f;
    public fffw g;

    public fffw() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    public final fffw a() {
        fffw fffwVar = this.f;
        fffw fffwVar2 = fffwVar != this ? fffwVar : null;
        fffw fffwVar3 = this.g;
        fffwVar3.getClass();
        fffwVar3.f = fffwVar;
        fffw fffwVar4 = this.f;
        fffwVar4.getClass();
        fffwVar4.g = fffwVar3;
        this.f = null;
        this.g = null;
        return fffwVar2;
    }

    public final fffw b() {
        this.d = true;
        return new fffw(this.a, this.b, this.c, true);
    }

    public final void c(fffw fffwVar, int i) {
        if (!fffwVar.e) {
            throw new IllegalStateException("only owner can write");
        }
        int i2 = fffwVar.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (fffwVar.d) {
                throw new IllegalArgumentException();
            }
            int i4 = fffwVar.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = fffwVar.a;
            fcur.i(bArr, bArr, 0, i4, i2);
            i2 = fffwVar.c - fffwVar.b;
            fffwVar.c = i2;
            fffwVar.b = 0;
        }
        byte[] bArr2 = this.a;
        byte[] bArr3 = fffwVar.a;
        int i5 = this.b;
        fcur.i(bArr2, bArr3, i2, i5, i5 + i);
        fffwVar.c += i;
        this.b += i;
    }

    public final void d(fffw fffwVar) {
        fffwVar.g = this;
        fffwVar.f = this.f;
        fffw fffwVar2 = this.f;
        fffwVar2.getClass();
        fffwVar2.g = fffwVar;
        this.f = fffwVar;
    }

    public fffw(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }
}
