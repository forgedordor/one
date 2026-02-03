package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ackh implements acjy {
    private final Context a;
    private final ekgb b;

    public ackh(Context context, ekgb ekgbVar) {
        this.a = context;
        this.b = ekgbVar;
    }

    @Override // defpackage.acjy
    public final ekgb a() {
        return this.b;
    }

    @Override // defpackage.acjy
    public final elia b() {
        return elia.BUGLE_ADVANCED_FEEDBACK_ISSUE_TYPE_MESSAGES_FAIL_TO_DOWNLOAD;
    }

    @Override // defpackage.acjy
    public final String c() {
        return this.a.getString(R.string.message_fail_to_download_text);
    }
}
