package defpackage;

import j$.util.Objects;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ndo implements ney, nal {
    final /* synthetic */ ndq a;
    private final Object b;
    private nex c;
    private nak d;

    public ndo(ndq ndqVar, Object obj) {
        this.a = ndqVar;
        this.c = ndqVar.c(null);
        this.d = ndqVar.b(null);
        this.b = obj;
    }

    private final boolean k(nen nenVar) {
        nen nenVarX;
        if (nenVar != null) {
            nenVarX = this.a.x(this.b, nenVar);
            if (nenVarX == null) {
                return false;
            }
        } else {
            nenVarX = null;
        }
        ndq ndqVar = this.a;
        ndqVar.A(this.b);
        nex nexVar = this.c;
        int i = nexVar.a;
        if (!Objects.equals(nexVar.b, nenVarX)) {
            this.c = ndqVar.b.g(nenVarX);
        }
        nak nakVar = this.d;
        int i2 = nakVar.a;
        if (Objects.equals(nakVar.b, nenVarX)) {
            return true;
        }
        this.d = ndqVar.c.f(nenVarX);
        return true;
    }

    private final void l(nej nejVar) {
        ndq ndqVar = this.a;
        Object obj = this.b;
        ndqVar.B(obj);
        ndqVar.B(obj);
    }

    @Override // defpackage.ney
    public final void eB(int i, nen nenVar, nej nejVar) {
        if (k(nenVar)) {
            nex nexVar = this.c;
            l(nejVar);
            nexVar.b(nejVar);
        }
    }

    @Override // defpackage.ney
    public final void eC(int i, nen nenVar, nee neeVar, nej nejVar) {
        if (k(nenVar)) {
            nex nexVar = this.c;
            l(nejVar);
            nexVar.c(neeVar, nejVar);
        }
    }

    @Override // defpackage.ney
    public final void eD(int i, nen nenVar, nee neeVar, nej nejVar) {
        if (k(nenVar)) {
            nex nexVar = this.c;
            l(nejVar);
            nexVar.d(neeVar, nejVar);
        }
    }

    @Override // defpackage.ney
    public final void eE(int i, nen nenVar, nee neeVar, nej nejVar, IOException iOException, boolean z) {
        if (k(nenVar)) {
            nex nexVar = this.c;
            l(nejVar);
            nexVar.e(neeVar, nejVar, iOException, z);
        }
    }

    @Override // defpackage.ney
    public final void eF(int i, nen nenVar, nee neeVar, nej nejVar, int i2) {
        if (k(nenVar)) {
            nex nexVar = this.c;
            l(nejVar);
            nexVar.f(neeVar, nejVar, i2);
        }
    }

    @Override // defpackage.nal
    public final void eG(int i, nen nenVar) {
        if (k(nenVar)) {
            this.d.a();
        }
    }

    @Override // defpackage.nal
    public final void eH(int i, nen nenVar) {
        if (k(nenVar)) {
            this.d.b();
        }
    }

    @Override // defpackage.nal
    public final void eI(int i, nen nenVar, int i2) {
        if (k(nenVar)) {
            this.d.c(i2);
        }
    }

    @Override // defpackage.nal
    public final void eJ(int i, nen nenVar, Exception exc) {
        if (k(nenVar)) {
            this.d.d(exc);
        }
    }

    @Override // defpackage.nal
    public final void eK(int i, nen nenVar) {
        if (k(nenVar)) {
            this.d.e();
        }
    }
}
