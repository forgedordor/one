package defpackage;

import android.graphics.Bitmap;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dynl implements eora {
    final /* synthetic */ dyvh a;

    public dynl(dyvh dyvhVar) {
        this.a = dyvhVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.a.a((Bitmap) obj);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        Log.w("AvatarRetriever", "Failed to load avatar.", th);
        this.a.a(null);
    }
}
