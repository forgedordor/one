package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbnn implements cayy {
    final /* synthetic */ cbno a;

    public cbnn(cbno cbnoVar) {
        this.a = cbnoVar;
    }

    @Override // defpackage.cayy
    public final cazc a() {
        return cazc.j("WorkQueueTikTokWorker", ekfv.a(this.a.c));
    }

    @Override // defpackage.cayy
    public final /* synthetic */ boolean b() {
        return false;
    }

    @Override // defpackage.cayy
    public final boolean c() {
        fddq fddqVar = new fddq(0, this.a.c.size());
        ArrayList arrayList = new ArrayList(fcva.p(fddqVar, 10));
        fcvy it = fddqVar.iterator();
        while (((fddp) it).a) {
            arrayList.add(Boolean.valueOf(d(it.a())));
        }
        return fcva.ay(arrayList);
    }

    @Override // defpackage.cayy
    public final boolean d(int i) {
        cbno cbnoVar = this.a;
        cbdg cbdgVar = (cbdg) fcva.Q(cbnoVar.c, i);
        if (cbdgVar != null) {
            if (cbdgVar.k() <= ((caxl) cbnoVar.a.a()).d) {
                return true;
            }
        }
        return false;
    }
}
