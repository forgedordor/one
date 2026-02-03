package defpackage;

import android.util.Log;
import java.util.Deque;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddjn implements eora {
    final /* synthetic */ ddjo a;
    final /* synthetic */ ddkb b;

    public ddjn(ddjo ddjoVar, ddkb ddkbVar) {
        this.b = ddkbVar;
        this.a = ddjoVar;
    }

    @Override // defpackage.eora
    public final void b(Object obj) {
        Deque deque = this.a.a;
        synchronized (deque) {
            if (deque.isEmpty()) {
                if (Log.isLoggable("ExampleIterator", 3)) {
                    Log.d("ExampleIterator", "No results found matching query.");
                }
                this.b.b(null, null);
            } else {
                ejwj ejwjVar = (ejwj) deque.removeFirst();
                if (Log.isLoggable("ExampleIterator", 3)) {
                    Log.d("ExampleIterator", "Returning result with id=".concat(String.valueOf(String.valueOf(ejwjVar.a))));
                }
                this.b.b((byte[]) ejwjVar.b, ((etph) ejwjVar.a).toByteArray());
            }
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        Log.e("ExampleIterator", "Failed to get results", th);
        this.b.a(8, ejxy.a(th));
    }
}
