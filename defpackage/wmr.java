package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmr {
    public static final wmr a;
    public static final wmr b;
    public static final wmr c;
    public static final wmr d;
    public static final wmr e;
    public static final wmr f;
    public static final wmr g;
    private static final /* synthetic */ wmr[] h;

    static {
        wmr wmrVar = new wmr("REJECTED_ATTACHMENTS_NOT_SUPPORTED", 0);
        a = wmrVar;
        wmr wmrVar2 = new wmr("REJECTED_EXCEED_MAX_ATTACHMENT_COUNT", 1);
        b = wmrVar2;
        wmr wmrVar3 = new wmr("REJECTED_VIDEO_ATTACHMENT_DURATION_TOO_LONG", 2);
        c = wmrVar3;
        wmr wmrVar4 = new wmr("REJECTED_EXCEED_MAX_MESSAGE_SIZE_SINGLE_ATTACHMENT", 3);
        d = wmrVar4;
        wmr wmrVar5 = new wmr("REJECTED_EXCEED_MAX_MESSAGE_SIZE_MULTIPLE_ATTACHMENTS", 4);
        e = wmrVar5;
        wmr wmrVar6 = new wmr("REJECTED_EXCEED_MAX_VIDEO_COUNT", 5);
        f = wmrVar6;
        wmr wmrVar7 = new wmr("ACCEPTED", 6);
        g = wmrVar7;
        wmr[] wmrVarArr = {wmrVar, wmrVar2, wmrVar3, wmrVar4, wmrVar5, wmrVar6, wmrVar7};
        h = wmrVarArr;
        fczb.a(wmrVarArr);
    }

    private wmr(String str, int i) {
    }

    public static wmr[] values() {
        return (wmr[]) h.clone();
    }
}
