package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azwo implements azvp {
    public static final azwo a = new azwo();

    private azwo() {
    }

    @Override // defpackage.azvp
    public final long a() {
        String[] strArr = bodn.a;
        bodk bodkVar = new bodk(bodn.a);
        bodkVar.A("queryTableMaxId");
        return bodkVar.b().j(bodn.c.a);
    }

    @Override // defpackage.azvp
    public final azwc b() {
        return azvt.h;
    }

    @Override // defpackage.azvp
    public final dqtq c() {
        if (!arjb.a()) {
            String[] strArr = bodn.a;
            return new dqtq("conversation_pin", "$primary");
        }
        String[] strArr2 = bodn.a;
        dqtq dqtqVar = new dqtq("conversation_pin", "$primary");
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
