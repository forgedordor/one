package com.google.android.apps.messaging.ui.debug;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import defpackage.a;
import defpackage.cxbs;
import defpackage.cxbt;
import defpackage.cxun;
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
public final class DebugPrefsItemView extends cxun implements ehlg<cxbs> {
    private cxbs a;
    private Context b;

    @Deprecated
    public DebugPrefsItemView(Context context) {
        super(context);
        d();
    }

    private final void d() {
        if (this.a == null) {
            try {
                this.a = ((cxbt) bb()).S();
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
        return cxbs.class;
    }

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cxbs H() {
        cxbs cxbsVar = this.a;
        if (cxbsVar != null) {
            return cxbsVar;
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

    public DebugPrefsItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DebugPrefsItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public DebugPrefsItemView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public DebugPrefsItemView(ehmt ehmtVar) {
        super(ehmtVar);
        d();
    }
}
