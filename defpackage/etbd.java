package defpackage;

import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etbd extends esyv {
    private final esyv a;
    private final esyv b;
    private final etan c;

    public etbd(esyv esyvVar, esyv esyvVar2, etan etanVar) {
        this.a = esyvVar;
        this.b = esyvVar2;
        this.c = etanVar;
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) throws IOException {
        int i;
        int iT = etdbVar.t();
        if (iT == 9) {
            etdbVar.p();
            return null;
        }
        Map map = (Map) this.c.a();
        if (iT == 1) {
            etdbVar.l();
            while (etdbVar.r()) {
                etdbVar.l();
                Object objA = this.a.a(etdbVar);
                if (map.put(objA, this.b.a(etdbVar)) != null) {
                    throw new esyr("duplicate key: ".concat(String.valueOf(String.valueOf(objA))));
                }
                etdbVar.n();
            }
            etdbVar.n();
            return map;
        }
        etdbVar.m();
        while (etdbVar.r()) {
            etac etacVar = etac.a;
            int iB = etdbVar.c;
            if (iB == 0) {
                iB = etdbVar.b();
            }
            if (iB == 13) {
                i = 9;
            } else if (iB == 12) {
                i = 8;
            } else {
                if (iB != 14) {
                    throw etdbVar.d("a name");
                }
                i = 10;
            }
            etdbVar.c = i;
            Object objA2 = this.a.a(etdbVar);
            if (map.put(objA2, this.b.a(etdbVar)) != null) {
                throw new esyr("duplicate key: ".concat(String.valueOf(String.valueOf(objA2))));
            }
        }
        etdbVar.o();
        return map;
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            etddVar.j();
            return;
        }
        etddVar.f();
        for (Map.Entry entry : map.entrySet()) {
            etddVar.i(String.valueOf(entry.getKey()));
            this.b.b(etddVar, entry.getValue());
        }
        etddVar.h();
    }
}
