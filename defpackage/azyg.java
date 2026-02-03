package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azyg implements azvp {
    public static final azyg a = new azyg();

    private azyg() {
    }

    @Override // defpackage.azvp
    public final long a() {
        String[] strArr = bqsm.a;
        bqsh bqshVar = new bqsh(bqsm.a);
        bqshVar.A("queryTableMaxId");
        return bqshVar.b().j(bqsm.c.a);
    }

    @Override // defpackage.azvp
    public final azwc b() {
        return azvt.g;
    }

    @Override // defpackage.azvp
    public final dqtq c() {
        if (!arjb.a()) {
            String[] strArr = bqsm.a;
            return new dqtq("message_star", "$primary");
        }
        String[] strArr2 = bqsm.a;
        dqtq dqtqVar = new dqtq("message_star", "$primary");
        dqtqVar.d = 4;
        return dqtqVar;
    }

    @Override // defpackage.azvp
    public final /* synthetic */ String d() {
        return azvo.a(this);
    }

    @Override // defpackage.azvp
    public final /* synthetic */ int e() {
        return azvo.b(this);
    }
}
