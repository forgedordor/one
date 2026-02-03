package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckfj {
    public static final boolean a(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        eyga eygaVarAc = messageCoreData.ac();
        return eygaVarAc != null && c(eygaVarAc).k();
    }

    public static final Instant b(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        eyga eygaVarAc = messageCoreData.ac();
        if (eygaVarAc != null) {
            Object objOrElse = civb.a(eygaVarAc, civa.RCS_EDIT_NAMESPACE, "Edited-At-Timestamp-Ms").orElse("0");
            objOrElse.getClass();
            Instant instantOfEpochMilli = Instant.ofEpochMilli(Long.parseLong((String) objOrElse));
            if (instantOfEpochMilli.toEpochMilli() > 0) {
                return instantOfEpochMilli;
            }
        }
        return null;
    }

    public static final basd c(eyga eygaVar) {
        civa civaVar = civa.GSMA_RCS_NAMESPACE;
        return basd.a(!fdbq.f("Edit", (String) fdct.b(civb.a(eygaVar, civaVar, "Reference-Type"))) ? null : (String) fdct.b(civb.a(eygaVar, civaVar, "Reference-ID")));
    }
}
