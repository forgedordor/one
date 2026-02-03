package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cblu {
    public static final cblu a;
    public static final cblu b;
    private static final /* synthetic */ cblu[] c;

    static {
        cblu cbluVar = new cblu("WORK_MANAGER", 0);
        a = cbluVar;
        cblu cbluVar2 = new cblu("EAGER_EVALUATION", 1);
        b = cbluVar2;
        cblu[] cbluVarArr = {cbluVar, cbluVar2};
        c = cbluVarArr;
        fczb.a(cbluVarArr);
    }

    private cblu(String str, int i) {
    }

    public static cblu[] values() {
        return (cblu[]) c.clone();
    }
}
