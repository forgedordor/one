package defpackage;

import android.database.SQLException;
import com.google.communication.synapse.security.scytale.DbWrapperInterface;
import com.google.communication.synapse.security.scytale.EventPublisher;
import com.google.communication.synapse.security.scytale.SqlStatementInterface;
import com.google.communication.synapse.security.scytale.SqlTransactionInterface;
import com.google.communication.synapse.security.scytale.WriteOnlySqlStatementInterface;
import com.google.media.webrtc.common.StatusOr;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwlt extends DbWrapperInterface {
    private static final cqce a = cqce.g("BugleDatabase", "ScytaleDBWrapper");
    private final fcsu b;
    private final fcsu c;

    public bwlt(fcsu fcsuVar, fcsu fcsuVar2) {
        this.b = fcsuVar;
        this.c = fcsuVar2;
    }

    private static Status a(Status status, String str) {
        return str == null ? status : status.withDescription(str);
    }

    @Override // com.google.communication.synapse.security.scytale.DbWrapperInterface
    public final Status execute(String str) throws SQLException {
        try {
            for (String str2 : str.split(";", -1)) {
                String strTrim = str2.trim();
                if (!strTrim.isEmpty()) {
                    ((dqsy) this.b.b()).h().execSQL(strTrim);
                }
            }
            return Status.b;
        } catch (Exception e) {
            a.s("Error executing SQL statement.", e);
            return a(Status.o, e.getMessage());
        }
    }

    @Override // com.google.communication.synapse.security.scytale.DbWrapperInterface
    public final Status open(EventPublisher eventPublisher, String str) {
        return Status.b;
    }

    @Override // com.google.communication.synapse.security.scytale.DbWrapperInterface
    public final StatusOr<SqlStatementInterface> prepare(String str) {
        try {
            return StatusOr.fromValue(new epqw((bwlu) this.c.b(), str));
        } catch (Exception e) {
            a.o("Error preparing SQL statement.", e);
            return StatusOr.fromStatus(a(Status.o, e.getMessage()));
        }
    }

    @Override // com.google.communication.synapse.security.scytale.DbWrapperInterface
    public final StatusOr<WriteOnlySqlStatementInterface> prepareWriteOnly(String str) {
        try {
            return StatusOr.fromValue(new epqz((bwlu) this.c.b(), str));
        } catch (Exception e) {
            a.o("Error preparing write SQL statement.", e);
            return StatusOr.fromStatus(a(Status.o, e.getMessage()));
        }
    }

    @Override // com.google.communication.synapse.security.scytale.DbWrapperInterface
    public final StatusOr<SqlTransactionInterface> startTransaction() {
        try {
            return StatusOr.fromValue(new epqy((bwlu) this.c.b()));
        } catch (Exception e) {
            a.o("Error starting SQL transaction.", e);
            return StatusOr.fromStatus(a(Status.o, e.getMessage()));
        }
    }

    @Override // com.google.communication.synapse.security.scytale.DbWrapperInterface
    public final void close() {
    }
}
