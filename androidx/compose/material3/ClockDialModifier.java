package androidx.compose.material3;

import defpackage.ddz;
import defpackage.fdbq;
import defpackage.fdil;
import defpackage.fyf;
import defpackage.gcv;
import defpackage.gcw;
import defpackage.hbk;
import defpackage.icr;
import defpackage.jdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ClockDialModifier extends jdy<gcw> {
    private final fyf a;
    private final boolean b;
    private final int c;
    private final ddz d;

    public ClockDialModifier(fyf fyfVar, boolean z, int i, ddz ddzVar) {
        this.a = fyfVar;
        this.b = z;
        this.c = i;
        this.d = ddzVar;
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ icr d() {
        return new gcw(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.jdy
    public final /* bridge */ /* synthetic */ void e(icr icrVar) {
        gcw gcwVar = (gcw) icrVar;
        fyf fyfVar = this.a;
        gcwVar.a = fyfVar;
        gcwVar.b = this.b;
        ddz ddzVar = this.d;
        gcwVar.d = ddzVar;
        int i = gcwVar.c;
        int i2 = this.c;
        if (hbk.b(i, i2)) {
            return;
        }
        gcwVar.c = i2;
        fdil.d(gcwVar.E(), null, null, new gcv(fyfVar, ddzVar, null), 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClockDialModifier)) {
            return false;
        }
        ClockDialModifier clockDialModifier = (ClockDialModifier) obj;
        return fdbq.f(this.a, clockDialModifier.a) && this.b == clockDialModifier.b && hbk.b(this.c, clockDialModifier.c) && fdbq.f(this.d, clockDialModifier.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231)) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ClockDialModifier(state=" + this.a + ", autoSwitchToMinute=" + this.b + ", selection=" + ((Object) hbk.a(this.c)) + ", animationSpec=" + this.d + ')';
    }
}
