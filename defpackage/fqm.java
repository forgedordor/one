package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
final class fqm {
    public static final fqm a;
    public static final fqm b;
    public static final fqm c;
    private static final /* synthetic */ fqm[] d;

    static {
        fqm fqmVar = new fqm("Focused", 0);
        a = fqmVar;
        fqm fqmVar2 = new fqm("UnfocusedEmpty", 1);
        b = fqmVar2;
        fqm fqmVar3 = new fqm("UnfocusedNotEmpty", 2);
        c = fqmVar3;
        fqm[] fqmVarArr = {fqmVar, fqmVar2, fqmVar3};
        d = fqmVarArr;
        fczb.a(fqmVarArr);
    }

    private fqm(String str, int i) {
    }

    public static fqm[] values() {
        return (fqm[]) d.clone();
    }
}
