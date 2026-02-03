package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.ui.search.resultsview.StarredMessagesResultItemView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dagi extends vo {
    public final Context a;
    public final fcsu d;
    public final List e = new ArrayList();
    public final fcsu f;
    public final fcsu g;
    private final eidm h;
    private final fcsu i;

    public dagi(eidm eidmVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, Context context) {
        this.a = context;
        this.i = fcsuVar;
        this.d = fcsuVar2;
        this.h = eidmVar;
        this.f = fcsuVar3;
        this.g = fcsuVar4;
        B(true);
    }

    public final void F(dabv dabvVar) {
        eieu eieuVarK = eiiy.k("StarredMessagesAdapter#updateResults");
        try {
            List list = this.e;
            list.clear();
            list.addAll(((dabo) dabvVar).a);
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
        return this.e.size();
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ wv e(ViewGroup viewGroup, int i) {
        StarredMessagesResultItemView starredMessagesResultItemView = (StarredMessagesResultItemView) LayoutInflater.from(this.a).inflate(R.layout.starred_messages_result_item_view_v3, viewGroup, false);
        final dagh daghVar = new dagh(starredMessagesResultItemView);
        starredMessagesResultItemView.setOnClickListener(new eifs((eigp) this.i.b(), "com/google/android/apps/messaging/ui/search/resultsview/StarredMessagesAdapter", "onCreateViewHolder", 74, "Search starred message result clicked", new View.OnClickListener() { // from class: dagg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dagh daghVar2 = daghVar;
                dagi dagiVar = this.a;
                adao adaoVar = (adao) dagiVar.e.get(daghVar2.ft());
                ((dabm) dagiVar.f.b()).e(7);
                fcsu fcsuVar = dagiVar.g;
                ((dabl) fcsuVar.b()).f(6, 10);
                ((dabl) fcsuVar.b()).a();
                ((avmp) dagiVar.d.b()).w(dagiVar.a, (ConversationId) adaoVar.k().B().get(), adaoVar.k().x(), null, new batr(null), new bajg(null, adaoVar.k().K(), null), null, "");
            }
        }));
        return daghVar;
    }

    @Override // defpackage.vo
    public final /* bridge */ /* synthetic */ void i(wv wvVar) {
        dagh daghVar = (dagh) wvVar;
        g(daghVar, daghVar.ft());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vo
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final void g(dagh daghVar, int i) {
        eifp eifpVarA = this.h.a("StarredMessagesAdapter onBindViewHolder");
        try {
            adao adaoVar = (adao) this.e.get(i);
            dagk dagkVarH = daghVar.t.H();
            ekgb ekgbVar = dagh.s;
            if (ekgbVar.isEmpty()) {
                dagkVarH.a(adaoVar);
            } else {
                ekqh it = ekgbVar.iterator();
                while (it.hasNext()) {
                    E next = it.next();
                    if (next instanceof adam) {
                        adam adamVar = (adam) next;
                        ekqg ekqgVarListIterator = adamVar.a().listIterator();
                        while (ekqgVarListIterator.hasNext()) {
                            adar adarVar = (adar) ekqgVarListIterator.next();
                            adaq adaqVar = (adaq) dagkVarH.b.get(adarVar);
                            if (adaqVar == null) {
                                dagk.a.r(String.format("Received a change payload for a nonexistent view part: %s", adarVar));
                            } else if (adamVar.b()) {
                                adaqVar.b(adaqVar.a(adaoVar), false);
                            } else {
                                adaqVar.b(adaoVar, false);
                            }
                        }
                    } else if ((next instanceof String) && "Selection-Changed".equals(next)) {
                        dagkVarH.a(adaoVar);
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
