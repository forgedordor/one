package com.google.android.apps.messaging.ui.conversation.message;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import defpackage.a;
import defpackage.cwkd;
import defpackage.cwke;
import defpackage.cwkg;
import defpackage.cwmo;
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

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ClickFixingEmojiAppCompatTextView extends cwmo implements ehlg<cwke> {
    public cwke a;
    private Context b;

    @Deprecated
    public ClickFixingEmojiAppCompatTextView(Context context) {
        super(context);
        c();
    }

    private final void c() {
        if (this.a == null) {
            try {
                cwkg cwkgVar = (cwkg) bb();
                cwkd cwkdVar = new cwkd(this);
                ehod.c(cwkdVar);
                try {
                    cwke cwkeVarQ = cwkgVar.Q();
                    this.a = cwkeVarQ;
                    if (cwkeVarQ == null) {
                        ehod.b(cwkdVar);
                    }
                    this.a.a = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof eyhx) && !(context instanceof eyhq.a) && !(context instanceof ehnz)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof ehnq)) {
                        throw new IllegalStateException(a.O(this));
                    }
                } catch (Throwable th) {
                    if (this.a == null) {
                        ehod.b(cwkdVar);
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
        return cwke.class;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        cwke cwkeVar = this.a;
        if (cwkeVar != null) {
            return cwkeVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.widget.TextView, android.view.View
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
        c();
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        c();
        return super.onTouchEvent(motionEvent);
    }

    public ClickFixingEmojiAppCompatTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClickFixingEmojiAppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ClickFixingEmojiAppCompatTextView(ehmt ehmtVar) {
        super(ehmtVar);
        c();
    }
}
