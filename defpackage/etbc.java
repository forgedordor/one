package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etbc extends esyv {
    static final etbc a = new etbc();

    private etbc() {
    }

    public static final esyj e(etdb etdbVar) throws IOException {
        int iT = etdbVar.t();
        esyj esyjVarG = g(etdbVar, iT);
        if (esyjVarG == null) {
            return f(etdbVar, iT);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (etdbVar.r()) {
                String strH = esyjVarG instanceof esym ? etdbVar.h() : null;
                int iT2 = etdbVar.t();
                esyj esyjVarG2 = g(etdbVar, iT2);
                esyj esyjVarF = esyjVarG2 == null ? f(etdbVar, iT2) : esyjVarG2;
                if (esyjVarG instanceof esyg) {
                    ((esyg) esyjVarG).a.add(esyjVarF);
                } else {
                    ((esym) esyjVarG).e(strH, esyjVarF);
                }
                if (esyjVarG2 != null) {
                    arrayDeque.addLast(esyjVarG);
                    esyjVarG = esyjVarF;
                }
            } else {
                if (esyjVarG instanceof esyg) {
                    etdbVar.n();
                } else {
                    etdbVar.o();
                }
                if (arrayDeque.isEmpty()) {
                    return esyjVarG;
                }
                esyjVarG = (esyj) arrayDeque.removeLast();
            }
        }
    }

    private static final esyj f(etdb etdbVar, int i) {
        int i2 = i - 1;
        if (i2 == 5) {
            return new esyp(etdbVar.j());
        }
        if (i2 == 6) {
            return new esyp(new etad(etdbVar.j()));
        }
        if (i2 == 7) {
            return new esyp(Boolean.valueOf(etdbVar.s()));
        }
        if (i2 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(etdc.a(i)));
        }
        etdbVar.p();
        return esyl.a;
    }

    private static final esyj g(etdb etdbVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 0) {
            etdbVar.l();
            return new esyg();
        }
        if (i2 != 2) {
            return null;
        }
        etdbVar.m();
        return new esym();
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) {
        return e(etdbVar);
    }

    @Override // defpackage.esyv
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void b(etdd etddVar, esyj esyjVar) throws IOException {
        if (esyjVar == null || (esyjVar instanceof esyl)) {
            etddVar.j();
            return;
        }
        if (esyjVar instanceof esyp) {
            esyp esypVar = (esyp) esyjVar;
            if (esypVar.i()) {
                etddVar.l(esypVar.e());
                return;
            } else if (esypVar.h()) {
                etddVar.n(esypVar.h() ? ((Boolean) esypVar.a).booleanValue() : Boolean.parseBoolean(esypVar.a()));
                return;
            } else {
                etddVar.m(esypVar.a());
                return;
            }
        }
        if (esyjVar instanceof esyg) {
            etddVar.e();
            Iterator<esyj> it = esyjVar.b().iterator();
            while (it.hasNext()) {
                b(etddVar, it.next());
            }
            etddVar.g();
            return;
        }
        if (!(esyjVar instanceof esym)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(String.valueOf(esyjVar.getClass()))));
        }
        etddVar.f();
        etaf etafVar = new etaf((etag) esyjVar.c().a.entrySet());
        while (etafVar.hasNext()) {
            etak etakVarA = etafVar.a();
            etddVar.i((String) etakVarA.f);
            b(etddVar, (esyj) etakVarA.h);
        }
        etddVar.h();
    }
}
