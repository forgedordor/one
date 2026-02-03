package com.google.android.apps.messaging.welcome.v1.expresssignin;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import defpackage.a;
import defpackage.daww;
import defpackage.daxa;
import defpackage.daxb;
import defpackage.ehlg;
import defpackage.ehmt;
import defpackage.ehnq;
import defpackage.ehnz;
import defpackage.ehoh;
import defpackage.ehoi;
import defpackage.ejwl;
import defpackage.eyhq;
import defpackage.eyhx;
import defpackage.kte;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class WelcomeExpressSignInTopView extends daww implements ehlg<daxa> {
    private daxa i;
    private Context j;

    @Deprecated
    public WelcomeExpressSignInTopView(Context context) {
        super(context);
        g();
    }

    private final void g() {
        if (this.i == null) {
            try {
                this.i = ((daxb) bb()).ac();
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
        return daxa.class;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        daxa daxaVar = this.i;
        if (daxaVar != null) {
            return daxaVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new kte();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ehoi.a(getContext())) {
            Context contextA = ehoh.a(this);
            Context context = this.j;
            if (context == null) {
                this.j = contextA;
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
        g();
    }

    public WelcomeExpressSignInTopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public WelcomeExpressSignInTopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WelcomeExpressSignInTopView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public WelcomeExpressSignInTopView(ehmt ehmtVar) {
        super(ehmtVar);
        g();
    }
}
