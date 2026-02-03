package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccci implements ccbo {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/core/processors/PendingMessageProcessor");
    private final ccpm b;
    private final ccud c;
    private final cbzs d;

    public ccci(ccpm ccpmVar, cbzs cbzsVar, ccud ccudVar) {
        ccpmVar.getClass();
        this.b = ccpmVar;
        this.d = cbzsVar;
        this.c = ccudVar;
    }

    @Override // defpackage.ccbo
    public final Object a(cbwd cbwdVar, epun epunVar, fcxy fcxyVar) {
        if (epunVar.c != 6) {
            throw new IllegalArgumentException("Result must contain a pending message.");
        }
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleE2eeMls");
        ekrd ekrdVar = (ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/e2ee/mls/core/processors/PendingMessageProcessor", "process", 37, "PendingMessageProcessor.kt");
        String str = cbwdVar.e;
        epui epuiVarB = epui.b((epunVar.c == 6 ? (epuf) epunVar.d : epuf.a).c);
        if (epuiVarB == null) {
            epuiVarB = epui.UNRECOGNIZED;
        }
        eptu eptuVarB = eptu.b((epunVar.c == 6 ? (epuf) epunVar.d : epuf.a).b);
        if (eptuVarB == null) {
            eptuVarB = eptu.UNRECOGNIZED;
        }
        ekrdVar.I("Result is a pending message: %s, with pending reason: %s, health status: %s", str, epuiVarB, eptuVarB);
        epuf epufVar = epunVar.c == 6 ? (epuf) epunVar.d : epuf.a;
        epufVar.getClass();
        epui epuiVarB2 = epui.b(epufVar.c);
        if (epuiVarB2 == null) {
            epuiVarB2 = epui.UNRECOGNIZED;
        }
        if (epuiVarB2 != epui.PENDING_REASON_KEY_REFRESH_REQUIRED) {
            eptu eptuVarB2 = eptu.b(epufVar.b);
            if (eptuVarB2 == null) {
                eptuVarB2 = eptu.UNRECOGNIZED;
            }
            int iOrdinal = eptuVarB2.ordinal();
            return iOrdinal != 1 ? iOrdinal != 3 ? new ccag(cbwdVar, ccam.a) : c(cbwdVar, true, fcxyVar) : c(cbwdVar, false, fcxyVar);
        }
        ekrw ekrwVarH2 = ekrgVar.h();
        ekrwVarH2.X(ekrzVar, "BugleE2eeMls");
        ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/e2ee/mls/core/processors/PendingMessageProcessor", "process", 48, "PendingMessageProcessor.kt")).t("Handling key refresh required for %s", cbwdVar.e);
        eptu eptuVarB3 = eptu.b((epunVar.c == 6 ? (epuf) epunVar.d : epuf.a).b);
        if (eptuVarB3 == null) {
            eptuVarB3 = eptu.UNRECOGNIZED;
        }
        if (eptuVarB3 == eptu.MLS_HEALTH_STATUS_HEALTHY) {
            return new ccaj(cbwdVar, new ccep(epunVar.f.E()));
        }
        throw new IllegalArgumentException("Key refresh required should only be set for healthy MLS state.");
    }

    @Override // defpackage.ccbo
    public final /* synthetic */ boolean b() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0111 -> B:31:0x0118). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.cbwd r13, boolean r14, defpackage.fcxy r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccci.c(cbwd, boolean, fcxy):java.lang.Object");
    }
}
