package defpackage;

import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avky extends fcyz implements fdat {
    int a;
    final /* synthetic */ avkz b;
    final /* synthetic */ cayy c;
    final /* synthetic */ avlb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avky(avkz avkzVar, cayy cayyVar, avlb avlbVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = avkzVar;
        this.c = cayyVar;
        this.d = avlbVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avky) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Set setAv;
        dzfh dzfhVar;
        fcyl fcylVar = fcyl.a;
        int i = 10;
        try {
            try {
                if (this.a != 0) {
                    fctl.b(obj);
                } else {
                    fctl.b(obj);
                    avkz avkzVar = this.b;
                    Iterator it = ((Set) avkzVar.c.b()).iterator();
                    while (it.hasNext()) {
                        ((bxkq) it.next()).c();
                    }
                    if (((caxm) this.c.a()).c == 0) {
                        int iB = avll.b(this.d.e);
                        if (iB == 0) {
                            iB = 1;
                        }
                        Object objB = avkzVar.f.b();
                        objB.getClass();
                        int i2 = iB - 2;
                        avbu.c((ains) objB, (i2 == 1 || i2 == 2) ? 2 : i2 != 4 ? 5 : 11);
                    }
                    avld avldVar = (avld) avkzVar.b.b();
                    avlb avlbVar = this.d;
                    evtg evtgVar = avlbVar.d;
                    evtgVar.getClass();
                    if (fcva.ay(evtgVar)) {
                        evtg evtgVar2 = avlbVar.d;
                        evtgVar2.getClass();
                        ArrayList arrayList = new ArrayList(fcva.p(evtgVar2, 10));
                        Iterator<E> it2 = evtgVar2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(new Long(((avkq) it2.next()).b));
                        }
                        setAv = fcva.av(arrayList);
                    } else {
                        evta evtaVar = avlbVar.c;
                        evtaVar.getClass();
                        setAv = fcva.av(evtaVar);
                    }
                    this.a = 1;
                    if (avldVar.b(setAv, this) == fcylVar) {
                        return fcylVar;
                    }
                }
                avkz avkzVar2 = this.b;
                avlb avlbVar2 = this.d;
                evtg<avkq> evtgVar3 = avlbVar2.d;
                evtgVar3.getClass();
                ArrayList arrayList2 = new ArrayList(fcva.p(evtgVar3, 10));
                for (avkq avkqVar : evtgVar3) {
                    avkqVar.getClass();
                    long j = avkqVar.b;
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(avkqVar.c);
                    instantOfEpochMilli.getClass();
                    arrayList2.add(new avcy(j, instantOfEpochMilli));
                }
                int iB2 = avll.b(avlbVar2.e);
                if (iB2 == 0) {
                    iB2 = 1;
                }
                if (!arrayList2.isEmpty()) {
                    int i3 = iB2 - 2;
                    if (i3 == 1) {
                        dzfhVar = avbv.r;
                    } else if (i3 != 2) {
                        ekrw ekrwVarH = avkz.a.h();
                        ekrwVarH.X(eksq.a, "BugleRecipientSync");
                        ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientDeletedSyncHandler", "getRecipientsSyncLatencyTimerNameOrNull", 171, "ContactRecipientDeletedSyncHandler.kt")).t("Trigger source of %s will not have its sync duration logged.", iB2 != 2 ? iB2 != 3 ? iB2 != 4 ? iB2 != 5 ? iB2 != 6 ? "UNRECOGNIZED" : "DELETED_SYNC_TRIGGER_IMPORT" : "DELETED_SYNC_TRIGGER_FORCED" : "DELETED_SYNC_TRIGGER_WORKER" : "DELETED_SYNC_TRIGGER_OBSERVER" : "DELETED_SYNC_TRIGGER_UNSPECIFIED");
                        dzfhVar = null;
                    } else {
                        dzfhVar = avbv.t;
                    }
                    dzfh dzfhVar2 = dzfhVar;
                    if (dzfhVar2 != null) {
                        long epochMilli = ((cogw) avkzVar2.e.b()).f().toEpochMilli();
                        long epochMilli2 = avcz.b(arrayList2).toEpochMilli();
                        if (epochMilli2 <= epochMilli) {
                            ((dztw) avkzVar2.d.b()).b(dzfhVar2, epochMilli2, epochMilli, dzua.SUCCESS);
                        } else {
                            ekrw ekrwVarJ = avkz.a.j();
                            ekrwVarJ.X(eksq.a, "BugleRecipientSync");
                            ((ekrd) ekrwVarJ.h("com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientDeletedSyncHandler", "logTotalSyncLatency", 157, "ContactRecipientDeletedSyncHandler.kt")).t("Invalid duration for %s", dzfhVar2.a);
                        }
                    }
                }
                cbcw cbcwVarI = cbcw.i();
                Iterator it3 = ((Set) avkzVar2.c.b()).iterator();
                while (it3.hasNext()) {
                    ((bxkq) it3.next()).d();
                }
                return cbcwVarI;
            } catch (Exception e) {
                ekrw ekrwVarJ2 = avkz.a.j();
                ekrwVarJ2.X(eksq.a, "BugleRecipientSync");
                ((ekrd) ((ekrd) ekrwVarJ2).g(e).h("com/google/android/apps/messaging/shared/contacts/sync/incremental/recipient/ContactRecipientDeletedSyncHandler$processPendingWorkItemAsync$1", "invokeSuspend", 93, "ContactRecipientDeletedSyncHandler.kt")).q("Caught exception while syncing deleted contacts to recipients. Marking WorkQueueResult as failedRetry.");
                avkz avkzVar3 = this.b;
                int iB3 = avll.b(this.d.e);
                if (iB3 == 0) {
                    iB3 = 1;
                }
                Object objB2 = avkzVar3.f.b();
                objB2.getClass();
                ains ainsVar = (ains) objB2;
                int i4 = iB3 - 2;
                if (i4 == 1 || i4 == 2) {
                    i = 7;
                } else if (i4 == 4) {
                    i = 12;
                }
                avbu.c(ainsVar, i);
                cbcw cbcwVarM = cbcw.m();
                Iterator it4 = ((Set) this.b.c.b()).iterator();
                while (it4.hasNext()) {
                    ((bxkq) it4.next()).d();
                }
                return cbcwVarM;
            }
        } catch (Throwable th) {
            Iterator it5 = ((Set) this.b.c.b()).iterator();
            while (it5.hasNext()) {
                ((bxkq) it5.next()).d();
            }
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new avky(this.b, this.c, this.d, fcxyVar);
    }
}
