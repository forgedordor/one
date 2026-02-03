package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bjqs extends dqpd {
    public MessageIdType a;
    public MessageIdType b;
    public long c;
    public MessagesTable.BindData d;
    public String e;
    public int f;
    public String g;
    public String h;
    public String i;
    public String j;
    public ParticipantsTable.BindData k;
    public String[] l;
    public String[] m;
    public Uri[] n;
    public String[] o;
    public String[] p;
    public long[] q;
    public long[] r;
    public PartsTable.BindData[] s;
    public String t;
    public long u;
    public String v;
    public String w;
    public boolean x;
    public bpvd y;

    protected bjqs() {
        MessageIdType messageIdType = bary.a;
        this.a = messageIdType;
        this.b = messageIdType;
        this.c = 0L;
        this.f = -2;
        this.u = 0L;
        this.x = false;
    }

    private final String[] h() {
        aA(9, "_id");
        return this.l;
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "MessageRepliesView [message_replies.message_replies_message_id: %s,\n  messages.messages__id: %s,\n  messages.messages_received_timestamp: %s,\n  participants.participants__id: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s,\n  participants.participants_first_name: %s,\n  parts.parts__id: %s,\n  parts.parts_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  parts.parts_file_name: %s,\n  parts.parts_duration: %s,\n  parts.parts_rowid: %s,\n  link_preview.link_preview_trigger_url: %s,\n  link_preview.link_preview_expiration_time_millis: %s,\n  link_preview.link_preview_link_title: %s,\n  link_preview.link_preview_link_image_url: %s,\n  link_preview.link_preview_link_preview_failed: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), aM(this.l), aM(this.m), aL(this.n), aM(this.o), aM(this.p), aK(this.q), aK(this.r), String.valueOf(this.t), String.valueOf(this.u), String.valueOf(this.v), String.valueOf(this.w), String.valueOf(this.x));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        bkgf.b().intValue();
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bkgc bkgcVar = (bkgc) dqqjVar;
        aC();
        this.cN = bkgcVar.cV();
        if (bkgcVar.dj(0)) {
            this.a = new MessageIdType(bkgcVar.getLong(bkgcVar.cO(0, bkgf.a)));
            fN(0);
        }
        if (bkgcVar.dj(1)) {
            this.b = new MessageIdType(bkgcVar.getLong(bkgcVar.cO(1, bkgf.a)));
            fN(1);
        }
        if (bkgcVar.dj(2)) {
            this.c = bkgcVar.getLong(bkgcVar.cO(2, bkgf.a));
            fN(2);
        }
        if (bkgcVar.dj(3)) {
            this.e = bkgcVar.getString(bkgcVar.cO(3, bkgf.a));
            fN(3);
        }
        if (bkgcVar.dj(4)) {
            this.f = bkgcVar.getInt(bkgcVar.cO(4, bkgf.a));
            fN(4);
        }
        if (bkgcVar.dj(5)) {
            this.g = cssb.a(bkgcVar.getString(bkgcVar.cO(5, bkgf.a)));
            fN(5);
        }
        if (bkgcVar.dj(6)) {
            this.h = cssb.a(bkgcVar.getString(bkgcVar.cO(6, bkgf.a)));
            fN(6);
        }
        if (bkgcVar.dj(7)) {
            this.i = cssq.a(bkgcVar.getString(bkgcVar.cO(7, bkgf.a)));
            fN(7);
        }
        if (bkgcVar.dj(8)) {
            this.j = cssq.a(bkgcVar.getString(bkgcVar.cO(8, bkgf.a)));
            fN(8);
        }
        if (bkgcVar.dj(9)) {
            this.l = (String[]) dqru.D(null, bkgc.du(bkgcVar.getString(bkgcVar.cO(9, bkgf.a))), new String[0]);
            fN(9);
        }
        if (bkgcVar.dj(10)) {
            String[] strArrDu = bkgc.du(bkgcVar.getString(bkgcVar.cO(10, bkgf.a)));
            for (int i = 0; i < strArrDu.length; i++) {
                strArrDu[i] = cssq.a(strArrDu[i]);
            }
            this.m = (String[]) dqru.D(null, strArrDu, new String[0]);
            fN(10);
        }
        if (bkgcVar.dj(11)) {
            String[] strArrDu2 = bkgc.du(bkgcVar.getString(bkgcVar.cO(11, bkgf.a)));
            int length = strArrDu2.length;
            Uri[] uriArr = new Uri[length];
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                String str = strArrDu2[i2];
                int i4 = i3 + 1;
                uriArr[i3] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                i2++;
                i3 = i4;
            }
            this.n = (Uri[]) dqru.D(null, uriArr, new Uri[0]);
            fN(11);
        }
        if (bkgcVar.dj(12)) {
            this.o = (String[]) dqru.D(null, bkgc.du(bkgcVar.getString(bkgcVar.cO(12, bkgf.a))), new String[0]);
            fN(12);
        }
        if (bkgcVar.dj(13)) {
            this.p = (String[]) dqru.D(null, bkgc.du(bkgcVar.getString(bkgcVar.cO(13, bkgf.a))), new String[0]);
            fN(13);
        }
        if (bkgcVar.dj(14)) {
            this.q = dqru.C(null, bkgc.dt(bkgcVar.getString(bkgcVar.cO(14, bkgf.a))));
            fN(14);
        }
        if (bkgcVar.dj(15)) {
            this.r = dqru.C(null, bkgc.dt(bkgcVar.getString(bkgcVar.cO(15, bkgf.a))));
            fN(15);
        }
        if (bkgcVar.dj(16)) {
            this.t = bkgcVar.getString(bkgcVar.cO(16, bkgf.a));
            fN(16);
        }
        if (bkgcVar.dj(17)) {
            this.u = bkgcVar.getLong(bkgcVar.cO(17, bkgf.a));
            fN(17);
        }
        if (bkgcVar.dj(18)) {
            this.v = cssq.a(bkgcVar.getString(bkgcVar.cO(18, bkgf.a)));
            fN(18);
        }
        if (bkgcVar.dj(19)) {
            this.w = bkgcVar.getString(bkgcVar.cO(19, bkgf.a));
            fN(19);
        }
        if (bkgcVar.dj(20)) {
            this.x = bkgcVar.getInt(bkgcVar.cO(20, bkgf.a)) == 1;
            fN(20);
        }
        g();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bjqs)) {
            return false;
        }
        bjqs bjqsVar = (bjqs) obj;
        return super.aE(bjqsVar.cN) && Objects.equals(this.a, bjqsVar.a) && Objects.equals(this.b, bjqsVar.b) && this.c == bjqsVar.c && Objects.equals(this.e, bjqsVar.e) && this.f == bjqsVar.f && Objects.equals(this.g, bjqsVar.g) && Objects.equals(this.h, bjqsVar.h) && Objects.equals(this.i, bjqsVar.i) && Objects.equals(this.j, bjqsVar.j) && Arrays.equals(this.l, bjqsVar.l) && Arrays.equals(this.m, bjqsVar.m) && Arrays.equals(this.n, bjqsVar.n) && Arrays.equals(this.o, bjqsVar.o) && Arrays.equals(this.p, bjqsVar.p) && Arrays.equals(this.q, bjqsVar.q) && Arrays.equals(this.r, bjqsVar.r) && Objects.equals(this.t, bjqsVar.t) && this.u == bjqsVar.u && Objects.equals(this.v, bjqsVar.v) && Objects.equals(this.w, bjqsVar.w) && this.x == bjqsVar.x;
    }

    public final MessageIdType f() {
        aA(0, "message_id");
        return this.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjqs.g():void");
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, Long.valueOf(this.c), this.e, Integer.valueOf(this.f), this.g, this.h, this.i, this.j, Integer.valueOf(Arrays.hashCode(this.l)), Integer.valueOf(Arrays.hashCode(this.m)), Integer.valueOf(Arrays.hashCode(this.n)), Integer.valueOf(Arrays.hashCode(this.o)), Integer.valueOf(Arrays.hashCode(this.p)), Integer.valueOf(Arrays.hashCode(this.q)), Integer.valueOf(Arrays.hashCode(this.r)), this.t, Long.valueOf(this.u), this.v, this.w, Boolean.valueOf(this.x), null);
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "MessageRepliesView -- REDACTED") : a();
    }
}
