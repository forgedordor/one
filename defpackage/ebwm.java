package defpackage;

import android.util.Log;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebwm implements eora {
    final /* synthetic */ ebwo a;

    public ebwm(ebwo ebwoVar) {
        this.a = ebwoVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list = (List) obj;
        ebwn ebwnVar = this.a.b;
        if (ebwnVar != null) {
            ebwj ebwjVar = (ebwj) ebwnVar;
            ebwd ebwdVar = ebwjVar.h;
            List list2 = ebwdVar.g;
            list2.clear();
            list2.addAll(list);
            ebwdVar.f.clear();
            ebwdVar.p();
            if (list.isEmpty()) {
                ebwjVar.f();
            } else {
                ebwjVar.d();
            }
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        Log.e("FavoritePacksViewContr", "Error fetching favorite sticker packs", th);
    }
}
