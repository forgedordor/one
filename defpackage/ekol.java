package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekol implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] a;
    final int[] b;

    public ekol(ekni ekniVar) {
        ekhj ekhjVar = (ekhj) ekniVar;
        int size = ekhjVar.j().size();
        this.a = new Object[size];
        this.b = new int[size];
        int i = 0;
        for (eknh eknhVar : ekhjVar.j()) {
            this.a[i] = eknhVar.b();
            this.b[i] = eknhVar.a();
            i++;
        }
    }

    Object readResolve() {
        Object[] objArr = this.a;
        ekhg ekhgVar = new ekhg(objArr.length);
        for (int i = 0; i < objArr.length; i++) {
            ekhgVar.d(objArr[i], this.b[i]);
        }
        return ekhgVar.a();
    }
}
