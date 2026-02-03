package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class joo extends fdbr implements fdae {
    final /* synthetic */ jgl a;
    final /* synthetic */ joq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public joo(jgl jglVar, joq joqVar) {
        super(0);
        this.a = jglVar;
        this.b = joqVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.a.removeOnAttachStateChangeListener(this.b);
        return fctx.a;
    }
}
