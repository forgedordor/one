package defpackage;

import j$.time.Instant;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnrs {
    private static final cqce c = cqce.g("BugleDataModel", "ForwardSyncExecutionScheduler");
    public final fcsu a;
    public final fcsu b;
    private final fcsu d;
    private final fcsu e;
    private final fcsu f;
    private final fcsu g;
    private final fcsu h;
    private final fcsu i;

    public cnrs(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8) {
        this.d = fcsuVar;
        this.a = fcsuVar2;
        this.b = fcsuVar3;
        this.e = fcsuVar4;
        this.f = fcsuVar5;
        this.g = fcsuVar6;
        this.h = fcsuVar7;
        this.i = fcsuVar8;
    }

    private static boolean b(Instant instant) {
        return instant.toEpochMilli() >= 0;
    }

    public final eiju a(final Instant instant, final Instant instant2, final Instant instant3, final enqq enqqVar, final UUID uuid, final UUID uuid2) {
        int i;
        if (!((crmx) this.d.b()).G()) {
            cqbd cqbdVarC = c.c();
            cqbdVarC.I("Skipping sync, not default SMS app.");
            cqbdVarC.A("batchId", uuid2);
            cqbdVarC.A("syncId", uuid);
            cqbdVarC.r();
            ((cnur) this.b.b()).a(uuid, uuid2, 1, ekgb.r(enqm.BUGLE_NOT_DEFAULT_SMS_APP));
            return eijx.e(null);
        }
        if (((asfb) this.i.b()).a() && !((crma) this.h.b()).j()) {
            cqbd cqbdVarC2 = c.c();
            cqbdVarC2.I("Skipping sync, no permissions even though default sms app.");
            cqbdVarC2.A("batchId", uuid2);
            cqbdVarC2.A("syncId", uuid);
            cqbdVarC2.r();
            ((cnur) this.b.b()).a(uuid, uuid2, 1, ekgb.r(enqm.MISSING_PERMISSIONS));
            return eijx.e(null);
        }
        cqce cqceVar = c;
        cqbd cqbdVarA = cqceVar.a();
        cqbdVarA.I("Request to sync messages.");
        cqbdVarA.z("lowerBoundTimeMillis", instant.toEpochMilli());
        cqbdVarA.z("upperBoundTimeMillis", instant2.toEpochMilli());
        cqbdVarA.z("startTimeMillis", instant3.toEpochMilli());
        cqbdVarA.y("initialMaxMessagesToUpdate", 0);
        cqbdVarA.A("batchId", uuid2);
        cqbdVarA.A("syncId", uuid);
        cqbdVarA.r();
        if (enqq.EARLIER_MESSAGES_OUT_OF_SYNC.equals(enqqVar)) {
            i = 2;
        } else {
            int i2 = 4;
            if (((Boolean) ((cczi) cnrt.b.get()).e()).booleanValue()) {
                if (true == b(instant)) {
                    i = 1;
                }
            } else if (b(instant)) {
                cnsx cnsxVarA = ((cnsy) this.e.b()).a(-1L, instant.toEpochMilli());
                try {
                    boolean zJ = cnsxVarA.j();
                    cnsxVarA.close();
                    if (zJ) {
                        cqbd cqbdVarA2 = cqceVar.a();
                        cqbdVarA2.I("Messages before");
                        cqbdVarA2.H(instant.toEpochMilli());
                        cqbdVarA2.I(" are in sync");
                        cqbdVarA2.A("batchId", uuid2);
                        cqbdVarA2.A("syncId", uuid);
                        cqbdVarA2.r();
                        i = 2;
                    } else {
                        fcsu fcsuVar = this.f;
                        i2 = 3;
                        if (((cmqf) fcsuVar.b()).a(instant3.toEpochMilli()) == 0) {
                            ((cmqf) fcsuVar.b()).j(instant.toEpochMilli(), enqq.EARLIER_MESSAGES_OUT_OF_SYNC);
                        } else {
                            cqbd cqbdVarA3 = cqceVar.a();
                            cqbdVarA3.I("Messages before");
                            cqbdVarA3.H(instant.toEpochMilli());
                            cqbdVarA3.I("not in sync; will do incremental sync");
                            cqbdVarA3.A("batchId", uuid2);
                            cqbdVarA3.A("syncId", uuid);
                            cqbdVarA3.r();
                        }
                    }
                } finally {
                }
            }
            i = i2;
        }
        final int i3 = i;
        return ((cmqf) this.f.b()).c(instant.isBefore(Instant.EPOCH), instant3.toEpochMilli(), instant.toEpochMilli(), instant2.toEpochMilli(), uuid).h(new ejvr() { // from class: cnrr
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekgb ekgbVarR;
                cmqe cmqeVar = (cmqe) obj;
                int iOrdinal = cmqeVar.ordinal();
                if (iOrdinal == 1) {
                    ekgbVarR = ekgb.r(enqm.FULL_SYNC_DO_NOT_START);
                } else if (iOrdinal == 2) {
                    ekgbVarR = ekgb.r(enqm.FULL_SYNC_DELAYED);
                } else if (iOrdinal != 3) {
                    int i4 = ekgb.d;
                    ekgbVarR = ekoe.a;
                } else {
                    ekgbVarR = ekgb.r(enqm.PARTIAL_SYNC_QUEUED);
                }
                int i5 = i3;
                final UUID uuid3 = uuid2;
                final UUID uuid4 = uuid;
                cnrs cnrsVar = this.a;
                ((cnur) cnrsVar.b.b()).a(uuid4, uuid3, i5, ekgbVarR);
                if (!cmqe.CAN_START.equals(cmqeVar)) {
                    return null;
                }
                final enqq enqqVar2 = enqqVar;
                final Instant instant4 = instant3;
                final Instant instant5 = instant2;
                final Instant instant6 = instant;
                ((Optional) cnrsVar.a.b()).ifPresent(new Consumer() { // from class: cnrq
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj2) {
                        Instant instant7 = instant6;
                        enqq enqqVar3 = enqqVar2;
                        ((cnrb) obj2).a(instant7, instant5, instant4, 0, -1, enqqVar3, uuid4, uuid3);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return null;
            }
        }, (Executor) this.g.b());
    }
}
