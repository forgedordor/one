package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dkjn implements fdau {
    final /* synthetic */ dkkr a;
    final /* synthetic */ iqa b;
    final /* synthetic */ fdae c;

    public dkjn(dkkr dkkrVar, iqa iqaVar, fdae fdaeVar) {
        this.a = dkkrVar;
        this.b = iqaVar;
        this.c = fdaeVar;
    }

    public static final dkkr b(hsf hsfVar) {
        return (dkkr) hsfVar.a();
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ics icsVar = (ics) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        icsVar.getClass();
        hmlVar.v(1811941631);
        dkkr dkkrVar = this.a;
        hsf hsfVarA = hsc.a(dkkrVar, hmlVar);
        hmlVar.v(-1746271574);
        boolean zD = hmlVar.D(hsfVarA);
        iqa iqaVar = this.b;
        boolean zF = zD | hmlVar.F(iqaVar);
        fdae fdaeVar = this.c;
        boolean zD2 = zF | hmlVar.D(fdaeVar);
        Object objF = hmlVar.f();
        if (zD2 || objF == hmk.a) {
            objF = new dkjm(hsfVarA, iqaVar, fdaeVar);
            hmlVar.y(objF);
        }
        hmlVar.o();
        ics icsVarA = itf.a(icsVar, dkkrVar.a, (PointerInputEventHandler) objF);
        hmlVar.o();
        return icsVarA;
    }
}
