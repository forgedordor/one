package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bufi extends dqpd implements dqpf {
    public long a;
    public String b;
    public String e;
    public String f;
    public String g;
    public String j;
    public int c = -1;
    public int d = 4;
    public long h = -1;
    public int i = 0;

    protected bufi() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "StickerSetsTable [_id: %s,\n  sticker_set_id: %s,\n  local_version: %s,\n  download_state: %s,\n  icon_uri: %s,\n  display_name: %s,\n  preview_image_uri: %s,\n  requested_timestamp: %s,\n  display_order: %s,\n  author: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.v(contentValues, "sticker_set_id", this.b);
        contentValues.put("local_version", Integer.valueOf(this.c));
        contentValues.put("download_state", Integer.valueOf(this.d));
        dqru.v(contentValues, "icon_uri", this.e);
        dqru.v(contentValues, "display_name", this.f);
        dqru.v(contentValues, "preview_image_uri", this.g);
        contentValues.put("requested_timestamp", Long.valueOf(this.h));
        contentValues.put("display_order", Integer.valueOf(this.i));
        dqru.v(contentValues, "author", this.j);
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bugt bugtVar = (bugt) ((bugi) dqqjVar);
        aC();
        this.cN = bugtVar.cV();
        if (bugtVar.dj(0)) {
            this.a = bugtVar.g();
            fN(0);
        }
        if (bugtVar.dj(1)) {
            this.b = bugtVar.m();
            fN(1);
        }
        if (bugtVar.dj(2)) {
            this.c = bugtVar.f();
            fN(2);
        }
        if (bugtVar.dj(3)) {
            this.d = bugtVar.e();
            fN(3);
        }
        if (bugtVar.dj(4)) {
            this.e = bugtVar.k();
            fN(4);
        }
        if (bugtVar.dj(5)) {
            this.f = bugtVar.j();
            fN(5);
        }
        if (bugtVar.dj(6)) {
            this.g = bugtVar.l();
            fN(6);
        }
        if (bugtVar.dj(7)) {
            this.h = bugtVar.h();
            fN(7);
        }
        if (bugtVar.dj(8)) {
            this.i = bugtVar.c();
            fN(8);
        }
        if (bugtVar.dj(9)) {
            this.j = bugtVar.i();
            fN(9);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bufi)) {
            return false;
        }
        bufi bufiVar = (bufi) obj;
        return super.aE(bufiVar.cN) && this.a == bufiVar.a && Objects.equals(this.b, bufiVar.b) && this.c == bufiVar.c && this.d == bufiVar.d && Objects.equals(this.e, bufiVar.e) && Objects.equals(this.f, bufiVar.f) && Objects.equals(this.g, bufiVar.g) && this.h == bufiVar.h && this.i == bufiVar.i && Objects.equals(this.j, bufiVar.j);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "sticker_sets", dqru.m(new String[]{"sticker_set_id", "local_version", "download_state", "icon_uri", "display_name", "preview_image_uri", "requested_timestamp", "display_order", "author"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "sticker_sets";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f, this.g, Long.valueOf(this.h), Integer.valueOf(this.i), this.j, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006e  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r13, java.util.List r14) {
        /*
            r12 = this;
            java.lang.String r0 = r12.b
            int r1 = r12.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r12.d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = r12.e
            java.lang.String r4 = r12.f
            java.lang.String r5 = r12.g
            long r6 = r12.h
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            int r7 = r12.i
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = r12.j
            r9 = 9
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r11 = 0
            r10[r11] = r0
            r0 = 1
            r10[r0] = r1
            r0 = 2
            r10[r0] = r2
            r0 = 3
            r10[r0] = r3
            r0 = 4
            r10[r0] = r4
            r0 = 5
            r10[r0] = r5
            r0 = 6
            r10[r0] = r6
            r0 = 7
            r10[r0] = r7
            r0 = 8
            r10[r0] = r8
            r0 = 40
            r13.append(r0)
        L47:
            if (r11 >= r9) goto L7e
            r0 = r10[r11]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L57
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r13.append(r0)
            goto L76
        L57:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L6e
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r3 = 12
            if (r2 >= r3) goto L6e
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r13.append(r0)
            goto L76
        L6e:
            r14.add(r0)
            r0 = 63
            r13.append(r0)
        L76:
            r0 = 44
            r13.append(r0)
            int r11 = r11 + 1
            goto L47
        L7e:
            int r14 = r13.length()
            int r14 = r14 + (-1)
            r13.setLength(r14)
            r14 = 41
            r13.append(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bufi.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "StickerSetsTable -- REDACTED") : a();
    }
}
