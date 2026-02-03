package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnwy {
    public static final dnwy a;
    public static final dnwy b;
    public static final dnwy c;
    public static final dnwy d;
    private static final /* synthetic */ dnwy[] e;

    static {
        dnwy dnwyVar = new dnwy("REACTIONS_BAR", 0);
        a = dnwyVar;
        dnwy dnwyVar2 = new dnwy("REACTIONS_BOTTOM_SHEET", 1);
        b = dnwyVar2;
        dnwy dnwyVar3 = new dnwy("EMOJI_PICKER", 2);
        c = dnwyVar3;
        dnwy dnwyVar4 = new dnwy("SMART_ACTION", 3);
        d = dnwyVar4;
        dnwy[] dnwyVarArr = {dnwyVar, dnwyVar2, dnwyVar3, dnwyVar4};
        e = dnwyVarArr;
        fczb.a(dnwyVarArr);
    }

    private dnwy(String str, int i) {
    }

    public static dnwy[] values() {
        return (dnwy[]) e.clone();
    }
}
