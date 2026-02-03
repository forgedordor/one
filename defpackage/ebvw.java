package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebvw implements eora {
    final /* synthetic */ ebwd a;

    public ebvw(ebwd ebwdVar) {
        this.a = ebwdVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        etyu etyuVar = (etyu) obj;
        String str = etyuVar.b;
        ebwd ebwdVar = this.a;
        Set set = ebwdVar.f;
        if (!set.contains(str)) {
            ebwdVar.g.add(etyuVar);
            ebwdVar.s(r0.size() - 1);
            return;
        }
        set.remove(etyuVar.b);
        ArrayList arrayList = new ArrayList();
        List<etyu> list = ebwdVar.g;
        for (etyu etyuVar2 : list) {
            if (!set.contains(etyuVar2.b)) {
                arrayList.add(etyuVar2.b);
            }
        }
        ebwdVar.a.o().d(arrayList);
        ebwdVar.q(list.indexOf(etyuVar));
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        Log.e("FavoriteStickerPacksAda", "Failed to fetch sticker pack by pack name", th);
    }
}
