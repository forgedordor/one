package defpackage;

import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import io.grpc.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class epqv {
    public static Status a(Exception exc) {
        if (!(exc instanceof SQLiteException)) {
            return Status.c(exc).withDescription(exc.getMessage());
        }
        List listC = ejxy.c(exc);
        String strB = new ejwc("\nCaused by: ").b(ekis.f(listC, new ejvr() { // from class: epqt
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                return ((Throwable) obj).getMessage();
            }
        }));
        return ekis.q(listC, new ejwm() { // from class: epqu
            @Override // defpackage.ejwm
            public final boolean a(Object obj) {
                return ((Throwable) obj) instanceof SQLiteDatabaseLockedException;
            }
        }) ? Status.p.withDescription(strB) : (strB.contains("no such table") || strB.contains("no such column")) ? Status.q.withDescription(strB) : Status.o.withDescription(strB);
    }
}
