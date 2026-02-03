package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctgs {
    public static final ctgs a;
    public static final ctgs b;
    public static final ctgs c;
    private static final /* synthetic */ ctgs[] e;
    public final int d;

    static {
        ctgs ctgsVar = new ctgs("IMPRESSION", 0, 0);
        a = ctgsVar;
        ctgs ctgsVar2 = new ctgs("POSITIVE", 1, 1);
        b = ctgsVar2;
        ctgs ctgsVar3 = new ctgs("NEGATIVE", 2, 2);
        c = ctgsVar3;
        ctgs[] ctgsVarArr = {ctgsVar, ctgsVar2, ctgsVar3};
        e = ctgsVarArr;
        fczb.a(ctgsVarArr);
    }

    private ctgs(String str, int i, int i2) {
        this.d = i2;
    }

    public static ctgs[] values() {
        return (ctgs[]) e.clone();
    }
}
