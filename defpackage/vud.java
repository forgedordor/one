package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vud {
    public static final int a(vvl vvlVar, dltc dltcVar, doif doifVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (fdbq.f(doifVar, doid.a)) {
            i = 1;
        } else if (fdbq.f(doifVar, doie.a)) {
            i = 2;
        } else {
            if ((doifVar instanceof dohz) || fdbq.f(doifVar, doia.a)) {
                ekrw ekrwVarG = vuh.a.g();
                ekrwVarG.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor$Companion", "getAddingComposeCuiType", 397, "ViewModelAttachmentJourneyMonitor.kt")).D("Attachment %s with type %s has no adding ComposeCuiType", vvlVar, doifVar);
                return 0;
            }
            if (doifVar != null) {
                throw new fctg();
            }
            i = 3;
        }
        if (!(dltcVar instanceof dmbs)) {
            ekrw ekrwVarG2 = vuh.a.g();
            ekrwVarG2.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarG2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor$Companion", "getAddingComposeCuiType", 407, "ViewModelAttachmentJourneyMonitor.kt")).D("Attachment %s with source %s has no adding ComposeCuiType", vvlVar, dltcVar);
            return 0;
        }
        dmbs dmbsVar = (dmbs) dltcVar;
        if (fdbq.f(dmbsVar, dmbp.a)) {
            i2 = 12;
            i3 = 11;
            i4 = 13;
        } else {
            if (!fdbq.f(dmbsVar, dmbr.a)) {
                throw new fctg();
            }
            i2 = 15;
            i3 = 14;
            i4 = 16;
        }
        int i5 = i - 1;
        return i5 != 0 ? i5 != 1 ? i4 : i2 : i3;
    }

    public static final int b(vvr vvrVar) {
        return a(vvrVar.c, vvrVar.a.fo(), vvt.b(vvrVar));
    }
}
