package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azwn implements azvp {
    public static final azwn a = new azwn();

    private azwn() {
    }

    @Override // defpackage.azvp
    public final long a() {
        boca bocaVarA = bocg.a();
        bocaVarA.A("queryTableMaxId");
        return bocaVarA.b().j(bocg.c.a);
    }

    @Override // defpackage.azvp
    public final azwc b() {
        return azvt.e;
    }

    @Override // defpackage.azvp
    public final dqtq c() {
        String[] strArr = bocg.a;
        return new dqtq("conversation_participants", "$primary");
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
