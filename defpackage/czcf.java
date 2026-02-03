package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifContentItem;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czcf implements eora {
    final /* synthetic */ czch a;

    public czcf(czch czchVar) {
        this.a = czchVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List<btei> list = (List) obj;
        czch czchVar = this.a;
        czchVar.g(false);
        czcj czcjVar = czchVar.i;
        List list2 = czcjVar.d;
        list2.clear();
        for (btei bteiVar : list) {
            Uri uriK = bteiVar.k();
            if (uriK == null) {
                throw new IllegalStateException("Received invalid content item null with URL");
            }
            Uri uriM = bteiVar.m();
            String strN = bteiVar.n();
            String strO = bteiVar.o();
            bteiVar.aA(4, "width");
            int i = bteiVar.e;
            bteiVar.aA(5, "height");
            list2.add(new GifContentItem(uriK, uriK, uriM, strN, strO, "", i, bteiVar.f));
        }
        czcjVar.a = true;
        czcjVar.p();
        if (czchVar.s && list.isEmpty()) {
            czchVar.i();
        } else {
            czchVar.a.af(emsl.LOADED);
        }
        czchVar.s = false;
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        czch czchVar = this.a;
        czchVar.g(false);
        cqca.h("Bugle", th, "Failed to fetch recent gifs from database");
        if (czchVar.s) {
            czchVar.i();
        } else {
            czchVar.a.af(emsl.FAILED_TO_LOAD);
        }
        czchVar.s = false;
    }
}
