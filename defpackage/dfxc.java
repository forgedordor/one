package defpackage;

import android.telephony.PhoneNumberUtils;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfxc {
    public static cjju a(String str) {
        String strA = null;
        try {
            ebma ebmaVarE = new ebqi(str).e();
            if (ebmaVarE.l()) {
                eblx eblxVar = (eblx) ebmaVarE;
                String strE = eblxVar.e();
                if (strE == null || Objects.equals(eblxVar.m(), "phone") || PhoneNumberUtils.isGlobalPhoneNumber(strE)) {
                    strA = strE;
                }
            } else if (ebmaVarE instanceof ebly) {
                ebly eblyVar = (ebly) ebmaVarE;
                if (eblyVar.e()) {
                    strA = "+" + eblyVar.a();
                } else {
                    strA = eblyVar.a();
                }
            }
        } catch (ebml unused) {
        }
        if (strA == null) {
            return b(str);
        }
        cjjs cjjsVar = (cjjs) cjju.a.createBuilder();
        cjjo cjjoVar = (cjjo) cjjp.a.createBuilder();
        cjjoVar.copyOnWrite();
        cjjp cjjpVar = (cjjp) cjjoVar.instance;
        cjjpVar.b |= 1;
        cjjpVar.c = strA;
        cjjsVar.copyOnWrite();
        cjju cjjuVar = (cjju) cjjsVar.instance;
        cjjp cjjpVar2 = (cjjp) cjjoVar.build();
        cjjpVar2.getClass();
        cjjuVar.c = cjjpVar2;
        cjjuVar.b = 1;
        return (cjju) cjjsVar.build();
    }

    public static cjju b(String str) {
        if (!str.startsWith("sip:")) {
            throw new IllegalArgumentException("URI format not supported");
        }
        cjjs cjjsVar = (cjjs) cjju.a.createBuilder();
        cjmd cjmdVar = (cjmd) cjme.a.createBuilder();
        cjmdVar.copyOnWrite();
        cjme cjmeVar = (cjme) cjmdVar.instance;
        str.getClass();
        cjmeVar.b |= 1;
        cjmeVar.c = str;
        cjjsVar.copyOnWrite();
        cjju cjjuVar = (cjju) cjjsVar.instance;
        cjme cjmeVar2 = (cjme) cjmdVar.build();
        cjmeVar2.getClass();
        cjjuVar.c = cjmeVar2;
        cjjuVar.b = 2;
        return (cjju) cjjsVar.build();
    }
}
