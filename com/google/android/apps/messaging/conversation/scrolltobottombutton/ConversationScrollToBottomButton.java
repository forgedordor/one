package com.google.android.apps.messaging.conversation.scrolltobottombutton;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import defpackage.a;
import defpackage.ehlg;
import defpackage.ehmt;
import defpackage.ehnq;
import defpackage.ehnz;
import defpackage.ehoh;
import defpackage.ehoi;
import defpackage.ejwl;
import defpackage.eyhq;
import defpackage.eyhx;
import defpackage.uph;
import defpackage.upi;
import defpackage.upl;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ConversationScrollToBottomButton extends upl implements ehlg<uph> {
    private uph a;
    private Context b;

    @Deprecated
    public ConversationScrollToBottomButton(Context context) {
        super(context);
        c();
    }

    private final void c() {
        if (this.a == null) {
            try {
                this.a = ((upi) bb()).l();
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
        return uph.class;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        uph uphVar = this.a;
        if (uphVar != null) {
            return uphVar;
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
        c();
    }

    public ConversationScrollToBottomButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationScrollToBottomButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ConversationScrollToBottomButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public ConversationScrollToBottomButton(ehmt ehmtVar) {
        super(ehmtVar);
        c();
    }
}
