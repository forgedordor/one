package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdmn {
    public static final cdmn a;
    public static final cdmn b;
    public static final cdmn c;
    public static final /* synthetic */ fcza d;
    private static final /* synthetic */ cdmn[] e;

    static {
        cdmn cdmnVar = new cdmn("UNKNOWN", 0);
        a = cdmnVar;
        cdmn cdmnVar2 = new cdmn("UNDER_SUPERVISION", 1);
        b = cdmnVar2;
        cdmn cdmnVar3 = new cdmn("SUPERVISION_DISABLED", 2);
        c = cdmnVar3;
        cdmn[] cdmnVarArr = {cdmnVar, cdmnVar2, cdmnVar3};
        e = cdmnVarArr;
        d = fczb.a(cdmnVarArr);
    }

    private cdmn(String str, int i) {
    }

    public static cdmn[] values() {
        return (cdmn[]) e.clone();
    }
}
