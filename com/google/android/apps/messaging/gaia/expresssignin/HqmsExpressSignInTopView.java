package com.google.android.apps.messaging.gaia.expresssignin;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import defpackage.a;
import defpackage.acbu;
import defpackage.acbv;
import defpackage.accb;
import defpackage.au;
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
public final class HqmsExpressSignInTopView extends accb implements ehlg<acbu> {
    private acbu d;
    private Context e;

    @Deprecated
    public HqmsExpressSignInTopView(Context context) {
        super(context);
        d();
    }

    private final void d() {
        if (this.d == null) {
            try {
                this.d = ((acbv) bb()).v();
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
        return acbu.class;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        acbu acbuVar = this.d;
        if (acbuVar != null) {
            return acbuVar;
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
        d();
    }

    public HqmsExpressSignInTopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HqmsExpressSignInTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public HqmsExpressSignInTopView(ehmt ehmtVar) {
        super(ehmtVar);
        d();
    }
}
