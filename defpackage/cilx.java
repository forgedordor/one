package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cilx {
    public static /* synthetic */ cimb a(fdap fdapVar) {
        cime cimeVar = new cime(new fdap() { // from class: cilw
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ResolvedRecipient resolvedRecipient = (ResolvedRecipient) obj;
                resolvedRecipient.getClass();
                String strV = resolvedRecipient.v();
                if (strV != null) {
                    return Integer.valueOf(strV.length());
                }
                return null;
            }
        });
        fdapVar.invoke(cimeVar);
        return new cimb(cimeVar.b.a(), cimeVar.c);
    }
}
