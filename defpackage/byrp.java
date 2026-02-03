package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byrp implements byrn {
    public static final eksp a = eksp.c("BugleCms");
    public final fcsu b;
    private final bvkr c;
    private final cema d;
    private final cprh e;

    public byrp(fcsu fcsuVar, bvkr bvkrVar, cema cemaVar, cprh cprhVar) {
        this.b = fcsuVar;
        this.c = bvkrVar;
        this.d = cemaVar;
        this.e = cprhVar;
    }

    public final void a() {
        for (ezol ezolVar : this.c.o()) {
            try {
                eiju.g(this.d.a(new cfgb(this.e.d(ezolVar), ezolVar))).e(RuntimeException.class, new ejvr() { // from class: byro
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj) {
                        ((eksl) ((eksl) ((eksl) byrp.a.i()).g((RuntimeException) obj)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsKeyManagerImpl", "updateCloudStoreBackupKeys", 92, "CmsKeyManagerImpl.java")).q("Failed to set backup key");
                        return false;
                    }
                }, eoqg.a);
            } catch (GeneralSecurityException e) {
                ((eksl) ((eksl) ((eksl) a.i()).g(e)).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsKeyManagerImpl", "updateCloudStoreBackupKeys", 'a', "CmsKeyManagerImpl.java")).q("Failed to set backup key");
            }
        }
    }
}
