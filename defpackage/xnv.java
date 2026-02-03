package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xnv extends fcyz implements fdaw {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;

    public xnv(fcxy fcxyVar) {
        super(5, fcxyVar);
    }

    @Override // defpackage.fdaw
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        xnv xnvVar = new xnv((fcxy) obj5);
        xnvVar.a = (dlls) obj;
        xnvVar.b = (dlls) obj2;
        xnvVar.c = (dlls) obj3;
        xnvVar.d = (dlls) obj4;
        return xnvVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        Object obj4 = this.c;
        Object obj5 = this.d;
        return obj3 != null ? obj3 : obj5 == null ? obj4 == null ? obj2 : obj4 : obj5;
    }
}
