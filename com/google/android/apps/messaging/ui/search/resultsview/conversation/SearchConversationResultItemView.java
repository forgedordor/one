package com.google.android.apps.messaging.ui.search.resultsview.conversation;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import defpackage.a;
import defpackage.au;
import defpackage.dahr;
import defpackage.dahs;
import defpackage.daic;
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
public final class SearchConversationResultItemView extends daic implements ehlg<dahr> {
    private dahr d;
    private Context e;

    @Deprecated
    public SearchConversationResultItemView(Context context) {
        super(context);
        e();
    }

    private final void e() {
        if (this.d == null) {
            try {
                this.d = ((dahs) bb()).ab();
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
        return dahr.class;
    }

    @Override // defpackage.ehlg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dahr H() {
        dahr dahrVar = this.d;
        if (dahrVar != null) {
            return dahrVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.support.constraint.ConstraintLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new au(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ehoi.a(getContext())) {
            Context contextA = ehoh.a(this);
            Context context = this.e;
            if (context == null) {
                this.e = contextA;
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

    public SearchConversationResultItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SearchConversationResultItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SearchConversationResultItemView(ehmt ehmtVar) {
        super(ehmtVar);
        e();
    }
}
