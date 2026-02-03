package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class yva extends fdbo implements fdav {
    public yva(Object obj) {
        super(4, obj, yvq.class, "openImage", "openImage(Lcom/google/android/apps/messaging/shared/api/messaging/Message;Ljava/util/List;Landroid/net/Uri;Ljava/lang/String;)V", 0);
    }

    @Override // defpackage.fdav
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        ajlt ajltVar = (ajlt) obj;
        List list = (List) obj2;
        Uri uri = (Uri) obj3;
        String str = (String) obj4;
        ajltVar.getClass();
        list.getClass();
        uri.getClass();
        str.getClass();
        yvq yvqVar = (yvq) this.g;
        ekrw ekrwVarH = yvq.a.h();
        ekrwVarH.X(eksq.a, "BugleImage");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/image/ImageBubbleUiAdapter", "openImage", 573, "ImageBubbleUiAdapter.kt")).t("Opening media viewer with uri: %s", cqcy.a(uri));
        if (yvqVar.j.a()) {
            ((dpnt) yvqVar.k.b()).b(((ahnv) yvqVar.t.a()).a(list, list.indexOf(ajltVar)));
        } else {
            auvw.k(yvqVar.d, null, null, new yvn(yvqVar, uri, str, null), 3);
        }
        return fctx.a;
    }
}
