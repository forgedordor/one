package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.ArrayMap;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.Section;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class byak implements bxzz {
    public static final eksp a = eksp.c("BugleSearch");
    public static final ekgb b = ekgb.r("internal.3p:Person_no_gsa");
    public static final ekgb c = ekgb.r("internal.3p:Message_no_gsa");
    public static final ekgb d = ekgb.r("internal.3p:Conversation_no_gsa");
    public final String e;
    public final Executor f;
    public final QuerySpecification g;
    public final fcsu h;
    public final dedd i;
    public final eigp j;

    public byak(Context context, eosc eoscVar, fcsu fcsuVar, dedd deddVar, eigp eigpVar) {
        this.e = context.getPackageName();
        this.f = eoscVar;
        this.h = fcsuVar;
        dbit dbitVar = new dbit();
        dbitVar.b = 3;
        dbitVar.c(new Section("thing_proto", false, 0));
        dbitVar.b();
        dbitVar.c = "user-generated-query";
        this.g = dbitVar.a();
        dbit dbitVar2 = new dbit();
        dbitVar2.b();
        dbitVar2.c = "background-query";
        dbitVar2.a();
        this.i = deddVar;
        this.j = eigpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String c(Map map, String str) {
        eydx eydxVar = (eydx) map.get(str);
        eydxVar.getClass();
        ejwl.l(eydxVar.c.size() == 1);
        return (String) eydxVar.c.get(0);
    }

    public static Map d(dbje dbjeVar) {
        try {
            ArrayMap arrayMap = new ArrayMap();
            ByteBuffer byteBufferC = dbjeVar.c();
            if (byteBufferC != null) {
                byte[] bArr = new byte[byteBufferC.remaining()];
                byteBufferC.get(bArr);
                for (eydx eydxVar : ((eyea) evsn.parseFrom(eyea.a, bArr, evrr.a())).b) {
                    arrayMap.put(eydxVar.b, eydxVar);
                }
            }
            return arrayMap;
        } catch (evtj e) {
            ((eksl) ((eksl) ((eksl) a.i()).g(e)).h("com/google/android/apps/messaging/shared/datamodel/search/icing/IcingSearchApiImpl", "getPropertiesMap", (char) 405, "IcingSearchApiImpl.java")).q("Unable to get Thing from document.");
            throw new IllegalStateException(e);
        }
    }

    public static final Long e(dbje dbjeVar) {
        String strB = dbjeVar.b();
        if (strB == null) {
            ((eksl) ((eksl) a.j()).h("com/google/android/apps/messaging/shared/datamodel/search/icing/IcingSearchApiImpl", "getLastPathSegmentFromUri", 334, "IcingSearchApiImpl.java")).t("Couldn't get last segment for corpus %s, document uri is null.", dbjeVar.a());
            return -1L;
        }
        String lastPathSegment = Uri.parse(strB).getLastPathSegment();
        lastPathSegment.getClass();
        return Long.valueOf(Long.parseLong(lastPathSegment));
    }

    @Override // defpackage.bxzz
    public final eiju a(SearchQuery searchQuery) {
        int i;
        String str = null;
        final Long lValueOf = null;
        for (SearchQuery.SearchFilter searchFilter : searchQuery.c()) {
            if (searchFilter instanceof SearchQuery.FreeTextSearchFilter) {
                str = ((SearchQuery.FreeTextSearchFilter) searchFilter).a;
            } else if (searchFilter instanceof SearchQuery.ConversationSearchFilter) {
                lValueOf = Long.valueOf(Long.parseLong(((SearchQuery.ConversationSearchFilter) searchFilter).a.a()));
            }
        }
        if (TextUtils.isEmpty(str)) {
            ((eksl) a.o().h("com/google/android/apps/messaging/shared/datamodel/search/icing/IcingSearchApiImpl", "search", 125, "IcingSearchApiImpl.java")).q("Empty query for search.");
            return eijx.e(bxwf.e());
        }
        String strD = byan.d(str, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        if (TextUtils.isEmpty(strD)) {
            ekrw ekrwVarO = a.o();
            ekrwVarO.X(bxze.b, str);
            ((eksl) ekrwVarO.h("com/google/android/apps/messaging/shared/datamodel/search/icing/IcingSearchApiImpl", "search", 136, "IcingSearchApiImpl.java")).q("Empty st query for search");
            return eijx.e(bxwf.e());
        }
        bxwn bxwnVarA = bxwn.a(searchQuery);
        final ArrayList arrayList = new ArrayList();
        boolean z = bxwnVarA.d;
        if (!z || (i = bxwnVarA.e) == 1 || i == 7) {
            arrayList.add(new byah(c, byan.e(strD, byan.d(str, "keywords"))));
        }
        String strD2 = byan.d(str, "name");
        if (lValueOf == null && (!z || bxwnVarA.e == 1)) {
            arrayList.add(new byah(d, byan.e(strD2, byan.d(str, "keywords"))));
        }
        if (arrayList.isEmpty()) {
            return eijx.e(bxwf.e());
        }
        final CancellationSignal cancellationSignalA = searchQuery.a();
        ejwl.a(!arrayList.isEmpty());
        final css cssVar = new css();
        final css cssVar2 = new css();
        final css cssVar3 = new css();
        final css cssVar4 = new css();
        final ArrayMap arrayMap = new ArrayMap();
        return eiju.g(kol.a(new koi() { // from class: byaa
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                byak byakVar = this.a;
                eigp eigpVar = byakVar.j;
                CancellationSignal cancellationSignal = cancellationSignalA;
                Long l = lValueOf;
                Set set = cssVar;
                ArrayMap arrayMap2 = arrayMap;
                Set set2 = cssVar2;
                List list = arrayList;
                Set set3 = cssVar3;
                new byaf(byakVar, list, byakVar.g, byakVar.f, kogVar, eigpVar, cancellationSignal, l, set, arrayMap2, set2, set3, cssVar4).e();
                return "IcingSearchApiImpl.fetchMessageSearchResults";
            }
        }));
    }

    @Override // defpackage.bxzz
    public final eiju b(String str) {
        String strE = byan.e(byan.d(str, "name"), byan.d(str, "keywords"));
        if (TextUtils.isEmpty(strE)) {
            ((eksl) a.o().h("com/google/android/apps/messaging/shared/datamodel/search/icing/IcingSearchApiImpl", "searchParticipants", 181, "IcingSearchApiImpl.java")).q("Empty query for searchParticipants.");
            int i = ekgb.d;
            return eijx.e(ekoe.a);
        }
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new byah(b, strE));
        return eiju.g(kol.a(new koi() { // from class: byab
            @Override // defpackage.koi
            public final Object a(kog kogVar) {
                byak byakVar = this.a;
                new byag(byakVar, arrayList2, byakVar.g, byakVar.f, kogVar, byakVar.j, arrayList).e();
                return "IcingSearchApiImpl.fetchParticipantSearchResults";
            }
        }));
    }
}
