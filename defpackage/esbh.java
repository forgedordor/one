package defpackage;

import android.content.Context;
import com.google.firebase.appindexing.internal.Thing;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esbh extends esab {
    final esbg a;

    public esbh(Context context) {
        this.a = new esbg(new esbb(context));
    }

    private final defn e(esbr esbrVar) {
        boolean zIsEmpty;
        esbg esbgVar = this.a;
        esbf esbfVar = new esbf(esbgVar, esbrVar);
        defv defvVar = esbfVar.b.a;
        defvVar.o(esbgVar, esbgVar);
        Queue queue = esbgVar.b;
        synchronized (queue) {
            zIsEmpty = queue.isEmpty();
            queue.add(esbfVar);
        }
        if (zIsEmpty) {
            esbfVar.a();
        }
        return defvVar;
    }

    @Override // defpackage.esab
    public final defn a(String... strArr) {
        return e(new esbr(3, null, strArr, null, null, null, null));
    }

    @Override // defpackage.esab
    public final defn b() {
        return e(new esbr(4, null, null, null, null, null, null));
    }

    @Override // defpackage.esab
    public final defn c(esal... esalVarArr) {
        Thing[] thingArr;
        if (esalVarArr == null) {
            thingArr = null;
        } else {
            try {
                int length = esalVarArr.length;
                Thing[] thingArr2 = new Thing[length];
                System.arraycopy(esalVarArr, 0, thingArr2, 0, length);
                thingArr = thingArr2;
            } catch (ArrayStoreException unused) {
                return degc.b(new esaf("Custom Indexable-objects are not allowed. Please use the 'Indexables'-class for creating the objects."));
            }
        }
        return thingArr == null ? degc.b(new esaf("Indexables cannot be null.")) : e(new esbr(1, thingArr, null, null, null, null, null));
    }
}
