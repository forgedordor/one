package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdgn {
    public static final cdgn a;
    public static final cdgn b;
    public static final cdgn c;
    private static final /* synthetic */ cdgn[] d;

    static {
        cdgn cdgnVar = new cdgn("YES", 0);
        a = cdgnVar;
        cdgn cdgnVar2 = new cdgn("NO", 1);
        b = cdgnVar2;
        cdgn cdgnVar3 = new cdgn("UNKNOWN", 2);
        c = cdgnVar3;
        cdgn[] cdgnVarArr = {cdgnVar, cdgnVar2, cdgnVar3};
        d = cdgnVarArr;
        fczb.a(cdgnVarArr);
    }

    private cdgn(String str, int i) {
    }

    public static cdgn[] values() {
        return (cdgn[]) d.clone();
    }
}
