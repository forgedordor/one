package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxbg implements dxbc {
    public final dwwy a;
    public final dwwy b;
    public dwzt d = null;
    public dwzu e = null;
    public dxbb c = new dxbb() { // from class: dxbe
    };

    public dxbg(dwpx dwpxVar, ejwi ejwiVar, dwje dwjeVar, dviq dviqVar, dxbd dxbdVar) {
        dxbdVar.a(this);
        dwwy dwwyVarA = dviqVar.a(dwjeVar, dwpxVar);
        this.a = dwwyVarA;
        if (ejwiVar.g()) {
            this.b = dwwr.d((dwwy) ejwiVar.c(), new ejvr() { // from class: dxbf
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    return ekgb.r((dwpf) obj);
                }
            });
        } else {
            this.b = ((dvop) dviqVar).l(dwjeVar).ai(dwpxVar);
        }
        new dwxc(dwwyVarA, this.b);
    }

    @Override // defpackage.dxbc
    public final void a() {
        dwzu dwzuVar = this.e;
        if (dwzuVar != null) {
            dxaw dxawVar = dwzuVar.a;
            dxawVar.B.c(dxawVar.b);
            dxawVar.j.a();
        }
    }

    @Override // defpackage.dxbc
    public final void b() {
        dwzt dwztVar = this.d;
        if (dwztVar != null) {
            dxaw dxawVar = dwztVar.a;
            dwyo.c(dxawVar.a);
            dxawVar.B.c(dxawVar.b);
            dxawVar.i.a();
        }
    }
}
