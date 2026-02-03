package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bkc implements bpu {
    final /* synthetic */ kog a;

    public bkc(kog kogVar) {
        this.a = kogVar;
    }

    @Override // defpackage.bpu
    public final void a(Throwable th) {
        if (th instanceof TimeoutException) {
            this.a.c(th);
        } else {
            this.a.b(Collections.EMPTY_LIST);
        }
    }

    @Override // defpackage.bpu
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        List list = (List) obj;
        lcg.i(list);
        this.a.b(new ArrayList(list));
    }
}
