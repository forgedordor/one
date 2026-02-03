package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
final class bwsq {
    public static final bwsq a;
    public static final bwsq b;
    public static final bwsq c;
    public static final bwsq d;
    private static final /* synthetic */ bwsq[] e;

    static {
        bwsq bwsqVar = new bwsq("NEW_TOMBSTONE_IS_SAME_AS_LAST_TOMBSTONE", 0);
        a = bwsqVar;
        bwsq bwsqVar2 = new bwsq("NO_MESSAGES_BEFORE_LAST_TOMBSTONE", 1);
        b = bwsqVar2;
        bwsq bwsqVar3 = new bwsq("LAST_MESSAGE_PROTOCOL_IS_SAME_AS_NEW_TOMBSTONE_PROTOCOL", 2);
        c = bwsqVar3;
        bwsq bwsqVar4 = new bwsq("LAST_MESSAGE_PROTOCOL_IS_DIFFERENT_FROM_NEW_TOMBSTONE_PROTOCOL", 3);
        d = bwsqVar4;
        bwsq[] bwsqVarArr = {bwsqVar, bwsqVar2, bwsqVar3, bwsqVar4};
        e = bwsqVarArr;
        fczb.a(bwsqVarArr);
    }

    private bwsq(String str, int i) {
    }

    public static bwsq[] values() {
        return (bwsq[]) e.clone();
    }
}
