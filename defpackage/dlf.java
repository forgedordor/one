package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dlf implements fdau {
    final /* synthetic */ fdae a;

    public dlf(fdae fdaeVar) {
        this.a = fdaeVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ebk ebkVar;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(-756081143);
        dne dneVar = (dne) hmlVar.e(dnh.a);
        if (dneVar instanceof dnk) {
            hmlVar.v(-1604682242);
            hmlVar.o();
            ebkVar = null;
        } else {
            hmlVar.v(-1604549624);
            Object objF = hmlVar.f();
            if (objF == hmk.a) {
                objF = new ebk();
                hmlVar.y(objF);
            }
            ebkVar = (ebk) objF;
            hmlVar.o();
        }
        ebk ebkVar2 = ebkVar;
        ics icsVarB = dli.b(ics.e, ebkVar2, dneVar, true, null, null, this.a);
        hmlVar.o();
        return icsVarB;
    }
}
