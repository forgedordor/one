package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnly extends fcyz implements fdat {
    final /* synthetic */ cnlz a;
    final /* synthetic */ cnor b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnly(cnlz cnlzVar, cnor cnorVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cnlzVar;
        this.b = cnorVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cnly) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((ekrd) cnlz.a.h().h("com/google/android/apps/messaging/shared/telephony/IncrementalReverseTelephonySyncWorkItemHandler$processPendingWorkItemAsync$1", "invokeSuspend", 47, "IncrementalReverseTelephonySyncWorkItemHandler.kt")).q("Starting incremental reverse sync work.");
        cnlz cnlzVar = this.a;
        long jA = cnlzVar.c.a();
        try {
            evqs evqsVar = this.b.e;
            evqsVar.getClass();
            if (evqsVar.d() != 16) {
                cnlzVar.b.d(2, Optional.empty());
            } else {
                cnlzVar.b.d(2, Optional.of(cobs.c(evqsVar)));
            }
            ((ekrd) cnlz.a.h().h("com/google/android/apps/messaging/shared/telephony/IncrementalReverseTelephonySyncWorkItemHandler$processPendingWorkItemAsync$1", "invokeSuspend", 68, "IncrementalReverseTelephonySyncWorkItemHandler.kt")).s("Incremental Reverse Sync Complete! Time taken for message import to telephony: %s", this.a.c.a() - jA);
            return cbcw.i();
        } catch (cnmd e) {
            ((ekrd) ((ekrd) cnlz.a.j()).g(e).h("com/google/android/apps/messaging/shared/telephony/IncrementalReverseTelephonySyncWorkItemHandler$processPendingWorkItemAsync$1", "invokeSuspend", 60, "IncrementalReverseTelephonySyncWorkItemHandler.kt")).q("Incremental reverse sync retry limit exceeded. Cancelling work.");
            return cbcw.k();
        } catch (Exception e2) {
            ((ekrd) ((ekrd) cnlz.a.j()).g(e2).h("com/google/android/apps/messaging/shared/telephony/IncrementalReverseTelephonySyncWorkItemHandler$processPendingWorkItemAsync$1", "invokeSuspend", 63, "IncrementalReverseTelephonySyncWorkItemHandler.kt")).q("Incremental reverse sync failed. Scheduling retry.");
            return cbcw.m();
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cnly(this.a, this.b, fcxyVar);
    }
}
