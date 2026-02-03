package defpackage;

import android.os.Bundle;
import android.util.SparseArray;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmve implements cmuw {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/sms/config/accessors/SystemCarrierConfigAccessor");
    private final fcsu b;
    private final crny c;

    public cmve(fcsu fcsuVar, crny crnyVar) {
        fcsuVar.getClass();
        crnyVar.getClass();
        this.b = fcsuVar;
        this.c = crnyVar;
    }

    @Override // defpackage.cmuw
    public final Bundle a(int i) {
        cqjz cqjzVar = (cqjz) this.b.b();
        SparseArray sparseArray = cqjzVar.b;
        if (sparseArray != null && ((cqky) cqjzVar.a.b()).a() && ((Integer[]) sparseArray.get(i)) != null) {
            return new Bundle();
        }
        try {
            Optional optionalJ = this.c.h(i).j();
            Bundle bundle = new Bundle();
            if (optionalJ.isPresent()) {
                bundle.putAll((Bundle) optionalJ.get());
                if (bundle.get("spamForwardingNumber") instanceof Boolean) {
                    bundle.remove("spamForwardingNumber");
                }
            }
            return bundle;
        } catch (Exception e) {
            ekrd ekrdVar = (ekrd) a.j();
            ekrdVar.X(eksq.a, "Bugle");
            ((ekrd) ekrdVar.g(e).h("com/google/android/apps/messaging/shared/sms/config/accessors/SystemCarrierConfigAccessor", "get", 52, "SystemCarrierConfigAccessor.kt")).q("Error fetching system carrier config values");
            return new Bundle();
        }
    }
}
