package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fbtl extends fbof {
    private static final Logger b = Logger.getLogger(fbtl.class.getName());
    static final ThreadLocal a = new ThreadLocal();

    @Override // defpackage.fbof
    public final fbog a() {
        fbog fbogVar = (fbog) a.get();
        return fbogVar == null ? fbog.d : fbogVar;
    }

    @Override // defpackage.fbof
    public final fbog b(fbog fbogVar) {
        fbog fbogVarA = a();
        a.set(fbogVar);
        return fbogVarA;
    }

    @Override // defpackage.fbof
    public final void c(fbog fbogVar, fbog fbogVar2) {
        if (a() != fbogVar) {
            b.logp(Level.SEVERE, "io.grpc.ThreadLocalContextStorage", "detach", "Context was not attached when detaching", new Throwable().fillInStackTrace());
        }
        if (fbogVar2 != fbog.d) {
            a.set(fbogVar2);
        } else {
            a.set(null);
        }
    }
}
