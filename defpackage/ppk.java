package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ppk {
    public final ppm[] a;
    public final byte[] b;
    public final int c;
    private final String d;

    public ppk(String str, ppm[] ppmVarArr) {
        this.d = str;
        this.b = null;
        this.a = ppmVarArr;
        this.c = 0;
    }

    private static final String c(int i) {
        return i != 0 ? "ArrayBuffer" : "String";
    }

    public final String a() {
        b(0);
        return this.d;
    }

    public final void b(int i) {
        int i2 = this.c;
        if (i == i2) {
            return;
        }
        throw new IllegalStateException("Wrong data accessor type detected. " + c(i2) + " expected, but got " + c(i));
    }

    public ppk(byte[] bArr, ppm[] ppmVarArr) {
        bArr.getClass();
        this.b = bArr;
        this.d = null;
        this.a = ppmVarArr;
        this.c = 1;
    }
}
