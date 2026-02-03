package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rvp implements lcd {
    private final rvo a;
    private final rvr b;
    private final lcd c;

    public rvp(lcd lcdVar, rvo rvoVar, rvr rvrVar) {
        this.c = lcdVar;
        this.a = rvoVar;
        this.b = rvrVar;
    }

    @Override // defpackage.lcd
    public final Object a() {
        Object objA = this.c.a();
        if (objA == null) {
            objA = this.a.a();
            if (Log.isLoggable("FactoryPools", 2)) {
                Log.v("FactoryPools", "Created new ".concat(String.valueOf(String.valueOf(objA.getClass()))));
            }
        }
        if (objA instanceof rvq) {
            ((rvt) ((rvq) objA).eY()).a = false;
        }
        return objA;
    }

    @Override // defpackage.lcd
    public final boolean b(Object obj) {
        if (obj instanceof rvq) {
            ((rvt) ((rvq) obj).eY()).a = true;
        }
        this.b.a(obj);
        return this.c.b(obj);
    }
}
