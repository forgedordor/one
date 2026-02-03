package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ceje implements koi {
    final /* synthetic */ cejg a;

    public ceje(cejg cejgVar) {
        this.a = cejgVar;
    }

    @Override // defpackage.koi
    public final Object a(kog kogVar) {
        ekrw ekrwVarH = cejg.a.h();
        ekrwVarH.X(eksq.a, "BugleNetwork");
        ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/shared/net/PhoneRegistrationProvider$1", "attachCompleter", 517, "PhoneRegistrationProvider.java")).q("otpCompleter is set");
        cejg cejgVar = this.a;
        synchronized (cejgVar.n) {
            cejgVar.o = kogVar;
        }
        return "OTP Verification";
    }
}
