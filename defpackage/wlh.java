package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wlh {
    public static final wlh a;
    public static final wlh b;
    public static final wlh c;
    public static final wlh d;
    public static final wlh e;
    public static final wlh f;
    private static final /* synthetic */ wlh[] i;
    public final wmq g;
    public final wmr h;

    static {
        wlh wlhVar = new wlh("REJECTED_ATTACHMENTS_NOT_SUPPORTED", 0, wmq.b, wmr.a);
        a = wlhVar;
        wlh wlhVar2 = new wlh("REJECTED_EXCEED_ATTACHMENT_COUNT_LIMIT", 1, wmq.c, wmr.b);
        b = wlhVar2;
        wlh wlhVar3 = new wlh("REJECTED_VIDEO_ATTACHMENT_TOO_LONG", 2, wmq.d, wmr.c);
        c = wlhVar3;
        wlh wlhVar4 = new wlh("REJECTED_SINGLE_ATTACHMENT_TOO_BIG", 3, wmq.e, wmr.d);
        d = wlhVar4;
        wlh wlhVar5 = new wlh("REJECTED_MULTIPLE_ATTACHMENTS_TOO_BIG", 4, wmq.f, wmr.e);
        e = wlhVar5;
        wlh wlhVar6 = new wlh("ACCEPTED", 5, wmq.g, wmr.g);
        f = wlhVar6;
        wlh[] wlhVarArr = {wlhVar, wlhVar2, wlhVar3, wlhVar4, wlhVar5, wlhVar6};
        i = wlhVarArr;
        fczb.a(wlhVarArr);
    }

    private wlh(String str, int i2, wmq wmqVar, wmr wmrVar) {
        this.g = wmqVar;
        this.h = wmrVar;
    }

    public static wlh[] values() {
        return (wlh[]) i.clone();
    }
}
