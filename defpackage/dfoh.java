package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfoh {
    public final dfoa a;
    public final dfoa b;
    public final dfoa c;
    public final dfoa d;
    public final dfoa e;

    public dfoh(dfoi dfoiVar) {
        this.a = dfoiVar.h("ims_connectivity_verbosity", "INFO");
        this.b = dfoiVar.h("ims_availability_verbosity", "INFO");
        this.c = dfoiVar.i("enable_u2_logging", false);
        this.d = dfoiVar.i("enable_primes_memory_measurement", false);
        this.e = dfoiVar.h("override_imei_for_testing_on_emulators", "");
    }
}
