package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.google.android.apps.messaging.navigation.targets.DirectSendResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agcm {
    public static final DirectSendResult a(Intent intent) {
        return (DirectSendResult) (Build.VERSION.SDK_INT > 33 ? (Parcelable) intent.getParcelableExtra("direct_send_result", DirectSendResult.class) : intent.getParcelableExtra("direct_send_result"));
    }
}
