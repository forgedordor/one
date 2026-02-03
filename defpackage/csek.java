package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csek {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/spam/common/SpamRejectionHandler");
    public static final cczi b = cdag.h(cdag.b, "cs_messages_from_contact", false);
    public static final cczi c = cdag.e(cdag.b, "cs_conversation_age_threshold", -1);
    public static final cczi d = cdag.h(cdag.b, "enable_logging_spam_protection_rejection_reason", true);
    public static final cczi e = cdag.h(cdag.b, "enable_logging_allowlisted_rejection_reason", true);
    public final fcsu f;
    public final fcsu g;
    private final fcsu h;

    public csek(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3) {
        fcsuVar.getClass();
        fcsuVar3.getClass();
        this.f = fcsuVar;
        this.g = fcsuVar2;
        this.h = fcsuVar3;
    }

    public static final void a(String str) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleSpam");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/spam/common/SpamRejectionHandler", "logToLogcat", 214, "SpamRejectionHandler.kt")).q(str);
    }

    public static /* synthetic */ Object b(csek csekVar, csch cschVar, csdl csdlVar, eoeo eoeoVar, Integer num, boolean z, Integer num2, String str, fcxy fcxyVar, int i) {
        csdl csdlVar2 = (i & 2) != 0 ? null : csdlVar;
        eoeo eoeoVar2 = (i & 4) != 0 ? null : eoeoVar;
        boolean z2 = (i & 64) != 0;
        if (z2) {
            if (csdlVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            if (eoeoVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        int i2 = i & 128;
        int i3 = i & 32;
        int i4 = i & 8;
        boolean z3 = (i & 16) == 0;
        String str2 = i2 != 0 ? null : str;
        Integer num3 = i3 != 0 ? null : num2;
        boolean z4 = z3 & z;
        Integer num4 = i4 != 0 ? null : num;
        Object objB = csekVar.h.b();
        objB.getClass();
        return fdin.a(eicg.a((fcyh) objB), new csej(null, cschVar, csekVar, z4, num3, z2, csdlVar2, eoeoVar2, num4, str2), fcxyVar);
    }
}
