package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsxm extends dsvh {
    public final dstz a;
    private final dsuh b;

    public dsxm(dsuh dsuhVar, dstz dstzVar) {
        this.b = dsuhVar;
        this.a = dstzVar;
    }

    @Override // defpackage.dsvh
    public final void b(final dsvg dsvgVar, final dsvd dsvdVar) {
        this.b.c(new dsug() { // from class: dsxl
            @Override // defpackage.dsug
            public final List a() {
                dsvd dsvdVar2 = dsvdVar;
                eohz eohzVarA = dstw.a();
                ejwl.m(dsvdVar2 != null, "View is not instrumented.");
                Set set = dsvdVar2.e.a;
                if (!set.isEmpty()) {
                    if (Log.isLoggable("GIL", 2)) {
                        Log.v("GIL", "Interaction: ".concat(String.valueOf(String.valueOf(dsvdVar2))));
                    }
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((dswy) it.next()).f();
                    }
                }
                ejwl.r(dsvdVar2.f(), "VE is not impressed: %s {attached=%s}", dsvdVar2, Boolean.valueOf(dsvdVar2.f.o()));
                ejwl.p(dsvdVar2.h() == 1, "VE is not visible: %s", dsvdVar2);
                dsvg dsvgVar2 = dsvgVar;
                dsxm dsxmVar = this.a;
                ArrayList arrayList = new ArrayList();
                dsxc.a(dsvdVar2, arrayList);
                return ekgb.r(new dsxz(eohzVarA, arrayList, dsvgVar2, dsxmVar.a.a(), false));
            }
        });
    }
}
