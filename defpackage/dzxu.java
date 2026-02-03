package defpackage;

import android.os.Binder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dzxu {
    public static Object a(dzxv dzxvVar) {
        try {
            return dzxvVar.a();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return dzxvVar.a();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
