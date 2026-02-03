package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmi extends IllegalStateException {
    private final String a;

    public hmi(String str) {
        this.a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }
}
