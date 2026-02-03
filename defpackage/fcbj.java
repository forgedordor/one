package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcbj extends fcbf {
    final /* synthetic */ fcbv a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fcbj(fcbw fcbwVar, fcbv fcbvVar) {
        super(fcbwVar.a);
        this.a = fcbvVar;
    }

    @Override // defpackage.fcbf
    public final void a() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            fcbv fcbvVar = this.a;
            synchronized (fcbvVar) {
                if (fcbvVar.c.isEmpty()) {
                    fcbvVar.c = null;
                    fcbvVar.b = true;
                    return;
                } else {
                    list = fcbvVar.c;
                    fcbvVar.c = arrayList;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            list.clear();
            arrayList = list;
        }
    }
}
