package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgwb implements eblu {
    private final dgwe a;

    public dgwb(dgwe dgweVar) {
        this.a = dgweVar;
    }

    @Override // defpackage.eblu
    public final void a(eblm eblmVar) {
        c(eblmVar);
    }

    @Override // defpackage.eblu
    public final void b(eblm eblmVar) {
        if (eblmVar.g()) {
            ebqq ebqqVar = eblmVar.b;
            ebqqVar.getClass();
            this.a.K((ebpe) ebqqVar.a);
        }
    }

    @Override // defpackage.eblu
    public final void c(eblm eblmVar) {
        ebqq ebqqVar = eblmVar.a;
        if (ebqqVar != null) {
            dgwe dgweVar = this.a;
            Iterator it = dgweVar.g.iterator();
            while (it.hasNext()) {
                dgwh dgwhVar = (dgwh) it.next();
                try {
                    if (dgwhVar instanceof dgwi) {
                        ((dgwi) dgwhVar).u();
                    }
                } catch (Exception e) {
                    dhja.j(e, dgwe.f, "timeout: Call to listener failed with error: ", new Object[0]);
                }
            }
        }
    }
}
