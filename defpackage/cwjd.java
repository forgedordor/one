package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwjd extends fcyz implements fdav {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;

    public cwjd(fcxy fcxyVar) {
        super(4, fcxyVar);
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        cwjd cwjdVar = new cwjd((fcxy) obj4);
        cwjdVar.a = (alzc) obj;
        cwjdVar.b = (alzc) obj2;
        cwjdVar.c = (alzc) obj3;
        return cwjdVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return new Integer(((alzc) this.a).a + ((alzc) this.b).a + ((alzc) this.c).a);
    }
}
