package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.Window;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import java.io.IOException;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aomv {
    public static final eksp a = eksp.c("Bugle");
    public final ea b;
    public final fcsu c;
    public final PackageManager e;
    public aond f;
    public aomf g;
    private final fcsu i;
    private final fcsu j;
    public boolean h = false;
    public final a d = new a();
    private final aomt k = new aomt(this);

    public aomv(ea eaVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        this.b = eaVar;
        this.i = fcsuVar;
        this.j = fcsuVar2;
        this.c = fcsuVar3;
        this.e = eaVar.A().getPackageManager();
    }

    public final aond a(aomf aomfVar) throws IllegalArgumentException {
        aone aoneVar = (aone) this.j.b();
        Uri uri = Uri.EMPTY;
        aomu aomuVar = new aomu(this);
        Context context = (Context) aoneVar.a.b();
        context.getClass();
        eosc eoscVar = (eosc) aoneVar.b.b();
        eoscVar.getClass();
        aolw aolwVar = (aolw) aoneVar.c.b();
        aolwVar.getClass();
        eigp eigpVar = (eigp) aoneVar.d.b();
        eigpVar.getClass();
        fcsu fcsuVar = aoneVar.e;
        uri.getClass();
        final aond aondVar = new aond(context, eoscVar, aolwVar, eigpVar, fcsuVar, uri, aomuVar);
        this.f = aondVar;
        this.g = aomfVar;
        aomfVar.addOnAttachStateChangeListener(this.k);
        egpr egprVar = (egpr) this.i.b();
        if (aondVar.g != null) {
            throw new IllegalStateException("Playback session has already been prepared.");
        }
        MediaPlayer mediaPlayerA = cqwh.a();
        aondVar.g = mediaPlayerA;
        mediaPlayerA.setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build());
        final eigp eigpVar2 = aondVar.d;
        final MediaPlayer.OnPreparedListener onPreparedListener = new MediaPlayer.OnPreparedListener() { // from class: aomy
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) throws IllegalStateException {
                aond aondVar2 = aondVar;
                aondVar2.h = true;
                if (!aondVar2.equals(aondVar2.k.a.f)) {
                    aondVar2.d();
                }
                if (!aondVar2.j.isZero()) {
                    aondVar2.e(aondVar2.j);
                }
                if (aondVar2.i) {
                    aondVar2.f();
                }
            }
        };
        mediaPlayerA.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: eigg
            public final /* synthetic */ String b = "com/google/android/apps/messaging/shared/audio/attachment/controller/AudioAttachmentPlaybackSession";
            public final /* synthetic */ String c = "prepare";
            public final /* synthetic */ String d = "AudioAttachmentPlaybackSession#onPreparedListener";

            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                eigp eigpVar3 = eigpVar2;
                String str = this.d;
                String str2 = this.b;
                String str3 = this.c;
                MediaPlayer.OnPreparedListener onPreparedListener2 = onPreparedListener;
                eieh eiehVarC = eigpVar3.c(str, str2, str3, 99);
                try {
                    onPreparedListener2.onPrepared(mediaPlayer);
                    eiehVarC.close();
                } catch (Throwable th) {
                    try {
                        eiehVarC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        final MediaPlayer.OnErrorListener onErrorListener = new MediaPlayer.OnErrorListener() { // from class: aomz
            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                aond aondVar2 = aondVar;
                aomv aomvVar = aondVar2.k.a;
                aomf aomfVar2 = aomvVar.g;
                if (aomfVar2 != null) {
                    aomvVar.c(aomfVar2, new aomi(i, i2));
                }
                if (aondVar2.equals(aomvVar.f)) {
                    aomvVar.e();
                } else {
                    aondVar2.d();
                }
                ((eksl) ((eksl) aomv.a.j()).h("com/google/android/apps/messaging/shared/audio/attachment/controller/AudioAttachmentController$AudioControllerSessionStateChangeListener", "onError", 346, "AudioAttachmentController.java")).u("Audio playback error occurred. what=%d, extra=%d", i, i2);
                aondVar2.c.a();
                return true;
            }
        };
        mediaPlayerA.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: eifz
            public final /* synthetic */ String b = "com/google/android/apps/messaging/shared/audio/attachment/controller/AudioAttachmentPlaybackSession";
            public final /* synthetic */ String c = "prepare";
            public final /* synthetic */ String d = "AudioAttachmentPlaybackSession#onErrorListener";

            @Override // android.media.MediaPlayer.OnErrorListener
            public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                eigp eigpVar3 = eigpVar2;
                String str = this.d;
                String str2 = this.b;
                String str3 = this.c;
                MediaPlayer.OnErrorListener onErrorListener2 = onErrorListener;
                eieh eiehVarC = eigpVar3.c(str, str2, str3, 114);
                try {
                    boolean zOnError = onErrorListener2.onError(mediaPlayer, i, i2);
                    eiehVarC.close();
                    return zOnError;
                } catch (Throwable th) {
                    try {
                        eiehVarC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        final MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() { // from class: aona
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                aond aondVar2 = aondVar;
                aomv aomvVar = aondVar2.k.a;
                if (aondVar2.equals(aomvVar.f)) {
                    aomvVar.e();
                }
                aondVar2.c.a();
            }
        };
        mediaPlayerA.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: eiga
            public final /* synthetic */ String b = "com/google/android/apps/messaging/shared/audio/attachment/controller/AudioAttachmentPlaybackSession";
            public final /* synthetic */ String c = "prepare";
            public final /* synthetic */ String d = "AudioAttachmentPlaybackSession#onCompletionListener";

            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                eigp eigpVar3 = eigpVar2;
                String str = this.d;
                String str2 = this.b;
                String str3 = this.c;
                MediaPlayer.OnCompletionListener onCompletionListener2 = onCompletionListener;
                eieh eiehVarC = eigpVar3.c(str, str2, str3, 122);
                try {
                    onCompletionListener2.onCompletion(mediaPlayer);
                    eiehVarC.close();
                } catch (Throwable th) {
                    try {
                        eiehVarC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        final MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = new MediaPlayer.OnSeekCompleteListener() { // from class: aonb
            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer) {
                aond aondVar2 = aondVar;
                aomv aomvVar = aondVar2.k.a;
                if (!aondVar2.equals(aomvVar.f) || aomvVar.g == null) {
                    return;
                }
                ((aiqb) aomvVar.c.b()).d(aomvVar.g(), aondVar2.b().toSeconds());
                aomvVar.f(new aomo(true != aondVar2.g() ? 2 : 1, aondVar2.b(), aondVar2.a()));
            }
        };
        mediaPlayerA.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener() { // from class: eifx
            public final /* synthetic */ String b = "com/google/android/apps/messaging/shared/audio/attachment/controller/AudioAttachmentPlaybackSession";
            public final /* synthetic */ String c = "prepare";
            public final /* synthetic */ String d = "AudioAttachmentPlaybackSession#onSeekCompleteListener";

            @Override // android.media.MediaPlayer.OnSeekCompleteListener
            public final void onSeekComplete(MediaPlayer mediaPlayer) {
                eigp eigpVar3 = eigpVar2;
                String str = this.d;
                String str2 = this.b;
                String str3 = this.c;
                MediaPlayer.OnSeekCompleteListener onSeekCompleteListener2 = onSeekCompleteListener;
                eieh eiehVarC = eigpVar3.c(str, str2, str3, 129);
                try {
                    onSeekCompleteListener2.onSeekComplete(mediaPlayer);
                    eiehVarC.close();
                } catch (Throwable th) {
                    try {
                        eiehVarC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        });
        egprVar.h(egpq.b(eijx.e(aondVar.e).i(new eooz() { // from class: aonc
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final Uri uri2 = (Uri) obj;
                final aond aondVar2 = aondVar;
                return eijx.g(new Callable() { // from class: aomx
                    @Override // java.util.concurrent.Callable
                    public final Object call() throws IllegalStateException, IOException, SecurityException, IllegalArgumentException {
                        aond aondVar3 = aondVar2;
                        MediaPlayer mediaPlayer = aondVar3.g;
                        if (mediaPlayer == null) {
                            return null;
                        }
                        mediaPlayer.setDataSource(aondVar3.a, uri2);
                        aondVar3.g.prepare();
                        return null;
                    }
                }, aondVar2.b);
            }
        }, aondVar.b)), new egpo(Uri.EMPTY), this.d);
        return aondVar;
    }

    public final void b() {
        Window window;
        eg egVarG = this.b.G();
        if (egVarG == null || (window = egVarG.getWindow()) == null) {
            return;
        }
        window.clearFlags(128);
    }

    public final void c(aomf aomfVar, aomk aomkVar) {
        if (this.e.hasSystemFeature("android.hardware.type.watch")) {
            aome.a(aomfVar);
        } else {
            aomfVar.c();
        }
    }

    public final void d() {
        eind eindVar = new eind() { // from class: aomp
            @Override // defpackage.eind
            public final eine a(einb einbVar) throws IllegalStateException, IllegalArgumentException {
                aomv aomvVar = this.a;
                PackageManager packageManager = aomvVar.e;
                aomg aomgVar = (aomg) einbVar;
                if (!packageManager.hasSystemFeature("android.hardware.audio.output")) {
                    if (packageManager.hasSystemFeature("android.hardware.type.watch")) {
                        eksl ekslVar = (eksl) aomv.a.h();
                        ekslVar.X(cqnc.S, "AudioAttachmentController");
                        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/audio/attachment/controller/AudioAttachmentController", "onPlayPauseClickEvent", 139, "AudioAttachmentController.java")).q("Watch does not have built in speaker.");
                        aome.a(aomgVar.a);
                        return eine.a;
                    }
                    eksl ekslVar2 = (eksl) aomv.a.h();
                    ekslVar2.X(cqnc.S, "AudioAttachmentController");
                    ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/audio/attachment/controller/AudioAttachmentController", "onPlayPauseClickEvent", 148, "AudioAttachmentController.java")).q("Phone does not have built in speaker.");
                }
                aomf aomfVar = aomgVar.a;
                if (!aomfVar.equals(aomvVar.g)) {
                    aomvVar.e();
                }
                aond aondVarA = aomvVar.f;
                if (aondVarA == null) {
                    aondVarA = aomvVar.a(aomfVar);
                }
                if (aondVarA.g()) {
                    aondVarA.c();
                } else {
                    aondVarA.f();
                }
                return eine.a;
            }
        };
        ea eaVar = this.b;
        einf.c(eaVar, aomg.class, eindVar);
        einf.c(eaVar, aoml.class, new eind() { // from class: aomq
            @Override // defpackage.eind
            public final eine a(einb einbVar) throws IllegalStateException {
                aond aondVar;
                aomf aomfVar = ((aoml) einbVar).a;
                aomv aomvVar = this.a;
                if (aomfVar.equals(aomvVar.g) && (aondVar = aomvVar.f) != null && aondVar.g()) {
                    aomvVar.h = true;
                    aomvVar.f.c();
                }
                return eine.a;
            }
        });
        einf.c(eaVar, aomm.class, new eind() { // from class: aomr
            @Override // defpackage.eind
            public final eine a(einb einbVar) throws IllegalStateException, IllegalArgumentException {
                aomf aomfVar;
                aomm aommVar = (aomm) einbVar;
                aomv aomvVar = this.a;
                if (aomvVar.b.aI() && ((aomfVar = aomvVar.g) == null || aommVar.b.equals(aomfVar))) {
                    aond aondVarA = aomvVar.f;
                    if (aondVarA == null) {
                        aondVarA = aomvVar.a(aommVar.b);
                    }
                    aondVarA.e(aommVar.a);
                    if (aomvVar.h) {
                        aondVarA.f();
                        aomvVar.h = false;
                    }
                }
                return eine.a;
            }
        });
        eaVar.P().c(new aoms(this));
    }

    public final void e() {
        aond aondVar = this.f;
        if (aondVar != null) {
            aomo aomoVar = new aomo(3, aondVar.b(), Duration.ZERO);
            aondVar.d();
            this.f = null;
            f(aomoVar);
        }
        aomf aomfVar = this.g;
        if (aomfVar != null) {
            aomfVar.removeOnAttachStateChangeListener(this.k);
            this.g = null;
        }
        b();
    }

    public final void f(aomn aomnVar) {
        aomf aomfVar = this.g;
        if (aomfVar == null || !aomfVar.isAttachedToWindow()) {
            return;
        }
        aomf aomfVar2 = this.g;
        aomo aomoVar = (aomo) aomnVar;
        int i = aomoVar.c - 1;
        if (i == 0) {
            AudioAttachmentView audioAttachmentView = (AudioAttachmentView) aomfVar2;
            audioAttachmentView.a.setDisplayedChild(1);
            audioAttachmentView.b(true, aomoVar.b);
            audioAttachmentView.d(aomoVar.a);
            return;
        }
        if (i == 1) {
            AudioAttachmentView audioAttachmentView2 = (AudioAttachmentView) aomfVar2;
            audioAttachmentView2.a.setDisplayedChild(0);
            audioAttachmentView2.b(false, aomoVar.b);
            audioAttachmentView2.d(aomoVar.a);
            return;
        }
        AudioAttachmentView audioAttachmentView3 = (AudioAttachmentView) aomfVar2;
        audioAttachmentView3.a.setDisplayedChild(0);
        Duration duration = aomoVar.a;
        audioAttachmentView3.b(false, duration);
        audioAttachmentView3.d(duration);
    }

    public final int g() {
        aomf aomfVar = this.g;
        return (aomfVar == null || ((AudioAttachmentView) aomfVar).d == null) ? 1 : 4;
    }

    /* compiled from: PG */
    final class a implements egps<Uri, Void> {
        public a() {
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
        }

        @Override // defpackage.egps
        public final /* bridge */ /* synthetic */ void f(Object obj, Throwable th) {
            Uri uri = (Uri) obj;
            aomv aomvVar = aomv.this;
            aomf aomfVar = aomvVar.g;
            if (aomfVar != null) {
                aomvVar.c(aomfVar, new aomj(th));
            }
            if (uri != null) {
                aond aondVar = aomvVar.f;
                if (uri.equals(aondVar != null ? aondVar.e : null)) {
                    aomvVar.e();
                }
            }
            ((eksl) ((eksl) ((eksl) aomv.a.j()).g(th)).h("com/google/android/apps/messaging/shared/audio/attachment/controller/AudioAttachmentController$SessionPreparedCallback", "onFailure", (char) 450, "AudioAttachmentController.java")).q("Failed to prepare audio playback session.");
        }

        @Override // defpackage.egps
        public final /* synthetic */ void b(Object obj) {
        }
    }
}
