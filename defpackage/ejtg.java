package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejtg implements lun {
    final /* synthetic */ ejtj a;
    private boolean b = false;

    public ejtg(ejtj ejtjVar) {
        this.a = ejtjVar;
    }

    @Override // defpackage.lun
    public final void d(lvj lvjVar) {
        ejtj ejtjVar = this.a;
        ((ejtt) ejtjVar.c.get()).e((fr) ejtjVar.a.get());
        if (this.b) {
            return;
        }
        lvjVar.P().c(new ejti(ejtjVar));
        this.b = true;
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        ejtj ejtjVar = this.a;
        ejtt ejttVar = (ejtt) ejtjVar.c.get();
        Object obj = ejtjVar.a.get();
        ejwl.a(obj != null);
        fr frVar = ejttVar.c;
        if (frVar != null) {
            ejwl.l(obj == frVar);
            ejttVar.c = null;
            csr csrVar = new csr((css) ejttVar.b);
            while (csrVar.hasNext()) {
                ((ejtx) csrVar.next()).b(null);
            }
        }
    }

    @Override // defpackage.lun
    public final void fh(lvj lvjVar) {
        ejtt ejttVar = (ejtt) this.a.c.get();
        ejwl.l(ejttVar.c == null);
        cvx cvxVar = ejttVar.a;
        int iC = cvxVar.c();
        while (true) {
            iC--;
            if (iC < 0) {
                ejttVar.f = false;
                return;
            } else {
                if (cvxVar.a) {
                    cvy.b(cvxVar);
                }
                cvxVar.c[iC] = null;
            }
        }
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        ejtj ejtjVar = this.a;
        ((ejtt) ejtjVar.c.get()).e((fr) ejtjVar.a.get());
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }
}
