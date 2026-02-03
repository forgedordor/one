package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqep {
    public static final eqep a;
    public static final eqep b;
    public static final eqep c;
    public static final eqep d;
    private static final /* synthetic */ eqep[] e;

    static {
        eqep eqepVar = new eqep("UNKNOWN", 0);
        a = eqepVar;
        eqep eqepVar2 = new eqep("USER", 1);
        b = eqepVar2;
        eqep eqepVar3 = new eqep("CONTROL", 2);
        c = eqepVar3;
        eqep eqepVar4 = new eqep("EPHEMERAL", 3);
        d = eqepVar4;
        eqep[] eqepVarArr = {eqepVar, eqepVar2, eqepVar3, eqepVar4};
        e = eqepVarArr;
        fczb.a(eqepVarArr);
    }

    private eqep(String str, int i) {
    }

    public static eqep[] values() {
        return (eqep[]) e.clone();
    }
}
