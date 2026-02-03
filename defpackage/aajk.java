package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aajk extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ aajl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aajk(aajl aajlVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = aajlVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        aajk aajkVar = new aajk(this.c, (fcxy) obj3);
        aajkVar.a = (aafp) obj;
        aajkVar.b = (bxuv) obj2;
        return aajkVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        if (obj2 == null) {
            return null;
        }
        aajl aajlVar = this.c;
        aafp aafpVar = (aafp) obj2;
        int size = aafpVar.b.size();
        Integer num = obj3 != null ? (Integer) aafpVar.c.get(((bxuv) obj3).a) : null;
        return new dlht(size, size - (num != null ? num.intValue() : 0), new aaji(aajlVar), new aajj(aajlVar));
    }
}
