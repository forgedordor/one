package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atue implements atru {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SelfMembershipGroupMetadataProcessor");
    public final fcsu b;
    public final fcsu c;
    public final dqsn d;
    public final bxlc e;
    public final ains f;
    public final atrt g;
    public final cmqj h;
    public final ciuv i;
    public final Context j;
    private final fcsu k;
    private final fcsu l;
    private final attm m;
    private final bbdl n;
    private final bxkp o;
    private final cogw p;
    private final eosc q;
    private final ardl r;

    public atue(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, dqsn dqsnVar, fcsu fcsuVar4, attm attmVar, bbdl bbdlVar, bxkp bxkpVar, cogw cogwVar, bxlc bxlcVar, eosc eoscVar, ains ainsVar, atrt atrtVar, cmqj cmqjVar, ciuv ciuvVar, Context context, ardl ardlVar) {
        this.k = fcsuVar;
        this.b = fcsuVar2;
        this.c = fcsuVar3;
        this.d = dqsnVar;
        this.l = fcsuVar4;
        this.m = attmVar;
        this.n = bbdlVar;
        this.o = bxkpVar;
        this.p = cogwVar;
        this.e = bxlcVar;
        this.q = eoscVar;
        this.f = ainsVar;
        this.g = atrtVar;
        this.h = cmqjVar;
        this.i = ciuvVar;
        this.j = context;
        this.r = ardlVar;
    }

    private final axcy e(atrj atrjVar, auer auerVar) {
        if (!auerVar.f.isEmpty()) {
            Optional optionalFilter = Optional.of(auerVar.f).map(new Function() { // from class: attz
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return aofa.c((String) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).filter(new Predicate() { // from class: atua
                public final /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                @Override // java.util.function.Predicate
                /* renamed from: negate */
                public final /* synthetic */ Predicate mo538negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public final /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return Objects.nonNull((SelfIdentityId) obj);
                }
            });
            final bbdl bbdlVar = this.n;
            bbdlVar.getClass();
            Optional map = optionalFilter.map(new Function() { // from class: atub
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return bbdlVar.e((SelfIdentityId) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (map.isPresent()) {
                return (axcy) map.get();
            }
        }
        axcy axcyVarE = this.n.e(atrjVar.b());
        axcyVarE.getClass();
        return axcyVarE;
    }

    @Override // defpackage.atru
    public final eiju a(final ConversationIdType conversationIdType, auey aueyVar) {
        final auer auerVar = aueyVar.i;
        if (auerVar == null) {
            auerVar = auer.a;
        }
        return this.m.h(conversationIdType).h(new ejvr() { // from class: atty
            /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
            @Override // defpackage.ejvr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r17) {
                /*
                    Method dump skipped, instructions count: 578
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.atty.apply(java.lang.Object):java.lang.Object");
            }
        }, this.q);
    }

    public final ParticipantsTable.BindData b(atrj atrjVar, auer auerVar) {
        axcy axcyVarE = e(atrjVar, auerVar);
        aubq aubqVar = aubq.a;
        aufb aufbVar = auerVar.d;
        if (aufbVar == null) {
            aufbVar = aufb.a;
        }
        aubq aubqVar2 = aufbVar.c;
        if (aubqVar2 == null) {
            aubqVar2 = aubqVar;
        }
        if (!aubqVar.equals(aubqVar2)) {
            aubq aubqVarC = atrjVar.c();
            aufb aufbVar2 = auerVar.d;
            if (aufbVar2 == null) {
                aufbVar2 = aufb.a;
            }
            aubq aubqVar3 = aufbVar2.c;
            if (aubqVar3 == null) {
                aubqVar3 = aubqVar;
            }
            if (!aubqVarC.equals(aubqVar3)) {
                aufb aufbVar3 = auerVar.d;
                if (aufbVar3 == null) {
                    aufbVar3 = aufb.a;
                }
                aubq aubqVar4 = aufbVar3.c;
                if (aubqVar4 != null) {
                    aubqVar = aubqVar4;
                }
                brvp brvpVarF = bbbd.f(aubqVar.d);
                brvpVarF.v(((bbca) this.k.b()).j(brvpVarF));
                this.o.e(brvpVarF, 3);
                return brvpVarF.a();
            }
        }
        return axcyVarE.a();
    }

    public final Optional c(atrj atrjVar, auer auerVar, ParticipantsTable.BindData bindData) {
        axcy axcyVarE = e(atrjVar, auerVar);
        aueq aueqVarB = aueq.b(auerVar.c);
        if (aueqVarB == null) {
            aueqVarB = aueq.UNKNOWN_STATE;
        }
        int iOrdinal = aueqVarB.ordinal();
        return Optional.ofNullable(((byeb) this.l.b()).l(Optional.empty(), atrjVar.f(), axcyVarE, bindData, ekgb.r(axcyVarE.a()), iOrdinal != 1 ? iOrdinal != 2 ? 220 : BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED : BasePaymentResult.ERROR_REQUEST_FAILED, this.p.f().toEpochMilli(), -1L, null));
    }

    public final boolean d(atrj atrjVar, auer auerVar) {
        if (!this.r.a()) {
            return true;
        }
        aueq aueqVarB = aueq.b(auerVar.c);
        if (aueqVarB == null) {
            aueqVarB = aueq.UNKNOWN_STATE;
        }
        if (!aueqVarB.equals(aueq.KICKED_OUT)) {
            aueq aueqVarB2 = aueq.b(auerVar.c);
            if (aueqVarB2 == null) {
                aueqVarB2 = aueq.UNKNOWN_STATE;
            }
            if (!aueqVarB2.equals(aueq.MEMBERSHIP_CONFIRMED)) {
                return true;
            }
        }
        aufb aufbVar = auerVar.d;
        if (aufbVar == null) {
            aufbVar = aufb.a;
        }
        if (!aufbVar.equals(aufb.a)) {
            return true;
        }
        if (!atrjVar.j().isEmpty() && atrjVar.a() != 4) {
            return true;
        }
        ekrw ekrwVarH = a.h();
        ekrwVarH.X(eksq.a, "BugleGroupManagement");
        ekrd ekrdVar = (ekrd) ekrwVarH;
        ekrdVar.X(cqnc.s, atrjVar.f());
        ((ekrd) ekrdVar.h("com/google/android/apps/messaging/shared/chatapi/groups/groupupdate/SelfMembershipGroupMetadataProcessor", "shouldInsertTombstone", 344, "SelfMembershipGroupMetadataProcessor.java")).q("Skipping inserting tombstone for out-of-sync state.");
        return false;
    }
}
