package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akkf {
    public static final akkf a;
    public static final akkf b;
    public static final akkf c;
    public static final akkf d;
    public static final akkf e;
    public static final akkf f;
    public static final akkf g;
    public static final akkf h;
    public static final akkf i;
    public static final akkf j;
    public static final akkf k;
    public static final akkf l;
    public static final akkf m;
    public static final akkf n;
    private static final /* synthetic */ akkf[] o;

    static {
        akkf akkfVar = new akkf("GROUP_UPGRADE_ELIGIBLE_SELF_ACTIVE_UPGRADER", 0);
        a = akkfVar;
        akkf akkfVar2 = new akkf("SELF_NOT_ACTIVE_UPGRADER", 1);
        b = akkfVar2;
        akkf akkfVar3 = new akkf("CONVERSATION_NOT_ACTIVE", 2);
        c = akkfVar3;
        akkf akkfVar4 = new akkf("ACTIVE_SELF_NOT_FOUND", 3);
        d = akkfVar4;
        akkf akkfVar5 = new akkf("MAX_GROUP_SIZE_EXCEEDED", 4);
        e = akkfVar5;
        akkf akkfVar6 = new akkf("SELF_NOT_RCS_CAPABLE", 5);
        f = akkfVar6;
        akkf akkfVar7 = new akkf("SELF_NOT_REGISTERED", 6);
        g = akkfVar7;
        akkf akkfVar8 = new akkf("PARTICIPANT_NOT_RCS_CAPABLE", 7);
        h = akkfVar8;
        akkf akkfVar9 = new akkf("PARTICIPANT_NOT_UPGRADE_CAPABLE", 8);
        i = akkfVar9;
        akkf akkfVar10 = new akkf("REMOTE_PARTICIPANT_NOT_NORMALIZED", 9);
        j = akkfVar10;
        akkf akkfVar11 = new akkf("GROUP_SIZE_TOO_LARGE", 10);
        k = akkfVar11;
        akkf akkfVar12 = new akkf("PARTICIPANT_NOT_GOOGLE_MESSAGES", 11);
        l = akkfVar12;
        akkf akkfVar13 = new akkf("DUPLICATE_RCS_GROUP_EXISTS", 12);
        m = akkfVar13;
        akkf akkfVar14 = new akkf("SELF_IDENTITY_IN_PARTICIPANTS", 13);
        n = akkfVar14;
        akkf[] akkfVarArr = {akkfVar, akkfVar2, akkfVar3, akkfVar4, akkfVar5, akkfVar6, akkfVar7, akkfVar8, akkfVar9, akkfVar10, akkfVar11, akkfVar12, akkfVar13, akkfVar14};
        o = akkfVarArr;
        fczb.a(akkfVarArr);
    }

    private akkf(String str, int i2) {
    }

    public static akkf[] values() {
        return (akkf[]) o.clone();
    }
}
