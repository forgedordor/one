package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class jue {
    public static final jue a;
    public static final jue b;
    public static final jue c;
    private static final /* synthetic */ jue[] d;

    static {
        jue jueVar = new jue("On", 0);
        a = jueVar;
        jue jueVar2 = new jue("Off", 1);
        b = jueVar2;
        jue jueVar3 = new jue("Indeterminate", 2);
        c = jueVar3;
        jue[] jueVarArr = {jueVar, jueVar2, jueVar3};
        d = jueVarArr;
        fczb.a(jueVarArr);
    }

    private jue(String str, int i) {
    }

    public static jue[] values() {
        return (jue[]) d.clone();
    }
}
