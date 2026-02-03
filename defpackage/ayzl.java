package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class ayzl extends dqpd implements dqpf {
    public long a;
    public String c;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public MessageIdType b = bary.a;
    public long d = 0;

    protected ayzl() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "BackupLinkPreviewTable [_id: %s,\n  message_id: %s,\n  trigger_url: %s,\n  expiration_time_millis: %s,\n  link_title: %s,\n  link_description: %s,\n  link_image_url: %s,\n  link_domain: %s,\n  link_canonical_url: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        MessageIdType messageIdType = this.b;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.b)));
        }
        dqru.v(contentValues, "trigger_url", this.c);
        contentValues.put("expiration_time_millis", Long.valueOf(this.d));
        dqru.v(contentValues, "link_title", this.e);
        dqru.v(contentValues, "link_description", this.f);
        dqru.v(contentValues, "link_image_url", this.g);
        dqru.v(contentValues, "link_domain", this.h);
        dqru.v(contentValues, "link_canonical_url", this.i);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        azau azauVar = (azau) ((azak) dqqjVar);
        aC();
        this.cN = azauVar.cV();
        if (azauVar.dj(0)) {
            this.a = azauVar.e();
            fN(0);
        }
        if (azauVar.dj(1)) {
            this.b = azauVar.f();
            fN(1);
        }
        if (azauVar.dj(2)) {
            this.c = azauVar.l();
            fN(2);
        }
        if (azauVar.dj(3)) {
            this.d = azauVar.c();
            fN(3);
        }
        if (azauVar.dj(4)) {
            this.e = azauVar.k();
            fN(4);
        }
        if (azauVar.dj(5)) {
            this.f = azauVar.h();
            fN(5);
        }
        if (azauVar.dj(6)) {
            this.g = azauVar.j();
            fN(6);
        }
        if (azauVar.dj(7)) {
            this.h = azauVar.i();
            fN(7);
        }
        if (azauVar.dj(8)) {
            this.i = azauVar.g();
            fN(8);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ayzl)) {
            return false;
        }
        ayzl ayzlVar = (ayzl) obj;
        return super.aE(ayzlVar.cN) && this.a == ayzlVar.a && Objects.equals(this.b, ayzlVar.b) && Objects.equals(this.c, ayzlVar.c) && this.d == ayzlVar.d && Objects.equals(this.e, ayzlVar.e) && Objects.equals(this.f, ayzlVar.f) && Objects.equals(this.g, ayzlVar.g) && Objects.equals(this.h, ayzlVar.h) && Objects.equals(this.i, ayzlVar.i);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "link_preview_backup", dqru.m(new String[]{"message_id", "trigger_url", "expiration_time_millis", "link_title", "link_description", "link_image_url", "link_domain", "link_canonical_url"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "link_preview_backup";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, this.c, Long.valueOf(this.d), this.e, this.f, this.g, this.h, this.i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r12, java.util.List r13) {
        /*
            r11 = this;
            ayzk r0 = new ayzk
            r0.<init>(r11)
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = r11.c
            long r2 = r11.d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.String r3 = r11.e
            java.lang.String r4 = r11.f
            java.lang.String r5 = r11.g
            java.lang.String r6 = r11.h
            java.lang.String r7 = r11.i
            r8 = 8
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r10 = 0
            r9[r10] = r0
            r0 = 1
            r9[r0] = r1
            r0 = 2
            r9[r0] = r2
            r0 = 3
            r9[r0] = r3
            r0 = 4
            r9[r0] = r4
            r0 = 5
            r9[r0] = r5
            r0 = 6
            r9[r0] = r6
            r0 = 7
            r9[r0] = r7
            r0 = 40
            r12.append(r0)
        L3c:
            if (r10 >= r8) goto L73
            r0 = r9[r10]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L4c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r12.append(r0)
            goto L6b
        L4c:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L63
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L63
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r12.append(r0)
            goto L6b
        L63:
            r13.add(r0)
            r0 = 63
            r12.append(r0)
        L6b:
            r0 = 44
            r12.append(r0)
            int r10 = r10 + 1
            goto L3c
        L73:
            int r13 = r12.length()
            int r13 = r13 + (-1)
            r12.setLength(r13)
            r13 = 41
            r12.append(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ayzl.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "BackupLinkPreviewTable -- REDACTED") : a();
    }
}
