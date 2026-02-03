package defpackage;

import java.io.IOException;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehpc implements lvh {
    final /* synthetic */ lva a;
    final /* synthetic */ fdci b;
    final /* synthetic */ fdjx c;
    final /* synthetic */ lva d;
    final /* synthetic */ fdis e;
    final /* synthetic */ feav f;
    final /* synthetic */ fdat g;

    public ehpc(lva lvaVar, fdci fdciVar, fdjx fdjxVar, lva lvaVar2, fdis fdisVar, feav feavVar, fdat fdatVar) {
        this.a = lvaVar;
        this.b = fdciVar;
        this.c = fdjxVar;
        this.d = lvaVar2;
        this.e = fdisVar;
        this.f = feavVar;
        this.g = fdatVar;
    }

    @Override // defpackage.lvh
    public final void gL(lvj lvjVar, lva lvaVar) throws IOException {
        fdlr fdlrVarC;
        if (lvaVar != this.a) {
            if (lvaVar == this.d) {
                fdci fdciVar = this.b;
                fdlr fdlrVar = (fdlr) fdciVar.a;
                if (fdlrVar != null) {
                    fdlrVar.t(null);
                }
                fdciVar.a = null;
            }
            if (lvaVar == lva.ON_DESTROY) {
                this.e.w(fctx.a);
                return;
            }
            return;
        }
        fdci fdciVar2 = this.b;
        fdjx fdjxVar = this.c;
        feav feavVar = this.f;
        fdat fdatVar = this.g;
        if (eidc.v()) {
            fcyi fcyiVar = fcyi.a;
            fdlrVarC = fdin.c(fdjxVar, eicg.a(fcyiVar), fdjz.a, new ehpa(null, feavVar, fdatVar));
        } else {
            UUID uuid = eidy.a;
            eidy eidyVar = new eidy("lifecycle state changed", eidy.a, eidy.b, eiey.a, eidc.b());
            eidc.g(eidyVar);
            try {
                fcyi fcyiVar2 = fcyi.a;
                fdlrVarC = fdin.c(fdjxVar, eicg.a(fcyiVar2), fdjz.a, new ehpb(null, feavVar, fdatVar));
                fczl.a(eidyVar, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    fczl.a(eidyVar, th);
                    throw th2;
                }
            }
        }
        fdciVar2.a = fdlrVarC;
    }
}
