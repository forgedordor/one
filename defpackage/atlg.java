package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import defpackage.dqpd;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class atlg extends dqpd implements dqpf {
    public athh a = null;
    public atmy b;
    public Uri c;
    public aubx d;
    public eyfn e;
    public String f;
    public aucj g;
    public epwc h;

    protected atlg() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        return String.format(Locale.US, "FileProcessingTable [processing_id: %s,\n  file_type: %s,\n  file_uri: %s,\n  content_type: %s,\n  encryption_metadata: %s,\n  transfer_handle: %s,\n  upload_result: %s,\n  mls_file_metadata: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = atmx.c().intValue();
        athh athhVar = this.a;
        if (athhVar == null || athhVar.equals(null)) {
            contentValues.putNull("processing_id");
        } else {
            contentValues.put("processing_id", athg.b(this.a));
        }
        atmy atmyVar = this.b;
        if (atmyVar == null) {
            contentValues.putNull("file_type");
        } else {
            contentValues.put("file_type", Integer.valueOf(atmyVar.ordinal()));
        }
        Uri uri = this.c;
        if (uri == null) {
            contentValues.putNull("file_uri");
        } else {
            contentValues.put("file_uri", uri.toString());
        }
        aubx aubxVar = this.d;
        if (aubxVar == null) {
            contentValues.putNull("content_type");
        } else {
            contentValues.put("content_type", aubxVar.toByteArray());
        }
        eyfn eyfnVar = this.e;
        if (eyfnVar == null) {
            contentValues.putNull("encryption_metadata");
        } else {
            contentValues.put("encryption_metadata", eyfnVar.toByteArray());
        }
        dqru.v(contentValues, "transfer_handle", this.f);
        aucj aucjVar = this.g;
        if (aucjVar == null) {
            contentValues.putNull("upload_result");
        } else {
            contentValues.put("upload_result", aucjVar.toByteArray());
        }
        if (iIntValue >= 60700) {
            epwc epwcVar = this.h;
            if (epwcVar == null) {
                contentValues.putNull("mls_file_metadata");
            } else {
                contentValues.put("mls_file_metadata", epwcVar.toByteArray());
            }
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        atml atmlVar = (atml) ((atmc) dqqjVar);
        aC();
        this.cN = atmlVar.cV();
        if (atmlVar.dj(0)) {
            this.a = atmlVar.e();
            fN(0);
        }
        if (atmlVar.dj(1)) {
            this.b = atmlVar.f();
            fN(1);
        }
        if (atmlVar.dj(2)) {
            this.c = atmlVar.c();
            fN(2);
        }
        if (atmlVar.dj(3)) {
            this.d = atmlVar.g();
            fN(3);
        }
        if (atmlVar.dj(4)) {
            this.e = atmlVar.j();
            fN(4);
        }
        if (atmlVar.dj(5)) {
            this.f = atmlVar.k();
            fN(5);
        }
        if (atmlVar.dj(6)) {
            this.g = atmlVar.h();
            fN(6);
        }
        if (atmlVar.dj(7)) {
            this.h = atmlVar.i();
            fN(7);
        }
    }

    public final Uri d() {
        aA(2, "file_uri");
        return this.c;
    }

    public final atmy e() {
        aA(1, "file_type");
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof atlg)) {
            return false;
        }
        atlg atlgVar = (atlg) obj;
        return super.aE(atlgVar.cN) && Objects.equals(this.a, atlgVar.a) && Objects.equals(this.b, atlgVar.b) && Objects.equals(this.c, atlgVar.c) && Objects.equals(this.d, atlgVar.d) && Objects.equals(this.e, atlgVar.e) && Objects.equals(this.f, atlgVar.f) && Objects.equals(this.g, atlgVar.g) && Objects.equals(this.h, atlgVar.h);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "file_processing", dqru.m(new String[]{"processing_id", "file_type", "file_uri", "content_type", "encryption_metadata", "transfer_handle", "upload_result", "mls_file_metadata"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "file_processing";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        return Objects.hash((dqqeVar == null || dqqeVar.b()) ? null : this.cN, this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r12, java.util.List r13) {
        /*
            r11 = this;
            atlf r0 = new atlf
            r0.<init>(r11)
            java.lang.Object r0 = r0.get()
            atmy r1 = r11.b
            r2 = 0
            if (r1 != 0) goto L13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            goto L1b
        L13:
            int r1 = r1.ordinal()
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L1b:
            android.net.Uri r3 = r11.c
            r4 = 0
            if (r3 != 0) goto L22
            r3 = r4
            goto L26
        L22:
            java.lang.String r3 = r3.toString()
        L26:
            aubx r5 = r11.d
            if (r5 != 0) goto L2c
            r5 = r4
            goto L30
        L2c:
            byte[] r5 = r5.toByteArray()
        L30:
            eyfn r6 = r11.e
            if (r6 != 0) goto L36
            r6 = r4
            goto L3a
        L36:
            byte[] r6 = r6.toByteArray()
        L3a:
            java.lang.String r7 = r11.f
            aucj r8 = r11.g
            if (r8 != 0) goto L42
            r8 = r4
            goto L46
        L42:
            byte[] r8 = r8.toByteArray()
        L46:
            epwc r9 = r11.h
            if (r9 != 0) goto L4b
            goto L4f
        L4b:
            byte[] r4 = r9.toByteArray()
        L4f:
            r9 = 8
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r2] = r0
            r0 = 1
            r10[r0] = r1
            r0 = 2
            r10[r0] = r3
            r0 = 3
            r10[r0] = r5
            r0 = 4
            r10[r0] = r6
            r0 = 5
            r10[r0] = r7
            r0 = 6
            r10[r0] = r8
            r0 = 7
            r10[r0] = r4
            r0 = 40
            r12.append(r0)
        L6f:
            if (r2 >= r9) goto La6
            r0 = r10[r2]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L7f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r12.append(r0)
            goto L9e
        L7f:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L96
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r1.length()
            r4 = 12
            if (r3 >= r4) goto L96
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r12.append(r0)
            goto L9e
        L96:
            r13.add(r0)
            r0 = 63
            r12.append(r0)
        L9e:
            r0 = 44
            r12.append(r0)
            int r2 = r2 + 1
            goto L6f
        La6:
            int r13 = r12.length()
            int r13 = r13 + (-1)
            r12.setLength(r13)
            r13 = 41
            r12.append(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atlg.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final aubx k() {
        aA(3, "content_type");
        return this.d;
    }

    public final aucj l() {
        aA(6, "upload_result");
        return this.g;
    }

    public final epwc m() {
        aA(7, "mls_file_metadata");
        return this.h;
    }

    public final eyfn n() {
        aA(4, "encryption_metadata");
        return this.e;
    }

    public final String o() {
        aA(5, "transfer_handle");
        return this.f;
    }

    public final boolean p(Function function) {
        String[] strArr = atmx.a;
        final atmv atmvVar = new atmv((atmw) function.apply(new atmw()));
        final dqsy dqsyVarB = atmx.b();
        return ((Boolean) dqsyVarB.o(new ejxr() { // from class: atle
            @Override // defpackage.ejxr
            public final Object get() {
                String[] strArr2 = atmx.a;
                atmu atmuVar = new atmu();
                atlg atlgVar = this.a;
                atlgVar.aA(0, "processing_id");
                athh athhVar = atlgVar.a;
                if (athhVar == null || athhVar.equals(null)) {
                    atmuVar.a.putNull("processing_id");
                } else {
                    atmuVar.a.put("processing_id", athg.b(athhVar));
                }
                atmy atmyVarE = atlgVar.e();
                if (atmyVarE == null) {
                    atmuVar.a.putNull("file_type");
                } else {
                    atmuVar.a.put("file_type", Integer.valueOf(atmyVarE.ordinal()));
                }
                atmv atmvVar2 = atmvVar;
                atmuVar.e(atlgVar.d());
                atmuVar.c(atlgVar.k());
                atmuVar.d(atlgVar.n());
                atmuVar.g(atlgVar.o());
                atmuVar.h(atlgVar.l());
                atmuVar.f(atlgVar.m());
                atmuVar.al();
                atmuVar.af(atmvVar2);
                atmuVar.an(new dqsb("file_processing", "-updateOrInsert-update"));
                if (atmuVar.a().e() != 0) {
                    return true;
                }
                final dqsy dqsyVar = dqsyVarB;
                return Boolean.valueOf(dqru.b(atmx.b(), "file_processing", atlgVar, new Function() { // from class: atlc
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function2) {
                        return Function$CC.$default$andThen(this, function2);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dqsyVar.O("file_processing", (dqst) obj));
                    }

                    public final /* synthetic */ Function compose(Function function2) {
                        return Function$CC.$default$compose(this, function2);
                    }
                }, new Consumer() { // from class: atld
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                }) != -1);
            }
        })).booleanValue();
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "FileProcessingTable -- REDACTED") : a();
    }
}
