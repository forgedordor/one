package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpzu implements cpzp {
    private static final cqce a = cqce.g("BugleCms", "OptInMDWhenNoFeatureIsOn");
    private final axky b;
    private final aurx c;
    private final efwo d;
    private final autx e;
    private final fcsu f;
    private final aoot g;

    public cpzu(axky axkyVar, aurx aurxVar, efwo efwoVar, autx autxVar, fcsu fcsuVar, aoot aootVar) {
        this.b = axkyVar;
        this.c = aurxVar;
        this.d = efwoVar;
        this.e = autxVar;
        this.f = fcsuVar;
        this.g = aootVar;
    }

    @Override // defpackage.cpzp
    public final void a() {
        a.m("configure for [opt in Multi-Device] when [no feature is on]");
        this.b.c(this.d);
        String string = UUID.randomUUID().toString();
        aurx aurxVar = this.c;
        aurxVar.ah(string);
        this.e.i();
        auml aumlVar = auml.ENABLING;
        aurxVar.Q(aumlVar);
        aurxVar.X(true);
        if (cpyl.a() && ((Boolean) ((cczi) cpyl.o.get()).e()).booleanValue()) {
            aurxVar.ag(true);
        }
        aurxVar.Y(true);
        aurxVar.ad(aumlVar);
        if (this.g.a()) {
            return;
        }
        ((cjzq) this.f.b()).n(ckbz.TOGGLE_STATE_AUTOMATICALLY_DISABLED);
    }
}
