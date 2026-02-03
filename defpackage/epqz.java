package defpackage;

import android.os.Trace;
import com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface;
import io.grpc.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class epqz extends WriteOnlySqlStatementInterface {
    private static final eksp b = eksp.c("SqlStatement");
    final epqx a = new epqx();
    private final String c;
    private final bwlu d;

    public epqz(bwlu bwluVar, String str) {
        this.d = bwluVar;
        this.c = str;
    }

    @Override // com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface
    public final Status bindBlob(byte[] bArr) {
        epqx epqxVar = this.a;
        if (bArr == null) {
            ((eksl) ((eksl) epqx.a.i()).h("com/google/communication/synapse/security/scytale/store/SqlStatementShared", "bindBlob", 58, "SqlStatementShared.java")).q("value can not be null.");
            return Status.e;
        }
        Trace.beginSection("SqlStatement.bindBlob");
        try {
            epqxVar.d = true;
            epqxVar.b.add(bArr);
            return Status.b;
        } catch (Exception e) {
            ((eksl) ((eksl) ((eksl) epqx.a.j()).g(e)).h("com/google/communication/synapse/security/scytale/store/SqlStatementShared", "bindBlob", 67, "SqlStatementShared.java")).q("Error binding string to SqlStatement.");
            return epqv.a(e);
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface
    public final Status bindInt(long j) {
        return this.a.a(j);
    }

    @Override // com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface
    public final Status bindString(byte[] bArr) {
        return this.a.b(bArr);
    }

    @Override // com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface
    public final Status executeWrite() {
        Status statusA;
        Trace.beginSection("WriteOnlySqlStatement.executeWrite");
        try {
            try {
                eksl ekslVar = (eksl) b.n().h("com/google/communication/synapse/security/scytale/store/WriteOnlySqlStatement", "executeWrite", 52, "WriteOnlySqlStatement.java");
                String str = this.c;
                ekslVar.t("executing write sql stmt: %s", str);
                bwlu bwluVar = this.d;
                List list = this.a.b;
                Object[] array = list.toArray(new Object[list.size()]);
                if (array == null) {
                    ((dqsy) bwluVar.a.b()).h().execSQL(str);
                } else {
                    ((dqsy) bwluVar.a.b()).h().execSQL(str, array);
                }
                statusA = Status.b;
            } catch (Exception e) {
                ((eksl) ((eksl) ((eksl) b.i()).g(e)).h("com/google/communication/synapse/security/scytale/store/WriteOnlySqlStatement", "executeWrite", 60, "WriteOnlySqlStatement.java")).t("Error executing sql statement %s.", this.c);
                statusA = epqv.a(e);
            }
            return statusA;
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface
    public final void reset() {
        Trace.beginSection("SqlStatement.reset");
        try {
            this.a.c();
        } finally {
            Trace.endSection();
        }
    }

    @Override // com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface
    public final void close() {
    }
}
