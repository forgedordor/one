package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bajj {
    public static final Object a = new Object();
    public static String b;
    public static bajj c;
    public final byte[] d;
    public final byte[] e;

    public bajj(byte[] bArr, byte[] bArr2) {
        this.d = bArr;
        this.e = bArr2;
    }

    public static bajj a(String str) {
        synchronized (a) {
            if (!str.equals(b)) {
                return null;
            }
            return c;
        }
    }

    public static void b(String str, bajj bajjVar) {
        synchronized (a) {
            b = str;
            c = bajjVar;
        }
    }

    public static byte[] d(byte[] bArr, byte[] bArr2) {
        return eomt.b(bArr, bArr2);
    }

    public final boolean c() {
        byte[] bArr;
        byte[] bArr2 = this.d;
        return bArr2 != null && bArr2.length == 32 && (bArr = this.e) != null && bArr.length == 32;
    }
}
