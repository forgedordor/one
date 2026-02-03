package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vlw extends fcyz implements fdat {
    /* synthetic */ Object a;
    final /* synthetic */ vly b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vlw(vly vlyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vlyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vlw) c((zqw) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        List list = ((zqw) this.a).a;
        if (list.size() != 1) {
            return new fdpu(null);
        }
        Object objX = fcva.X(list);
        vly vlyVar = this.b;
        ajlt ajltVar = (ajlt) objX;
        return new vlv(fdtg.b(vlyVar.e.b(ajltVar), vlyVar.b, fdur.a, false), vlyVar, ajltVar);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        vlw vlwVar = new vlw(this.b, fcxyVar);
        vlwVar.a = obj;
        return vlwVar;
    }
}
