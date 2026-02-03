package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class deyx extends deyn {
    private final dflh b;

    public deyx(dfxx dfxxVar, dhes dhesVar, emko emkoVar, eosc eoscVar, dexw dexwVar, dflh dflhVar) {
        super(dfxxVar, dhesVar, emkoVar, eoscVar, dexwVar);
        this.b = dflhVar;
    }

    public final void d(Context context, ewqb ewqbVar) {
        if (((eoth) ((dfiy) this.b).a.b()).a("cslib.delete_rcs_flag_logging")) {
            return;
        }
        ewny ewnyVarJ = J();
        ewnyVarJ.copyOnWrite();
        ewnz ewnzVar = (ewnz) ewnyVarJ.instance;
        ewnz ewnzVar2 = ewnz.a;
        ewqbVar.getClass();
        ewnzVar.d = ewqbVar;
        ewnzVar.c = 8;
        super.H(context, (ewnz) ewnyVarJ.build());
    }
}
