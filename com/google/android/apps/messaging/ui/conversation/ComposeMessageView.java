package com.google.android.apps.messaging.ui.conversation;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import defpackage.a;
import defpackage.au;
import defpackage.cvli;
import defpackage.cvlk;
import defpackage.cvmj;
import defpackage.cvml;
import defpackage.cvmm;
import defpackage.cvmo;
import defpackage.cvnt;
import defpackage.cvuk;
import defpackage.ehlg;
import defpackage.ehmt;
import defpackage.ehnq;
import defpackage.ehnz;
import defpackage.ehod;
import defpackage.ehoh;
import defpackage.ehoi;
import defpackage.einc;
import defpackage.einf;
import defpackage.ejwl;
import defpackage.eygm;
import defpackage.eyhq;
import defpackage.eyhx;
import defpackage.uhp;
import defpackage.uhq;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ComposeMessageView extends cvnt implements ehlg<cvlk> {
    public cvlk d;
    private Context e;

    @Deprecated
    public ComposeMessageView(Context context) {
        super(context);
        f();
    }

    private final cvlk e() {
        f();
        return this.d;
    }

    /* JADX WARN: Finally extract failed */
    private final void f() {
        if (this.d == null) {
            try {
                cvmo cvmoVar = (cvmo) bb();
                cvli cvliVar = new cvli(this);
                ehod.c(cvliVar);
                try {
                    cvlk cvlkVarP = cvmoVar.P();
                    this.d = cvlkVarP;
                    if (cvlkVarP == null) {
                        ehod.b(cvliVar);
                    }
                    this.d.a = this;
                    ((einc.c) eygm.a(this, einc.c.class)).ad().b = this;
                    cvlk cvlkVar = this.d;
                    einf.d(this, uhp.class, new cvml(cvlkVar));
                    einf.d(this, uhq.class, new cvmm(cvlkVar));
                    Context context = getContext();
                    while ((context instanceof ContextWrapper) && !(context instanceof eyhx) && !(context instanceof eyhq.a) && !(context instanceof ehnz)) {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    if (!(context instanceof ehnq)) {
                        throw new IllegalStateException(a.O(this));
                    }
                } catch (Throwable th) {
                    if (this.d == null) {
                        ehod.b(cvliVar);
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
        return cvlk.class;
    }

    @Override // defpackage.ehlg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final cvlk H() {
        cvlk cvlkVar = this.d;
        if (cvlkVar != null) {
            return cvlkVar;
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
            } else {
                boolean z = true;
                if (context != contextA && !ehoh.b(context)) {
                    z = false;
                }
                ejwl.m(z, "onAttach called multiple times with different parent Contexts");
            }
        }
        final cvmj cvmjVar = e().c;
        cvmjVar.ad = new cvuk() { // from class: cvlv
        };
        ((Optional) cvmjVar.U.b()).ifPresent(new Consumer() { // from class: cvlw
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cvul) obj).h(cvmjVar.ad);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        cvmjVar.p();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        cvlk cvlkVarE = e();
        final cvmj cvmjVar = cvlkVarE.c;
        ((Optional) cvmjVar.U.b()).ifPresent(new Consumer() { // from class: cvlm
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((cvul) obj).i(cvmjVar.ad);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        f();
    }

    public ComposeMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ComposeMessageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ComposeMessageView(ehmt ehmtVar) {
        super(ehmtVar);
        f();
    }
}
