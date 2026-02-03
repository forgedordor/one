package defpackage;

import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgjz {
    public static final eksp a = eksp.c(dhin.a);
    public final dgrs b;
    private final cebq c;

    public dgjz(dgrs dgrsVar, cebq cebqVar) {
        this.b = dgrsVar;
        this.c = cebqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final cjtu a(cjtu cjtuVar, cjtq cjtqVar, Optional optional) {
        cjtp cjtpVar = (cjtp) cjtr.a.createBuilder();
        cjtpVar.copyOnWrite();
        cjtr cjtrVar = (cjtr) cjtpVar.instance;
        cjtrVar.e = cjtqVar.a();
        cjtrVar.b |= 4;
        evvp evvpVarC = evxc.c(dhkl.a().longValue());
        cjtpVar.copyOnWrite();
        cjtr cjtrVar2 = (cjtr) cjtpVar.instance;
        evvpVarC.getClass();
        cjtrVar2.c = evvpVarC;
        cjtrVar2.b |= 1;
        if (optional.isPresent()) {
            Object obj = optional.get();
            cjtpVar.copyOnWrite();
            cjtr cjtrVar3 = (cjtr) cjtpVar.instance;
            cjtrVar3.d = (evvp) obj;
            cjtrVar3.b |= 2;
        }
        evtg evtgVar = cjtuVar.d;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < evtgVar.size(); i++) {
            if (i == evtgVar.size() - 1) {
                cjtm cjtmVar = (cjtm) cjtt.a.createBuilder((cjtt) evtgVar.get(i));
                cjtr cjtrVar4 = (cjtr) cjtpVar.build();
                cjtmVar.copyOnWrite();
                cjtt cjttVar = (cjtt) cjtmVar.instance;
                cjtrVar4.getClass();
                cjttVar.d = cjtrVar4;
                cjttVar.b |= 2;
                arrayList.add((cjtt) cjtmVar.build());
            } else {
                arrayList.add((cjtt) evtgVar.get(i));
            }
        }
        cjtl cjtlVar = (cjtl) cjtu.a.createBuilder(cjtuVar);
        cjtlVar.copyOnWrite();
        ((cjtu) cjtlVar.instance).d = cjtu.emptyProtobufList();
        cjtlVar.a(arrayList);
        return cjtlVar.build();
    }

    public final Optional b(cjtu cjtuVar) {
        evtg evtgVar = cjtuVar.d;
        return evtgVar.isEmpty() ? Optional.empty() : Optional.of((cjtt) ekis.j(evtgVar));
    }

    final void c(String str) {
        dgrs dgrsVar = this.b;
        cjtu cjtuVarB = dgrsVar.b(str);
        Optional optionalB = b(cjtuVarB);
        if (optionalB.isPresent() && (((cjtt) optionalB.get()).b & 2) == 0) {
            dgrsVar.t(str, a(cjtuVarB, cjtq.OTP_REQUEST_WITH_ADDITIONAL_QUOTA_COMPLETE, Optional.empty()));
            ((eksl) ((eksl) a.h()).h("com/google/android/ims/provisioning/engine/ForcePhoneNumberVerificationUtil", "handleIfVerificationRequestSuccessful", 121, "ForcePhoneNumberVerificationUtil.java")).q("Force verification request successful. Storing record.");
        }
    }

    public final boolean d(String str) {
        int iB;
        Optional optionalB = b(this.b.b(str));
        if (optionalB.isEmpty()) {
            return false;
        }
        boolean z = (((cjtt) optionalB.get()).b & 1) != 0 && (((cjtt) optionalB.get()).b & 2) == 0;
        return dfpi.z() ? this.c.c(str).y : dfog.z() ? z && (iB = cjts.b(((cjtt) optionalB.get()).e)) != 0 && iB == 4 : z;
    }
}
