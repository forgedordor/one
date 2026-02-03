package defpackage;

import io.grpc.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fcir extends fbqi {
    public final fbqa f;
    public fbnv g = fbnv.IDLE;
    private fbqf h;

    public fcir(fbqa fbqaVar) {
        this.f = fbqaVar;
    }

    @Override // defpackage.fbqi
    public final Status a(fbqe fbqeVar) {
        fcin fcinVar;
        Boolean bool;
        List list = fbqeVar.a;
        if (list.isEmpty()) {
            Status statusWithDescription = Status.p.withDescription("NameResolver returned no usable address. addrs=" + String.valueOf(list) + ", attrs=" + fbqeVar.b.toString());
            b(statusWithDescription);
            return statusWithDescription;
        }
        Object obj = fbqeVar.c;
        if ((obj instanceof fcin) && (bool = (fcinVar = (fcin) obj).a) != null && bool.booleanValue()) {
            ArrayList arrayList = new ArrayList(list);
            Long l = fcinVar.b;
            Collections.shuffle(arrayList, new Random());
            list = arrayList;
        }
        fbqf fbqfVar = this.h;
        if (fbqfVar == null) {
            fbqa fbqaVar = this.f;
            fbpv fbpvVar = new fbpv();
            fbpvVar.c(list);
            fbqf fbqfVarB = fbqaVar.b(fbpvVar.a());
            fbqfVarB.c(new fcim(this, fbqfVarB));
            this.h = fbqfVarB;
            e(fbnv.CONNECTING, new fcio(fbqc.c(fbqfVarB)));
            fbqfVarB.a();
        } else {
            fbqfVar.d(list);
        }
        return Status.b;
    }

    @Override // defpackage.fbqi
    public final void b(Status status) {
        fbqf fbqfVar = this.h;
        if (fbqfVar != null) {
            fbqfVar.b();
            this.h = null;
        }
        e(fbnv.TRANSIENT_FAILURE, new fcio(fbqc.b(status)));
    }

    @Override // defpackage.fbqi
    public final void c() {
        fbqf fbqfVar = this.h;
        if (fbqfVar != null) {
            fbqfVar.a();
        }
    }

    @Override // defpackage.fbqi
    public final void d() {
        fbqf fbqfVar = this.h;
        if (fbqfVar != null) {
            fbqfVar.b();
        }
    }

    public final void e(fbnv fbnvVar, fbqg fbqgVar) {
        this.g = fbnvVar;
        this.f.f(fbnvVar, fbqgVar);
    }
}
