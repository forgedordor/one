package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqdz {
    public static final eqdz a;
    public static final eqdz b;
    public static final eqdz c;
    private static final /* synthetic */ eqdz[] d;

    static {
        eqdz eqdzVar = new eqdz("UNKNOWN", 0);
        a = eqdzVar;
        eqdz eqdzVar2 = new eqdz("DEFAULT", 1);
        b = eqdzVar2;
        eqdz eqdzVar3 = new eqdz("ADMINISTRATOR", 2);
        c = eqdzVar3;
        eqdz[] eqdzVarArr = {eqdzVar, eqdzVar2, eqdzVar3};
        d = eqdzVarArr;
        fczb.a(eqdzVarArr);
    }

    private eqdz(String str, int i) {
    }

    public static eqdz[] values() {
        return (eqdz[]) d.clone();
    }
}
