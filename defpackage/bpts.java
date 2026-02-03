package defpackage;

import android.content.ContentValues;
import defpackage.dqpd;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bpts extends dqpd implements dqpf {
    public String a;
    public long b;
    public long c = 0;

    protected bpts() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "LinkPreviewParticipantsTable [_id: %s,\n  participant_id: %s,\n  manual_link_preview_count: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        dqru.u(contentValues, "participant_id", this.b);
        contentValues.put("manual_link_preview_count", Long.valueOf(this.c));
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        bpuj bpujVar = (bpuj) ((bpuf) dqqjVar);
        aC();
        this.cN = bpujVar.cV();
        if (bpujVar.dj(0)) {
            this.a = bpujVar.g();
            fN(0);
        }
        if (bpujVar.dj(1)) {
            this.b = bpujVar.f();
            fN(1);
        }
        if (bpujVar.dj(2)) {
            this.c = bpujVar.e();
            fN(2);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bpts)) {
            return false;
        }
        bpts bptsVar = (bpts) obj;
        return super.aE(bptsVar.cN) && Objects.equals(this.a, bptsVar.a) && this.b == bptsVar.b && this.c == bptsVar.c;
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "link_preview_participants_table", dqru.m(new String[]{"participant_id", "manual_link_preview_count"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return "_id";
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "link_preview_participants_table";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, Long.valueOf(this.b), Long.valueOf(this.c), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
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
            long r1 = r7.c
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 40
            r8.append(r0)
        L1a:
            if (r4 >= r2) goto L51
            r0 = r3[r4]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L2a
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r8.append(r0)
            goto L49
        L2a:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L41
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r5 = r1.length()
            r6 = 12
            if (r5 >= r6) goto L41
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r8.append(r0)
            goto L49
        L41:
            r9.add(r0)
            r0 = 63
            r8.append(r0)
        L49:
            r0 = 44
            r8.append(r0)
            int r4 = r4 + 1
            goto L1a
        L51:
            int r9 = r8.length()
            int r9 = r9 + (-1)
            r8.setLength(r9)
            r9 = 41
            r8.append(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpts.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final long k() {
        aA(2, "manual_link_preview_count");
        return this.c;
    }

    @Deprecated
    public final Long m() {
        final dqsy dqsyVarA = bput.a();
        return Long.valueOf(dqru.b(bput.a(), "link_preview_participants_table", this, new Function() { // from class: bptq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Long.valueOf(dqsyVarA.O("link_preview_participants_table", (dqst) obj));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Consumer() { // from class: bptr
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                Long l = (Long) obj;
                if (l.longValue() >= 0) {
                    bpts bptsVar = this.a;
                    bptsVar.a = String.valueOf(l);
                    bptsVar.fN(0);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }));
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "LinkPreviewParticipantsTable -- REDACTED") : a();
    }
}
