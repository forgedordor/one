package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileTransferInformation;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbts implements cbtz {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/e2ee/incoming/EncryptedFileTransferRouter");
    private final atak b;
    private final cbqh c;
    private final Set d;
    private final fcsu e;

    public cbts(atak atakVar, cbqh cbqhVar, Set set, fcsu fcsuVar) {
        atakVar.getClass();
        cbqhVar.getClass();
        set.getClass();
        fcsuVar.getClass();
        this.b = atakVar;
        this.c = cbqhVar;
        this.d = set;
        this.e = fcsuVar;
        ContentType contentType = efnf.a;
    }

    @Override // defpackage.cbtz
    public final Object a(atys atysVar, fcxy fcxyVar) {
        efnd efndVar = (efnd) this.b.fH().fM(atysVar.e());
        efndVar.getClass();
        if (!efndVar.a().g(efne.b)) {
            ekrw ekrwVarI = a.i();
            ekrwVarI.X(eksq.a, "BugleE2ee");
            ((ekrd) ekrwVarI.h("com/google/android/apps/messaging/shared/e2ee/incoming/EncryptedFileTransferRouter", "process", 74, "EncryptedFileTransferRouter.kt")).q("Incoming message is not a file transfer.");
            return atav.FAIL_NO_RETRY;
        }
        atuy atuyVar = (atuy) atysVar;
        basd basdVarA = basd.a(atuyVar.a.j);
        try {
            FileTransferInformation fileTransferInformationC = efnf.c(efndVar);
            Iterator it = this.d.iterator();
            Object obj = null;
            boolean z = false;
            Object obj2 = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((cbty) next).e(fileTransferInformationC)) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj2 = next;
                    }
                } else if (z) {
                    obj = obj2;
                }
            }
            cbty cbtyVar = (cbty) obj;
            if (cbtyVar != null) {
                return cbtyVar.d(fileTransferInformationC, atysVar, fcxyVar);
            }
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleE2ee");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.X(cqnc.f, basdVarA);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/e2ee/incoming/EncryptedFileTransferRouter", "process", 105, "EncryptedFileTransferRouter.kt")).q("Unable to handle encrypted file with unknown protocol (or multiple handlers could handle the request)");
            return atav.FAIL_NO_RETRY;
        } catch (efoc e) {
            ekrw ekrwVarJ2 = a.j();
            ekrwVarJ2.X(eksq.a, "BugleE2ee");
            ekrd ekrdVar2 = (ekrd) ((ekrd) ekrwVarJ2).g(e);
            ekrdVar2.X(cqnc.f, basdVarA);
            ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/e2ee/incoming/EncryptedFileTransferRouter", "process", 88, "EncryptedFileTransferRouter.kt")).q("Failed to deserialize contents of a file transfer message.");
            this.c.c(basdVarA, basd.a, 4, 24, 27);
            ((asrx) this.e.b()).c(atuyVar.a);
            return atav.FAIL_NO_RETRY;
        }
    }

    @Override // defpackage.cbtz
    public final boolean b() {
        return eotp.a("bugle.enable_refactor_file_receiver", "bugle");
    }
}
