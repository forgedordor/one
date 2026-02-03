package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager$AudioRecordingCallback;
import android.media.AudioRecord;
import android.os.Build;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import j$.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccf implements ccc {
    public static final /* synthetic */ int l = 0;
    private static final long m = TimeUnit.MILLISECONDS.toNanos(500);
    public AudioRecord a;
    public final cbi b;
    public final int f;
    public Executor g;
    public long h;
    public AudioManager$AudioRecordingCallback i;
    public cbw k;
    private final int n;
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final AtomicReference e = new AtomicReference(null);
    public boolean j = false;

    public ccf(cbi cbiVar, Context context) throws cca, IllegalArgumentException {
        if (!h(cbiVar.d(), cbiVar.e(), cbiVar.a())) {
            throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(cbiVar.d()), Integer.valueOf(cbiVar.e()), Integer.valueOf(cbiVar.a())));
        }
        this.b = cbiVar;
        this.n = cbiVar.c();
        int i = i(cbiVar.d(), cbiVar.e(), cbiVar.a());
        lcg.c(i > 0);
        int i2 = i + i;
        this.f = i2;
        AudioRecord audioRecordC = c(i2, cbiVar, context);
        this.a = audioRecordC;
        d(audioRecordC);
    }

    public static AudioRecord c(int i, cbi cbiVar, Context context) throws IllegalArgumentException {
        AudioFormat audioFormatJ = j(cbiVar.d(), cbiVar.e(), cbiVar.a());
        AudioRecord.Builder builder = new AudioRecord.Builder();
        if (Build.VERSION.SDK_INT >= 31 && context != null) {
            builder.setContext(context);
        }
        builder.setAudioSource(cbiVar.b());
        builder.setAudioFormat(audioFormatJ);
        builder.setBufferSizeInBytes(i);
        try {
            return builder.build();
        } catch (UnsupportedOperationException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void d(AudioRecord audioRecord) throws cca {
        if (audioRecord.getState() == 1) {
            return;
        }
        audioRecord.release();
        throw new cca("Unable to initialize AudioRecord");
    }

    public static boolean g() {
        return ccu.a(AudioTimestampFramePositionIncorrectQuirk.class) != null;
    }

    public static boolean h(int i, int i2, int i3) {
        if (i <= 0 || i2 <= 0 || i(i, i2, i3) <= 0) {
            return false;
        }
        try {
            j(i, i2, i3);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    private static int i(int i, int i2, int i3) {
        return AudioRecord.getMinBufferSize(i, i2 == 1 ? 16 : 12, i3);
    }

    private static AudioFormat j(int i, int i2, int i3) {
        return new AudioFormat.Builder().setSampleRate(i).setChannelMask(i2 == 1 ? 16 : 12).setEncoding(i3).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    @Override // defpackage.ccc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ccb a(java.nio.ByteBuffer r14) {
        /*
            r13 = this;
            r13.e()
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.d
            boolean r0 = r0.get()
            java.lang.String r1 = "AudioStream has not been started."
            defpackage.lcg.d(r0, r1)
            android.media.AudioRecord r0 = r13.a
            int r1 = r13.f
            int r0 = r0.read(r14, r1)
            r1 = 0
            if (r0 <= 0) goto L90
            r14.limit(r0)
            boolean r14 = r13.j
            r3 = -1
            if (r14 != 0) goto L7b
            android.media.AudioTimestamp r14 = new android.media.AudioTimestamp
            r14.<init>()
            android.media.AudioRecord r5 = r13.a
            r6 = 0
            int r5 = defpackage.aky$$ExternalSyntheticApiModelOutline0.m(r5, r14, r6)
            if (r5 != 0) goto L74
            cbi r5 = r13.b
            int r5 = r5.d()
            long r7 = r13.h
            long r9 = (long) r5
            int r9 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r10 = 1
            if (r9 <= 0) goto L41
            r9 = r10
            goto L42
        L41:
            r9 = r6
        L42:
            java.lang.String r11 = "sampleRate must be greater than 0."
            defpackage.lcg.b(r9, r11)
            int r9 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r9 < 0) goto L4c
            r6 = r10
        L4c:
            java.lang.String r9 = "framePosition must be no less than 0."
            defpackage.lcg.b(r6, r9)
            long r11 = r14.framePosition
            long r7 = r7 - r11
            long r5 = defpackage.ccg.a(r7, r5)
            long r7 = r14.nanoTime
            long r7 = r7 + r5
            int r14 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r14 >= 0) goto L60
            goto L61
        L60:
            r1 = r7
        L61:
            long r5 = java.lang.System.nanoTime()
            long r5 = r1 - r5
            long r5 = java.lang.Math.abs(r5)
            long r7 = defpackage.ccf.m
            int r14 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r14 <= 0) goto L7c
            r13.j = r10
            goto L7b
        L74:
            java.lang.String r14 = "AudioStreamImpl"
            java.lang.String r1 = "Unable to get audio timestamp"
            defpackage.bbs.f(r14, r1)
        L7b:
            r1 = r3
        L7c:
            int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r14 != 0) goto L84
            long r1 = java.lang.System.nanoTime()
        L84:
            long r3 = r13.h
            long r5 = (long) r0
            int r14 = r13.n
            long r5 = defpackage.ccg.b(r5, r14)
            long r3 = r3 + r5
            r13.h = r3
        L90:
            ccj r14 = new ccj
            r14.<init>(r0, r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccf.a(java.nio.ByteBuffer):ccb");
    }

    @Override // defpackage.ccc
    public final void b() {
        throw null;
    }

    public final void e() {
        lcg.d(!this.c.get(), "AudioStream has been released.");
    }

    final void f(final boolean z) {
        Executor executor = this.g;
        final cbw cbwVar = this.k;
        if (executor == null || cbwVar == null) {
            return;
        }
        AtomicReference atomicReference = this.e;
        Boolean boolValueOf = Boolean.valueOf(z);
        if (Objects.equals(atomicReference.getAndSet(boolValueOf), boolValueOf)) {
            return;
        }
        executor.execute(new Runnable() { // from class: ccd
            @Override // java.lang.Runnable
            public final void run() {
                int i = ccf.l;
                cby cbyVar = cbwVar.a;
                cbyVar.m = z;
                if (cbyVar.s == 2) {
                    cbyVar.b();
                }
            }
        });
    }
}
