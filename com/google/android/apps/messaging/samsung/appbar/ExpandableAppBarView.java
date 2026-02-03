package com.google.android.apps.messaging.samsung.appbar;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.a;
import defpackage.aidv;
import defpackage.aidw;
import defpackage.aied;
import defpackage.aiee;
import defpackage.eeda;
import defpackage.ehlg;
import defpackage.ehmt;
import defpackage.ehnq;
import defpackage.ehnz;
import defpackage.ehoh;
import defpackage.ehoi;
import defpackage.einr;
import defpackage.ejwl;
import defpackage.eyhq;
import defpackage.eyhx;
import defpackage.fdbq;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ExpandableAppBarView extends aiee implements ehlg, einr {
    private aidv g;
    private final TypedArray h;
    private Context i;

    @Deprecated
    public ExpandableAppBarView(Context context) {
        super(context);
        this.h = null;
        l();
    }

    private final aidv k() {
        l();
        return this.g;
    }

    private final void l() {
        if (this.g == null) {
            try {
                this.g = ((aidw) bb()).I();
                TypedArray typedArray = this.h;
                if (typedArray != null) {
                    typedArray.recycle();
                }
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
        return aidv.class;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        aidv aidvVar = this.g;
        if (aidvVar != null) {
            return aidvVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
    }

    @Override // defpackage.einr
    public final TypedArray a() {
        return this.h;
    }

    @Override // defpackage.eedc, android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new eeda();
    }

    @Override // defpackage.eedc, android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new eeda(layoutParams);
    }

    @Override // defpackage.eedc, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        View viewFindViewById;
        super.onAttachedToWindow();
        if (ehoi.a(getContext())) {
            Context contextA = ehoh.a(this);
            Context context = this.i;
            if (context == null) {
                this.i = contextA;
            } else {
                ejwl.m(context == contextA || ehoh.b(context), "onAttach called multiple times with different parent Contexts");
            }
        }
        aidv aidvVarK = k();
        ExpandableAppBarView expandableAppBarView = aidvVarK.b;
        ViewParent parent = expandableAppBarView.getParent();
        View view = null;
        aidvVarK.d = parent instanceof AppBarLayout ? (AppBarLayout) parent : null;
        int i = aidvVarK.e;
        if (i != -1 && (viewFindViewById = expandableAppBarView.findViewById(i)) != null) {
            while (true) {
                Object parent2 = viewFindViewById.getParent();
                if (parent2 != null && (parent2 instanceof View)) {
                    if (fdbq.f(parent2, expandableAppBarView)) {
                        view = viewFindViewById;
                        break;
                    }
                    viewFindViewById = (View) parent2;
                } else {
                    break;
                }
            }
        }
        aidvVarK.f = view;
        aidvVarK.c = expandableAppBarView.getLayoutParams().height == -2;
        aidvVarK.a();
    }

    @Override // defpackage.eedc, android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aidv aidvVarK = k();
        configuration.getClass();
        aidvVarK.a();
    }

    @Override // defpackage.eedc, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        aidv aidvVarK = k();
        if (aidvVarK.c) {
            aidvVarK.b.getLayoutParams().height = -2;
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        l();
    }

    @Override // defpackage.eedc, android.widget.FrameLayout, android.view.ViewGroup
    protected final /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new eeda();
    }

    public ExpandableAppBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = context.obtainStyledAttributes(attributeSet, aied.a);
    }

    public ExpandableAppBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = context.obtainStyledAttributes(attributeSet, aied.a, i, 0);
    }

    public ExpandableAppBarView(ehmt ehmtVar) {
        super(ehmtVar);
        this.h = null;
        l();
    }
}
