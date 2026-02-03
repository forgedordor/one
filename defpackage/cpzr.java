package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cpzr {
    public static final ekgp a;

    static {
        ekgi ekgiVar = new ekgi();
        auml aumlVar = auml.UNSPECIFIED_STATUS;
        ekgiVar.i(new cpzs(aumlVar, aumlVar), cpzq.NO_FEATURE_IS_ON);
        ekgiVar.i(new cpzs(auml.UNSPECIFIED_STATUS, auml.ENABLED), cpzq.BNR_ONLY);
        ekgiVar.i(new cpzs(auml.UNSPECIFIED_STATUS, auml.ENABLING), cpzq.BNR_ONLY);
        ekgiVar.i(new cpzs(auml.UNSPECIFIED_STATUS, auml.ENABLE_FAILED), cpzq.BNR_ENABLE_FAILED);
        ekgiVar.i(new cpzs(auml.UNSPECIFIED_STATUS, auml.DISABLED), cpzq.NO_FEATURE_IS_ON);
        ekgiVar.i(new cpzs(auml.UNSPECIFIED_STATUS, auml.DISABLING), cpzq.DISABLING_BNR);
        ekgiVar.i(new cpzs(auml.UNSPECIFIED_STATUS, auml.DISABLE_FAILED), cpzq.BNR_DISABLE_FAILED);
        auml aumlVar2 = auml.ENABLED;
        ekgiVar.i(new cpzs(aumlVar2, aumlVar2), cpzq.BNR_AND_MD);
        ekgiVar.i(new cpzs(auml.ENABLED, auml.ENABLING), cpzq.BNR_AND_MD);
        ekgiVar.i(new cpzs(auml.ENABLED, auml.ENABLE_FAILED), cpzq.BNR_ENABLE_FAILED);
        ekgiVar.i(new cpzs(auml.ENABLING, auml.ENABLED), cpzq.BNR_AND_MD);
        auml aumlVar3 = auml.ENABLING;
        ekgiVar.i(new cpzs(aumlVar3, aumlVar3), cpzq.BNR_AND_MD);
        ekgiVar.i(new cpzs(auml.ENABLING, auml.ENABLE_FAILED), cpzq.BNR_ENABLE_FAILED);
        ekgiVar.i(new cpzs(auml.ENABLE_FAILED, auml.UNSPECIFIED_STATUS), cpzq.LEGACY_MD_ENABLE_FAILED);
        ekgiVar.i(new cpzs(auml.ENABLE_FAILED, auml.ENABLED), cpzq.MD_ENABLE_FAILED);
        ekgiVar.i(new cpzs(auml.ENABLE_FAILED, auml.ENABLING), cpzq.MD_ENABLE_FAILED);
        auml aumlVar4 = auml.ENABLE_FAILED;
        ekgiVar.i(new cpzs(aumlVar4, aumlVar4), cpzq.BNR_ENABLE_FAILED);
        ekgiVar.i(new cpzs(auml.DISABLED, auml.UNSPECIFIED_STATUS), cpzq.NO_FEATURE_IS_ON);
        ekgiVar.i(new cpzs(auml.DISABLED, auml.ENABLED), cpzq.BNR_ONLY);
        ekgiVar.i(new cpzs(auml.DISABLED, auml.ENABLING), cpzq.BNR_ONLY);
        ekgiVar.i(new cpzs(auml.DISABLED, auml.ENABLE_FAILED), cpzq.BNR_ENABLE_FAILED);
        auml aumlVar5 = auml.DISABLED;
        ekgiVar.i(new cpzs(aumlVar5, aumlVar5), cpzq.NO_FEATURE_IS_ON);
        ekgiVar.i(new cpzs(auml.DISABLED, auml.DISABLING), cpzq.DISABLING_BNR);
        ekgiVar.i(new cpzs(auml.DISABLED, auml.DISABLE_FAILED), cpzq.BNR_DISABLE_FAILED);
        ekgiVar.i(new cpzs(auml.DISABLING, auml.UNSPECIFIED_STATUS), cpzq.LEGACY_MD_DISABLING);
        ekgiVar.i(new cpzs(auml.DISABLING, auml.ENABLED), cpzq.TURNING_OFF_MD);
        ekgiVar.i(new cpzs(auml.DISABLING, auml.ENABLING), cpzq.TURNING_OFF_MD);
        ekgiVar.i(new cpzs(auml.DISABLING, auml.ENABLE_FAILED), cpzq.BNR_ENABLE_FAILED);
        auml aumlVar6 = auml.DISABLING;
        ekgiVar.i(new cpzs(aumlVar6, aumlVar6), cpzq.DISABLING_BNR);
        ekgiVar.i(new cpzs(auml.DISABLE_FAILED, auml.UNSPECIFIED_STATUS), cpzq.LEGACY_MD_DISABLE_FAILED);
        ekgiVar.i(new cpzs(auml.DISABLE_FAILED, auml.ENABLED), cpzq.MD_DISABLE_FAILED);
        ekgiVar.i(new cpzs(auml.DISABLE_FAILED, auml.ENABLING), cpzq.MD_DISABLE_FAILED);
        ekgiVar.i(new cpzs(auml.DISABLE_FAILED, auml.ENABLE_FAILED), cpzq.BNR_ENABLE_FAILED);
        ekgiVar.i(new cpzs(auml.DISABLE_FAILED, auml.DISABLING), cpzq.DISABLING_BNR);
        auml aumlVar7 = auml.DISABLE_FAILED;
        ekgiVar.i(new cpzs(aumlVar7, aumlVar7), cpzq.BNR_DISABLE_FAILED);
        a = ekgiVar.c();
    }
}
