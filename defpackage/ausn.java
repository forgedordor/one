package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ausn {
    public static final ausn a;
    public static final ausn b;
    public static final ausn c;
    public static final ausn d;
    public static final ausn e;
    public static final ausn f;
    public static final ausn g;
    public static final ausn h;
    private static final /* synthetic */ ausn[] j;
    public final int i;

    static {
        ausn ausnVar = new ausn("UNKNOWN", 0, 0);
        a = ausnVar;
        ausn ausnVar2 = new ausn("OS_INELIGIBLE", 1, 1);
        b = ausnVar2;
        ausn ausnVar3 = new ausn("GMS_CORE_INELIGIBLE", 2, 2);
        c = ausnVar3;
        ausn ausnVar4 = new ausn("MULTI_DEVICE_FEATURE_ON", 3, 3);
        d = ausnVar4;
        ausn ausnVar5 = new ausn("MISSING_LSKF", 4, 4);
        e = ausnVar5;
        ausn ausnVar6 = new ausn("PENDING_RESTART", 5, 5);
        f = ausnVar6;
        ausn ausnVar7 = new ausn("ELIGIBLE", 6, 7);
        g = ausnVar7;
        ausn ausnVar8 = new ausn("FAILURE", 7, 8);
        h = ausnVar8;
        ausn[] ausnVarArr = {ausnVar, ausnVar2, ausnVar3, ausnVar4, ausnVar5, ausnVar6, ausnVar7, ausnVar8};
        j = ausnVarArr;
        fczb.a(ausnVarArr);
    }

    private ausn(String str, int i, int i2) {
        this.i = i2;
    }

    public static ausn[] values() {
        return (ausn[]) j.clone();
    }
}
