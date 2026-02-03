package defpackage;

import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dxfy {
    public static dxfy c(long j) {
        ejwl.a(j >= 0);
        dxfm dxfmVar = new dxfm();
        dxfmVar.a = Long.valueOf(j);
        dxfmVar.b(SystemClock.uptimeMillis());
        return dxfmVar.a();
    }

    public static dxfy d() {
        dxfm dxfmVar = new dxfm();
        dxfmVar.a = null;
        dxfmVar.b(SystemClock.uptimeMillis());
        return dxfmVar.a();
    }

    public abstract long a();

    public abstract Long b();

    public final boolean e() {
        return b() == null;
    }
}
