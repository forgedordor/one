package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akim {
    public static final akim a;
    public static final akim b;
    public static final akim c;
    public static final akim d;
    public static final akim e;
    public static final akim f;
    public static final akim g;
    public static final akim h;
    private static final /* synthetic */ akim[] j;
    public final int i;

    static {
        akim akimVar = new akim("SELF_NOT_MLS_CAPABLE", 0, 0);
        a = akimVar;
        akim akimVar2 = new akim("CLIENT_LOST_MLS", 1, 1);
        b = akimVar2;
        akim akimVar3 = new akim("NON_MLS_CLIENT_ADDED", 2, 2);
        c = akimVar3;
        akim akimVar4 = new akim("SELF_HEAL_FAILURE", 3, 3);
        d = akimVar4;
        akim akimVar5 = new akim("UNRECOVERABLE_NEGATIVE_DELIVERY_RECEIPT", 4, 4);
        e = akimVar5;
        akim akimVar6 = new akim("PLAINTEXT_DELIVERY_RECEIPT", 5, 5);
        f = akimVar6;
        akim akimVar7 = new akim("RECEIVED_END_MLS_COMMIT", 6, 6);
        g = akimVar7;
        akim akimVar8 = new akim("UNKNOWN_DOWNGRADE_REASON", 7, 7);
        h = akimVar8;
        akim[] akimVarArr = {akimVar, akimVar2, akimVar3, akimVar4, akimVar5, akimVar6, akimVar7, akimVar8};
        j = akimVarArr;
        fczb.a(akimVarArr);
    }

    private akim(String str, int i, int i2) {
        this.i = i2;
    }

    public static akim[] values() {
        return (akim[]) j.clone();
    }
}
