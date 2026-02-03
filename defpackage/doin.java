package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doin {
    public static final doin a;
    public static final doin b;
    public static final doin c;
    public static final doin d;
    private static final /* synthetic */ doin[] e;

    static {
        doin doinVar = new doin("VERY_LOW", 0);
        a = doinVar;
        doin doinVar2 = new doin("LOW", 1);
        b = doinVar2;
        doin doinVar3 = new doin("HIGH", 2);
        c = doinVar3;
        doin doinVar4 = new doin("ORIGINAL", 3);
        d = doinVar4;
        doin[] doinVarArr = {doinVar, doinVar2, doinVar3, doinVar4};
        e = doinVarArr;
        fczb.a(doinVarArr);
    }

    private doin(String str, int i) {
    }

    public static doin[] values() {
        return (doin[]) e.clone();
    }
}
