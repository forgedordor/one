package defpackage;

import android.speech.SpeechRecognizer;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class suq implements fdap {
    final /* synthetic */ sux a;
    final /* synthetic */ fdis b;

    public suq(sux suxVar, fdis fdisVar) {
        this.a = suxVar;
        this.b = fdisVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        sux suxVar = this.a;
        ((SpeechRecognizer) obj).checkRecognitionSupport(sww.a(suxVar.d), suxVar.h, new suo(this.b));
        return fctx.a;
    }
}
