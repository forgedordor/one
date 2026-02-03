package defpackage;

import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqpk extends esyv {
    private volatile esyv a;
    private volatile esyv b;
    private volatile esyv c;
    private final esyd d;

    public cqpk(esyd esydVar) {
        this.d = esydVar;
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
        Integer num = null;
        List list = null;
        while (etdbVar.r()) {
            String strH = etdbVar.h();
            if (etdbVar.t() == 9) {
                etdbVar.p();
            } else {
                strH.hashCode();
                if ("url".equals(strH)) {
                    esyv esyvVarB = this.a;
                    if (esyvVarB == null) {
                        esyvVarB = this.d.b(String.class);
                        this.a = esyvVarB;
                    }
                    str = (String) esyvVarB.a(etdbVar);
                } else if ("preview".equals(strH)) {
                    esyv esyvVarB2 = this.a;
                    if (esyvVarB2 == null) {
                        esyvVarB2 = this.d.b(String.class);
                        this.a = esyvVarB2;
                    }
                    str2 = (String) esyvVarB2.a(etdbVar);
                } else if ("size".equals(strH)) {
                    esyv esyvVarB3 = this.b;
                    if (esyvVarB3 == null) {
                        esyvVarB3 = this.d.b(Integer.class);
                        this.b = esyvVarB3;
                    }
                    num = (Integer) esyvVarB3.a(etdbVar);
                } else if ("dims".equals(strH)) {
                    esyv esyvVarA = this.c;
                    if (esyvVarA == null) {
                        esyvVarA = this.d.a(etcz.a(List.class, Integer.class));
                        this.c = esyvVarA;
                    }
                    list = (List) esyvVarA.a(etdbVar);
                } else {
                    etdbVar.q();
                }
            }
        }
        etdbVar.o();
        return new cqpl(str, str2, num, list);
    }

    @Override // defpackage.esyv
    public final /* bridge */ /* synthetic */ void b(etdd etddVar, Object obj) throws IOException {
        cqpt cqptVar = (cqpt) obj;
        if (cqptVar == null) {
            etddVar.j();
            return;
        }
        etddVar.f();
        etddVar.i("url");
        if (cqptVar.c() == null) {
            etddVar.j();
        } else {
            esyv esyvVarB = this.a;
            if (esyvVarB == null) {
                esyvVarB = this.d.b(String.class);
                this.a = esyvVarB;
            }
            esyvVarB.b(etddVar, cqptVar.c());
        }
        etddVar.i("preview");
        if (cqptVar.b() == null) {
            etddVar.j();
        } else {
            esyv esyvVarB2 = this.a;
            if (esyvVarB2 == null) {
                esyvVarB2 = this.d.b(String.class);
                this.a = esyvVarB2;
            }
            esyvVarB2.b(etddVar, cqptVar.b());
        }
        etddVar.i("size");
        if (cqptVar.a() == null) {
            etddVar.j();
        } else {
            esyv esyvVarB3 = this.b;
            if (esyvVarB3 == null) {
                esyvVarB3 = this.d.b(Integer.class);
                this.b = esyvVarB3;
            }
            esyvVarB3.b(etddVar, cqptVar.a());
        }
        etddVar.i("dims");
        if (cqptVar.d() == null) {
            etddVar.j();
        } else {
            esyv esyvVarA = this.c;
            if (esyvVarA == null) {
                esyvVarA = this.d.a(etcz.a(List.class, Integer.class));
                this.c = esyvVarA;
            }
            esyvVarA.b(etddVar, cqptVar.d());
        }
        etddVar.h();
    }

    public final String toString() {
        return "TypeAdapter(TenorMedia)";
    }
}
