package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpzv implements cpzp {
    private final aurx a;
    private final fcsu b;
    private final aoot c;

    public cpzv(aurx aurxVar, fcsu fcsuVar, aoot aootVar) {
        this.a = aurxVar;
        this.b = fcsuVar;
        this.c = aootVar;
    }

    @Override // defpackage.cpzp
    public final void a() {
        aurx aurxVar = this.a;
        aurxVar.Y(true);
        aurxVar.ad(auml.ENABLING);
        if (this.c.a()) {
            return;
        }
        ((cjzq) this.b.b()).n(ckbz.TOGGLE_STATE_AUTOMATICALLY_DISABLED);
    }
}
