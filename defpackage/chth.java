package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class chth extends fcyz implements fdat {
    final /* synthetic */ chtk a;
    final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public chth(chtk chtkVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = chtkVar;
        this.b = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((chth) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        chtk chtkVar = this.a;
        int i = this.b;
        aubq aubqVarA = chtkVar.a(i);
        if (aubqVarA != null) {
            return aubqVarA;
        }
        throw new chsq(i);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new chth(this.a, this.b, fcxyVar);
    }
}
