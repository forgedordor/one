package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqpo extends esyv {
    private volatile esyv a;
    private final esyd b;

    public cqpo(esyd esydVar) {
        this.b = esydVar;
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ Object a(etdb etdbVar) throws IOException {
        String str = null;
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
                if ("status".equals(strH)) {
                    esyv esyvVarB = this.a;
                    if (esyvVarB == null) {
                        esyvVarB = this.b.b(String.class);
                        this.a = esyvVarB;
                    }
                    str = (String) esyvVarB.a(etdbVar);
                } else {
                    etdbVar.q();
                }
            }
        }
        etdbVar.o();
        return new cqpp(str);
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        cqpv cqpvVar = (cqpv) obj;
        if (cqpvVar == null) {
            etddVar.j();
            return;
        }
        etddVar.f();
        etddVar.i("status");
        esyv esyvVarB = this.a;
        if (esyvVarB == null) {
            esyvVarB = this.b.b(String.class);
            this.a = esyvVarB;
        }
        esyvVarB.b(etddVar, cqpvVar.a());
        etddVar.h();
    }

    public final String toString() {
        return "TypeAdapter(TenorRegisterShareResponse)";
    }
}
