package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azyf implements azvp {
    public static final azyf a = new azyf();

    private azyf() {
    }

    @Override // defpackage.azvp
    public final long a() {
        String[] strArr = bqmc.a;
        return new bqlw(bqmc.a).b().j(bqmc.c.a);
    }

    @Override // defpackage.azvp
    public final azwc b() {
        return azvt.j;
    }

    @Override // defpackage.azvp
    public final dqtq c() {
        if (!arjb.a()) {
            String[] strArr = bqmc.a;
            return new dqtq("message_replies", "$primary");
        }
        String[] strArr2 = bqmc.a;
        dqtq dqtqVar = new dqtq("message_replies", "$primary");
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
