package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwtu extends cwty {
    private final Context e;

    public cwtu(Context context, SuggestionData suggestionData, View view) {
        super(context, suggestionData, view);
        this.e = context;
    }

    @Override // defpackage.cwty
    public final Optional a(int i) {
        return f(this.e, R.drawable.quantum_gm_ic_calendar_add_on_gm_grey_24, i, true);
    }

    @Override // defpackage.cwty
    public final String b() {
        return cwty.g(this.e.getString(R.string.conversation_suggestion_launch_calendar_action), c());
    }
}
