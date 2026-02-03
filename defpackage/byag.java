package defpackage;

import com.google.android.gms.appdatasearch.QuerySpecification;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class byag extends byaj {
    final /* synthetic */ ArrayList a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byag(byak byakVar, List list, QuerySpecification querySpecification, Executor executor, kog kogVar, eigp eigpVar, ArrayList arrayList) {
        super(byakVar, list, querySpecification, executor, kogVar, eigpVar, null);
        this.a = arrayList;
    }

    @Override // defpackage.byaj
    public final void b(dbje dbjeVar) {
        eieu eieuVarK = eiiy.k("fetaQueryPair> rechParticipantSearchResults.SearchQuery#processResult");
        try {
            Map mapD = byak.d(dbjeVar);
            bxtz bxtzVar = null;
            if (mapD.containsKey("participant_id") && mapD.containsKey("lookup_key") && mapD.containsKey("name")) {
                String strC = byak.c(mapD, "participant_id");
                bxtzVar = new bxtz(Long.parseLong(strC), byak.c(mapD, "name"));
            }
            if (bxtzVar != null) {
                this.a.add(bxtzVar);
            }
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

    @Override // defpackage.byaj
    public final void c(String str, kog kogVar) {
        kogVar.c(new bxzy(str, this.a));
    }

    @Override // defpackage.byaj
    public final void d(kog kogVar) {
        kogVar.b(this.a);
    }
}
