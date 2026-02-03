package com.google.android.apps.messaging.ui.search.resultsview;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.util.AttributeSet;
import defpackage.a;
import defpackage.daey;
import defpackage.dagq;
import defpackage.dahb;
import defpackage.dahe;
import defpackage.dahg;
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
public final class ZeroStateSearchMultipleResultsView extends dagq implements ehlg<dahe> {
    public dahe a;
    private Context b;

    @Deprecated
    public ZeroStateSearchMultipleResultsView(Context context) {
        super(context);
        d();
    }

    private final void d() {
        if (this.a == null) {
            try {
                dahg dahgVar = (dahg) bb();
                dahb dahbVar = new dahb(this);
                ehod.c(dahbVar);
                try {
                    dahe daheVarZ = dahgVar.Z();
                    this.a = daheVarZ;
                    if (daheVarZ == null) {
                        ehod.b(dahbVar);
                    }
                    this.a.O = this;
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof eyhx) && !(context instanceof eyhq.a) && !(context instanceof ehnz)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof ehnq)) {
                        throw new IllegalStateException(a.O(this));
                    }
                } catch (Throwable th) {
                    if (this.a == null) {
                        ehod.b(dahbVar);
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
        return dahe.class;
    }

    @Override // defpackage.ehlg
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final dahe H() {
        dahe daheVar = this.a;
        if (daheVar != null) {
            return daheVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchConfigurationChanged(Configuration configuration) {
        super.dispatchConfigurationChanged(configuration);
        d();
        daey daeyVar = this.a.N;
        if (daeyVar != null) {
            daeyVar.a(configuration);
        }
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

    public ZeroStateSearchMultipleResultsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ZeroStateSearchMultipleResultsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ZeroStateSearchMultipleResultsView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public ZeroStateSearchMultipleResultsView(ehmt ehmtVar) {
        super(ehmtVar);
        d();
    }
}
