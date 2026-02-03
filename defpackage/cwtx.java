package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwtx extends cwty {
    private final Context e;

    public cwtx(Context context, SuggestionData suggestionData, View view) {
        super(context, suggestionData, view);
        this.e = context;
    }

    @Override // defpackage.cwty
    public final String b() {
        return cwty.g(this.e.getString(R.string.conversation_suggestion_send_reply), c());
    }

    @Override // defpackage.cwty
    public final String c() {
        String strC = super.c();
        return !TextUtils.isEmpty(strC) ? strC : this.b.d();
    }
}
