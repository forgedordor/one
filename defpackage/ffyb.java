package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffyb extends RuntimeException {
    public ffyb(String str, Throwable th) {
        super("Native stack trace:" + System.lineSeparator() + str, th);
    }
}
