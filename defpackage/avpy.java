package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.dqpd;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class avpy extends dqpd implements dqpf {
    public long a;
    public long b;
    public String c;
    public ConversationIdType d = barn.a;

    protected avpy() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "ConversationMatcherCacheTable [_id: %s,\n  matcher_version: %s,\n  destination_key: %s,\n  conversation_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        contentValues.put("matcher_version", Long.valueOf(this.b));
        dqru.v(contentValues, "destination_key", this.c);
        ConversationIdType conversationIdType = this.d;
        if (conversationIdType == null || conversationIdType.equals(barn.a)) {
            contentValues.putNull("conversation_id");
        } else {
            contentValues.put("conversation_id", Long.valueOf(barn.a(this.d)));
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        avqs avqsVar = (avqs) ((avqn) dqqjVar);
        aC();
        this.cN = avqsVar.cV();
        if (avqsVar.dj(0)) {
            this.a = avqsVar.e();
            fN(0);
        }
        if (avqsVar.dj(1)) {
            this.b = avqsVar.f();
            fN(1);
        }
        if (avqsVar.dj(2)) {
            this.c = avqsVar.h();
            fN(2);
        }
        if (avqsVar.dj(3)) {
            this.d = avqsVar.g();
            fN(3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof avpy)) {
            return false;
        }
        avpy avpyVar = (avpy) obj;
        return super.aE(avpyVar.cN) && this.a == avpyVar.a && this.b == avpyVar.b && Objects.equals(this.c, avpyVar.c) && Objects.equals(this.d, avpyVar.d);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "conversation_matcher_cache", dqru.m(new String[]{"matcher_version", "destination_key", "conversation_id"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "conversation_matcher_cache";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, Long.valueOf(this.a), Long.valueOf(this.b), this.c, this.d, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r8, java.util.List r9) {
        /*
            r7 = this;
            long r0 = r7.b
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.String r1 = r7.c
            avpx r2 = new avpx
            r2.<init>(r7)
            java.lang.Object r2 = r2.get()
            r3 = 3
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r2
            r0 = 40
            r8.append(r0)
        L22:
            if (r5 >= r3) goto L59
            r0 = r4[r5]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L32
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L51
        L32:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L49
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r6 = 12
            if (r2 >= r6) goto L49
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L51
        L49:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L51:
            r0 = 44
            r8.append(r0)
            int r5 = r5 + 1
            goto L22
        L59:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avpy.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "ConversationMatcherCacheTable -- REDACTED") : a();
    }
}
