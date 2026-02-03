package defpackage;

import android.net.Uri;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bbfd extends egxm {
    final /* synthetic */ bbfe a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bbfd(bbfe bbfeVar, eigp eigpVar) {
        super(eigpVar, "ShareRecentImageSuggestionGenerator.Observer#onChange", eoqg.a);
        this.a = bbfeVar;
    }

    @Override // defpackage.egxm
    public final void a(Uri uri) {
        if (uri == null) {
            return;
        }
        bbfe bbfeVar = this.a;
        Set set = bbfeVar.a;
        String string = uri.toString();
        if (set.add(string)) {
            bbfeVar.b.a(bbfeVar.c, string, bbfeVar.d, set);
        }
    }
}
