package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final /* synthetic */ class dmk extends fdbo implements fdat {
    public dmk(Object obj) {
        super(2, obj, dmm.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        boolean zB;
        igx igxVar = (igx) obj;
        igx igxVar2 = (igx) obj2;
        dmm dmmVar = (dmm) this.g;
        if (dmmVar.C && (zB = igxVar2.b()) != igxVar.b()) {
            fdap fdapVar = dmmVar.a;
            if (fdapVar != null) {
                fdapVar.invoke(Boolean.valueOf(zB));
            }
            if (zB) {
                fdil.d(dmmVar.E(), null, null, new dml(dmmVar, null), 3);
                epa epaVarG = dmmVar.g();
                if (epaVarG != null) {
                    epaVarG.c();
                } else {
                    epaVarG = null;
                }
                dmmVar.e = epaVarG;
                dmmVar.b();
            } else {
                epa epaVar = dmmVar.e;
                if (epaVar != null) {
                    epaVar.a();
                }
                dmmVar.e = null;
                dmo dmoVarA = dmmVar.a();
                if (dmoVarA != null) {
                    dmoVarA.a(null);
                }
            }
            jfz.a(dmmVar);
            ebk ebkVar = dmmVar.d;
            if (ebkVar != null) {
                if (zB) {
                    ebc ebcVar = dmmVar.b;
                    if (ebcVar != null) {
                        dmmVar.i(ebkVar, new ebd(ebcVar));
                        dmmVar.b = null;
                    }
                    ebc ebcVar2 = new ebc();
                    dmmVar.i(ebkVar, ebcVar2);
                    dmmVar.b = ebcVar2;
                } else {
                    ebc ebcVar3 = dmmVar.b;
                    if (ebcVar3 != null) {
                        dmmVar.i(ebkVar, new ebd(ebcVar3));
                        dmmVar.b = null;
                    }
                }
            }
        }
        return fctx.a;
    }
}
