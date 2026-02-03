package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdup {
    public static final fdup a;
    public static final fdup b;
    public static final fdup c;
    private static final /* synthetic */ fdup[] d;

    static {
        fdup fdupVar = new fdup("START", 0);
        a = fdupVar;
        fdup fdupVar2 = new fdup("STOP", 1);
        b = fdupVar2;
        fdup fdupVar3 = new fdup("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = fdupVar3;
        fdup[] fdupVarArr = {fdupVar, fdupVar2, fdupVar3};
        d = fdupVarArr;
        fczb.a(fdupVarArr);
    }

    private fdup(String str, int i) {
    }

    public static fdup[] values() {
        return (fdup[]) d.clone();
    }
}
