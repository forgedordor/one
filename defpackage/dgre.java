package defpackage;

import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgre extends dgrh {
    private static final dhip a = new dhip("RcsReconfigurationSmsHandler");
    private final dgrs d;
    private final dhes e;
    private final ckjt f;

    public dgre(dhes dhesVar, dgrs dgrsVar, ckjt ckjtVar) {
        this.f = ckjtVar;
        this.e = dhesVar;
        this.d = dgrsVar;
    }

    @Override // defpackage.dgrh
    protected final boolean c(String str, int i, int i2) {
        String str2;
        dgiq dgiqVarF;
        dgis dgisVarM;
        if (TextUtils.isEmpty(str)) {
            str2 = null;
        } else {
            String[] strArr = b;
            for (int i3 = 0; i3 < 2; i3++) {
                str2 = strArr[i3];
                if (str.endsWith(str2)) {
                    break;
                }
            }
            str2 = null;
        }
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        dhja.r(a, "Reconfiguration SMS body contains valid reconfiguration suffix: %s, encoding: UTF_16", str2);
        dhja.q("Received reconfiguration SMS", new Object[0]);
        String strSubstring = (!TextUtils.isEmpty(str) && str.endsWith(str2)) ? str.substring(0, str.length() - str2.length()) : null;
        if (TextUtils.isEmpty(strSubstring)) {
            return false;
        }
        if ((TextUtils.isEmpty(strSubstring) || !strSubstring.equals(this.e.j())) && (TextUtils.isEmpty(strSubstring) || (dgiqVarF = this.d.f(this.e.l())) == null || (dgisVarM = dgiqVarF.m()) == null || !ejuf.e(strSubstring, dgisVarM.s()))) {
            return true;
        }
        ckjt ckjtVar = this.f;
        eksp ekspVar = ckkj.a;
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onReconfigSms", 390, "RcsProvisioningTriggerImpl.java")).q("RcsProvisioningTrigger: onReconfigSms");
        ckkj ckkjVar = ckjtVar.a;
        cmmh cmmhVar = (cmmh) ckkjVar.m.i(i).orElse(null);
        if (cmmhVar == null) {
            ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/shared/rcsprovisioning/trigger/RcsProvisioningTriggerImpl", "onReconfigSms", 394, "RcsProvisioningTriggerImpl.java")).r("RcsProvisioningTrigger: onReconfigSms. No SimSubscriptionInfo found for subId %s. Ignoring SMS.", i);
        } else {
            fcsu fcsuVar = ckkjVar.f;
            String str3 = cmmhVar.c;
            ((dgrs) fcsuVar.b()).r(str3);
            dggp dggpVar = new dggp(str3);
            ckkjVar.x(dggpVar, chyx.RECONFIG_SMS);
            ckkjVar.v(dggpVar, cmmhVar.d, enxe.RECONFIG_SMS);
        }
        return true;
    }
}
