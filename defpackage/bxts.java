package defpackage;

import com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2.ConversationV2;
import com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2.MessageV2;
import com.google.android.apps.messaging.shared.datamodel.search.appsearch.schema.v2.ParticipantV2;
import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bxts extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ bxtt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bxts(bxtt bxttVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = bxttVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bxts) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objC;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        if (i == 0) {
            fctl.b(obj);
            bxtt bxttVar = this.c;
            this.b = 1;
            if (!craf.f) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            bxtp bxtpVar = bxttVar.d;
            if (fdgn.G("google_messages_app_search_platform_db", "/", false)) {
                throw new IllegalArgumentException("Database name cannot contain '/'");
            }
            dvcu dvcuVar = new dvcu(bxtpVar.a, bxtpVar.b, bxtpVar.c);
            objC = fdxs.c(fdxs.b(dvcuVar.d, fcyi.a, fdjz.a, new dvcs(dvcuVar, null)), this);
            if (objC != fcylVar) {
            }
            return fcylVar;
        }
        if (i != 1) {
            obj2 = this.a;
            fctl.b(obj);
            ekrw ekrwVarH = bxtt.a.h();
            ekrwVarH.X(eksq.a, "BugleSearch");
            ((ekrd) ekrwVarH.h("com/google/android/apps/messaging/shared/datamodel/search/appsearch/session/AppSearchSessionManagerImpl$appSearchSession$2$1", "invokeSuspend", 102, "AppSearchSessionManagerImpl.kt")).q("Finished initializing platform app search session.");
            return obj2;
        }
        fctl.b(obj);
        objC = obj;
        dvbf dvbfVar = (dvbf) objC;
        agv agvVar = new agv();
        int i2 = 0;
        agvVar.b();
        List listAsList = Arrays.asList(MessageV2.class, ConversationV2.class, ParticipantV2.class);
        lcg.i(listAsList);
        agvVar.b();
        afr afrVarB = afr.b();
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.addAll(listAsList);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            for (Class cls : afrVarB.a((Class) arrayList.get(i3)).e()) {
                if (!arrayList.contains(cls)) {
                    arrayList.add(cls);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList2.add(afrVarB.a((Class) arrayList.get(i4)).a());
        }
        agvVar.c(arrayList2);
        agvVar.g(G3AttributionInfo.class);
        agvVar.g(MessageV2.class);
        agvVar.g(ConversationV2.class);
        agvVar.g(ParticipantV2.class);
        lcg.b(true, "Version must be a positive number.");
        agvVar.b();
        agvVar.g = 2;
        bxto bxtoVar = bxto.a;
        Map mapG = fcwa.g(new fcti("Message", bxtoVar), new fcti("Conversation", bxtoVar), new fcti("Participant", bxtoVar));
        agvVar.b();
        agvVar.e.putAll(mapG);
        for (Map.Entry entry : bxtt.b.entrySet()) {
            for (agd agdVar : (Set) entry.getValue()) {
                Class cls2 = (Class) entry.getKey();
                lcg.i(cls2);
                agvVar.b();
                agvVar.e(afr.b().a(cls2).d(), agdVar);
            }
        }
        agw agwVarA = agvVar.a();
        ekgi ekgiVar = new ekgi();
        int i5 = bxtn.a;
        dvbh.a(MessageV2.class, bxtn.a(), ekgiVar);
        dvbh.a(ConversationV2.class, bxtn.a(), ekgiVar);
        dvbh.a(ParticipantV2.class, bxtn.a(), ekgiVar);
        final dvbi dvbiVar = new dvbi(ekgiVar.c());
        Set<afo> setF = agwVarA.f();
        Stream map = Collection.EL.stream(setF).map(new Function() { // from class: dvbl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj3) {
                return ((afo) obj3).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        Collector collector = ekcv.b;
        css cssVar = new css((ekhx) map.collect(collector));
        css cssVar2 = new css(agwVarA.g());
        cssVar2.removeAll(agwVarA.e().keySet());
        cssVar2.removeAll(agwVarA.b().keySet());
        cssVar2.removeAll(agwVarA.d().keySet());
        cssVar2.removeAll(agwVarA.c().keySet());
        cssVar.removeAll(cssVar2);
        final css cssVar3 = new css();
        for (afo afoVar : setF) {
            List listB = afoVar.b();
            int i6 = i2;
            while (true) {
                if (i6 < listB.size()) {
                    afl aflVar = (afl) listB.get(i6);
                    if (aflVar.g().equals("g3attrinfo")) {
                        aff affVar = G3AttributionInfo.a;
                        if (!aflVar.equals(affVar)) {
                            throw new IllegalArgumentException("Schema type '" + afoVar.a + "' already contains a property named 'g3attrinfo' but the property does not match the required config " + String.valueOf(affVar) + ". Either rename the property, remove the property, or ensure that the property matches the required configs.");
                        }
                        cssVar3.add(afoVar.a);
                        i2 = 0;
                    } else {
                        i6++;
                        i2 = 0;
                    }
                }
            }
        }
        if (!cssVar3.containsAll(cssVar)) {
            throw new IllegalArgumentException("Visible schema types must contain a G3AttributionInfo document property matching G3AttributionInfo#PROPERTY_CONFIG. Either add the document property or remove visibility for the following visible schema types: ".concat(String.valueOf(String.valueOf((ekhx) Collection.EL.stream(cssVar).filter(new Predicate() { // from class: dvbm
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
                public final boolean test(Object obj3) {
                    return !cssVar3.contains((String) obj3);
                }
            }).collect(collector)))));
        }
        ekhx ekhxVar = (ekhx) Collection.EL.stream(cssVar).filter(new Predicate() { // from class: dvbj
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
            public final boolean test(Object obj3) {
                return !dvbiVar.a.containsKey((String) obj3);
            }
        }).collect(collector);
        if (!ekhxVar.isEmpty()) {
            throw new IllegalArgumentException("The following visible schema types must have schema tags explicitly set with G3SetSchemaConfig.Builder#setSchemaTag: ".concat(String.valueOf(String.valueOf(ekhxVar))));
        }
        ekhx ekhxVar2 = (ekhx) Collection.EL.stream(dvbiVar.a.keySet()).filter(new Predicate() { // from class: dvbk
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
            public final boolean test(Object obj3) {
                return !cssVar3.contains((String) obj3);
            }
        }).collect(collector);
        if (!ekhxVar2.isEmpty()) {
            throw new IllegalArgumentException("The following schema types specified in G3SetSchemaConfig either do not exist or are not tagged in the SetSchemaRequest. For these schema types, either remove any calls to G3SetSchemaConfig.Builder#setSchemaTag or add a G3AttributionInfo document property: ".concat(String.valueOf(String.valueOf(ekhxVar2))));
        }
        for (afo afoVar2 : setF) {
            if (afoVar2.a.equals("G3AttributionInfo") && !afoVar2.equals(G3AttributionInfo.b)) {
                throw new IllegalArgumentException("SetSchemaRequest contains a schema named 'G3AttributionInfo' but the schema does not match the generated schema for G3AttributionInfo.");
            }
        }
        ListenableFuture listenableFutureC = dvbfVar.c(new dvbn(agwVarA, dvbiVar));
        listenableFutureC.getClass();
        this.a = dvbfVar;
        this.b = 2;
        if (fdxs.c(listenableFutureC, this) != fcylVar) {
            obj2 = dvbfVar;
            ekrw ekrwVarH2 = bxtt.a.h();
            ekrwVarH2.X(eksq.a, "BugleSearch");
            ((ekrd) ekrwVarH2.h("com/google/android/apps/messaging/shared/datamodel/search/appsearch/session/AppSearchSessionManagerImpl$appSearchSession$2$1", "invokeSuspend", 102, "AppSearchSessionManagerImpl.kt")).q("Finished initializing platform app search session.");
            return obj2;
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new bxts(this.c, fcxyVar);
    }
}
