package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cjja implements evst {
    FALLBACK_UNKNOWN(0),
    FALLBACK_DEFAULT(1),
    FALLBACK_REQUIRED(2),
    FALLBACK_NOT_ALLOWED(3);

    public final int e;

    cjja(int i) {
        this.e = i;
    }

    @Override // defpackage.evst
    public final int a() {
        return this.e;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.e);
    }
}
