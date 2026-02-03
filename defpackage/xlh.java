package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class xlh extends fdbo implements fdap {
    public xlh(Object obj) {
        super(1, obj, xlm.class, "onSwipeUp", "onSwipeUp(Landroid/content/Context;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        xlm xlmVar = (xlm) this.g;
        ekrw ekrwVarE = xlm.a.e();
        ekrwVarE.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceInputUiAdapter", "onSwipeUp", 191, "VoiceInputUiAdapter.kt")).q("Voice input swipe up");
        xmd xmdVar = (xmd) xlmVar.d.b();
        if (!xmdVar.h()) {
            xmdVar.k = 4;
            auvw.k(xlmVar.b, xlmVar.c, null, new xll(xlmVar, context, null), 2);
            xmdVar.g();
        }
        return fctx.a;
    }
}
