package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bmib extends dqpd implements dqpf {
    public long a;
    public ConversationIdType b = barn.a;
    public int c = 0;

    protected bmib() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "AddContactBannerTable [_id: %s,\n  conversation_id: %s,\n  banner_status: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        ConversationIdType conversationIdType = this.b;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(this.b)));
        }
        contentValues.put("banner_status", Integer.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bmis bmisVar = (bmis) ((bmio) dqqjVar);
        aC();
        this.cN = bmisVar.cV();
        if (bmisVar.dj(0)) {
            this.a = bmisVar.e();
            fN(0);
        }
        if (bmisVar.dj(1)) {
            this.b = bmisVar.f();
            fN(1);
        }
        if (bmisVar.dj(2)) {
            this.c = bmisVar.c();
            fN(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmib)) {
            return false;
        }
        bmib bmibVar = (bmib) obj;
        return super.aE(bmibVar.cN) && this.a == bmibVar.a && Objects.equals(this.b, bmibVar.b) && this.c == bmibVar.c;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "add_contact_banner", dqru.m(new String[]{"conversation_id", "banner_status"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "add_contact_banner";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, Integer.valueOf(this.c), null);
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
            bmia r0 = new bmia
            r0.<init>(r7)
            java.lang.Object r0 = r0.get()
            int r1 = r7.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmib.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "AddContactBannerTable -- REDACTED") : a();
    }
}
