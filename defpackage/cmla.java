package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmla {
    public static final cmla a;
    public static final cmla b;
    public static final cmla c;
    private static final /* synthetic */ cmla[] d;

    static {
        cmla cmlaVar = new cmla("DEFAULT_CALL_SIM", 0);
        a = cmlaVar;
        cmla cmlaVar2 = new cmla("DEFAULT_SMS_SIM", 1);
        b = cmlaVar2;
        cmla cmlaVar3 = new cmla("DEFAULT_DATA_SIM", 2);
        c = cmlaVar3;
        cmla[] cmlaVarArr = {cmlaVar, cmlaVar2, cmlaVar3};
        d = cmlaVarArr;
        fczb.a(cmlaVarArr);
    }

    private cmla(String str, int i) {
    }

    public static cmla[] values() {
        return (cmla[]) d.clone();
    }
}
