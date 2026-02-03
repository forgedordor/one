package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tfb extends fcyz implements fdat {
    final /* synthetic */ bngt a;
    final /* synthetic */ tfh b;
    final /* synthetic */ Instant c;
    final /* synthetic */ Instant d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tfb(fcxy fcxyVar, bngt bngtVar, tfh tfhVar, Instant instant, Instant instant2) {
        super(2, fcxyVar);
        this.a = bngtVar;
        this.b = tfhVar;
        this.c = instant;
        this.d = instant2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tfb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        botb botbVarE = botm.e();
        botbVarE.A("+conversationsWithReplies");
        botbVarE.i(new tfd(this.a, this.c, this.d));
        return new Integer(botbVarE.b().h());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tfb tfbVar = new tfb(fcxyVar, this.a, this.b, this.c, this.d);
        tfbVar.e = obj;
        return tfbVar;
    }
}
