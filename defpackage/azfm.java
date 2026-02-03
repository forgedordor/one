package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class azfm extends dqpd implements dqpf {
    public long a;
    public MessageIdType b = bary.a;

    protected azfm() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "BackupMessageStarTable [_id: %s,\n  message_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        contentValues.put("_id", Long.valueOf(this.a));
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.b)));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        azga azgaVar = (azga) ((azfx) dqqjVar);
        aC();
        this.cN = azgaVar.cV();
        if (azgaVar.dj(0)) {
            this.a = azgaVar.c();
            fN(0);
        }
        if (azgaVar.dj(1)) {
            this.b = azgaVar.e();
            fN(1);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof azfm)) {
            return false;
        }
        azfm azfmVar = (azfm) obj;
        return super.aE(azfmVar.cN) && this.a == azfmVar.a && Objects.equals(this.b, azfmVar.b);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "message_star_backup", dqru.m(new String[]{"_id", "message_id"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "message_star_backup";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            long r0 = r7.a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            azfl r1 = new azfl
            r1.<init>(r7)
            java.lang.Object r1 = r1.get()
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 40
            r8.append(r0)
        L1d:
            if (r4 >= r2) goto L54
            r0 = r3[r4]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L2d
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L4c
        L2d:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L44
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r5 = r1.length()
            r6 = 12
            if (r5 >= r6) goto L44
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L4c
        L44:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L4c:
            r0 = 44
            r8.append(r0)
            int r4 = r4 + 1
            goto L1d
        L54:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azfm.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "BackupMessageStarTable -- REDACTED") : a();
    }
}
