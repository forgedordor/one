package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zfw implements fdae {
    final /* synthetic */ auyl[] a;

    public zfw(auyl[] auylVarArr) {
        this.a = auylVarArr;
    }

    @Override // defpackage.fdae
    public final dlhm invoke() {
        ArrayList arrayList = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            auyl auylVar = this.a[i];
            arrayList.add(auylVar != null ? auylVar.b() : null);
        }
        Object[] array = arrayList.toArray(new Object[0]);
        Object obj = array[0];
        dlhu dlhuVar = (dlhu) array[1];
        dlhm dlhmVar = (dlhm) obj;
        return ((Boolean) array[2]).booleanValue() ? dlhm.l(dlhmVar, null, null, dlhuVar, null, null, false, false, 4194299) : dlhm.l(dlhmVar, null, null, dlhuVar, null, null, false, false, 4192251);
    }
}
