package defpackage;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oet {
    public static void a(MediaFormat mediaFormat, LogSessionId logSessionId) {
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        mediaFormat.setString("log-session-id", logSessionId.getStringId());
    }
}
