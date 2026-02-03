package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afqb extends fcyz implements fdat {
    int a;
    final /* synthetic */ vvw b;
    final /* synthetic */ afqm c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqb(vvw vvwVar, afqm afqmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vvwVar;
        this.c = afqmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afqb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Closeable closeable;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            closeable = (Closeable) this.d;
            try {
                fctl.b(obj);
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    fczl.a(closeable, th);
                    throw th2;
                }
            }
        } else {
            fctl.b(obj);
            fdjx fdjxVar = (fdjx) this.d;
            vvw vvwVar = this.b;
            afqm afqmVar = this.c;
            eieu eieuVarH = eiiy.h("MultiShare SendButtonUiAdapterImpl#createAttachments");
            try {
                List<vvs> list = vvwVar.b;
                ArrayList<vvr> arrayList = new ArrayList();
                for (vvs vvsVar : list) {
                    vvr vvrVar = vvsVar instanceof vvr ? (vvr) vvsVar : null;
                    if (vvrVar != null) {
                        arrayList.add(vvrVar);
                    }
                }
                ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
                for (vvr vvrVar2 : arrayList) {
                    arrayList2.add(fdin.b(fdjxVar, eicg.a(fcyi.a), fdjz.a, new afqa(null, afqmVar, vvrVar2)));
                }
                this.d = eieuVarH;
                this.a = 1;
                obj = fdii.a(arrayList2, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                closeable = eieuVarH;
            } catch (Throwable th3) {
                th = th3;
                closeable = eieuVarH;
                throw th;
            }
        }
        ekgb ekgbVarA = ekfv.a((Collection) obj);
        fczl.a(closeable, null);
        return ekgbVarA;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        afqb afqbVar = new afqb(this.b, this.c, fcxyVar);
        afqbVar.d = obj;
        return afqbVar;
    }
}
