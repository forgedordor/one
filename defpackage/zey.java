package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class zey extends fdbo implements fdap {
    public zey(Object obj) {
        super(1, obj, zez.class, "navigateToLink", "navigateToLink(Landroid/net/Uri;)V", 0);
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Uri uri = (Uri) obj;
        uri.getClass();
        zez zezVar = (zez) this.g;
        ((ekrd) zez.a.f().h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/text/LinkPreviewUiAdapter", "navigateToLink", 280, "LinkPreviewUiAdapter.kt")).q("Preview clicked; opening browser");
        zezVar.b.h(new agdi(uri));
        return fctx.a;
    }
}
