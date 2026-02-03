package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atla implements atjz {
    private static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsWithCache");
    private final atkz b;
    private final atna c;
    private final aqvb d;
    private final ConcurrentHashMap e;
    private final ConcurrentHashMap f;
    private final ConcurrentHashMap g;
    private final ConcurrentHashMap h;
    private final ConcurrentHashMap i;

    public atla(atkz atkzVar, fdjx fdjxVar, atna atnaVar, aqvb aqvbVar) {
        fdjxVar.getClass();
        aqvbVar.getClass();
        this.b = atkzVar;
        this.c = atnaVar;
        this.d = aqvbVar;
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        this.g = new ConcurrentHashMap();
        this.h = new ConcurrentHashMap();
        this.i = new ConcurrentHashMap();
    }

    @Override // defpackage.atjz
    public final atjx a(atir atirVar) {
        atirVar.getClass();
        return this.b.a(atirVar);
    }

    @Override // defpackage.atjz
    public final aucl b(athh athhVar) {
        aucl auclVar = (aucl) this.e.get(athhVar);
        if (auclVar == null) {
            ekrw ekrwVarJ = a.j();
            ekrwVarJ.X(eksq.a, "BugleFileTransfer");
            ekrd ekrdVar = (ekrd) ekrwVarJ;
            ekrdVar.X(coie.j, athhVar);
            ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsWithCache", "getHttpRequestResult", 80, "FileProcessingDatabaseOperationsWithCache.kt")).q("No cached file upload response.");
            return this.b.b(athhVar);
        }
        if (this.c.a(auclVar)) {
            return auclVar;
        }
        ekrw ekrwVarJ2 = a.j();
        ekrwVarJ2.X(eksq.a, "BugleFileTransfer");
        ekrd ekrdVar2 = (ekrd) ekrwVarJ2;
        ekrdVar2.X(coie.j, athhVar);
        ((ekrd) ekrdVar2.h("com/google/android/apps/messaging/shared/chatapi/filetransfer/processing/database/FileProcessingDatabaseOperationsWithCache", "getHttpRequestResult", 89, "FileProcessingDatabaseOperationsWithCache.kt")).q("Cached file upload response is invalid.");
        return null;
    }

    @Override // defpackage.atjz
    public final aucl c(MessageIdType messageIdType) {
        messageIdType.getClass();
        return this.b.c(messageIdType);
    }

    @Override // defpackage.atjz
    public final cbtf d(athh athhVar) {
        cbtf cbtfVar = (cbtf) this.h.get(athhVar);
        return cbtfVar == null ? this.b.d(athhVar) : cbtfVar;
    }

    @Override // defpackage.atjz
    public final cbtf e(athh athhVar) {
        cbtf cbtfVar = (cbtf) this.i.get(athhVar);
        return cbtfVar == null ? this.b.e(athhVar) : cbtfVar;
    }

    @Override // defpackage.atjz
    public final eyfn f(athh athhVar) {
        eyfn eyfnVar = (eyfn) this.f.get(athhVar);
        return eyfnVar == null ? this.b.f(athhVar) : eyfnVar;
    }

    @Override // defpackage.atjz
    public final eyfn g(athh athhVar) {
        eyfn eyfnVar = (eyfn) this.g.get(athhVar);
        return eyfnVar == null ? this.b.g(athhVar) : eyfnVar;
    }

    @Override // defpackage.atjz
    public final Object h(athh athhVar, boolean z, fcxy fcxyVar) {
        Object objH = this.b.h(athhVar, z, fcxyVar);
        return objH == fcyl.a ? objH : fctx.a;
    }

    @Override // defpackage.atjz
    public final Object i(athh athhVar, fcxy fcxyVar) throws Throwable {
        if (this.d.a()) {
            this.h.remove(athhVar);
            this.i.remove(athhVar);
        }
        this.e.remove(athhVar);
        this.f.remove(athhVar);
        this.g.remove(athhVar);
        Object objI = this.b.i(athhVar, fcxyVar);
        return objI == fcyl.a ? objI : fctx.a;
    }

    @Override // defpackage.atjz
    public final Object j(athh athhVar, fcxy fcxyVar) {
        return this.b.j(athhVar, fcxyVar);
    }

    @Override // defpackage.atjz
    public final Object k(athh athhVar, Uri uri, aubx aubxVar, fcxy fcxyVar) {
        return this.b.k(athhVar, uri, aubxVar, fcxyVar);
    }

    @Override // defpackage.atjz
    public final Object l(athh athhVar, cbtf cbtfVar, fcxy fcxyVar) {
        this.h.put(athhVar, cbtfVar);
        Object objL = this.b.l(athhVar, cbtfVar, fcxyVar);
        return objL == fcyl.a ? objL : fctx.a;
    }

    @Override // defpackage.atjz
    public final Object m(athh athhVar, eyfn eyfnVar, fcxy fcxyVar) {
        this.f.put(athhVar, eyfnVar);
        Object objM = this.b.m(athhVar, eyfnVar, fcxyVar);
        return objM == fcyl.a ? objM : fctx.a;
    }

    @Override // defpackage.atjz
    public final Object n(athh athhVar, aucl auclVar, fcxy fcxyVar) {
        this.e.put(athhVar, auclVar);
        Object objN = this.b.n(athhVar, auclVar, fcxyVar);
        return objN == fcyl.a ? objN : fctx.a;
    }

    @Override // defpackage.atjz
    public final Object o(athh athhVar, Uri uri, aubx aubxVar, fcxy fcxyVar) {
        Object objO = this.b.o(athhVar, uri, aubxVar, fcxyVar);
        return objO == fcyl.a ? objO : fctx.a;
    }

    @Override // defpackage.atjz
    public final Object p(athh athhVar, cbtf cbtfVar, fcxy fcxyVar) {
        this.i.put(athhVar, cbtfVar);
        Object objP = this.b.p(athhVar, cbtfVar, fcxyVar);
        return objP == fcyl.a ? objP : fctx.a;
    }

    @Override // defpackage.atjz
    public final Object q(athh athhVar, eyfn eyfnVar, fcxy fcxyVar) {
        this.g.put(athhVar, eyfnVar);
        Object objQ = this.b.q(athhVar, eyfnVar, fcxyVar);
        return objQ == fcyl.a ? objQ : fctx.a;
    }

    @Override // defpackage.atjz
    public final boolean r(MessageIdType messageIdType) {
        messageIdType.getClass();
        return this.b.r(messageIdType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.atjz
    public final boolean s(athh athhVar) {
        aucl auclVar = (aucl) this.e.get(athhVar);
        return true == (auclVar != null ? auclVar.b & 1 : this.b.s(athhVar));
    }

    @Override // defpackage.atjz
    public final boolean t(atir atirVar, aucj aucjVar) {
        atirVar.getClass();
        aucjVar.getClass();
        return this.b.t(atirVar, aucjVar);
    }

    @Override // defpackage.atjz
    public final boolean u(atir atirVar, atis atisVar) {
        return this.b.u(atirVar, atisVar);
    }
}
