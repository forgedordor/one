package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgzv {
    public static final cgzv a;
    public static final cgzv b;
    private static final /* synthetic */ cgzv[] c;

    static {
        cgzv cgzvVar = new cgzv("ACTIVE", 0);
        a = cgzvVar;
        cgzv cgzvVar2 = new cgzv("PAUSED", 1);
        b = cgzvVar2;
        cgzv[] cgzvVarArr = {cgzvVar, cgzvVar2};
        c = cgzvVarArr;
        fczb.a(cgzvVarArr);
    }

    private cgzv(String str, int i) {
    }

    public static cgzv[] values() {
        return (cgzv[]) c.clone();
    }
}
