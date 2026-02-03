package defpackage;

import androidx.compose.animation.SharedBoundsNodeElement;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dcd extends fdbr implements fdau {
    final /* synthetic */ dbr a;
    final /* synthetic */ dhk b;
    final /* synthetic */ fdap c;
    final /* synthetic */ dcf d;
    final /* synthetic */ dch e;
    final /* synthetic */ dcg f;
    final /* synthetic */ dbo g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dcd(dbr dbrVar, dhk dhkVar, fdap fdapVar, dcf dcfVar, dbo dboVar, dch dchVar, dcg dcgVar) {
        super(3);
        this.a = dbrVar;
        this.b = dhkVar;
        this.c = fdapVar;
        this.d = dcfVar;
        this.g = dboVar;
        this.e = dchVar;
        this.f = dcgVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        dhk dhkVarB;
        cyl cylVar;
        ics icsVar = (ics) obj;
        hml hmlVar = (hml) obj2;
        ((Number) obj3).intValue();
        hmlVar.v(-1843478929);
        dbr dbrVar = this.a;
        Object obj4 = dbrVar.a;
        hmlVar.u(-2056719734, obj4);
        Object objF = hmlVar.f();
        dcf dcfVar = this.d;
        Object obj5 = hmk.a;
        if (objF == obj5) {
            cuz cuzVar = dcfVar.i;
            dbl dblVar = (dbl) cuzVar.f(obj4);
            if (dblVar == null) {
                dblVar = new dbl(obj4, dcfVar);
                cuzVar.e(obj4, dblVar);
            }
            objF = dblVar;
            hmlVar.y(objF);
        }
        dhk dhkVar = this.b;
        dbl dblVar2 = (dbl) objF;
        hmlVar.u(-2056715921, dhkVar);
        if (dhkVar != null) {
            hmlVar.v(666402505);
            fdap fdapVar = this.c;
            boolean zD = hmlVar.D(dhkVar);
            Object objF2 = hmlVar.f();
            if (zD || objF2 == obj5) {
                objF2 = dhkVar.e();
                hmlVar.y(objF2);
            }
            if (dhkVar.t()) {
                objF2 = dhkVar.e();
            }
            hmlVar.v(1329676753);
            Boolean bool = (Boolean) fdapVar.invoke(objF2);
            bool.booleanValue();
            hmlVar.o();
            Object objF3 = dhkVar.f();
            hmlVar.v(1329676753);
            Boolean bool2 = (Boolean) fdapVar.invoke(objF3);
            bool2.booleanValue();
            hmlVar.o();
            dhkVarB = dhy.a(dhkVar, bool, bool2, (String) obj4, hmlVar, 0);
            hmlVar.o();
        } else {
            hmlVar.v(666617645);
            fdap fdapVar2 = this.c;
            fdcm.e(fdapVar2, 1);
            Boolean bool3 = (Boolean) fdapVar2.invoke(fctx.a);
            bool3.booleanValue();
            Object objF4 = hmlVar.f();
            if (objF4 == obj5) {
                objF4 = new dfw(bool3);
                hmlVar.y(objF4);
            }
            dfw dfwVar = (dfw) objF4;
            dfwVar.d(bool3);
            dhkVarB = dhy.b(dfwVar, null, hmlVar, 0, 2);
            hmlVar.o();
        }
        hmlVar.u(-2056688763, Boolean.valueOf(dcfVar.a()));
        dhc dhcVarG = dhy.g(dhkVarB, diu.i, hmlVar, 0);
        hmlVar.m();
        boolean zD2 = hmlVar.D(dhkVarB);
        dcg dcgVar = this.f;
        Object objF5 = hmlVar.f();
        if (zD2 || objF5 == obj5) {
            objF5 = new cyl(dcfVar, dhkVarB, dhcVarG, dcgVar);
            hmlVar.y(objF5);
        }
        cyl cylVar2 = (cyl) objF5;
        if (!fdbq.f(cylVar2.a(), dhcVarG)) {
            cylVar2.c.b(dhcVarG);
            cylVar2.d(null);
            cylVar2.e = cym.a;
        }
        cylVar2.d.b(dcgVar);
        hmlVar.m();
        dbo dboVar = this.g;
        dch dchVar = this.e;
        Object objF6 = hmlVar.f();
        if (objF6 == obj5) {
            cylVar = cylVar2;
            dbm dbmVar = new dbm(dblVar2, cylVar, dboVar, dchVar, dbrVar);
            hmlVar.y(dbmVar);
            objF6 = dbmVar;
        } else {
            cylVar = cylVar2;
        }
        dbm dbmVar2 = (dbm) objF6;
        dbrVar.b.b(dbmVar2);
        dbmVar2.b.b(dblVar2);
        dbmVar2.e.b(false);
        dbmVar2.c.b(cylVar);
        dbmVar2.d.b(dboVar);
        dbmVar2.f.b(dchVar);
        dbmVar2.l.h(0.0f);
        dbmVar2.a.b(true);
        dbmVar2.g.b(dbrVar);
        hmlVar.m();
        ics icsVarA = icsVar.a(new SharedBoundsNodeElement(dbmVar2));
        hmlVar.o();
        return icsVarA;
    }
}
