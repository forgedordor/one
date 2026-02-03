package defpackage;

import java.net.URL;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdsq implements cdse {
    private static final String d(fgte fgteVar, String str) {
        Object next;
        String strHS;
        Iterator<E> it = fgteVar.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (fdbq.f(((fgrs) next).hS("property"), str)) {
                break;
            }
        }
        fgrs fgrsVar = (fgrs) next;
        return (fgrsVar == null || (strHS = fgrsVar.hS("content")) == null) ? "" : strHS;
    }

    @Override // defpackage.cdse
    public final int a() {
        return 3;
    }

    @Override // defpackage.cdse
    public final /* synthetic */ boolean b(URL url) {
        url.getClass();
        return true;
    }

    @Override // defpackage.cdse
    public final Object c(cdsi cdsiVar) {
        fgte fgteVarA = fguz.a("meta", cdsiVar.a());
        return new cdsd(d(fgteVarA, "og:title"), d(fgteVarA, "og:description"), d(fgteVarA, "og:image"));
    }
}
