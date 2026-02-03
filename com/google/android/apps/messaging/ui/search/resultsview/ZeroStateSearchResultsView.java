package com.google.android.apps.messaging.ui.search.resultsview;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.util.AttributeSet;
import defpackage.a;
import defpackage.daey;
import defpackage.dagr;
import defpackage.dahj;
import defpackage.dahm;
import defpackage.daho;
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
public final class ZeroStateSearchResultsView extends dagr implements ehlg<dahm> {
    public dahm ab;
    private Context ac;

    @Deprecated
    public ZeroStateSearchResultsView(Context context) {
        super(context);
        aQ();
    }

    private final void aQ() {
        if (this.ab == null) {
            try {
                daho dahoVar = (daho) bb();
                dahj dahjVar = new dahj(this);
                ehod.c(dahjVar);
                try {
                    dahm dahmVarAa = dahoVar.aa();
                    this.ab = dahmVarAa;
                    if (dahmVarAa == null) {
                        ehod.b(dahjVar);
                    }
                    this.ab.z = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof eyhx) && !(context instanceof eyhq.a) && !(context instanceof ehnz)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof ehnq)) {
                        throw new IllegalStateException(a.O(this));
                    }
                } catch (Throwable th) {
                    if (this.ab == null) {
                        ehod.b(dahjVar);
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
        return dahm.class;
    }

    @Override // defpackage.ehlg
    /* renamed from: aP, reason: merged with bridge method [inline-methods] */
    public final dahm H() {
        dahm dahmVar = this.ab;
        if (dahmVar != null) {
            return dahmVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchConfigurationChanged(Configuration configuration) {
        super.dispatchConfigurationChanged(configuration);
        aQ();
        daey daeyVar = this.ab.o;
        if (daeyVar != null) {
            daeyVar.a(configuration);
        }
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
        aQ();
    }

    public ZeroStateSearchResultsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ZeroStateSearchResultsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ZeroStateSearchResultsView(ehmt ehmtVar) {
        super(ehmtVar);
        aQ();
    }
}
