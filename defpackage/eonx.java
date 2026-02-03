package defpackage;

import j$.time.Instant;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eonx implements eony {
    public static final eonx a;
    private static final /* synthetic */ eonx[] b;

    static {
        eonx eonxVar = new eonx();
        a = eonxVar;
        b = new eonx[]{eonxVar};
    }

    private eonx() {
    }

    public static eonx[] values() {
        return (eonx[]) b.clone();
    }

    @Override // defpackage.eony
    public final Instant a() {
        return Instant.now();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "TimeSource.system()";
    }
}
