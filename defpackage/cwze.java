package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwze {
    public static final cwze a;
    public static final cwze b;
    public static final cwze c;
    public static final cwze d;
    private static final /* synthetic */ cwze[] f;
    public final long e;

    static {
        cwze cwzeVar = new cwze("UNKNOWN", 0, 0L);
        a = cwzeVar;
        cwze cwzeVar2 = new cwze("INSERT", 1, 1L);
        b = cwzeVar2;
        cwze cwzeVar3 = new cwze("UPDATE", 2, 2L);
        c = cwzeVar3;
        cwze cwzeVar4 = new cwze("DELETE", 3, 3L);
        d = cwzeVar4;
        cwze[] cwzeVarArr = {cwzeVar, cwzeVar2, cwzeVar3, cwzeVar4};
        f = cwzeVarArr;
        fczb.a(cwzeVarArr);
    }

    private cwze(String str, int i, long j) {
        this.e = j;
    }

    public static cwze[] values() {
        return (cwze[]) f.clone();
    }
}
