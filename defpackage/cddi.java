package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cddi {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/fcm/impl/PhoneChannelHelper");
    public final ains b;
    private final Optional c;
    private final eosc d;
    private final fcsu e;
    private final fcsu f;

    public cddi(ains ainsVar, Optional optional, eosc eoscVar, fcsu fcsuVar, fcsu fcsuVar2) {
        this.b = ainsVar;
        this.c = optional;
        this.d = eoscVar;
        this.e = fcsuVar;
        this.f = fcsuVar2;
    }

    public final eiju a(ezol ezolVar) {
        return ((cfzf) this.c.get()).e(ezolVar.c).h(new ejvr() { // from class: cdde
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.b.c("Bugle.Fcm.Phone.Bind.Success.Count");
                return null;
            }
        }, this.d);
    }

    public final eiju b(ezol ezolVar) {
        return ((cfzf) this.c.get()).a(ezolVar).h(new ejvr() { // from class: cddh
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                this.a.b.c("Bugle.Fcm.Phone.Pull.Success.Count");
                return null;
            }
        }, this.d);
    }

    public final eiju c(final ezol ezolVar) {
        return ((aqsb) this.f.b()).a() ? ((dggw) this.e.b()).f(ezolVar.c).i(new eooz() { // from class: cddf
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ezol ezolVar2 = ezolVar;
                if (zBooleanValue) {
                    return this.a.a(ezolVar2);
                }
                ekrw ekrwVarJ = cddi.a.j();
                ekrwVarJ.X(eksq.a, "BugleNetwork");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.X(cqnc.I, ezolVar2.c);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/fcm/impl/PhoneChannelHelper", "phoneBindIfProvisioned", 60, "PhoneChannelHelper.java")).q("Attempt to bind a channel for non-provisioned identity, aborted.");
                return eorv.a;
            }
        }, this.d) : a(ezolVar);
    }

    public final eiju d(final ezol ezolVar) {
        return ((aqsb) this.f.b()).a() ? ((dggw) this.e.b()).f(ezolVar.c).i(new eooz() { // from class: cddg
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ezol ezolVar2 = ezolVar;
                if (zBooleanValue) {
                    return this.a.b(ezolVar2);
                }
                ekrw ekrwVarJ = cddi.a.j();
                ekrwVarJ.X(eksq.a, "BugleNetwork");
                ekrd ekrdVar = (ekrd) ekrwVarJ;
                ekrdVar.X(cqnc.I, ezolVar2.c);
                ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/fcm/impl/PhoneChannelHelper", "phonePullIfProvisioned", 94, "PhoneChannelHelper.java")).q("Attempt to pull messages for non-provisioned identity, aborted.");
                return eorv.a;
            }
        }, this.d) : b(ezolVar);
    }
}
