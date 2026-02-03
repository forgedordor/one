package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jom extends fdbr implements fdae {
    final /* synthetic */ jgl a;
    final /* synthetic */ jon b;
    final /* synthetic */ jol c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jom(jgl jglVar, jon jonVar, jol jolVar) {
        super(0);
        this.a = jglVar;
        this.b = jonVar;
        this.c = jolVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        jgl jglVar = this.a;
        jglVar.removeOnAttachStateChangeListener(this.b);
        ljc.a(jglVar).a.remove(this.c);
        return fctx.a;
    }
}
