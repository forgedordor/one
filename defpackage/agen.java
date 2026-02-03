package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agen implements afyw {
    private final Context a;

    public agen(Context context) {
        this.a = context;
    }

    @Override // defpackage.afyw
    public final /* bridge */ /* synthetic */ Object a(afzv afzvVar, fcxy fcxyVar) throws IOException {
        Intent data = craf.e ? new Intent("android.settings.PREMIUM_SMS_SETTINGS").setData(Uri.parse("package: com.android.settings")) : new Intent("android.settings.APP_SEARCH_SETTINGS").putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, this.a.getString(R.string.premium_sms_search_query));
        data.getClass();
        eiid.o(this.a, data);
        return fctx.a;
    }
}
