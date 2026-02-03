package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aivj {
    public final crqv a;

    public aivj(crqv crqvVar) {
        this.a = crqvVar;
    }

    private final Optional g(String str) {
        long jE = this.a.e(str, -1L);
        return jE == -1 ? Optional.empty() : Optional.of(Long.valueOf(jE));
    }

    public final Optional a() {
        int iD = this.a.d("first_provisioning_ui_event_ui_type", -1);
        return iD == -1 ? Optional.empty() : Optional.of(emfe.b(iD));
    }

    public final Optional b() {
        return g("first_time_rcs_accepted_millis");
    }

    public final Optional c() {
        return g("first_time_rcs_declined_millis");
    }

    public final Optional d() {
        return g("first_time_rcs_provisioned_millis");
    }

    public final Optional e() {
        return g("first_rcs_provisioning_ui_event_time");
    }

    public final Optional f() {
        return g("first_rcs_eligibility_time");
    }
}
