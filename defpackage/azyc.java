package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azyc implements azvp {
    public static final azyc a = new azyc();

    private azyc() {
    }

    @Override // defpackage.azvp
    public final long a() {
        bpxe bpxeVarB = bpxj.b();
        bpxeVarB.A("queryTableMaxId");
        return bpxeVarB.b().j(bpxj.c.a);
    }

    @Override // defpackage.azvp
    public final azwc b() {
        return azvt.m;
    }

    @Override // defpackage.azvp
    public final dqtq c() {
        if (!arjb.a()) {
            String[] strArr = bpxj.a;
            return new dqtq("link_preview", "$primary");
        }
        String[] strArr2 = bpxj.a;
        dqtq dqtqVar = new dqtq("link_preview", "$primary");
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
