package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kno extends fdbr implements fdap {
    final /* synthetic */ knp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kno(knp knpVar) {
        super(1);
        this.a = knpVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        knp knpVar = this.a;
        if (knpVar.c.a) {
            knpVar.a.invoke();
        }
        return fctx.a;
    }
}
