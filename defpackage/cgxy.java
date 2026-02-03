package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cgxy {
    public static final cgxy a;
    public static final cgxy b;
    public static final cgxy c;
    public static final cgxy d;
    public static final cgxy e;
    public static final cgxy f;
    public static final cgxy g;
    public static final cgxy h;
    public static final /* synthetic */ fcza i;
    private static final /* synthetic */ cgxy[] k;
    public final int j;

    static {
        cgxy cgxyVar = new cgxy("UnknownPipeline", 0, 0);
        a = cgxyVar;
        cgxy cgxyVar2 = new cgxy("SmsReceivePipeline", 1, 1);
        b = cgxyVar2;
        cgxy cgxyVar3 = new cgxy("SendingPipeline", 2, 2);
        c = cgxyVar3;
        cgxy cgxyVar4 = new cgxy("SendingRcsReportPipeline", 3, 3);
        d = cgxyVar4;
        cgxy cgxyVar5 = new cgxy("ReceivingRcsPipeline", 4, 4);
        e = cgxyVar5;
        cgxy cgxyVar6 = new cgxy("GroupCreate", 5, 5);
        f = cgxyVar6;
        cgxy cgxyVar7 = new cgxy("RcsGroupUpdateInviteLink", 6, 6);
        g = cgxyVar7;
        cgxy cgxyVar8 = new cgxy("RcsGroupJoinViaLink", 7, 7);
        h = cgxyVar8;
        cgxy[] cgxyVarArr = {cgxyVar, cgxyVar2, cgxyVar3, cgxyVar4, cgxyVar5, cgxyVar6, cgxyVar7, cgxyVar8};
        k = cgxyVarArr;
        i = fczb.a(cgxyVarArr);
    }

    private cgxy(String str, int i2, int i3) {
        this.j = i3;
    }

    public static cgxy[] values() {
        return (cgxy[]) k.clone();
    }
}
