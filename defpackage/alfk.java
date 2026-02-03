package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alfk implements ales {
    public final anpj a;
    private final anpj b;

    public alfk(alfh alfhVar, alfj alfjVar, EmergencySosConversationId emergencySosConversationId, anpj anpjVar, anpj anpjVar2, anpj anpjVar3) {
        alcn alcnVar = (alcn) alfhVar.a.b();
        alcnVar.getClass();
        alfm alfmVar = (alfm) alfhVar.b.b();
        alfmVar.getClass();
        this.a = new alfg(alcnVar, alfmVar, emergencySosConversationId, anpjVar, anpjVar2, anpjVar3);
        aldh aldhVar = (aldh) alfjVar.a.b();
        aldhVar.getClass();
        alfm alfmVar2 = (alfm) alfjVar.b.b();
        alfmVar2.getClass();
        this.b = new alfi(aldhVar, alfmVar2, emergencySosConversationId, anpjVar, anpjVar2, anpjVar3);
    }

    @Override // defpackage.ales
    public final anpj a() {
        throw new UnsupportedOperationException("Screen effect suggestions are not supported in Emergency SOS.");
    }

    @Override // defpackage.ales
    public final anpj b() {
        throw new UnsupportedOperationException("Screen effect suggestions are not supported in Emergency SOS.");
    }

    @Override // defpackage.ales
    public final anpj c() {
        return this.a;
    }

    @Override // defpackage.ales
    public final anpj d() {
        return this.b;
    }

    @Override // defpackage.ales
    public final eiju e(aldp aldpVar) {
        throw new UnsupportedOperationException("acceptSuggestion() is not supported in Emergency SOS.");
    }

    @Override // defpackage.ales
    public final eiju f(String str, amwf amwfVar, elny elnyVar, boolean z, boolean z2) {
        throw new UnsupportedOperationException("acceptSuggestion() is not supported in Emergency SOS.");
    }

    @Override // defpackage.ales
    public final eiju g(alff alffVar) {
        throw new UnsupportedOperationException("onSuggestionResult() is not supported in Emergency SOS.");
    }
}
