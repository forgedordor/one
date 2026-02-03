package defpackage;

import android.content.Intent;
import android.net.Uri;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czma {
    public final Intent a;

    public czma(Intent intent) {
        this.a = intent;
    }

    public final void a(String str) {
        this.a.putExtra("content_type", str);
    }

    public final void b(Uri uri) {
        this.a.putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
    }

    public final void c(int i) {
        this.a.putExtra("opening_source", i - 1);
    }
}
