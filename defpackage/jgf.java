package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jgf {
    public static final jgf a;
    public static final jgf b;
    public static final jgf c;
    private static final /* synthetic */ jgf[] d;

    static {
        jgf jgfVar = new jgf("ContinueTraversal", 0);
        a = jgfVar;
        jgf jgfVar2 = new jgf("SkipSubtreeAndContinueTraversal", 1);
        b = jgfVar2;
        jgf jgfVar3 = new jgf("CancelTraversal", 2);
        c = jgfVar3;
        jgf[] jgfVarArr = {jgfVar, jgfVar2, jgfVar3};
        d = jgfVarArr;
        fczb.a(jgfVarArr);
    }

    private jgf(String str, int i) {
    }

    public static jgf[] values() {
        return (jgf[]) d.clone();
    }
}
