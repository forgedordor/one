package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final /* synthetic */ class zif extends fdbo implements fdax {
    public zif(Object obj) {
        super(6, obj, zih.class, "openVideo", "openVideo-myKFqkg(Lcom/google/android/apps/messaging/shared/api/messaging/Message;Ljava/util/List;Landroid/net/Uri;Ljava/lang/String;JZ)V", 0);
    }

    @Override // defpackage.fdax
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ajlt ajltVar = (ajlt) obj;
        List list = (List) obj2;
        Uri uri = (Uri) obj3;
        String str = (String) obj4;
        long j = ((fdhi) obj5).c;
        boolean zBooleanValue = ((Boolean) obj6).booleanValue();
        ajltVar.getClass();
        list.getClass();
        uri.getClass();
        str.getClass();
        zih zihVar = (zih) this.g;
        if (zihVar.i.a()) {
            ((dpnt) zihVar.h.b()).b(((ahnv) zihVar.s.a()).a(list, list.indexOf(ajltVar)));
        } else {
            auvw.k(zihVar.c, null, null, new zie(zihVar, uri, str, j, zBooleanValue, null), 3);
        }
        return fctx.a;
    }
}
