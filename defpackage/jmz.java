package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jmz extends fdbr implements fdap {
    final /* synthetic */ fdoa a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jmz(fdoa fdoaVar) {
        super(1);
        this.a = fdoaVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (jna.b.compareAndSet(false, true)) {
            this.a.b(fctx.a);
        }
        return fctx.a;
    }
}
