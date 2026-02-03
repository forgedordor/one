package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ecnd extends Exception {
    public ecnd(Throwable th) {
        super("An unknown error occurred during upgrade. The upgrade may fail repeatedly when retried.", th);
    }
}
