package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnds {
    public static final void a(aubl aublVar, String str) {
        aubk aubkVarB = aubk.b(aublVar.c);
        if (aubkVarB == null) {
            aubkVarB = aubk.UNKNOWN_STATUS;
        }
        aubkVarB.getClass();
        if (!cnef.b.contains(aubkVarB)) {
            throw new IllegalStateException("IncomingChatApi returned an unexpected status: " + aubkVarB.f);
        }
        aubk aubkVarB2 = aubk.b(aublVar.c);
        if (aubkVarB2 == null) {
            aubkVarB2 = aubk.UNKNOWN_STATUS;
        }
        if (aubkVarB2 == aubk.FAILED_PERMANENTLY) {
            ekrw ekrwVarJ = cnef.a.j();
            ekrwVarJ.X(eksq.a, "BugleTachygram");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/tachygram/chat/TachygramGroupHandlerChapiAdapterKt$Companion", "checkIncomingChatApiStatus", 464, "TachygramGroupHandlerChapiAdapterKt.kt")).t("Chat API failed to process GroupEvent for %s", str);
        }
    }

    public static final List b(Iterable iterable) {
        ejvj ejvjVarFH = new cnbb().fH();
        ArrayList arrayList = new ArrayList(fcva.p(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ezol ezolVar = (ezol) it.next();
            felm felmVarB = felm.b(ezolVar.b);
            if (felmVarB == null) {
                felmVarB = felm.UNRECOGNIZED;
            }
            if (felmVarB == felm.GROUP_ID) {
                throw new IllegalStateException("A ChatEndpoint participant of a group should not be of type GROUP_ID.");
            }
            Object objFM = ejvjVarFH.fM(ezolVar);
            if (objFM == null) {
                throw new IllegalStateException("Required value was null.");
            }
            arrayList.add((aubq) objFM);
        }
        return arrayList;
    }
}
