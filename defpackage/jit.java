package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jit extends fdbr implements fdap {
    final /* synthetic */ ctj a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jit(ctj ctjVar) {
        super(1);
        this.a = ctjVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return Boolean.valueOf(this.a.b(((jsl) obj).e));
    }
}
