package defpackage;

import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class osn extends fcyz implements fdat {
    /* synthetic */ Object a;

    public osn(fcxy fcxyVar) {
        super(2, fcxyVar);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((osn) c((osg) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        osg osgVar = (osg) this.a;
        if (ovs.a(2)) {
            Objects.toString(osgVar);
            ovs.b(2, "Sent ".concat(String.valueOf(osgVar)));
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        osn osnVar = new osn(fcxyVar);
        osnVar.a = obj;
        return osnVar;
    }
}
