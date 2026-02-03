package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avav implements fdae {
    final /* synthetic */ fdvc[] a;
    final /* synthetic */ fdav b;

    public avav(fdvc[] fdvcVarArr, fdav fdavVar) {
        this.a = fdvcVarArr;
        this.b = fdavVar;
    }

    @Override // defpackage.fdae
    public final Object invoke() {
        ArrayList arrayList = new ArrayList(4);
        for (int i = 0; i < 4; i++) {
            fdvc fdvcVar = this.a[i];
            arrayList.add(fdvcVar != null ? fdvcVar.c() : null);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        return this.b.a(array[0], array[1], array[2], array[3]);
    }
}
