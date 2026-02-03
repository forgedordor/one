package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kkr extends fdbr implements fdae {
    final /* synthetic */ kkt a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kkr(kkt kktVar) {
        super(0);
        this.a = kktVar;
    }

    @Override // defpackage.fdae
    public final /* bridge */ /* synthetic */ Object invoke() {
        kkt kktVar = this.a;
        if (kktVar.f && kktVar.isAttachedToWindow() && kktVar.c.getParent() == kktVar) {
            kktVar.i().d(kktVar, kkt.a, kktVar.e);
        }
        return fctx.a;
    }
}
