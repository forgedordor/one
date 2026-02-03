package com.google.android.apps.messaging.ui.conversation.message;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import defpackage.cczv;
import defpackage.cdag;
import defpackage.cqca;
import defpackage.cvuk;
import defpackage.cwlw;
import defpackage.eygg;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationMessageMetadataView extends cwlw {
    public static final cczv a = cdag.p(155151230);
    public eygg b;
    public final MessageMetadataDetailsView c;
    public TextView d;
    public boolean e;
    public cvuk f;
    private int g;

    public ConversationMessageMetadataView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f = new cvuk() { // from class: cwkp
        };
        ((Optional) this.b.b()).ifPresent(new Consumer() { // from class: cwkq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cvul) obj).h(this.a.f);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        ((Optional) this.b.b()).ifPresent(new Consumer() { // from class: cwko
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cvul) obj).i(this.a.f);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (this.g != size && size > 0) {
            this.g = size;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            MessageMetadataDetailsView messageMetadataDetailsView = this.c;
            messageMetadataDetailsView.measure(iMakeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
            boolean z = this.e;
            messageMetadataDetailsView.clearAnimation();
            clearAnimation();
            if (this.g != 0) {
                int measuredHeight = z ? messageMetadataDetailsView.getMeasuredHeight() : 0;
                cqca.j("Bugle", "Update metadata height to %d", Integer.valueOf(measuredHeight));
                getLayoutParams().height = measuredHeight;
                requestLayout();
            }
        }
        super.onMeasure(i, i2);
    }

    public ConversationMessageMetadataView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = 0;
        this.e = true;
        MessageMetadataDetailsView messageMetadataDetailsView = (MessageMetadataDetailsView) View.inflate(context, R.layout.conversation_message_meta_view, this).findViewById(R.id.message_details);
        this.c = messageMetadataDetailsView;
    }
}
