package defpackage;

import java.net.URL;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdsp implements cdse {
    @Override // defpackage.cdse
    public final int a() {
        return 0;
    }

    @Override // defpackage.cdse
    public final /* synthetic */ boolean b(URL url) {
        url.getClass();
        return true;
    }

    @Override // defpackage.cdse
    public final Object c(cdsi cdsiVar) {
        fgrs fgrsVar;
        Object next;
        String strHS;
        fgrs fgrsVarJ = cdsiVar.a().j();
        Iterator it = fgrsVarJ.t().iterator();
        while (true) {
            if (!it.hasNext()) {
                fgrsVar = new fgrs(fgsl.b("head", fgrz.b(fgrsVarJ).c), fgrsVarJ.l());
                fgrsVarJ.R(0, fgrsVar);
                break;
            }
            fgrsVar = (fgrs) it.next();
            if (fgrsVar.n().equals("head")) {
                break;
            }
        }
        fgrs fgrsVarA = new fgta(fgrm.a).a(fgrsVar, fgrsVar);
        String str = "";
        String strTrim = fgrsVarA != null ? fgre.b(fgrsVarA.q()).trim() : "";
        strTrim.getClass();
        Iterator<E> it2 = fguz.a("meta", cdsiVar.a()).iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (fdbq.f(((fgrs) next).hS("property"), "description")) {
                break;
            }
        }
        fgrs fgrsVar2 = (fgrs) next;
        if (fgrsVar2 != null && (strHS = fgrsVar2.hS("content")) != null) {
            str = strHS;
        }
        return new cdsd(strTrim, str, null, 4);
    }
}
