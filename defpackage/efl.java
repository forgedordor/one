package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class efl extends efo {
    public boolean a = true;
    public int b;

    public efl(int i) {
        this.b = i;
    }

    @Override // defpackage.efo
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.efo, defpackage.jcd
    public final int e(ivu ivuVar, ivt ivtVar, int i) {
        return this.b == 1 ? ivtVar.c(i) : ivtVar.a(i);
    }

    @Override // defpackage.efo, defpackage.jcd
    public final int g(ivu ivuVar, ivt ivtVar, int i) {
        return this.b == 1 ? ivtVar.c(i) : ivtVar.a(i);
    }

    @Override // defpackage.efo
    public final long i(ixk ixkVar, long j) {
        int iC = this.b == 1 ? ixkVar.c(kil.b(j)) : ixkVar.a(kil.b(j));
        if (iC < 0) {
            iC = 0;
        }
        return kim.g(0, Alert.DURATION_SHOW_INDEFINITELY, iC, iC);
    }
}
