package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqpq extends esyv {
    private volatile esyv a;
    private final esyd b;

    public cqpq(esyd esydVar) {
        this.b = esydVar;
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) throws IOException {
        List list = null;
        if (etdbVar.t() == 9) {
            etdbVar.p();
            return null;
        }
        etdbVar.m();
        while (etdbVar.r()) {
            String strH = etdbVar.h();
            if (etdbVar.t() == 9) {
                etdbVar.p();
            } else {
                strH.hashCode();
                if ("results".equals(strH)) {
                    esyv esyvVarA = this.a;
                    if (esyvVarA == null) {
                        esyvVarA = this.b.a(etcz.a(List.class, cqps.class));
                        this.a = esyvVarA;
                    }
                    list = (List) esyvVarA.a(etdbVar);
                } else {
                    etdbVar.q();
                }
            }
        }
        etdbVar.o();
        return new cqpr(list);
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        cqpw cqpwVar = (cqpw) obj;
        if (cqpwVar == null) {
            etddVar.j();
            return;
        }
        etddVar.f();
        etddVar.i("results");
        esyv esyvVarA = this.a;
        if (esyvVarA == null) {
            esyvVarA = this.b.a(etcz.a(List.class, cqps.class));
            this.a = esyvVarA;
        }
        esyvVarA.b(etddVar, cqpwVar.a());
        etddVar.h();
    }

    public final String toString() {
        return "TypeAdapter(TenorSearchResponse)";
    }
}
