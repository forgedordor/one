package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxwn {
    private static final eksp i = eksp.c("BugleSearch");
    public final String a;
    public final ConversationIdType b;
    public final String c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final byar h;
    private bxwq j;

    private bxwn(byar byarVar) {
        this.j = null;
        this.g = true;
        this.h = byarVar;
        this.a = null;
        this.b = barn.a;
        this.c = null;
        this.f = false;
        this.d = false;
        this.e = 1;
    }

    public static bxwn a(SearchQuery searchQuery) {
        bxwn bxwnVar;
        boolean z = false;
        if (searchQuery == null) {
            return new bxwn(null, barn.a, null, false);
        }
        List<SearchQuery.SearchFilter> listC = searchQuery.c();
        ConversationIdType conversationIdType = barn.a;
        boolean z2 = false;
        String str = null;
        String str2 = null;
        ConversationIdType conversationIdType2 = conversationIdType;
        int i2 = 1;
        boolean z3 = false;
        byar byarVar = null;
        for (SearchQuery.SearchFilter searchFilter : listC) {
            if (searchFilter instanceof SearchQuery.ConversationSearchFilter) {
                conversationIdType2 = ((SearchQuery.ConversationSearchFilter) searchFilter).a;
                ekrw ekrwVarN = i.n();
                ekrwVarN.X(cqnc.r, conversationIdType2.toString());
                ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/datamodel/search/common/QueryInfo", "infoFromQuery", 150, "QueryInfo.java")).q("Search query has conversation.");
            } else if (searchFilter instanceof SearchQuery.ContentSearchFilter) {
                i2 = ((SearchQuery.ContentSearchFilter) searchFilter).a;
                ekrw ekrwVarN2 = i.n();
                ekrwVarN2.X(cqnc.Y, Integer.valueOf(i2));
                ((eksl) ekrwVarN2.h("com/google/android/apps/messaging/shared/datamodel/search/common/QueryInfo", "infoFromQuery", 157, "QueryInfo.java")).q("Search query has content.");
                z3 = true;
            } else if (searchFilter instanceof SearchQuery.ParticipantSearchFilter) {
                str2 = ((SearchQuery.ParticipantSearchFilter) searchFilter).a;
                ekrw ekrwVarN3 = i.n();
                ekrwVarN3.X(bxze.f, str2);
                ((eksl) ekrwVarN3.h("com/google/android/apps/messaging/shared/datamodel/search/common/QueryInfo", "infoFromQuery", 163, "QueryInfo.java")).q("Search query has participant.");
            } else if (searchFilter instanceof SearchQuery.FreeTextSearchFilter) {
                str = ((SearchQuery.FreeTextSearchFilter) searchFilter).a;
                ekrw ekrwVarN4 = i.n();
                ekrwVarN4.X(bxze.c, str);
                ((eksl) ekrwVarN4.h("com/google/android/apps/messaging/shared/datamodel/search/common/QueryInfo", "infoFromQuery", 169, "QueryInfo.java")).q("Search query has free text.");
            } else if (searchFilter instanceof SearchQuery.StarSearchFilter) {
                ekrw ekrwVarN5 = i.n();
                ekrwVarN5.X(bxze.d, true);
                ((eksl) ekrwVarN5.h("com/google/android/apps/messaging/shared/datamodel/search/common/QueryInfo", "infoFromQuery", 175, "QueryInfo.java")).q("Search query has star filter.");
                z2 = true;
            } else if (searchFilter instanceof SearchQuery.ConversationListSearchFilter) {
                byarVar = ((SearchQuery.ConversationListSearchFilter) searchFilter).a;
                ekrw ekrwVarN6 = i.n();
                ekrwVarN6.X(bxze.e, true);
                ((eksl) ekrwVarN6.h("com/google/android/apps/messaging/shared/datamodel/search/common/QueryInfo", "infoFromQuery", 182, "QueryInfo.java")).q("Search query has ConversationList filter.");
                z = true;
            }
        }
        if (z) {
            byarVar.getClass();
            bxwnVar = new bxwn(byarVar);
        } else {
            bxwnVar = z3 ? new bxwn(str, conversationIdType2, str2, i2, z2) : new bxwn(str, conversationIdType2, str2, z2);
        }
        bxwq bxwqVarB = searchQuery.b();
        if (bxwqVarB != null) {
            bxwnVar.j = bxwqVarB;
        }
        return bxwnVar;
    }

    public final Optional b() {
        return Optional.ofNullable(this.j);
    }

    public final boolean c() {
        return !this.b.b();
    }

    public final boolean d() {
        return !TextUtils.isEmpty(this.a);
    }

    public final boolean e() {
        return !TextUtils.isEmpty(this.c);
    }

    public final boolean f() {
        return (d() || c() || e() || this.d || this.f || this.g) ? false : true;
    }

    private bxwn(String str, ConversationIdType conversationIdType, String str2, int i2, boolean z) {
        this.h = null;
        this.j = null;
        this.a = str;
        this.b = conversationIdType;
        this.c = str2;
        this.d = true;
        this.e = i2;
        this.f = z;
        this.g = false;
    }

    private bxwn(String str, ConversationIdType conversationIdType, String str2, boolean z) {
        this.h = null;
        this.j = null;
        this.a = str;
        this.b = conversationIdType;
        this.c = str2;
        this.f = z;
        this.d = false;
        this.e = 1;
        this.g = false;
    }
}
