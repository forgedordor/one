package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drqp implements eora {
    final /* synthetic */ ListenableFuture a;
    final /* synthetic */ ListenableFuture b;
    final /* synthetic */ drpv c;
    final /* synthetic */ drqt d;

    public drqp(drqt drqtVar, ListenableFuture listenableFuture, ListenableFuture listenableFuture2, drpv drpvVar) {
        this.a = listenableFuture;
        this.b = listenableFuture2;
        this.c = drpvVar;
        this.d = drqtVar;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drqp.b(java.lang.Object):void");
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
        ((ekrd) ((ekrd) ((ekrd) drqt.a.j()).g(th)).h("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerController$5", "onFailure", (char) 897, "EmojiPickerController.java")).q("Emoji picker data loading failed");
    }
}
