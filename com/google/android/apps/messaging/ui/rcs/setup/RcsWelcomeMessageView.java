package com.google.android.apps.messaging.ui.rcs.setup;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.a;
import defpackage.czrx;
import defpackage.czry;
import defpackage.czsb;
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
public final class RcsWelcomeMessageView extends czsb implements ehlg<czrx> {
    private czrx a;
    private Context b;

    @Deprecated
    public RcsWelcomeMessageView(Context context) {
        super(context);
        d();
    }

    private final void d() {
        if (this.a == null) {
            try {
                this.a = ((czry) bb()).U();
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
        return czrx.class;
    }

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final czrx H() {
        czrx czrxVar = this.a;
        if (czrxVar != null) {
            return czrxVar;
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
        d();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        d();
        return true;
    }

    public RcsWelcomeMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RcsWelcomeMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public RcsWelcomeMessageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public RcsWelcomeMessageView(ehmt ehmtVar) {
        super(ehmtVar);
        d();
    }
}
