package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoh {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final eoi eoiVar, final Object obj, final int i, final Object obj2, hml hmlVar, final int i2) {
        int i3;
        int i4 = i2 & 6;
        hml hmlVarC = hmlVar.c(1439843069);
        if (i4 == 0) {
            i3 = (true != hmlVarC.D(eoiVar) ? 2 : 4) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= true != hmlVarC.D(obj) ? 16 : 32;
        }
        if ((i2 & 384) == 0) {
            i3 |= true != hmlVarC.B(i) ? 128 : 256;
        }
        if ((i2 & 3072) == 0) {
            i3 |= true != hmlVarC.D(obj2) ? 1024 : 2048;
        }
        if (hmlVarC.J((i3 & 1171) != 1170, i3 & 1)) {
            obj.c(obj2, hxe.d(980966366, new eog(eoiVar, i, obj2), hmlVarC), hmlVarC, 48);
        } else {
            hmlVarC.s();
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: eof
                @Override // defpackage.fdat
                public final Object a(Object obj3, Object obj4) {
                    ((Integer) obj4).intValue();
                    eoi eoiVar2 = eoiVar;
                    Object obj5 = obj;
                    int i5 = i;
                    eoh.a(eoiVar2, obj5, i5, obj2, (hml) obj3, hpy.a(i2 | 1));
                    return fctx.a;
                }
            };
        }
    }
}
