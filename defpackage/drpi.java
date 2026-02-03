package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drpi implements eora {
    final /* synthetic */ ekgb a;
    final /* synthetic */ drpl b;

    public drpi(drpl drplVar, ekgb ekgbVar) {
        this.a = ekgbVar;
        this.b = drplVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.b.g.l(this.a);
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((ekrd) ((ekrd) drpl.a.h()).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiListController$3", "onFailure", 221, "EmojiListController.java")).q("Emoji variant loading failed.");
        this.b.g.l(this.a);
    }
}
