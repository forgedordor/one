package defpackage;

import androidx.compose.animation.SkipToLookaheadElement;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dcc extends fdbr implements fdau {
    final /* synthetic */ cyg a;
    final /* synthetic */ dap b;
    final /* synthetic */ dar c;
    final /* synthetic */ dbr d;
    final /* synthetic */ dba e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcc(cyg cygVar, dap dapVar, dar darVar, dbr dbrVar, dba dbaVar) {
        super(3);
        this.a = cygVar;
        this.b = dapVar;
        this.c = darVar;
        this.d = dbrVar;
        this.e = dbaVar;
    }

    @Override // defpackage.fdau
    public final /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(-419341573);
        dbr dbrVar = this.d;
        dhk dhkVarA = this.a.a();
        boolean zF = hmlVar.F(dbrVar);
        Object objF = hmlVar.f();
        if (zF || objF == hmk.a) {
            objF = new dca(dbrVar);
            hmlVar.y(objF);
        }
        dar darVar = this.c;
        Object obj4 = dbrVar.a;
        Objects.toString(obj4);
        ics icsVarI = dae.i(dhkVarA, this.b, darVar, (fdae) objF, "enter/exit for ".concat((String) obj4), hmlVar, 0, 0);
        dba dbaVar = this.e;
        hmlVar.v(1455894925);
        ics icsVarA = ics.e;
        boolean zF2 = hmlVar.F(dbrVar);
        Object objF2 = hmlVar.f();
        if (zF2 || objF2 == hmk.a) {
            objF2 = new dcb(dbrVar);
            hmlVar.y(objF2);
        }
        fdae fdaeVar = (fdae) objF2;
        if (fdbq.f(dbaVar.a, iuz.a)) {
            icsVarA = ijn.a(icsVarA, new ddd(fdaeVar));
        }
        ics icsVarA2 = icsVarA.a(new SkipToLookaheadElement(dbaVar, fdaeVar));
        hmlVar.o();
        ics icsVarA3 = icsVarI.a(icsVarA2);
        hmlVar.o();
        return icsVarA3;
    }
}
