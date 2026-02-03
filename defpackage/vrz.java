package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vrz extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public vrz(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        vrz vrzVar = new vrz((fcxy) obj3);
        vrzVar.a = (fcti) obj;
        vrzVar.b = (dkff) obj2;
        return vrzVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = ((fcti) this.a).a;
        Object obj3 = this.b;
        Object obj4 = (dkff) obj2;
        if (obj3 != null) {
            obj4 = obj3;
        }
        return new fcti(obj4, Boolean.valueOf(obj3 != null));
    }
}
