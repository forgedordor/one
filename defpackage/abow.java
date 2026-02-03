package defpackage;

import java.io.Closeable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abow implements Closeable {
    final /* synthetic */ abpk a;
    private final String b;
    private final kog c;

    public abow(abpk abpkVar, String str, kog kogVar) {
        this.a = abpkVar;
        this.b = str;
        this.c = kogVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Map map = this.a.j;
        synchronized (map) {
            String str = this.b;
            kog kogVar = (kog) map.get(str);
            if (kogVar != null && kogVar.equals(this.c)) {
                cqbd cqbdVarC = abpk.a.c();
                cqbdVarC.I("Removing cancelled request");
                cqbdVarC.A("requestId", str);
                cqbdVarC.r();
                map.remove(str);
            }
        }
    }
}
