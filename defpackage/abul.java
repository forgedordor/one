package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abul implements bayk {
    private static final eksp a = eksp.c("BugleCustomSticker");

    @Override // defpackage.bayk
    public final /* synthetic */ void f(MessageCoreData messageCoreData, MessageIdType messageIdType) {
        bayj.a(messageCoreData, messageIdType);
    }

    @Override // defpackage.bayk
    public final void i(MessageCoreData messageCoreData) {
        Object next;
        String strZ = null;
        MessageCoreData messageCoreData2 = true != messageCoreData.cX() ? null : messageCoreData;
        if (messageCoreData2 != null) {
            Iterator it = messageCoreData2.M().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (fdbq.f(((MessagePartCoreData) next).aa(), "custom_sticker")) {
                        break;
                    }
                }
            }
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) next;
            if (messagePartCoreData != null) {
                strZ = messagePartCoreData.Z();
            }
        }
        if (strZ != null) {
            ((eksl) a.h()).t("Adding custom header to custom sticker: ID = %s", strZ);
            eyga eygaVarAc = messageCoreData.ac();
            civc civcVarB = eygaVarAc != null ? civc.b(eygaVarAc) : civc.a();
            civcVarB.e(civa.EMOTIFY_STICKERS_NAMESPACE, "Sticker-Emotify-Id", strZ);
            messageCoreData.bs(civcVarB.c());
        }
    }

    @Override // defpackage.bayk
    public final boolean j() {
        return crbf.e();
    }

    @Override // defpackage.bayk
    public final /* synthetic */ void h(MessageCoreData messageCoreData) {
    }

    @Override // defpackage.bayk
    public final /* synthetic */ Object a(MessageCoreData messageCoreData, fcxy fcxyVar) {
        return messageCoreData;
    }

    @Override // defpackage.bayk
    public final /* synthetic */ Object b(MessageCoreData messageCoreData, List list, fcxy fcxyVar) {
        return messageCoreData;
    }
}
