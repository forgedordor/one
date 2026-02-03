package defpackage;

import com.google.gson.internal.bind.ObjectTypeAdapter$1;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etbf extends esyv {
    public static final esyw a = new ObjectTypeAdapter$1(1);
    private final esyd b;
    private final int c;

    public etbf(esyd esydVar, int i) {
        this.b = esydVar;
        this.c = i;
    }

    private final Object c(etdb etdbVar, int i) {
        int i2 = i - 1;
        if (i2 == 5) {
            return etdbVar.j();
        }
        if (i2 == 6) {
            return esyt.a(this.c, etdbVar);
        }
        if (i2 == 7) {
            return Boolean.valueOf(etdbVar.s());
        }
        if (i2 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(etdc.a(i)));
        }
        etdbVar.p();
        return null;
    }

    private static final Object e(etdb etdbVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 0) {
            etdbVar.l();
            return new ArrayList();
        }
        if (i2 != 2) {
            return null;
        }
        etdbVar.m();
        return new etal();
    }

    @Override // defpackage.esyv
    public final Object a(etdb etdbVar) throws IOException {
        int iT = etdbVar.t();
        Object objE = e(etdbVar, iT);
        if (objE == null) {
            return c(etdbVar, iT);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (etdbVar.r()) {
                String strH = objE instanceof Map ? etdbVar.h() : null;
                int iT2 = etdbVar.t();
                Object objE2 = e(etdbVar, iT2);
                Object objC = objE2 == null ? c(etdbVar, iT2) : objE2;
                if (objE instanceof List) {
                    ((List) objE).add(objC);
                } else {
                    ((Map) objE).put(strH, objC);
                }
                if (objE2 != null) {
                    arrayDeque.addLast(objE);
                    objE = objC;
                }
            } else {
                if (objE instanceof List) {
                    etdbVar.n();
                } else {
                    etdbVar.o();
                }
                if (arrayDeque.isEmpty()) {
                    return objE;
                }
                objE = arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.esyv
    public final void b(etdd etddVar, Object obj) throws IOException {
        if (obj == null) {
            etddVar.j();
            return;
        }
        esyv esyvVarB = this.b.b(obj.getClass());
        if (!(esyvVarB instanceof etbf)) {
            esyvVarB.b(etddVar, obj);
        } else {
            etddVar.f();
            etddVar.h();
        }
    }
}
