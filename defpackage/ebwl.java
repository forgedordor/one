package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebwl implements eora {
    final /* synthetic */ ebwo a;

    public ebwl(ebwo ebwoVar) {
        this.a = ebwoVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Boolean bool = (Boolean) obj;
        ebwn ebwnVar = this.a.b;
        if (ebwnVar == null || !bool.booleanValue()) {
            return;
        }
        ebwj ebwjVar = (ebwj) ebwnVar;
        if (ebwjVar.f.getVisibility() != 0) {
            ebwjVar.g.setVisibility(0);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        Log.e("FavoritePacksViewContr", "Error determine whether to show stickers favorites prompt", th);
    }
}
