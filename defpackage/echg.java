package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class echg implements ecer {
    private final evuo a;
    private final evrr b;

    public echg(evuo evuoVar) {
        evrr evrrVar = evrr.a;
        evuq evuqVar = evuq.a;
        this.b = evrr.a;
        this.a = evuoVar;
    }

    public static echg b(evuh evuhVar) {
        return new echg(evuhVar.getParserForType());
    }

    @Override // defpackage.ecer
    public final /* bridge */ /* synthetic */ Object a(eceq eceqVar) throws IOException {
        InputStream inputStreamA = new echh().a(eceqVar);
        try {
            Object objK = this.a.k(inputStreamA, this.b);
            if (inputStreamA != null) {
                inputStreamA.close();
            }
            return objK;
        } catch (Throwable th) {
            if (inputStreamA != null) {
                try {
                    inputStreamA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
