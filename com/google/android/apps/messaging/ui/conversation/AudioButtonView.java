package com.google.android.apps.messaging.ui.conversation;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.media.MediaRecorder;
import android.net.Uri;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.conversation.AudioButtonView;
import defpackage.a;
import defpackage.aipw;
import defpackage.airc;
import defpackage.airh;
import defpackage.aomc;
import defpackage.aonl;
import defpackage.apsl;
import defpackage.aqbx;
import defpackage.auvh;
import defpackage.auwa;
import defpackage.babw;
import defpackage.bacm;
import defpackage.bagr;
import defpackage.bahv;
import defpackage.bahx;
import defpackage.bahy;
import defpackage.baii;
import defpackage.bxfu;
import defpackage.ccze;
import defpackage.cmtv;
import defpackage.cmum;
import defpackage.cogw;
import defpackage.cpga;
import defpackage.cqaz;
import defpackage.cqbd;
import defpackage.cqca;
import defpackage.cqmp;
import defpackage.cqmz;
import defpackage.cqok;
import defpackage.cqsu;
import defpackage.cqum;
import defpackage.cquu;
import defpackage.cqvd;
import defpackage.cqve;
import defpackage.cqvf;
import defpackage.cqxl;
import defpackage.cqxp;
import defpackage.crqx;
import defpackage.cvjt;
import defpackage.cvjy;
import defpackage.cvmv;
import defpackage.cvnw;
import defpackage.cvnx;
import defpackage.cvny;
import defpackage.cvnz;
import defpackage.cvtm;
import defpackage.czek;
import defpackage.czen;
import defpackage.czeo;
import defpackage.czep;
import defpackage.czeq;
import defpackage.dajw;
import defpackage.dakl;
import defpackage.dqbw;
import defpackage.eehg;
import defpackage.ejvr;
import defpackage.elha;
import defpackage.emop;
import defpackage.emsn;
import defpackage.emsp;
import defpackage.emsr;
import defpackage.emss;
import defpackage.enle;
import defpackage.eoqg;
import defpackage.eosb;
import defpackage.eosc;
import defpackage.eosd;
import defpackage.eyig;
import defpackage.fcsu;
import defpackage.uhx;
import j$.util.Optional;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AudioButtonView extends cvmv implements MediaRecorder.OnErrorListener, MediaRecorder.OnInfoListener {
    private static final czen A;
    public static final /* synthetic */ int z = 0;
    private AppCompatImageView B;
    private AppCompatImageView C;
    private AppCompatImageView D;
    private Drawable E;
    private Drawable F;
    private Drawable G;
    private GestureDetector H;
    private dajw I;
    private int J;
    private int K;
    private long L;
    private Runnable M;
    private int N;
    private int O;
    public long a;
    public babw b;
    public boolean c;
    public eosb d;
    public int e;
    public cogw f;
    public cqvd g;
    public cvnw h;
    public aomc i;
    public ContentResolver j;
    public eosc k;
    public eosc l;
    public eosd m;
    public fcsu n;
    public fcsu o;
    public airc p;
    public airh q;
    public dakl r;
    public bahv s;
    public aipw t;
    public fcsu u;
    public fcsu v;
    public int w;
    public cvny x;
    public cvnx y;

    static {
        emsp emspVar = emsp.VOICE;
        emsr emsrVar = emsr.COLLAPSED;
        int i = czen.b;
        emsn emsnVar = (emsn) emss.a.createBuilder();
        emsnVar.copyOnWrite();
        emss emssVar = (emss) emsnVar.instance;
        emssVar.c = emspVar.v;
        emssVar.b |= 1;
        emsnVar.copyOnWrite();
        emss emssVar2 = (emss) emsnVar.instance;
        emssVar2.d = emsrVar.e;
        emssVar2.b |= 2;
        emss emssVar3 = (emss) emsnVar.build();
        int i2 = czeo.a;
        A = new czep(emssVar3);
    }

    public AudioButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.w = 1;
        this.e = 307200;
    }

    public final void a() {
        this.p.b(TimeUnit.MILLISECONDS.toSeconds(this.f.f().toEpochMilli() - this.a), 2, enle.NOISE_CANCELLATION_STATE_UNKNOWN);
        this.c = true;
        d(false);
        cvny cvnyVar = this.x;
        if (cvnyVar != null) {
            cvnyVar.a.a();
        }
        g(1);
        Toast.makeText(getContext(), R.string.audio_recorder_recording_cancelled_text, 0).show();
    }

    public final void b(int i, cqvf cqvfVar) {
        cqvd cqvdVar = this.g;
        cquu cquuVar = new cquu();
        cquuVar.a = cqum.b(i);
        cquuVar.b(new AudioAttributes.Builder().setUsage(13).build());
        auvh.h(cqvdVar.b(cquuVar.a(), new cvjt(cqvfVar)).e(cqve.class, new ejvr() { // from class: cvju
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                int i2 = AudioButtonView.z;
                cqca.p("BugleAudio", (cqve) obj, "Failed to play sound for audio button");
                return cqup.c(2);
            }
        }, eoqg.a));
    }

    public final void c() {
        long epochMilli = this.f.f().toEpochMilli();
        if (epochMilli - this.L < this.K) {
            this.q.k(new Supplier() { // from class: airg
                @Override // java.util.function.Supplier
                public final Object get() {
                    return airh.c(3, 2);
                }
            });
            return;
        }
        this.q.k(new Supplier() { // from class: airf
            @Override // java.util.function.Supplier
            public final Object get() {
                return airh.c(2, 2);
            }
        });
        this.I.c();
        removeCallbacks(this.M);
        postDelayed(this.M, this.J);
        this.L = epochMilli;
    }

    public final void d(boolean z2) {
        emop emopVarA;
        boolean zU;
        eosb eosbVar = this.d;
        if (eosbVar != null) {
            eosbVar.cancel(true);
            this.d = null;
        }
        long epochMilli = this.f.f().toEpochMilli() - this.a;
        if (!f() || epochMilli <= 0) {
            g(1);
            return;
        }
        final Uri uriB = this.i.b();
        if (uriB != null) {
            if (this.c) {
                auwa.a(new Runnable() { // from class: cvjw
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.j.delete(uriB, null, null);
                    }
                }, this.l);
                g(5);
                return;
            }
            if (((Boolean) ccze.m.e()).booleanValue()) {
                dqbw dqbwVar = dqbw.a;
                if (dqbwVar == null) {
                    throw new NullPointerException("Null voiceMetadata");
                }
                String str = true != ((Boolean) aonl.a.e()).booleanValue() ? "audio/amr" : "audio/mp4";
                elha elhaVar = elha.AUDIO_CHOOSER;
                if (elhaVar == null) {
                    throw new NullPointerException("Null contentSource");
                }
                uhx uhxVar = new uhx(str, uriB, elhaVar, epochMilli, dqbwVar);
                bagr bagrVar = (bagr) this.b.a();
                czen czenVar = A;
                String strB = this.b.b();
                MessagePartCoreData messagePartCoreDataA = bagrVar.v.a(uhxVar, czenVar);
                if (messagePartCoreDataA instanceof PendingAttachmentData ? bagrVar.v((PendingAttachmentData) messagePartCoreDataA, strB) : bagrVar.u(messagePartCoreDataA)) {
                    bagrVar.q();
                }
                bagrVar.r(1);
                emopVarA = czek.a(uhxVar, czenVar);
            } else {
                bahv bahvVar = this.s;
                bahx bahxVarD = bahy.D();
                bacm bacmVar = (bacm) bahxVarD;
                bacmVar.c = true == ((Boolean) aonl.a.e()).booleanValue() ? "audio/mp4" : "audio/amr";
                bacmVar.d = uriB;
                bacmVar.e = uriB;
                bahxVarD.g(epochMilli);
                bahxVarD.n(elha.AUDIO_CHOOSER);
                MessagePartData messagePartDataC = bahvVar.c(bahxVarD.q());
                emop emopVarB = czeq.b(messagePartDataC, A);
                messagePartDataC.h = emopVarB;
                bagr bagrVar2 = (bagr) this.b.a();
                List<MessagePartCoreData> listSingletonList = Collections.singletonList(messagePartDataC);
                String strB2 = this.b.b();
                boolean zV = false;
                for (MessagePartCoreData messagePartCoreData : listSingletonList) {
                    Uri uriT = messagePartCoreData.t();
                    if (messagePartCoreData instanceof PendingAttachmentData) {
                        zV |= bagrVar2.v((PendingAttachmentData) messagePartCoreData, strB2);
                    } else {
                        if (cqmz.o(uriT)) {
                            cqbd cqbdVarA = bagr.b.a();
                            cqbdVarA.I("adding attachment uri:");
                            cqbdVarA.I(uriT);
                            cqbdVarA.r();
                            baii baiiVar = bagrVar2.t;
                            String strR = messagePartCoreData.R();
                            Uri uriT2 = messagePartCoreData.t();
                            Uri uriV = messagePartCoreData.v();
                            int iC = messagePartCoreData.c();
                            int iB = messagePartCoreData.b();
                            long jK = messagePartCoreData.k();
                            elha elhaVarK = messagePartCoreData.K();
                            String strAa = messagePartCoreData.aa();
                            String strZ = messagePartCoreData.Z();
                            long jM = messagePartCoreData.m();
                            String strT = messagePartCoreData.T();
                            cqxl cqxlVar = (cqxl) baiiVar.a.b();
                            cqxlVar.getClass();
                            Context context = (Context) baiiVar.b.b();
                            context.getClass();
                            cqmp cqmpVar = (cqmp) baiiVar.c.b();
                            cqmpVar.getClass();
                            cmum cmumVar = (cmum) baiiVar.d.b();
                            cmumVar.getClass();
                            cqmz cqmzVar = (cqmz) baiiVar.e.b();
                            cqmzVar.getClass();
                            bahv bahvVar2 = (bahv) baiiVar.f.b();
                            bahvVar2.getClass();
                            bxfu bxfuVar = (bxfu) baiiVar.g.b();
                            bxfuVar.getClass();
                            cmtv cmtvVar = (cmtv) baiiVar.i.b();
                            cmtvVar.getClass();
                            baii baiiVar2 = (baii) baiiVar.u.b();
                            baiiVar2.getClass();
                            cqsu cqsuVar = (cqsu) baiiVar.j.b();
                            cqsuVar.getClass();
                            cogw cogwVar = (cogw) baiiVar.k.b();
                            cogwVar.getClass();
                            crqx crqxVar = (crqx) baiiVar.l.b();
                            crqxVar.getClass();
                            cqok cqokVar = (cqok) baiiVar.m.b();
                            cqokVar.getClass();
                            Object obj = ((eyig) baiiVar.n).a;
                            cqxp cqxpVar = (cqxp) baiiVar.o.b();
                            cqxpVar.getClass();
                            eosc eoscVar = (eosc) baiiVar.p.b();
                            eoscVar.getClass();
                            apsl apslVar = (apsl) baiiVar.q.b();
                            apslVar.getClass();
                            elhaVarK.getClass();
                            aqbx aqbxVar = (aqbx) baiiVar.s.b();
                            aqbxVar.getClass();
                            PendingAttachmentData pendingAttachmentData = new PendingAttachmentData(cqxlVar, context, cqmpVar, cmumVar, cqmzVar, bahvVar2, bxfuVar, baiiVar.h, cmtvVar, baiiVar2, cqsuVar, cogwVar, crqxVar, cqokVar, (Optional) obj, cqxpVar, eoscVar, apslVar, baiiVar.r, strR, uriT2, uriV, iC, iB, jK, elhaVarK, strAa, strZ, jM, strT, aqbxVar);
                            pendingAttachmentData.h = messagePartCoreData.L();
                            zU = bagrVar2.v(pendingAttachmentData, strB2);
                        } else {
                            zU = bagrVar2.u(messagePartCoreData);
                        }
                        zV |= zU;
                    }
                }
                if (zV) {
                    bagrVar2.q();
                }
                bagrVar2.r(1);
                emopVarA = emopVarB;
            }
            this.t.b(emopVarA, ((bagr) this.b.a()).k() - 1);
            if (z2) {
                airc aircVar = this.p;
                final long seconds = TimeUnit.MILLISECONDS.toSeconds(epochMilli);
                final enle enleVar = enle.NOISE_CANCELLATION_STATE_UNKNOWN;
                aircVar.k(new Supplier() { // from class: airb
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return airc.d(4, seconds, 2, enleVar);
                    }
                });
            } else {
                this.p.c(TimeUnit.MILLISECONDS.toSeconds(epochMilli), 2, enle.NOISE_CANCELLATION_STATE_UNKNOWN);
            }
        }
        g(5);
        b(R.raw.audio_end, new cqvf() { // from class: cvjx
            @Override // defpackage.cqvf
            public final void a() {
                AudioButtonView audioButtonView = this.a;
                if (audioButtonView.w == 5) {
                    audioButtonView.g(1);
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.H.onTouchEvent(motionEvent);
    }

    protected final void e() {
        int i = this.w;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            this.h.a(this, this.C, this.D).end();
            this.C.setImageDrawable(null);
            this.E.setColorFilter(this.N, PorterDuff.Mode.SRC_ATOP);
            this.B.setImageDrawable(this.E);
            this.C.setScaleX(1.0f);
            this.C.setScaleY(1.0f);
            this.D.setVisibility(8);
            return;
        }
        if (i2 != 1) {
            if (i2 != 2 && i2 != 3 && i2 != 4) {
                cqaz.c("Invalid mode for AudioRecordView!");
                return;
            }
            this.E.setColorFilter(getContext().getColor(R.color.audio_button_pressed_icon_color), PorterDuff.Mode.SRC_ATOP);
            this.B.setImageDrawable(this.E);
            this.G.setColorFilter(this.O, PorterDuff.Mode.SRC_ATOP);
            this.C.setImageDrawable(this.G);
            float fraction = getResources().getFraction(R.fraction.audio_button_animation_start_size, 1, 1);
            this.C.setScaleX(fraction);
            this.C.setScaleY(fraction);
            this.D.setVisibility(0);
            this.h.a(this, this.C, this.D).start();
        }
    }

    public final boolean f() {
        int i = this.w;
        return i == 3 || i == 4;
    }

    public final void g(int i) {
        if (this.w != i) {
            this.w = i;
            cvny cvnyVar = this.x;
            if (cvnyVar != null) {
                int i2 = i - 1;
                if (i2 == 0) {
                    cvnyVar.a.d(false);
                } else if (i2 == 1) {
                    cvnz cvnzVar = cvnyVar.a;
                    cvtm cvtmVar = cvnzVar.a.H().c.j;
                    cvnzVar.b.e = 307200;
                    cvnzVar.c.g(4);
                    cvnzVar.d.g(4);
                    cvnzVar.e.g(4);
                } else if (i2 == 2) {
                    cvnz cvnzVar2 = cvnyVar.a;
                    cvnzVar2.c(false);
                    cvnzVar2.d(true);
                    if (cpga.g(cvnzVar2.b.getContext())) {
                        cvnzVar2.e();
                    }
                } else if (i2 != 3) {
                    cvnz cvnzVar3 = cvnyVar.a;
                    cvnzVar3.a();
                    cvnzVar3.d(false);
                    if (cpga.g(cvnzVar3.b.getContext())) {
                        cvnzVar3.e();
                    }
                } else {
                    cvnz cvnzVar4 = cvnyVar.a;
                    cvnzVar4.e();
                    cvnzVar4.c(true);
                }
            }
            e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d(false);
    }

    @Override // android.media.MediaRecorder.OnErrorListener
    public final void onError(MediaRecorder mediaRecorder, int i, int i2) {
        cqca.f("Bugle", a.s(i2, i, "Error occurred during audio recording what=", ", extra="));
        this.q.b(2);
        this.r.i(R.string.audio_recording_error);
        d(false);
    }

    @Override // android.view.View
    protected final void onFinishInflate() throws Resources.NotFoundException {
        super.onFinishInflate();
        new FrameLayout.LayoutParams(-2, -2).gravity = 17;
        this.D = (AppCompatImageView) findViewById(R.id.audio_button_view_recording_indicator);
        this.C = (AppCompatImageView) findViewById(R.id.audio_button_view_background);
        this.B = (AppCompatImageView) findViewById(R.id.audio_button_view_microphone_icon);
        this.E = getContext().getDrawable(R.drawable.quantum_gm_ic_mic_none_white_24);
        Drawable drawable = getContext().getDrawable(R.drawable.quantum_ic_done_black_24);
        this.F = drawable;
        drawable.setColorFilter(getContext().getColor(R.color.audio_button_check_icon_color), PorterDuff.Mode.SRC_ATOP);
        this.G = getContext().getDrawable(R.drawable.compose2o_voice_message_button_background);
        this.H = new cvjy(this, getContext(), new GestureDetector.SimpleOnGestureListener());
        this.N = eehg.b(this.B, R.attr.colorInactiveComposeIcon);
        this.O = eehg.b(this.B, R.attr.colorActiveComposeIcon);
        dajw dajwVar = new dajw((FrameLayout) LayoutInflater.from(getContext()).inflate(R.layout.voice_messages_single_tap_popup, (ViewGroup) null), 1, this, 2);
        this.I = dajwVar;
        dajwVar.b(eehg.b(this, R.attr.colorPrimaryContainer));
        this.J = getResources().getInteger(R.integer.hold_to_record_tooltip_showup_duration_millis);
        this.K = getResources().getInteger(R.integer.hold_to_record_tooltip_showup_gap_millis);
        this.L = -r0;
        final dajw dajwVar2 = this.I;
        dajwVar2.getClass();
        this.M = new Runnable() { // from class: cvjv
            @Override // java.lang.Runnable
            public final void run() {
                dajwVar2.a();
            }
        };
    }

    @Override // android.media.MediaRecorder.OnInfoListener
    public final void onInfo(MediaRecorder mediaRecorder, int i, int i2) {
        if (i == 800) {
            cqca.i("Bugle", "Max duration reached while recording audio");
            Toast.makeText(getContext(), R.string.audio_recorder_time_limit_reached_text, 0).show();
            d(true);
        } else if (i == 801) {
            cqca.i("Bugle", "Max size reached while recording audio");
            d(true);
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            e();
        }
    }
}
