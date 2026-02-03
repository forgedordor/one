package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cipq {
    public static final cipq a;
    public static final cipq b;
    public static final cipq c;
    public static final cipq d;
    public static final cipq e;
    public static final cipq f;
    public static final cipq g;
    private static final /* synthetic */ cipq[] i;
    public final int h;

    static {
        cipq cipqVar = new cipq("REPAIR_NOT_NEEDED", 0, 0);
        a = cipqVar;
        cipq cipqVar2 = new cipq("MERGE_TO_EXISTING_CONVERSATION", 1, 1);
        b = cipqVar2;
        cipq cipqVar3 = new cipq("REPLACE_PARTICIPANTS", 2, 2);
        c = cipqVar3;
        cipq cipqVar4 = new cipq("NO_INCOMING_MESSAGE", 3, 3);
        d = cipqVar4;
        cipq cipqVar5 = new cipq("SELF_NUMBER_NOT_AVAILABLE", 4, 4);
        e = cipqVar5;
        cipq cipqVar6 = new cipq("INVALID_RAW_PARTICIPANTS", 5, 5);
        f = cipqVar6;
        cipq cipqVar7 = new cipq("SELF_NOT_IN_RAW_PARTICIPANTS", 6, 6);
        g = cipqVar7;
        cipq[] cipqVarArr = {cipqVar, cipqVar2, cipqVar3, cipqVar4, cipqVar5, cipqVar6, cipqVar7};
        i = cipqVarArr;
        fczb.a(cipqVarArr);
    }

    private cipq(String str, int i2, int i3) {
        this.h = i3;
    }

    public static cipq[] values() {
        return (cipq[]) i.clone();
    }
}
