package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class ped {
    public static final ped a;
    public static final ped b;
    public static final ped c;
    private static final /* synthetic */ ped[] d;

    static {
        ped pedVar = new ped("NO_OP", 0);
        a = pedVar;
        ped pedVar2 = new ped("ADD", 1);
        b = pedVar2;
        ped pedVar3 = new ped("REMOVE", 2);
        c = pedVar3;
        ped[] pedVarArr = {pedVar, pedVar2, pedVar3};
        d = pedVarArr;
        fczb.a(pedVarArr);
    }

    private ped(String str, int i) {
    }

    public static ped[] values() {
        return (ped[]) d.clone();
    }
}
