package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bbcx {
    public static final bbcx a;
    public static final bbcx b;
    public static final bbcx c;
    public static final bbcx d;
    public static final bbcx e;
    public static final bbcx f;
    public static final bbcx g;
    public static final bbcx h;
    public static final bbcx i;
    public static final bbcx j;
    private static final /* synthetic */ bbcx[] k;

    static {
        bbcx bbcxVar = new bbcx("TEST", 0);
        a = bbcxVar;
        bbcx bbcxVar2 = new bbcx("GET_OR_CREATE_CONVERSATION", 1);
        b = bbcxVar2;
        bbcx bbcxVar3 = new bbcx("UPDATE_BUGLE_PARTICIPANT_TO_MORE_CANONICAL", 2);
        c = bbcxVar3;
        bbcx bbcxVar4 = new bbcx("REFRESH_SELF_PARTICIPANT", 3);
        d = bbcxVar4;
        bbcx bbcxVar5 = new bbcx("SANITIZE_PARTICIPANTS_ACTION", 4);
        e = bbcxVar5;
        bbcx bbcxVar6 = new bbcx("SELF_PARTICIPANTS_DATA", 5);
        f = bbcxVar6;
        bbcx bbcxVar7 = new bbcx("PARTICIPANT_RECOVERY_OPERATIONS", 6);
        g = bbcxVar7;
        bbcx bbcxVar8 = new bbcx("PARTICIPANT_REFRESH_SELF", 7);
        h = bbcxVar8;
        bbcx bbcxVar9 = new bbcx("PARTICIPANT_REFRESH_OTHER", 8);
        i = bbcxVar9;
        bbcx bbcxVar10 = new bbcx("CMS_PARTICIPANT_MERGE", 9);
        j = bbcxVar10;
        bbcx[] bbcxVarArr = {bbcxVar, bbcxVar2, bbcxVar3, bbcxVar4, bbcxVar5, bbcxVar6, bbcxVar7, bbcxVar8, bbcxVar9, bbcxVar10};
        k = bbcxVarArr;
        fczb.a(bbcxVarArr);
    }

    private bbcx(String str, int i2) {
    }

    public static bbcx[] values() {
        return (bbcx[]) k.clone();
    }
}
