package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ackr implements acjy {
    private final Context a;
    private final ekgb b;

    public ackr(Context context, ekgb ekgbVar) {
        this.a = context;
        this.b = ekgbVar;
    }

    @Override // defpackage.acjy
    public final ekgb a() {
        return this.b;
    }

    @Override // defpackage.acjy
    public final elia b() {
        return elia.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_OUT_OF_ORDER;
    }

    @Override // defpackage.acjy
    public final String c() {
        return this.a.getString(R.string.message_out_of_order_text);
    }
}
