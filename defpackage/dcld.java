package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcld implements dcfr {
    final /* synthetic */ dcfs a;
    final /* synthetic */ defr b;
    final /* synthetic */ dclf c;

    public dcld(dcfs dcfsVar, defr defrVar, dclf dclfVar) {
        this.a = dcfsVar;
        this.b = defrVar;
        this.c = dclfVar;
    }

    @Override // defpackage.dcfr
    public final void a(Status status) {
        if (!status.d()) {
            this.b.a(dcjq.a(status));
        } else {
            this.b.b(this.c.a(this.a.g(TimeUnit.MILLISECONDS)));
        }
    }
}
