package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgnw {
    public static final dgnw a;
    public static final dgnw b;
    public static final dgnw c;
    private static final /* synthetic */ dgnw[] d;

    static {
        dgnw dgnwVar = new dgnw("NOT_INITIALIZED", 0);
        a = dgnwVar;
        dgnw dgnwVar2 = new dgnw("INITIALIZING", 1);
        b = dgnwVar2;
        dgnw dgnwVar3 = new dgnw("INITIALIZED", 2);
        c = dgnwVar3;
        dgnw[] dgnwVarArr = {dgnwVar, dgnwVar2, dgnwVar3};
        d = dgnwVarArr;
        fczb.a(dgnwVarArr);
    }

    private dgnw(String str, int i) {
    }

    public static dgnw[] values() {
        return (dgnw[]) d.clone();
    }
}
