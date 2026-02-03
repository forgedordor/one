package defpackage;

import android.util.Log;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebva implements eora {
    final /* synthetic */ String a;
    final /* synthetic */ ebvc b;

    public ebva(ebvc ebvcVar, String str) {
        this.a = str;
        this.b = ebvcVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Log.v("ExpressiveStickerClient", "Sticker search succeeded.");
        ebxs ebxsVar = this.b.f;
        ebxsVar.a = this.a;
        ebxsVar.g(22);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        if (th instanceof CancellationException) {
            Log.d("ExpressiveStickerClient", "Sticker search cancelled.", th);
            return;
        }
        Log.w("ExpressiveStickerClient", "Sticker search failed.", th);
        ebvc ebvcVar = this.b;
        String str = this.a;
        ebxs ebxsVar = ebvcVar.f;
        ebxsVar.a = str;
        ebxsVar.g(23);
    }
}
