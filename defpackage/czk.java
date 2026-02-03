package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class czk extends fdbr implements fdap {
    final /* synthetic */ hsf a;
    final /* synthetic */ hsf b;
    final /* synthetic */ hsf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czk(hsf hsfVar, hsf hsfVar2, hsf hsfVar3) {
        super(1);
        this.a = hsfVar;
        this.b = hsfVar2;
        this.c = hsfVar3;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ikl iklVar = (ikl) obj;
        hsf hsfVar = this.a;
        iklVar.a(hsfVar != null ? ((Number) hsfVar.a()).floatValue() : 1.0f);
        hsf hsfVar2 = this.b;
        iklVar.x(hsfVar2 != null ? ((Number) hsfVar2.a()).floatValue() : 1.0f);
        iklVar.y(hsfVar2 != null ? ((Number) hsfVar2.a()).floatValue() : 1.0f);
        hsf hsfVar3 = this.c;
        iklVar.C(hsfVar3 != null ? ((ikz) hsfVar3.a()).b : ikz.a);
        return fctx.a;
    }
}
