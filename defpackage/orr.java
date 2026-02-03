package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class orr {
    public static final orr a;
    public static final orr b;
    public static final orr c;
    private static final /* synthetic */ orr[] d;

    static {
        orr orrVar = new orr("REFRESH", 0);
        a = orrVar;
        orr orrVar2 = new orr("PREPEND", 1);
        b = orrVar2;
        orr orrVar3 = new orr("APPEND", 2);
        c = orrVar3;
        orr[] orrVarArr = {orrVar, orrVar2, orrVar3};
        d = orrVarArr;
        fczb.a(orrVarArr);
    }

    private orr(String str, int i) {
    }

    public static orr[] values() {
        return (orr[]) d.clone();
    }
}
