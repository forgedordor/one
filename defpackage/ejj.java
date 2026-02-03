package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class ejj implements eox {
    private final eos a;
    public final long l;
    public final eir m;

    public ejj(long j, boolean z, eir eirVar, eos eosVar) {
        this.m = eirVar;
        this.a = eosVar;
        this.l = kim.k(0, z ? kil.b(j) : Integer.MAX_VALUE, z ? Alert.DURATION_SHOW_INDEFINITELY : kil.a(j), 5);
    }

    public abstract eji a(int i, Object obj, Object obj2, List list, long j);

    public final eji b(int i, long j) {
        eos eosVar = this.a;
        eir eirVar = this.m;
        return a(i, eirVar.d(i), eirVar.c(i), eosVar.a(i, j), j);
    }

    @Override // defpackage.eox
    public final /* synthetic */ eou c(int i, int i2, int i3, long j) {
        return b(i, j);
    }

    public final eqr e() {
        return this.m.c;
    }
}
