package defpackage;

import android.os.Build;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iie {
    private static boolean a = true;
    private final ViewGroup b;
    private final Object c = new Object();
    private inv d;

    public iie(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    private final inv c(ViewGroup viewGroup) {
        inv invVar = this.d;
        if (invVar != null) {
            return invVar;
        }
        inw inwVar = new inw(viewGroup.getContext());
        viewGroup.addView(inwVar);
        this.d = inwVar;
        return inwVar;
    }

    public final ini a() {
        inl inqVar;
        ini iniVar;
        synchronized (this.c) {
            ViewGroup viewGroup = this.b;
            if (Build.VERSION.SDK_INT >= 29) {
                viewGroup.getUniqueDrawingId();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                inqVar = new ino(new ijc(), new imu());
            } else if (a) {
                try {
                    inqVar = new inn(viewGroup, new ijc(), new imu());
                } catch (Throwable unused) {
                    a = false;
                    inqVar = new inq(c(this.b));
                }
            } else {
                inqVar = new inq(c(this.b));
            }
            iniVar = new ini(inqVar);
        }
        return iniVar;
    }

    public final void b(ini iniVar) {
        synchronized (this.c) {
            if (!iniVar.l) {
                iniVar.l = true;
                iniVar.e();
            }
        }
    }
}
