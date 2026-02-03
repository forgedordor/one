package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejvu implements ejvr {
    public static final ejvu a;
    private static final /* synthetic */ ejvu[] b;

    static {
        ejvu ejvuVar = new ejvu();
        a = ejvuVar;
        b = new ejvu[]{ejvuVar};
    }

    private ejvu() {
    }

    public static ejvu[] values() {
        return (ejvu[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Functions.identity()";
    }

    @Override // defpackage.ejvr
    public final Object apply(Object obj) {
        return obj;
    }
}
