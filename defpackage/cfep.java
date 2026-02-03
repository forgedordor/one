package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfep {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/net/handler/NormalizedPhoneNumberDiscrepancyLogger");
    private final fcsu b;
    private final fcsu c;

    public cfep(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    private static final void b(String str) {
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "BugleRcs");
        ((ekrd) ((ekrd) ekrwVarJ).g(new cfeo()).h("com/google/android/apps/messaging/shared/net/handler/NormalizedPhoneNumberDiscrepancyLogger", "logPrimesWarningWithStackTrace", 51, "NormalizedPhoneNumberDiscrepancyLogger.kt")).q(str);
    }

    public final void a(String str, int i) {
        str.getClass();
        if (fdgn.H(str)) {
            b("Non E164 phone number");
            ((ains) this.c.b()).e("Bugle.Dsdr.EmptyPhoneNumber.Count", i);
        } else {
            if (((crmx) this.b.b()).I(str)) {
                return;
            }
            b("Unexpected empty phone number instead of E164");
            ((ains) this.c.b()).e("Bugle.Dsdr.NonE164PhoneNumber.Count", i);
        }
    }
}
