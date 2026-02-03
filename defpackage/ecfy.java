package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecfy extends RuntimeException {
    public ecfy() {
    }

    public ecfy(byte[] bArr) {
        super("The caller is trying to acquire a lease on too much data.");
    }

    public ecfy(Throwable th) {
        super(th);
    }
}
