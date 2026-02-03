package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqgo {
    public static final dqgo a;
    public static final dqgo b;
    public static final dqgo c;
    private static final /* synthetic */ dqgo[] d;

    static {
        dqgo dqgoVar = new dqgo("PRE_RECORDING", 0);
        a = dqgoVar;
        dqgo dqgoVar2 = new dqgo("RECORDING", 1);
        b = dqgoVar2;
        dqgo dqgoVar3 = new dqgo("PLAYBACK", 2);
        c = dqgoVar3;
        dqgo[] dqgoVarArr = {dqgoVar, dqgoVar2, dqgoVar3};
        d = dqgoVarArr;
        fczb.a(dqgoVarArr);
    }

    private dqgo(String str, int i) {
    }

    public static dqgo[] values() {
        return (dqgo[]) d.clone();
    }
}
