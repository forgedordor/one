package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.rcs.client.messaging.data.FileInformation;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atnc implements atnb {
    private final efob a;
    private final atam b;

    public atnc(efob efobVar) {
        efobVar.getClass();
        this.a = efobVar;
        this.b = new atam();
    }

    @Override // defpackage.atnb
    public final Object a(MessageCoreData messageCoreData, aucl auclVar, asrg asrgVar, fcxy fcxyVar) {
        FileInformation fileInformation;
        efoe efoeVarB = this.a.b(FileTransferInformation.class);
        efho efhoVar = new efho();
        aucj aucjVar = auclVar.c;
        if (aucjVar == null) {
            aucjVar = aucj.a;
        }
        atam atamVar = this.b;
        Object objFM = atamVar.fM(aucjVar);
        objFM.getClass();
        efir efirVarC = ((FileInformation) objFM).c();
        MessagePartCoreData messagePartCoreDataH = messageCoreData.H();
        messagePartCoreDataH.getClass();
        if (messagePartCoreDataH.aY()) {
            MessagePartCoreData messagePartCoreDataH2 = messageCoreData.H();
            messagePartCoreDataH2.getClass();
            efirVarC.b(Duration.ofMillis(messagePartCoreDataH2.k()));
        }
        efhoVar.c(efirVarC.i());
        if ((auclVar.b & 2) != 0) {
            aucj aucjVar2 = auclVar.d;
            if (aucjVar2 == null) {
                aucjVar2 = aucj.a;
            }
            Object objFM2 = atamVar.fM(aucjVar2);
            objFM2.getClass();
            fileInformation = (FileInformation) objFM2;
        } else {
            fileInformation = null;
        }
        if (fileInformation != null) {
            efhoVar.e(fileInformation);
        }
        return efoeVarB.b(efhoVar.a());
    }
}
