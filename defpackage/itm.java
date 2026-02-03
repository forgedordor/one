package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class itm extends fdbr implements fdap {
    final /* synthetic */ itl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itm(itl itlVar) {
        super(1);
        this.a = itlVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        itl itlVar = this.a;
        Throwable th = (Throwable) obj;
        fdis fdisVar = itlVar.a;
        if (fdisVar != null) {
            fdisVar.h(th);
        }
        itlVar.a = null;
        return fctx.a;
    }
}
