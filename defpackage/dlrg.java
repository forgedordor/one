package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlrg {
    public static final dlrg a;
    public static final dlrg b;
    public static final dlrg c;
    private static final /* synthetic */ dlrg[] d;

    static {
        dlrg dlrgVar = new dlrg("POSITION_1", 0);
        a = dlrgVar;
        dlrg dlrgVar2 = new dlrg("POSITION_2", 1);
        b = dlrgVar2;
        dlrg dlrgVar3 = new dlrg("POSITION_3", 2);
        c = dlrgVar3;
        dlrg[] dlrgVarArr = {dlrgVar, dlrgVar2, dlrgVar3};
        d = dlrgVarArr;
        fczb.a(dlrgVarArr);
    }

    private dlrg(String str, int i) {
    }

    public static dlrg[] values() {
        return (dlrg[]) d.clone();
    }
}
