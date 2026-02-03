package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpqt {
    public static final cpqt a;
    public static final cpqt b;
    public static final cpqt c;
    public static final cpqt d;
    public static final cpqt e;
    public static final cpqt f;
    public static final cpqt g;
    public static final cpqt h;
    public static final cpqt i;
    private static final /* synthetic */ cpqt[] k;
    public final int j;

    static {
        cpqt cpqtVar = new cpqt("ELIGIBLE", 0, 1);
        a = cpqtVar;
        cpqt cpqtVar2 = new cpqt("NO_PREVIOUS_D2D_TRANSFER", 1, 2);
        b = cpqtVar2;
        cpqt cpqtVar3 = new cpqt("ACTIVE_D2D_TRANSFER", 2, 3);
        c = cpqtVar3;
        cpqt cpqtVar4 = new cpqt("GAIA_ID_NOT_MATCH", 3, 4);
        d = cpqtVar4;
        cpqt cpqtVar5 = new cpqt("PRIOR_TO_DEVICE_ID_EMPTY", 4, 5);
        e = cpqtVar5;
        cpqt cpqtVar6 = new cpqt("DELTA_SYNC_TIMESTAMP_MISSING", 5, 6);
        f = cpqtVar6;
        cpqt cpqtVar7 = new cpqt("PRIOR_TO_DEVICE_ID_NOT_MATCH", 6, 7);
        g = cpqtVar7;
        cpqt cpqtVar8 = new cpqt("RESET_BOX_AFTER_DELTA_SYNC_TIMESTAMP", 7, 8);
        h = cpqtVar8;
        cpqt cpqtVar9 = new cpqt("DELTA_SYNC_TIMESTAMP_STALE", 8, 9);
        i = cpqtVar9;
        cpqt[] cpqtVarArr = {cpqtVar, cpqtVar2, cpqtVar3, cpqtVar4, cpqtVar5, cpqtVar6, cpqtVar7, cpqtVar8, cpqtVar9};
        k = cpqtVarArr;
        fczb.a(cpqtVarArr);
    }

    private cpqt(String str, int i2, int i3) {
        this.j = i3;
    }

    public static cpqt[] values() {
        return (cpqt[]) k.clone();
    }
}
