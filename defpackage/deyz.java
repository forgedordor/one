package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class deyz extends deyn {
    public deyz(dfxx dfxxVar, dhes dhesVar, emko emkoVar, eosc eoscVar, dexw dexwVar) {
        super(dfxxVar, dhesVar, emkoVar, eoscVar, dexwVar);
    }

    public final void d(Context context, int i) {
        ewqe ewqeVar = (ewqe) ewqh.a.createBuilder();
        ewqeVar.copyOnWrite();
        ewqh ewqhVar = (ewqh) ewqeVar.instance;
        ewqhVar.d = i - 1;
        ewqhVar.b |= 2;
        ewqeVar.copyOnWrite();
        ewqh ewqhVar2 = (ewqh) ewqeVar.instance;
        ewqhVar2.c = 3;
        ewqhVar2.b |= 1;
        ewqh ewqhVar3 = (ewqh) ewqeVar.build();
        ewny ewnyVarJ = J();
        ewnyVarJ.copyOnWrite();
        ewnz ewnzVar = (ewnz) ewnyVarJ.instance;
        ewnz ewnzVar2 = ewnz.a;
        ewqhVar3.getClass();
        ewnzVar.d = ewqhVar3;
        ewnzVar.c = 10;
        super.H(context, (ewnz) ewnyVarJ.build());
    }
}
