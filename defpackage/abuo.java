package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abuo implements baya {
    public static final eksp a = eksp.c("BugleCustomSticker");
    public final dnvi b;
    public final fcsu c;
    public final fcsu d;
    public final fcsu e;
    private final fdjx f;

    public abuo(dnvi dnviVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar) {
        dnviVar.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        fdjxVar.getClass();
        this.b = dnviVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = fdjxVar;
    }

    public static final Uri a(MessageCoreData messageCoreData) {
        return ((MessagePartCoreData) messageCoreData.M().get(0)).t();
    }

    @Override // defpackage.baya
    public final void c(MessageCoreData messageCoreData) {
        if (crbf.e()) {
            String str = (String) fdct.b(civb.a(messageCoreData.ac(), civa.EMOTIFY_STICKERS_NAMESPACE, "Sticker-Emotify-Id"));
            if (str != null) {
                ((eksl) a.h()).q("Received a custom sticker.");
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) fcva.X(messageCoreData.M());
                messagePartCoreData.bI();
                messagePartCoreData.aG(str);
                auvw.k(this.f, null, null, new abum(this, messageCoreData, str, null), 3);
                return;
            }
            if (((Boolean) crbf.bs.e()).booleanValue() && le.m(messageCoreData.am())) {
                ((eksl) a.h()).q("Received an image. Creating smart action for Photomoji.");
                auvw.k(this.f, null, null, new abun(this, messageCoreData, messageCoreData, null), 3);
            }
        }
    }
}
