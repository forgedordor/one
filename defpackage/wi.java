package defpackage;

import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class wi {
    public final SparseArray a = new SparseArray();
    public int b = 0;
    final Set c = Collections.newSetFromMap(new IdentityHashMap());

    static final long g(long j, long j2) {
        return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
    }

    public final wh a(int i) {
        SparseArray sparseArray = this.a;
        wh whVar = (wh) sparseArray.get(i);
        if (whVar != null) {
            return whVar;
        }
        wh whVar2 = new wh();
        sparseArray.put(i, whVar2);
        return whVar2;
    }

    public wv b(int i) {
        wh whVar = (wh) this.a.get(i);
        if (whVar == null) {
            return null;
        }
        ArrayList arrayList = whVar.a;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
        } while (((wv) arrayList.get(size)).r());
        return (wv) arrayList.remove(size);
    }

    public final void c() {
        this.b++;
    }

    public final void d() {
        this.b--;
    }

    public void e(wv wvVar) {
        int i = wvVar.f;
        ArrayList arrayList = a(i).a;
        if (((wh) this.a.get(i)).b <= arrayList.size()) {
            ljc.b(wvVar.a);
            return;
        }
        int i2 = RecyclerView.aa;
        wvVar.l();
        arrayList.add(wvVar);
    }

    public final void f(int i, int i2) {
        wh whVarA = a(i);
        whVarA.b = i2;
        ArrayList arrayList = whVarA.a;
        while (arrayList.size() > i2) {
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
