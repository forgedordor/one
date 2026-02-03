package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aulq {
    /* JADX WARN: Multi-variable type inference failed */
    public static final Map a(final fdap fdapVar) {
        botb botbVarE = botm.e();
        botbVarE.A("queryConversationsProfile");
        botbVarE.g(new Function() { // from class: aulh
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bopp boppVar = (bopp) obj;
                boppVar.getClass();
                return boppVar.al;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.w(botm.c.al);
        botbVarE.i(new Function() { // from class: auli
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (botl) fdapVar.invoke((botl) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        botbVarE.n(new dqxm("COUNT(*)"), "countAsName");
        botbVarE.s();
        dqqj dqqjVarP = botbVarE.b().p();
        try {
            bopr boprVar = (bopr) dqqjVarP;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (boprVar.moveToNext()) {
                cpyi cpyiVarL = boprVar.l();
                cpyiVarL.getClass();
                linkedHashMap.putAll(e(linkedHashMap, cpyiVarL, (dqqf) boprVar));
            }
            fczl.a(dqqjVarP, null);
            return linkedHashMap;
        } finally {
        }
    }

    public static final int b(final bmra bmraVar) {
        bmqr bmqrVarA = bmqy.a();
        bmqrVarA.A("queryDlqForRestore");
        bmqrVarA.c(new Function() { // from class: auld
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bmqx bmqxVar = (bmqx) obj;
                bmra bmraVar2 = bmraVar;
                bmqxVar.ap(new dqty("cms_dead_letter_queue.cms_data_type", 1, Integer.valueOf(bmraVar2 == null ? 0 : bmraVar2.ordinal())));
                bmqxVar.b(bmqz.INITIAL_RESTORE_MAX_RETRIED, bmqz.INITIAL_RESTORE_NON_RETRIABLE);
                return bmqxVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bmqrVarA.b().h();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Map c(final fdap fdapVar) {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("queryMessagesProfile");
        brdrVarD.f(new Function() { // from class: aull
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bran branVar = (bran) obj;
                branVar.getClass();
                return branVar.af;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.w(MessagesTable.c.af);
        brdrVarD.h(new Function() { // from class: aulm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (brec) fdapVar.invoke((brec) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.n(new dqxm("COUNT(*)"), "countAsName");
        brdrVarD.s();
        dqqj dqqjVarP = brdrVarD.b().p();
        try {
            brap brapVar = (brap) dqqjVarP;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (brapVar.moveToNext()) {
                cpyi cpyiVarU = brapVar.u();
                cpyiVarU.getClass();
                linkedHashMap.putAll(e(linkedHashMap, cpyiVarU, (dqqf) brapVar));
            }
            fczl.a(dqqjVarP, null);
            return linkedHashMap;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Map d(final fdap fdapVar) {
        bsbo bsboVarE = ParticipantsTable.e();
        bsboVarE.A("queryParicipantsProfile");
        bsboVarE.f(new Function() { // from class: aulo
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brzh brzhVar = (brzh) obj;
                brzhVar.getClass();
                return brzhVar.M;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsboVarE.w(ParticipantsTable.c.M);
        bsboVarE.h(new Function() { // from class: aulc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (bsbx) fdapVar.invoke((bsbx) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bsboVarE.n(new dqxm("COUNT(*)"), "countAsName");
        bsboVarE.s();
        dqqj dqqjVarP = bsboVarE.b().p();
        try {
            brzj brzjVar = (brzj) dqqjVarP;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (brzjVar.moveToNext()) {
                cpyi cpyiVarI = brzjVar.i();
                cpyiVarI.getClass();
                linkedHashMap.putAll(e(linkedHashMap, cpyiVarI, (dqqf) brzjVar));
            }
            fczl.a(dqqjVarP, null);
            return linkedHashMap;
        } finally {
        }
    }

    private static final Map e(Map map, cpyi cpyiVar, dqqf dqqfVar) {
        Map mapM = fcwa.m(map);
        if (cpyiVar == cpyi.RESTORED_FROM_CMS || cpyiVar == cpyi.MERGED_FROM_CMS || cpyiVar == cpyi.SUCCEED_VIA_BATCH_BACKUP) {
            aulp aulpVar = aulp.a;
            int iIntValue = ((Number) Map.EL.getOrDefault(map, aulpVar, 0)).intValue();
            String strDe = dqqfVar.de("countAsName");
            strDe.getClass();
            mapM.put(aulpVar, Integer.valueOf(iIntValue + Integer.parseInt(strDe)));
            return mapM;
        }
        if (cpyiVar != cpyi.CMS_RESTORE_FAILED && cpyiVar != cpyi.FAILED_VIA_BATCH_BACKUP) {
            return mapM;
        }
        aulp aulpVar2 = aulp.b;
        int iIntValue2 = ((Number) Map.EL.getOrDefault(map, aulpVar2, 0)).intValue();
        String strDe2 = dqqfVar.de("countAsName");
        strDe2.getClass();
        mapM.put(aulpVar2, Integer.valueOf(iIntValue2 + Integer.parseInt(strDe2)));
        return mapM;
    }
}
