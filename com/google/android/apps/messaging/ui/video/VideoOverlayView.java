package com.google.android.apps.messaging.ui.video;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import defpackage.aymj;
import defpackage.cqjk;
import defpackage.cqmz;
import defpackage.dala;
import defpackage.dalb;
import defpackage.dald;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ekrd;
import defpackage.ekrg;
import defpackage.ekrw;
import defpackage.eksq;
import defpackage.elgm;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class VideoOverlayView extends dala implements aymj<Long> {
    private static final ekrg c = ekrg.c("com/google/android/apps/messaging/ui/video/VideoOverlayView");
    public int a;
    public fcsu b;

    public VideoOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0;
        LayoutInflater.from(context).inflate(R.layout.video_overlay_view, (ViewGroup) this, true);
    }

    @Override // defpackage.aymj
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        f();
    }

    @Override // defpackage.aymj
    public final /* bridge */ /* synthetic */ void b(Action action, Object obj) {
        if (((Long) obj) == null) {
            f();
        } else if (((TextView) findViewById(R.id.duration)) != null) {
            ekrw ekrwVarE = c.e();
            ekrwVarE.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/ui/video/VideoOverlayView", "onActionSucceeded", 246, "VideoOverlayView.java")).q("ignoring duration because a newer uri is associated with this view, or the view was destroyed");
            e(0L);
        }
    }

    public final void e(long j) {
        TextView textView = (TextView) findViewById(R.id.duration);
        textView.setText(j == 0 ? null : cqjk.g(j));
        String string = getContext().getString(R.string.video_attachment_content_description);
        if (j != 0) {
            string = string + " " + ((cqjk) this.b.b()).f(j);
        }
        textView.setContentDescription(string);
        textView.setClickable(false);
        textView.setImportantForAccessibility(2);
    }

    public final void f() {
        ekrw ekrwVarH = c.h();
        ekrwVarH.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/ui/video/VideoOverlayView", "onActionFailed", 259, "VideoOverlayView.java")).q("failed to get duration for this uri");
        e(0L);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft;
        int measuredWidth;
        int measuredWidth2;
        int paddingTop = getPaddingTop();
        ImageView imageView = (ImageView) findViewById(R.id.icon);
        int measuredHeight = imageView.getMeasuredHeight() + paddingTop;
        TextView textView = (TextView) findViewById(R.id.duration);
        int measuredHeight2 = ((imageView.getMeasuredHeight() / 2) + paddingTop) - (textView.getMeasuredHeight() / 2);
        int measuredHeight3 = textView.getMeasuredHeight() + measuredHeight2;
        int i5 = this.a;
        int measuredWidth3 = 0;
        if (i5 == 0) {
            imageView.setVisibility(0);
            paddingLeft = getPaddingLeft();
            measuredWidth3 = textView.getMeasuredWidth() + paddingLeft + (getPaddingStart() / 2);
            measuredWidth = measuredWidth3 + imageView.getMeasuredWidth();
            measuredWidth2 = measuredWidth3;
        } else if (i5 != 1) {
            imageView.setVisibility(8);
            paddingLeft = getPaddingLeft();
            measuredWidth2 = textView.getMeasuredWidth() + paddingLeft;
            measuredWidth = 0;
        } else {
            imageView.setVisibility(0);
            measuredWidth3 = getPaddingLeft();
            paddingLeft = imageView.getMeasuredWidth() + measuredWidth3 + (getPaddingStart() / 2);
            measuredWidth2 = paddingLeft + textView.getMeasuredWidth();
            measuredWidth = paddingLeft;
        }
        imageView.layout(measuredWidth3, paddingTop, measuredWidth, measuredHeight);
        textView.layout(paddingLeft, measuredHeight2, measuredWidth2, measuredHeight3);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) throws Resources.NotFoundException {
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.video_play_icon_size);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(dimensionPixelSize, 1073741824);
        View viewFindViewById = findViewById(R.id.icon);
        viewFindViewById.measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
        TextView textView = (TextView) findViewById(R.id.duration);
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        findViewById(R.id.icon).measure(i, i2);
        int measuredWidth = textView.getMeasuredWidth();
        if (this.a != 2) {
            measuredWidth = textView.getMeasuredWidth() + viewFindViewById.getMeasuredWidth() + (getPaddingStart() / 2);
        }
        setMeasuredDimension(measuredWidth + getPaddingLeft() + getPaddingRight(), viewFindViewById.getMeasuredHeight() + getPaddingBottom() + getPaddingTop());
    }

    /* compiled from: PG */
    public static class GetMediaDurationAction extends Action<Long> {
        public static final Parcelable.Creator<Action<Long>> CREATOR = new dalb();
        private final Context a;

        /* compiled from: PG */
        public interface a {
            dald df();
        }

        public GetMediaDurationAction(Context context, Uri uri) {
            super(elgm.GET_MEDIA_DURATION_ACTION);
            this.v.v("source_uri", uri.toString());
            this.a = context;
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
        public final eieu a() {
            return eiiy.k("VideoOverlayView.GetMediaDurationAction");
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
        public final /* bridge */ /* synthetic */ Object b() {
            return Long.valueOf(cqmz.b(this.a, Uri.parse(this.v.l("source_uri"))));
        }

        @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
        public final String c() {
            return "Bugle.DataModel.Action.GetMediaDurationAction.ExecuteAction.Latency";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            C(parcel, i);
        }

        public GetMediaDurationAction(Context context, Parcel parcel) {
            super(parcel, elgm.GET_MEDIA_DURATION_ACTION);
            this.a = context;
        }
    }
}
