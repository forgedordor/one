package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekhn implements Serializable {
    private static final long serialVersionUID = 0;
    private final ekgp a;

    public ekhn(ekgp ekgpVar) {
        this.a = ekgpVar;
    }

    Object readResolve() {
        ekgp ekgpVar = this.a;
        if (ekgpVar.isEmpty()) {
            return ekho.a;
        }
        ArrayList arrayList = new ArrayList();
        ekqg ekqgVarListIterator = ekgpVar.entrySet().listIterator();
        while (ekqgVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            ekhm.b((eknz) entry.getKey(), entry.getValue(), arrayList);
        }
        return ekhm.a(arrayList);
    }
}
