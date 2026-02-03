package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvwl extends fcyz implements fdax {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    /* synthetic */ Object d;
    /* synthetic */ Object e;
    final /* synthetic */ cvwo f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvwl(cvwo cvwoVar, fcxy fcxyVar) {
        super(6, fcxyVar);
        this.f = cvwoVar;
    }

    @Override // defpackage.fdax
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        cvwl cvwlVar = new cvwl(this.f, (fcxy) obj6);
        cvwlVar.a = (ekgb) obj;
        cvwlVar.b = (ajlk) obj2;
        cvwlVar.c = (aoer) obj3;
        cvwlVar.d = (ekgb) obj4;
        cvwlVar.e = (wac) obj5;
        return cvwlVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ajlk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v0, types: [aoer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        boolean zX;
        fctl.b(obj);
        ?? r13 = this.a;
        ?? r0 = this.b;
        ?? r1 = this.c;
        ?? r2 = this.d;
        Object obj2 = this.e;
        r13.getClass();
        if (r1 == 0) {
            return null;
        }
        if ((r2 instanceof Collection) && r2.isEmpty()) {
            return null;
        }
        Iterator it = r2.iterator();
        while (it.hasNext()) {
            if (fdbq.f(cvwo.b((aoer) it.next()), cvwo.b(r1))) {
                int i = 0;
                if (obj2 instanceof wab) {
                    zX = ((wab) obj2).x();
                } else {
                    if (!(obj2 instanceof vzw)) {
                        throw new fctg();
                    }
                    zX = false;
                }
                boolean z = cvwo.c(r0) && r13.size() > 1;
                if (!zX) {
                    return null;
                }
                if (!z && r2.size() <= 1) {
                    return null;
                }
                String strB = cvwo.b(r1);
                ArrayList arrayList = new ArrayList(fcva.p((Iterable) r2, 10));
                for (Object obj3 : r2) {
                    int i2 = i + 1;
                    if (i < 0) {
                        fcva.m();
                    }
                    final cvwo cvwoVar = this.f;
                    final aoer aoerVar = (aoer) obj3;
                    String strB2 = cvwo.b(aoerVar);
                    String strQ = aoerVar.q();
                    String strP = aoerVar.p();
                    if (strP == null) {
                        strP = "";
                    }
                    arrayList.add(new dkcx(strB2, dlcs.a(aoerVar.d()), strQ, strP, new fdae() { // from class: cvwk
                        @Override // defpackage.fdae
                        public final Object invoke() {
                            cvwo cvwoVar2 = cvwoVar;
                            auvw.k(cvwoVar2.b, null, null, new cvwn(cvwoVar2, aoerVar, null), 3);
                            return fctx.a;
                        }
                    }));
                    i = i2;
                }
                return new cvwp(new dkcw(strB, arrayList), null);
            }
        }
        return null;
    }
}
