package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class iod extends fdbr implements fdap {
    final /* synthetic */ ioe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iod(ioe ioeVar) {
        super(1);
        this.a = ioeVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ioe ioeVar = this.a;
        ipk ipkVar = (ipk) obj;
        ioeVar.d(ipkVar);
        fdap fdapVar = ioeVar.e;
        if (fdapVar != null) {
            fdapVar.invoke(ipkVar);
        }
        return fctx.a;
    }
}
