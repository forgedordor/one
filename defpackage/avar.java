package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avar implements fdae {
    final /* synthetic */ fdvc[] a;
    final /* synthetic */ fdat b;

    public avar(fdvc[] fdvcVarArr, fdat fdatVar) {
        this.a = fdvcVarArr;
        this.b = fdatVar;
    }

    @Override // defpackage.fdae
    public final Object invoke() {
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            fdvc fdvcVar = this.a[i];
            arrayList.add(fdvcVar != null ? fdvcVar.c() : null);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        return this.b.a(array[0], array[1]);
    }
}
