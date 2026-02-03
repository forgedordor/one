package defpackage;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import j$.time.Duration;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yqa implements yov {
    public final Context a;
    public final Uri b;
    public MediaPlayer d;
    public long h;
    public boolean k;
    public Long l;
    private final AudioManager m;
    private final fdjx n;
    private final fdjx o;
    private final eigp p;
    private final Duration q;
    private AudioFocusRequest r;
    private fdlr u;
    private fdlr v;
    private final int w;
    private final aiqb x;
    public final ekrg c = ekrg.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/BugleAudioPlayer");
    private final AudioAttributes s = new AudioAttributes.Builder().setContentType(2).setUsage(1).build();
    private final fdap t = new fdap() { // from class: yps
        @Override // defpackage.fdap
        public final Object invoke(Object obj) throws IllegalStateException, IOException, IllegalArgumentException {
            int iIntValue = ((Integer) obj).intValue();
            yqa yqaVar = this.a;
            if (iIntValue == -2 || iIntValue == -1) {
                yqaVar.g();
            } else if (iIntValue == 1) {
                yqaVar.h();
            }
            return fctx.a;
        }
    };
    public final fduf e = fdvf.a(false);
    public final fduf f = fdvf.a(false);
    public final fduf g = fdvf.a(false);
    public final fduf i = fdvf.a(null);
    public final fduf j = fdvf.a(null);

    public yqa(AudioManager audioManager, Context context, fdjx fdjxVar, fdjx fdjxVar2, aiqb aiqbVar, eigp eigpVar, Uri uri, Duration duration, int i) {
        this.m = audioManager;
        this.a = context;
        this.n = fdjxVar;
        this.o = fdjxVar2;
        this.x = aiqbVar;
        this.p = eigpVar;
        this.b = uri;
        this.q = duration;
        this.w = i;
        this.h = duration.toMillis();
    }

    private final void n(final boolean z) throws IllegalArgumentException {
        this.e.f(true);
        MediaPlayer mediaPlayerA = cqwh.a();
        mediaPlayerA.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: ypo
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) throws IllegalStateException {
                yqa yqaVar = this.a;
                yqaVar.i.f(0L);
                mediaPlayer.seekTo(0);
                yqaVar.g.f(false);
                yqaVar.m();
            }
        });
        mediaPlayerA.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: ypp
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException, IOException, IllegalArgumentException {
                long duration = mediaPlayer.getDuration();
                yqa yqaVar = this.a;
                yqaVar.h = duration;
                yqaVar.k = true;
                yqaVar.e.f(false);
                Long l = yqaVar.l;
                if (l != null) {
                    mediaPlayer.seekTo((int) l.longValue());
                }
                yqaVar.l = null;
                fduf fdufVar = yqaVar.j;
                Float f = (Float) fdufVar.c();
                if (f != null) {
                    long jFloatValue = (long) (f.floatValue() * yqaVar.h);
                    yqaVar.i.f(Long.valueOf(jFloatValue));
                    mediaPlayer.seekTo((int) jFloatValue);
                }
                boolean z2 = z;
                fdufVar.f(null);
                if (z2) {
                    yqaVar.h();
                }
            }
        });
        mediaPlayerA.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: ypq
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                mediaPlayer.getClass();
                yqa yqaVar = this.a;
                ((ekrd) yqaVar.c.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/BugleAudioPlayer", "prepare$lambda$8$lambda$6", 164, "BugleAudioPlayer.kt")).u("Failed to prepare audio file, %d, %d", i, i2);
                yqaVar.f.f(true);
                yqaVar.e.f(false);
                return true;
            }
        });
        mediaPlayerA.setAudioAttributes(this.s);
        fdlr fdlrVar = this.v;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        fdjx fdjxVar = this.o;
        fcyi fcyiVar = fcyi.a;
        this.v = fdin.b(fdjxVar, eicg.a(fcyiVar), fdjz.a, new ypt(null, this));
        this.d = mediaPlayerA;
    }

    private final void o() {
        fdlr fdlrVar = this.u;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        this.u = null;
    }

    @Override // defpackage.yov
    public final long a() {
        return this.h;
    }

    @Override // defpackage.yov
    public final /* synthetic */ fdpl b() {
        return this.i;
    }

    @Override // defpackage.yov
    public final /* synthetic */ fdpl c() {
        return this.f;
    }

    @Override // defpackage.yov
    public final /* synthetic */ fdpl d() {
        return this.j;
    }

    @Override // defpackage.yov
    public final /* synthetic */ fdpl e() {
        return this.e;
    }

    @Override // defpackage.yov
    public final /* synthetic */ fdpl f() {
        return this.g;
    }

    @Override // defpackage.yov
    public final void g() throws IllegalStateException {
        if (this.k) {
            fduf fdufVar = this.g;
            if (((Boolean) fdufVar.c()).booleanValue() && this.d != null) {
                this.x.b(this.w, this.q.getSeconds());
                MediaPlayer mediaPlayer = this.d;
                mediaPlayer.getClass();
                mediaPlayer.pause();
                m();
                fdufVar.f(false);
                o();
                return;
            }
        }
        ((ekrd) this.c.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/BugleAudioPlayer", "pause", 199, "BugleAudioPlayer.kt")).t("Failed to pause audio file, %b", Boolean.valueOf(this.k));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008f A[Catch: all -> 0x00ac, TRY_LEAVE, TryCatch #0 {all -> 0x00ac, blocks: (B:7:0x0013, B:13:0x0044, B:15:0x0052, B:17:0x0056, B:19:0x0076, B:20:0x0079, B:21:0x008f), top: B:29:0x0013 }] */
    @Override // defpackage.yov
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() throws java.io.IOException, java.lang.IllegalArgumentException {
        /*
            r8 = this;
            java.lang.String r0 = "BugleAudioPlayer.kt"
            boolean r1 = r8.k
            r2 = 1
            if (r1 != 0) goto Lb
            r8.n(r2)
            return
        Lb:
            eigp r1 = r8.p
            java.lang.String r3 = "BugleAudioPlayer#play"
            eieh r1 = r1.a(r3)
            android.media.AudioFocusRequest$Builder r3 = new android.media.AudioFocusRequest$Builder     // Catch: java.lang.Throwable -> Lac
            r3.<init>(r2)     // Catch: java.lang.Throwable -> Lac
            android.media.AudioAttributes r4 = r8.s     // Catch: java.lang.Throwable -> Lac
            android.media.AudioFocusRequest$Builder r3 = defpackage.akc$$ExternalSyntheticApiModelOutline0.m(r3, r4)     // Catch: java.lang.Throwable -> Lac
            android.media.AudioFocusRequest$Builder r3 = defpackage.nh$$ExternalSyntheticApiModelOutline0.m$1(r3, r2)     // Catch: java.lang.Throwable -> Lac
            fdap r4 = r8.t     // Catch: java.lang.Throwable -> Lac
            ypr r5 = new ypr     // Catch: java.lang.Throwable -> Lac
            r5.<init>()     // Catch: java.lang.Throwable -> Lac
            android.media.AudioFocusRequest$Builder r3 = defpackage.akc$$ExternalSyntheticApiModelOutline0.m(r3, r5)     // Catch: java.lang.Throwable -> Lac
            android.media.AudioFocusRequest r3 = defpackage.akc$$ExternalSyntheticApiModelOutline0.m(r3)     // Catch: java.lang.Throwable -> Lac
            r8.r = r3     // Catch: java.lang.Throwable -> Lac
            android.media.AudioManager r4 = r8.m     // Catch: java.lang.Throwable -> Lac
            r3.getClass()     // Catch: java.lang.Throwable -> Lac
            int r3 = defpackage.akc$$ExternalSyntheticApiModelOutline0.m$1(r4, r3)     // Catch: java.lang.Throwable -> Lac
            if (r3 != r2) goto L40
            r3 = r2
            goto L41
        L40:
            r3 = 0
        L41:
            r4 = 0
            if (r3 == 0) goto L8f
            fduf r5 = r8.g     // Catch: java.lang.Throwable -> Lac
            java.lang.Object r6 = r5.c()     // Catch: java.lang.Throwable -> Lac
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> Lac
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> Lac
            if (r6 != 0) goto L8f
            android.media.MediaPlayer r6 = r8.d     // Catch: java.lang.Throwable -> Lac
            if (r6 == 0) goto L8f
            aiqb r0 = r8.x     // Catch: java.lang.Throwable -> Lac
            int r3 = r8.w     // Catch: java.lang.Throwable -> Lac
            j$.time.Duration r6 = r8.q     // Catch: java.lang.Throwable -> Lac
            long r6 = r6.getSeconds()     // Catch: java.lang.Throwable -> Lac
            r0.c(r3, r6)     // Catch: java.lang.Throwable -> Lac
            android.media.MediaPlayer r0 = r8.d     // Catch: java.lang.Throwable -> Lac
            r0.getClass()     // Catch: java.lang.Throwable -> Lac
            r0.start()     // Catch: java.lang.Throwable -> Lac
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> Lac
            r5.f(r0)     // Catch: java.lang.Throwable -> Lac
            fdlr r0 = r8.u     // Catch: java.lang.Throwable -> Lac
            if (r0 == 0) goto L79
            defpackage.fdlp.a(r0)     // Catch: java.lang.Throwable -> Lac
        L79:
            fdjx r0 = r8.n     // Catch: java.lang.Throwable -> Lac
            fcyi r2 = defpackage.fcyi.a     // Catch: java.lang.Throwable -> Lac
            fdjz r3 = defpackage.fdjz.a     // Catch: java.lang.Throwable -> Lac
            fcyh r2 = defpackage.eicg.a(r2)     // Catch: java.lang.Throwable -> Lac
            ypy r5 = new ypy     // Catch: java.lang.Throwable -> Lac
            r5.<init>(r4, r8)     // Catch: java.lang.Throwable -> Lac
            fdkf r0 = defpackage.fdin.b(r0, r2, r3, r5)     // Catch: java.lang.Throwable -> Lac
            r8.u = r0     // Catch: java.lang.Throwable -> Lac
            goto La8
        L8f:
            ekrg r2 = r8.c     // Catch: java.lang.Throwable -> Lac
            ekrw r2 = r2.h()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r5 = "com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/BugleAudioPlayer"
            java.lang.String r6 = "play"
            r7 = 125(0x7d, float:1.75E-43)
            ekrw r0 = r2.h(r5, r6, r7, r0)     // Catch: java.lang.Throwable -> Lac
            ekrd r0 = (defpackage.ekrd) r0     // Catch: java.lang.Throwable -> Lac
            java.lang.String r2 = "Failed to play audio file, %b, %b"
            boolean r5 = r8.k     // Catch: java.lang.Throwable -> Lac
            r0.H(r2, r3, r5)     // Catch: java.lang.Throwable -> Lac
        La8:
            defpackage.fczl.a(r1, r4)
            return
        Lac:
            r0 = move-exception
            throw r0     // Catch: java.lang.Throwable -> Lae
        Lae:
            r2 = move-exception
            defpackage.fczl.a(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yqa.h():void");
    }

    @Override // defpackage.yov
    public final void i() {
        o();
        fdlr fdlrVar = this.v;
        if (fdlrVar != null) {
            fdlrVar.t(null);
        }
        this.v = null;
        MediaPlayer mediaPlayer = this.d;
        if (mediaPlayer != null) {
            cqwh.b(mediaPlayer);
        }
        this.l = (Long) this.i.c();
        this.k = false;
        this.e.f(false);
        this.g.f(false);
        this.d = null;
    }

    @Override // defpackage.yov
    public final void j() {
        auvw.k(this.n, null, null, new ypx(this, null), 3);
    }

    @Override // defpackage.yov
    public final void k() {
        o();
        MediaPlayer mediaPlayer = this.d;
        if (mediaPlayer != null) {
            mediaPlayer.reset();
        }
        this.k = false;
        this.e.f(false);
        this.g.f(false);
    }

    @Override // defpackage.yov
    public final void l(float f) throws IllegalStateException, IllegalArgumentException {
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("Progress must be value [0-1]");
        }
        ekrg ekrgVar = this.c;
        ekrd ekrdVar = (ekrd) ekrgVar.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/BugleAudioPlayer", "seek", 214, "BugleAudioPlayer.kt");
        Float fValueOf = Float.valueOf(f);
        ekrdVar.t("Seeking to position: %s", fValueOf);
        this.x.d(this.w, this.q.getSeconds());
        if (!this.k || this.d == null) {
            ((ekrd) ekrgVar.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/audio/BugleAudioPlayer", "seek", 221, "BugleAudioPlayer.kt")).q("AudioPlayer not prepared. Preparing and then seeking to position.");
            this.j.f(fValueOf);
            n(false);
        } else {
            float f2 = this.h * f;
            this.i.f(Long.valueOf((long) f2));
            MediaPlayer mediaPlayer = this.d;
            mediaPlayer.getClass();
            mediaPlayer.seekTo((int) f2);
        }
    }

    public final void m() {
        AudioFocusRequest audioFocusRequest = this.r;
        if (audioFocusRequest != null) {
            this.m.abandonAudioFocusRequest(audioFocusRequest);
        }
    }
}
