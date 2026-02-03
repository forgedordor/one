package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ymk {
    public static final String a(ResolvedRecipient resolvedRecipient) {
        String strN;
        alqm alqmVarG = resolvedRecipient.g();
        String strAa = null;
        if (alqmVarG != null && (strN = alqmVarG.n()) != null) {
            strAa = fdgn.aa(strN, 4);
        }
        return strAa == null ? resolvedRecipient.x(true) : strAa;
    }
}
