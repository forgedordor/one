package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class cze {
    public static final cze a;
    public static final cze b;
    public static final cze c;
    private static final /* synthetic */ cze[] d;

    static {
        cze czeVar = new cze("PreEnter", 0);
        a = czeVar;
        cze czeVar2 = new cze("Visible", 1);
        b = czeVar2;
        cze czeVar3 = new cze("PostExit", 2);
        c = czeVar3;
        cze[] czeVarArr = {czeVar, czeVar2, czeVar3};
        d = czeVarArr;
        fczb.a(czeVarArr);
    }

    private cze(String str, int i) {
    }

    public static cze[] values() {
        return (cze[]) d.clone();
    }
}
