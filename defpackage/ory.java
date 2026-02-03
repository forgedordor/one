package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ory {
    public final oxu a = new oxu();
    public final fduf b;
    public final fdvc c;

    public ory() {
        fduf fdufVarA = fdvf.a(null);
        this.b = fdufVarA;
        this.c = new fduh(fdufVarA);
    }

    public static final opc b(opc opcVar, orq orqVar) {
        orp orpVar = opcVar != null ? opcVar.a : oro.b;
        orp orpVar2 = orqVar.b;
        return new opc(d(orpVar, orpVar2, orpVar2, null), d(opcVar != null ? opcVar.b : oro.b, orpVar2, orqVar.c, null), d(opcVar != null ? opcVar.c : oro.b, orpVar2, orqVar.d, null), orqVar);
    }

    public final void a(fdap fdapVar) {
        fduf fdufVar;
        Object objC;
        opc opcVar;
        do {
            fdufVar = this.b;
            objC = fdufVar.c();
            opc opcVar2 = (opc) objC;
            opcVar = (opc) fdapVar.invoke(opcVar2);
            if (fdbq.f(opcVar2, opcVar)) {
                return;
            }
        } while (!fdufVar.g(objC, opcVar));
        if (opcVar != null) {
            Iterator<T> it = this.a.iterator();
            while (it.hasNext()) {
                ((fdap) it.next()).invoke(opcVar);
            }
        }
    }

    public final void c(final orq orqVar) {
        a(new fdap() { // from class: orx
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                return ory.b((opc) obj, orqVar);
            }
        });
    }

    private static final orp d(orp orpVar, orp orpVar2, orp orpVar3, orp orpVar4) {
        return orpVar3;
    }
}
