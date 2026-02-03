package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cotz implements coty {
    private final fcsu a;
    private final fcsu b;

    public cotz(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    @Override // defpackage.coty
    public final cous a(MessageCoreData messageCoreData, ekgb ekgbVar) {
        MessagePartCoreData messagePartCoreDataH = messageCoreData.H();
        if (messagePartCoreDataH == null) {
            throw new IllegalArgumentException("Unable to prepare file for uploading since the message does not contain an attachment.");
        }
        Uri uriT = messagePartCoreDataH.t();
        String strE = le.e(messagePartCoreDataH.R());
        if (uriT == null) {
            throw new IllegalArgumentException("Content uri in FileUploadInfo should be valid.");
        }
        eksp ekspVar = cous.h;
        couc coucVar = new couc();
        coucVar.e(uriT);
        coucVar.d(strE == null ? null : ContentType.e(strE));
        coucVar.f(cotx.a(messagePartCoreDataH));
        if (messagePartCoreDataH.bj() || messagePartCoreDataH.bx()) {
            byte[] bArrA = ((coua) this.a.b()).a(messagePartCoreDataH, ((coub) this.b.b()).a(ekgbVar));
            if (bArrA != null) {
                coucVar.h(ContentType.e("image/jpeg"));
                coucVar.i(evqs.x(bArrA));
            }
        } else if (messagePartCoreDataH.aY()) {
            coucVar.c(Duration.ofMillis(messagePartCoreDataH.k()));
        }
        return coucVar.j();
    }
}
