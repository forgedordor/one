package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.ui.search.presenter.FreeTextFilterDataItem;
import com.google.android.apps.messaging.ui.search.resultsview.conversation.SearchConversationResultItemView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dagd extends vo {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/search/resultsview/SearchConversationListAdapter");
    public final Context d;
    public final Activity e;
    public final fcsu f;
    public final fcsu g;
    public final fcsu h;
    public final List i = new ArrayList();
    public final Set j = new HashSet();
    public dacu k;
    private final eidm l;
    private final fcsu m;

    public dagd(eidm eidmVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, Activity activity, Context context) {
        this.d = context;
        this.e = activity;
        this.m = fcsuVar;
        this.f = fcsuVar2;
        this.g = fcsuVar3;
        this.h = fcsuVar4;
        this.l = eidmVar;
        B(true);
    }

    public final void F(dabv dabvVar) {
        eieu eieuVarK = eiiy.k("SearchConversationListAdapter#updateResults");
        try {
            List list = this.i;
            list.clear();
            Set set = this.j;
            set.clear();
            list.addAll(((dabo) dabvVar).b);
            set.addAll(((dabo) dabvVar).c);
            p();
            eieuVarK.close();
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vo
    public final int a() {
        return this.i.size();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        SearchConversationResultItemView searchConversationResultItemView = (SearchConversationResultItemView) LayoutInflater.from(this.d).inflate(R.layout.zero_state_search_conversation_result_item_view_v2, viewGroup, false);
        final dagc dagcVar = new dagc(searchConversationResultItemView);
        searchConversationResultItemView.setOnClickListener(new eifs((eigp) this.m.b(), "com/google/android/apps/messaging/ui/search/resultsview/SearchConversationListAdapter", "onCreateViewHolder", 99, "Search conversation result clicked", new View.OnClickListener() { // from class: dagb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dacu dacuVar;
                FreeTextFilterDataItem freeTextFilterDataItemN;
                String str;
                int iFt = dagcVar.ft();
                if (iFt == -1) {
                    ekrw ekrwVarH = dagd.a.h();
                    ekrwVarH.X(eksq.a, "BugleSearch");
                    ((ekrd) ((ekrd) ekrwVarH).h("com/google/android/apps/messaging/ui/search/resultsview/SearchConversationListAdapter", "onClick", 147, "SearchConversationListAdapter.java")).q("binding adapter position is invalid while clicking on search conversation results.");
                    return;
                }
                dagd dagdVar = this.a;
                adao adaoVar = (adao) dagdVar.i.get(iFt);
                fcsu fcsuVar = dagdVar.f;
                ((dabl) fcsuVar.b()).a();
                ((dabl) fcsuVar.b()).f(6, 2);
                fcsu fcsuVar2 = dagdVar.g;
                ((dabm) fcsuVar2.b()).e(1);
                ((dabm) fcsuVar2.b()).h(1);
                if (dagdVar.j.contains(adaoVar.k().w()) || (dacuVar = dagdVar.k) == null || (freeTextFilterDataItemN = dacuVar.n()) == null) {
                    str = null;
                } else {
                    String lowerCase = freeTextFilterDataItemN.a().a;
                    if (lowerCase != null) {
                        lowerCase = lowerCase.toLowerCase(craf.c(dagdVar.d));
                    }
                    str = lowerCase;
                }
                ((avmp) dagdVar.h.b()).z(dagdVar.e, (ConversationId) adaoVar.k().B().get(), adaoVar.k().x(), new bajg(null, adaoVar.k().K(), null), str);
            }
        }));
        return dagcVar;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void i(wv wvVar) {
        dagc dagcVar = (dagc) wvVar;
        g(dagcVar, dagcVar.ft());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void g(dagc dagcVar, int i) {
        eifp eifpVarA = this.l.a("SearchConversationListAdapter onBindViewHolder");
        try {
            adao adaoVar = (adao) this.i.get(i);
            dahr dahrVarH = dagcVar.t.H();
            ekgb ekgbVar = dagc.s;
            if (ekgbVar.isEmpty()) {
                dahrVarH.a(adaoVar);
            } else {
                ekqh it = ekgbVar.iterator();
                while (it.hasNext()) {
                    E next = it.next();
                    if (next instanceof adam) {
                        adam adamVar = (adam) next;
                        ekqg ekqgVarListIterator = adamVar.a().listIterator();
                        while (ekqgVarListIterator.hasNext()) {
                            adar adarVar = (adar) ekqgVarListIterator.next();
                            adaq adaqVar = (adaq) dahrVarH.b.get(adarVar);
                            if (adaqVar == null) {
                                dahr.a.r(String.format("Received a change payload for a nonexistent view part: %s", adarVar));
                            } else if (adamVar.b()) {
                                adaqVar.b(adaqVar.a(adaoVar), false);
                            } else {
                                adaqVar.b(adaoVar, false);
                            }
                        }
                    } else if ((next instanceof String) && "Selection-Changed".equals(next)) {
                        dahrVarH.a(adaoVar);
                    }
                }
            }
            eifpVarA.close();
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
