package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzdm extends fcyz implements fdat {
    int a;
    final /* synthetic */ Map b;
    final /* synthetic */ bzds c;
    final /* synthetic */ bzbz d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzdm(fcxy fcxyVar, Map map, bzds bzdsVar, bzbz bzbzVar) {
        super(2, fcxyVar);
        this.b = map;
        this.c = bzdsVar;
        this.d = bzbzVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzdm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        List<fcti> list;
        Object objA;
        Object bzaxVar;
        Object bzawVar;
        String strAl;
        Optional optionalEmpty;
        fcyl fcylVar = fcyl.a;
        if (this.a != 0) {
            List list2 = (List) this.e;
            fctl.b(obj);
            list = list2;
            objA = obj;
        } else {
            fctl.b(obj);
            Set<Map.Entry> setEntrySet = this.b.entrySet();
            ArrayList arrayList = new ArrayList(fcva.p(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                arrayList.add(new fcti(entry.getKey(), entry.getValue()));
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList) {
                cprt cprtVar = (cprt) ((fcti) obj2).b;
                MessageCoreData messageCoreDataA = cprtVar.a();
                if ((messageCoreDataA.k() != 16 && messageCoreDataA.k() != 3) || messageCoreDataA.db()) {
                    MessageCoreData messageCoreDataA2 = cprtVar.a();
                    if (!bzdl.a(messageCoreDataA2) || messageCoreDataA2.d() == 2) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList3.add(obj2);
            }
            fcti fctiVar = new fcti(arrayList2, arrayList3);
            Object obj3 = fctiVar.a;
            Object obj4 = fctiVar.b;
            bzds bzdsVar = this.c;
            list = (List) obj4;
            Map mapK = fcwa.k((List) obj3);
            bzbz bzbzVar = this.d;
            this.e = list;
            this.a = 1;
            if (cpxz.b(bzbzVar.c)) {
                objA = bzat.a(mapK);
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap(fcwa.a(mapK.size()));
                for (Map.Entry entry2 : mapK.entrySet()) {
                    Object key = entry2.getKey();
                    cprt cprtVar2 = (cprt) entry2.getValue();
                    try {
                        strAl = cprtVar2.a().al();
                    } catch (Exception e) {
                        bzaxVar = new bzax(cprtVar2, e);
                    }
                    if (strAl == null || strAl.length() == 0) {
                        final bzzt bzztVar = bzdsVar.b;
                        final MessageCoreData messageCoreDataA3 = cprtVar2.a();
                        ecem.b();
                        try {
                            if (bzztVar.h.ai() && messageCoreDataA3.cI() && (messageCoreDataA3.dg() || messageCoreDataA3.cO())) {
                                String str = (String) bzztVar.b.c("CmsObjectNotificationResolver#associateWithPendingNotification", new ejxr() { // from class: bzzo
                                    @Override // defpackage.ejxr
                                    public final Object get() {
                                        bzzt bzztVar2;
                                        final String strF;
                                        List list3;
                                        final long jLongValue = ((Long) cpyl.A.e()).longValue();
                                        bmwx bmwxVarA = bmxa.a();
                                        bmwxVarA.A("CmsObjectNotificationResolver#buildQuery");
                                        final MessageCoreData messageCoreData = messageCoreDataA3;
                                        bmwxVarA.k(new bmwy((bmwz) new Function() { // from class: bzzs
                                            @Override // java.util.function.Function
                                            /* renamed from: andThen */
                                            public final /* synthetic */ Function mo536andThen(Function function) {
                                                return Function$CC.$default$andThen(this, function);
                                            }

                                            @Override // java.util.function.Function
                                            public final Object apply(Object obj5) {
                                                String strAs;
                                                bmwz bmwzVar = (bmwz) obj5;
                                                MessageCoreData messageCoreData2 = messageCoreData;
                                                if (messageCoreData2.cO()) {
                                                    strAs = messageCoreData2.aw();
                                                    String strAu = messageCoreData2.au();
                                                    if (dhim.d(strAs)) {
                                                        throw bzzt.a(strAs, strAu);
                                                    }
                                                    if (!dhim.d(strAu)) {
                                                        Uri uri = Uri.parse(strAu);
                                                        String queryParameter = uri.getQueryParameter("id");
                                                        String queryParameter2 = uri.getQueryParameter("sc");
                                                        if (queryParameter != null && queryParameter2 != null) {
                                                            chxw chxwVarC = chxx.c(strAs);
                                                            if (chxwVarC != null) {
                                                                Optional optional = ((chul) chxwVarC).e;
                                                                if (optional.isPresent()) {
                                                                    String strD = ((chuv) optional.get()).c.D(StandardCharsets.US_ASCII);
                                                                    cqbd cqbdVarA = bzzt.a.a();
                                                                    cqbdVarA.I("Parsed MMS message transactionId.");
                                                                    cqbdVarA.A("BugleDbTransactionId", strAs);
                                                                    cqbdVarA.A("legacyTransactionId", strD);
                                                                    cqbdVarA.r();
                                                                    strAs = strD;
                                                                }
                                                            }
                                                            if (!ejuf.e(strAs, queryParameter) && !ejuf.e(strAs, String.format("%s-%s", queryParameter, queryParameter2))) {
                                                                throw bzzt.a(strAs, strAu);
                                                            }
                                                            strAs = queryParameter;
                                                        }
                                                    }
                                                } else {
                                                    strAs = messageCoreData2.as();
                                                }
                                                bmwzVar.ap(new dqpj("cms_notifications.correlation_text", 1, String.valueOf(strAs)));
                                                final String strAB = messageCoreData2.aB();
                                                String str2 = strAB == null ? null : (String) ParticipantsTable.l(strAB, new Function() { // from class: bzzp
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj6) {
                                                        return ((ParticipantsTable.BindData) obj6).T();
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                }, new Supplier() { // from class: bzzq
                                                    @Override // java.util.function.Supplier
                                                    public final Object get() {
                                                        throw new IllegalArgumentException("Sender not found in db: ".concat(strAB));
                                                    }
                                                });
                                                long j = jLongValue;
                                                bmwzVar.ap(new dqpj("cms_notifications.from_address", 1, String.valueOf(str2)));
                                                long jO = messageCoreData2.o() - j;
                                                int iIntValue = bmxa.c().intValue();
                                                if (iIntValue < 46040) {
                                                    dqru.x("message_received_timestamp", iIntValue);
                                                }
                                                bmwzVar.ap(new dqty("cms_notifications.message_received_timestamp", 9, Long.valueOf(jO)));
                                                long jO2 = messageCoreData2.o() + j;
                                                int iIntValue2 = bmxa.c().intValue();
                                                if (iIntValue2 < 46040) {
                                                    dqru.x("message_received_timestamp", iIntValue2);
                                                }
                                                bmwzVar.ap(new dqty("cms_notifications.message_received_timestamp", 8, Long.valueOf(jO2)));
                                                return bmwzVar;
                                            }

                                            public final /* synthetic */ Function compose(Function function) {
                                                return Function$CC.$default$compose(this, function);
                                            }
                                        }.apply(new bmwz())));
                                        bmwh bmwhVar = (bmwh) bmwxVarA.b().p();
                                        boolean z = false;
                                        do {
                                            try {
                                                boolean zMoveToNext = bmwhVar.moveToNext();
                                                bzztVar2 = bzztVar;
                                                if (!zMoveToNext) {
                                                    bmwhVar.close();
                                                    ((cpqk) bzztVar2.c.b()).f(messageCoreData.C().b(), "", avbk.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, "Notification not found");
                                                    throw new bzzu(true != messageCoreData.cO() ? 3 : 4, cpyz.RETRY);
                                                }
                                                strF = bmwhVar.f();
                                                if (MessagesTable.a(strF) == null) {
                                                    long jE = bmwhVar.e();
                                                    brdu brduVar = new brdu();
                                                    brduVar.ap("associateWithPendingNotification");
                                                    brduVar.k(strF);
                                                    brduVar.G(jE);
                                                    brduVar.O(jE);
                                                    brduVar.l(bmwhVar.c());
                                                    if (!messageCoreData.cN() && jE <= ((bakt) bzztVar2.d.b()).f(messageCoreData.A())) {
                                                        brduVar.F(true);
                                                        cqbd cqbdVarC = bzzt.a.c();
                                                        cqbdVarC.A("messageId", messageCoreData.C());
                                                        cqbdVarC.I("Updating the message to read since the conversation has been read.");
                                                        cqbdVarC.r();
                                                        cqbf cqbfVar = new cqbf();
                                                        cqbfVar.add(messageCoreData.A());
                                                        ((cgbn) bzztVar2.f.b()).F(cqbfVar);
                                                    }
                                                    brduVar.e(messageCoreData.C());
                                                    bvdk bvdkVarS = ((bakt) bzztVar2.d.b()).s(messageCoreData.A());
                                                    baqi baqiVar = (baqi) bzztVar2.e.b();
                                                    ConversationIdType conversationIdTypeA = messageCoreData.A();
                                                    if (bvdkVarS == null) {
                                                        bvdkVarS = bvdk.UNARCHIVED;
                                                    }
                                                    baqiVar.a(conversationIdTypeA, false, bvdkVarS);
                                                    Uri uriU = messageCoreData.u();
                                                    caww cawwVar = bzztVar2.i;
                                                    cawu cawuVar = (cawu) cawv.a.createBuilder();
                                                    String string = uriU != null ? uriU.toString() : "";
                                                    cawuVar.copyOnWrite();
                                                    cawv cawvVar = (cawv) cawuVar.instance;
                                                    string.getClass();
                                                    cawvVar.b = string;
                                                    int i = true != messageCoreData.cO() ? 3 : 4;
                                                    cawuVar.copyOnWrite();
                                                    ((cawv) cawuVar.instance).c = i - 2;
                                                    cawuVar.copyOnWrite();
                                                    ((cawv) cawuVar.instance).d = jE;
                                                    ((cazj) cawwVar.a.b()).a(cbcu.f("update_timestamp_in_telephony", (cawv) cawuVar.build()));
                                                    bzztVar2.g.l(messageCoreData.A(), messageCoreData.C(), new String[0]);
                                                    cqbd cqbdVarC2 = bzzt.a.c();
                                                    cqbdVarC2.I("Attempting to associate message with notification.");
                                                    cqbdVarC2.A("messageId", messageCoreData.C());
                                                    cqbdVarC2.A("cmsId", strF);
                                                    cqbdVarC2.r();
                                                    z = true;
                                                }
                                                bmws bmwsVar = new bmws();
                                                bmwsVar.f("associateWithPendingNotification");
                                                bmwsVar.a(new Function() { // from class: bzzr
                                                    @Override // java.util.function.Function
                                                    /* renamed from: andThen */
                                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                                        return Function$CC.$default$andThen(this, function);
                                                    }

                                                    @Override // java.util.function.Function
                                                    public final Object apply(Object obj5) {
                                                        bmwz bmwzVar = (bmwz) obj5;
                                                        bmwzVar.b(strF);
                                                        return bmwzVar;
                                                    }

                                                    public final /* synthetic */ Function compose(Function function) {
                                                        return Function$CC.$default$compose(this, function);
                                                    }
                                                });
                                                bmwsVar.d();
                                            } finally {
                                            }
                                        } while (!z);
                                        if (messageCoreData.cO()) {
                                            bzqz bzqzVar = bzztVar2.j;
                                            MessagesTable.BindData bindDataA = MessagesTable.a(strF);
                                            if (bindDataA == null) {
                                                cqbd cqbdVarE = bzqz.a.e();
                                                cqbdVarE.I("Can't find message with requested cmsId.");
                                                cqbdVarE.A("cmsId", strF);
                                                cqbdVarE.r();
                                                int i2 = ekgb.d;
                                                ekgb ekgbVar = ekoe.a;
                                            } else {
                                                MessageCoreData messageCoreDataW = ((baxe) bzqzVar.b.b()).w(bindDataA.E());
                                                if (messageCoreDataW == null) {
                                                    int i3 = ekgb.d;
                                                    list3 = ekoe.a;
                                                } else {
                                                    Stream map = Collection.EL.stream(((MessageData) messageCoreDataW).i).filter(new Predicate() { // from class: bzqx
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
                                                        public final boolean test(Object obj5) {
                                                            return ((MessagePartCoreData) obj5).bl();
                                                        }
                                                    }).map(new Function() { // from class: bzqy
                                                        @Override // java.util.function.Function
                                                        /* renamed from: andThen */
                                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                                            return Function$CC.$default$andThen(this, function);
                                                        }

                                                        @Override // java.util.function.Function
                                                        public final Object apply(Object obj5) {
                                                            return ((MessagePartCoreData) obj5).W();
                                                        }

                                                        public final /* synthetic */ Function compose(Function function) {
                                                            return Function$CC.$default$compose(this, function);
                                                        }
                                                    });
                                                    int i4 = ekgb.d;
                                                    list3 = (List) map.collect(ekcv.a);
                                                }
                                                if (list3.isEmpty()) {
                                                    ekgb ekgbVar2 = ekoe.a;
                                                } else if (list3.size() > 1) {
                                                    cqbd cqbdVarC3 = bzqz.a.c();
                                                    cqbdVarC3.I("Multiple media part found. This impl can only associate single media part message.");
                                                    cqbdVarC3.A("Message Id", bindDataA.E());
                                                    cqbdVarC3.r();
                                                    ekgb ekgbVar3 = ekoe.a;
                                                } else {
                                                    final String str2 = (String) list3.get(0);
                                                    bzqzVar.c.d("CmsMediaNotificationResolverImpl#associateWithMediaNotification", new Runnable() { // from class: bzqu
                                                        @Override // java.lang.Runnable
                                                        public final void run() {
                                                            String[] strArr = bmvh.a;
                                                            bmve bmveVar = new bmve(bmvh.a);
                                                            bmveVar.A("associateWithMediaNotification");
                                                            final String str3 = strF;
                                                            bmveVar.k(new bmvf((bmvg) new Function() { // from class: bzqv
                                                                @Override // java.util.function.Function
                                                                /* renamed from: andThen */
                                                                public final /* synthetic */ Function mo536andThen(Function function) {
                                                                    return Function$CC.$default$andThen(this, function);
                                                                }

                                                                @Override // java.util.function.Function
                                                                public final Object apply(Object obj5) {
                                                                    bmvg bmvgVar = (bmvg) obj5;
                                                                    bmvgVar.b(str3);
                                                                    return bmvgVar;
                                                                }

                                                                public final /* synthetic */ Function compose(Function function) {
                                                                    return Function$CC.$default$compose(this, function);
                                                                }
                                                            }.apply(new bmvg())));
                                                            bmus bmusVar = (bmus) bmveVar.b().p();
                                                            String str4 = str2;
                                                            while (bmusVar.moveToNext()) {
                                                                try {
                                                                    cpya cpyaVarC = bmusVar.c();
                                                                    String strE = bmusVar.e();
                                                                    int iOrdinal = cpyaVarC.ordinal();
                                                                    if (iOrdinal == 0) {
                                                                        String[] strArr2 = PartsTable.a;
                                                                        bsjh bsjhVar = new bsjh();
                                                                        bsjhVar.ap("associateTheBlob-parts");
                                                                        bsjhVar.h(strE);
                                                                        bsjhVar.c(str4);
                                                                        cqbd cqbdVarC4 = bzqz.a.c();
                                                                        cqbdVarC4.I("Associated full size blob from server");
                                                                        cqbdVarC4.A("Blob id", strE);
                                                                        cqbdVarC4.A("part id", str4);
                                                                        cqbdVarC4.r();
                                                                    } else if (iOrdinal == 1) {
                                                                        String[] strArr3 = PartsTable.a;
                                                                        bsjh bsjhVar2 = new bsjh();
                                                                        bsjhVar2.ap("associateTheBlob-parts2");
                                                                        bsjhVar2.g(strE);
                                                                        bsjhVar2.c(str4);
                                                                        cqbd cqbdVarC5 = bzqz.a.c();
                                                                        cqbdVarC5.I("Associated compressed blob from server");
                                                                        cqbdVarC5.A("Blob id", strE);
                                                                        cqbdVarC5.A("part id", str4);
                                                                        cqbdVarC5.r();
                                                                    }
                                                                } catch (Throwable th) {
                                                                    try {
                                                                        bmusVar.close();
                                                                    } catch (Throwable th2) {
                                                                        th.addSuppressed(th2);
                                                                    }
                                                                    throw th;
                                                                }
                                                            }
                                                            bmusVar.close();
                                                            bmuz bmuzVar = new bmuz();
                                                            bmuzVar.f("associateWithMediaNotification");
                                                            bmuzVar.a(new Function() { // from class: bzqw
                                                                @Override // java.util.function.Function
                                                                /* renamed from: andThen */
                                                                public final /* synthetic */ Function mo536andThen(Function function) {
                                                                    return Function$CC.$default$andThen(this, function);
                                                                }

                                                                @Override // java.util.function.Function
                                                                public final Object apply(Object obj5) {
                                                                    bmvg bmvgVar = (bmvg) obj5;
                                                                    bmvgVar.b(str3);
                                                                    return bmvgVar;
                                                                }

                                                                public final /* synthetic */ Function compose(Function function) {
                                                                    return Function$CC.$default$compose(this, function);
                                                                }
                                                            });
                                                            bmuzVar.d();
                                                        }
                                                    });
                                                    cqbd cqbdVarC4 = bzqz.a.c();
                                                    cqbdVarC4.I("Associated media uploaded from server");
                                                    cqbdVarC4.A("Message CMS id", strF);
                                                    cqbdVarC4.A("Message part id", str2);
                                                    cqbdVarC4.r();
                                                    ekgb.r(str2);
                                                }
                                            }
                                        }
                                        bmwhVar.close();
                                        return strF;
                                    }
                                });
                                cqbd cqbdVarC = bzzt.a.c();
                                cqbdVarC.I("Associated message with notification.");
                                cqbdVarC.A("messageId", messageCoreDataA3.C());
                                cqbdVarC.A("cmsId", str);
                                cqbdVarC.A(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, messageCoreDataA3.ax());
                                cqbdVarC.r();
                                ((cpqk) bzztVar.c.b()).f(messageCoreDataA3.C().b(), str, avbk.CMS_EVENT_TYPE_CREATE_EVENT_RECEIVED, "success");
                                optionalEmpty = Optional.of(str);
                            } else {
                                optionalEmpty = Optional.empty();
                            }
                        } catch (evtj unused) {
                            optionalEmpty = Optional.empty();
                        }
                        if (optionalEmpty.isPresent()) {
                            bzaxVar = new bzay(cprtVar2, (String) optionalEmpty.get());
                            bzawVar = bzaxVar;
                        } else {
                            bzawVar = new bzaw(cprtVar2);
                        }
                    } else {
                        ((eksl) bzds.a.h()).q("Merging an already-associated message.");
                        String strAl2 = cprtVar2.a().al();
                        strAl2.getClass();
                        bzawVar = new bzay(cprtVar2, strAl2);
                    }
                    linkedHashMap.put(key, bzawVar);
                }
                objA = linkedHashMap;
            }
            if (objA == fcylVar) {
                return fcylVar;
            }
        }
        Map map = (Map) objA;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(fddu.f(fcwa.a(fcva.p(list, 10)), 16));
        for (fcti fctiVar2 : list) {
            Object obj5 = fctiVar2.a;
            Object obj6 = fctiVar2.b;
            eksp ekspVar = bzds.a;
            fcti fctiVar3 = new fcti(obj5, new bzaz(obj6, true != bzdl.a(((cprt) obj6).a()) ? 7 : 8));
            linkedHashMap2.put(fctiVar3.a, fctiVar3.b);
        }
        return fcwa.j(map, linkedHashMap2);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        bzdm bzdmVar = new bzdm(fcxyVar, this.b, this.c, this.d);
        bzdmVar.e = obj;
        return bzdmVar;
    }
}
