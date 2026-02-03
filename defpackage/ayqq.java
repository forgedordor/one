package defpackage;

import android.net.Uri;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayqq {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/datamodel/actionhelpers/DownloadedMmsRecipientsHelper");
    public final cmqj b;
    public final fcsu c;
    private final fcsu d;

    public ayqq(cmqj cmqjVar, fcsu fcsuVar, fcsu fcsuVar2) {
        cmqjVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.b = cmqjVar;
        this.c = fcsuVar;
        this.d = fcsuVar2;
    }

    public final ekhx a(Uri uri) {
        uri.getClass();
        ekhx ekhxVarE = this.b.ai(uri).e();
        ekhxVarE.getClass();
        if (!ekhxVarE.isEmpty()) {
            return ekhxVarE;
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "Bugle");
        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/DownloadedMmsRecipientsHelper", "getMessageRecipientsNotIncludingSelf", 65, "DownloadedMmsRecipientsHelper.kt")).q("Received MMS without any recipients, using unknown.");
        return new ekph("ʼUNKNOWN_SENDER!ʼ");
    }

    public final ekhx b(Uri uri) {
        uri.getClass();
        ekhx<String> ekhxVarE = this.b.ai(uri).e();
        ekhxVarE.getClass();
        ArrayList arrayList = new ArrayList(fcva.p(ekhxVarE, 10));
        for (String str : ekhxVarE) {
            arrayList.add(((alrj) this.c.b()).n(str));
        }
        ekhx ekhxVarF = ekfv.f(arrayList);
        if (!ekhxVarF.isEmpty()) {
            return ekhxVarF;
        }
        ekrw ekrwVarJ = a.j();
        ekrwVarJ.X(eksq.a, "Bugle");
        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/datamodel/actionhelpers/DownloadedMmsRecipientsHelper", "getMessageRecipientsNotIncludingSelfMi", 94, "DownloadedMmsRecipientsHelper.kt")).q("Received MMS without any recipients, using unknown.");
        return new ekph(((alrj) this.c.b()).f());
    }
}
