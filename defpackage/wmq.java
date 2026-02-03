package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmq {
    public static final wmq a;
    public static final wmq b;
    public static final wmq c;
    public static final wmq d;
    public static final wmq e;
    public static final wmq f;
    public static final wmq g;
    private static final /* synthetic */ wmq[] i;
    public final boolean h;

    static {
        wmq wmqVar = new wmq("DUPLICATE", 0, true);
        a = wmqVar;
        wmq wmqVar2 = new wmq("REJECTED_ATTACHMENTS_NOT_SUPPORTED", 1, false);
        b = wmqVar2;
        wmq wmqVar3 = new wmq("REJECTED_EXCEED_MAX_ATTACHMENT_COUNT", 2, false);
        c = wmqVar3;
        wmq wmqVar4 = new wmq("REJECTED_VIDEO_ATTACHMENT_DURATION_TOO_LONG", 3, false);
        d = wmqVar4;
        wmq wmqVar5 = new wmq("REJECTED_EXCEED_MAX_MESSAGE_SIZE_SINGLE_ATTACHMENT", 4, false);
        e = wmqVar5;
        wmq wmqVar6 = new wmq("REJECTED_EXCEED_MAX_MESSAGE_SIZE_MULTIPLE_ATTACHMENTS", 5, false);
        f = wmqVar6;
        wmq wmqVar7 = new wmq("ACCEPTED", 6, true);
        g = wmqVar7;
        wmq[] wmqVarArr = {wmqVar, wmqVar2, wmqVar3, wmqVar4, wmqVar5, wmqVar6, wmqVar7};
        i = wmqVarArr;
        fczb.a(wmqVarArr);
    }

    private wmq(String str, int i2, boolean z) {
        this.h = z;
    }

    public static wmq[] values() {
        return (wmq[]) i.clone();
    }
}
