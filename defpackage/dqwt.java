package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqwt extends Exception {
    public dqwt() {
    }

    public dqwt(byte[] bArr) {
        super("Cannot set query for invalid data source.");
    }

    public dqwt(Throwable th) {
        super("db query cancelled", th);
    }
}
