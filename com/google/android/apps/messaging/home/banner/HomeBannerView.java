package com.google.android.apps.messaging.home.banner;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import defpackage.a;
import defpackage.acua;
import defpackage.acub;
import defpackage.acue;
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
public final class HomeBannerView extends acue implements ehlg<acua> {
    private acua g;
    private Context h;

    @Deprecated
    public HomeBannerView(Context context) {
        super(context);
        i();
    }

    private final void i() {
        if (this.g == null) {
            try {
                this.g = ((acub) bb()).B();
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
        return acua.class;
    }

    @Override // defpackage.ehlg
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final acua H() {
        acua acuaVar = this.g;
        if (acuaVar != null) {
            return acuaVar;
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

    public HomeBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HomeBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public HomeBannerView(ehmt ehmtVar) {
        super(ehmtVar);
        i();
    }
}
