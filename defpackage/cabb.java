package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cabb extends fcyz implements fdat {
    int a;
    final /* synthetic */ byir b;
    final /* synthetic */ cabe c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cabb(fcxy fcxyVar, byir byirVar, cabe cabeVar) {
        super(2, fcxyVar);
        this.b = byirVar;
        this.c = cabeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cabb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ConversationIdType conversationIdTypeC;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        byir byirVar = this.b;
        byiq byiqVarB = byiq.b(byirVar.d);
        if (byiqVarB == null) {
            byiqVarB = byiq.UNSPECIFIED;
        }
        byiqVarB.getClass();
        cabe cabeVar = this.c;
        Long lValueOf = null;
        if (((cabh) Map.EL.getOrDefault(cabeVar.b, byiqVarB, null)) == null) {
            throw new IllegalArgumentException("Undefined CMS Backfill Missing Field task type.");
        }
        botb botbVarE = botm.e();
        botbVarE.A("RcsMsisdnBackfillMissingFieldQueryProvider#getConversationsQueryBuilder");
        botbVarE.i(new Function() { // from class: cabg
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                botl botlVar = (botl) obj2;
                botlVar.f();
                int iIntValue = botm.g().intValue();
                if (iIntValue < 58540) {
                    dqru.x("rcs_group_self_msisdn", iIntValue);
                }
                botlVar.ap(new dqpn("conversations.rcs_group_self_msisdn", 6));
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        byit byitVar = byirVar.c;
        if (byitVar == null) {
            byitVar = byit.a;
        }
        final Long l = new Long(byitVar.f);
        int i2 = cabe.a;
        botbVarE.e(new bosy(botm.c.a, true));
        botbVarE.y(i2);
        botbVarE.i(new Function() { // from class: auty
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj2) {
                botl botlVar = (botl) obj2;
                botlVar.s(l.longValue());
                return botlVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        ekgb ekgbVarZ = botbVarE.b().z();
        ekqh it = ekgbVarZ.iterator();
        it.getClass();
        while (it.hasNext()) {
            String strA = ((bojh) it.next()).C().a();
            strA.getClass();
            byiu byiuVar = (byiu) byiv.a.createBuilder();
            byiuVar.getClass();
            byit byitVar2 = byirVar.c;
            if (byitVar2 == null) {
                byitVar2 = byit.a;
            }
            byin.b(byitVar2.c, byiuVar);
            byit byitVar3 = byirVar.c;
            if (byitVar3 == null) {
                byitVar3 = byit.a;
            }
            byin.f(byitVar3.d, byiuVar);
            byin.e(strA, byiuVar);
            byit byitVar4 = byirVar.c;
            if (byitVar4 == null) {
                byitVar4 = byit.a;
            }
            byin.c(byitVar4.e, byiuVar);
            byin.d(false, byiuVar);
            ((bykf) cabeVar.c.b()).c(byin.a(byiuVar));
        }
        ekgbVarZ.getClass();
        bojh bojhVar = (bojh) fcva.T(ekgbVarZ);
        if (bojhVar != null && (conversationIdTypeC = bojhVar.C()) != null) {
            lValueOf = Long.valueOf(conversationIdTypeC.a);
        }
        if (lValueOf == null) {
            byiq byiqVarB2 = byiq.b(byirVar.d);
            if (byiqVarB2 == null) {
                byiqVarB2 = byiq.UNSPECIFIED;
            }
            byiqVarB2.getClass();
            this.a = 1;
            Object objB = cabeVar.b(byiqVarB2, this);
            return objB == fcylVar ? fcylVar : objB;
        }
        long jLongValue = lValueOf.longValue();
        byio byioVar = (byio) byirVar.toBuilder();
        byioVar.getClass();
        byit byitVar5 = byirVar.c;
        if (byitVar5 == null) {
            byitVar5 = byit.a;
        }
        byitVar5.getClass();
        byis byisVar = (byis) byitVar5.toBuilder();
        byisVar.getClass();
        byisVar.copyOnWrite();
        byit byitVar6 = (byit) byisVar.instance;
        byitVar6.b |= 8;
        byitVar6.f = jLongValue;
        byhs.b(byim.a(byisVar), byioVar);
        return cbcw.j(ekgb.r(cbcu.f("cms_backfill_missing_field_work_handler", byhs.a(byioVar))));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cabb cabbVar = new cabb(fcxyVar, this.b, this.c);
        cabbVar.d = obj;
        return cabbVar;
    }
}
