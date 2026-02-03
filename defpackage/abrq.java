package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abrq extends RuntimeException {
    public abrq() {
        super("Received a failed response from Ditto");
    }

    public abrq(Throwable th) {
        super("Could not parse conversation reply payload", th);
    }
}
