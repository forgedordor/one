package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class dod {
    public static final dod a;
    public static final dod b;
    public static final dod c;
    private static final /* synthetic */ dod[] d;

    static {
        dod dodVar = new dod("Default", 0);
        a = dodVar;
        dod dodVar2 = new dod("UserInput", 1);
        b = dodVar2;
        dod dodVar3 = new dod("PreventUserInput", 2);
        c = dodVar3;
        dod[] dodVarArr = {dodVar, dodVar2, dodVar3};
        d = dodVarArr;
        fczb.a(dodVarArr);
    }

    private dod(String str, int i) {
    }

    public static dod[] values() {
        return (dod[]) d.clone();
    }
}
