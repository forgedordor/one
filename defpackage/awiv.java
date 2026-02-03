package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class awiv extends fcyz implements fdat {
    int a;
    final /* synthetic */ awiz b;
    final /* synthetic */ String c;
    final /* synthetic */ awja d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awiv(awiz awizVar, String str, awja awjaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = awizVar;
        this.c = str;
        this.d = awjaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awiv) c((String) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        awiz awizVar = this.b;
        String str = this.c;
        awja awjaVar = this.d;
        this.a = 1;
        Object objH = awizVar.h(str, awjaVar, this);
        return objH == fcylVar ? fcylVar : objH;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new awiv(this.b, this.c, this.d, fcxyVar);
    }
}
