package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkkh {
    public static final dkkh a;
    public static final dkkh b;
    public static final dkkh c;
    public static final dkkh d;
    private static final /* synthetic */ dkkh[] e;

    static {
        dkkh dkkhVar = new dkkh("SINGLE", 0);
        a = dkkhVar;
        dkkh dkkhVar2 = new dkkh("TOP", 1);
        b = dkkhVar2;
        dkkh dkkhVar3 = new dkkh("MIDDLE", 2);
        c = dkkhVar3;
        dkkh dkkhVar4 = new dkkh("BOTTOM", 3);
        d = dkkhVar4;
        dkkh[] dkkhVarArr = {dkkhVar, dkkhVar2, dkkhVar3, dkkhVar4};
        e = dkkhVarArr;
        fczb.a(dkkhVarArr);
    }

    private dkkh(String str, int i) {
    }

    public static dkkh[] values() {
        return (dkkh[]) e.clone();
    }
}
