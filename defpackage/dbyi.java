package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbyi extends dbxz {
    public dbys h;
    public eyfb i;

    public dbyi(Context context, String str) {
        super(context, str);
    }

    public final dbyl c() {
        eyek eyekVarB;
        String str = this.f;
        dcaa dcaaVar = this.d;
        dbys dbysVar = this.h;
        if (dbysVar == null || (dbysVar.b & 4) == 0) {
            eyekVarB = this.e;
        } else {
            eyekVarB = eyek.b(dbysVar.e);
            if (eyekVarB == null) {
                eyekVarB = eyek.DEFAULT;
            }
        }
        eyek eyekVar = eyekVarB;
        dbym dbymVar = this.c;
        eyfb eyfbVar = this.i;
        dcbj dcbjVar = null;
        if (dbysVar != null && eyfbVar != null) {
            int i = ekgb.d;
            ekfw ekfwVar = new ekfw();
            if ((dbysVar.b & 2) != 0) {
                dbyr dbyrVar = dbysVar.d;
                if (dbyrVar == null) {
                    dbyrVar = dbyr.a;
                }
                ekfwVar.h(new dcbo(eyfbVar, dbyrVar));
            }
            if ((dbysVar.b & 1) != 0) {
                dbyp dbypVar = dbysVar.c;
                if (dbypVar == null) {
                    dbypVar = dbyp.a;
                }
                ekfwVar.h(new dcbn(eyfbVar, dbypVar, new dcbt(this.a)));
            }
            ekgb ekgbVarG = ekfwVar.g();
            if (!ekgbVarG.isEmpty()) {
                dcbjVar = new dcbj(ekgbVarG);
            }
        }
        String str2 = this.b;
        return new dbyl(this.a, str2, str, dcaaVar, eyekVar, dbymVar, null, dcbjVar, this.g);
    }
}
