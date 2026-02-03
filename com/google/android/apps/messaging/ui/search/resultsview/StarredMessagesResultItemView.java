package com.google.android.apps.messaging.ui.search.resultsview;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import defpackage.a;
import defpackage.au;
import defpackage.dagk;
import defpackage.dagl;
import defpackage.dagp;
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
public final class StarredMessagesResultItemView extends dagp implements ehlg<dagk> {
    private dagk d;
    private Context e;

    @Deprecated
    public StarredMessagesResultItemView(Context context) {
        super(context);
        e();
    }

    private final void e() {
        if (this.d == null) {
            try {
                this.d = ((dagl) bb()).Y();
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
        return dagk.class;
    }

    @Override // defpackage.ehlg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final dagk H() {
        dagk dagkVar = this.d;
        if (dagkVar != null) {
            return dagkVar;
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

    public StarredMessagesResultItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StarredMessagesResultItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public StarredMessagesResultItemView(ehmt ehmtVar) {
        super(ehmtVar);
        e();
    }
}
