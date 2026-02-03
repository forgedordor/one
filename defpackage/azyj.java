package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azyj implements azvp {
    public static final azyj a = new azyj();

    private azyj() {
    }

    @Override // defpackage.azvp
    public final long a() {
        btbo btboVarB = btbt.b();
        btboVarB.A("queryTableMaxId");
        return btboVarB.b().j(btbt.c.a);
    }

    @Override // defpackage.azvp
    public final azwc b() {
        return azvt.l;
    }

    @Override // defpackage.azvp
    public final dqtq c() {
        String[] strArr = btbt.a;
        dqtq dqtqVar = new dqtq("read_reports", "$primary");
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
