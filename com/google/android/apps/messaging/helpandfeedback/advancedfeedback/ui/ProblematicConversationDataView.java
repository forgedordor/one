package com.google.android.apps.messaging.helpandfeedback.advancedfeedback.ui;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import defpackage.a;
import defpackage.acna;
import defpackage.acnb;
import defpackage.acnl;
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
/* loaded from: classes2.dex */
public final class ProblematicConversationDataView extends acnl implements ehlg<acna> {
    private acna g;
    private Context h;

    @Deprecated
    public ProblematicConversationDataView(Context context) {
        super(context);
        i();
    }

    private final void i() {
        if (this.g == null) {
            try {
                this.g = ((acnb) bb()).x();
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
        return acna.class;
    }

    @Override // defpackage.ehlg
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final acna H() {
        acna acnaVar = this.g;
        if (acnaVar != null) {
            return acnaVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // com.google.android.material.card.MaterialCardView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ehoi.a(getContext())) {
            Context contextA = ehoh.a(this);
            Context context = this.h;
            if (context == null) {
                this.h = contextA;
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
        i();
    }

    public ProblematicConversationDataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ProblematicConversationDataView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ProblematicConversationDataView(ehmt ehmtVar) {
        super(ehmtVar);
        i();
    }
}
