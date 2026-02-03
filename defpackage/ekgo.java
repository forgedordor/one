package defpackage;

import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ekgo implements Serializable {
    private static final long serialVersionUID = 0;
    private final Object a;
    private final Object b;

    public ekgo(ekgp ekgpVar) {
        Object[] objArr = new Object[ekgpVar.size()];
        Object[] objArr2 = new Object[ekgpVar.size()];
        ekqg ekqgVarListIterator = ekgpVar.entrySet().listIterator();
        int i = 0;
        while (ekqgVarListIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    public ekgi a(int i) {
        return new ekgi(i);
    }

    final Object readResolve() {
        Object obj = this.a;
        if (obj instanceof ekhx) {
            ekhx ekhxVar = (ekhx) obj;
            ekfn ekfnVar = (ekfn) this.b;
            ekgi ekgiVarA = a(ekhxVar.size());
            ekqg ekqgVarListIterator = ekhxVar.listIterator();
            ekqg ekqgVarListIterator2 = ekfnVar.listIterator();
            while (ekqgVarListIterator.hasNext()) {
                ekgiVarA.i(ekqgVarListIterator.next(), ekqgVarListIterator2.next());
            }
            return ekgiVarA.c();
        }
        Object obj2 = this.b;
        Object[] objArr = (Object[]) obj;
        ekgi ekgiVarA2 = a(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            ekgiVarA2.i(objArr[i], ((Object[]) obj2)[i]);
        }
        return ekgiVarA2.c();
    }
}
