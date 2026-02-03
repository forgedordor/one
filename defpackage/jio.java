package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jio extends fdbr implements fdap {
    final /* synthetic */ jir a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jio(jir jirVar) {
        super(1);
        this.a = jirVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        this.a.v((jof) obj);
        return fctx.a;
    }
}
