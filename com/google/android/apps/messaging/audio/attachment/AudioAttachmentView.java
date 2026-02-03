package com.google.android.apps.messaging.audio.attachment;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewSwitcher;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.audio.attachment.AudioAttachmentView;
import com.google.android.apps.messaging.shared.audio.attachment.ui.AudioPlaybackSeekBar;
import com.google.android.apps.messaging.shared.audio.attachment.ui.PausableChronometer;
import com.google.android.apps.messaging.ui.conversation.message.ConversationMessageView;
import defpackage.aomo;
import defpackage.cpba;
import defpackage.cpbb;
import defpackage.cpdw;
import defpackage.dakl;
import defpackage.eehg;
import defpackage.eigl;
import defpackage.eigp;
import defpackage.einm;
import defpackage.ejwl;
import defpackage.ejxr;
import defpackage.fcsu;
import defpackage.sss;
import defpackage.ssv;
import defpackage.ssw;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AudioAttachmentView extends ssw implements cpba {
    public ViewSwitcher a;
    PausableChronometer b;
    AudioPlaybackSeekBar c;
    public cpbb d;
    public fcsu e;
    public fcsu f;
    public fcsu g;
    final int h;
    private final RectF i;
    private final int j;
    private final Path k;
    private int l;
    private int m;

    public AudioAttachmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new RectF();
        new aomo(3, Duration.ofMillis(-1L), Duration.ZERO);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ssv.a);
        int i = new int[]{1, 2, 3}[typedArrayObtainStyledAttributes.getInt(0, 0)];
        this.h = i;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        layoutInflaterFrom.inflate(i2 != 1 ? i2 != 2 ? R.layout.audio_attachment_view_normal_layout : R.layout.audio_attachment_view_mini_layout : R.layout.audio_attachment_view_compact_layout, (ViewGroup) this, true);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(i == 3);
        this.k = new Path();
        this.j = context.getResources().getDimensionPixelSize(R.dimen.audio_attachment_corner_radius);
        setContentDescription(context.getString(R.string.audio_attachment_content_description));
    }

    @Override // defpackage.cpba
    public final void a(cpbb cpbbVar) {
        cpbb cpbbVar2 = this.d;
        boolean z = true;
        if (cpbbVar2 != null && cpbbVar2 != cpbbVar) {
            z = false;
        }
        ejwl.a(z);
        this.d = cpbbVar;
    }

    public final void b(boolean z, Duration duration) {
        PausableChronometer pausableChronometer = this.b;
        if (pausableChronometer == null) {
            return;
        }
        pausableChronometer.stop();
        pausableChronometer.b = pausableChronometer.a.a() - pausableChronometer.getBase();
        pausableChronometer.c(duration.isNegative() ? 0L : duration.toMillis());
        if (z) {
            pausableChronometer.setBase(pausableChronometer.a.a() - pausableChronometer.b);
            pausableChronometer.start();
        }
    }

    @Override // defpackage.aomf
    public final void c() {
        ((dakl) this.g.b()).p(R.string.audio_recording_replay_failed);
    }

    public final void d(Duration duration) {
        AudioPlaybackSeekBar audioPlaybackSeekBar = this.c;
        if (audioPlaybackSeekBar == null) {
            return;
        }
        duration.toMillis();
        audioPlaybackSeekBar.b += audioPlaybackSeekBar.a.a();
        throw null;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onDraw(Canvas canvas) {
        int width = getWidth();
        int height = getHeight();
        if (this.l != width || this.m != height) {
            RectF rectF = this.i;
            rectF.set(0.0f, 0.0f, width, height);
            Path path = this.k;
            path.reset();
            float f = this.j;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
            this.l = width;
            this.m = height;
        }
        canvas.clipPath(this.k);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        int i;
        GradientDrawable gradientDrawable;
        super.onFinishInflate();
        int i2 = this.h;
        if (i2 == 2) {
            View viewFindViewById = findViewById(R.id.audio_preview_container);
            if (viewFindViewById != null && (gradientDrawable = (GradientDrawable) viewFindViewById.getBackground()) != null) {
                gradientDrawable.setColor(eehg.d(getContext(), R.attr.colorPrimaryBackground, "AudioDrawables"));
                setBackground(gradientDrawable);
            }
            i = 2;
        } else {
            i = i2;
        }
        this.a = (ViewSwitcher) findViewById(R.id.play_pause_button);
        if (i2 == 2 || i2 == 1) {
            PausableChronometer pausableChronometer = (PausableChronometer) findViewById(R.id.timer);
            pausableChronometer.getClass();
            AudioPlaybackSeekBar audioPlaybackSeekBar = (AudioPlaybackSeekBar) findViewById(R.id.seek);
            audioPlaybackSeekBar.getClass();
            this.b = pausableChronometer;
            this.c = audioPlaybackSeekBar;
            audioPlaybackSeekBar.setOnSeekBarChangeListener(new eigl((eigp) this.e.b(), new sss(this, audioPlaybackSeekBar, pausableChronometer)));
            if (i == 1) {
                audioPlaybackSeekBar.setOnTouchListener(new View.OnTouchListener() { // from class: aonf
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        int i3 = AudioPlaybackSeekBar.d;
                        if (motionEvent.getAction() == 0) {
                            view.getParent().requestDisallowInterceptTouchEvent(true);
                        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                            view.getParent().requestDisallowInterceptTouchEvent(false);
                        }
                        return false;
                    }
                });
            }
        }
        einm einmVar = (einm) this.f.b();
        ViewSwitcher viewSwitcher = this.a;
        final ejxr ejxrVar = new ejxr() { // from class: ssr
            @Override // defpackage.ejxr
            public final Object get() {
                return new aomg(this.a);
            }
        };
        einmVar.a(viewSwitcher, new View.OnClickListener() { // from class: einj
            /* JADX WARN: Type inference failed for: r0v1, types: [einb, java.lang.Object] */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                einf.g(ejxrVar.get(), view);
            }
        });
        new cpdw(this, R.id.vmt_container_stub, R.id.vmt_container);
    }

    @Override // android.view.View
    public final void setLongClickable(boolean z) {
        super.setLongClickable(z);
        this.a.setOnLongClickListener(z ? new View.OnLongClickListener() { // from class: ssq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                AudioAttachmentView audioAttachmentView = this.a;
                cpbb cpbbVar = audioAttachmentView.d;
                if (cpbbVar == null) {
                    return false;
                }
                return ((ConversationMessageView) cpbbVar).onLongClick((View) audioAttachmentView.getParent());
            }
        } : null);
    }
}
