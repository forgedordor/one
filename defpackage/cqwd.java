package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.MediaPlayer;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqwd implements Closeable {
    public static final eksp a = eksp.c("BugleAudio");
    public final cqun b;
    public final Executor c;
    public final AudioManager d;
    public MediaPlayer e;
    public AudioFocusRequest f;
    public int g = 2;
    public cqvm h;
    private final Context i;

    public cqwd(Context context, eosc eoscVar, AudioManager audioManager, MediaPlayer mediaPlayer, cqun cqunVar) {
        this.i = context;
        this.b = cqunVar;
        this.e = mediaPlayer;
        this.c = new eoss(eoscVar);
        this.d = audioManager;
    }

    private final void e(cqum cqumVar) throws IllegalStateException, Resources.NotFoundException, IOException, SecurityException, IllegalArgumentException {
        MediaPlayer mediaPlayer = this.e;
        mediaPlayer.getClass();
        int iE = cqumVar.e() - 1;
        if (iE == 0) {
            mediaPlayer.setDataSource(this.i, cqumVar.a());
            return;
        }
        if (iE == 1) {
            mediaPlayer.setDataSource(cqumVar.d());
            return;
        }
        AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.i.getResources().openRawResourceFd(cqumVar.c().intValue());
        try {
            mediaPlayer.setDataSource(assetFileDescriptorOpenRawResourceFd);
            if (assetFileDescriptorOpenRawResourceFd != null) {
                assetFileDescriptorOpenRawResourceFd.close();
            }
        } catch (Throwable th) {
            if (assetFileDescriptorOpenRawResourceFd != null) {
                try {
                    assetFileDescriptorOpenRawResourceFd.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    final eiju a(final String str) {
        return eijx.g(new Callable() { // from class: cqvy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                cqwd cqwdVar = this.a;
                String str2 = str;
                try {
                    MediaPlayer mediaPlayer = cqwdVar.e;
                    if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
                        cqwdVar.b();
                        cqvm cqvmVar = cqwdVar.h;
                        if (cqvmVar != null) {
                            cqvmVar.a();
                            cqwdVar.h = null;
                        }
                        return false;
                    }
                    cqwdVar.e.stop();
                    ((eksl) cqwd.a.n().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "stop", 87, "PlaybackSession.java")).t("Stopping due to: %s", str2);
                    cqwdVar.b();
                    cqvm cqvmVar2 = cqwdVar.h;
                    if (cqvmVar2 != null) {
                        cqvmVar2.a();
                        cqwdVar.h = null;
                    }
                    return true;
                } catch (Throwable th) {
                    cqwdVar.b();
                    cqvm cqvmVar3 = cqwdVar.h;
                    if (cqvmVar3 != null) {
                        cqvmVar3.a();
                        cqwdVar.h = null;
                    }
                    throw th;
                }
            }
        }, this.c);
    }

    public final void b() {
        MediaPlayer mediaPlayer = this.e;
        if (mediaPlayer != null) {
            cqwh.b(mediaPlayer);
            this.e = null;
            cqun cqunVar = this.b;
            ((cquv) cqunVar).f.ifPresent(new Consumer() { // from class: cqvn
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    cqwd cqwdVar = this.a;
                    AudioFocusRequest audioFocusRequest = cqwdVar.f;
                    if (audioFocusRequest != null) {
                        cqwdVar.d.abandonAudioFocusRequest(audioFocusRequest);
                        cqwdVar.f = null;
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
        this.g = 1;
    }

    public final void c() throws IllegalStateException, Resources.NotFoundException, IOException, SecurityException, IllegalArgumentException {
        try {
            e(((cquv) this.b).a);
        } catch (Resources.NotFoundException | IOException | IllegalArgumentException e) {
            cquv cquvVar = (cquv) this.b;
            Optional optional = cquvVar.b;
            if (!optional.isPresent()) {
                throw e;
            }
            ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "setDataSource", 264, "PlaybackSession.java")).t("Failed to use data source: %s", cquvVar.a);
            e((cqum) optional.get());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        auvh.h(a("Future cancellation"));
    }

    final eiju d(final cvjt cvjtVar) {
        return eijx.h(new eooy() { // from class: cqvp
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                final cqwd cqwdVar = this.a;
                if (cqwdVar.g == 1) {
                    return eijx.e(cqup.c(3));
                }
                final cvjt cvjtVar2 = cvjtVar;
                final MediaPlayer mediaPlayer = cqwdVar.e;
                mediaPlayer.getClass();
                return kol.a(new koi() { // from class: cqvw
                    @Override // defpackage.koi
                    public final Object a(final kog kogVar) throws IllegalStateException, cqve, IOException {
                        kogVar.a(new Runnable() { // from class: cqvz
                            @Override // java.lang.Runnable
                            public final void run() {
                                ((eksl) cqwd.a.o().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "preparePlayer", 116, "PlaybackSession.java")).q("Future cancelled before playback started");
                            }
                        }, eoqg.a);
                        cqvm cqvmVar = new cqvm(kogVar);
                        final cqwd cqwdVar2 = cqwdVar;
                        cqwdVar2.h = cqvmVar;
                        MediaPlayer.OnPreparedListener onPreparedListener = new MediaPlayer.OnPreparedListener() { // from class: cqvt
                            @Override // android.media.MediaPlayer.OnPreparedListener
                            public final void onPrepared(MediaPlayer mediaPlayer2) {
                                ((eksl) cqwd.a.o().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "getPreparedListener", 212, "PlaybackSession.java")).q("Media player is prepared");
                                final kog kogVar2 = kogVar;
                                auvh.h(eijx.f(new Runnable() { // from class: cqwb
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        eksp ekspVar = cqwd.a;
                                        if (kogVar2.b(cqup.c(1))) {
                                            return;
                                        }
                                        ((eksl) cqwd.a.o().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "getPreparedListener", 218, "PlaybackSession.java")).q("Media player prepared before being released");
                                    }
                                }, cqwdVar2.c));
                            }
                        };
                        MediaPlayer mediaPlayer2 = mediaPlayer;
                        mediaPlayer2.setOnPreparedListener(onPreparedListener);
                        mediaPlayer2.setOnErrorListener(new cqvs(cqwdVar2, cvjtVar2, kogVar));
                        try {
                            cqwdVar2.c();
                            final MediaPlayer mediaPlayer3 = cqwdVar2.e;
                            mediaPlayer3.getClass();
                            cqun cqunVar = cqwdVar2.b;
                            ((cquv) cqunVar).e.ifPresent(new Consumer() { // from class: cqwc
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) throws IllegalArgumentException {
                                    mediaPlayer3.setAudioAttributes((AudioAttributes) obj);
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            ((cquv) cqunVar).d.ifPresent(new Consumer() { // from class: cqvj
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    mediaPlayer3.setLooping(((Boolean) obj).booleanValue());
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            ((cquv) cqunVar).c.ifPresent(new Consumer() { // from class: cqvk
                                @Override // java.util.function.Consumer
                                /* renamed from: accept */
                                public final void z(Object obj) {
                                    Float f = (Float) obj;
                                    eksp ekspVar = cqwd.a;
                                    mediaPlayer3.setVolume(f.floatValue(), f.floatValue());
                                }

                                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                    return Consumer$CC.$default$andThen(this, consumer);
                                }
                            });
                            mediaPlayer2.prepare();
                            return "MediaPlayer.OnPreparedListener";
                        } catch (Exception e) {
                            cqwdVar2.b();
                            throw new cqve(e);
                        }
                    }
                });
            }
        }, this.c).i(new eooz() { // from class: cqvi
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                cqup cqupVar = (cqup) obj;
                if (cqupVar.b() != 1) {
                    return eijx.e(cqupVar);
                }
                final cvjt cvjtVar2 = cvjtVar;
                final cqwd cqwdVar = this.a;
                return eijx.h(new eooy() { // from class: cqvu
                    @Override // defpackage.eooy
                    public final ListenableFuture a() throws IllegalStateException, cqve {
                        final cqwd cqwdVar2 = cqwdVar;
                        if (cqwdVar2.g == 1) {
                            return eijx.e(cqup.c(3));
                        }
                        final cvjt cvjtVar3 = cvjtVar2;
                        final MediaPlayer mediaPlayer = cqwdVar2.e;
                        mediaPlayer.getClass();
                        ListenableFuture listenableFutureA = kol.a(new koi() { // from class: cqvo
                            @Override // defpackage.koi
                            public final Object a(final kog kogVar) {
                                kogVar.a(new Runnable() { // from class: cqvv
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ((eksl) cqwd.a.o().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "startPlayback", 154, "PlaybackSession.java")).q("Future cancelled after playback started");
                                    }
                                }, eoqg.a);
                                cqvm cqvmVar = new cqvm(kogVar);
                                final cqwd cqwdVar3 = cqwdVar2;
                                cqwdVar3.h = cqvmVar;
                                final cvjt cvjtVar4 = cvjtVar3;
                                MediaPlayer.OnCompletionListener onCompletionListener = new MediaPlayer.OnCompletionListener() { // from class: cqvl
                                    @Override // android.media.MediaPlayer.OnCompletionListener
                                    public final void onCompletion(MediaPlayer mediaPlayer2) {
                                        ((eksl) cqwd.a.o().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "getCompletionListener", 191, "PlaybackSession.java")).q("Media playback completed");
                                        cvjt cvjtVar5 = cvjtVar4;
                                        if (cvjtVar5 != null) {
                                            cvjtVar5.a();
                                        }
                                        final kog kogVar2 = kogVar;
                                        final cqwd cqwdVar4 = cqwdVar3;
                                        auvh.h(eijx.f(new Runnable() { // from class: cqvr
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                cqwdVar4.b();
                                                if (kogVar2.b(cqup.c(1))) {
                                                    return;
                                                }
                                                ((eksl) cqwd.a.n().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "getCompletionListener", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "PlaybackSession.java")).q("Media player finished playback before being released");
                                            }
                                        }, cqwdVar4.c));
                                    }
                                };
                                MediaPlayer mediaPlayer2 = mediaPlayer;
                                mediaPlayer2.setOnCompletionListener(onCompletionListener);
                                mediaPlayer2.setOnErrorListener(new cqvs(cqwdVar3, cvjtVar4, kogVar));
                                return "MediaPlayer.On(Completion|Error)Listener";
                            }
                        });
                        cqun cqunVar = cqwdVar2.b;
                        ((cquv) cqunVar).f.ifPresent(new Consumer() { // from class: cqwa
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj2) {
                                ((cquj) obj2).a();
                                final AudioFocusRequest.Builder builder = new AudioFocusRequest.Builder(3);
                                Consumer consumer = new Consumer() { // from class: cqvx
                                    @Override // java.util.function.Consumer
                                    /* renamed from: accept */
                                    public final void z(Object obj3) {
                                        builder.setAudioAttributes((AudioAttributes) obj3);
                                    }

                                    public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                                        return Consumer$CC.$default$andThen(this, consumer2);
                                    }
                                };
                                cqwd cqwdVar3 = cqwdVar2;
                                ((cquv) cqwdVar3.b).e.ifPresent(consumer);
                                cqwdVar3.f = builder.build();
                                cqwdVar3.d.requestAudioFocus(cqwdVar3.f);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                        try {
                            mediaPlayer.start();
                            cqwdVar2.g = 3;
                            return listenableFutureA;
                        } catch (IllegalStateException e) {
                            cqwdVar2.b();
                            throw new cqve(e);
                        }
                    }
                }, cqwdVar.c);
            }
        }, eoqg.a);
    }
}
