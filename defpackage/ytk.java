package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ytk implements ajmq {
    final /* synthetic */ ytm a;
    private final /* synthetic */ ajmq b;

    public ytk(ajlt ajltVar, ytm ytmVar) {
        this.a = ytmVar;
        ajmc ajmcVarD = ajltVar.d();
        ajmcVarD.getClass();
        this.b = (ajmq) ajmcVarD;
    }

    @Override // defpackage.ajmr
    public final ajlq a() {
        Object obj;
        List list = this.a.a;
        ArrayList arrayList = new ArrayList(fcva.p(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ajmc ajmcVarD = ((ajlt) it.next()).d();
            ajmcVarD.getClass();
            arrayList.add(((ajmq) ajmcVarD).a());
        }
        List listG = fcva.g(ajlq.SENT, ajlq.DELIVERED, ajlq.SEEN);
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            if (it2.hasNext()) {
                int iIndexOf = listG.indexOf((ajlq) next);
                while (true) {
                    Object next2 = it2.next();
                    int iIndexOf2 = listG.indexOf((ajlq) next2);
                    int i = iIndexOf > iIndexOf2 ? iIndexOf2 : iIndexOf;
                    if (iIndexOf > iIndexOf2) {
                        next = next2;
                    }
                    if (!it2.hasNext()) {
                        break;
                    }
                    iIndexOf = i;
                }
            }
            obj = next;
        } else {
            obj = null;
        }
        return (ajlq) obj;
    }

    @Override // defpackage.ajmr
    public final ajmw b() {
        return this.b.b();
    }

    @Override // defpackage.ajmq
    public final aoer c() {
        return this.b.c();
    }

    @Override // defpackage.ajmc
    public final /* synthetic */ int d() {
        return 2;
    }
}
