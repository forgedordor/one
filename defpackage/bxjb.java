package defpackage;

import android.database.sqlite.SQLiteConstraintException;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxjb {
    private static final cqce b = cqce.g("BugleDataModel", "ParticipantRecoveryOperation");
    public final fcsu a;
    private final fcsu c;
    private final fcsu d;
    private final fcsu e;
    private final cmqj f;
    private final fcsu g;
    private final fcsu h;

    public bxjb(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, cmqj cmqjVar, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6) {
        this.c = fcsuVar;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = cmqjVar;
        this.a = fcsuVar4;
        this.g = fcsuVar5;
        this.h = fcsuVar6;
    }

    public final ekgb a(List list) {
        Stream map = Collection.EL.stream(list).map(new Function() { // from class: bxix
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((alrj) this.a.a.b()).c((String) obj, new ejxr() { // from class: bxiw
                    @Override // defpackage.ejxr
                    public final Object get() {
                        return Optional.empty();
                    }
                });
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = ekgb.d;
        return (ekgb) map.collect(ekcv.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.Optional b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxjb.b(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, int, int):j$.util.Optional");
    }

    public final void c(List list, List list2) {
        int i;
        if (list.size() != 1) {
            cqbd cqbdVarA = b.a();
            cqbdVarA.I("Skip participants restoration");
            cqbdVarA.y("participantsInConversation", list.size());
            cqbdVarA.r();
            ((ains) this.e.b()).e("Bugle.Datamodel.Operations.EmptyRecipient.RestoreDestinations", 1);
            return;
        }
        int iB = 0;
        final String strR = ((ParticipantsTable.BindData) list.get(0)).R();
        boolean z = list2.size() != 1;
        bsbs bsbsVarF = ParticipantsTable.f();
        bsbsVarF.ap("restoreDestinationsInParticipants");
        if (z) {
            bsbsVarF.N("ʼUNKNOWN_SENDER!ʼ");
            bsbsVarF.H("ʼUNKNOWN_SENDER!ʼ");
            bsbsVarF.r("ʼUNKNOWN_SENDER!ʼ");
            i = 2;
        } else {
            alqm alqmVar = (alqm) list2.get(0);
            fcsu fcsuVar = this.a;
            alqm alqmVarK = ((alrj) fcsuVar.b()).k(alqmVar);
            cczv cczvVar = alvx.a;
            boolean zA = aqbd.a();
            alqm alqmVarI = ((alrj) fcsuVar.b()).i(alqmVarK, !zA);
            bsbsVarF.N(alqmVar.n());
            bsbsVarF.H(alqmVarK.n());
            bsbsVarF.r(alqmVarI.G(zA).toString());
            i = 3;
        }
        bsbsVarF.U(new Function() { // from class: bxiv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bsbx bsbxVar = (bsbx) obj;
                bsbxVar.k(strR);
                bsbxVar.v(-2);
                return bsbxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        try {
            iB = ((Boolean) ((cczi) bbcb.b.get()).e()).booleanValue() ? ((bbce) this.g.b()).b(bsbsVarF, bbcx.g) : ((Boolean) ((cczi) bbcb.a.get()).e()).booleanValue() ? ((bbce) this.g.b()).a(bsbsVarF.b()) : bsbsVarF.b().e();
            if (iB == 0) {
                i = 4;
            }
        } catch (SQLiteConstraintException e) {
            i = true != z ? 5 : 6;
            cqbd cqbdVarE = b.e();
            cqbdVarE.I("Participants constraint failed");
            cqbdVarE.y("restoreCounterKey", i);
            cqbdVarE.s(e);
        }
        ((ains) this.e.b()).e("Bugle.Datamodel.Operations.EmptyRecipient.RestoreDestinations", i);
        cqbd cqbdVarA2 = b.a();
        cqbdVarA2.I("Participant restored");
        cqbdVarA2.f(strR);
        cqbdVarA2.y("updatedCount", iB);
        cqbdVarA2.y("telephonyRecipients", list2.size());
        cqbdVarA2.y("restoreCounterKey", i);
        cqbdVarA2.r();
    }
}
