package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ipl extends fdbr implements fdap {
    final /* synthetic */ ipo a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ipl(ipo ipoVar) {
        super(1);
        this.a = ipoVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ipo ipoVar = this.a;
        ipoVar.c = true;
        ipoVar.d.invoke();
        return fctx.a;
    }
}
