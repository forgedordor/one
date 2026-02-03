package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ebvb implements eora {
    final /* synthetic */ String a;
    final /* synthetic */ ebvc b;

    public ebvb(ebvc ebvcVar, String str) {
        this.a = str;
        this.b = ebvcVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Log.i("ExpressiveStickerClient", "ListStickerPacks succeeded.");
        ebxs ebxsVar = this.b.f;
        ebxsVar.a = this.a;
        ebxsVar.g(4);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        if (th instanceof CancellationException) {
            Log.d("ExpressiveStickerClient", "ListStickerPacks cancelled.");
            return;
        }
        Log.w("ExpressiveStickerClient", "ListStickerPacks failed.", th);
        ebvc ebvcVar = this.b;
        String str = this.a;
        ebxs ebxsVar = ebvcVar.f;
        ebxsVar.a = str;
        ebxsVar.g(5);
    }
}
