package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class qbf {
    public static final qbf a;
    public static final qbf b;
    private static final /* synthetic */ qbf[] c;

    static {
        qbf qbfVar = new qbf("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
        a = qbfVar;
        qbf qbfVar2 = new qbf("DROP_WORK_REQUEST", 1);
        b = qbfVar2;
        qbf[] qbfVarArr = {qbfVar, qbfVar2};
        c = qbfVarArr;
        fczb.a(qbfVarArr);
    }

    private qbf(String str, int i) {
    }

    public static qbf[] values() {
        return (qbf[]) c.clone();
    }
}
