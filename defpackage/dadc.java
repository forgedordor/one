package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.car.app.model.Alert;
import com.google.android.apps.messaging.shared.datamodel.databasegen.queries.UrlSearchResult;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.android.apps.messaging.ui.search.presenter.ContactFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.ContentFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.ConversationFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.ConversationListFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.FreeTextFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.SearchFilterDataItem;
import com.google.android.apps.messaging.ui.search.presenter.SelectedSearchResult;
import com.google.android.apps.messaging.ui.search.presenter.StarFilterDataItem;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dadc extends lxd implements dacu {
    public static final eksp a = eksp.c("BugleSearch");
    public final bxuz b;
    public final dach c;
    public final axjf d;
    public final dabt e;
    public SelectedSearchResult f;
    public SearchFilterDataItem g;
    public final lvy h;
    private final bxwh i;
    private final bxuh j;
    private dadb k;
    private dzub l;
    private final cxum m;
    private final eosc n;
    private final dabl o;
    private final ajfo p;
    private final Locale q;
    private final fcsu r;
    private final ArrayList s;
    private boolean t;
    private final lvy u;
    private final lvy v;
    private final lvy w;
    private final dace x;
    private final daca y;

    public dadc(Context context, bxuz bxuzVar, bxwh bxwhVar, bxuh bxuhVar, dach dachVar, dace daceVar, daca dacaVar, axjf axjfVar, cxum cxumVar, eosc eoscVar, dabt dabtVar, dabl dablVar, ajfo ajfoVar, fcsu fcsuVar) {
        ArrayList arrayList = new ArrayList();
        this.s = arrayList;
        lvy lvyVar = new lvy();
        this.u = lvyVar;
        lvy lvyVar2 = new lvy();
        this.v = lvyVar2;
        this.h = new lvy();
        this.w = new lvy();
        this.i = bxwhVar;
        this.j = bxuhVar;
        this.c = dachVar;
        this.x = daceVar;
        this.y = dacaVar;
        this.d = axjfVar;
        this.m = cxumVar;
        this.n = eoscVar;
        this.e = dabtVar;
        this.o = dablVar;
        this.p = ajfoVar;
        this.r = fcsuVar;
        this.q = craf.c(context);
        lvyVar.m(arrayList);
        this.b = bxuzVar;
        F(lvyVar2, dacj.g());
    }

    public static final SearchQuery C(ekgb ekgbVar, boolean z, CancellationSignal cancellationSignal) {
        if (!z) {
            bxua bxuaVar = new bxua();
            bxuaVar.b(ekgbVar);
            bxuaVar.b = cancellationSignal;
            return bxuaVar.a();
        }
        int iMax = Math.max(6, 4);
        bxuc bxucVar = new bxuc();
        bxucVar.a(Alert.DURATION_SHOW_INDEFINITELY);
        bxucVar.d(Alert.DURATION_SHOW_INDEFINITELY);
        bxucVar.e(Alert.DURATION_SHOW_INDEFINITELY);
        bxucVar.g(Alert.DURATION_SHOW_INDEFINITELY);
        bxucVar.c(Alert.DURATION_SHOW_INDEFINITELY);
        bxucVar.f = Alert.DURATION_SHOW_INDEFINITELY;
        bxucVar.i = (byte) (bxucVar.i | 32);
        bxucVar.f(Alert.DURATION_SHOW_INDEFINITELY);
        bxucVar.b(Alert.DURATION_SHOW_INDEFINITELY);
        bxucVar.a(4);
        bxucVar.d(4);
        bxucVar.c(3);
        int i = iMax + iMax + 1;
        bxucVar.e(i);
        bxucVar.g(i);
        bxucVar.b(4);
        bxucVar.f(4);
        if (bxucVar.i == -1) {
            bxud bxudVar = new bxud(bxucVar.a, bxucVar.b, bxucVar.c, bxucVar.d, bxucVar.e, bxucVar.f, bxucVar.g, bxucVar.h);
            bxua bxuaVar2 = new bxua();
            bxuaVar2.b(ekgbVar);
            bxuaVar2.a = bxudVar;
            bxuaVar2.b = cancellationSignal;
            return bxuaVar2.a();
        }
        StringBuilder sb = new StringBuilder();
        if ((bxucVar.i & 1) == 0) {
            sb.append(" chatLimit");
        }
        if ((bxucVar.i & 2) == 0) {
            sb.append(" messageLimit");
        }
        if ((bxucVar.i & 4) == 0) {
            sb.append(" photoLimit");
        }
        if ((bxucVar.i & 8) == 0) {
            sb.append(" videoLimit");
        }
        if ((bxucVar.i & 16) == 0) {
            sb.append(" linkLimit");
        }
        if ((bxucVar.i & 32) == 0) {
            sb.append(" locationLimit");
        }
        if ((bxucVar.i & 64) == 0) {
            sb.append(" starredLimit");
        }
        if ((bxucVar.i & 128) == 0) {
            sb.append(" contactLimit");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    private final int D() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.s;
            if (i >= arrayList.size()) {
                return -1;
            }
            if (arrayList.get(i) instanceof FreeTextFilterDataItem) {
                return i;
            }
            i++;
        }
    }

    private final ekgb E(boolean z) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        SearchFilterDataItem searchFilterDataItem = this.g;
        if (searchFilterDataItem != null) {
            ekfwVar.h(searchFilterDataItem.a());
        }
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            SearchFilterDataItem searchFilterDataItem2 = (SearchFilterDataItem) arrayList.get(i2);
            if (!z || !(searchFilterDataItem2 instanceof FreeTextFilterDataItem)) {
                ekfwVar.h(searchFilterDataItem2.a());
            }
        }
        return ekfwVar.g();
    }

    private static void F(lvy lvyVar, dacj dacjVar) {
        dacj dacjVar2 = (dacj) lvyVar.a();
        lvyVar.m(dacjVar);
        if (dacjVar2 != null) {
            final Cursor cursor = ((bxtv) dacjVar2.a().a()).a;
            final Cursor cursor2 = ((bxtv) dacjVar2.a().b()).a;
            ecem.d(new Runnable() { // from class: dacv
                @Override // java.lang.Runnable
                public final void run() {
                    cursor.close();
                }
            }, 1000L);
            ecem.d(new Runnable() { // from class: dacv
                @Override // java.lang.Runnable
                public final void run() {
                    cursor2.close();
                }
            }, 1000L);
        }
    }

    private final void G(dzua dzuaVar) {
        dzub dzubVar = this.l;
        if (dzubVar != null) {
            this.p.H.h(dzubVar, dadd.b, dzuaVar);
            this.l = null;
        }
    }

    private final void H(final int i) {
        ecem.c();
        eksp ekspVar = a;
        ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "performSearchInternal", 579, "ZeroStateSearchPresenterImpl.java")).q("Search for results.");
        FreeTextFilterDataItem freeTextFilterDataItemX = x();
        if (freeTextFilterDataItemX != null && this.m.a(freeTextFilterDataItemX.a().a)) {
            ((eksl) ekspVar.o().h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "performSearchInternal", 581, "ZeroStateSearchPresenterImpl.java")).q("Search query is a debug hook.");
            return;
        }
        dadb dadbVar = this.k;
        if (dadbVar != null) {
            dadbVar.a.cancel();
            dadbVar.b = true;
            ((eksl) ((eksl) ekspVar.h()).h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "performSearchInternal", 588, "ZeroStateSearchPresenterImpl.java")).q("Concurrent search, cancelling previous request.");
            this.k = null;
            G(dzua.CANCEL);
        }
        if (this.s.isEmpty() && this.g == null) {
            B(dacj.g());
            A();
            return;
        }
        final ekgb ekgbVarE = E(!this.t);
        this.l = this.p.a();
        final dabl dablVar = this.o;
        eijx.g(new Callable() { // from class: dabh
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dabl dablVar2 = dablVar;
                if (!((ajhd) dablVar2.b.b()).Y()) {
                    dabl.a.m("Clearcut loggings are disabled.");
                    return true;
                }
                List list = ekgbVarE;
                int i2 = i;
                emhh emhhVar = (emhh) emhj.a.createBuilder();
                emhhVar.copyOnWrite();
                emhj emhjVar = (emhj) emhhVar.instance;
                emhjVar.c = i2 - 1;
                emhjVar.b |= 1;
                emhk emhkVar = (emhk) emhl.a.createBuilder();
                ekqh it = ((ekgb) list).iterator();
                while (it.hasNext()) {
                    SearchQuery.SearchFilter searchFilter = (SearchQuery.SearchFilter) it.next();
                    if (searchFilter instanceof SearchQuery.FreeTextSearchFilter) {
                        emhkVar.copyOnWrite();
                        emhl emhlVar = (emhl) emhkVar.instance;
                        emhlVar.b |= 4;
                        emhlVar.e = true;
                    } else if (searchFilter instanceof SearchQuery.ParticipantSearchFilter) {
                        emhkVar.copyOnWrite();
                        emhl emhlVar2 = (emhl) emhkVar.instance;
                        emhlVar2.b |= 2;
                        emhlVar2.d = true;
                    } else if (searchFilter instanceof SearchQuery.ConversationSearchFilter) {
                        emhkVar.copyOnWrite();
                        emhl emhlVar3 = (emhl) emhkVar.instance;
                        emhlVar3.b |= 1;
                        emhlVar3.c = true;
                    } else if (searchFilter instanceof SearchQuery.ContentSearchFilter) {
                        int iC = dabl.c(((SearchQuery.ContentSearchFilter) searchFilter).a);
                        emhkVar.copyOnWrite();
                        emhl emhlVar4 = (emhl) emhkVar.instance;
                        emhlVar4.f = iC - 1;
                        emhlVar4.b |= 8;
                    } else if (searchFilter instanceof SearchQuery.StarSearchFilter) {
                        emhkVar.copyOnWrite();
                        emhl emhlVar5 = (emhl) emhkVar.instance;
                        emhlVar5.b |= 16;
                        emhlVar5.g = true;
                    }
                }
                emhl emhlVar6 = (emhl) emhkVar.build();
                emhhVar.copyOnWrite();
                emhj emhjVar2 = (emhj) emhhVar.instance;
                emhlVar6.getClass();
                emhjVar2.d = emhlVar6;
                emhjVar2.b |= 2;
                emhj emhjVar3 = (emhj) emhhVar.build();
                ellg ellgVar = (ellg) ellh.a.createBuilder();
                ellf ellfVar = ellf.SEARCH_QUERY;
                ellgVar.copyOnWrite();
                ellh ellhVar = (ellh) ellgVar.instance;
                ellhVar.j = ellfVar.f11do;
                ellhVar.b = 1 | ellhVar.b;
                ellgVar.copyOnWrite();
                ellh ellhVar2 = (ellh) ellgVar.instance;
                emhjVar3.getClass();
                ellhVar2.am = emhjVar3;
                ellhVar2.d |= 256;
                ((aill) dablVar2.c.b()).j(ellgVar);
                return true;
            }
        }, dablVar.e).k(auwc.a(new dabi()), eoqg.a);
        final dadb dadbVar2 = new dadb(this);
        this.k = dadbVar2;
        bxuz bxuzVar = this.b;
        CancellationSignal cancellationSignal = dadbVar2.a;
        auvh.a(bxuzVar.b(C(ekgbVarE, true, cancellationSignal), cancellationSignal).i(new eooz() { // from class: dacw
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                bxwt bxwtVar = (bxwt) obj;
                if (bxwtVar.i() != 1) {
                    return eijx.e(bxwtVar);
                }
                dadb dadbVar3 = dadbVar2;
                ekgb ekgbVar = ekgbVarE;
                bxuz bxuzVar2 = this.a.b;
                CancellationSignal cancellationSignal2 = dadbVar3.a;
                return bxuzVar2.b(dadc.C(ekgbVar, false, cancellationSignal2), cancellationSignal2);
            }
        }, this.n).h(new ejvr() { // from class: dacx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                bxwt bxwtVar = (bxwt) obj;
                eksp ekspVar2 = dadc.a;
                dadb dadbVar3 = dadbVar2;
                boolean z = true;
                if (dadbVar3.b) {
                    if (bxwtVar != null) {
                        ((bxtv) bxwtVar.a()).a.close();
                        ((bxtv) bxwtVar.b()).a.close();
                    }
                } else if (bxwtVar == null) {
                    ((eksl) ((eksl) dadc.a.h()).h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl$CancelableSearchResultsHandler", "getSearchResultsToViewStateTransform", 712, "ZeroStateSearchPresenterImpl.java")).q("No results.");
                    dadc dadcVar = dadbVar3.c;
                    dadcVar.A();
                    dadcVar.B(dacj.f());
                    z = false;
                } else {
                    int i2 = bxwtVar.i();
                    if (i2 == 0) {
                        ((eksl) ((eksl) dadc.a.h()).h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl$CancelableSearchResultsHandler", "getSearchResultsToViewStateTransform", 720, "ZeroStateSearchPresenterImpl.java")).q("Asking view to go to the no results screen.");
                        dadc dadcVar2 = dadbVar3.c;
                        dadcVar2.A();
                        dadcVar2.B(dacj.f());
                    } else {
                        dadc dadcVar3 = dadbVar3.c;
                        FreeTextFilterDataItem freeTextFilterDataItemX2 = dadcVar3.x();
                        String str = freeTextFilterDataItemX2 == null ? "" : freeTextFilterDataItemX2.a().a;
                        dabp dabpVar = i2 == 1 ? new dabp(bxwtVar, 4, dadcVar3.e.a(bxwtVar, str), dadcVar3.z(bxwtVar), dadcVar3.y(bxwtVar)) : new dabp(bxwtVar, 5, dadcVar3.e.a(bxwtVar, str), dadcVar3.z(bxwtVar), dadcVar3.y(bxwtVar));
                        SelectedSearchResult selectedSearchResult = dadcVar3.f;
                        if (selectedSearchResult != null) {
                            dadcVar3.h.m(selectedSearchResult.c(dabpVar));
                            dadcVar3.f = null;
                        } else {
                            lvy lvyVar = dadcVar3.h;
                            SelectedSearchResult selectedSearchResult2 = (SelectedSearchResult) lvyVar.a();
                            if (selectedSearchResult2 != null) {
                                SelectedSearchResult selectedSearchResultC = selectedSearchResult2.c(dabpVar);
                                if (!selectedSearchResult2.equals(selectedSearchResultC)) {
                                    lvyVar.m(selectedSearchResultC);
                                }
                            }
                        }
                        dadcVar3.B(dabpVar);
                    }
                }
                return Boolean.valueOf(z);
            }
        }, new Executor() { // from class: dacy
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                ecem.e(runnable);
            }
        }));
    }

    public final void A() {
        if (this.f != null) {
            this.h.m(null);
        }
        this.f = null;
    }

    public final void B(dacj dacjVar) {
        if (((dabp) dacjVar).b != 1) {
            G(dzua.SUCCESS);
        }
        F(this.v, dacjVar);
    }

    @Override // defpackage.dact
    public final lvv a() {
        return this.w;
    }

    @Override // defpackage.dact
    public final void b() {
        if (!((asky) this.r.b()).a()) {
            this.w.j(new dstv());
            return;
        }
        dacj dacjVar = (dacj) this.v.a();
        if (dacjVar == null || dacjVar.e() != 1) {
            return;
        }
        bxwt bxwtVarA = bxwt.j().a();
        dabv dabvVarD = dabv.d();
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        B(new dabp(bxwtVarA, 2, dabvVarD, ekgbVar, ekgbVar));
    }

    @Override // defpackage.dacp
    public final SearchFilterDataItem c() {
        SearchFilterDataItem searchFilterDataItem;
        FreeTextFilterDataItem freeTextFilterDataItemX = x();
        if (freeTextFilterDataItemX != null && this.t) {
            j(freeTextFilterDataItemX);
            return freeTextFilterDataItemX;
        }
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        do {
            size--;
            if (size < 0) {
                return null;
            }
            searchFilterDataItem = (SearchFilterDataItem) arrayList.get(size);
        } while (searchFilterDataItem instanceof FreeTextFilterDataItem);
        j(searchFilterDataItem);
        return searchFilterDataItem;
    }

    @Override // defpackage.dacu
    public final lvv e() {
        return this.u;
    }

    @Override // defpackage.dacp
    public final boolean f(SearchFilterDataItem searchFilterDataItem) {
        bxwd bxwdVarC = this.b.c(SearchQuery.d(E(true)));
        return searchFilterDataItem instanceof ContentFilterDataItem ? bxwdVarC.a(((ContentFilterDataItem) searchFilterDataItem).a().a) : searchFilterDataItem instanceof ContactFilterDataItem ? bxwdVarC.c() : searchFilterDataItem instanceof StarFilterDataItem ? bxwdVarC.d() : searchFilterDataItem instanceof ConversationListFilterDataItem ? bxwdVarC.a.f() : (searchFilterDataItem instanceof FreeTextFilterDataItem) && bxwdVarC.b();
    }

    @Override // defpackage.lxd
    protected final void fC() {
        B(dacj.g());
        ((bxtv) bxut.c).a.close();
    }

    @Override // defpackage.dacu
    public final lvv g() {
        return this.v;
    }

    @Override // defpackage.dacp
    public final void h(SearchFilterDataItem searchFilterDataItem) {
        ArrayList arrayList = this.s;
        if (arrayList.contains(searchFilterDataItem)) {
            ekrw ekrwVarO = a.o();
            ekrwVarO.X(daaa.a, searchFilterDataItem);
            ((eksl) ekrwVarO.h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "addFilter", 209, "ZeroStateSearchPresenterImpl.java")).q("Search Filter not added because it is already present.");
        } else if (arrayList.add(searchFilterDataItem)) {
            ekrw ekrwVarO2 = a.o();
            ekrwVarO2.X(daaa.a, searchFilterDataItem);
            ((eksl) ekrwVarO2.h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "addFilter", 218, "ZeroStateSearchPresenterImpl.java")).q("Search Filter added.");
            this.u.m(arrayList);
            w(3);
        }
    }

    @Override // defpackage.dacu
    public final lvv i() {
        return this.h;
    }

    @Override // defpackage.dacp
    public final void j(SearchFilterDataItem searchFilterDataItem) {
        ArrayList arrayList = this.s;
        if (!arrayList.remove(searchFilterDataItem)) {
            ekrw ekrwVarO = a.o();
            ekrwVarO.X(daaa.a, searchFilterDataItem);
            ((eksl) ekrwVarO.h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "removeFilter", 242, "ZeroStateSearchPresenterImpl.java")).q("Search Filter not removed because it is not present.");
        } else {
            ekrw ekrwVarO2 = a.o();
            ekrwVarO2.X(daaa.a, searchFilterDataItem);
            ((eksl) ekrwVarO2.h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "removeFilter", 233, "ZeroStateSearchPresenterImpl.java")).q("Search Filter removed.");
            this.u.m(arrayList);
            w(4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dacu
    public final SearchQuery.ParticipantSearchFilter k() {
        ekgb ekgbVarE = E(true);
        int i = ((ekoe) ekgbVarE).c;
        int i2 = 0;
        while (i2 < i) {
            SearchQuery.SearchFilter searchFilter = (SearchQuery.SearchFilter) ekgbVarE.get(i2);
            i2++;
            if (searchFilter instanceof SearchQuery.ParticipantSearchFilter) {
                return (SearchQuery.ParticipantSearchFilter) searchFilter;
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dacu
    public final SearchQuery.StarSearchFilter l() {
        ekgb ekgbVarE = E(true);
        int i = ((ekoe) ekgbVarE).c;
        int i2 = 0;
        while (i2 < i) {
            SearchQuery.SearchFilter searchFilter = (SearchQuery.SearchFilter) ekgbVarE.get(i2);
            i2++;
            if (searchFilter instanceof SearchQuery.StarSearchFilter) {
                return (SearchQuery.StarSearchFilter) searchFilter;
            }
        }
        return null;
    }

    @Override // defpackage.dacu
    public final ConversationFilterDataItem m() {
        return (ConversationFilterDataItem) this.g;
    }

    @Override // defpackage.dacu
    public final FreeTextFilterDataItem n() {
        return x();
    }

    @Override // defpackage.dacu
    public final SearchFilterDataItem o() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dacu
    public final /* synthetic */ ListenableFuture p(final String str) throws Resources.NotFoundException {
        ekgb ekgbVar;
        int i;
        eksp ekspVar = a;
        ekrw ekrwVarO = ekspVar.o();
        ekrz ekrzVar = daaa.b;
        ekrwVarO.X(ekrzVar, str);
        ((eksl) ekrwVarO.h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "getSuggestions", 301, "ZeroStateSearchPresenterImpl.java")).q("Getting suggestions for prefix");
        final ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            ((eksl) ekspVar.o().h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "getSuggestions", 305, "ZeroStateSearchPresenterImpl.java")).q("Empty prefix thus returning empty results");
            return eijx.e(arrayList);
        }
        boolean z = true;
        final bxwd bxwdVarC = this.b.c(SearchQuery.d(E(true)));
        dach dachVar = this.c;
        ekgb ekgbVarU = ekgb.u(dachVar.b(new SearchQuery.ContentSearchFilter(2)), dachVar.b(new SearchQuery.ContentSearchFilter(3)), dachVar.b(new SearchQuery.ContentSearchFilter(5)), dachVar.b(new SearchQuery.ContentSearchFilter(4)));
        int i2 = ((ekoe) ekgbVarU).c;
        int i3 = 0;
        while (i3 < i2) {
            boolean z2 = z;
            ContentFilterDataItem contentFilterDataItem = (ContentFilterDataItem) ekgbVarU.get(i3);
            Locale locale = this.q;
            dabs dabsVar = contentFilterDataItem.a;
            eksp ekspVar2 = ekspVar;
            if (Objects.equals(dabsVar.d, locale)) {
                cqaz.f(dabsVar.c.isEmpty());
                ekgbVar = ekgbVarU;
                i = i2;
            } else {
                ArrayList arrayList2 = dabsVar.c;
                arrayList2.clear();
                dabsVar.d = locale;
                ekgbVar = ekgbVarU;
                i = i2;
                String[] stringArray = dabsVar.a.getStringArray(dabsVar.b);
                int length = stringArray.length;
                int i4 = 0;
                while (i4 < length) {
                    int i5 = i4;
                    arrayList2.add(stringArray[i5].toLowerCase(locale));
                    i4 = i5 + 1;
                }
            }
            String lowerCase = str.toLowerCase(locale);
            ArrayList arrayList3 = dabsVar.c;
            cqaz.f(arrayList3.isEmpty());
            int size = arrayList3.size();
            int i6 = 0;
            while (true) {
                if (i6 < size) {
                    boolean zStartsWith = ((String) arrayList3.get(i6)).startsWith(lowerCase);
                    i6++;
                    if (zStartsWith) {
                        if (bxwdVarC.a(contentFilterDataItem.a().a)) {
                            ekrw ekrwVarO2 = ekspVar2.o();
                            ekrwVarO2.X(daaa.c, contentFilterDataItem.e());
                            ekrwVarO2.X(ekrzVar, str);
                            ((eksl) ekrwVarO2.h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "addSupportedContentFiltersMatchingPrefix", 472, "ZeroStateSearchPresenterImpl.java")).q("Adding suggestion for prefix.");
                            arrayList.add(contentFilterDataItem);
                        }
                    }
                }
            }
            i3++;
            z = z2;
            ekspVar = ekspVar2;
            ekgbVarU = ekgbVar;
            i2 = i;
        }
        eksp ekspVar3 = ekspVar;
        boolean z3 = z;
        StarFilterDataItem starFilterDataItemF = dachVar.f(false);
        if (bxwdVarC.d()) {
            Locale locale2 = this.q;
            if (starFilterDataItemF.f().toLowerCase(locale2).startsWith(str.toLowerCase(locale2))) {
                ekrw ekrwVarO3 = ekspVar3.o();
                ekrwVarO3.X(daaa.c, starFilterDataItemF.e());
                ekrwVarO3.X(ekrzVar, str);
                ((eksl) ekrwVarO3.h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "addStarFilterIfMatchingPrefix", 490, "ZeroStateSearchPresenterImpl.java")).q("Adding suggestion for prefix.");
                arrayList.add(starFilterDataItemF);
            }
        }
        eiju eijuVarE = eijx.e(ekoe.a);
        if (bxwdVarC.c()) {
            final eiju eijuVarA = ((bxum) this.j).a(str, Alert.DURATION_SHOW_INDEFINITELY, null);
            SearchFilterDataItem searchFilterDataItem = this.g;
            final eiju eijuVarB = this.i.b(str, searchFilterDataItem instanceof ConversationFilterDataItem ? ((ConversationFilterDataItem) searchFilterDataItem).a().a : barn.a);
            ListenableFuture[] listenableFutureArr = new ListenableFuture[2];
            listenableFutureArr[0] = eijuVarB;
            listenableFutureArr[z3 ? 1 : 0] = eijuVarA;
            eijuVarE = eijx.m(listenableFutureArr).a(new Callable() { // from class: dada
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dadc dadcVar;
                    List list = (List) eork.q(eijuVarB);
                    List<qxf> list2 = (List) eork.q(eijuVarA);
                    ArrayList arrayList4 = new ArrayList();
                    HashSet hashSet = new HashSet();
                    Iterator it = list.iterator();
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        dadcVar = this.a;
                        if (!it.hasNext()) {
                            break;
                        }
                        ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) it.next();
                        String strS = bindData.S();
                        String strQ = bindData.Q();
                        if (!TextUtils.isEmpty(strQ) && !TextUtils.isEmpty(strS)) {
                            arrayList4.add(dadcVar.c.a(new SearchQuery.ParticipantSearchFilter(strS), dadcVar.d.a(bindData), strQ));
                            hashSet.add(strS);
                            i8++;
                            if (i8 >= 3) {
                                break;
                            }
                        } else {
                            ((eksl) ((eksl) dadc.a.j()).h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "createContactSearchFilter", 420, "ZeroStateSearchPresenterImpl.java")).q("Participant that is not in the contact list was returned.");
                        }
                    }
                    if (!(dadcVar.g instanceof ConversationFilterDataItem)) {
                        for (qxf qxfVar : list2) {
                            String str2 = qxfVar.k;
                            if (!TextUtils.isEmpty(str2)) {
                                if (!hashSet.contains(str2)) {
                                    arrayList4.add(dadcVar.c.a(new SearchQuery.ParticipantSearchFilter(str2), dadcVar.d.a(bbbd.r(qxfVar)), qxfVar.b));
                                    hashSet.add(str2);
                                    i7++;
                                    if (i7 >= 6 - i8) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            } else {
                                ((eksl) ((eksl) dadc.a.j()).h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "createContactSearchFilter", 441, "ZeroStateSearchPresenterImpl.java")).q("Empty lookup key while searching recipient contacts.");
                            }
                        }
                    }
                    return arrayList4;
                }
            }, this.n);
        }
        return eijuVarE.h(new ejvr() { // from class: dacz
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                List list = (List) obj;
                list.getClass();
                ArrayList arrayList4 = arrayList;
                arrayList4.addAll(list);
                if (bxwdVarC.b()) {
                    String str2 = str;
                    dadc dadcVar = this.a;
                    ekrw ekrwVarO4 = dadc.a.o();
                    ekrwVarO4.X(daaa.c, str2);
                    ekrwVarO4.X(daaa.b, str2);
                    ((eksl) ekrwVarO4.h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "getSuggestions", 330, "ZeroStateSearchPresenterImpl.java")).q("Adding suggestion for prefix.");
                    arrayList4.add(dadcVar.c.e(new SearchQuery.FreeTextSearchFilter(str2)));
                }
                return arrayList4;
            }
        }, this.n);
    }

    @Override // defpackage.dacu
    public final void q(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        this.f = (SelectedSearchResult) bundle.getParcelable("selected");
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("zero_state_search_filters");
        if (parcelableArrayList != null) {
            ArrayList arrayList = this.s;
            arrayList.clear();
            arrayList.addAll(parcelableArrayList);
        }
        this.u.m(this.s);
        this.g = (SearchFilterDataItem) bundle.getParcelable("base_filter");
        this.t = bundle.getBoolean("performed_search_with_free_text");
        H(5);
    }

    @Override // defpackage.dacu
    public final void r(Bundle bundle) {
        SelectedSearchResult selectedSearchResult = (SelectedSearchResult) this.h.a();
        if (selectedSearchResult != null) {
            bundle.putParcelable("selected", selectedSearchResult);
        }
        bundle.putParcelableArrayList("zero_state_search_filters", new ArrayList<>(this.s));
        bundle.putParcelable("base_filter", this.g);
        bundle.putBoolean("performed_search_with_free_text", this.t);
    }

    @Override // defpackage.dacu
    public final void s(SearchFilterDataItem searchFilterDataItem) {
        this.g = searchFilterDataItem;
        w(2);
    }

    @Override // defpackage.dacu
    public final void t(String str) {
        ecem.c();
        boolean z = this.t;
        this.t = false;
        int iD = D();
        if (TextUtils.isEmpty(str)) {
            if (iD != -1) {
                ((eksl) a.o().h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "setQueryText", 561, "ZeroStateSearchPresenterImpl.java")).q("Free text search filter removed");
                j((SearchFilterDataItem) this.s.get(iD));
                return;
            }
            return;
        }
        FreeTextFilterDataItem freeTextFilterDataItemE = this.c.e(new SearchQuery.FreeTextSearchFilter(str));
        if (iD == -1) {
            ((eksl) a.o().h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "setQueryText", 557, "ZeroStateSearchPresenterImpl.java")).t("Free text search filter %s added", str);
            this.s.add(freeTextFilterDataItemE);
            return;
        }
        ArrayList arrayList = this.s;
        if (str.equals(((FreeTextFilterDataItem) arrayList.get(iD)).a().a)) {
            this.t = z;
        } else {
            ((eksl) a.o().h("com/google/android/apps/messaging/ui/search/presenter/ZeroStateSearchPresenterImpl", "setQueryText", 553, "ZeroStateSearchPresenterImpl.java")).t("Free text search filter %s replaced", str);
            arrayList.set(iD, freeTextFilterDataItemE);
        }
    }

    @Override // defpackage.dacu
    public final void u(SelectedSearchResult selectedSearchResult) {
        this.h.m(selectedSearchResult);
    }

    @Override // defpackage.dacu
    public final boolean v() {
        if (m() == null) {
            return false;
        }
        List list = (List) this.u.a();
        list.getClass();
        return list.isEmpty();
    }

    @Override // defpackage.dacu
    public final void w(int i) {
        ecem.c();
        this.t = true;
        H(i);
    }

    public final FreeTextFilterDataItem x() {
        int iD = D();
        if (iD < 0) {
            return null;
        }
        return (FreeTextFilterDataItem) this.s.get(iD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List y(bxwt bxwtVar) {
        if (bxwtVar.e().isEmpty()) {
            return ekoe.a;
        }
        ekfw ekfwVar = new ekfw();
        ekgb ekgbVarE = bxwtVar.e();
        int size = ekgbVarE.size();
        for (int i = 0; i < size; i++) {
            UrlSearchResult urlSearchResult = (UrlSearchResult) ekgbVarE.get(i);
            daca dacaVar = this.y;
            cogw cogwVar = (cogw) dacaVar.a.b();
            cogwVar.getClass();
            bbgw bbgwVar = (bbgw) dacaVar.b.b();
            bbgwVar.getClass();
            eosc eoscVar = (eosc) dacaVar.c.b();
            eoscVar.getClass();
            bxxd bxxdVar = (bxxd) dacaVar.d.b();
            bxxdVar.getClass();
            daig daigVar = (daig) dacaVar.e.b();
            daigVar.getClass();
            crqx crqxVar = (crqx) dacaVar.f.b();
            crqxVar.getClass();
            afhk afhkVar = (afhk) dacaVar.g.b();
            afhkVar.getClass();
            urlSearchResult.getClass();
            ekfwVar.h(new dabz(cogwVar, bbgwVar, eoscVar, bxxdVar, daigVar, crqxVar, afhkVar, urlSearchResult));
        }
        return ekfwVar.g();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List z(bxwt bxwtVar) {
        if (bxwtVar.f().isEmpty()) {
            return ekoe.a;
        }
        ekfw ekfwVar = new ekfw();
        ekgb ekgbVarF = bxwtVar.f();
        int size = ekgbVarF.size();
        for (int i = 0; i < size; i++) {
            bxuy bxuyVar = (bxuy) ekgbVarF.get(i);
            dace daceVar = this.x;
            Context context = (Context) daceVar.a.b();
            context.getClass();
            ((crql) daceVar.b.b()).getClass();
            eosc eoscVar = (eosc) daceVar.c.b();
            eoscVar.getClass();
            ((eosc) daceVar.d.b()).getClass();
            daig daigVar = (daig) daceVar.e.b();
            daigVar.getClass();
            ((bbgw) daceVar.f.b()).getClass();
            crqx crqxVar = (crqx) daceVar.g.b();
            crqxVar.getClass();
            cogw cogwVar = (cogw) daceVar.h.b();
            cogwVar.getClass();
            ((crqd) daceVar.i.b()).getClass();
            ajsn ajsnVar = (ajsn) daceVar.j.b();
            ajsnVar.getClass();
            bxuyVar.getClass();
            ekfwVar.h(new dacd(context, eoscVar, daigVar, crqxVar, cogwVar, ajsnVar, bxuyVar));
        }
        return ekfwVar.g();
    }
}
