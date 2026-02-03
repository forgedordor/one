package defpackage;

import android.os.CancellationSignal;
import com.google.android.gms.appdatasearch.QuerySpecification;
import com.google.android.gms.appdatasearch.SearchResults;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
abstract class byaj implements defb {
    private final List a;
    private final QuerySpecification b;
    private final Executor c;
    private final eigp d;
    public final kog g;
    public final CancellationSignal i;
    final /* synthetic */ byak m;
    public final Object h = new Object();
    public int j = 0;
    public boolean k = false;
    public boolean l = false;

    public byaj(byak byakVar, List list, QuerySpecification querySpecification, Executor executor, kog kogVar, eigp eigpVar, CancellationSignal cancellationSignal) {
        this.m = byakVar;
        this.a = list;
        this.b = querySpecification;
        this.c = executor;
        this.g = kogVar;
        this.d = eigpVar;
        this.i = cancellationSignal;
    }

    @Override // defpackage.defb
    public final void a(final defn defnVar) {
        eieh eiehVarC = this.d.c("SearchQuery.OnCompleteListener#onComplete", "com/google/android/apps/messaging/shared/datamodel/search/icing/IcingSearchApiImpl$SearchQuery", "onComplete", 490);
        try {
            auvh.h(eijx.f(new Runnable() { // from class: byai
                @Override // java.lang.Runnable
                public final void run() {
                    defn defnVar2 = defnVar;
                    byaj byajVar = this.a;
                    synchronized (byajVar.h) {
                        CancellationSignal cancellationSignal = byajVar.i;
                        if (cancellationSignal != null && cancellationSignal.isCanceled()) {
                            byajVar.c("Search query was canceled.", byajVar.g);
                            return;
                        }
                        boolean z = true;
                        if (!defnVar2.m() || defnVar2.i() == null) {
                            ((eksl) ((eksl) ((eksl) byak.a.j()).g(defnVar2.h())).h("com/google/android/apps/messaging/shared/datamodel/search/icing/IcingSearchApiImpl$SearchQuery", "onCompleteOnBackgroundExecutor", 504, "IcingSearchApiImpl.java")).q("Cannot get search results from icing.");
                            byajVar.l = true;
                            byajVar.k = true;
                            ((byap) byajVar.m.h.b()).e(defnVar2.h());
                        } else {
                            byajVar.j += 1000;
                            SearchResults searchResults = (SearchResults) defnVar2.i();
                            if (searchResults.g >= 1000) {
                                z = false;
                            }
                            byajVar.k = z;
                            dbjf dbjfVar = new dbjf(searchResults);
                            while (dbjfVar.hasNext()) {
                                byajVar.b(dbjfVar.next());
                            }
                            ((byap) byajVar.m.h.b()).f();
                        }
                        byajVar.e();
                    }
                }
            }, this.c));
            eiehVarC.close();
        } catch (Throwable th) {
            try {
                eiehVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public abstract void b(dbje dbjeVar);

    public abstract void c(String str, kog kogVar);

    public abstract void d(kog kogVar);

    final void e() {
        if (this.k && Math.max(0, this.a.size() - 1) == 0) {
            if (this.l) {
                c("Could not fetch data from icing.", this.g);
                return;
            } else {
                d(this.g);
                return;
            }
        }
        if (this.k) {
            this.a.remove(0);
            this.k = false;
            this.j = 0;
        }
        List list = this.a;
        ejwl.m(!list.isEmpty(), "expecting request queue to be non-empty");
        byak byakVar = this.m;
        byakVar.i.a(((byah) list.get(0)).b, byakVar.e, (String[]) ((byah) list.get(0)).a.toArray(new String[0]), this.j, 1000, this.b).s(this);
    }
}
