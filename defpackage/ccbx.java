package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccbx implements ccbo {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/mls/core/processors/NoOpProcessor");

    @Override // defpackage.ccbo
    public final Object a(cbwd cbwdVar, epun epunVar, fcxy fcxyVar) {
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleE2eeMls");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/e2ee/mls/core/processors/NoOpProcessor", "process", 17, "NoOpProcessor.kt")).t("Process message result is No-op. Context Id: %s", cbwdVar.e);
        return new ccag(cbwdVar, ccam.a);
    }

    @Override // defpackage.ccbo
    public final /* synthetic */ boolean b() {
        return false;
    }
}
