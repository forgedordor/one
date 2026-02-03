package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmdo {
    public static final egyj a = new egyb("SCREEN_DETECTION_LISTENER_DATA_SOURCE_KEY");
    public final fcsu b;
    public final fcsu c;
    public final fdjx d;
    public final AtomicReference e;
    public final AtomicReference f;
    public final AtomicReference g;
    private final fcsu h;

    public cmdo(fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fdjx fdjxVar) {
        fcsuVar3.getClass();
        fdjxVar.getClass();
        this.b = fcsuVar;
        this.h = fcsuVar2;
        this.c = fcsuVar3;
        this.d = fdjxVar;
        this.e = new AtomicReference(null);
        this.f = new AtomicReference();
        this.g = new AtomicReference();
    }

    public final void a() throws IOException {
        eieu eieuVarH = eiiy.h("handleDisplayChange");
        try {
            AtomicReference atomicReference = this.e;
            cmdb cmdbVar = (cmdb) atomicReference.get();
            cmdb cmdbVarB = ((cmdi) this.b.b()).b(cmdbVar);
            atomicReference.set(cmdbVarB);
            if (cmdbVar == null || cmdbVar.a == cmdbVarB.a) {
                ((egzh) this.h.b()).a(eijx.e(cmdbVarB), a);
            } else {
                ((egzh) this.h.b()).a(eijx.e(cmdbVarB), a);
            }
            fczl.a(eieuVarH, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                fczl.a(eieuVarH, th);
                throw th2;
            }
        }
    }
}
