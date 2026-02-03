package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bvvr extends cayv {
    private static final cqce a = cqce.g("BugleE2eeEtouffee", "UpdateConversationEncryptionStatusHandler");
    private final fcsu b;

    public bvvr(fcsu fcsuVar) {
        this.b = fcsuVar;
    }

    @Override // defpackage.cayv, defpackage.cazg
    public final caya a() {
        caxz caxzVarL = caya.l();
        caxzVarL.b(caze.WORKMANAGER_ONLY);
        caxzVarL.f(pza.a);
        pzh pzhVar = new pzh();
        pzhVar.c(2);
        ((caxk) caxzVarL).a = pzhVar.a();
        return caxzVarL.a();
    }

    @Override // defpackage.cazg
    public final eieu b() {
        return eiiy.k("UpdateConversationEncryptionStatusHandler");
    }

    @Override // defpackage.cazg
    public final evuo d() {
        return bvvt.a.getParserForType();
    }

    @Override // defpackage.cayv
    protected final /* bridge */ /* synthetic */ eiju j(cayy cayyVar, evuh evuhVar) {
        bvvt bvvtVar = (bvvt) evuhVar;
        ConversationIdType conversationIdTypeB = barn.b(bvvtVar.b);
        if (conversationIdTypeB.b()) {
            a.r("Conversation ID is missing.");
            return eijx.e(cbcw.i());
        }
        cqbd cqbdVarA = a.a();
        cqbdVarA.I("Processing work item");
        cqbdVarA.c(conversationIdTypeB);
        cqbdVarA.r();
        ejwl.a(!bvvtVar.c.isEmpty());
        evtg evtgVar = bvvtVar.c;
        ArrayList arrayList = new ArrayList();
        Iterator<E> it = evtgVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((bvvb) this.b.b()).a((aubq) it.next(), conversationIdTypeB).a());
        }
        return eijx.j(arrayList).a(new Callable() { // from class: bvvq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return cbcw.i();
            }
        }, eoqg.a);
    }
}
