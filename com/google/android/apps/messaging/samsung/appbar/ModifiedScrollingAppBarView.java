package com.google.android.apps.messaging.samsung.appbar;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.a;
import defpackage.aidz;
import defpackage.aiea;
import defpackage.aief;
import defpackage.eecu;
import defpackage.ehlg;
import defpackage.ehmt;
import defpackage.ehnq;
import defpackage.ehnz;
import defpackage.ehoh;
import defpackage.ehoi;
import defpackage.ejwl;
import defpackage.eyhq;
import defpackage.eyhx;
import defpackage.kty;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ModifiedScrollingAppBarView extends aief implements ehlg<aidz> {
    private aidz k;
    private Context l;

    @Deprecated
    public ModifiedScrollingAppBarView(Context context) {
        super(context);
        s();
    }

    private final void s() {
        if (this.k == null) {
            try {
                this.k = ((aiea) bb()).J();
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
        return aidz.class;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        aidz aidzVar = this.k;
        if (aidzVar != null) {
            return aidzVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // com.google.android.material.appbar.AppBarLayout, defpackage.ktx
    public final kty a() {
        super.a();
        s();
        Context context = this.k.a.getContext();
        context.getClass();
        return new ModifiedScrollingBehavior(context);
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new eecu();
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return q(layoutParams);
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (ehoi.a(getContext())) {
            Context contextA = ehoh.a(this);
            Context context = this.l;
            if (context == null) {
                this.l = contextA;
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
        s();
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.ViewGroup
    protected final /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new eecu();
    }

    @Override // com.google.android.material.appbar.AppBarLayout, android.widget.LinearLayout, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return q(layoutParams);
    }

    public ModifiedScrollingAppBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ModifiedScrollingAppBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ModifiedScrollingAppBarView(ehmt ehmtVar) {
        super(ehmtVar);
        s();
    }
}
