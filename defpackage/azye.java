package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azye implements azvp {
    public static final azye a = new azye();

    private azye() {
    }

    @Override // defpackage.azvp
    public final long a() {
        bqkg bqkgVarA = bqkl.a();
        bqkgVarA.A("queryTableMaxId");
        return bqkgVarA.b().j(bqkl.c.a);
    }

    @Override // defpackage.azvp
    public final azwc b() {
        return azvt.i;
    }

    @Override // defpackage.azvp
    public final dqtq c() {
        if (!arjb.a()) {
            String[] strArr = bqkl.a;
            return new dqtq("message_reactions", "$primary");
        }
        String[] strArr2 = bqkl.a;
        dqtq dqtqVar = new dqtq("message_reactions", "$primary");
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
