package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.support.constraint.ConstraintLayout;
import android.transition.Transition;
import android.transition.TransitionInflater;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.audio.attachment.ui.PausableChronometer;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;
import com.google.android.apps.messaging.ui.conversation.AudioButtonView;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.ui.conversation.compose.PlainTextEditText;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvnz {
    private final cvny A;
    public final ComposeMessageView a;
    public final AudioButtonView b;
    public final cpdw c;
    public final cpdw d;
    public final cpdw e;
    public final int[] f;
    public final float g;
    public final cssf h;
    public final fcsu i;
    public boolean j;
    private Integer k;
    private final Context l;
    private final Vibrator m;
    private ImageView n;
    private final View o;
    private final View p;
    private final PlainTextEditText q;
    private final cvnw r;
    private final Transition s;
    private final Transition t;
    private final AttachmentsContainer u;
    private ImageView v;
    private aw w;
    private aw x;
    private final int y;
    private final cvnx z;

    public cvnz(cvnw cvnwVar, Context context, Vibrator vibrator, cssf cssfVar, fcsu fcsuVar, fcsu fcsuVar2, ComposeMessageView composeMessageView, babw babwVar) {
        this.n = null;
        cvnx cvnxVar = new cvnx(this);
        this.z = cvnxVar;
        cvny cvnyVar = new cvny(this);
        this.A = cvnyVar;
        this.l = context;
        this.m = vibrator;
        this.h = cssfVar;
        this.i = fcsuVar;
        this.r = cvnwVar;
        cvnwVar.b = composeMessageView;
        this.a = composeMessageView;
        this.d = new cpdw(composeMessageView, R.id.audio_timer_dot_view_stub, R.id.audio_timer_dot);
        this.c = new cpdw(composeMessageView, R.id.audio_timer_view_stub, R.id.audio_timer_text);
        this.q = (PlainTextEditText) composeMessageView.findViewById(R.id.compose_message_text);
        this.o = composeMessageView.findViewById(R.id.send_message_button_container);
        this.p = composeMessageView.findViewById(R.id.send_message_button_icon);
        this.u = (AttachmentsContainer) composeMessageView.findViewById(R.id.attachments_container);
        AudioButtonView audioButtonView = (AudioButtonView) composeMessageView.findViewById(R.id.audio_button_view);
        this.b = audioButtonView;
        audioButtonView.b = babwVar;
        audioButtonView.x = cvnyVar;
        audioButtonView.y = cvnxVar;
        if (((Boolean) ((cczi) ujw.l.get()).e()).booleanValue()) {
            this.n = (ImageView) new cpdw(composeMessageView, R.id.audio_button_compose_view_stub, R.id.audio_button_compose_view).b();
        }
        this.e = new cpdw(composeMessageView, R.id.record_cancel_button_view_v1_stub, R.id.record_cancel_button_v1);
        this.f = new int[2];
        this.s = TransitionInflater.from(composeMessageView.getContext()).inflateTransition(true != f(fcsuVar2) ? R.transition.message_box_slide_left_transition : R.transition.message_box_slide_left_transition_magic_compose);
        this.t = TransitionInflater.from(composeMessageView.getContext()).inflateTransition(true != f(fcsuVar2) ? R.transition.message_box_slide_right_transition : R.transition.message_box_slide_right_transition_magic_compose);
        this.y = context.getColor(R.color.voice_messages_slide_to_cancel_triangle_icon_color);
        this.g = composeMessageView.getResources().getFraction(R.fraction.swipe_to_cancel_gesture_trigger_ratio, 1, 1);
    }

    private static boolean f(fcsu fcsuVar) {
        return crbf.d() && ((crqx) fcsuVar.b()).j();
    }

    public final void a() {
        cpdw cpdwVar = this.c;
        ((PausableChronometer) cpdwVar.b()).stop();
        cpdw cpdwVar2 = this.d;
        View viewB = cpdwVar.b();
        View viewB2 = cpdwVar2.b();
        cvnw cvnwVar = this.r;
        if (cvnwVar.a == null) {
            cvmt cvmtVar = cvnwVar.c;
            ObjectAnimator objectAnimatorA = cvmt.a(viewB, true, cvnwVar.b.getResources().getInteger(R.integer.audio_button_fade_in_animation_duration_millis));
            ObjectAnimator objectAnimatorA2 = cvmt.a(viewB2, true, cvnwVar.b.getResources().getInteger(R.integer.audio_button_fade_in_animation_duration_millis));
            cvnwVar.a = new AnimatorSet();
            cvnwVar.a.addListener(new cvnv(viewB, viewB2));
            cvnwVar.a.play(objectAnimatorA).with(objectAnimatorA2);
        }
        cvnwVar.a.start();
        cvnwVar.c(this.q).start();
        if (this.w == null) {
            return;
        }
        ComposeMessageView composeMessageView = this.a;
        TransitionManager.beginDelayedTransition(composeMessageView, this.t);
        aw awVar = this.w;
        awVar.getClass();
        awVar.b(composeMessageView);
        b();
        this.u.H().g = 0;
    }

    public final void b() {
        boolean zH = this.a.H().h();
        AudioButtonView audioButtonView = this.b;
        boolean zF = audioButtonView.f();
        ImageView imageView = this.n;
        int i = 4;
        if (imageView != null) {
            imageView.setVisibility(true != zH ? 0 : 4);
        } else {
            audioButtonView.setVisibility((!zH || zF) ? 0 : 4);
        }
        View view = this.o;
        if (zH && !zF) {
            i = 0;
        }
        view.setVisibility(i);
    }

    public final void c(boolean z) {
        if (!z) {
            if (this.k != null) {
                ((PausableChronometer) this.c.b()).setTextColor(this.k.intValue());
            }
        } else {
            Context context = this.l;
            cpdw cpdwVar = this.c;
            int color = context.getColor(R.color.chronometer_text_color_near_limit);
            this.k = Integer.valueOf(((PausableChronometer) cpdwVar.b()).getTextColors().getDefaultColor());
            ((PausableChronometer) cpdwVar.b()).setTextColor(color);
        }
    }

    public final void d(boolean z) {
        ComposeMessageView composeMessageView = this.a;
        cvkf cvkfVarK = composeMessageView.H().k();
        if (!z) {
            Activity activityD = dakl.d(this.l);
            activityD.getClass();
            activityD.getWindow().clearFlags(128);
            this.r.b(this.c.b(), this.d.b()).end();
            if (cvkfVarK != null) {
                ((cvkv) cvkfVarK).d.setVisibility(0);
                return;
            }
            return;
        }
        Context context = this.l;
        Activity activityD2 = dakl.d(context);
        activityD2.getClass();
        activityD2.getWindow().addFlags(128);
        cpdw cpdwVar = this.c;
        PausableChronometer pausableChronometer = (PausableChronometer) cpdwVar.b();
        pausableChronometer.stop();
        pausableChronometer.setBase(pausableChronometer.a.a());
        pausableChronometer.b = 0L;
        pausableChronometer.start();
        cpdwVar.g(0);
        cpdw cpdwVar2 = this.d;
        cpdwVar2.g(0);
        ((ImageView) cpdwVar2.b()).setVisibility(0);
        this.o.setVisibility(4);
        TransitionManager.beginDelayedTransition(composeMessageView, this.s);
        if (this.x == null) {
            if (this.w == null) {
                aw awVar = new aw();
                this.w = awVar;
                awVar.e(composeMessageView);
            }
            aw awVar2 = new aw();
            this.x = awVar2;
            awVar2.e(composeMessageView);
            this.x.f(R.id.compose_message_box_linear_layout, 6, ((Boolean) ccze.n.e()).booleanValue() ? composeMessageView.getId() : R.id.message_compose_view_container_with_c2o, 6, (int) composeMessageView.getResources().getDimension(R.dimen.message_box_slide_margin));
            this.x.l(R.id.plus_button, 4);
            this.x.l(R.id.camera_gallery_button, 4);
            this.x.d(R.id.plus_button, 6);
            this.x.d(R.id.camera_gallery_button, 6);
            this.x.f(R.id.camera_gallery_button, 7, R.id.compose_message_box_linear_layout, 6, 0);
            this.x.l(R.id.record_cancel_button_v1, 0);
            this.x.f(R.id.record_cancel_button_v1, 7, R.id.audio_button_view, 6, 0);
            this.x.f(R.id.record_cancel_button_v1, 6, R.id.audio_timer_text, 7, 0);
        }
        this.x.b(composeMessageView);
        this.u.H().g = context.getResources().getInteger(R.integer.message_box_sliding_animation_duration_millis);
        if (cvkfVarK != null) {
            ((cvkv) cvkfVarK).d.setVisibility(4);
        }
        cvnw cvnwVar = this.r;
        cvnwVar.c(this.q).reverse();
        cvnwVar.b(cpdwVar.b(), cpdwVar2.b()).start();
        if (this.v == null) {
            this.v = (ImageView) ((ConstraintLayout) this.e.b()).findViewById(R.id.triangle_icon);
        }
        ImageView imageView = this.v;
        imageView.getDrawable().setColorFilter(this.y, PorterDuff.Mode.SRC_ATOP);
        imageView.setRotation(true != this.h.e() ? 0.0f : 180.0f);
        cvnwVar.b(cpdwVar.b(), cpdwVar2.b()).start();
    }

    public final void e() {
        this.m.vibrate(VibrationEffect.createOneShot(this.l.getResources().getInteger(R.integer.audio_timer_warning_vibration_duration_millis), -1));
    }
}
