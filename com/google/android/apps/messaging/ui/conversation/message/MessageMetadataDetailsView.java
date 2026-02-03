package com.google.android.apps.messaging.ui.conversation.message;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.cdag;
import defpackage.cssf;
import defpackage.cssx;
import defpackage.cwma;
import defpackage.cwmk;
import defpackage.cwml;
import defpackage.dajd;
import defpackage.fcsu;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MessageMetadataDetailsView extends cwma {
    public cssf a;
    public dajd b;
    public fcsu c;
    public final TextView d;
    public final TextView e;
    public final ImageView f;
    public final TextView g;
    public boolean h;
    private final cwml i;

    @Deprecated
    private final ImageView j;
    private final ImageView k;

    static {
        cdag.q(159443725, "add_status_for_missing_attachments");
        cdag.v("remove_text_via_from_sim_name");
    }

    public MessageMetadataDetailsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static final boolean c() {
        if (((Boolean) cssx.a.e()).booleanValue()) {
            throw null;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) throws Resources.NotFoundException {
        boolean zE = this.a.e();
        boolean z2 = this.h;
        int paddingLeft = getPaddingLeft();
        int paddingBottom = getPaddingBottom();
        int paddingTop = getPaddingTop();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.sim_label_padding_end);
        cwml cwmlVar = this.i;
        cwmlVar.c = zE;
        cwmlVar.d = z2;
        cwmlVar.e = i3 - i;
        cwmlVar.j = paddingLeft;
        cwmlVar.l = paddingBottom;
        cwmlVar.k = paddingTop;
        cwmlVar.f = paddingLeft;
        cwmlVar.g = paddingTop;
        cwmlVar.h = 0;
        cwmlVar.i = 0;
        cwmlVar.m = dimensionPixelSize;
        if (zE) {
            cwmlVar.c();
            if (cwmlVar.i == 0) {
                cwmlVar.i = cwmlVar.a.getBaseline();
            }
            cwmlVar.b();
            cwmlVar.d();
            cwmlVar.a();
            cwmlVar.e();
        } else {
            cwmlVar.e();
            cwmlVar.a();
            cwmlVar.d();
            cwmlVar.b();
            cwmlVar.c();
        }
        TextView textView = cwmlVar.b;
        if (textView.getVisibility() != 8) {
            int measuredWidth = textView.getMeasuredWidth();
            int measuredHeight = textView.getMeasuredHeight();
            if (cwmlVar.c) {
                cwmlVar.h = Math.max(cwmlVar.h, cwmlVar.a.getMeasuredHeight());
            }
            int i5 = cwmlVar.j;
            cwmlVar.f = i5;
            int i6 = cwmlVar.g + cwmlVar.h;
            cwmlVar.g = i6;
            textView.layout(i5, i6, measuredWidth + i5, measuredHeight + i6);
        }
        this.h = cwmlVar.d;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredWidth2;
        int measuredWidth3;
        int measuredWidth4;
        int iA;
        int iA2;
        int iMax;
        int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
        int measuredWidth5 = 0;
        int iMakeMeasureSpec = View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE ? View.MeasureSpec.makeMeasureSpec((View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom(), Integer.MIN_VALUE) : View.MeasureSpec.makeMeasureSpec(0, 0);
        ImageView imageView = this.j;
        if (imageView.getVisibility() != 8) {
            imageView.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), iMakeMeasureSpec);
            measuredWidth = imageView.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        ImageView imageView2 = this.k;
        if (imageView2.getVisibility() != 8) {
            imageView2.measure(View.MeasureSpec.makeMeasureSpec(size - measuredWidth, Integer.MIN_VALUE), iMakeMeasureSpec);
            measuredWidth2 = imageView2.getMeasuredWidth();
        } else {
            measuredWidth2 = 0;
        }
        ImageView imageView3 = this.f;
        if (imageView3.getVisibility() != 8) {
            imageView3.measure(View.MeasureSpec.makeMeasureSpec((size - measuredWidth) - measuredWidth2, Integer.MIN_VALUE), iMakeMeasureSpec);
            measuredWidth3 = imageView3.getMeasuredWidth();
        } else {
            measuredWidth3 = 0;
        }
        TextView textView = this.e;
        if (textView.getVisibility() != 8) {
            iA = cwmk.a(textView, View.MeasureSpec.makeMeasureSpec(((size - measuredWidth) - measuredWidth2) - measuredWidth3, Integer.MIN_VALUE), iMakeMeasureSpec);
            measuredWidth4 = textView.getMeasuredWidth();
        } else {
            measuredWidth4 = 0;
            iA = 0;
        }
        TextView textView2 = this.d;
        if (textView2.getVisibility() != 8) {
            iA2 = cwmk.a(textView2, View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), iMakeMeasureSpec);
            measuredWidth5 = textView2.getMeasuredWidth();
        } else {
            iA2 = 0;
        }
        int i3 = measuredWidth4 + measuredWidth;
        int iMax2 = i3 + measuredWidth5 + measuredWidth3 + measuredWidth2;
        if (iMax2 > size || this.h) {
            iMax2 = Math.max(i3 + measuredWidth3 + measuredWidth2, measuredWidth5);
            iMax = iA + iA2;
            textView2.setText(textView2.getText().toString().replaceFirst(getResources().getString(R.string.message_metadata_separator), ""));
            this.h = true;
        } else {
            iMax = Math.max(Math.max(Math.max(iA, iA2), imageView.getMeasuredHeight()), imageView.getMeasuredHeight());
        }
        TextView textView3 = this.g;
        if (textView3.getVisibility() != 8) {
            int iA3 = cwmk.a(textView3, View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), iMakeMeasureSpec);
            iMax2 = Math.max(iMax2, textView3.getMeasuredWidth());
            iMax = Math.max(iMax, iA3 + iMax);
        }
        setMeasuredDimension(iMax2, iMax);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c();
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean performClick() {
        c();
        return super.performClick();
    }

    public MessageMetadataDetailsView(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = false;
        MessageMetadataDetailsView messageMetadataDetailsView = (MessageMetadataDetailsView) View.inflate(context, R.layout.conversation_message_meta_detail_view, this);
        TextView textView = (TextView) messageMetadataDetailsView.findViewById(R.id.sim_name);
        this.d = textView;
        ImageView imageView = (ImageView) messageMetadataDetailsView.findViewById(R.id.dots_animation);
        this.j = imageView;
        TextView textView2 = (TextView) messageMetadataDetailsView.findViewById(R.id.message_status);
        this.e = textView2;
        ImageView imageView2 = (ImageView) messageMetadataDetailsView.findViewById(R.id.message_lock_icon);
        this.f = imageView2;
        TextView textView3 = (TextView) messageMetadataDetailsView.findViewById(R.id.link_settings);
        this.g = textView3;
        ImageView imageView3 = (ImageView) messageMetadataDetailsView.findViewById(R.id.status_icon);
        this.k = imageView3;
        imageView3.getClass();
        textView3.setOnClickListener(new View.OnClickListener() { // from class: cwmj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws IOException {
                fcsu fcsuVar = this.a.c;
                fcsuVar.getClass();
                aijh aijhVar = (aijh) fcsuVar.b();
                Context context2 = context;
                eiid.o(context2, aijhVar.n(context2));
            }
        });
        this.i = new cwml(textView, imageView, textView2, imageView2, textView3, imageView3);
    }
}
