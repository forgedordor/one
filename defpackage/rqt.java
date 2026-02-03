package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rqt implements rfa {
    @Override // defpackage.red
    public final /* bridge */ /* synthetic */ boolean a(Object obj, File file, rex rexVar) throws Throwable {
        try {
            ruu.c(((rqs) ((rhy) obj).c()).b(), file);
            return true;
        } catch (IOException e) {
            if (!Log.isLoggable("GifEncoder", 5)) {
                return false;
            }
            Log.w("GifEncoder", "Failed to encode GIF drawable data", e);
            return false;
        }
    }

    @Override // defpackage.rfa
    public final int b() {
        return 1;
    }
}
