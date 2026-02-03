package defpackage;

import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esuo extends fbox {
    final /* synthetic */ esup a;
    final /* synthetic */ fbog b;
    private final AtomicBoolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public esuo(fbsm fbsmVar, esup esupVar, fbog fbogVar) {
        super(fbsmVar);
        this.a = esupVar;
        this.b = fbogVar;
        this.c = new AtomicBoolean(false);
    }

    @Override // defpackage.fbsa, defpackage.fbsm
    public final void a(Status status, fbrg fbrgVar) {
        status.getClass();
        fbrgVar.getClass();
        if (this.c.get()) {
            esup esupVar = this.a;
            fbog fbogVar = this.b;
            int i = 0;
            while (true) {
                esum[] esumVarArr = esupVar.a;
                if (i >= esumVarArr.length) {
                    break;
                }
                if (((AtomicReference) esumVarArr[i].c.b(fbogVar)).get() != null) {
                    super.a(Status.o.withDescription("Parcelable response headers can be populated only before the first response."), fbrgVar);
                    return;
                }
                i++;
            }
        }
        this.a.b(fbrgVar, this.b, false);
        super.a(status, fbrgVar);
    }

    @Override // defpackage.fbsa, defpackage.fbsm
    public final void b(fbrg fbrgVar) {
        this.a.b(fbrgVar, this.b, true);
        this.c.set(true);
        super.b(fbrgVar);
    }
}
