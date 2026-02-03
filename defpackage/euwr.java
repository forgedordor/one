package defpackage;

import android.media.AudioFormat;
import android.os.AsyncTask;
import android.util.Log;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euwr implements euvx {
    public static final String a = "euwr";
    public int c;
    public boolean d;
    public final euxy f;
    boolean g;
    public final Object b = new Object();
    public boolean e = false;

    public euwr(euxy euxyVar, int i, boolean z) {
        this.d = false;
        boolean zA = true;
        this.g = true;
        ejwl.a(euxyVar.d != null);
        if (euxyVar.c == null) {
            euxyVar.c = new euxx(euxyVar, i);
            zA = euxyVar.c.a();
        }
        this.d = zA;
        this.f = euxyVar;
        this.g = z;
    }

    @Override // defpackage.euvx
    public final void a(ByteBuffer byteBuffer, long j, AudioFormat audioFormat) {
        if (this.g && (audioFormat.getChannelCount() != 2 || audioFormat.getSampleRate() != 44100)) {
            Log.e(a, "Producer's AudioFormat doesn't match consumer's AudioFormat");
            return;
        }
        synchronized (this.b) {
            this.c++;
        }
        new euwq(this).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, byteBuffer, Long.valueOf(j));
    }
}
