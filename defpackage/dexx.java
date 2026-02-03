package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dexx extends deyn {
    private static final dhip b = new dhip("ConfigLogSender");

    public dexx(dfxx dfxxVar, dhes dhesVar, emko emkoVar, eosc eoscVar, dexw dexwVar) {
        super(dfxxVar, dhesVar, emkoVar, eoscVar, dexwVar);
    }

    public final void d(Context context, int i, long j, int i2, int i3) {
        dhja.p(b, "Logging Configuration Update: Version: %d Validity: %d Remaining Validity : %d Config State: %d", Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(j), Integer.valueOf(i3));
        ewfh ewfhVar = (ewfh) ewfk.a.createBuilder();
        ewfhVar.copyOnWrite();
        ewfk ewfkVar = (ewfk) ewfhVar.instance;
        ewfkVar.b = 2 | ewfkVar.b;
        ewfkVar.d = i;
        ewfhVar.copyOnWrite();
        ewfk ewfkVar2 = (ewfk) ewfhVar.instance;
        ewfkVar2.b |= 4;
        ewfkVar2.e = j;
        ewfhVar.copyOnWrite();
        ewfk ewfkVar3 = (ewfk) ewfhVar.instance;
        ewfkVar3.b |= 16;
        ewfkVar3.g = i2;
        int iA = ewfj.a(i3);
        if (iA == 0) {
            throw null;
        }
        ewfhVar.copyOnWrite();
        ewfk ewfkVar4 = (ewfk) ewfhVar.instance;
        ewfkVar4.f = iA - 1;
        ewfkVar4.b |= 8;
        ewfk ewfkVar5 = (ewfk) ewfhVar.build();
        ewny ewnyVarJ = deyn.J();
        ewnyVarJ.copyOnWrite();
        ewnz ewnzVar = (ewnz) ewnyVarJ.instance;
        ewnz ewnzVar2 = ewnz.a;
        ewfkVar5.getClass();
        ewnzVar.d = ewfkVar5;
        ewnzVar.c = 6;
        super.H(context, (ewnz) ewnyVarJ.build());
    }
}
