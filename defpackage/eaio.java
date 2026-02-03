package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaio {
    public static final eaio a;
    public static final eaio b;
    public static final eaio c;
    private static final /* synthetic */ eaio[] d;

    static {
        eaio eaioVar = new eaio("None", 0);
        a = eaioVar;
        eaio eaioVar2 = new eaio("ForceOnTop", 1);
        b = eaioVar2;
        eaio eaioVar3 = new eaio("ForceBehind", 2);
        c = eaioVar3;
        eaio[] eaioVarArr = {eaioVar, eaioVar2, eaioVar3};
        d = eaioVarArr;
        fczb.a(eaioVarArr);
    }

    private eaio(String str, int i) {
    }

    public static eaio[] values() {
        return (eaio[]) d.clone();
    }
}
