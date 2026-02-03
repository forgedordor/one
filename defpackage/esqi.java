package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esqi extends Exception {
    public esqi() {
        super("Failed to get a Native provider. Rejecting JavaCronetEngine fallback.");
    }

    public esqi(Throwable th) {
        super("Failed to get a Native provider", th);
    }
}
