package defpackage;

import j$.util.Map;
import java.io.Closeable;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class abov implements Closeable {
    final /* synthetic */ abpk a;
    private final abou b;
    private final abpg c;

    public abov(abpk abpkVar, abou abouVar, abpg abpgVar) {
        this.a = abpkVar;
        this.b = abouVar;
        this.c = abpgVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        abpg abpgVar = this.c;
        boolean zH = abpgVar.h();
        boolean z = !zH;
        synchronized (abpk.b) {
            Map map = this.a.i;
            abou abouVar = this.b;
            abpg abpgVar2 = (abpg) map.get(abouVar);
            if (abpgVar2 == null || !abpgVar2.equals(abpgVar)) {
                z = true;
            } else if (!zH) {
                abpk.a.p("Removing cancelled JsBridgeChannel");
                Map.EL.remove(map, abouVar, abpgVar2);
            }
        }
        if (z) {
            abpk.a.p("Closing cancelled JsBridgeChannel");
            try {
                this.c.close();
            } catch (IOException e) {
                abpk.a.o("Failed when closing an opening JsBridgeChannel", e);
            }
        }
    }
}
