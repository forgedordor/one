package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zjy {
    public static final dkkh a(ymx ymxVar, int i, int i2) {
        dkkh dkkhVarB = ymxVar.b();
        if (i2 == 1) {
            return dkkhVarB;
        }
        if (i == 0) {
            dkkh dkkhVar = dkkh.c;
            return (dkkhVarB == dkkhVar || dkkhVarB == dkkh.d) ? dkkhVar : dkkh.b;
        }
        if (i < i2 - 1) {
            return dkkh.c;
        }
        dkkh dkkhVar2 = dkkh.c;
        return (dkkhVarB == dkkhVar2 || dkkhVarB == dkkh.b) ? dkkhVar2 : dkkh.d;
    }
}
