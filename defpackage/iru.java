package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class iru {
    public static final iru a;
    public static final iru b;
    public static final iru c;
    private static final /* synthetic */ iru[] d;

    static {
        iru iruVar = new iru("Initial", 0);
        a = iruVar;
        iru iruVar2 = new iru("Main", 1);
        b = iruVar2;
        iru iruVar3 = new iru("Final", 2);
        c = iruVar3;
        iru[] iruVarArr = {iruVar, iruVar2, iruVar3};
        d = iruVarArr;
        fczb.a(iruVarArr);
    }

    private iru(String str, int i) {
    }

    public static iru[] values() {
        return (iru[]) d.clone();
    }
}
