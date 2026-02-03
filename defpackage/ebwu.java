package defpackage;

import android.util.Log;
import java.util.Collections;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebwu implements eora {
    final /* synthetic */ ebww a;

    public ebwu(ebww ebwwVar) {
        this.a = ebwwVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        etyn etynVar = (etyn) obj;
        if (etynVar.b.size() <= 0) {
            ebww ebwwVar = this.a;
            ebwwVar.b.l(Collections.EMPTY_LIST);
            ebwwVar.a.b(ebwwVar.f);
            return;
        }
        ebww ebwwVar2 = this.a;
        ebwwVar2.b.l(etynVar.b);
        ebxl ebxlVar = (ebxl) ebwwVar2.a;
        ebxlVar.f.setVisibility(0);
        ebxlVar.g.setVisibility(8);
        ebxlVar.h.setVisibility(8);
        ebxlVar.i.setVisibility(8);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        Log.w("SearchStickerController", "Search failed", th);
        ebww ebwwVar = this.a;
        ebwwVar.b.l(Collections.EMPTY_LIST);
        ebwwVar.a.b(ebwwVar.f);
        ebwwVar.d.C();
    }
}
