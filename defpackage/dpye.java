package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpye implements mw {
    final /* synthetic */ List a;
    final /* synthetic */ dpyi b;
    final /* synthetic */ RecyclerView c;
    final /* synthetic */ fdae d;
    final /* synthetic */ vo e;

    public dpye(List list, dpyi dpyiVar, RecyclerView recyclerView, fdae fdaeVar, vo voVar) {
        this.a = list;
        this.b = dpyiVar;
        this.c = recyclerView;
        this.d = fdaeVar;
        this.e = voVar;
    }

    private final void e(List list) {
        Object next;
        if (this.b.b && this.c.aE()) {
            return;
        }
        fdae fdaeVar = this.d;
        vo voVar = this.e;
        fcue fcueVar = new fcue((fcuh) fdaeVar.invoke());
        int i = 0;
        while (fcueVar.hasNext()) {
            Object next2 = fcueVar.next();
            int i2 = i + 1;
            if (i < 0) {
                fcva.m();
            }
            dlti dltiVar = (dlti) next2;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (dlth.a((dlti) next, dltiVar)) {
                        break;
                    }
                }
            }
            if (next != null) {
                voVar.q(i);
            }
            i = i2;
        }
    }

    @Override // defpackage.mw
    public final void a(int i, int i2, Object obj) {
        List list = this.a;
        e(list.subList(i, list.size()));
    }

    @Override // defpackage.mw
    public final void b(int i, int i2) {
        List list = this.a;
        e(list.subList(i, list.size()));
    }

    @Override // defpackage.mw
    public final void c(int i, int i2) {
        e(this.a.subList(i, i2));
    }

    @Override // defpackage.mw
    public final void d(int i, int i2) {
        List list = this.b.d;
        e(list.subList(i, list.size()));
    }
}
