package com.google.android.apps.messaging.ui.conversation.suggestions;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.conversation.suggestions.ConversationSuggestionsView;
import com.google.android.apps.messaging.ui.conversation.suggestions.tooltip.ConversationSuggestionsBugleTooltipView;
import defpackage.achu;
import defpackage.aijh;
import defpackage.bary;
import defpackage.cczi;
import defpackage.cpdw;
import defpackage.cqec;
import defpackage.cqei;
import defpackage.craz;
import defpackage.crbf;
import defpackage.cwpx;
import defpackage.cwqt;
import defpackage.dakl;
import defpackage.fcsu;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ConversationSuggestionsView extends cwqt {
    public aijh a;
    public achu b;
    public fcsu c;
    public cwpx d;
    public Optional e;
    private LinearLayout f;
    private HorizontalScrollView g;
    private cpdw h;
    private MessageIdType i;

    public ConversationSuggestionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private final void f(final craz crazVar) {
        ConversationSuggestionsBugleTooltipView conversationSuggestionsBugleTooltipView = (ConversationSuggestionsBugleTooltipView) this.h.b();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: cwqj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                craz crazVar2 = crazVar;
                ConversationSuggestionsView conversationSuggestionsView = this.a;
                if (crazVar2 == craz.c) {
                    aise aiseVar = (aise) conversationSuggestionsView.c.b();
                    eliw eliwVar = (eliw) eliz.a.createBuilder();
                    eliwVar.getClass();
                    elgp.c(2, eliwVar);
                    elgp.b(4, eliwVar);
                    elja eljaVar = (elja) eljb.a.createBuilder();
                    eljaVar.getClass();
                    evsn evsnVarBuild = eljaVar.build();
                    evsnVarBuild.getClass();
                    eliwVar.copyOnWrite();
                    eliz elizVar = (eliz) eliwVar.instance;
                    elizVar.j = (eljb) evsnVarBuild;
                    elizVar.b |= 128;
                    aiseVar.a(elgp.a(eliwVar));
                } else if (crazVar2 == craz.d) {
                    conversationSuggestionsView.e.ifPresent(new Consumer() { // from class: cwqr
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            ((clfb) obj).s(7);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                conversationSuggestionsView.b();
            }
        };
        View view = conversationSuggestionsBugleTooltipView.a;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.util.List r21, final defpackage.cwtb r22) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.ui.conversation.suggestions.ConversationSuggestionsView.a(java.util.List, cwtb):void");
    }

    public final void b() {
        this.d.m();
        final View viewB = this.h.b();
        long jA = cqei.a(viewB.getContext());
        ObjectAnimator duration = ObjectAnimator.ofFloat(viewB, "alpha", 0.0f).setDuration(jA);
        viewB.getClass();
        ValueAnimator duration2 = ValueAnimator.ofInt(viewB.getMeasuredHeight(), 0).setDuration(jA);
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cqea
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getClass();
                View view = viewB;
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                layoutParams.height = ((Integer) animatedValue).intValue();
                view.setLayoutParams(layoutParams);
            }
        });
        duration2.getClass();
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2);
        animatorSet.setInterpolator(cqei.b);
        animatorSet.addListener(new cqec(viewB));
        viewB.clearAnimation();
        animatorSet.start();
    }

    public final void c() {
        this.a.h(getContext());
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (((Boolean) ((cczi) crbf.ag.get()).e()).booleanValue()) {
            dakl.g(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        this.d.b = bary.a;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.f = (LinearLayout) findViewById(R.id.suggestion_list_container);
        cpdw cpdwVar = new cpdw(this, R.id.p2p_conversation_suggestions_tooltip_view_stub, R.id.p2p_conversation_suggestions_tooltip);
        this.h = cpdwVar;
        cpdwVar.f(R.layout.bugle_tooltip_view_gm3);
        this.g = (HorizontalScrollView) findViewById(R.id.suggestion_list_scroll_view);
    }
}
