package defpackage;

import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbfv {
    public final fdjx a;
    public final ConcurrentHashMap b;
    public final fduj c;
    private final fdue d;

    public cbfv(fdjx fdjxVar) {
        fdjxVar.getClass();
        this.a = fdjxVar;
        this.b = new ConcurrentHashMap();
        fdue fdueVarD = fdun.d(0, Alert.DURATION_SHOW_INDEFINITELY, 2);
        this.d = fdueVarD;
        this.c = new fdug(fdueVarD);
    }

    public final void a(long j) {
        kog kogVarC;
        fdue fdueVar = this.d;
        Long lValueOf = Long.valueOf(j);
        fdueVar.h(lValueOf);
        cbfu cbfuVar = (cbfu) this.b.remove(lValueOf);
        if (cbfuVar == null || (kogVarC = cbfuVar.c()) == null) {
            return;
        }
        kogVarC.d();
    }

    public final void b(long j, cbcw cbcwVar) {
        kog kogVarC;
        cbcwVar.getClass();
        cbfu cbfuVar = (cbfu) this.b.remove(Long.valueOf(j));
        if (cbfuVar == null || (kogVarC = cbfuVar.c()) == null) {
            return;
        }
        kogVarC.b(cbcwVar);
    }
}
