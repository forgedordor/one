package defpackage;

import android.os.Bundle;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class ddem {
    final int a;
    final defr b = new defr();
    final Bundle c;

    public ddem(int i, Bundle bundle) {
        this.a = i;
        this.c = bundle;
    }

    final void a(dden ddenVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", a.c(ddenVar, this, "Failing ", " with "));
        }
        this.b.a(ddenVar);
    }

    public abstract void b(Bundle bundle);

    public final String toString() {
        return "Request { what=1 id=" + this.a + " oneWay=false}";
    }
}
