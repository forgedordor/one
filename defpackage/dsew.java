package defpackage;

import android.content.Context;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsew implements dsea {
    private final Context a;
    private final dsbr b;
    private final dsoq c;

    public dsew(Context context, dsoq dsoqVar, dsbr dsbrVar) {
        this.a = context;
        this.b = dsbrVar;
        this.c = dsoqVar;
    }

    @Override // defpackage.dsea
    public final dsdz a() {
        return dsdz.VALID_INTENT;
    }

    @Override // defpackage.ejug
    public final /* synthetic */ boolean b(Object obj, Object obj2) {
        List<etlk> listR;
        dsbi dsbiVarA = ((dsec) obj2).a();
        etnj etnjVar = ((dsbc) dsbiVarA).a.f;
        if (etnjVar == null) {
            etnjVar = etnj.a;
        }
        int i = etnjVar.c;
        if (i == 2) {
            listR = ((etly) etnjVar.d).h;
        } else if (i == 6) {
            etly etlyVar = ((etna) etnjVar.d).d;
            if (etlyVar == null) {
                etlyVar = etly.a;
            }
            listR = etlyVar.h;
        } else if (((i == 3 ? (etnx) etnjVar.d : etnx.a).b & 1024) != 0) {
            etlk etlkVar = (etnjVar.c == 3 ? (etnx) etnjVar.d : etnx.a).p;
            if (etlkVar == null) {
                etlkVar = etlk.a;
            }
            listR = ekgb.r(etlkVar);
        } else if (((etnjVar.c == 5 ? (etoh) etnjVar.d : etoh.a).b & 16) != 0) {
            etlk etlkVar2 = (etnjVar.c == 5 ? (etoh) etnjVar.d : etoh.a).j;
            if (etlkVar2 == null) {
                etlkVar2 = etlk.a;
            }
            listR = ekgb.r(etlkVar2);
        } else {
            int i2 = ekgb.d;
            listR = ekoe.a;
        }
        for (etlk etlkVar3 : listR) {
            if (etlkVar3.c == 8 && !this.c.d(this.a, (etjz) etlkVar3.d)) {
                dsbr dsbrVar = this.b;
                etli etliVarB = etli.b(etlkVar3.e);
                if (etliVarB == null) {
                    etliVarB = etli.ACTION_UNKNOWN;
                }
                dsbrVar.b(dsbiVarA, "Found an invalid intent target in action %s.", etliVarB.name());
                return false;
            }
        }
        return true;
    }
}
