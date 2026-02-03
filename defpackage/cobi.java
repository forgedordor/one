package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cobi extends fcyz implements fdat {
    int a;
    final /* synthetic */ cobl b;
    final /* synthetic */ CancellationException c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cobi(fcxy fcxyVar, cobl coblVar, CancellationException cancellationException) {
        super(2, fcxyVar);
        this.b = coblVar;
        this.c = cancellationException;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cobi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ekrw ekrwVarH = cobl.a.h();
            ekrwVarH.X(eksq.a, "BugleTelephony");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/PausingForwardSyncWorkOrganizer$processBatches$lambda$3$lambda$2$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 190, "PausingForwardSyncWorkOrganizer.kt")).q("processBatches Cancelled");
            cobl coblVar = this.b;
            this.a = 1;
            obj = coblVar.c.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            throw this.c;
        }
        ekrw ekrwVarH2 = cobl.a.h();
        ekrwVarH2.X(eksq.a, "BugleTelephony");
        CancellationException cancellationException = this.c;
        ((ekrd) ((ekrd) ekrwVarH2).g(cancellationException).h("com/google/android/apps/messaging/shared/telephony/forwardsync/workorganizer/PausingForwardSyncWorkOrganizer$processBatches$lambda$3$lambda$2$$inlined$withLegacyPropagatingContext$1", "invokeSuspend", 192, "PausingForwardSyncWorkOrganizer.kt")).q("processBatches was paused");
        throw new cnxw("Batch interrupted by pausing forward sync", cancellationException);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cobi cobiVar = new cobi(fcxyVar, this.b, this.c);
        cobiVar.d = obj;
        return cobiVar;
    }
}
