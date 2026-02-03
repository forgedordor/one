package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ciab implements chza {
    private final Map a = new HashMap();
    private final Map b = new HashMap();

    private final enwr y(dggn dggnVar) {
        Map map = this.a;
        if (map.containsKey(dggnVar) && !((ArrayDeque) map.get(dggnVar)).isEmpty()) {
            ArrayDeque arrayDeque = (ArrayDeque) map.get(dggnVar);
            if (arrayDeque.size() != 1) {
                return (enwr) arrayDeque.remove();
            }
            enwr enwrVar = (enwr) arrayDeque.peek();
            if (enwrVar != null) {
                return enwrVar;
            }
        }
        return enwr.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS;
    }

    @Override // defpackage.chza
    public final eiju a(chyx chyxVar) {
        return eijx.e(null);
    }

    @Override // defpackage.chza
    public final eiju b(dggn dggnVar, chyx chyxVar) {
        return eijx.e(null);
    }

    @Override // defpackage.chza
    public final elsf c() {
        return elsf.UNKNOWN_UNINITIALIZED_REASON;
    }

    @Override // defpackage.chza
    public final enwr d() {
        return y(null);
    }

    @Override // defpackage.chza
    public final enwr e(String str) {
        return y(new dggp(str));
    }

    @Override // defpackage.chza
    public final enwr f(int i) {
        dggn dggnVar = (dggn) this.b.get(Integer.valueOf(i));
        return dggnVar != null ? y(dggnVar) : enwr.BUGLE_LOADING_AVAILABILITY_IN_PROGRESS;
    }

    @Override // defpackage.chza
    public final String g(enwr enwrVar, elsf elsfVar) {
        return "";
    }

    @Override // defpackage.chza
    public final boolean q() {
        return d() == enwr.AVAILABLE;
    }

    @Override // defpackage.chza
    public final boolean r() {
        return d() == enwr.DISABLED_FROM_PREFERENCES;
    }

    @Override // defpackage.chza
    public final boolean s() {
        int iOrdinal = d().ordinal();
        if (iOrdinal != 1 && iOrdinal != 6 && iOrdinal != 10 && iOrdinal != 13 && iOrdinal != 21) {
            switch (iOrdinal) {
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    @Override // defpackage.chza
    public final int t() {
        return 3;
    }

    @Override // defpackage.chza
    public final enwr u(dggn dggnVar) {
        return y(dggnVar);
    }

    @Override // defpackage.chza
    public final enwr v(dggn dggnVar) {
        return y(dggnVar);
    }

    @Override // defpackage.chza
    public final enwr w() {
        return y(null);
    }

    @Override // defpackage.chza
    public final void j() {
    }

    @Override // defpackage.chza
    public final void k() {
    }

    @Override // defpackage.chza
    public final void m() {
    }

    @Override // defpackage.chza
    public final void x() {
    }

    @Override // defpackage.chza
    @Deprecated
    public final void h(chyy chyyVar) {
    }

    @Override // defpackage.chza
    @Deprecated
    public final void l(chyy chyyVar) {
    }

    @Override // defpackage.chza
    public final void n(chyx chyxVar) {
    }

    @Override // defpackage.chza
    public final void o(chyx chyxVar) {
    }

    @Override // defpackage.chza
    public final void i(chyy chyyVar, Executor executor) {
    }

    @Override // defpackage.chza
    public final void p(dggn dggnVar, chyx chyxVar) {
    }
}
