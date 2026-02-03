package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwmz {
    public static final cqce a = cqce.g("BugleE2eeEtouffee", "EncryptedMessageRetryHandler");
    public final eosc b;
    public final eosc c;
    public final fcsu d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final atvy k;

    public bwmz(eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, atvy atvyVar) {
        this.b = eoscVar;
        this.c = eoscVar2;
        this.d = fcsuVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.h = fcsuVar5;
        this.i = fcsuVar6;
        this.j = fcsuVar7;
        this.k = atvyVar;
    }

    public static Optional b(eyga eygaVar) {
        return civb.a(eygaVar, civa.ETOUFFEE_NAMESPACE, "recipient");
    }

    public final Optional a(eyga eygaVar) {
        return civb.a(eygaVar, civa.ETOUFFEE_NAMESPACE, "original-message-id").map(new bwmt());
    }

    public final boolean c(MessageCoreData messageCoreData) {
        String strAq = messageCoreData.aq();
        eyga eygaVarAc = messageCoreData.ac();
        if (bwbv.e()) {
            if (eygaVarAc == null || !b(eygaVarAc).isPresent()) {
                return false;
            }
        } else if (eygaVarAc == null || !a(eygaVarAc).isPresent()) {
            return false;
        }
        return messageCoreData.cX() && messageCoreData.cB() && messageCoreData.cF() && !TextUtils.isEmpty(strAq);
    }
}
