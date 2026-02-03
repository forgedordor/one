package defpackage;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fbog {
    static final Logger c = Logger.getLogger(fbog.class.getName());
    public static final fbog d = new fbog();
    final fbnz e;
    public final fbsf f;
    public final int g;

    private fbog() {
        this.e = null;
        this.f = null;
        this.g = 0;
        e(0);
    }

    private static void e(int i) {
        if (i == 1000) {
            c.logp(Level.SEVERE, "io.grpc.Context", "validateGeneration", "Context ancestry chain length is abnormally long. This suggests an error in application code. Length exceeded: 1000", (Throwable) new Exception());
        }
    }

    public static fbog k() {
        fbog fbogVarA = fboe.a.a();
        return fbogVarA == null ? d : fbogVarA;
    }

    public static void m(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException((String) obj2);
        }
    }

    public fbog a() {
        fbog fbogVarB = fboe.a.b(this);
        return fbogVarB == null ? d : fbogVarB;
    }

    public fbol b() {
        fbnz fbnzVar = this.e;
        if (fbnzVar == null) {
            return null;
        }
        return fbnzVar.a;
    }

    public Throwable c() {
        fbnz fbnzVar = this.e;
        if (fbnzVar == null) {
            return null;
        }
        return fbnzVar.c();
    }

    public void d(fboa fboaVar, Executor executor) {
        m(executor, "executor");
        fbnz fbnzVar = this.e;
        if (fbnzVar == null) {
            return;
        }
        fbnzVar.e(new fboc(executor, fboaVar, this));
    }

    public void f(fbog fbogVar) {
        m(fbogVar, "toAttach");
        fboe.a.c(this, fbogVar);
    }

    public void g(fboa fboaVar) {
        fbnz fbnzVar = this.e;
        if (fbnzVar == null) {
            return;
        }
        fbnzVar.h(fboaVar, this);
    }

    public boolean i() {
        fbnz fbnzVar = this.e;
        if (fbnzVar == null) {
            return false;
        }
        return fbnzVar.i();
    }

    public final fbog l(fbod fbodVar, Object obj) {
        fbsf fbsfVar = this.f;
        return new fbog(this, fbsfVar == null ? new fbse(fbodVar, obj) : fbsfVar.b(fbodVar, obj, fbodVar.hashCode(), 0));
    }

    public fbog(fbog fbogVar, fbsf fbsfVar) {
        this.e = fbogVar instanceof fbnz ? (fbnz) fbogVar : fbogVar.e;
        this.f = fbsfVar;
        int i = fbogVar.g + 1;
        this.g = i;
        e(i);
    }

    public fbog(fbsf fbsfVar, int i) {
        this.e = null;
        this.f = fbsfVar;
        this.g = i;
        e(i);
    }
}
