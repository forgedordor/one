package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azwq implements azvp {
    public static final azwq a = new azwq();

    private azwq() {
    }

    @Override // defpackage.azvp
    public final long a() {
        botb botbVarE = botm.e();
        botbVarE.A("queryTableMaxId");
        return botbVarE.b().j(botm.c.a);
    }

    @Override // defpackage.azvp
    public final azwc b() {
        return azvt.a;
    }

    @Override // defpackage.azvp
    public final dqtq c() {
        String[] strArr = botm.a;
        return new dqtq("conversations", "$primary");
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
