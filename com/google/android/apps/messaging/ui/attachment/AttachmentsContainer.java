package com.google.android.apps.messaging.ui.attachment;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import defpackage.a;
import defpackage.cvhs;
import defpackage.cvht;
import defpackage.cvig;
import defpackage.ehlg;
import defpackage.ehmt;
import defpackage.ehnq;
import defpackage.ehnz;
import defpackage.ehoh;
import defpackage.ehoi;
import defpackage.ejwl;
import defpackage.eyhq;
import defpackage.eyhx;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AttachmentsContainer extends cvig implements ehlg<cvhs> {
    private cvhs a;
    private Context b;

    @Deprecated
    public AttachmentsContainer(Context context) {
        super(context);
        e();
    }

    private final cvhs d() {
        e();
        return this.a;
    }

    private final void e() {
        if (this.a == null) {
            try {
                this.a = ((cvht) bb()).M();
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
        return cvhs.class;
    }

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cvhs H() {
        cvhs cvhsVar = this.a;
        if (cvhsVar != null) {
            return cvhsVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ehoi.a(getContext())) {
            Context contextA = ehoh.a(this);
            Context context = this.b;
            if (context == null) {
                this.b = contextA;
                return;
            }
            boolean z = true;
            if (context != contextA && !ehoh.b(context)) {
                z = false;
            }
            ejwl.m(z, "onAttach called multiple times with different parent Contexts");
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        cvhs cvhsVarD = d();
        AttachmentsContainer attachmentsContainer = cvhsVarD.i;
        int measuredWidth = attachmentsContainer.getMeasuredWidth();
        int i3 = cvhsVarD.l;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 != 1) {
            if (i4 == 2) {
                attachmentsContainer.setMeasuredDimension(measuredWidth, cvhsVarD.c);
                return;
            } else if (i4 != 3) {
                if (i4 != 4) {
                    return;
                }
                attachmentsContainer.setMeasuredDimension(measuredWidth, 0);
                return;
            }
        }
        attachmentsContainer.setMeasuredDimension(measuredWidth, cvhsVarD.d);
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        d();
        throw null;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        final cvhs cvhsVarD = d();
        int i5 = cvhsVarD.l;
        if (i5 == 4 || i5 == 5) {
            return;
        }
        cvhsVarD.a.post(new Runnable() { // from class: cvhn
            @Override // java.lang.Runnable
            public final void run() {
                cvhsVarD.i.getScrollX();
                throw null;
            }
        });
    }

    public AttachmentsContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AttachmentsContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AttachmentsContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public AttachmentsContainer(ehmt ehmtVar) {
        super(ehmtVar);
        e();
    }
}
