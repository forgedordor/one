package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwtr extends cwty {
    private final Context e;
    private final SmartSuggestionData f;

    public cwtr(Context context, SmartSuggestionData smartSuggestionData, View view) {
        super(context, smartSuggestionData, view);
        this.e = context;
        this.f = smartSuggestionData;
    }

    @Override // defpackage.cwty
    public final Optional a(int i) {
        return f(this.e, R.drawable.quantum_ic_content_copy_grey600_24, i, true);
    }

    @Override // defpackage.cwty
    public final String c() {
        return this.e.getString(R.string.action_copy_otp, cpga.d(this.f.r()));
    }
}
