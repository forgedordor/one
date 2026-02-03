package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uht implements uhr {
    private final bahv a;
    private final baii b;

    public uht(bahv bahvVar, baii baiiVar) {
        this.a = bahvVar;
        this.b = baiiVar;
    }

    @Override // defpackage.uhr
    public final MessagePartCoreData a(amsv amsvVar, czen czenVar) {
        MessagePartData pendingAttachmentData;
        bahx bahxVarD = bahy.D();
        uhx uhxVar = (uhx) amsvVar;
        bacm bacmVar = (bacm) bahxVarD;
        bacmVar.c = uhxVar.a;
        Uri uri = uhxVar.b;
        bacmVar.d = uri;
        bacmVar.e = uri;
        bahxVarD.n(uhxVar.c);
        bahxVarD.g(uhxVar.d);
        bacmVar.l = uhxVar.e;
        MessagePartData messagePartDataC = this.a.c(bahxVarD.q());
        if (cqmz.o(uri)) {
            baii baiiVar = this.b;
            cqxl cqxlVar = (cqxl) baiiVar.a.b();
            cqxlVar.getClass();
            Context context = (Context) baiiVar.b.b();
            context.getClass();
            cqmp cqmpVar = (cqmp) baiiVar.c.b();
            cqmpVar.getClass();
            cmum cmumVar = (cmum) baiiVar.d.b();
            cmumVar.getClass();
            cqmz cqmzVar = (cqmz) baiiVar.e.b();
            cqmzVar.getClass();
            bahv bahvVar = (bahv) baiiVar.f.b();
            bahvVar.getClass();
            bxfu bxfuVar = (bxfu) baiiVar.g.b();
            bxfuVar.getClass();
            cmtv cmtvVar = (cmtv) baiiVar.i.b();
            cmtvVar.getClass();
            baii baiiVar2 = (baii) baiiVar.w.b();
            baiiVar2.getClass();
            cqsu cqsuVar = (cqsu) baiiVar.j.b();
            cqsuVar.getClass();
            cogw cogwVar = (cogw) baiiVar.k.b();
            cogwVar.getClass();
            crqx crqxVar = (crqx) baiiVar.l.b();
            crqxVar.getClass();
            cqok cqokVar = (cqok) baiiVar.m.b();
            cqokVar.getClass();
            Optional optional = (Optional) ((eyig) baiiVar.n).a;
            cqxp cqxpVar = (cqxp) baiiVar.o.b();
            cqxpVar.getClass();
            eosc eoscVar = (eosc) baiiVar.p.b();
            eoscVar.getClass();
            apsl apslVar = (apsl) baiiVar.q.b();
            apslVar.getClass();
            aqbx aqbxVar = (aqbx) baiiVar.s.b();
            aqbxVar.getClass();
            pendingAttachmentData = new PendingAttachmentData(cqxlVar, context, cqmpVar, cmumVar, cqmzVar, bahvVar, bxfuVar, baiiVar.h, cmtvVar, baiiVar2, cqsuVar, cogwVar, crqxVar, cqokVar, optional, cqxpVar, eoscVar, apslVar, baiiVar.r, messagePartDataC, aqbxVar);
        } else {
            pendingAttachmentData = messagePartDataC;
        }
        if (pendingAttachmentData.h == null) {
            pendingAttachmentData.h = czek.a(amsvVar, czenVar);
        }
        return pendingAttachmentData;
    }
}
