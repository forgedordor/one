package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzhh {
    public static final bzhh a;
    public static final bzhh b;
    public static final bzhh c;
    public static final bzhh d;
    private static final /* synthetic */ bzhh[] e;
    private final String f;

    static {
        bzhh bzhhVar = new bzhh("UPDATE", 0, "Update");
        a = bzhhVar;
        bzhh bzhhVar2 = new bzhh("DELETE", 1, "Delete");
        b = bzhhVar2;
        bzhh bzhhVar3 = new bzhh("INSERT", 2, "Insert");
        c = bzhhVar3;
        bzhh bzhhVar4 = new bzhh("BATCH_INSERT", 3, "BatchInsert");
        d = bzhhVar4;
        bzhh[] bzhhVarArr = {bzhhVar, bzhhVar2, bzhhVar3, bzhhVar4};
        e = bzhhVarArr;
        fczb.a(bzhhVarArr);
    }

    private bzhh(String str, int i, String str2) {
        this.f = str2;
    }

    public static bzhh[] values() {
        return (bzhh[]) e.clone();
    }

    public final String a(String str) {
        return "Bugle.Cms." + str + "." + this.f;
    }

    public final String b(String str) {
        return a(str).concat(".Duration");
    }

    public final String c(String str) {
        return ordinal() != 3 ? a(str).concat(".Outcome") : a(str).concat(".Outcomes");
    }
}
