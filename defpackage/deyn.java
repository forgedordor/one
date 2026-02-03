package defpackage;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class deyn extends dexs {
    public static final String c = UUID.randomUUID().toString();
    public static final AtomicInteger d = new AtomicInteger();

    protected deyn(dfxx dfxxVar, dhes dhesVar, emko emkoVar, eosc eoscVar, dexw dexwVar) {
        super(dfxxVar, dhesVar, emkoVar, eoscVar, dexwVar);
    }

    static final ewny J() {
        ewny ewnyVar = (ewny) ewnz.a.createBuilder();
        String str = c;
        ewnyVar.copyOnWrite();
        ewnz ewnzVar = (ewnz) ewnyVar.instance;
        str.getClass();
        ewnzVar.b |= 1;
        ewnzVar.e = str;
        int iIncrementAndGet = d.incrementAndGet();
        ewnyVar.copyOnWrite();
        ewnz ewnzVar2 = (ewnz) ewnyVar.instance;
        ewnzVar2.b |= 2;
        ewnzVar2.f = iIncrementAndGet;
        return ewnyVar;
    }

    public final void H(Context context, ewnz ewnzVar) {
        emkm emkmVarK = K(context);
        if (emkmVarK == null) {
            dhja.q("Unable to send diagnostic log", new Object[0]);
            return;
        }
        emkmVarK.copyOnWrite();
        emkr emkrVar = (emkr) emkmVarK.instance;
        emkr emkrVar2 = emkr.a;
        ewnzVar.getClass();
        emkrVar.f = ewnzVar;
        emkrVar.e = 25;
        M(context, (emkr) emkmVarK.build(), ewqu.DIAGNOSTIC_EVENT);
    }

    protected final void I(Context context, ewot ewotVar) {
        ewny ewnyVarJ = J();
        ewnyVarJ.copyOnWrite();
        ewnz ewnzVar = (ewnz) ewnyVarJ.instance;
        ewnz ewnzVar2 = ewnz.a;
        ewotVar.getClass();
        ewnzVar.d = ewotVar;
        ewnzVar.c = 3;
        H(context, (ewnz) ewnyVarJ.build());
    }
}
