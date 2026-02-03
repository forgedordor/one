package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cqly extends log {
    final /* synthetic */ cqmb a;

    public cqly(cqmb cqmbVar) {
        this.a = cqmbVar;
    }

    @Override // defpackage.log
    public final void a(Throwable th) {
        if (th != null) {
            ekrw ekrwVarJ = cqmb.a.j();
            ekrwVarJ.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ((ekrd) ekrwVarJ).g(th)).h("com/google/android/apps/messaging/shared/util/emoji/EmojiUtils$1", "onFailed", 'i', "EmojiUtils.java")).q("EmojiCompat initialization failed");
        } else {
            ekrw ekrwVarJ2 = cqmb.a.j();
            ekrwVarJ2.X(eksq.a, "Bugle");
            ((ekrd) ((ekrd) ekrwVarJ2).h("com/google/android/apps/messaging/shared/util/emoji/EmojiUtils$1", "onFailed", 107, "EmojiUtils.java")).q("EmojiCompat initialization failed (unknown error)");
        }
    }

    @Override // defpackage.log
    public final void b() {
        ekrw ekrwVarE = cqmb.a.e();
        ekrwVarE.X(eksq.a, "Bugle");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/util/emoji/EmojiUtils$1", "onInitialized", 98, "EmojiUtils.java")).q("EmojiCompat initialized");
        this.a.b = lok.b();
    }
}
