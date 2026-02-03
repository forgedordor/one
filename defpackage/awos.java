package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awos {
    private static final /* synthetic */ awos[] B;
    public static final awos a;
    public static final awos b;
    public static final awos c;
    public static final awos d;

    @fcsv
    public static final awos e;
    public static final awos f;
    public static final awos g;
    public static final awos h;
    public static final awos i;

    @fcsv
    public static final awos j;
    public static final awos k;
    public static final awos l;
    public static final awos m;
    public static final awos n;
    public static final awos o;
    public static final awos p;
    public static final awos q;
    public static final awos r;
    public static final awos s;
    public static final awos t;
    public static final awos u;
    public static final awos v;
    public static final awos w;
    public static final awos x;
    public static final awos y;
    public static final awos z;
    public final int A;

    static {
        awos awosVar = new awos("FULL_STATE_EQUAL", 0, 1);
        a = awosVar;
        awos awosVar2 = new awos("FULL_STATE_LEGACY_NOT_EXISTS", 1, 2);
        b = awosVar2;
        awos awosVar3 = new awos("FULL_STATE_GROUP_PRIMITIVE_NOT_EXISTS", 2, 3);
        c = awosVar3;
        awos awosVar4 = new awos("FULL_STATE_DIFFERENT_MEMBERS", 3, 4);
        d = awosVar4;
        awos awosVar5 = new awos("FULL_STATE_DIFFERENT_DETAILS", 4, 5);
        e = awosVar5;
        awos awosVar6 = new awos("PARTIAL_UPDATE_EQUAL", 5, 6);
        f = awosVar6;
        awos awosVar7 = new awos("PARTIAL_UPDATE_LEGACY_NOT_EXISTS", 6, 7);
        g = awosVar7;
        awos awosVar8 = new awos("PARTIAL_UPDATE_GROUP_PRIMITIVE_NOT_EXISTS", 7, 8);
        h = awosVar8;
        awos awosVar9 = new awos("PARTIAL_UPDATE_DIFFERENT_MEMBERS", 8, 9);
        i = awosVar9;
        awos awosVar10 = new awos("PARTIAL_UPDATE_DIFFERENT_DETAILS", 9, 10);
        j = awosVar10;
        awos awosVar11 = new awos("FULL_STATE_DIFFERENT_GROUP_STATE", 10, 11);
        k = awosVar11;
        awos awosVar12 = new awos("PARTIAL_UPDATE_DIFFERENT_GROUP_STATE", 11, 12);
        l = awosVar12;
        awos awosVar13 = new awos("FULL_STATE_DIFFERENT_NAME", 12, 13);
        m = awosVar13;
        awos awosVar14 = new awos("PARTIAL_UPDATE_DIFFERENT_NAME", 13, 14);
        n = awosVar14;
        awos awosVar15 = new awos("FULL_STATE_DIFFERENT_CONFERENCE_URI", 14, 15);
        o = awosVar15;
        awos awosVar16 = new awos("PARTIAL_UPDATE_DIFFERENT_CONFERENCE_URI", 15, 16);
        p = awosVar16;
        awos awosVar17 = new awos("FULL_STATE_DIFFERENT_GROUP_CAPABILITIES", 16, 17);
        q = awosVar17;
        awos awosVar18 = new awos("PARTIAL_UPDATE_DIFFERENT_GROUP_CAPABILITIES", 17, 18);
        r = awosVar18;
        awos awosVar19 = new awos("FULL_STATE_MISSING_GROUP_MEMBERS", 18, 19);
        s = awosVar19;
        awos awosVar20 = new awos("PARTIAL_UPDATE_MISSING_GROUP_MEMBERS", 19, 20);
        t = awosVar20;
        awos awosVar21 = new awos("FULL_STATE_EXTRA_GROUP_MEMBERS", 20, 21);
        u = awosVar21;
        awos awosVar22 = new awos("PARTIAL_UPDATE_EXTRA_GROUP_MEMBERS", 21, 22);
        v = awosVar22;
        awos awosVar23 = new awos("FULL_STATE_LEGACY_INVALID_PARTICIPANTS", 22, 23);
        w = awosVar23;
        awos awosVar24 = new awos("FULL_STATE_GROUP_PRIMITIVE_INVALID_PARTICIPANTS", 23, 24);
        x = awosVar24;
        awos awosVar25 = new awos("FULL_STATE_LEGACY_SELF_NOT_MEMBER", 24, 25);
        y = awosVar25;
        awos awosVar26 = new awos("FULL_STATE_GROUP_PRIMITIVE_SELF_NOT_MEMBER", 25, 26);
        z = awosVar26;
        awos[] awosVarArr = {awosVar, awosVar2, awosVar3, awosVar4, awosVar5, awosVar6, awosVar7, awosVar8, awosVar9, awosVar10, awosVar11, awosVar12, awosVar13, awosVar14, awosVar15, awosVar16, awosVar17, awosVar18, awosVar19, awosVar20, awosVar21, awosVar22, awosVar23, awosVar24, awosVar25, awosVar26};
        B = awosVarArr;
        fczb.a(awosVarArr);
    }

    private awos(String str, int i2, int i3) {
        this.A = i3;
    }

    public static awos[] values() {
        return (awos[]) B.clone();
    }
}
