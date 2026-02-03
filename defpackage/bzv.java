package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bzv implements bll {
    final /* synthetic */ cad a;

    public bzv(cad cadVar) {
        this.a = cadVar;
    }

    @Override // defpackage.bll
    public final void a(Throwable th) {
        bbs.g("VideoCapture", "Receive onError from StreamState observer", th);
    }

    @Override // defpackage.bll
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        bzj bzjVar = (bzj) obj;
        if (bzjVar == null) {
            throw new IllegalArgumentException("StreamInfo can't be null");
        }
        cad cadVar = this.a;
        if (cadVar.g == 3) {
            return;
        }
        bbs.a("VideoCapture", "Stream info update: old: " + cadVar.b + " new: " + bzjVar);
        bzj bzjVar2 = cadVar.b;
        cadVar.b = bzjVar;
        bms bmsVar = cadVar.m;
        lcg.i(bmsVar);
        int iA = bzjVar2.a();
        int iA2 = bzjVar.a();
        Set set = bzj.b;
        if ((!set.contains(Integer.valueOf(iA)) && !set.contains(Integer.valueOf(iA2)) && iA != iA2) || (cadVar.f && bzjVar2.b() != null && bzjVar.b() == null)) {
            cadVar.h();
            return;
        }
        if ((bzjVar2.a() != -1 && bzjVar.a() == -1) || (bzjVar2.a() == -1 && bzjVar.a() != -1)) {
            cadVar.b(cadVar.c, bzjVar, bmsVar);
            cadVar.R(bzu.a(cadVar.c.b()));
            cadVar.L();
        } else if (bzjVar2.c() != bzjVar.c()) {
            cadVar.b(cadVar.c, bzjVar, bmsVar);
            cadVar.R(bzu.a(cadVar.c.b()));
            Iterator it = cadVar.j.iterator();
            while (it.hasNext()) {
                ((bdq) it.next()).x(cadVar);
            }
        }
    }
}
