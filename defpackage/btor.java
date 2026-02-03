package defpackage;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import defpackage.dqpd;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class btor extends dqpd implements dqpf {
    public long a;
    public aiaa g;
    public long h;
    public aiay k;
    public boolean l;
    public Optional b = basg.a;
    public aiba c = aiba.b(0);
    public aiaf d = aiaf.b(0);
    public Instant e = Instant.EPOCH;
    public Instant f = Instant.EPOCH;
    public Instant i = Instant.EPOCH;
    public Instant j = Instant.EPOCH;

    protected btor() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "RestoreWorkflowExecutionsTable [_id: %s,\n  session_id: %s,\n  feature: %s,\n  status: %s,\n  start_time: %s,\n  finish_time: %s,\n  backup_database_metadata: %s,\n  initial_messages_version: %s,\n  status_timestamp: %s,\n  last_attachment_request_timestamp: %s,\n  config: %s,\n  cleaned_up: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = btqy.c().intValue();
        Optional optional = this.b;
        if (optional == null) {
            contentValues.putNull("session_id");
        } else {
            contentValues.put("session_id", basg.b(optional));
        }
        aiba aibaVar = this.c;
        if (aibaVar == null) {
            contentValues.putNull("feature");
        } else {
            contentValues.put("feature", Integer.valueOf(aibaVar.e));
        }
        aiaf aiafVar = this.d;
        if (aiafVar == null) {
            contentValues.putNull("status");
        } else {
            contentValues.put("status", Integer.valueOf(aiafVar.q));
        }
        Instant instant = this.e;
        if (instant == null) {
            contentValues.putNull("start_time");
        } else {
            contentValues.put("start_time", Long.valueOf(bart.a(instant)));
        }
        Instant instant2 = this.f;
        if (instant2 == null) {
            contentValues.putNull("finish_time");
        } else {
            contentValues.put("finish_time", Long.valueOf(bart.a(instant2)));
        }
        aiaa aiaaVar = this.g;
        if (aiaaVar == null) {
            contentValues.putNull("backup_database_metadata");
        } else {
            contentValues.put("backup_database_metadata", aiaaVar.toByteArray());
        }
        if (iIntValue >= 60110) {
            contentValues.put("initial_messages_version", Long.valueOf(this.h));
        }
        if (iIntValue >= 60220) {
            Instant instant3 = this.i;
            if (instant3 == null) {
                contentValues.putNull("status_timestamp");
            } else {
                contentValues.put("status_timestamp", Long.valueOf(bart.a(instant3)));
            }
        }
        if (iIntValue >= 60330) {
            Instant instant4 = this.j;
            if (instant4 == null) {
                contentValues.putNull("last_attachment_request_timestamp");
            } else {
                contentValues.put("last_attachment_request_timestamp", Long.valueOf(bart.a(instant4)));
            }
        }
        if (iIntValue >= 60730) {
            aiay aiayVar = this.k;
            if (aiayVar == null) {
                contentValues.putNull("config");
            } else {
                contentValues.put("config", aiayVar.toByteArray());
            }
        }
        if (iIntValue >= 60760) {
            contentValues.put("cleaned_up", Boolean.valueOf(this.l));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        btqk btqkVar = (btqk) ((btpx) dqqjVar);
        aC();
        this.cN = btqkVar.cV();
        if (btqkVar.dj(0)) {
            this.a = btqkVar.c();
            fN(0);
        }
        if (btqkVar.dj(1)) {
            this.b = btqkVar.n();
            fN(1);
        }
        if (btqkVar.dj(2)) {
            this.c = btqkVar.i();
            fN(2);
        }
        if (btqkVar.dj(3)) {
            this.d = btqkVar.g();
            fN(3);
        }
        if (btqkVar.dj(4)) {
            this.e = btqkVar.l();
            fN(4);
        }
        if (btqkVar.dj(5)) {
            this.f = btqkVar.j();
            fN(5);
        }
        if (btqkVar.dj(6)) {
            this.g = btqkVar.f();
            fN(6);
        }
        if (btqkVar.dj(7)) {
            this.h = btqkVar.e();
            fN(7);
        }
        if (btqkVar.dj(8)) {
            this.i = btqkVar.m();
            fN(8);
        }
        if (btqkVar.dj(9)) {
            this.j = btqkVar.k();
            fN(9);
        }
        if (btqkVar.dj(10)) {
            this.k = btqkVar.h();
            fN(10);
        }
        if (btqkVar.dj(11)) {
            this.l = btqkVar.o();
            fN(11);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof btor)) {
            return false;
        }
        btor btorVar = (btor) obj;
        return super.aE(btorVar.cN) && this.a == btorVar.a && Objects.equals(this.b, btorVar.b) && this.c == btorVar.c && this.d == btorVar.d && Objects.equals(this.e, btorVar.e) && Objects.equals(this.f, btorVar.f) && Objects.equals(this.g, btorVar.g) && this.h == btorVar.h && Objects.equals(this.i, btorVar.i) && Objects.equals(this.j, btorVar.j) && Objects.equals(this.k, btorVar.k) && this.l == btorVar.l;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "restore_workflow_executions", dqru.m(new String[]{"session_id", "feature", "status", "start_time", "finish_time", "backup_database_metadata", "initial_messages_version", "status_timestamp", "last_attachment_request_timestamp", "config", "cleaned_up"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "restore_workflow_executions";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, Long.valueOf(this.h), this.i, this.j, this.k, Boolean.valueOf(this.l), null);
    }

    @Override // defpackage.dqpf
    public final void i(StringBuilder sb, List list) {
        String strB = basg.b(this.b);
        aiba aibaVar = this.c;
        Object objValueOf = aibaVar == null ? 0 : String.valueOf(aibaVar.e);
        aiaf aiafVar = this.d;
        Object objValueOf2 = aiafVar != null ? String.valueOf(aiafVar.q) : 0;
        Long lValueOf = Long.valueOf(bart.a(this.e));
        Long lValueOf2 = Long.valueOf(bart.a(this.f));
        aiaa aiaaVar = this.g;
        byte[] byteArray = aiaaVar == null ? null : aiaaVar.toByteArray();
        Long lValueOf3 = Long.valueOf(this.h);
        Long lValueOf4 = Long.valueOf(bart.a(this.i));
        Long lValueOf5 = Long.valueOf(bart.a(this.j));
        aiay aiayVar = this.k;
        Object[] objArr = {strB, objValueOf, objValueOf2, lValueOf, lValueOf2, byteArray, lValueOf3, lValueOf4, lValueOf5, aiayVar != null ? aiayVar.toByteArray() : null, Integer.valueOf(this.l ? 1 : 0)};
        sb.append('(');
        for (int i = 0; i < 11; i++) {
            Object obj = objArr[i];
            if (obj instanceof Number) {
                sb.append(String.valueOf(obj));
            } else {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.length() < 12) {
                        sb.append(DatabaseUtils.sqlEscapeString(str));
                    }
                }
                list.add(obj);
                sb.append('?');
                sb.append(',');
            }
            sb.append(',');
        }
        sb.setLength(sb.length() - 1);
        sb.append(')');
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final long k() {
        aA(0, "_id");
        return this.a;
    }

    public final aiaa m() {
        aA(6, "backup_database_metadata");
        return this.g;
    }

    public final aiaf n() {
        aA(3, "status");
        return this.d;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "RestoreWorkflowExecutionsTable -- REDACTED") : a();
    }
}
