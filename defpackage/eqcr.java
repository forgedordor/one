package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqcr {
    public static final eqcr a;
    public static final eqcr b;
    public static final eqcr c;
    public static final eqcr d;
    public static final eqcr e;
    public static final eqcr f;
    public static final eqcr g;
    private static final /* synthetic */ eqcr[] h;

    static {
        eqcr eqcrVar = new eqcr("ERROR_NO_RETRY", 0);
        a = eqcrVar;
        eqcr eqcrVar2 = new eqcr("ERROR_RETRY_IMMEDIATE", 1);
        b = eqcrVar2;
        eqcr eqcrVar3 = new eqcr("ERROR_RETRY_REFRESH_REGISTRATION", 2);
        c = eqcrVar3;
        eqcr eqcrVar4 = new eqcr("ERROR_RETRY_NEEDS_REPROVISION", 3);
        d = eqcrVar4;
        eqcr eqcrVar5 = new eqcr("ERROR_RETRY_NEEDS_GROUP_RECREATION", 4);
        e = eqcrVar5;
        eqcr eqcrVar6 = new eqcr("ERROR_REMOVE_SELF_FROM_GROUP", 5);
        f = eqcrVar6;
        eqcr eqcrVar7 = new eqcr("ERROR_DESTINATION_NOT_TACHYGRAM", 6);
        g = eqcrVar7;
        eqcr[] eqcrVarArr = {eqcrVar, eqcrVar2, eqcrVar3, eqcrVar4, eqcrVar5, eqcrVar6, eqcrVar7};
        h = eqcrVarArr;
        fczb.a(eqcrVarArr);
    }

    private eqcr(String str, int i) {
    }

    public static eqcr[] values() {
        return (eqcr[]) h.clone();
    }
}
