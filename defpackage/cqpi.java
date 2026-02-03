package defpackage;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqpi extends esyv {
    private volatile esyv a;
    private volatile esyv b;
    private final esyd c;

    public cqpi(esyd esydVar) {
        this.c = esydVar;
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) throws IOException {
        String str = null;
        if (etdbVar.t() == 9) {
            etdbVar.p();
            return null;
        }
        etdbVar.m();
        String str2 = null;
        List list = null;
        while (etdbVar.r()) {
            String strH = etdbVar.h();
            if (etdbVar.t() == 9) {
                etdbVar.p();
            } else {
                strH.hashCode();
                if ("id".equals(strH)) {
                    esyv esyvVarB = this.a;
                    if (esyvVarB == null) {
                        esyvVarB = this.c.b(String.class);
                        this.a = esyvVarB;
                    }
                    str = (String) esyvVarB.a(etdbVar);
                } else if ("url".equals(strH)) {
                    esyv esyvVarB2 = this.a;
                    if (esyvVarB2 == null) {
                        esyvVarB2 = this.c.b(String.class);
                        this.a = esyvVarB2;
                    }
                    str2 = (String) esyvVarB2.a(etdbVar);
                } else if ("media".equals(strH)) {
                    esyv esyvVarA = this.b;
                    if (esyvVarA == null) {
                        esyvVarA = this.c.a(etcz.a(List.class, etcz.a(Map.class, String.class, cqpt.class).b));
                        this.b = esyvVarA;
                    }
                    list = (List) esyvVarA.a(etdbVar);
                } else {
                    etdbVar.q();
                }
            }
        }
        etdbVar.o();
        return new cqpj(str, str2, list);
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        cqps cqpsVar = (cqps) obj;
        if (cqpsVar == null) {
            etddVar.j();
            return;
        }
        etddVar.f();
        etddVar.i("id");
        esyv esyvVarB = this.a;
        if (esyvVarB == null) {
            esyvVarB = this.c.b(String.class);
            this.a = esyvVarB;
        }
        esyvVarB.b(etddVar, cqpsVar.a());
        etddVar.i("url");
        esyv esyvVarB2 = this.a;
        if (esyvVarB2 == null) {
            esyvVarB2 = this.c.b(String.class);
            this.a = esyvVarB2;
        }
        esyvVarB2.b(etddVar, cqpsVar.b());
        etddVar.i("media");
        esyv esyvVarA = this.b;
        if (esyvVarA == null) {
            esyvVarA = this.c.a(etcz.a(List.class, etcz.a(Map.class, String.class, cqpt.class).b));
            this.b = esyvVarA;
        }
        esyvVarA.b(etddVar, cqpsVar.c());
        etddVar.h();
    }

    public final String toString() {
        return "TypeAdapter(TenorGif)";
    }
}
