package defpackage;

import android.media.MediaMuxer;
import android.util.Log;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euxy {
    public static final String a = "euxy";
    public euya b;
    public euxx c;
    public MediaMuxer d;
    public boolean e = false;
    private boolean f;
    private boolean g;

    public euxy(String str) {
        this.d = new MediaMuxer(str, 0);
    }

    final synchronized void a(euxz euxzVar) {
        ejwl.l((this.b == null && this.c == null) ? false : true);
        euya euyaVar = this.b;
        if (euxzVar == euyaVar) {
            this.g = true;
        } else if (euxzVar == this.c) {
            this.f = true;
        }
        if ((this.c == null || this.f) && (euyaVar == null || this.g)) {
            if (this.e) {
                throw new RuntimeException("Muxer has already been started!");
            }
            if (euyaVar != null) {
                euyaVar.b();
            }
            euxx euxxVar = this.c;
            if (euxxVar != null) {
                euxxVar.b();
            }
            this.d.start();
            this.e = true;
            Log.d(a, "Muxer started.");
        }
    }

    public final synchronized void b() {
        MediaMuxer mediaMuxer;
        Log.d(a, "Stopping Mp4Encoder");
        euya euyaVar = this.b;
        if (euyaVar != null) {
            euyaVar.d();
            this.b = null;
        }
        euxx euxxVar = this.c;
        if (euxxVar != null) {
            euxxVar.d();
            this.c = null;
        }
        try {
            mediaMuxer = this.d;
        } catch (IllegalStateException e) {
            Log.e(a, "Muxer was in an illegal state:".concat(String.valueOf(e.getMessage())));
        }
        if (mediaMuxer != null) {
            mediaMuxer.stop();
            this.d.release();
            this.d = null;
        } else {
            this.d = null;
        }
    }

    public final synchronized void c(byte[] bArr, long j) {
        ByteBuffer inputBuffer;
        euxx euxxVar = this.c;
        if (euxxVar != null) {
            ejwl.a(euxxVar.j);
            ejwl.a(!euxxVar.l);
            for (int i = 0; euxxVar.e() && i < 20; i++) {
                try {
                } catch (IllegalStateException e) {
                    Log.e(euxz.a, "Encoder was in an illegal state:".concat(String.valueOf(e.toString())));
                    return;
                }
            }
            int iDequeueInputBuffer = euxxVar.g.dequeueInputBuffer(euxxVar.b);
            if (iDequeueInputBuffer == -1) {
                if (euxxVar.f.e) {
                    iDequeueInputBuffer = -1;
                }
            }
            if (iDequeueInputBuffer != -1 && iDequeueInputBuffer >= 0 && (inputBuffer = euxxVar.g.getInputBuffer(iDequeueInputBuffer)) != null) {
                inputBuffer.put(bArr);
                long j2 = euxxVar.e;
                if (j < j2) {
                    j = euxxVar.d + j2;
                }
                long j3 = j;
                Log.d(euxz.a, "Track: " + euxxVar.h + " Encoding at pts: " + j3);
                euxxVar.g.queueInputBuffer(iDequeueInputBuffer, 0, bArr.length, j3, 0);
            }
        }
    }

    public final synchronized void d() {
        euya euyaVar = this.b;
        if (euyaVar != null) {
            ejwl.a(euyaVar.j);
            ejwl.a(!euyaVar.l);
            ejwl.a(euyaVar.o);
            euyaVar.e();
        }
    }
}
