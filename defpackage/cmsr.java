package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmsr implements cmpl {
    private final efob a;
    private final atak b;
    private final fcsu c;
    private final aqzt d;

    public cmsr(efob efobVar, atak atakVar, fcsu fcsuVar, aqzt aqztVar) {
        this.a = efobVar;
        this.b = atakVar;
        this.c = fcsuVar;
        this.d = aqztVar;
    }

    @Override // defpackage.cmpl
    public final eiju b(aucl auclVar, MessageCoreData messageCoreData, asrg asrgVar) {
        if (this.d.a()) {
            aucj aucjVar = auclVar.c;
            if (aucjVar == null) {
                aucjVar = aucj.a;
            }
            if ((aucjVar.b & 4) != 0) {
                aubs aubsVar = (aubs) aubt.a.createBuilder();
                aubv aubvVar = (aubv) aubx.a.createBuilder();
                aubvVar.copyOnWrite();
                aubx aubxVar = (aubx) aubvVar.instance;
                aubxVar.b |= 1;
                aubxVar.c = "application";
                aubvVar.copyOnWrite();
                aubx aubxVar2 = (aubx) aubvVar.instance;
                aubxVar2.b |= 2;
                aubxVar2.d = "vnd.gsma.rcs-ft-http+xml";
                aubsVar.copyOnWrite();
                aubt aubtVar = (aubt) aubsVar.instance;
                aubx aubxVar3 = (aubx) aubvVar.build();
                aubxVar3.getClass();
                aubtVar.c = aubxVar3;
                aubtVar.b |= 1;
                aucj aucjVar2 = auclVar.c;
                if (aucjVar2 == null) {
                    aucjVar2 = aucj.a;
                }
                evqs evqsVar = aucjVar2.h;
                aubsVar.copyOnWrite();
                aubt aubtVar2 = (aubt) aubsVar.instance;
                evqsVar.getClass();
                aubtVar2.b |= 2;
                aubtVar2.d = evqsVar;
                return eijx.e((aubt) aubsVar.build());
            }
        }
        atam atamVar = new atam();
        aucj aucjVar3 = auclVar.c;
        if (aucjVar3 == null) {
            aucjVar3 = aucj.a;
        }
        FileInformation fileInformationI = (FileInformation) atamVar.fM(aucjVar3);
        MessagePartCoreData messagePartCoreDataH = messageCoreData.H();
        if (messagePartCoreDataH != null && messagePartCoreDataH.aY()) {
            efir efirVarC = fileInformationI.c();
            efirVarC.b(Duration.ofMillis(messagePartCoreDataH.k()));
            fileInformationI = efirVarC.i();
        }
        efho efhoVar = new efho();
        efhoVar.c(fileInformationI);
        if ((auclVar.b & 2) != 0) {
            aucj aucjVar4 = auclVar.d;
            if (aucjVar4 == null) {
                aucjVar4 = aucj.a;
            }
            efhoVar.e((FileInformation) atamVar.fM(aucjVar4));
        }
        try {
            efnd efndVarB = this.a.b(FileTransferInformation.class).b(efhoVar.a());
            ((ains) this.c.b()).e("Bugle.Etouffee.FileTransfer.Format.Outgoing", cmoj.a(5));
            return eijx.e((aubt) this.b.fM(efndVarB));
        } catch (efoc e) {
            throw new cmph(e);
        }
    }
}
