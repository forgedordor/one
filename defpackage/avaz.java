package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avaz implements fdae {
    final /* synthetic */ fdvc[] a;
    final /* synthetic */ fdax b;

    public avaz(fdvc[] fdvcVarArr, fdax fdaxVar) {
        this.a = fdvcVarArr;
        this.b = fdaxVar;
    }

    @Override // defpackage.fdae
    public final Object invoke() {
        ArrayList arrayList = new ArrayList(6);
        for (int i = 0; i < 6; i++) {
            fdvc fdvcVar = this.a[i];
            arrayList.add(fdvcVar != null ? fdvcVar.c() : null);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        return this.b.a(array[0], array[1], array[2], array[3], array[4], array[5]);
    }
}
