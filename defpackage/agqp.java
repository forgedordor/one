package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agqp {
    public static final agqp a;
    public static final agqp b;
    public static final agqp c;
    public static final agqp d;
    public static final agqp e;
    public static final agqp f;
    public static final agqp g;
    public static final agqp h;
    public static final agqp i;
    private static final /* synthetic */ agqp[] j;

    static {
        agqp agqpVar = new agqp("NOT_GAIA_SIGNED_IN", 0);
        a = agqpVar;
        agqp agqpVar2 = new agqp("NON_G1_MEMBER", 1);
        b = agqpVar2;
        agqp agqpVar3 = new agqp("UNDER_AGE", 2);
        c = agqpVar3;
        agqp agqpVar4 = new agqp("AGE_CHECK_FAILED", 3);
        d = agqpVar4;
        agqp agqpVar5 = new agqp("IS_DASHER", 4);
        e = agqpVar5;
        agqp agqpVar6 = new agqp("DASHER_CHECK_FAILED", 5);
        f = agqpVar6;
        agqp agqpVar7 = new agqp("FEATURES_UNAVAILABLE", 6);
        g = agqpVar7;
        agqp agqpVar8 = new agqp("SENSITIVE_CLASSIFIER_UNAVAILABLE", 7);
        h = agqpVar8;
        agqp agqpVar9 = new agqp("IS_ON_SATELLITE", 8);
        i = agqpVar9;
        agqp[] agqpVarArr = {agqpVar, agqpVar2, agqpVar3, agqpVar4, agqpVar5, agqpVar6, agqpVar7, agqpVar8, agqpVar9};
        j = agqpVarArr;
        fczb.a(agqpVarArr);
    }

    private agqp(String str, int i2) {
    }

    public static agqp[] values() {
        return (agqp[]) j.clone();
    }
}
