package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.speech.RecognitionListener;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class swo implements RecognitionListener {
    public final Context a;
    private final fdow b;
    private final fctc c = fctd.a(new fdae() { // from class: swn
        @Override // defpackage.fdae
        public final Object invoke() {
            cczi ccziVar = stt.a;
            return Boolean.valueOf(stt.a(this.a.a));
        }
    });

    public swo(Context context, fdow fdowVar) {
        this.a = context;
        this.b = fdowVar;
    }

    private final boolean a() {
        return ((Boolean) this.c.a()).booleanValue();
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSegmentedSession() {
        this.b.e(null);
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i) {
        if (i == 7) {
            this.b.e(null);
        } else {
            this.b.e(new swj(a.e(i, "SODA error ", " occurred"), i));
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i, Bundle bundle) {
        bundle.getClass();
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
        bundle.getClass();
        if (!(a() && bundle.getBoolean("final_result")) && bundle.containsKey("soda_event")) {
            this.b.b(new swl(bundle));
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        bundle.getClass();
        this.b.b(swk.a);
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        bundle.getClass();
        this.b.e(null);
    }

    @Override // android.speech.RecognitionListener
    public final void onSegmentResults(Bundle bundle) {
        bundle.getClass();
        if (a() && bundle.containsKey("soda_event")) {
            this.b.b(new swl(bundle));
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f) {
    }
}
