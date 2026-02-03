package defpackage;

import com.google.research.xeno.effect.Callbacks$StatusCallback;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlzb implements Callbacks$StatusCallback {
    final /* synthetic */ dlzc a;
    final /* synthetic */ fdis b;

    public dlzb(dlzc dlzcVar, fdis fdisVar) {
        this.a = dlzcVar;
        this.b = fdisVar;
    }

    @Override // com.google.research.xeno.effect.NativeCallbacks$StatusCallback
    public final void onCompletion(boolean z, String str) {
        if (z) {
            ekrw ekrwVarH = dlzc.a.h();
            ekrwVarH.X(eksq.a, "HugoAudio");
            ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/libraries/compose/audio/processor/XenoAudioProcessor$stopProcessingInternal$2$1", "onCompletion", 159, "XenoAudioProcessor.kt");
            dlzc dlzcVar = this.a;
            ekrdVar.u("Successfully stopped audio processing. Received %d bytes. Produced %d bytes.", dlzcVar.j, dlzcVar.k);
        } else {
            ekrw ekrwVarJ = dlzc.a.j();
            ekrwVarJ.X(eksq.a, "HugoAudio");
            ((ekrd) ((ekrd) ekrwVarJ).g(new IllegalStateException(str)).h("com/google/android/libraries/compose/audio/processor/XenoAudioProcessor$stopProcessingInternal$2$1", "onCompletion", 165, "XenoAudioProcessor.kt")).o();
        }
        this.b.w(fctx.a);
    }
}
