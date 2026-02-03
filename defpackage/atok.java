package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atok extends fcyz implements fdat {
    int a;
    final /* synthetic */ atol b;
    final /* synthetic */ auip c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atok(atol atolVar, auip auipVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = atolVar;
        this.c = auipVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atok) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        atol atolVar = this.b;
        auip auipVar = this.c;
        this.a = 1;
        fdiu fdiuVar = new fdiu(fcym.c(this), 1);
        fdiuVar.B();
        String string = UUID.randomUUID().toString();
        string.getClass();
        atolVar.e.put(string, fdiuVar);
        fdiuVar.d(new atoj(atolVar, string));
        auvw.m(atolVar.c, null, new atoh(auipVar, atolVar, string, null), 3);
        Object objM = fdiuVar.m();
        return objM == fcylVar ? fcylVar : objM;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new atok(this.b, this.c, fcxyVar);
    }
}
