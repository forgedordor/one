package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
class deys extends deyn {
    public deys(dfxx dfxxVar, dhes dhesVar, emko emkoVar, eosc eoscVar, dexw dexwVar) {
        super(dfxxVar, dhesVar, emkoVar, eoscVar, dexwVar);
    }

    protected final void B(Context context, ewlx ewlxVar) {
        ewos ewosVar = (ewos) ewot.a.createBuilder();
        ewosVar.copyOnWrite();
        ewot ewotVar = (ewot) ewosVar.instance;
        ewlxVar.getClass();
        ewotVar.c = ewlxVar;
        ewotVar.b = 3;
        I(context, (ewot) ewosVar.build());
    }

    protected final void C(Context context, ewmp ewmpVar) {
        ewos ewosVar = (ewos) ewot.a.createBuilder();
        ewosVar.copyOnWrite();
        ewot ewotVar = (ewot) ewosVar.instance;
        ewmpVar.getClass();
        ewotVar.c = ewmpVar;
        ewotVar.b = 1;
        I(context, (ewot) ewosVar.build());
    }

    protected final void D(Context context, ewor eworVar, String str) {
        ewos ewosVar = (ewos) ewot.a.createBuilder();
        ewosVar.copyOnWrite();
        ewot ewotVar = (ewot) ewosVar.instance;
        eworVar.getClass();
        ewotVar.c = eworVar;
        ewotVar.b = 2;
        ewot ewotVar2 = (ewot) ewosVar.build();
        ewny ewnyVarJ = deyn.J();
        ewnyVarJ.copyOnWrite();
        ewnz ewnzVar = (ewnz) ewnyVarJ.instance;
        ewnz ewnzVar2 = ewnz.a;
        ewotVar2.getClass();
        ewnzVar.d = ewotVar2;
        ewnzVar.c = 3;
        if (str != null) {
            ewnyVarJ.copyOnWrite();
            ewnz ewnzVar3 = (ewnz) ewnyVarJ.instance;
            ewnzVar3.b |= 4;
            ewnzVar3.g = str;
        }
        super.H(context, (ewnz) ewnyVarJ.build());
    }
}
