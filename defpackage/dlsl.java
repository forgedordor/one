package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlsl {
    public static final dlsl a;
    public static final dlsl b;
    public static final dlsl c;
    public static final dlsl d;
    private static final /* synthetic */ dlsl[] e;

    static {
        dlsl dlslVar = new dlsl("BACK", 0);
        a = dlslVar;
        dlsl dlslVar2 = new dlsl("FORWARD", 1);
        b = dlslVar2;
        dlsl dlslVar3 = new dlsl("RELOAD", 2);
        c = dlslVar3;
        dlsl dlslVar4 = new dlsl("STOP_LOADING", 3);
        d = dlslVar4;
        dlsl[] dlslVarArr = {dlslVar, dlslVar2, dlslVar3, dlslVar4};
        e = dlslVarArr;
        fczb.a(dlslVarArr);
    }

    private dlsl(String str, int i) {
    }

    public static dlsl[] values() {
        return (dlsl[]) e.clone();
    }
}
