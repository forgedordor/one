package defpackage;

import android.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dphc {
    public static /* synthetic */ Object a(eg egVar, String str, String str2, fdap fdapVar, fcxy fcxyVar, int i) {
        String string = (i & 4) != 0 ? egVar.getString(R.string.cancel) : null;
        boolean z = (i & 8) != 0;
        fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
        fdiuVar.B();
        eeji eejiVar = new eeji(egVar);
        fdapVar.invoke(eejiVar);
        eejiVar.l(str);
        eejiVar.i(z);
        eejiVar.s(str2, new dpgz(fdiuVar));
        if (string != null) {
            eejiVar.n(string, new dpha(fdiuVar));
        }
        eejiVar.p(new dphb(fdiuVar));
        fdiuVar.d(new dpgy(eejiVar.a()));
        Object objM = fdiuVar.m();
        if (objM == fcyl.a) {
            fcxyVar.getClass();
        }
        return objM;
    }
}
