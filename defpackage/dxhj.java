package defpackage;

import android.content.Intent;
import android.os.Process;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxhj {
    public static final void a(dxhl dxhlVar, Intent intent, dxfy dxfyVar, long j) throws SecurityException, IllegalArgumentException {
        int threadPriority = Process.getThreadPriority(0);
        try {
            Process.setThreadPriority(10);
            dxhlVar.a(intent, dxfyVar, j);
        } finally {
            Process.setThreadPriority(threadPriority);
        }
    }
}
