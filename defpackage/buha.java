package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class buha extends dqpd implements dqpf {
    public String a;
    public String b;
    public String c;
    public String d;
    public long e;

    protected buha() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "StickersLocalizationTable [sticker_set_id: %s,\n  sticker_id: %s,\n  locale: %s,\n  display_name: %s,\n  sticker_local_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "sticker_set_id", this.a);
        dqru.v(contentValues, "sticker_id", this.b);
        dqru.v(contentValues, "locale", this.c);
        dqru.v(contentValues, "display_name", this.d);
        dqru.u(contentValues, "sticker_local_id", this.e);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        buhy buhyVar = (buhy) ((buhs) dqqjVar);
        aC();
        this.cN = buhyVar.cV();
        if (buhyVar.dj(0)) {
            this.a = buhyVar.h();
            fN(0);
        }
        if (buhyVar.dj(1)) {
            this.b = buhyVar.g();
            fN(1);
        }
        if (buhyVar.dj(2)) {
            this.c = buhyVar.f();
            fN(2);
        }
        if (buhyVar.dj(3)) {
            this.d = buhyVar.e();
            fN(3);
        }
        if (buhyVar.dj(4)) {
            this.e = buhyVar.c();
            fN(4);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof buha)) {
            return false;
        }
        buha buhaVar = (buha) obj;
        return super.aE(buhaVar.cN) && Objects.equals(this.a, buhaVar.a) && Objects.equals(this.b, buhaVar.b) && Objects.equals(this.c, buhaVar.c) && Objects.equals(this.d, buhaVar.d) && this.e == buhaVar.e;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "stickers_localization", dqru.m(new String[]{"sticker_set_id", "sticker_id", "locale", "display_name", "sticker_local_id"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "stickers_localization";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, this.d, Long.valueOf(this.e), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r9, java.util.List r10) {
        /*
            r8 = this;
            java.lang.String r0 = r8.a
            java.lang.String r1 = r8.b
            java.lang.String r2 = r8.c
            java.lang.String r3 = r8.d
            long r4 = r8.e
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 5
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r7 = 0
            r6[r7] = r0
            r0 = 1
            r6[r0] = r1
            r0 = 2
            r6[r0] = r2
            r0 = 3
            r6[r0] = r3
            r0 = 4
            r6[r0] = r4
            r0 = 40
            r9.append(r0)
        L25:
            if (r7 >= r5) goto L5c
            r0 = r6[r7]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L35
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9.append(r0)
            goto L54
        L35:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L4c
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L4c
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r9.append(r0)
            goto L54
        L4c:
            r10.add(r0)
            r0 = 63
            r9.append(r0)
        L54:
            r0 = 44
            r9.append(r0)
            int r7 = r7 + 1
            goto L25
        L5c:
            int r10 = r9.length()
            int r10 = r10 + (-1)
            r9.setLength(r10)
            r10 = 41
            r9.append(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buha.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "StickersLocalizationTable -- REDACTED") : a();
    }
}
