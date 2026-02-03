package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajsm {
    public static final ajsm a;
    public static final ajsm b;
    public static final ajsm c;
    private static final /* synthetic */ ajsm[] d;

    static {
        ajsm ajsmVar = new ajsm("UNKNOWN", 0);
        a = ajsmVar;
        ajsm ajsmVar2 = new ajsm("INCOMING_ENCRYPTED_RCS_MESSAGE", 1);
        b = ajsmVar2;
        ajsm ajsmVar3 = new ajsm("FORWARD_SYNC", 2);
        c = ajsmVar3;
        ajsm[] ajsmVarArr = {ajsmVar, ajsmVar2, ajsmVar3};
        d = ajsmVarArr;
        fczb.a(ajsmVarArr);
    }

    private ajsm(String str, int i) {
    }

    public static ajsm[] values() {
        return (ajsm[]) d.clone();
    }
}
