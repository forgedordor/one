package defpackage;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvbp implements dvbf {
    private final afp a;

    public dvbp(afp afpVar) {
        this.a = afpVar;
    }

    @Override // defpackage.dvbf
    public final ListenableFuture a(agh aghVar) {
        aghVar.getClass();
        return this.a.c(aghVar);
    }

    @Override // defpackage.dvbf
    public final ListenableFuture b(agj agjVar) {
        agjVar.getClass();
        return this.a.d(agjVar);
    }

    @Override // defpackage.dvbf
    public final ListenableFuture c(dvbn dvbnVar) {
        agw agwVarA = dvbnVar.a;
        Set setF = agwVarA.f();
        setF.getClass();
        if (!setF.isEmpty()) {
            Iterator it = setF.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (fdbq.f(((afo) it.next()).a, "G3AttributionInfo")) {
                    agv agvVar = new agv(agwVarA);
                    agvVar.b();
                    agvVar.a.clear();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : setF) {
                        if (!fdbq.f(((afo) obj).a, "G3AttributionInfo")) {
                            arrayList.add(obj);
                        }
                    }
                    agvVar.c(arrayList);
                    agvVar.f(G3AttributionInfo.c);
                    agwVarA = agvVar.a();
                }
            }
        }
        return this.a.e(agwVarA);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.dvbf
    public final ListenableFuture d(agu aguVar) {
        return this.a.g(aguVar);
    }
}
