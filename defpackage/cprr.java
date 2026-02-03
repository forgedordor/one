package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cprr implements cprj {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/util/cloudstore/CmsLocalStateCleanupProxyImpl");
    private final appi A;
    private final fdjx B;
    private final aukh C;
    private final bzvq D;
    private final bzvr E;
    private final bzvt F;
    private final bzvz G;
    private final bzvv H;
    private final bzvx I;
    private final ains J;
    private final aqfp K;
    private final caiy L;
    private final cacm M;
    private final cacg N;
    private final casf O;
    private final byya P;
    private final dqsy b;
    private final byjc c;
    private final caji d;
    private final cajx e;
    private final canl f;
    private final cajq g;
    private final cakd h;
    private final cabq i;
    private final bznm j;
    private final bzin k;
    private final caby l;
    private final cahv m;
    private final bzky n;
    private final bygf o;
    private final calx p;
    private final cako q;
    private final calv r;
    private final apom s;
    private final axky t;
    private final aurx u;
    private final caea v;
    private final cacr w;
    private final dqsn x;
    private final bzox y;
    private final aulu z;

    public cprr(dqsy dqsyVar, byya byyaVar, byjc byjcVar, caji cajiVar, cajx cajxVar, canl canlVar, cajq cajqVar, cakd cakdVar, cabq cabqVar, bznm bznmVar, bzin bzinVar, caby cabyVar, cahv cahvVar, bzky bzkyVar, bygf bygfVar, calx calxVar, cako cakoVar, calv calvVar, cpmh cpmhVar, cpuv cpuvVar, apom apomVar, axky axkyVar, aurx aurxVar, caea caeaVar, cacr cacrVar, dqsn dqsnVar, bzox bzoxVar, aulu auluVar, appi appiVar, fdjx fdjxVar, aukh aukhVar, bzvq bzvqVar, bzvr bzvrVar, bzvt bzvtVar, bzvz bzvzVar, bzvv bzvvVar, bzvx bzvxVar, ains ainsVar, aqfp aqfpVar, caiy caiyVar, cacm cacmVar, cacg cacgVar, casf casfVar) {
        dqsyVar.getClass();
        byjcVar.getClass();
        calxVar.getClass();
        calvVar.getClass();
        cpmhVar.getClass();
        cpuvVar.getClass();
        apomVar.getClass();
        axkyVar.getClass();
        aurxVar.getClass();
        caeaVar.getClass();
        dqsnVar.getClass();
        bzoxVar.getClass();
        fdjxVar.getClass();
        aukhVar.getClass();
        bzvqVar.getClass();
        bzvrVar.getClass();
        bzvtVar.getClass();
        bzvzVar.getClass();
        bzvvVar.getClass();
        bzvxVar.getClass();
        ainsVar.getClass();
        caiyVar.getClass();
        cacmVar.getClass();
        cacgVar.getClass();
        this.b = dqsyVar;
        this.P = byyaVar;
        this.c = byjcVar;
        this.d = cajiVar;
        this.e = cajxVar;
        this.f = canlVar;
        this.g = cajqVar;
        this.h = cakdVar;
        this.i = cabqVar;
        this.j = bznmVar;
        this.k = bzinVar;
        this.l = cabyVar;
        this.m = cahvVar;
        this.n = bzkyVar;
        this.o = bygfVar;
        this.p = calxVar;
        this.q = cakoVar;
        this.r = calvVar;
        this.s = apomVar;
        this.t = axkyVar;
        this.u = aurxVar;
        this.v = caeaVar;
        this.w = cacrVar;
        this.x = dqsnVar;
        this.y = bzoxVar;
        this.z = auluVar;
        this.A = appiVar;
        this.B = fdjxVar;
        this.C = aukhVar;
        this.D = bzvqVar;
        this.E = bzvrVar;
        this.F = bzvtVar;
        this.G = bzvzVar;
        this.H = bzvvVar;
        this.I = bzvxVar;
        this.J = ainsVar;
        this.K = aqfpVar;
        this.L = caiyVar;
        this.M = cacmVar;
        this.N = cacgVar;
        this.O = casfVar;
    }

    @Override // defpackage.cprj
    public final eiju a() {
        return auvw.c(this.B, fcyi.a, fdjz.a, new cprq(this, null));
    }

    @Override // defpackage.cprj
    public final Object b(fcxy fcxyVar) {
        Object objC = fdxs.c(this.w.a(0, caei.b), fcxyVar);
        return objC == fcyl.a ? objC : fctx.a;
    }

    @Override // defpackage.cprj
    public final Object c(fcxy fcxyVar) {
        Object objB = crrj.b(this.z.a, new fdap() { // from class: ault
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                ((aulv) obj).clear();
                return fctx.a;
            }
        }, fcxyVar);
        return objB == fcyl.a ? objB : fctx.a;
    }

    @Override // defpackage.cprj
    public final void d() {
        if (!this.x.i()) {
            throw new IllegalStateException("cancelCmsPersistentWorkQueuesForMultiDeviceOnly called outside of transaction");
        }
        ((cazj) this.i.a.b()).f("cms_set_feature_enabled_on_server");
    }

    @Override // defpackage.cprj
    public final void e() {
        if (!this.x.i()) {
            throw new IllegalStateException("clearStateUsedByOptOutFlow called outside of transaction");
        }
        this.t.b();
        aurx aurxVar = this.u;
        aurxVar.N();
        if (this.A.a()) {
            aurxVar.O();
        }
        ((cazj) this.v.a.b()).f("cms_multi_device_opt_out");
    }

    @Override // defpackage.cprj
    public final void f() {
        dqsn dqsnVar = this.x;
        if (!dqsnVar.i()) {
            throw new IllegalStateException("deleteCmsBackupReferences called outside of transaction");
        }
        if (!dqsnVar.i()) {
            throw new IllegalStateException("deleteCmsTablesAndQueuedItems called outside of transaction");
        }
        String[] strArr = bncb.a;
        bnbp bnbpVar = new bnbp();
        bnbpVar.e();
        bnbpVar.f("deleteCmsTablesAndQueuedItems#cms");
        bnbpVar.d();
        String[] strArr2 = bmxa.a;
        bmws bmwsVar = new bmws();
        bmwsVar.e();
        bmwsVar.f("deleteCmsTablesAndQueuedItems#cmsnotifications");
        bmwsVar.d();
        String[] strArr3 = bmvh.a;
        bmuz bmuzVar = new bmuz();
        bmuzVar.e();
        bmuzVar.f("deleteCmsTablesAndQueuedItems#cmsmedianotifications");
        bmuzVar.d();
        String[] strArr4 = bnak.a;
        bnac bnacVar = new bnac();
        bnacVar.e();
        bnacVar.f("deleteCmsTablesAndQueuedItems#cmsstatus");
        bnacVar.d();
        String[] strArr5 = bmop.a;
        bmoh bmohVar = new bmoh();
        bmohVar.e();
        bmohVar.f("deleteCmsTablesAndQueuedItems#cmsblobspendingdelete");
        bmohVar.d();
        String[] strArr6 = bprf.a;
        bpqt bpqtVar = new bpqt();
        bpqtVar.f("deleteCmsGenericWorkQueues#genericworkerqueue1");
        bpqtVar.a(new Function() { // from class: cprk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpre bpreVar = (bpre) obj;
                bpreVar.getClass();
                bpreVar.j(32);
                return bpreVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bpqtVar.d();
        bpqt bpqtVar2 = new bpqt();
        bpqtVar2.f("deleteCmsGenericWorkQueues#genericworkerqueue2");
        bpqtVar2.a(new Function() { // from class: cprl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpre bpreVar = (bpre) obj;
                bpreVar.getClass();
                bpreVar.j(64);
                return bpreVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bpqtVar2.d();
        bpqt bpqtVar3 = new bpqt();
        bpqtVar3.f("deleteCmsGenericWorkQueues#genericworkerqueue3");
        bpqtVar3.a(new Function() { // from class: cprm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpre bpreVar = (bpre) obj;
                bpreVar.getClass();
                bpreVar.j(128);
                return bpreVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bpqtVar3.d();
        int size = ((cazj) this.c.a.b()).c("cms_backup").size();
        ains ainsVar = this.J;
        ainsVar.e("Bugle.Cms.OptOut.PendingBackupItemsCount", size);
        ((cazj) this.M.a.b()).f("turn_on_bnr");
        ((cazj) this.N.a.b()).f("disable_multi_device_on_server_when_enable_bnr");
        ((cazj) this.d.a.b()).f("cms_restore_backup_key");
        ((cazj) this.e.a.b()).f("cms_restore_encryption_key");
        ((cazj) this.f.a.b()).f("cms_restore_participants");
        ((cazj) this.g.a.b()).f("cms_restore_conversations");
        ((cazj) this.h.a.b()).f("cms_restore_messages");
        ((cazj) this.j.a.b()).f("cms_key_sync");
        ((cazj) this.O.a.b()).f("cms_restore_validation_work_handler");
        ((cazj) this.k.a.b()).f("cms_batch_backup");
        ((cazj) this.l.a.b()).f("cms_set_initial_sync_status_on_server");
        ((cazj) this.n.a.b()).f("cms_drop_unscheduled_item_to_dlq");
        ((cazj) this.o.a.b()).f("backup_self_participant");
        ((cazj) this.q.a.b()).f("cms_restore_page_background");
        ((cazj) this.r.a.b()).f("cms_restore_page_foreground");
        ((cazj) this.p.a.b()).f("cms_restore_page");
        ((cazj) this.m.a.b()).f("block_on_telephony_sync");
        this.y.c();
        ainsVar.e("Bugle.Cms.OptOut.PendingMediaUploadItemsCount", this.D.a().size() + this.E.a().size() + this.F.a().size() + this.G.a().size() + this.H.a().size() + this.I.a().size());
        String[] strArr7 = bmqy.a;
        bmqm bmqmVar = new bmqm();
        bmqmVar.e();
        bmqmVar.f("deleteCmsDeadLetterQueue");
        bmqmVar.d();
        this.C.a();
        if (this.K.a()) {
            this.L.d();
        }
        if (this.s.a() && cpyl.a()) {
            ecem.b();
            String[] strArr8 = bmnn.a;
            bmnf bmnfVar = new bmnf();
            bmnfVar.e();
            bmnfVar.f("CmsBackupDependencyCacheDatabaseOperations#deleteAllRows");
            bmnfVar.d();
            ecem.b();
            String[] strArr9 = bmyr.a;
            bmyj bmyjVar = new bmyj();
            bmyjVar.e();
            bmyjVar.f("CmsBackupDependencyCacheDatabaseOperations#deleteAllRows");
            bmyjVar.d();
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleCms");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsLocalStateCleanupProxyImpl", "deleteCmsTablesAndQueuedItems", 254, "CmsLocalStateCleanupProxyImpl.kt")).q("Cleared local references to CMS data");
        if (!dqsnVar.i()) {
            throw new IllegalStateException("deleteCmsColumns called outside of transaction");
        }
        bsbs bsbsVarF = ParticipantsTable.f();
        bsbsVarF.ap("deleteCmsColumns");
        bsbsVarF.ak();
        bsbsVarF.h();
        cpyi cpyiVar = cpyi.UNKNOWN;
        bsbsVarF.i(cpyiVar);
        ContentValues contentValues = bsbsVarF.a;
        contentValues.putNull("profile_photo_blob_id");
        contentValues.putNull("profile_photo_encryption_key");
        bsbsVarF.U(new Function() { // from class: cprn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.getClass();
                bsbxVar.i(cpyi.EXCLUDED);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsbsVarF.b().e();
        String[] strArr10 = botm.a;
        bote boteVar = new bote();
        boteVar.ap("deleteCmsColumns-conversations#update");
        boteVar.ak();
        boteVar.ak();
        ContentValues contentValues2 = boteVar.a;
        contentValues2.putNull("cms_id");
        contentValues2.putNull("cms_correlation_id");
        boteVar.l(cpyiVar);
        boteVar.ad(new Function() { // from class: cpro
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                botl botlVar = (botl) obj;
                botlVar.getClass();
                botlVar.i(cpyi.EXCLUDED);
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        boteVar.b().e();
        String[] strArr11 = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("deleteCmsColumns-messages#update");
        brduVar.ak();
        ContentValues contentValues3 = brduVar.a;
        contentValues3.putNull("cms_id");
        brduVar.m(cpyiVar);
        contentValues3.putNull("cms_correlation_id");
        brduVar.X(new Function() { // from class: cprp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                brecVar.getClass();
                brecVar.l(cpyi.EXCLUDED);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brduVar.b().e();
        String[] strArr12 = PartsTable.a;
        bsjh bsjhVar = new bsjh();
        bsjhVar.ap("deleteCmsColumns-parts#update");
        bsjhVar.ak();
        ContentValues contentValues4 = bsjhVar.a;
        contentValues4.putNull("cms_compressed_blob_id");
        contentValues4.putNull("cms_compressed_media_encryption_key");
        contentValues4.putNull("cms_full_size_blob_id");
        contentValues4.putNull("cms_media_encryption_key");
        bsjhVar.b().e();
    }

    @Override // defpackage.cprj
    public final void g() {
        if (!this.x.i()) {
            throw new IllegalStateException("dropCMSBackupTriggers called outside of transaction");
        }
        byya byyaVar = this.P;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Set) byyaVar.a.b()).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((bzaf) it.next()).b());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.b.v((String) it2.next());
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleCms");
        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsLocalStateCleanupProxyImpl", "dropCmsBackupTriggers", 151, "CmsLocalStateCleanupProxyImpl.kt")).q("Removed triggers");
    }
}
