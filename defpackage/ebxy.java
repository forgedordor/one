package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebxy implements eora {
    final /* synthetic */ ebxz a;

    public ebxy(ebxz ebxzVar) {
        this.a = ebxzVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Log.d("MetadataFetcher", "load() succeeded with cache key ".concat(String.valueOf(this.a.e)));
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ebxz ebxzVar = this.a;
        if (th instanceof CancellationException) {
            Log.d("MetadataFetcher", "load() cancelled for cache key ".concat(String.valueOf(ebxzVar.e)));
        } else {
            Log.w("MetadataFetcher", "load() failed for cache key ".concat(String.valueOf(ebxzVar.e)), th);
        }
        synchronized (ebxzVar.b) {
            ebxzVar.g = null;
        }
    }
}
