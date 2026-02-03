package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcjb {
    public static void a(Status status, defr defrVar) {
        b(status, null, defrVar);
    }

    public static void b(Status status, Object obj, defr defrVar) {
        if (status.d()) {
            defrVar.b(obj);
        } else {
            defrVar.a(dcjq.a(status));
        }
    }

    public static void c(Status status, Object obj, defr defrVar) {
        if (status.d()) {
            defrVar.d(obj);
        } else {
            defrVar.c(dcjq.a(status));
        }
    }
}
