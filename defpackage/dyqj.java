package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyqj {
    public static void a(lvy lvyVar, Object obj) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            lvyVar.m(obj);
        } else {
            lvyVar.j(obj);
        }
    }
}
