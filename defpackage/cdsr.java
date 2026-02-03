package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdsr implements cdse {
    @Override // defpackage.cdse
    public final int a() {
        return 5;
    }

    @Override // defpackage.cdse
    public final boolean b(URL url) {
        url.getClass();
        return url.getHost().equals("reddit.com");
    }

    @Override // defpackage.cdse
    public final Object c(cdsi cdsiVar) {
        String strA = fguz.a("shreddit-title", cdsiVar.a()).a(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE);
        strA.getClass();
        String strA2 = fguz.a("img#post-image", cdsiVar.a()).a("src");
        strA2.getClass();
        return new cdsd(strA, null, strA2, 2);
    }
}
