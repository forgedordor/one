package defpackage;

import android.util.Log;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekus extends ekuc {
    private final Level a;
    private final boolean b;
    private final Set c;
    private final ektl d;
    private final int e;

    public ekus(String str, int i, Level level, boolean z, Set set, ektl ektlVar) {
        super(str);
        this.e = 2;
        this.a = level;
        this.b = z;
        this.c = set;
        this.d = ektlVar;
    }

    @Override // defpackage.ekta
    public final void b(eksx eksxVar) {
        String strB = (String) eksxVar.i().d(eksq.a);
        if (strB == null) {
            strB = d();
        }
        if (strB == null) {
            strB = eksxVar.e().b();
            int iIndexOf = strB.indexOf(36, strB.lastIndexOf(46));
            if (iIndexOf >= 0) {
                strB = strB.substring(0, iIndexOf);
            }
        }
        String strB2 = ekuk.b(strB);
        Level levelM = eksxVar.m();
        if (!this.b) {
            int iA = ekuk.a(levelM);
            if (!Log.isLoggable(strB2, iA) && !Log.isLoggable("all", iA)) {
                return;
            }
        }
        ekut.e(eksxVar, strB2, 2, this.a, this.c, this.d);
    }

    @Override // defpackage.ekta
    public final boolean c(Level level) {
        return true;
    }
}
