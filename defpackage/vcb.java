package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vcb implements fdap {
    final /* synthetic */ vce a;

    public vcb(vce vceVar) {
        this.a = vceVar;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws IOException {
        IOException iOException = (IOException) obj;
        ekrw ekrwVarJ = this.a.g.j();
        ekrwVarJ.X(eksq.a, "BuglePenpal");
        ((ekrd) ((ekrd) ekrwVarJ).g(iOException).h("com/google/android/apps/messaging/conversation/suggestions/smarterreplies/MagicComposeSentencePieceTokenizerImpl$tokenizer$1$1$2", "invoke", 76, "MagicComposeSentencePieceTokenizerImpl.kt")).q("Could not parse input stream");
        throw iOException;
    }
}
