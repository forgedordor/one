package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atwr extends cayv {
    public static final eksp a = eksp.c("BugleGroupManagement");
    public final eosc b;
    public final eosc c;
    public final attm d;
    public final fcsu e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final cogw i;
    public final fcsu j;
    public final fcsu k;
    public final fcsu l;
    public final fcsu m;
    public final arob n;
    private final cbtr o;
    private final bbdl p;
    private final bxkp q;
    private final fcsu r;
    private final fcsu s;

    public atwr(eosc eoscVar, eosc eoscVar2, fcsu fcsuVar, attm attmVar, cbtr cbtrVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, bbdl bbdlVar, bxkp bxkpVar, fcsu fcsuVar5, cogw cogwVar, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, arob arobVar) {
        this.b = eoscVar;
        this.c = eoscVar2;
        this.k = fcsuVar;
        this.d = attmVar;
        this.o = cbtrVar;
        this.e = fcsuVar2;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        this.p = bbdlVar;
        this.q = bxkpVar;
        this.h = fcsuVar5;
        this.i = cogwVar;
        this.r = fcsuVar6;
        this.j = fcsuVar7;
        this.s = fcsuVar8;
        this.l = fcsuVar9;
        this.m = fcsuVar10;
        this.n = arobVar;
    }

    public static ekgb m(audk audkVar) {
        Stream map = Collection.EL.stream(audkVar.h).map(new atwl());
        int i = ekgb.d;
        return (ekgb) map.collect(ekcv.a);
    }

    public static String n(aufo aufoVar) {
        int i = aufoVar.b;
        int iA = aufn.a(i);
        if (iA == 0) {
            throw null;
        }
        int i2 = iA - 1;
        if (i2 == 0) {
            return (i == 1 ? (audc) aufoVar.c : audc.c).e;
        }
        if (i2 != 1) {
            return "unknown";
        }
        return (i == 2 ? (audk) aufoVar.c : audk.b).d;
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("IncomingGroupChatNotificationRequestHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return aufo.a.getParserForType();
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final String f() {
        return "incoming_chat_api_queue";
    }

    @Override // defpackage.cayv
    protected final /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        final aufo aufoVar = (aufo) evuhVar;
        eieu eieuVarK = eiiy.k("IncomingGroupChatNotificationRequestHandler#processPendingWorkItemAsync");
        try {
            eieu eieuVarK2 = eiiy.k("IncomingGroupChatNotificationRequestHandler#ensureProvisioningEngineIsInitialized");
            try {
                eiju eijuVarG = eiju.g(((dggw) this.s.b()).g());
                eieuVarK2.b(eijuVarG);
                eieuVarK2.close();
                eiju eijuVarI = eijuVarG.i(new eooz() { // from class: atwh
                    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
                    /* JADX WARN: Removed duplicated region for block: B:67:0x00d9  */
                    @Override // defpackage.eooz
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final com.google.common.util.concurrent.ListenableFuture a(java.lang.Object r6) {
                        /*
                            Method dump skipped, instructions count: 276
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.atwh.a(java.lang.Object):com.google.common.util.concurrent.ListenableFuture");
                    }
                }, this.b);
                eieuVarK.b(eijuVarI);
                eieuVarK.close();
                return eijuVarI;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ParticipantsTable.BindData k(aubq aubqVar, atrj atrjVar) {
        aubq aubqVarC = atrjVar.c();
        brvp brvpVarF = bbbd.f(aubqVar.d);
        if (!aubqVar.equals(aubqVarC)) {
            brvpVarF.v(((bbca) this.r.b()).j(brvpVarF));
            this.q.e(brvpVarF, 3);
            return brvpVarF.a();
        }
        axcy axcyVarE = this.p.e(atrjVar.b());
        axcyVarE.getClass();
        brvpVarF.T(axcyVarE.e());
        brvpVarF.v(((bbca) this.r.b()).j(brvpVarF));
        return brvpVarF.a();
    }

    public final eiju l(atrj atrjVar, aufo aufoVar) {
        if (!this.n.a()) {
            return eijx.e(cbcw.i());
        }
        cbtr cbtrVar = this.o;
        if (!cbtrVar.c.a()) {
            return eijx.e(cbcw.i());
        }
        ekrw ekrwVarE = cbtr.a.e();
        ekrwVarE.X(eksq.a, "BugleE2ee");
        ((ekrd) ((ekrd) ekrwVarE).h("com/google/android/apps/messaging/shared/e2ee/group/update/EncryptionStatusGroupMetadataProcessor", "process", 54, "EncryptionStatusGroupMetadataProcessor.java")).q("Processing group metadata encryption status changes.");
        final ArrayList arrayList = new ArrayList();
        ekqg ekqgVarListIterator = ((ekph) cbtrVar.b).listIterator();
        while (ekqgVarListIterator.hasNext()) {
            arrayList.add(((cbtp) ekqgVarListIterator.next()).a(atrjVar, aufoVar));
        }
        return eijx.l(arrayList).a(new Callable() { // from class: cbtq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ArrayList<atav> arrayList2 = new ArrayList();
                ArrayList arrayList3 = arrayList;
                int size = arrayList3.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add((atav) eork.q((eiju) arrayList3.get(i)));
                }
                cbcw cbcwVarI = cbcw.i();
                for (atav atavVar : arrayList2) {
                    if (atavVar == atav.FAIL_NO_RETRY) {
                        return cbcw.k();
                    }
                    if (atavVar == atav.FAIL_RETRY) {
                        cbcwVarI = cbcw.m();
                    }
                }
                return cbcwVarI;
            }
        }, cbtrVar.d);
    }
}
