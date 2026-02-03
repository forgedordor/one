package com.google.android.apps.messaging.conversation.reactions.ui.selection;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import defpackage.a;
import defpackage.ehlg;
import defpackage.ehmt;
import defpackage.ehnq;
import defpackage.ehnz;
import defpackage.ehoh;
import defpackage.ehoi;
import defpackage.ejwl;
import defpackage.eyhq;
import defpackage.eyhx;
import defpackage.unn;
import defpackage.uno;
import defpackage.unt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ReactionSelectionDialogRecyclerView extends unt implements ehlg<unn> {
    private unn ab;
    private Context ac;

    @Deprecated
    public ReactionSelectionDialogRecyclerView(Context context) {
        super(context);
        aP();
    }

    private final void aP() {
        if (this.ab == null) {
            try {
                this.ab = ((uno) bb()).j();
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
        return unn.class;
    }

    @Override // defpackage.ehlg
    public final /* bridge */ /* synthetic */ Object H() {
        unn unnVar = this.ab;
        if (unnVar != null) {
            return unnVar;
        }
        throw new IllegalStateException("peer() called before initialized.");
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
        aP();
    }

    public ReactionSelectionDialogRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ReactionSelectionDialogRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ReactionSelectionDialogRecyclerView(ehmt ehmtVar) {
        super(ehmtVar);
        aP();
    }
}
