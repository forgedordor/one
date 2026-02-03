package defpackage;

import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekut extends ekuc {
    public static final Set a;
    public static final ektl b;
    public static final ekur c;
    private final String d;
    private final Level e;
    private final Set f;
    private final ektl g;
    private final int h;

    static {
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(ekrl.a, eksq.a, eksr.a)));
        a = setUnmodifiableSet;
        ektl ektlVarA = ekto.a(setUnmodifiableSet);
        b = ektlVarA;
        c = new ekur(2, Level.ALL, false, setUnmodifiableSet, ektlVarA);
    }

    public ekut(String str, int i, Level level, Set set, ektl ektlVar) {
        super(str);
        this.d = ekuk.b(str);
        this.h = 2;
        this.e = level;
        this.f = set;
        this.g = ektlVar;
    }

    public static void e(eksx eksxVar, String str, int i, Level level, Set set, ektl ektlVar) {
        String string;
        Boolean bool = (Boolean) eksxVar.i().d(eksr.a);
        if (bool == null || !bool.booleanValue()) {
            ektv ektvVarG = ektv.g(ekty.f(), eksxVar.i());
            boolean z = eksxVar.m().intValue() < level.intValue();
            if (z || ekua.c(eksxVar, ektvVarG, set)) {
                StringBuilder sb = new StringBuilder();
                if (eksz.a(2, eksxVar.e(), sb)) {
                    sb.append(" ");
                }
                if (!z || eksxVar.j() == null) {
                    ekss.c(eksxVar, sb);
                    ekua.d(ektvVarG, ektlVar, sb);
                } else {
                    sb.append("(REDACTED) ");
                    sb.append(eksxVar.j().b);
                }
                string = sb.toString();
            } else {
                string = ekua.b(eksxVar);
            }
            Throwable th = (Throwable) eksxVar.i().d(ekrl.a);
            int iA = ekuk.a(eksxVar.m());
            if (iA == 2) {
                Log.v(str, string, th);
                return;
            }
            if (iA == 3) {
                Log.d(str, string, th);
                return;
            }
            if (iA == 4) {
                Log.i(str, string, th);
            } else if (iA != 5) {
                Log.e(str, string, th);
            } else {
                Log.w(str, string, th);
            }
        }
    }

    @Override // defpackage.ekta
    public final void b(eksx eksxVar) {
        e(eksxVar, this.d, 2, this.e, this.f, this.g);
    }

    @Override // defpackage.ekta
    public final boolean c(Level level) {
        String str = this.d;
        int iA = ekuk.a(level);
        return Log.isLoggable(str, iA) || Log.isLoggable("all", iA);
    }
}
