package defpackage;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class luw implements piv {
    @Override // defpackage.piv
    public final void a(pjb pjbVar) throws NoSuchMethodException, SecurityException {
        if (!(pjbVar instanceof lxq)) {
            Objects.toString(pjbVar);
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ".concat(pjbVar.toString()));
        }
        lxp lxpVarS = ((lxq) pjbVar).S();
        pix pixVarU = pjbVar.U();
        Iterator it = lxpVarS.b().iterator();
        while (it.hasNext()) {
            lxd lxdVarA = lxpVarS.a((String) it.next());
            if (lxdVarA != null) {
                luy.b(lxdVarA, pixVarU, pjbVar.P());
            }
        }
        if (lxpVarS.b().isEmpty()) {
            return;
        }
        pixVarU.c(luw.class);
    }
}
