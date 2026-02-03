package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjxw extends fcyz implements fdat {
    final /* synthetic */ emfe a;
    final /* synthetic */ emfc b;
    final /* synthetic */ Integer c;
    final /* synthetic */ elzz d;
    final /* synthetic */ cjya e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjxw(fcxy fcxyVar, emfe emfeVar, emfc emfcVar, Integer num, elzz elzzVar, cjya cjyaVar) {
        super(2, fcxyVar);
        this.a = emfeVar;
        this.b = emfcVar;
        this.c = num;
        this.d = elzzVar;
        this.e = cjyaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjxw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        emfa emfaVar = (emfa) emff.a.createBuilder();
        emfaVar.copyOnWrite();
        emff emffVar = (emff) emfaVar.instance;
        emffVar.d = this.a.t;
        emffVar.b |= 4;
        emfaVar.copyOnWrite();
        emff emffVar2 = (emff) emfaVar.instance;
        emffVar2.c = this.b.U;
        emffVar2.b |= 1;
        Integer num = this.c;
        if (num != null) {
            int iIntValue = num.intValue();
            emfaVar.copyOnWrite();
            emff emffVar3 = (emff) emfaVar.instance;
            emffVar3.b |= 8;
            emffVar3.e = iIntValue;
        }
        elzz elzzVar = this.d;
        if (elzzVar != null) {
            emfaVar.copyOnWrite();
            emff emffVar4 = (emff) emfaVar.instance;
            emffVar4.i = elzzVar;
            emffVar4.b |= 128;
        }
        cjya cjyaVar = this.e;
        evsn evsnVarBuild = emfaVar.build();
        evsnVarBuild.getClass();
        cjyaVar.c((emff) evsnVarBuild);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cjxw cjxwVar = new cjxw(fcxyVar, this.a, this.b, this.c, this.d, this.e);
        cjxwVar.f = obj;
        return cjxwVar;
    }
}
