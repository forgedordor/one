package defpackage;

import android.util.Log;
import com.google.android.apps.messaging.R;
import com.google.android.material.snackbar.Snackbar;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ebvt implements eora {
    final /* synthetic */ ebvv a;

    public ebvt(ebvv ebvvVar) {
        this.a = ebvvVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ebvv ebvvVar = this.a;
        ebvr ebvrVar = ebvvVar.a;
        List list = ebvrVar.e;
        list.clear();
        for (etyu etyuVar : (List) obj) {
            int iA = etyt.a(etyuVar.c);
            if (iA == 0) {
                iA = 1;
            }
            if (iA - 2 != 1) {
                throw new IllegalStateException("Loaded pack type should be Regular.");
            }
            list.add(etyuVar);
        }
        if (ebvrVar.d) {
            list.add(ebvr.a);
        }
        ebvrVar.p();
        ebvvVar.a();
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        Log.e("BrowseStickerPacksView", "Error fetching sticker packs", th);
        ebvv ebvvVar = this.a;
        ebxh ebxhVar = ebvvVar.b;
        if (ebxhVar != null) {
            Snackbar.p(ebvvVar, R.string.get_sticker_packs_error_msg, -1).i();
        }
        ebvvVar.a();
        if (ebxhVar != null) {
            ebxhVar.C();
        }
    }
}
