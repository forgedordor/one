package defpackage;

import com.google.android.apps.messaging.R;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final /* synthetic */ class doby extends fdbo implements fdat {
    public doby(Object obj) {
        super(2, obj, docj.class, "onSearchFailed", "onSearchFailed(Ljava/lang/CharSequence;Ljava/io/IOException;)V", 0);
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        ((CharSequence) obj).getClass();
        ((IOException) obj2).getClass();
        docj docjVar = (docj) this.g;
        int i = docj.aA;
        docj.bk(docjVar, Integer.valueOf(R.drawable.quantum_gm_ic_sentiment_dissatisfied_vd_theme_24), null, docjVar.ap.compareAndSet(false, true) ? Integer.valueOf(R.string.search_rendering_unable_to_search) : null, null, null, 26);
        if (((dobm) docjVar.bC()).g()) {
            docjVar.bc();
        }
        return fctx.a;
    }
}
