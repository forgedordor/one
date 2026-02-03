package defpackage;

import android.database.Cursor;
import android.os.Trace;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.communication.synapse.security.scytale.SqlStatementInterface;
import com.google.media.webrtc.common.StatusOr;
import io.grpc.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epqw extends SqlStatementInterface {
    private static final eksp b = eksp.c("SqlStatement");
    private final String c;
    private final bwlu f;
    final epqx a = new epqx();
    private Cursor d = null;
    private boolean e = false;

    public epqw(bwlu bwluVar, String str) {
        this.f = bwluVar;
        this.c = str;
    }

    @Override // com.google.communication.synapse.security.scytale.SqlStatementInterface
    public final Status bindInt(long j) {
        return this.a.a(j);
    }

    @Override // com.google.communication.synapse.security.scytale.SqlStatementInterface
    public final Status bindString(byte[] bArr) {
        return this.a.b(bArr);
    }

    @Override // com.google.communication.synapse.security.scytale.SqlStatementInterface
    public final void close() {
        Trace.beginSection("SqlStatement.close");
        try {
            try {
                Cursor cursor = this.d;
                if (cursor != null) {
                    cursor.close();
                    this.d = null;
                }
            } catch (Exception e) {
                ((eksl) ((eksl) ((eksl) b.j()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "close", 217, "SqlStatement.java")).q("Error closing cursor in SqlStatement.");
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.communication.synapse.security.scytale.SqlStatementInterface
    public final Status execute() {
        Status statusA;
        epqx epqxVar;
        bwlu bwluVar = this.f;
        if (bwluVar == null) {
            ((eksl) ((eksl) b.i()).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "execute", 78, "SqlStatement.java")).q("DBWrapper must be not null.");
            return Status.l;
        }
        String str = this.c;
        if (str == null) {
            ((eksl) ((eksl) b.i()).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "execute", 82, "SqlStatement.java")).q("sql must be not null.");
            return Status.e;
        }
        Trace.beginSection("SqlStatement.execute");
        try {
            try {
                ((eksl) b.n().h("com/google/communication/synapse/security/scytale/store/SqlStatement", "execute", 87, "SqlStatement.java")).t("executing sql stmt: %s", str);
                epqxVar = this.a;
            } catch (Exception e) {
                ((eksl) ((eksl) ((eksl) b.i()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "execute", 96, "SqlStatement.java")).t("Error executing sql statement %s.", this.c);
                statusA = epqv.a(e);
            }
            if (epqxVar.d) {
                throw new IllegalStateException("getString can't be called after bindBlob was invoked");
            }
            List list = epqxVar.c;
            Cursor cursorRawQuery = ((dqsy) bwluVar.a.b()).h().rawQuery(str, (String[]) list.toArray(new String[list.size()]));
            this.d = cursorRawQuery;
            this.e = cursorRawQuery.moveToFirst();
            statusA = Status.b;
            return statusA;
        } finally {
            Trace.endSection();
        }
    }

    protected final void finalize() {
        if (this.d != null) {
            ((eksl) ((eksl) b.i()).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "finalize", 240, "SqlStatement.java")).t("Found an unclosed statement %s.", new esvh(esvg.NO_USER_DATA, this.c));
            close();
        }
    }

    @Override // com.google.communication.synapse.security.scytale.SqlStatementInterface
    public final StatusOr<byte[]> getBlob(int i) {
        StatusOr<byte[]> statusOrFromStatus;
        if (this.d == null) {
            ((eksl) ((eksl) b.i()).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "getBlob", 192, "SqlStatement.java")).q("execute must be called first.");
            return StatusOr.fromStatus(Status.l.withDescription("getBlob(): execute must be called first"));
        }
        Trace.beginSection("SqlStatement.getBlob");
        try {
            try {
                statusOrFromStatus = StatusOr.fromValue(this.d.getBlob(i));
            } catch (Exception e) {
                ((eksl) ((eksl) ((eksl) b.i()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "getBlob", BasePaymentResult.ERROR_REQUEST_FAILED, "SqlStatement.java")).q("Error getting blob in SqlStatement.");
                statusOrFromStatus = StatusOr.fromStatus(epqv.a(e));
            }
            return statusOrFromStatus;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.communication.synapse.security.scytale.SqlStatementInterface
    public final StatusOr<Long> getInt(int i) {
        StatusOr<Long> statusOrFromStatus;
        if (this.d == null) {
            ((eksl) ((eksl) b.i()).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "getInt", 143, "SqlStatement.java")).q("execute must be called first.");
            return StatusOr.fromStatus(Status.l.withDescription("getInt(): execute must be called first"));
        }
        Trace.beginSection("SqlStatement.getInt");
        try {
            try {
                statusOrFromStatus = StatusOr.fromValue(Long.valueOf(this.d.getLong(i)));
            } catch (Exception e) {
                ((eksl) ((eksl) ((eksl) b.j()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "getInt", 151, "SqlStatement.java")).q("Error getting int in SqlStatement.");
                statusOrFromStatus = StatusOr.fromStatus(epqv.a(e));
            }
            return statusOrFromStatus;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.communication.synapse.security.scytale.SqlStatementInterface
    public final StatusOr<byte[]> getString(int i) {
        StatusOr<byte[]> statusOrFromStatus;
        if (this.d == null) {
            ((eksl) ((eksl) b.i()).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "getString", 164, "SqlStatement.java")).q("execute must be called first.");
            return StatusOr.fromStatus(Status.l.withDescription("getString(): execute must be called first"));
        }
        Trace.beginSection("SqlStatement.getString");
        try {
            try {
                char[] charArray = this.d.getString(i).toCharArray();
                byte[] bArr = new byte[charArray.length];
                for (int i2 = 0; i2 < charArray.length; i2++) {
                    bArr[i2] = (byte) charArray[i2];
                }
                statusOrFromStatus = StatusOr.fromValue(bArr);
            } catch (Exception e) {
                ((eksl) ((eksl) ((eksl) b.j()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "getString", 179, "SqlStatement.java")).q("Error getting string in SqlStatement.");
                statusOrFromStatus = StatusOr.fromStatus(epqv.a(e));
            }
            return statusOrFromStatus;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.communication.synapse.security.scytale.SqlStatementInterface
    public final boolean hasNext() {
        if (this.d != null) {
            return this.e;
        }
        ((eksl) ((eksl) b.i()).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "hasNext", 133, "SqlStatement.java")).q("hasNext(): execute must be called first.");
        return false;
    }

    @Override // com.google.communication.synapse.security.scytale.SqlStatementInterface
    public final Status moveNext() {
        Status statusA;
        if (this.d == null) {
            ((eksl) ((eksl) b.i()).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "moveNext", 110, "SqlStatement.java")).q("execute must be called first.");
            return Status.l.withDescription("moveNext(): execute must be called first.");
        }
        Trace.beginSection("SqlStatement.moveNext");
        try {
            try {
                this.e = this.d.moveToNext();
                statusA = Status.b;
            } catch (Exception e) {
                ((eksl) ((eksl) ((eksl) b.j()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatement", "moveNext", 119, "SqlStatement.java")).q("Error moving to next in SqlStatement.");
                statusA = epqv.a(e);
            }
            return statusA;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.communication.synapse.security.scytale.SqlStatementInterface
    public final void reset() {
        Trace.beginSection("SqlStatement.reset");
        try {
            this.a.c();
            close();
        } finally {
            Trace.endSection();
        }
    }
}
