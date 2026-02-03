package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dqpd;
import j$.util.Objects;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.Locale;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class cokk extends dqpd implements dqpf {
    public MessageIdType a = bary.a;
    public String b;
    public comc c;
    public aucl d;
    public aucj e;
    public aucj f;
    public String g;
    public byte[] h;

    protected cokk() {
    }

    @Override // defpackage.dqpd
    public final String a() {
        Locale locale = Locale.US;
        String strValueOf = String.valueOf(this.a);
        String strValueOf2 = String.valueOf(this.b);
        String strValueOf3 = String.valueOf(this.c);
        String strValueOf4 = String.valueOf(this.d);
        String strValueOf5 = String.valueOf(this.e);
        String strValueOf6 = String.valueOf(this.f);
        String strValueOf7 = String.valueOf(this.g);
        byte[] bArr = this.h;
        return String.format(locale, "FileTransferTable [message_id: %s,\n  transfer_id: %s,\n  transfer_type: %s,\n  attachment_upload_response: %s,\n  file_information: %s,\n  thumbnail_information: %s,\n  transfer_handle: %s,\n  opaque_data: %s\n]\n", strValueOf, strValueOf2, strValueOf3, strValueOf4, strValueOf5, strValueOf6, strValueOf7, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")));
    }

    @Override // defpackage.dqpd
    public final void b(ContentValues contentValues) {
        int iIntValue = comb.d().intValue();
        MessageIdType messageIdType = this.a;
        if (messageIdType == null || messageIdType.equals(bary.a)) {
            contentValues.putNull("message_id");
        } else {
            contentValues.put("message_id", Long.valueOf(bary.a(this.a)));
        }
        dqru.v(contentValues, "transfer_id", this.b);
        comc comcVar = this.c;
        if (comcVar == null) {
            contentValues.putNull("transfer_type");
        } else {
            contentValues.put("transfer_type", Integer.valueOf(comcVar.ordinal()));
        }
        aucl auclVar = this.d;
        if (auclVar == null) {
            contentValues.putNull("attachment_upload_response");
        } else {
            contentValues.put("attachment_upload_response", auclVar.toByteArray());
        }
        if (iIntValue >= 55030) {
            aucj aucjVar = this.e;
            if (aucjVar == null) {
                contentValues.putNull("file_information");
            } else {
                contentValues.put("file_information", aucjVar.toByteArray());
            }
        }
        if (iIntValue >= 59910) {
            aucj aucjVar2 = this.f;
            if (aucjVar2 == null) {
                contentValues.putNull("thumbnail_information");
            } else {
                contentValues.put("thumbnail_information", aucjVar2.toByteArray());
            }
        }
        if (iIntValue >= 55030) {
            dqru.v(contentValues, "transfer_handle", this.g);
        }
        if (iIntValue >= 56040) {
            contentValues.put("opaque_data", this.h);
        }
    }

    @Override // defpackage.dqpd
    protected final /* bridge */ /* synthetic */ void c(dqqj dqqjVar) {
        colq colqVar = (colq) ((colh) dqqjVar);
        aC();
        this.cN = colqVar.cV();
        if (colqVar.dj(0)) {
            this.a = colqVar.h();
            fN(0);
        }
        if (colqVar.dj(1)) {
            this.b = colqVar.k();
            fN(1);
        }
        if (colqVar.dj(2)) {
            this.c = colqVar.i();
            fN(2);
        }
        if (colqVar.dj(3)) {
            this.d = colqVar.g();
            fN(3);
        }
        if (colqVar.dj(4)) {
            this.e = colqVar.e();
            fN(4);
        }
        if (colqVar.dj(5)) {
            this.f = colqVar.f();
            fN(5);
        }
        if (colqVar.dj(6)) {
            this.g = colqVar.j();
            fN(6);
        }
        if (colqVar.dj(7)) {
            this.h = colqVar.l();
            fN(7);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cokk)) {
            return false;
        }
        cokk cokkVar = (cokk) obj;
        return super.aE(cokkVar.cN) && Objects.equals(this.a, cokkVar.a) && Objects.equals(this.b, cokkVar.b) && this.c == cokkVar.c && Objects.equals(this.d, cokkVar.d) && Objects.equals(this.e, cokkVar.e) && Objects.equals(this.f, cokkVar.f) && Objects.equals(this.g, cokkVar.g) && Arrays.equals(this.h, cokkVar.h);
    }

    @Override // defpackage.dqpf
    public final String f() {
        return String.format(Locale.US, "INTO %s (%s) VALUES ", "file_transfer", dqru.m(new String[]{"message_id", "transfer_id", "transfer_type", "attachment_upload_response", "file_information", "thumbnail_information", "transfer_handle", "opaque_data"}));
    }

    @Override // defpackage.dqpf
    public final String g() {
        return null;
    }

    @Override // defpackage.dqpf
    public final String h() {
        return "file_transfer";
    }

    public final int hashCode() {
        dqqe dqqeVar = this.cN;
        dqqe dqqeVar2 = (dqqeVar == null || dqqeVar.b()) ? null : this.cN;
        MessageIdType messageIdType = this.a;
        String str = this.b;
        comc comcVar = this.c;
        return Objects.hash(dqqeVar2, messageIdType, str, Integer.valueOf(comcVar == null ? 0 : comcVar.ordinal()), this.d, this.e, this.f, this.g, Integer.valueOf(Arrays.hashCode(this.h)), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    @Override // defpackage.dqpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.lang.StringBuilder r12, java.util.List r13) {
        /*
            r11 = this;
            cokj r0 = new cokj
            r0.<init>(r11)
            java.lang.Object r0 = r0.get()
            java.lang.String r1 = r11.b
            comc r2 = r11.c
            r3 = 0
            if (r2 != 0) goto L15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            goto L1d
        L15:
            int r2 = r2.ordinal()
            java.lang.String r2 = java.lang.String.valueOf(r2)
        L1d:
            aucl r4 = r11.d
            r5 = 0
            if (r4 != 0) goto L24
            r4 = r5
            goto L28
        L24:
            byte[] r4 = r4.toByteArray()
        L28:
            aucj r6 = r11.e
            if (r6 != 0) goto L2e
            r6 = r5
            goto L32
        L2e:
            byte[] r6 = r6.toByteArray()
        L32:
            aucj r7 = r11.f
            if (r7 != 0) goto L37
            goto L3b
        L37:
            byte[] r5 = r7.toByteArray()
        L3b:
            java.lang.String r7 = r11.g
            byte[] r8 = r11.h
            r9 = 8
            java.lang.Object[] r10 = new java.lang.Object[r9]
            r10[r3] = r0
            r0 = 1
            r10[r0] = r1
            r0 = 2
            r10[r0] = r2
            r0 = 3
            r10[r0] = r4
            r0 = 4
            r10[r0] = r6
            r0 = 5
            r10[r0] = r5
            r0 = 6
            r10[r0] = r7
            r0 = 7
            r10[r0] = r8
            r0 = 40
            r12.append(r0)
        L5f:
            if (r3 >= r9) goto L96
            r0 = r10[r3]
            boolean r1 = r0 instanceof java.lang.Number
            if (r1 == 0) goto L6f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r12.append(r0)
            goto L8e
        L6f:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L86
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r1.length()
            r4 = 12
            if (r2 >= r4) goto L86
            java.lang.String r0 = android.database.DatabaseUtils.sqlEscapeString(r1)
            r12.append(r0)
            goto L8e
        L86:
            r13.add(r0)
            r0 = 63
            r12.append(r0)
        L8e:
            r0 = 44
            r12.append(r0)
            int r3 = r3 + 1
            goto L5f
        L96:
            int r13 = r12.length()
            int r13 = r13 + (-1)
            r12.setLength(r13)
            r13 = 41
            r12.append(r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cokk.i(java.lang.StringBuilder, java.util.List):void");
    }

    @Override // defpackage.dqpf
    public final /* bridge */ /* synthetic */ Object j() {
        throw null;
    }

    public final aucj k() {
        aA(4, "file_information");
        return this.e;
    }

    public final aucj m() {
        aA(5, "thumbnail_information");
        return this.f;
    }

    public final aucl n() {
        aA(3, "attachment_upload_response");
        return this.d;
    }

    public final MessageIdType o() {
        aA(0, "message_id");
        return this.a;
    }

    public final comc p() {
        aA(2, "transfer_type");
        return this.c;
    }

    public final String q() {
        aA(6, "transfer_handle");
        return this.g;
    }

    public final String r() {
        aA(1, "transfer_id");
        return this.b;
    }

    public final boolean s(final colz colzVar) {
        final dqsy dqsyVarC = comb.c();
        return ((Boolean) dqsyVarC.o(new ejxr() { // from class: cokg
            @Override // defpackage.ejxr
            public final Object get() {
                String[] strArr = comb.a;
                coly colyVar = new coly();
                cokk cokkVar = this.a;
                MessageIdType messageIdTypeO = cokkVar.o();
                if (messageIdTypeO == null || messageIdTypeO.equals(bary.a)) {
                    colyVar.a.putNull("message_id");
                } else {
                    colyVar.a.put("message_id", Long.valueOf(bary.a(messageIdTypeO)));
                }
                String strR = cokkVar.r();
                ContentValues contentValues = colyVar.a;
                dqru.v(contentValues, "transfer_id", strR);
                comc comcVarP = cokkVar.p();
                if (comcVarP == null) {
                    contentValues.putNull("transfer_type");
                } else {
                    contentValues.put("transfer_type", Integer.valueOf(comcVarP.ordinal()));
                }
                colyVar.c(cokkVar.n());
                aucj aucjVarK = cokkVar.k();
                int iIntValue = comb.d().intValue();
                int iIntValue2 = comb.d().intValue();
                if (iIntValue2 < 55030) {
                    dqru.x("file_information", iIntValue2);
                }
                if (iIntValue >= 55030) {
                    if (aucjVarK == null) {
                        contentValues.putNull("file_information");
                    } else {
                        contentValues.put("file_information", aucjVarK.toByteArray());
                    }
                }
                colyVar.d(cokkVar.m());
                colyVar.e(cokkVar.q());
                byte[] bArrT = cokkVar.t();
                int iIntValue3 = comb.d().intValue();
                int iIntValue4 = comb.d().intValue();
                if (iIntValue4 < 56040) {
                    dqru.x("opaque_data", iIntValue4);
                }
                if (iIntValue3 >= 56040) {
                    contentValues.put("opaque_data", bArrT);
                }
                colz colzVar2 = colzVar;
                colyVar.al();
                colyVar.af(colzVar2);
                colyVar.an(new dqsb("file_transfer", "-updateOrInsert-update"));
                if (colyVar.a().e() != 0) {
                    return true;
                }
                final dqsy dqsyVar = dqsyVarC;
                return Boolean.valueOf(dqru.b(comb.c(), "file_transfer", cokkVar, new Function() { // from class: cokh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Long.valueOf(dqsyVar.O("file_transfer", (dqst) obj));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Consumer() { // from class: coki
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

    public final byte[] t() {
        aA(7, "opaque_data");
        return this.h;
    }

    public final String toString() {
        return ((dqpd.a) ehli.a(dqru.b, dqpd.a.class)).ix().a() ? String.format(Locale.US, "%s", "FileTransferTable -- REDACTED") : a();
    }
}
