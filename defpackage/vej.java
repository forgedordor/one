package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vej extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;

    public vej(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        vej vejVar = new vej((fcxy) obj3);
        vejVar.a = (List) obj;
        vejVar.b = (akbl) obj2;
        return vejVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return this.b == akbl.b ? this.a : fcvo.a;
    }
}
