package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.scrolltobottombutton.ConversationScrollToBottomButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upg extends fdcy {
    final /* synthetic */ uph a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upg(Object obj, uph uphVar) {
        super(obj);
        this.a = uphVar;
    }

    @Override // defpackage.fdcy
    protected final void a(fdeh fdehVar, Object obj, Object obj2) {
        upe upeVar = (upe) obj2;
        upe upeVar2 = (upe) obj;
        final uph uphVar = this.a;
        uphVar.c();
        if (uphVar.b.isShown()) {
            if ((upeVar2 instanceof upc) && (upeVar instanceof upc)) {
                uphVar.d.setText(uphVar.b((upc) upeVar));
                uphVar.d();
                return;
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setDuration(150L);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: uoy
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    valueAnimator.getClass();
                    uphVar.b.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
                }
            });
            valueAnimatorOfFloat.addListener(new upb(uphVar, new fdae() { // from class: uoz
                @Override // defpackage.fdae
                public final Object invoke() {
                    ConversationScrollToBottomButton conversationScrollToBottomButton = uphVar.b;
                    conversationScrollToBottomButton.setAlpha(1.0f);
                    conversationScrollToBottomButton.setVisibility(0);
                    return fctx.a;
                }
            }, new fdae() { // from class: upa
                @Override // defpackage.fdae
                public final Object invoke() {
                    ConversationScrollToBottomButton conversationScrollToBottomButton = uphVar.b;
                    conversationScrollToBottomButton.setAlpha(0.0f);
                    conversationScrollToBottomButton.setVisibility(8);
                    return fctx.a;
                }
            }));
            valueAnimatorOfFloat.getClass();
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat2.setDuration(150L);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: uor
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    valueAnimator.getClass();
                    uphVar.b.setAlpha(valueAnimator.getAnimatedFraction());
                }
            });
            valueAnimatorOfFloat2.addListener(new upb(uphVar, new fdae() { // from class: uos
                @Override // defpackage.fdae
                public final Object invoke() {
                    String strB;
                    int iIntValue;
                    int dimension;
                    uph uphVar2 = uphVar;
                    ConversationScrollToBottomButton conversationScrollToBottomButton = uphVar2.b;
                    conversationScrollToBottomButton.setAlpha(0.0f);
                    int dimension2 = 0;
                    conversationScrollToBottomButton.setVisibility(0);
                    upe upeVarA = uphVar2.a();
                    int i = true != fdbq.f(upeVarA, upd.a) ? 0 : 8;
                    TextView textView = uphVar2.d;
                    textView.setVisibility(i);
                    if (upeVarA instanceof upd) {
                        strB = null;
                    } else {
                        if (!(upeVarA instanceof upc)) {
                            throw new fctg();
                        }
                        strB = uphVar2.b((upc) upeVarA);
                    }
                    textView.setText(strB);
                    ViewGroup viewGroup = uphVar2.c;
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    upe upeVarA2 = uphVar2.a();
                    if (upeVarA2 instanceof upd) {
                        iIntValue = ((Number) uphVar2.e.a()).intValue();
                    } else {
                        if (!(upeVarA2 instanceof upc)) {
                            throw new fctg();
                        }
                        iIntValue = -2;
                    }
                    layoutParams.width = iIntValue;
                    Resources resources = conversationScrollToBottomButton.getResources();
                    uphVar2.a().a();
                    layoutParams.height = resources.getDimensionPixelSize(R.dimen.conversation_scroll_to_bottom_button_background_height_in_text_mode_none);
                    int iMax = Math.max(0, (((Number) uphVar2.f.a()).intValue() - layoutParams.width) / 2);
                    int iMax2 = Math.max(0, (((Number) uphVar2.g.a()).intValue() - layoutParams.height) / 2);
                    conversationScrollToBottomButton.setPadding(iMax, iMax2, iMax, iMax2);
                    viewGroup.setLayoutParams(layoutParams);
                    upe upeVarA3 = uphVar2.a();
                    if (upeVarA3 instanceof upd) {
                        dimension = 0;
                    } else {
                        if (!(upeVarA3 instanceof upc)) {
                            throw new fctg();
                        }
                        dimension = (int) conversationScrollToBottomButton.getContext().getResources().getDimension(R.dimen.conversation_scroll_to_bottom_button_start_padding);
                    }
                    upe upeVarA4 = uphVar2.a();
                    if (!(upeVarA4 instanceof upd)) {
                        if (!(upeVarA4 instanceof upc)) {
                            throw new fctg();
                        }
                        dimension2 = (int) conversationScrollToBottomButton.getContext().getResources().getDimension(R.dimen.conversation_scroll_to_bottom_button_end_padding);
                    }
                    viewGroup.setPadding(dimension, viewGroup.getPaddingTop(), dimension2, viewGroup.getPaddingBottom());
                    uphVar2.d();
                    return fctx.a;
                }
            }, new fdae() { // from class: uot
                @Override // defpackage.fdae
                public final Object invoke() {
                    uphVar.b.setAlpha(1.0f);
                    return fctx.a;
                }
            }));
            valueAnimatorOfFloat2.getClass();
            animatorSet.playSequentially(valueAnimatorOfFloat, valueAnimatorOfFloat2);
            animatorSet.start();
        }
    }

    @Override // defpackage.fdcy
    protected final boolean b(Object obj, Object obj2) {
        return !fdbq.f(obj, obj2);
    }
}
