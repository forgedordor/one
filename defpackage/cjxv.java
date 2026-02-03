package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjxv extends fcyz implements fdat {
    final /* synthetic */ cjya a;
    final /* synthetic */ emfe b;
    final /* synthetic */ emfc c;
    final /* synthetic */ emeu d;
    final /* synthetic */ int e;
    final /* synthetic */ String f;
    final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjxv(cjya cjyaVar, emfe emfeVar, emfc emfcVar, int i, emeu emeuVar, int i2, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cjyaVar;
        this.b = emfeVar;
        this.c = emfcVar;
        this.g = i;
        this.d = emeuVar;
        this.e = i2;
        this.f = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjxv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        emfa emfaVar = (emfa) emff.a.createBuilder();
        emfaVar.getClass();
        emmp.d(this.b, emfaVar);
        emmp.c(this.c, emfaVar);
        emfaVar.copyOnWrite();
        emff emffVar = (emff) emfaVar.instance;
        emffVar.h = cjrz.a(this.g);
        emffVar.b |= 64;
        emfaVar.copyOnWrite();
        emff emffVar2 = (emff) emfaVar.instance;
        emffVar2.g = this.d;
        emffVar2.b |= 32;
        emfaVar.copyOnWrite();
        emff emffVar3 = (emff) emfaVar.instance;
        emffVar3.b |= 16;
        emffVar3.f = this.e;
        cjya cjyaVar = this.a;
        enpl enplVarB = ((dexw) cjyaVar.b.b()).b(new dggp(this.f));
        enplVarB.getClass();
        emmp.b(enplVarB, emfaVar);
        cjyaVar.c(emmp.a(emfaVar));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cjxv(this.a, this.b, this.c, this.g, this.d, this.e, this.f, fcxyVar);
    }
}
