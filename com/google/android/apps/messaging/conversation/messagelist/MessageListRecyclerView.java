package com.google.android.apps.messaging.conversation.messagelist;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import defpackage.a;
import defpackage.ehlg;
import defpackage.ehmt;
import defpackage.ehnq;
import defpackage.ehnz;
import defpackage.ehod;
import defpackage.ehoh;
import defpackage.ehoi;
import defpackage.ejwl;
import defpackage.eyhq;
import defpackage.eyhx;
import defpackage.ulo;
import defpackage.ulp;
import defpackage.ulr;
import defpackage.ulw;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class MessageListRecyclerView extends ulw implements ehlg<ulp> {
    public ulp ab;
    private Context ac;

    @Deprecated
    public MessageListRecyclerView(Context context) {
        super(context);
        aP();
    }

    private final void aP() {
        if (this.ab == null) {
            try {
                ulr ulrVar = (ulr) bb();
                ulo uloVar = new ulo(this);
                ehod.c(uloVar);
                try {
                    ulp ulpVarH = ulrVar.h();
                    this.ab = ulpVarH;
                    if (ulpVarH == null) {
                        ehod.b(uloVar);
                    }
                    this.ab.b = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof eyhx) && !(context instanceof eyhq.a) && !(context instanceof ehnz)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof ehnq)) {
                        throw new IllegalStateException(a.O(this));
                    }
                } catch (Throwable th) {
                    if (this.ab == null) {
                        ehod.b(uloVar);
                    }
                    throw th;
                }
            } catch (ClassCastException e) {
                throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
            }
        }
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return ulp.class;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        ulp ulpVar = this.ab;
        if (ulpVar != null) {
            return ulpVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ehoi.a(getContext())) {
            Context contextA = ehoh.a(this);
            Context context = this.ac;
            if (context == null) {
                this.ac = contextA;
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
        aP();
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        aP();
        ulp ulpVar = this.ab;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        ScaleGestureDetector scaleGestureDetector = ulpVar.a;
        return zOnTouchEvent;
    }

    public MessageListRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageListRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MessageListRecyclerView(ehmt ehmtVar) {
        super(ehmtVar);
        aP();
    }
}
