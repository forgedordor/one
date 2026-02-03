package defpackage;

import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aogb implements bvup, cqto {
    private static final eksp c = eksp.c("BugleSelfIdentity");
    public final cqtq a;
    public final alrj b;

    public aogb(cqtp cqtpVar, alrj alrjVar) {
        this.a = cqtpVar.a(this);
        this.b = alrjVar;
    }

    @Override // defpackage.bvup
    public final eiju a(final String str, boolean z) {
        eksl ekslVar = (eksl) c.e();
        ekslVar.X(cqnc.I, str);
        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/api/messaging/selfidentity/encryption/EtouffeeEncryptionStateListener", "onStateChange", 42, "EtouffeeEncryptionStateListener.java")).t("SelfIdentity encryption state changed to: %s.", true != z ? "DISABLED" : "PROVISIONED");
        this.a.c(new Supplier() { // from class: aoga
            @Override // java.util.function.Supplier
            public final Object get() {
                return this.a.b.r(str);
            }
        }, "EtouffeeEncryptionStateListener::Notify");
        return eijx.e(null);
    }

    @Override // defpackage.cqto
    public final /* synthetic */ void fJ() {
    }

    @Override // defpackage.cqto
    public final /* synthetic */ void fK() {
    }
}
