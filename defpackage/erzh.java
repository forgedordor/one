package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erzh implements dcgn {
    public static final AtomicReference a = new AtomicReference();

    @Override // defpackage.dcgn
    public final void a(boolean z) {
        synchronized (erzj.a) {
            Iterator it = new ArrayList(erzj.b.values()).iterator();
            while (it.hasNext()) {
                erzj erzjVar = (erzj) it.next();
                if (erzjVar.d.get()) {
                    Log.d("FirebaseApp", "Notifying background state change listeners.");
                    Iterator it2 = erzjVar.g.iterator();
                    while (it2.hasNext()) {
                        ((erzg) it2.next()).a(z);
                    }
                }
            }
        }
    }
}
