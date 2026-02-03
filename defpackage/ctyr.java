package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctyr extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;

    public ctyr(fcxy fcxyVar) {
        super(4, fcxyVar);
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        ctyr ctyrVar = new ctyr((fcxy) obj4);
        ctyrVar.a = (cuaz) obj;
        ctyrVar.b = (ctxy) obj2;
        ctyrVar.c = (ctxy) obj3;
        return ctyrVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return fcva.ah(fcva.ah(((cuaz) this.a).b, ((ctxy) this.b).b), ((ctxy) this.c).b);
    }
}
