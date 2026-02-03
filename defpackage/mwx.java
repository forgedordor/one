package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwx {
    public final String a;
    private final mww b;
    private final Object c;

    static {
        new mwx("");
    }

    public mwx(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new mww() : null;
        this.c = new Object();
    }

    public final synchronized LogSessionId a() {
        mww mwwVar;
        mwwVar = this.b;
        mee.f(mwwVar);
        return mwwVar.a;
    }

    public final synchronized void b(LogSessionId logSessionId) {
        mww mwwVar = this.b;
        mee.f(mwwVar);
        mee.c(mwwVar.a.equals(LogSessionId.LOG_SESSION_ID_NONE));
        mwwVar.a = logSessionId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mwx)) {
            return false;
        }
        mwx mwxVar = (mwx) obj;
        return Objects.equals(this.a, mwxVar.a) && Objects.equals(this.b, mwxVar.b) && Objects.equals(this.c, mwxVar.c);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}
