package defpackage;

import android.content.Context;
import com.google.android.gms.audit.LogAuditRecordsRequest;
import com.google.android.gms.audit.internal.IAuditService;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aolr extends fcyz implements fdat {
    int a;
    final /* synthetic */ aolv b;
    final /* synthetic */ aols c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aolr(aolv aolvVar, aols aolsVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = aolvVar;
        this.c = aolsVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aolr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrw ekrwVarH = aols.a.h();
            ekrwVarH.X(eksq.a, "Bugle");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/ari/AriWorkHandler$processPendingWorkItemAsync$1", "invokeSuspend", 54, "AriWorkHandler.kt")).q("Start to process ari request");
            ArrayList arrayList = new ArrayList();
            aolv aolvVar = this.b;
            String str = aolvVar.c;
            etie etieVar = (etie) etif.a.createBuilder();
            etih etihVarA = dblt.a();
            etieVar.copyOnWrite();
            etif etifVar = (etif) etieVar.instance;
            etihVarA.getClass();
            etifVar.c = etihVarA;
            etifVar.b |= 1;
            evqs evqsVarX = evqs.x(((etif) etieVar.build()).toByteArray());
            etrf etrfVar = (etrf) etrg.a.createBuilder();
            etrfVar.copyOnWrite();
            etrg etrgVar = (etrg) etrfVar.instance;
            etrgVar.b |= 1;
            etrgVar.c = evqsVarX;
            evsn evsnVarBuild = etrfVar.build();
            evsnVarBuild.getClass();
            byte[] byteArray = ((etrg) evsnVarBuild).toByteArray();
            etre etreVar = aolvVar.d;
            if (etreVar == null) {
                etreVar = etre.a;
            }
            arrayList.add(etreVar.toByteArray());
            aols aolsVar = this.c;
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("Must specify at least one audit record.");
            }
            Object obj2 = aolsVar.b;
            final LogAuditRecordsRequest logAuditRecordsRequest = new LogAuditRecordsRequest(1, 294, str, (byte[][]) arrayList.toArray(new byte[0][]), null, byteArray);
            dciz dcizVar = new dciz();
            dcizVar.c = 6901;
            dcizVar.a = new dcir() { // from class: dblo
                @Override // defpackage.dcir
                public final void a(Object obj3, Object obj4) {
                    dblu dbluVar = (dblu) obj3;
                    int i2 = dblr.a;
                    dblq dblqVar = new dblq((defr) obj4);
                    IAuditService iAuditService = (IAuditService) dbluVar.w();
                    Context context = dbluVar.c;
                    iAuditService.logAuditRecords(logAuditRecordsRequest, dblqVar, ddlh.a());
                }
            };
            defn defnVarM = ((dcfm) obj2).m(dcizVar.a());
            this.a = 1;
            obj = auwr.a(defnVarM, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        Status status = (Status) obj;
        if (status.d()) {
            return cbcw.i();
        }
        ekrw ekrwVarJ = aols.a.j();
        ekrwVarJ.X(eksq.a, "Bugle");
        ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/ari/AriWorkHandler$processPendingWorkItemAsync$1", "invokeSuspend", 65, "AriWorkHandler.kt")).r("Failed to log audit records. status_code=%s", status.g);
        return cbcw.m();
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new aolr(this.b, this.c, fcxyVar);
    }
}
