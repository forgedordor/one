package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehjj implements ehgf {
    private volatile ehhr a;
    private ekgp b;
    private boolean c;
    private ehji d;

    public ehjj(Map map, ehhr ehhrVar) {
        this.a = ehhrVar;
        this.b = ekfv.e(map);
    }

    @Override // defpackage.ehgf
    public final ehds a(String str, fdap fdapVar) {
        ecem.c();
        Object objE = fcwa.e(this.b, str);
        objE.getClass();
        ehds ehdsVar = (ehds) objE;
        if (!this.c) {
            fdapVar.invoke(this.a);
        }
        this.c = true;
        return ehdsVar;
    }

    @Override // defpackage.ehgf
    public final ehhr b() {
        return this.a;
    }

    @Override // defpackage.ehgf
    public final void c() {
        ecem.c();
        ehji ehjiVar = this.d;
        ehjiVar.getClass();
        this.b = ehjiVar.a;
        ehjiVar.getClass();
        this.a = ehjiVar.b;
        this.c = false;
        this.d = null;
    }

    @Override // defpackage.ehgf
    public final boolean d() {
        ecem.c();
        return this.d != null;
    }

    @Override // defpackage.ehgf
    public final boolean e(Map map, ehhr ehhrVar) {
        ecem.c();
        ekgp ekgpVarE = ekfv.e(map);
        if (this.c) {
            this.d = new ehji(ekgpVarE, ehhrVar);
            return false;
        }
        this.b = ekgpVarE;
        this.a = ehhrVar;
        return true;
    }
}
