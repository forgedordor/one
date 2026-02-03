package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ysz implements fdae {
    final /* synthetic */ auyl[] a;

    public ysz(auyl[] auylVarArr) {
        this.a = auylVarArr;
    }

    @Override // defpackage.fdae
    public final djpa invoke() {
        ArrayList arrayList = new ArrayList(2);
        int i = 0;
        while (true) {
            Object objB = null;
            if (i >= 2) {
                break;
            }
            auyl auylVar = this.a[i];
            if (auylVar != null) {
                objB = auylVar.b();
            }
            arrayList.add(objB);
            i++;
        }
        Object[] array = arrayList.toArray(new Object[0]);
        djpa djpaVar = (djpa) array[0];
        return ((Boolean) array[1]).booleanValue() ? djpaVar : djpa.l(djpaVar, null, false, false, 524286);
    }
}
