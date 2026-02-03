package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class etbi extends esyv {
    private final etbl a;

    public etbi(etbl etblVar) {
        this.a = etblVar;
    }

    @Override // defpackage.esyv
    public final Object a(etdb etdbVar) throws IOException {
        if (etdbVar.t() == 9) {
            etdbVar.p();
            return null;
        }
        Object objC = c();
        Map map = this.a.b;
        try {
            etdbVar.m();
            while (etdbVar.r()) {
                etbj etbjVar = (etbj) map.get(etdbVar.h());
                if (etbjVar == null) {
                    etdbVar.q();
                } else {
                    f(objC, etdbVar, etbjVar);
                }
            }
            etdbVar.o();
            return e(objC);
        } catch (IllegalAccessException e) {
            throw etcv.b(e);
        } catch (IllegalStateException e2) {
            throw new esyr(e2);
        }
    }

    @Override // defpackage.esyv
    public final void b(etdd etddVar, Object obj) throws IOException {
        if (obj == null) {
            etddVar.j();
            return;
        }
        etddVar.f();
        try {
            Iterator it = this.a.c.iterator();
            while (it.hasNext()) {
                ((etbj) it.next()).c(etddVar, obj);
            }
            etddVar.h();
        } catch (IllegalAccessException e) {
            throw etcv.b(e);
        }
    }

    public abstract Object c();

    public abstract Object e(Object obj);

    public abstract void f(Object obj, etdb etdbVar, etbj etbjVar);
}
