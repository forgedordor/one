package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctxg {
    public static final boolean a(List list) {
        if (list.size() == 1) {
            return false;
        }
        Iterator it = list.iterator();
        boolean z = true;
        boolean z2 = true;
        while (it.hasNext()) {
            anyy anyyVar = (anyy) it.next();
            z = z && anyyVar.q();
            z2 = z2 && anyyVar.r();
        }
        return z && z2;
    }

    public static final void b(List list) {
        boolean z = false;
        boolean z2 = true;
        if (list.size() == 1) {
            anyy anyyVar = (anyy) list.get(0);
            ekrw ekrwVarH = ctxr.a.h();
            ekrwVarH.X(eksq.a, "BugleContacts");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl$Companion", "log", 420, "ChatStarterImpl.kt")).t("Opening a 1-1 conversation, rcsEnabledCap: %b", Boolean.valueOf(anyyVar.q()));
            return;
        }
        Iterator it = list.iterator();
        boolean z3 = true;
        boolean z4 = true;
        while (it.hasNext()) {
            anyy anyyVar2 = (anyy) it.next();
            z3 = z3 && anyyVar2.q();
            z4 = z4 && anyyVar2.r();
        }
        if (!z3) {
            ekrw ekrwVarH2 = ctxr.a.h();
            ekrwVarH2.X(eksq.a, "BugleContacts");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl$Companion", "log", 390, "ChatStarterImpl.kt")).q("attempting the creation of an MMS group");
            z2 = z;
        } else if (z4) {
            ekrw ekrwVarH3 = ctxr.a.h();
            ekrwVarH3.X(eksq.a, "BugleContacts");
            ((ekrd) ekrwVarH3.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl$Companion", "log", 388, "ChatStarterImpl.kt")).q("attempting the creation of an RCS group");
            z4 = true;
        } else {
            z4 = false;
            z = true;
            ekrw ekrwVarH22 = ctxr.a.h();
            ekrwVarH22.X(eksq.a, "BugleContacts");
            ((ekrd) ekrwVarH22.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl$Companion", "log", 390, "ChatStarterImpl.kt")).q("attempting the creation of an MMS group");
            z2 = z;
        }
        ekrw ekrwVarH4 = ctxr.a.h();
        ekrwVarH4.X(eksq.a, "BugleContacts");
        ((ekrd) ekrwVarH4.h("com/google/android/apps/messaging/startchat/starter/ChatStarterImpl$Companion", "log", 394, "ChatStarterImpl.kt")).I("othersCount: %d, othersRcsCapable: %b, othersGroupRcsCapable: %b", Integer.valueOf(list.size()), Boolean.valueOf(z2), Boolean.valueOf(z4));
    }
}
