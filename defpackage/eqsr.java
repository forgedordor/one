package defpackage;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eqsr {
    private static final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public static eqsq a(String str) throws GeneralSecurityException {
        Iterator it = a.iterator();
        while (it.hasNext()) {
            eqsq eqsqVar = (eqsq) it.next();
            if (eqsqVar.b(str)) {
                return eqsqVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
