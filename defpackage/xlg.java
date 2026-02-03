package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class xlg extends fdbo implements fdap {
    public xlg(Object obj) {
        super(1, obj, xlm.class, "onSwipeToCancelRecording", "onSwipeToCancelRecording(Landroid/content/Context;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        xlm xlmVar = (xlm) this.g;
        ekrw ekrwVarE = xlm.a.e();
        ekrwVarE.X(eksq.a, "BugleComposeRow2");
        ((ekrd) ekrwVarE.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/voice/VoiceInputUiAdapter", "onSwipeToCancelRecording", 167, "VoiceInputUiAdapter.kt")).q("Voice input swipe to cancel");
        xlmVar.b(context, R.string.audio_recorder_recording_cancelled_text);
        dqfy.a(xlmVar.a(), false, false, null, 6);
        return fctx.a;
    }
}
