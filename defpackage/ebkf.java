package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebkf {
    public static final ebkf a;
    private static final /* synthetic */ ebkf[] b;
    private final String c = "IN";

    static {
        ebkf ebkfVar = new ebkf();
        a = ebkfVar;
        b = new ebkf[]{ebkfVar};
    }

    private ebkf() {
    }

    public static ebkf[] values() {
        return (ebkf[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.c;
    }
}
