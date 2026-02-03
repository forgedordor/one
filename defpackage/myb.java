package defpackage;

import android.media.AudioTrack;

/* compiled from: PG */
/* loaded from: classes.dex */
final class myb {
    public final mya a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public final myt h;
    private final int i;

    public myb(AudioTrack audioTrack, myt mytVar) {
        this.a = new mya(audioTrack);
        this.i = audioTrack.getSampleRate();
        this.h = mytVar;
        c();
    }

    public final long a(long j, float f) {
        mya myaVar = this.a;
        return b(myaVar.e, myaVar.a(), j, f);
    }

    public final long b(long j, long j2, long j3, float f) {
        return mgb.x(j, this.i) + mgb.u(j3 - j2, f);
    }

    public final void c() {
        d(0);
    }

    public final void d(int i) {
        this.b = i;
        long j = 10000;
        if (i == 0) {
            this.e = 0L;
            this.f = -1L;
            this.g = -9223372036854775807L;
            this.c = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.d = 10000L;
                return;
            }
            j = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.d = j;
    }
}
