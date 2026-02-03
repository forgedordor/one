package defpackage;

import android.speech.SpeechRecognizer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class swq implements fdap {
    public static final swq a = new swq();

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        SpeechRecognizer speechRecognizer = (SpeechRecognizer) obj;
        speechRecognizer.getClass();
        speechRecognizer.stopListening();
        return fctx.a;
    }
}
