package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mcw extends Exception {
    public mcw(String str) {
        super(str);
    }

    public static mcw a(Exception exc) {
        return exc instanceof mcw ? (mcw) exc : new mcw(exc, null);
    }

    public mcw(Throwable th) {
        super(th);
    }

    public mcw(Throwable th, byte[] bArr) {
        super(th);
    }
}
