package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxmo {
    public static final void a(qbt qbtVar, dxml dxmlVar, Long l) {
        qbtVar.d("GNP_SDK_JOB");
        if (l != null) {
            qbtVar.h(l.longValue(), TimeUnit.MILLISECONDS);
        }
        Long lC = dxmlVar.c();
        if (lC != null) {
            qbtVar.f(pza.a, lC.longValue(), TimeUnit.MILLISECONDS);
        }
    }
}
