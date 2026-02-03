package defpackage;

import android.os.Trace;
import io.grpc.Status;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class epqx {
    public static final eksp a = eksp.c("SqlStatementShared");
    public final List b = new ArrayList();
    public final List c = new ArrayList();
    public boolean d;

    public final Status a(long j) {
        Status statusA;
        Trace.beginSection("SqlStatement.bindInt");
        try {
            try {
                this.c.add(String.valueOf(j));
                this.b.add(Long.valueOf(j));
                statusA = Status.b;
            } catch (Exception e) {
                ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatementShared", "bindInt", 81, "SqlStatementShared.java")).q("Error binding int to SqlStatement.");
                statusA = epqv.a(e);
            }
            return statusA;
        } finally {
            Trace.endSection();
        }
    }

    public final Status b(byte[] bArr) {
        Status statusA;
        if (bArr == null) {
            ((eksl) ((eksl) a.i()).h("com/google/communication/synapse/security/scytale/store/SqlStatementShared", "bindString", 27, "SqlStatementShared.java")).q("value can not be null.");
            return Status.e;
        }
        Trace.beginSection("SqlStatement.bindString");
        try {
            try {
                int length = bArr.length;
                char[] cArr = new char[length];
                for (int i = 0; i < length; i++) {
                    cArr[i] = (char) bArr[i];
                }
                this.c.add(new String(cArr));
                this.b.add(new String(cArr));
                statusA = Status.b;
            } catch (Exception e) {
                ((eksl) ((eksl) ((eksl) a.j()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatementShared", "bindString", 49, "SqlStatementShared.java")).q("Error binding string to SqlStatement.");
                statusA = epqv.a(e);
            }
            return statusA;
        } finally {
            Trace.endSection();
        }
    }

    public final void c() {
        this.b.clear();
        this.c.clear();
    }
}
