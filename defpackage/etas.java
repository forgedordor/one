package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etas {
    public static esyj a(etdb etdbVar) {
        boolean z;
        try {
            try {
                etdbVar.t();
            } catch (EOFException e) {
                e = e;
                z = true;
            }
            try {
                return etbc.e(etdbVar);
            } catch (EOFException e2) {
                e = e2;
                z = false;
                if (z) {
                    return esyl.a;
                }
                throw new esyr(e);
            }
        } catch (etde e3) {
            throw new esyr(e3);
        } catch (IOException e4) {
            throw new esyk(e4);
        } catch (NumberFormatException e5) {
            throw new esyr(e5);
        }
    }

    public static void b(esyj esyjVar, etdd etddVar) {
        etcq.T.b(etddVar, esyjVar);
    }
}
