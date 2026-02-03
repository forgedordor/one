package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cyx extends fdbr implements fdap {
    final /* synthetic */ hsf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyx(hsf hsfVar) {
        super(1);
        this.a = hsfVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ((ikl) obj).a(((Number) this.a.a()).floatValue());
        return fctx.a;
    }
}
