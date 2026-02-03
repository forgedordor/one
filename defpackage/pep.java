package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pep extends pdg {
    public final pdi a;
    public final pfa b;
    public final List c;
    public pjo d;
    public final pha e;

    public pep(pdi pdiVar, pfa pfaVar) {
        this.a = pdiVar;
        this.b = pfaVar;
        this.c = pdiVar.e;
        this.e = new pha(new phb(pdiVar.c.a(pjq.a(pdiVar.a, pdiVar.b, new pen(this, pfaVar.a), false, false))));
        d();
    }

    private final void d() {
        pjt pjtVarC = c();
        if (pjtVarC != null) {
            boolean z = this.a.p == 3;
            pki pkiVar = (pki) pjtVarC;
            if (pkiVar.f.b()) {
                pkiVar.a().setWriteAheadLoggingEnabled(z);
            }
            pkiVar.g = z;
        }
    }

    @Override // defpackage.pdg
    protected final pfa a() {
        return this.b;
    }

    public final pjt c() {
        pha phaVar = this.e;
        if (true != (phaVar instanceof pha)) {
            phaVar = null;
        }
        if (phaVar != null) {
            return phaVar.a.a;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, pjt] */
    public pep(pdi pdiVar, fdap fdapVar) {
        this.a = pdiVar;
        this.b = new pem();
        this.c = pdiVar.e;
        this.e = new pha(new phb(fdapVar.invoke(new pdi(pdiVar.a, pdiVar.b, pdiVar.c, pdiVar.d, fcva.ai(pdiVar.e, new peo(new fdap() { // from class: pel
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                pjo pjoVar = (pjo) obj;
                pjoVar.getClass();
                this.a.d = pjoVar;
                return fctx.a;
            }
        })), pdiVar.f, pdiVar.p, pdiVar.g, pdiVar.h, pdiVar.i, pdiVar.j, pdiVar.k, pdiVar.l, pdiVar.m, pdiVar.n))));
        d();
    }
}
