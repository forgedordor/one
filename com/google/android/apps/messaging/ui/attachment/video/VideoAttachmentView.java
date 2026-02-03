package com.google.android.apps.messaging.ui.attachment.video;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.ui.RoundedImageView;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.a;
import defpackage.cqsu;
import defpackage.cvin;
import defpackage.cvio;
import defpackage.cvir;
import defpackage.cvis;
import defpackage.ehlg;
import defpackage.ehmt;
import defpackage.ehnq;
import defpackage.ehnz;
import defpackage.ehoh;
import defpackage.ehoi;
import defpackage.einr;
import defpackage.ejwl;
import defpackage.eyhq;
import defpackage.eyhx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VideoAttachmentView extends cvio implements ehlg, einr {
    private cvir a;
    private final TypedArray b;
    private Context c;

    @Deprecated
    public VideoAttachmentView(Context context) {
        super(context);
        this.b = null;
        e();
    }

    private final cvir d() {
        e();
        return this.a;
    }

    private final void e() {
        if (this.a == null) {
            try {
                this.a = ((cvis) bb()).N();
                TypedArray typedArray = this.b;
                if (typedArray != null) {
                    typedArray.recycle();
                }
                Context context = getContext();
                while ((context instanceof ContextWrapper) && !(context instanceof eyhx) && !(context instanceof eyhq.a) && !(context instanceof ehnz)) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                if (!(context instanceof ehnq)) {
                    throw new IllegalStateException(a.O(this));
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cvir.class;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        cvir cvirVar = this.a;
        if (cvirVar != null) {
            return cvirVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.einr
    public final TypedArray a() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ehoi.a(getContext())) {
            Context contextA = ehoh.a(this);
            Context context = this.c;
            if (context == null) {
                this.c = contextA;
                return;
            }
            boolean z = true;
            if (context != contextA && !ehoh.b(context)) {
                z = false;
            }
            ejwl.m(z, "onAttach called multiple times with different parent Contexts");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ListenableFuture listenableFuture = d().b;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        e();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        float fMin;
        float f;
        float f2;
        super.onMeasure(i, i2);
        cvir cvirVarD = d();
        if (cvirVarD.g) {
            return;
        }
        Uri uri = cvirVarD.a;
        RoundedImageView roundedImageView = cvirVarD.d;
        int measuredWidth = roundedImageView.getMeasuredWidth();
        int measuredHeight = roundedImageView.getMeasuredHeight();
        float f3 = measuredHeight;
        VideoAttachmentView videoAttachmentView = cvirVarD.c;
        int dimensionPixelSize = videoAttachmentView.getResources().getDimensionPixelSize(R.dimen.video_attachment_fallback_width);
        int dimensionPixelSize2 = videoAttachmentView.getResources().getDimensionPixelSize(R.dimen.video_attachment_fallback_height);
        int dimensionPixelSize3 = videoAttachmentView.getResources().getDimensionPixelSize(R.dimen.video_attachment_min_size);
        int i3 = cqsu.g;
        if (measuredWidth >= dimensionPixelSize || measuredHeight >= dimensionPixelSize2) {
            fMin = measuredWidth;
            f = dimensionPixelSize;
            float f4 = dimensionPixelSize2;
            f2 = f / f4 < fMin / f3 ? f / fMin : f4 / f3;
        } else if (Math.min(measuredWidth, measuredHeight) < dimensionPixelSize3) {
            fMin = Math.min(measuredWidth, measuredHeight);
            f = dimensionPixelSize3;
        } else {
            f2 = 1.0f;
        }
        int i4 = (int) (f3 * f2);
        int i5 = (int) (measuredWidth * f2);
        roundedImageView.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i4, 1073741824));
        float f5 = i5;
        float f6 = i4;
        float fMin2 = Math.min(Math.max(View.MeasureSpec.getSize(i) / f5, View.MeasureSpec.getSize(i2) / f6), Math.max(Math.max(1.0f, videoAttachmentView.getMinimumWidth() / f5), Math.max(1.0f, videoAttachmentView.getMinimumHeight() / f6)));
        videoAttachmentView.setMeasuredDimension((int) (f5 * fMin2), (int) (f6 * fMin2));
    }

    @Override // android.view.View
    public final void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        final cvir cvirVarD = d();
        if (cvirVarD.f) {
            return;
        }
        cvirVarD.d.setOnLongClickListener(new View.OnLongClickListener() { // from class: cvip
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                cvirVarD.c.performLongClick();
                return true;
            }
        });
    }

    public VideoAttachmentView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = context.obtainStyledAttributes(attributeSet, cvin.a);
    }

    public VideoAttachmentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = context.obtainStyledAttributes(attributeSet, cvin.a, i, 0);
    }

    public VideoAttachmentView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = context.obtainStyledAttributes(attributeSet, cvin.a, i, i2);
    }

    public VideoAttachmentView(ehmt ehmtVar) {
        super(ehmtVar);
        this.b = null;
        e();
    }
}
