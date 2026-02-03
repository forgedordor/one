package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eydd {
    public static void a() {
        ejwi ejwiVarB = ejwi.i(null).b(new ejvr() { // from class: eydc
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((MessageDigest) obj).getAlgorithm();
            }
        });
        if (ejwiVarB.g()) {
            if (ejuf.e((CharSequence) ejwiVarB.c(), "md5") || ejuf.e((CharSequence) ejwiVarB.c(), "sha-1")) {
                ejuf.e((CharSequence) ejwiVarB.c(), "md5");
                eldz eldzVar = eldz.e;
                throw null;
            }
        }
    }
}
