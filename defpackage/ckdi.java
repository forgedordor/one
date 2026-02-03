package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckdi {
    public static final basd a(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        eyga eygaVarAc = messageCoreData.ac();
        if (eygaVarAc == null) {
            return null;
        }
        civa civaVar = civa.GSMA_RCS_NAMESPACE;
        String str = (String) fdct.b(civb.a(eygaVarAc, civaVar, "Reference-Type"));
        if (fdbq.f("Delete", str) || fdbq.f("Recall", str)) {
            return basd.a((String) fdct.b(civb.a(eygaVarAc, civaVar, "Reference-ID")));
        }
        return null;
    }
}
