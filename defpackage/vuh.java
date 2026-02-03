package defpackage;

import androidx.car.app.hardware.info.EnergyProfile;
import j$.time.Duration;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vuh implements vth {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor");
    public final eygg b;
    public final eygg c;
    private final fdjx d;
    private final vul e;
    private final eygg f;
    private final eygg g;
    private final aqhi h;
    private final ejya i;

    public vuh(fdjx fdjxVar, vul vulVar, eygg eyggVar, eygg eyggVar2, aqhi aqhiVar, ejya ejyaVar, eygg eyggVar3, eygg eyggVar4) {
        fdjxVar.getClass();
        vulVar.getClass();
        eyggVar.getClass();
        eyggVar2.getClass();
        eyggVar3.getClass();
        eyggVar4.getClass();
        this.d = fdjxVar;
        this.e = vulVar;
        this.f = eyggVar;
        this.g = eyggVar2;
        this.h = aqhiVar;
        this.i = ejyaVar;
        this.b = eyggVar3;
        this.c = eyggVar4;
    }

    @Override // defpackage.vth
    @fcsv
    public final void a(vvl vvlVar) {
        if (this.h.a()) {
            return;
        }
        ekrg ekrgVar = a;
        ekrw ekrwVarG = ekrgVar.g();
        ekrz ekrzVar = eksq.a;
        ekrwVarG.X(ekrzVar, "BugleComposeRow2");
        ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "deprecatedOnAddStart", 151, "ViewModelAttachmentJourneyMonitor.kt")).t("ViewModelAttachmentJourneyMonitor.deprecatedOnAddStart for %s", vvlVar);
        ConcurrentHashMap concurrentHashMap = this.e.a;
        if (concurrentHashMap.size() > 16) {
            ekrw ekrwVarJ = ekrgVar.j();
            ekrwVarJ.X(ekrzVar, "BugleComposeRow2");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "deprecatedOnAddStart", 156, "ViewModelAttachmentJourneyMonitor.kt")).w("ViewModelAttachmentJourneyMonitorState.adding already has %d elements: %s", concurrentHashMap.size(), concurrentHashMap);
        }
        if (((vuj) concurrentHashMap.putIfAbsent(vvlVar, new vuj(null))) != null) {
            ekrw ekrwVarJ2 = ekrgVar.j();
            ekrwVarJ2.X(ekrzVar, "BugleComposeRow2");
            ((ekrd) ekrwVarJ2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "deprecatedOnAddStart", 166, "ViewModelAttachmentJourneyMonitor.kt")).t("ViewModelAttachmentJourneyMonitor.deprecatedOnAddStart called multiple times for %s", vvlVar);
        }
    }

    @Override // defpackage.vth
    public final void b(vvs vvsVar, int i) {
        vvsVar.getClass();
        if (((vuj) this.e.a.remove(vvsVar.a())) == null) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "onAddFailed", 210, "ViewModelAttachmentJourneyMonitor.kt")).t("ViewModelAttachmentJourneyMonitor skipping onAddFailed logging, no AddingState for %s", vvsVar);
        } else {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "onAddFailed", 218, "ViewModelAttachmentJourneyMonitor.kt")).t("ViewModelAttachmentJourneyMonitor.onAddFailed for %s", vvsVar.a());
            vtm vtmVar = (vtm) this.f.b();
            auvw.k(vtmVar.a, null, null, new vtj(vtmVar, vvsVar, i, null), 3);
        }
    }

    @Override // defpackage.vth
    public final void c(vvl vvlVar) {
        if (this.h.a()) {
            vui vuiVar = (vui) this.e.b.remove(vvlVar);
            if (vuiVar == null) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "onAddRenderFailed", 274, "ViewModelAttachmentJourneyMonitor.kt")).t("ViewModelAttachmentJourneyMonitor skipping onAddRenderFailed logging, no AddRenderingState for %s", vvlVar);
                return;
            }
            ekrg ekrgVar = a;
            ekrw ekrwVarH = ekrgVar.h();
            ekrz ekrzVar = eksq.a;
            ekrwVarH.X(ekrzVar, "BugleComposeRow2");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "onAddRenderFailed", 280, "ViewModelAttachmentJourneyMonitor.kt")).t("ViewModelAttachmentJourneyMonitor.onAddRenderFailed for %s", vvlVar);
            int iB = vud.b(vuiVar.b);
            if (iB != 0) {
                auvw.k(this.d, null, null, new vue(this, iB, null), 3);
                return;
            }
            ekrw ekrwVarG = ekrgVar.g();
            ekrwVarG.X(ekrzVar, "BugleComposeRow2");
            ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "onAddRenderFailed", 286, "ViewModelAttachmentJourneyMonitor.kt")).t("Skipping CUI logging for onAddRenderFailed of %s because of null composeCuiType", vvlVar);
        }
    }

    @Override // defpackage.vth
    public final void d(vvl vvlVar) {
        if (this.h.a()) {
            vui vuiVar = (vui) this.e.b.remove(vvlVar);
            if (vuiVar == null) {
                ekrw ekrwVarJ = a.j();
                ekrwVarJ.X(eksq.a, "BugleComposeRow2");
                ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "onAddRenderSucceeded", 232, "ViewModelAttachmentJourneyMonitor.kt")).t("ViewModelAttachmentJourneyMonitor skipping onAddRenderSucceeded logging, no AddRenderingState for %s", vvlVar);
                return;
            }
            ekrg ekrgVar = a;
            ekrw ekrwVarH = ekrgVar.h();
            ekrz ekrzVar = eksq.a;
            ekrwVarH.X(ekrzVar, "BugleComposeRow2");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "onAddRenderSucceeded", 240, "ViewModelAttachmentJourneyMonitor.kt")).t("ViewModelAttachmentJourneyMonitor.onAddRenderSucceeded for %s", vvlVar);
            ejxm ejxmVar = vuiVar.a;
            Duration durationD = ejxmVar != null ? ejxmVar.d() : null;
            int iB = vud.b(vuiVar.b);
            if (iB != 0) {
                auvw.k(this.d, null, null, new vuf(this, iB, durationD, null), 3);
                return;
            }
            ekrw ekrwVarG = ekrgVar.g();
            ekrwVarG.X(ekrzVar, "BugleComposeRow2");
            ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "onAddRenderSucceeded", 247, "ViewModelAttachmentJourneyMonitor.kt")).t("Skipping CUI logging for onAddRenderSucceeded of %s because of null composeCuiType", vvlVar);
        }
    }

    @Override // defpackage.vth
    public final void e(vvr vvrVar, int i) {
        vvrVar.getClass();
        vul vulVar = this.e;
        ConcurrentHashMap concurrentHashMap = vulVar.a;
        vvl vvlVar = vvrVar.c;
        vuj vujVar = (vuj) concurrentHashMap.remove(vvlVar);
        if (vujVar == null) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "onAddSucceeded", 178, "ViewModelAttachmentJourneyMonitor.kt")).t("ViewModelAttachmentJourneyMonitor skipping onAddSucceeded logging, no AddingState for %s", vvrVar);
            return;
        }
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleComposeRow2");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "onAddSucceeded", 186, "ViewModelAttachmentJourneyMonitor.kt")).t("ViewModelAttachmentJourneyMonitor.onAddSucceeded for %s", vvlVar);
        if (this.h.a()) {
            ConcurrentHashMap concurrentHashMap2 = vulVar.b;
            if (concurrentHashMap2.size() > 16) {
                ekrw ekrwVarJ2 = ekrgVar.j();
                ekrwVarJ2.X(ekrzVar, "BugleComposeRow2");
                ((ekrd) ekrwVarJ2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "onAddSucceeded", 192, "ViewModelAttachmentJourneyMonitor.kt")).w("ViewModelAttachmentJourneyMonitorState.addRendering already has %d elements: %s", concurrentHashMap2.size(), concurrentHashMap2);
            }
            concurrentHashMap2.put(vvlVar, new vui(vujVar.a, vvrVar));
        }
        vtm vtmVar = (vtm) this.f.b();
        auvw.k(vtmVar.a, null, null, new vtk(vtmVar, vvrVar, i, null), 3);
    }

    @Override // defpackage.vth
    public final void f(vvs vvsVar, int i) {
        vvsVar.getClass();
        vuk vukVar = (vuk) this.e.c.remove(vvsVar.a());
        if (vukVar == null) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "onRemoveSucceeded", 328, "ViewModelAttachmentJourneyMonitor.kt")).t("ViewModelAttachmentJourneyMonitor skipping onRemoveSucceeded logging, no RemovingState for %s", vvsVar);
        } else {
            ekrw ekrwVarH = a.h();
            ekrwVarH.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "onRemoveSucceeded", 338, "ViewModelAttachmentJourneyMonitor.kt")).t("ViewModelAttachmentJourneyMonitor.onRemoveSucceeded for %s", vvsVar);
            vtm vtmVar = (vtm) this.f.b();
            auvw.k(vtmVar.a, null, null, new vtl(vtmVar, vvsVar, vukVar.a, i, null), 3);
        }
    }

    @Override // defpackage.vth
    public final void g(vvl vvlVar, int i) {
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleComposeRow2");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "onRemoveStart", 304, "ViewModelAttachmentJourneyMonitor.kt")).t("ViewModelAttachmentJourneyMonitor.onRemoveStart for %s", vvlVar);
        ConcurrentHashMap concurrentHashMap = this.e.c;
        if (concurrentHashMap.size() > 16) {
            ekrw ekrwVarJ = ekrgVar.j();
            ekrwVarJ.X(ekrzVar, "BugleComposeRow2");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "onRemoveStart", 308, "ViewModelAttachmentJourneyMonitor.kt")).w("ViewModelAttachmentJourneyMonitorState.removing already has %d elements: %s", concurrentHashMap.size(), concurrentHashMap);
        }
        if (((vuk) concurrentHashMap.putIfAbsent(vvlVar, new vuk(i))) != null) {
            ekrw ekrwVarJ2 = ekrgVar.j();
            ekrwVarJ2.X(ekrzVar, "BugleComposeRow2");
            ((ekrd) ekrwVarJ2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "onRemoveStart", 319, "ViewModelAttachmentJourneyMonitor.kt")).t("ViewModelAttachmentJourneyMonitor.onRemoveStart called multiple times for %s", vvlVar);
        }
    }

    @Override // defpackage.vvj
    public final vvl h(dnhn dnhnVar) {
        if (dnhnVar instanceof vsy) {
            return ((vsy) dnhnVar).a;
        }
        if (dnhnVar instanceof vty) {
            return null;
        }
        Objects.toString(dnhnVar);
        throw new UnsupportedOperationException("Unrecognized AttachmentAnalyticsPacket implementation ".concat(dnhnVar.toString()));
    }

    @Override // defpackage.vvj
    public final /* synthetic */ vvl i(dltc dltcVar, doif doifVar) {
        return vvi.a(this, dltcVar, doifVar);
    }

    @Override // defpackage.vvj
    public final vvl j(dltc dltcVar, doif doifVar) {
        dltcVar.getClass();
        if (this.h.a()) {
            return vvi.a(this, dltcVar, doifVar);
        }
        return null;
    }

    @Override // defpackage.vvj
    public final dnhn k(dltc dltcVar, doif doifVar) {
        dltcVar.getClass();
        if (this.h.a()) {
            return l(dltcVar, doifVar);
        }
        return null;
    }

    @Override // defpackage.dnhr
    public final dnhn l(dltc dltcVar, doif doifVar) {
        ConcurrentHashMap concurrentHashMap = this.e.a;
        if (concurrentHashMap.size() > 16) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleComposeRow2");
            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "onAddStart", 77, "ViewModelAttachmentJourneyMonitor.kt")).w("ViewModelAttachmentJourneyMonitorState.adding already has %d elements: %s", concurrentHashMap.size(), concurrentHashMap);
        }
        ejya ejyaVar = this.i;
        eygg eyggVar = this.g;
        ejxm ejxmVarC = ejxm.c(ejyaVar);
        vvl vvlVarA = vuc.a();
        concurrentHashMap.put(vvlVarA, new vuj(ejxmVarC));
        ekrg ekrgVar = a;
        ekrw ekrwVarH = ekrgVar.h();
        ekrz ekrzVar = eksq.a;
        ekrwVarH.X(ekrzVar, "BugleComposeRow2");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.Z(eksk.SMALL);
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "onAddStart", 91, "ViewModelAttachmentJourneyMonitor.kt")).I("ViewModelAttachmentJourneyMonitor.onAddStart for %s, %s, %s", vvlVarA, dltcVar, doifVar);
        int iA = vud.a(vvlVarA, dltcVar, doifVar);
        if (iA == 0) {
            ekrw ekrwVarG = ekrgVar.g();
            ekrwVarG.X(ekrzVar, "BugleComposeRow2");
            ((ekrd) ekrwVarG.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/ViewModelAttachmentJourneyMonitor", "onAddStart", EnergyProfile.EVCONNECTOR_TYPE_OTHER, "ViewModelAttachmentJourneyMonitor.kt")).t("Skipping CUI logging for onAddStart of %s because of null composeCuiType", vvlVarA);
        } else {
            auvw.k(this.d, null, null, new vug(this, iA, null), 3);
        }
        return new vsy(vvlVarA);
    }
}
