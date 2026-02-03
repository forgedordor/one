package defpackage;

import com.google.android.apps.messaging.wearable.WearableBindService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dapb extends deph implements eyhy {
    private volatile eyho a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.eyhy
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final eyho ba() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new eyho(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.eyhx
    public final Object bb() {
        return ba().bb();
    }

    @Override // defpackage.deph, android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            WearableBindService wearableBindService = (WearableBindService) this;
            ahij ahijVar = (ahij) bb();
            ahkn ahknVar = ahijVar.b;
            wearableBindService.c = ahknVar.t;
            ahng ahngVar = ahknVar.b;
            wearableBindService.d = ahngVar.pG;
            wearableBindService.e = ahknVar.pG;
            ahnh ahnhVar = ahknVar.a;
            wearableBindService.f = ahnhVar.Qt;
            wearableBindService.g = ahnhVar.Qq;
            wearableBindService.h = ahnhVar.HR;
            wearableBindService.i = ahnhVar.AS;
            wearableBindService.j = ahknVar.da;
            wearableBindService.k = ahnhVar.Jm;
            wearableBindService.l = ahknVar.ib;
            wearableBindService.m = ahngVar.pH;
            wearableBindService.n = ahnhVar.Cg;
            wearableBindService.o = ahnhVar.aeH;
            wearableBindService.p = ahknVar.cD;
            wearableBindService.q = ahknVar.aI;
            wearableBindService.r = ahngVar.fh;
            wearableBindService.s = ahngVar.fi;
            wearableBindService.t = ahnhVar.c;
            wearableBindService.u = ahknVar.p;
            wearableBindService.v = ahknVar.y;
            wearableBindService.w = ahknVar.aJ;
            wearableBindService.x = ahnhVar.qi;
            wearableBindService.y = ahnhVar.zO;
            wearableBindService.z = ahnhVar.alv;
            wearableBindService.A = ahijVar.v;
            eyik eyikVar = ahijVar.w;
            wearableBindService.B = ahnhVar.HQ;
            wearableBindService.C = ahnhVar.aeK;
            wearableBindService.D = ahngVar.pI;
        }
        super.onCreate();
    }
}
