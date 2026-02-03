package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class rlw implements rlq {
    private final List a;
    private final lcd b;

    public rlw(List list, lcd lcdVar) {
        this.a = list;
        this.b = lcdVar;
    }

    @Override // defpackage.rlq
    public final rlp a(Object obj, int i, int i2, rex rexVar) {
        rlp rlpVarA;
        List list = this.a;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        res resVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            rlq rlqVar = (rlq) list.get(i3);
            if (rlqVar.b(obj) && (rlpVarA = rlqVar.a(obj, i, i2, rexVar)) != null) {
                arrayList.add(rlpVarA.c);
                resVar = rlpVarA.a;
            }
        }
        if (arrayList.isEmpty() || resVar == null) {
            return null;
        }
        return new rlp(resVar, new rlv(arrayList, this.b));
    }

    @Override // defpackage.rlq
    public final boolean b(Object obj) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((rlq) it.next()).b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.a.toArray()) + "}";
    }
}
