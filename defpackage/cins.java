package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cins {
    public static final cins a;
    public static final cins b;
    public static final cins c;
    public static final cins d;
    public static final cins e;
    public static final cins f;
    public static final cins g;
    public static final cins h;
    public static final cins i;
    public static final cins j;
    private static final /* synthetic */ cins[] l;
    public final int k;

    static {
        cins cinsVar = new cins("UNKNOWN", 0, 0);
        a = cinsVar;
        cins cinsVar2 = new cins("NOT_ELIGIBLE_BECAUSE_INACTIVE", 1, 1);
        b = cinsVar2;
        cins cinsVar3 = new cins("NOT_ELIGIBLE_NOT_EVERYONE_RCS", 2, 2);
        c = cinsVar3;
        cins cinsVar4 = new cins("NOT_ELIGIBLE_WAITING_FOR_OUTDATED_GM_CLIENT", 3, 3);
        d = cinsVar4;
        cins cinsVar5 = new cins("ELIGIBLE_FOR_UPGRADE_BUT_NOT_ACTIVE_UPGRADER", 4, 4);
        e = cinsVar5;
        cins cinsVar6 = new cins("UPGRADE_STARTED", 5, 5);
        f = cinsVar6;
        cins cinsVar7 = new cins("RCS_GROUP_CREATION_FAILED", 6, 6);
        g = cinsVar7;
        cins cinsVar8 = new cins("RCS_GROUP_CREATION_SUCCEEDED", 7, 7);
        h = cinsVar8;
        cins cinsVar9 = new cins("UPGRADE_FAILED", 8, 8);
        i = cinsVar9;
        cins cinsVar10 = new cins("UPGRADE_COMPLETE", 9, 9);
        j = cinsVar10;
        cins[] cinsVarArr = {cinsVar, cinsVar2, cinsVar3, cinsVar4, cinsVar5, cinsVar6, cinsVar7, cinsVar8, cinsVar9, cinsVar10};
        l = cinsVarArr;
        fczb.a(cinsVarArr);
    }

    private cins(String str, int i2, int i3) {
        this.k = i3;
    }

    public static cins[] values() {
        return (cins[]) l.clone();
    }
}
