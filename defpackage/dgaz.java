package defpackage;

import android.telephony.ims.ImsReasonInfo;
import android.telephony.ims.ImsRegistrationAttributes;
import android.telephony.ims.RegistrationManager$RegistrationCallback;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dgaz extends RegistrationManager$RegistrationCallback {
    private final dgak a;

    public dgaz(dgak dgakVar) {
        this.a = dgakVar;
    }

    public final void onRegistered(ImsRegistrationAttributes imsRegistrationAttributes) {
        this.a.b(imsRegistrationAttributes, true);
    }

    public final void onRegistering(ImsRegistrationAttributes imsRegistrationAttributes) {
        this.a.b(imsRegistrationAttributes, false);
    }

    public final void onTechnologyChangeFailed(int i, ImsReasonInfo imsReasonInfo) {
        ewid ewidVar = (ewid) ewif.a.createBuilder();
        ewidVar.copyOnWrite();
        ewif ewifVar = (ewif) ewidVar.instance;
        ewifVar.c = 4;
        ewifVar.b |= 1;
        ewha ewhaVar = (ewha) ewhd.a.createBuilder();
        ewhaVar.copyOnWrite();
        ewhd ewhdVar = (ewhd) ewhaVar.instance;
        ewhdVar.d = dgak.c(i) - 1;
        ewhdVar.b |= 1;
        ewidVar.copyOnWrite();
        ewif ewifVar2 = (ewif) ewidVar.instance;
        ewhd ewhdVar2 = (ewhd) ewhaVar.build();
        ewhdVar2.getClass();
        ewifVar2.d = ewhdVar2;
        ewifVar2.b |= 2;
        ewgy ewgyVar = (ewgy) ewgz.a.createBuilder();
        int code = imsReasonInfo.getCode();
        ewgyVar.copyOnWrite();
        ewgz ewgzVar = (ewgz) ewgyVar.instance;
        ewgzVar.b |= 1;
        ewgzVar.c = code;
        int extraCode = imsReasonInfo.getExtraCode();
        ewgyVar.copyOnWrite();
        ewgz ewgzVar2 = (ewgz) ewgyVar.instance;
        ewgzVar2.b |= 2;
        ewgzVar2.d = extraCode;
        ewidVar.copyOnWrite();
        ewif ewifVar3 = (ewif) ewidVar.instance;
        ewgz ewgzVar3 = (ewgz) ewgyVar.build();
        ewgzVar3.getClass();
        ewifVar3.e = ewgzVar3;
        ewifVar3.b |= 4;
        this.a.a((ewif) ewidVar.build());
    }

    public final void onUnregistered(ImsReasonInfo imsReasonInfo) {
        ewid ewidVar = (ewid) ewif.a.createBuilder();
        ewidVar.copyOnWrite();
        ewif ewifVar = (ewif) ewidVar.instance;
        ewifVar.c = 3;
        ewifVar.b |= 1;
        ewgy ewgyVar = (ewgy) ewgz.a.createBuilder();
        int code = imsReasonInfo.getCode();
        ewgyVar.copyOnWrite();
        ewgz ewgzVar = (ewgz) ewgyVar.instance;
        ewgzVar.b |= 1;
        ewgzVar.c = code;
        int extraCode = imsReasonInfo.getExtraCode();
        ewgyVar.copyOnWrite();
        ewgz ewgzVar2 = (ewgz) ewgyVar.instance;
        ewgzVar2.b |= 2;
        ewgzVar2.d = extraCode;
        ewidVar.copyOnWrite();
        ewif ewifVar2 = (ewif) ewidVar.instance;
        ewgz ewgzVar3 = (ewgz) ewgyVar.build();
        ewgzVar3.getClass();
        ewifVar2.e = ewgzVar3;
        ewifVar2.b |= 4;
        this.a.a((ewif) ewidVar.build());
    }
}
