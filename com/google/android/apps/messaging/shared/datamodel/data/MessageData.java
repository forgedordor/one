package com.google.android.apps.messaging.shared.datamodel.data;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Base64;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityIdImpl;
import com.google.android.apps.messaging.shared.datamodel.data.MessageData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsData;
import com.google.android.apps.messaging.shared.datamodel.data.common.statsdata.MessageUsageStatisticsDataImpl;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import defpackage.alqm;
import defpackage.alrj;
import defpackage.aoet;
import defpackage.aofa;
import defpackage.arwc;
import defpackage.aubq;
import defpackage.avbn;
import defpackage.awzf;
import defpackage.axcm;
import defpackage.bacm;
import defpackage.bahl;
import defpackage.bahm;
import defpackage.bahv;
import defpackage.bahx;
import defpackage.bahy;
import defpackage.bajt;
import defpackage.baro;
import defpackage.basd;
import defpackage.baui;
import defpackage.baxt;
import defpackage.bbdl;
import defpackage.bbhj;
import defpackage.bquu;
import defpackage.bquv;
import defpackage.brap;
import defpackage.brdu;
import defpackage.bvdx;
import defpackage.bvdz;
import defpackage.bvec;
import defpackage.bveg;
import defpackage.byed;
import defpackage.cbqz;
import defpackage.cczi;
import defpackage.cdag;
import defpackage.cgvq;
import defpackage.cgvx;
import defpackage.cgvz;
import defpackage.cjnm;
import defpackage.ckdl;
import defpackage.ckfm;
import defpackage.ckwl;
import defpackage.clfy;
import defpackage.clmw;
import defpackage.cmwd;
import defpackage.cogw;
import defpackage.comc;
import defpackage.cpyi;
import defpackage.cqaz;
import defpackage.cqjk;
import defpackage.cqjy;
import defpackage.cqnc;
import defpackage.craf;
import defpackage.cssq;
import defpackage.cssr;
import defpackage.dqru;
import defpackage.dzfh;
import defpackage.eieu;
import defpackage.eiiy;
import defpackage.ejwk;
import defpackage.ejwl;
import defpackage.ejxr;
import defpackage.ekfw;
import defpackage.ekgb;
import defpackage.ekhx;
import defpackage.ekoe;
import defpackage.ekrw;
import defpackage.eksl;
import defpackage.eksp;
import defpackage.elha;
import defpackage.elwq;
import defpackage.eyga;
import defpackage.ezds;
import defpackage.fcsu;
import defpackage.fhaz;
import defpackage.le;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class MessageData implements MessageCoreData {
    public static final Parcelable.Creator<MessageCoreData> CREATOR;
    public static final eksp a = eksp.c("BugleDataModel");
    public static final long b;
    public static final long c;
    public static final cczi d;
    public static final cczi e;
    public static final ejxr f;
    private String A;
    private final bahm B;
    public final fcsu g;
    public final fcsu h;
    public final ArrayList i;
    public bquu j;
    public MessageUsageStatisticsData k;
    public ckwl l;
    public clfy m;
    public ckdl n;
    public ckfm o;
    public elwq p;
    public cgvx q;
    public baxt r;
    private final Context s;
    private final cogw t;
    private final bveg u;
    private final fcsu v;
    private final fcsu w;
    private final fcsu x;
    private ekgb y;
    private ekgb z;

    /* compiled from: PG */
    public interface a {
        bveg bB();
    }

    static {
        long millis = TimeUnit.HOURS.toMillis(12L);
        b = millis;
        long millis2 = TimeUnit.HOURS.toMillis(24L);
        c = millis2;
        d = cdag.a("zero_connectivity_message_sending_timeout_ms", millis);
        e = cdag.a("rcs_resend_and_mark_send_failed_timeout_ms", millis2);
        f = cdag.x("toolstone_set_parent_message_id");
        String[] strArr = MessagesTable.a;
        CREATOR = new bahl();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MessageData(android.content.Context r2, defpackage.cogw r3, defpackage.bveg r4, defpackage.fcsu r5, defpackage.cgvz r6, defpackage.fcsu r7, android.os.Parcel r8, defpackage.fcsu r9, defpackage.fcsu r10, defpackage.fcsu r11, defpackage.bahm r12) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.data.MessageData.<init>(android.content.Context, cogw, bveg, fcsu, cgvz, fcsu, android.os.Parcel, fcsu, fcsu, fcsu, bahm):void");
    }

    public static MessagePartCoreData I(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) it.next();
            if (messagePartCoreData.aX()) {
                return messagePartCoreData;
            }
        }
        return null;
    }

    public static dzfh Z(int i) {
        if (i == -1) {
            return new dzfh("UNKNOWN");
        }
        if (i == 0) {
            return new dzfh("SMS");
        }
        if (i == 1) {
            return new dzfh("MMS");
        }
        if (i == 2) {
            return new dzfh("MMS PUSH");
        }
        if (i == 3) {
            return new dzfh("RCS");
        }
        if (i == 4) {
            return new dzfh("CLOUD SYNC");
        }
        if (i != 7) {
            return null;
        }
        return new dzfh("SATELLITE");
    }

    public static String aG(MessageIdType messageIdType, int i, List list) {
        StringBuilder sb = new StringBuilder();
        if (!messageIdType.c()) {
            sb.append(messageIdType.b());
            sb.append("(");
            sb.append(ay(i));
            sb.append("): ");
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb.append((MessagePartCoreData) it.next());
            sb.append(" ");
        }
        return sb.toString();
    }

    public static List aH(bahv bahvVar, String str) {
        if (!TextUtils.isEmpty(str)) {
            return ekgb.r(bahvVar.i(str));
        }
        int i = ekgb.d;
        return ekoe.a;
    }

    public static String ar(int i) {
        switch (i) {
            case 0:
                return "SMS";
            case 1:
                return "MMS";
            case 2:
                return "MMS Push Notification";
            case 3:
                return "RCS";
            case 4:
                return "Cloud Sync";
            case 5:
                return "Tombstone";
            case 6:
                return "EMP";
            case 7:
                return "SATELLITE";
            default:
                throw new IllegalArgumentException("Invalid Message Protocol");
        }
    }

    public static String ay(int i) {
        dzfh dzfhVarZ = Z(i);
        if (dzfhVarZ != null) {
            return dzfhVarZ.a;
        }
        return null;
    }

    public static boolean cJ(int i) {
        return i >= 100 && i <= 117;
    }

    public static boolean cL(int i) {
        return i == 111 || i == 112 || i == 106 || i == 107 || i == 113 || i == 114 || i == 8 || i == 9 || i == 13 || i == 18 || i == 19 || i == 22 || i == 24 || i == 25;
    }

    public static boolean cP(int i) {
        return i == 1 || i == 2;
    }

    public static boolean cR(int i) {
        return i == 14;
    }

    public static boolean cT(int i) {
        return i > 0 && i <= 25;
    }

    public static boolean cU(int i) {
        return i == 8 || i == 9 || i == 13 || i == 18 || i == 19 || i == 22 || i == 24 || i == 25;
    }

    public static boolean ck(int i) {
        return i == 113 || i == 114;
    }

    public static boolean cm(List list) {
        return I(list) != null;
    }

    public static boolean cx(int i) {
        return i == 4;
    }

    public static boolean dh(int i) {
        return i == 0;
    }

    public static boolean dk(int i) {
        return i >= 200 && i <= 270;
    }

    public static int[] dn() {
        return new int[]{1, 2, 11, 15, 14};
    }

    private static List dq(bahv bahvVar, int i, String str) {
        ejwl.a(byed.g(i));
        ekfw ekfwVar = new ekfw();
        if (byed.f(i)) {
            String strA = cssr.a(str, "");
            bahx bahxVarD = bahy.D();
            bacm bacmVar = (bacm) bahxVarD;
            bacmVar.b = strA;
            bacmVar.c = "text/plain";
            bahxVarD.n(elha.TOMBSTONE_PART);
            ekfwVar.h(bahvVar.c(bahxVarD.q()));
        }
        return ekfwVar.g();
    }

    private static boolean dr(int i) {
        ejwl.a(byed.g(i));
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
            case 204:
            case 205:
            case 206:
            case 207:
            case 208:
            case 209:
            case 210:
            case 211:
            case 212:
            case 213:
            case 214:
            case 215:
            case 216:
            case 219:
            case 220:
            case 221:
            case 222:
            case 223:
            case 224:
            case 225:
            case 226:
            case 227:
            case 228:
            case 229:
            case 230:
            case 231:
            case 232:
            case 233:
            case 234:
            case 235:
            case 236:
            case 237:
            case 238:
            case 239:
            case 240:
            case 241:
            case 242:
            case 243:
            case 244:
            case 245:
            case 246:
            case 247:
            case 248:
            case 249:
            case 250:
            case 251:
            case 252:
            case 253:
            case 254:
            case 255:
            case 256:
            case 257:
            case 258:
            case 259:
            case 262:
            case 263:
            case 264:
            case 265:
            case 266:
            case 267:
            case 268:
            case 269:
            case 270:
                return true;
            case 217:
            case 218:
            case 260:
            case 261:
                return false;
            default:
                throw new IllegalStateException(String.format("Tombstone %d has unknown read status", Integer.valueOf(i)));
        }
    }

    private final String ds(int i) {
        int iK;
        int iK2 = k();
        if (!byed.g(iK2) || (((iK = k()) == 200 || iK == 201) && this.z.isEmpty() && !this.i.isEmpty())) {
            return mo280do(i);
        }
        String strMo280do = byed.f(iK2) ? mo280do(i) : "";
        byed byedVar = (byed) this.w.b();
        ekgb ekgbVar = this.z;
        bquu bquuVar = this.j;
        return byedVar.c(ekgbVar, bquuVar.k, false, bquuVar.y, bquuVar.c, this.A, strMo280do, this.s);
    }

    public static int e(int i) {
        ejwl.a(byed.g(i));
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
            case 207:
            case 213:
            case 215:
            case 216:
            case 217:
            case 218:
            case 219:
            case 220:
            case 221:
            case 223:
            case 224:
            case 225:
            case 226:
            case 227:
            case 228:
            case 229:
            case 230:
            case 231:
            case 233:
            case 234:
            case 235:
            case 237:
            case 238:
            case 240:
            case 241:
            case 242:
                return 3;
            case 204:
            case 208:
            case 252:
                return 1;
            case 205:
            case 206:
            case 209:
            case 214:
            case 222:
            case 236:
                return 0;
            case 210:
            case 211:
            case 212:
            case 232:
            case 243:
            case 244:
            case 245:
            case 251:
            case 254:
            case 255:
            case 256:
            case 257:
            case 258:
            case 259:
            case 262:
            case 263:
            case 264:
            case 265:
            case 266:
            case 267:
            case 268:
            case 269:
            case 270:
                return 5;
            case 239:
            case 246:
            case 247:
            case 248:
            case 249:
            case 250:
            case 253:
                return 7;
            case 260:
            case 261:
                return 3;
            default:
                cqaz.c("Tombstone bugle status shouldn't be unknown");
                return -1;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final ConversationIdType A() {
        return this.j.b;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final baro B() {
        return this.j.ap;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final MessageIdType C() {
        return this.j.a;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final MessageIdType D() {
        return this.j.Z;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final basd E() {
        return this.j.R;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final basd F() {
        return this.j.C;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final baxt G() {
        return this.r;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final MessagePartCoreData H() {
        return I(this.i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final MessagesTable.BindData J() {
        return this.j.a();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final brdu K() {
        String[] strArr = MessagesTable.a;
        brdu brduVar = new brdu();
        brduVar.ap("getUpdateBuilderForMessage");
        brduVar.n(this.j.b);
        brduVar.M(this.j.c);
        brduVar.N(this.j.d);
        brduVar.K(this.j.y);
        brduVar.O(this.j.g);
        brduVar.A(this.j.h);
        brduVar.G(this.j.i);
        brduVar.v(this.j.m);
        brduVar.F(this.j.n);
        brduVar.z(this.j.j);
        brduVar.U(this.j.k);
        brduVar.S(this.j.o);
        int i = this.j.p;
        ContentValues contentValues = brduVar.a;
        contentValues.put("sms_priority", Integer.valueOf(i));
        brduVar.R(this.j.q);
        brduVar.t(this.j.u);
        long j = this.j.v;
        int iIntValue = MessagesTable.g().intValue();
        int iIntValue2 = MessagesTable.g().intValue();
        if (iIntValue2 < 59890) {
            dqru.x("rcs_expiry", iIntValue2);
        }
        if (iIntValue >= 59890) {
            contentValues.put("rcs_expiry", Long.valueOf(j));
        }
        dqru.v(contentValues, "mms_subject", cssq.a(this.j.r));
        brduVar.u(this.j.s);
        dqru.v(contentValues, "mms_content_location", this.j.t);
        brduVar.B(this.j.x);
        brduVar.I(this.j.A);
        brduVar.E(this.j.C);
        brduVar.C(this.j.D);
        brduVar.q(this.j.G);
        String str = this.j.Y;
        int iIntValue3 = MessagesTable.g().intValue();
        int iIntValue4 = MessagesTable.g().intValue();
        if (iIntValue4 < 48030) {
            dqru.x("group_private_participant", iIntValue4);
        }
        if (iIntValue3 >= 48030) {
            dqru.v(contentValues, "group_private_participant", str);
        }
        brduVar.L(this.j.Q);
        long j2 = this.j.V;
        int iIntValue5 = MessagesTable.g().intValue();
        int iIntValue6 = MessagesTable.g().intValue();
        if (iIntValue6 < 37030) {
            dqru.x("report_attempt_acounter", iIntValue6);
        }
        if (iIntValue5 >= 37030) {
            contentValues.put("report_attempt_acounter", Long.valueOf(j2));
        }
        bvdz bvdzVar = this.j.E;
        int iIntValue7 = MessagesTable.g().intValue();
        int iIntValue8 = MessagesTable.g().intValue();
        if (iIntValue8 < 29090) {
            dqru.x(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, iIntValue8);
        }
        if (iIntValue7 >= 29090) {
            if (bvdzVar == null) {
                contentValues.putNull(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS);
            } else {
                contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, Integer.valueOf(bvdzVar.ordinal()));
            }
        }
        brduVar.D(this.j.I);
        String str2 = this.j.H;
        int iIntValue9 = MessagesTable.g().intValue();
        int iIntValue10 = MessagesTable.g().intValue();
        if (iIntValue10 < 10002) {
            dqru.x("rcs_remote_instance", iIntValue10);
        }
        if (iIntValue9 >= 10002) {
            dqru.v(contentValues, "rcs_remote_instance", str2);
        }
        brduVar.P(this.j.J);
        brduVar.Q(this.j.K);
        String str3 = this.j.O;
        int iIntValue11 = MessagesTable.g().intValue();
        int iIntValue12 = MessagesTable.g().intValue();
        if (iIntValue12 < 19020) {
            dqru.x("web_id", iIntValue12);
        }
        if (iIntValue11 >= 19020) {
            dqru.v(contentValues, "web_id", str3);
        }
        brduVar.p(this.j.W);
        brduVar.H(this.j.ae);
        brduVar.f(this.j.ai);
        brduVar.h(this.j.aj);
        fhaz fhazVar = this.j.ak;
        int iIntValue13 = MessagesTable.g().intValue();
        int iIntValue14 = MessagesTable.g().intValue();
        if (iIntValue14 < 58680) {
            dqru.x("trace_id", iIntValue14);
        }
        if (iIntValue13 >= 58680) {
            if (fhazVar == null) {
                contentValues.putNull("trace_id");
            } else {
                contentValues.put("trace_id", fhazVar.toByteArray());
            }
        }
        int i2 = this.j.ao;
        int iIntValue15 = MessagesTable.g().intValue();
        int iIntValue16 = MessagesTable.g().intValue();
        if (iIntValue16 < 59430) {
            dqru.x("message_original_protocol", iIntValue16);
        }
        if (iIntValue15 >= 59430) {
            contentValues.put("message_original_protocol", Integer.valueOf(i2));
        }
        return brduVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final bvdx L() {
        return this.j.al;
    }

    @Override // defpackage.bazb
    public final List M() {
        return this.i;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final bvdx N() {
        return this.j.am;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final bvdz O() {
        return this.j.E;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final bvec P() {
        return this.j.an;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final cbqz Q() {
        return this.j.aq;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final cgvx R() {
        return this.q;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final cjnm S() {
        return this.j.S;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final ckdl T() {
        return this.n;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final ckfm U() {
        return this.o;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final ckwl V() {
        return this.l;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final clfy W() {
        return this.m;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final cpyi X() {
        return this.j.af;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final dzfh Y() {
        return Z(d());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int a() {
        return this.j.ai;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String aA() {
        return ds(3);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String aB() {
        return this.j.c;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String aC() {
        return this.j.K;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String aD() {
        return avbn.a(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String aE() {
        cgvx cgvxVar = this.q;
        boolean z = false;
        if (cgvxVar != null && cgvxVar.b == 103) {
            z = true;
        }
        ejwl.p(z, "Required complete Google Photos sharing state, got %s", cgvxVar);
        String strMo280do = mo280do(2);
        cgvxVar.getClass();
        String str = (cgvxVar.b == 103 ? (cgvq) cgvxVar.c : cgvq.a).c;
        return TextUtils.isEmpty(strMo280do) ? str : defpackage.a.q(str, strMo280do, "\n");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String aF() {
        return this.j.O;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final UUID aI() {
        return (UUID) this.j.ad.orElse(null);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final fhaz aJ() {
        return this.j.ak;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aK(ezds ezdsVar) {
        int i = ekgb.d;
        ekfw ekfwVar = new ekfw();
        ekfwVar.j(this.y);
        ekfwVar.h(ezdsVar);
        this.y = ekfwVar.g();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aL(String str, Object obj) {
        bquu bquuVar = this.j;
        if (bquuVar.aA == null) {
            bquuVar.aA = new HashMap();
        }
        bquuVar.aA.put(str, obj);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aM(MessagePartCoreData messagePartCoreData) {
        this.i.add(messagePartCoreData);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aN(MessagesTable.BindData bindData) {
        this.j = bindData.J();
        this.i.clear();
        int i = ekgb.d;
        this.z = ekoe.a;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aO(brap brapVar) {
        aN((MessagesTable.BindData) brapVar.cQ());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aP(SelfIdentityId selfIdentityId) {
        this.j.ag(((SelfIdentityIdImpl) selfIdentityId).a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aQ(SelfIdentityId selfIdentityId) {
        this.j.ai(((SelfIdentityIdImpl) selfIdentityId).a);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aR(String str) {
        this.j.ai(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aS() {
        this.j.V(-1L);
        this.j.A(0L);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aT() {
        bquu bquuVar = this.j;
        bquuVar.e(bquuVar.ai + 1);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aU(long j) {
        this.j.ak(j);
        this.j.aa(j);
        this.j.aq(25);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aV(long j, comc comcVar) {
        if (comc.DOWNLOAD.equals(comcVar)) {
            this.j.aa(j);
            this.j.aq(110);
        } else {
            this.j.ak(j);
            this.j.aq(12);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aW(long j, comc comcVar) {
        if (comc.DOWNLOAD.equals(comcVar)) {
            ba(j);
        } else {
            bk(j);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aX(Instant instant) {
        this.j.ak(instant.toEpochMilli());
        if (!cK()) {
            this.j.aq(7);
            return;
        }
        bquu bquuVar = this.j;
        int i = bquuVar.k;
        int i2 = 104;
        if (i != 105 && i != 104) {
            i2 = 102;
        }
        bquuVar.aq(i2);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aY(long j) {
        if (cK()) {
            this.j.aa(j);
            this.j.aq(110);
        } else {
            this.j.ak(j);
            this.j.aq(12);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void aZ(long j) {
        if (!cK()) {
            this.j.ak(j);
            this.j.aq(1);
        } else {
            this.j.aa(j);
            this.j.aq(100);
            this.j.A(0L);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final ekgb aa() {
        return this.y;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final ekgb ab() {
        return this.z;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final eyga ac() {
        return this.j.W;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final Instant ad() {
        return this.j.h;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final Optional ae() {
        return this.j.ar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final Optional af() {
        eieu eieuVarK = eiiy.k("MessageData#getReceivingMsisdnMessagingIdentity");
        try {
            Optional optionalFlatMap = Optional.ofNullable(this.j.e).flatMap(new Function() { // from class: bahj
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    MessageData messageData = this.a;
                    try {
                        return Optional.of(((asqx) messageData.h.b()).c((String) obj));
                    } catch (asrb e2) {
                        eksl ekslVar = (eksl) ((eksl) MessageData.a.j()).g(e2);
                        ekslVar.X(cqnc.a, messageData.j.a.b());
                        ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/datamodel/data/MessageData", "getReceivingMsisdnMessagingIdentityInternal", 2415, "MessageData.java")).q("Failed to retrieve the receiving rcs msisdn");
                        return Optional.empty();
                    }
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            final alrj alrjVar = (alrj) this.v.b();
            alrjVar.getClass();
            Optional map = optionalFlatMap.map(new Function() { // from class: bahk
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return alrjVar.b((aubq) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            eieuVarK.close();
            return map;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final Optional ag() {
        eieu eieuVarK = eiiy.k("MessageData#getSelfIdentityChatEndpoint");
        try {
            Optional optionalFlatMap = cS() ? ah().flatMap(new Function() { // from class: bahh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((alqm) obj).e();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }) : af().flatMap(new Function() { // from class: bahh
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ((alqm) obj).e();
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            eieuVarK.close();
            return optionalFlatMap;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final Optional ah() {
        eieu eieuVarK = eiiy.k("MessageData#getSenderMessagingIdentity");
        try {
            Optional optionalOf = this.j.d != null ? Optional.of(((alrj) this.v.b()).r(ejwk.b(this.j.d))) : Optional.empty();
            eieuVarK.close();
            return optionalOf;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ai() {
        return this.j.L;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String aj() {
        return this.j.B;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ak() {
        return this.j.X;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String al() {
        return this.j.M;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String am() {
        ArrayList arrayList = this.i;
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList.size() == 1 ? ((MessagePartCoreData) arrayList.get(0)).R() : "multipart/mixed";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String an() {
        return this.j.T;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ao() {
        return cK() ? "INCOMING" : "OUTGOING";
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ap() {
        String string;
        cqaz.k(ch());
        MessagePartCoreData messagePartCoreDataH = H();
        if (messagePartCoreDataH == null) {
            return "";
        }
        Context context = this.s;
        String string2 = messagePartCoreDataH.bj() ? context.getString(R.string.file_transfer_via_sms_image) : messagePartCoreDataH.bx() ? context.getString(R.string.file_transfer_via_sms_video) : messagePartCoreDataH.aY() ? context.getString(R.string.file_transfer_via_sms_audio) : messagePartCoreDataH.bw() ? context.getString(R.string.file_transfer_via_sms_contact) : context.getString(R.string.file_transfer_via_sms_other);
        String shortFileSize = Formatter.formatShortFileSize(context, messagePartCoreDataH.l());
        String strD = le.d(messagePartCoreDataH.R());
        if (TextUtils.isEmpty(strD)) {
            string = context.getString(R.string.file_transfer_via_sms_info_no_file_type, shortFileSize);
        } else {
            strD.getClass();
            string = context.getString(R.string.file_transfer_via_sms_info, shortFileSize, strD);
        }
        String string3 = context.getString(R.string.file_transfer_via_sms_expiry, ((cqjk) this.x.b()).a(l()).toString());
        Uri uriU = messagePartCoreDataH.u();
        uriU.getClass();
        return context.getString(R.string.file_transfer_via_sms_format, string2, uriU, string, string3);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String aq() {
        return this.j.Y;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String as() {
        return ds(2);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String at() {
        return mo280do(2);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String au() {
        return this.j.t;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String av() {
        return this.j.r;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String aw() {
        return this.j.s;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String ax() {
        return ay(d());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final String az() {
        return ds(1);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int b() {
        return this.j.p;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bA(Optional optional) {
        this.j.x(optional);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bB(boolean z) {
        this.j.Z(z);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bC() {
        this.j.T(0);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bD(Uri uri) {
        this.j.ao(uri);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bE(MessageUsageStatisticsData messageUsageStatisticsData) {
        this.k = messageUsageStatisticsData;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bF(long j) {
        this.j.A(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bG(basd basdVar) {
        this.j.L(basdVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bH(bvdx bvdxVar) {
        this.j.M(bvdxVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bI(bvdx bvdxVar) {
        this.j.N(bvdxVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bJ(Instant instant) {
        this.j.Q(instant);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bK(int i) {
        this.j.S(i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bL(long j) {
        this.j.aa(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bM(alqm alqmVar) {
        alqmVar.e().filter(new Predicate() { // from class: bahd
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                eksp ekspVar = MessageData.a;
                aubp aubpVarB = aubp.b(((aubq) obj).c);
                if (aubpVarB == null) {
                    aubpVarB = aubp.UNKNOWN_TYPE;
                }
                return aubpVarB.equals(aubp.PHONE);
            }
        }).ifPresentOrElse(new Consumer() { // from class: bahe
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                this.a.j.E(((aubq) obj).d);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Runnable() { // from class: bahf
            @Override // java.lang.Runnable
            public final void run() {
                eksp ekspVar = MessageData.a;
                throw new IllegalArgumentException("Receiving messaging identity doesn't have an RCS identifier");
            }
        });
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bN(clfy clfyVar) {
        this.m = clfyVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bO(int i) {
        this.j.ad(i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bP(alqm alqmVar) {
        this.j.aj(alqmVar.j());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bQ(long j) {
        this.j.ak(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bR(int i) {
        this.j.al(i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bS(String str) {
        this.j.am(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bT(long j) {
        this.j.an(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bU(int i) {
        this.j.aq(i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bV(fhaz fhazVar) {
        this.j.ar(fhazVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bW(long j) {
        this.j.as(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bX(String str, List list) {
        this.A = str;
        this.z = ekgb.n(list);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bY(MessagesTable.BindData bindData) {
        this.j = bindData.J();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bZ(String str) {
        this.j.au(str);
    }

    public final void ba(long j) {
        this.j.aa(j);
        bquu bquuVar = this.j;
        if (bquuVar.k == 101) {
            bquuVar.aq(103);
        } else {
            bquuVar.aq(105);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bb(long j) {
        if (!cK()) {
            this.j.ak(j);
            this.j.aa(j);
            this.j.aq(8);
        } else {
            this.j.aa(j);
            bquu bquuVar = this.j;
            if (bquuVar.k == 105) {
                bquuVar.aq(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
            } else {
                bquuVar.aq(106);
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bc(long j) {
        int i = this.j.k;
        int[] iArr = {10, 4};
        int i2 = 0;
        while (true) {
            if (i2 >= 2) {
                cqaz.c("Expected value to be one of " + Arrays.toString(iArr) + " but was " + i);
                break;
            }
            if (i == iArr[i2]) {
                break;
            } else {
                i2++;
            }
        }
        this.j.ak(j);
        this.j.aq(8);
        this.j.S(10001);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bd(long j) {
        this.j.ak(j);
        this.j.aa(j);
        this.j.aq(9);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void be(long j) {
        if (cK()) {
            ba(j);
        } else {
            bk(j);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bf(long j) {
        this.j.ak(j);
        this.j.aq(7);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bg(long j) {
        this.j.ak(j);
        this.j.aa(j);
        this.j.aq(18);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bh() {
        this.j.aq(15);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bi(long j) {
        this.j.aq(6);
        this.j.ak(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bj(long j) {
        this.j.ak(j);
        this.j.aq(10);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bk(long j) {
        this.j.aq(5);
        this.j.ak(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bl(long j) {
        this.j.ak(j);
        this.j.aq(1);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bm(long j) {
        if (cK()) {
            this.j.aa(j);
            this.j.aq(111);
        } else {
            this.j.ak(j);
            this.j.aq(13);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bn() {
        this.j.e(0);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bo(baxt baxtVar) {
        this.r = baxtVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bp(String str) {
        this.j.h(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bq(String str) {
        this.j.i(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void br(cpyi cpyiVar) {
        this.j.l(cpyiVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bs(eyga eygaVar) {
        this.j.q(eygaVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bt(UUID uuid) {
        this.j.r(Optional.ofNullable(uuid));
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bu(cbqz cbqzVar) {
        this.j.s(cbqzVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bv(elwq elwqVar) {
        this.p = elwqVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bw(cgvx cgvxVar) {
        this.q = cgvxVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bx(boolean z) {
        this.j.w(z);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void by() {
        this.j.T(2);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void bz(boolean z) {
        this.j.H(z);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int c() {
        return this.i.size();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cA() {
        return this.j.j == 6;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cB() {
        return g() != 0;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cC() {
        return da() && c() > 0 && Collection.EL.stream(this.i).anyMatch(new Predicate() { // from class: bahb
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo538negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((MessagePartCoreData) obj).be();
            }
        });
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cD() {
        return cL(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cE() {
        MessagePartCoreData messagePartCoreDataH = H();
        return messagePartCoreDataH != null && messagePartCoreDataH.bk();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cF() {
        return this.j.G;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cG(long j) {
        return j - this.j.A < TimeUnit.MINUTES.toMillis(((Long) this.B.a.b()).longValue());
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cH(long j) {
        return j - this.j.A < (cX() ? (Long) e.e() : (Long) d.e()).longValue();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cI() {
        return cJ(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cK() {
        int i = this.j.k;
        return cJ(i) || dk(i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cM() {
        return this.j.m;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cN() {
        return this.j.n;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cO() {
        return cP(this.j.j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cQ() {
        return this.j.j == 2;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cS() {
        return cT(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cV() {
        int i = this.j.k;
        return i == 104 || i == 102;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cW() {
        int i = this.j.k;
        return i == 4 || i == 7;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cX() {
        return baui.t(this.j.j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cY() {
        return cX() && cl() && !cE();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cZ() {
        bquu bquuVar = this.j;
        if (bquuVar.j == 3 || !bquuVar.C.k()) {
            return false;
        }
        bquu bquuVar2 = this.j;
        return bquuVar2.k != 15 && bquuVar2.aj;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void ca(bvec bvecVar) {
        this.j.av(bvecVar);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void cb() {
        cqaz.a(d(), 0);
        cqaz.f(cK());
        for (MessagePartCoreData messagePartCoreData : this.i) {
            if (messagePartCoreData.bv()) {
                messagePartCoreData.aL(this.s);
            }
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void cc(MessageIdType messageIdType) {
        cqaz.k(!messageIdType.c());
        cqaz.k(this.j.a.c());
        this.j.v(messageIdType);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void cd(basd basdVar) {
        cqaz.k(this.j.C.i());
        this.j.W(basdVar);
        if (this.j.R.i()) {
            this.j.L(basdVar);
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void ce(ConversationIdType conversationIdType, Uri uri, long j) {
        this.j.m(conversationIdType);
        this.j.ao(uri);
        this.j.Z(true);
        this.j.H(true);
        this.j.aa(j);
        this.j.ak(j);
        this.j.aq(4);
        this.j.ae(j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void cf() {
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((MessagePartCoreData) it.next()).af();
        }
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cg() {
        if (craf.i(this.s)) {
            return false;
        }
        int i = this.j.k;
        return i == 102 || i == 104;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean ch() {
        if (!cX() && !dg()) {
            return false;
        }
        if (cE()) {
            return true;
        }
        if (!cl()) {
            ekrw ekrwVarN = a.n();
            ekrwVarN.X(cqnc.a, this.j.a.b());
            ((eksl) ekrwVarN.h("com/google/android/apps/messaging/shared/datamodel/data/MessageData", "canFallbackViaSms", 2865, "MessageData.java")).q("fallback to sms not allowed without attachments");
            return false;
        }
        if (this.j.u > 0) {
            if (this.t.f().toEpochMilli() >= this.j.u + cmwd.a()) {
                ekrw ekrwVarN2 = a.n();
                ekrwVarN2.X(cqnc.a, this.j.a.b());
                ((eksl) ekrwVarN2.h("com/google/android/apps/messaging/shared/datamodel/data/MessageData", "canFallbackViaSms", 2872, "MessageData.java")).q("fallback to sms not allowed because of expiry");
                return false;
            }
        }
        if (cB() || co()) {
            return true;
        }
        ekrw ekrwVarN3 = a.n();
        ekrwVarN3.X(cqnc.a, this.j.a.b());
        ((eksl) ekrwVarN3.h("com/google/android/apps/messaging/shared/datamodel/data/MessageData", "canFallbackViaSms", 2884, "MessageData.java")).q("fallback to sms not allowed due to absent uri");
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean ci() {
        if (craf.i(this.s)) {
            return false;
        }
        int i = this.j.k;
        if (i == 106 || i == 101 || i == 115 || i == 112 || i == 110) {
            return true;
        }
        return baui.f(i) && ((cqjy) this.g.b()).q();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cj() {
        int i = this.j.k;
        return i == 4 || i == 7;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cl() {
        return cm(this.i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cn() {
        if (!TextUtils.isEmpty(this.j.r) || byed.g(this.j.k) || this.m != null) {
            return true;
        }
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) arrayList.get(i);
            if (messagePartCoreData.aX()) {
                return true;
            }
            i++;
            if (!TextUtils.isEmpty(messagePartCoreData.ab())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean co() {
        MessagePartCoreData messagePartCoreDataH = H();
        return (messagePartCoreDataH == null || messagePartCoreDataH.u() == null) ? false : true;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cp() {
        return this.j.S != null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cq() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            boolean zBo = ((MessagePartCoreData) arrayList.get(i)).bo();
            i++;
            if (zBo) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cr() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            boolean zBt = ((MessagePartCoreData) arrayList.get(i)).bt();
            i++;
            if (zBt) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cs() {
        int i = this.j.k;
        return i == 105 || i == 104;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean ct() {
        return this.j.k == 115;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cu() {
        return this.j.k == 10;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cv() {
        return this.j.aj;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cw() {
        return cx(this.j.j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cy() {
        return baui.h(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean cz() {
        int i = this.j.k;
        return i == 105 || i == 103;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int d() {
        return this.j.j;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean da() {
        return this.j.j == 7;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean db() {
        return this.j.k == 16;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean dc() {
        return bajt.j(this.z, this.j.c);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean dd() {
        int i = this.j.k;
        return i == 5 || i == 6;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean de() {
        return baui.p(this.j.k);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean df() {
        int i = this.j.k;
        ekgb ekgbVar = baui.a;
        return i == 1 || cR(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean dg() {
        return dh(this.j.j);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean di() {
        return dg() && cl() && !cE() && this.q == null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean dj() {
        return dk(this.j.k);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final boolean dl() {
        return this.j.k == 4;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final byte[] dm() {
        return this.j.U;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    /* renamed from: do, reason: not valid java name */
    public final String mo280do(int i) {
        int i2;
        String property = System.getProperty("line.separator");
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        boolean zBd = false;
        for (int i3 = 0; i3 < size; i3++) {
            MessagePartCoreData messagePartCoreData = (MessagePartCoreData) arrayList.get(i3);
            zBd |= messagePartCoreData.bd();
            if (messagePartCoreData.bo()) {
                i2 = 3;
                if (i != 3) {
                }
            } else {
                i2 = i;
            }
            if (messagePartCoreData.aV()) {
                String strS = ((arwc) this.B.c.b()).a() ? i2 == 2 ? messagePartCoreData.S() : !TextUtils.isEmpty(messagePartCoreData.Y()) ? messagePartCoreData.Y() : messagePartCoreData.ab() : i2 == 2 ? messagePartCoreData.S() : messagePartCoreData.ab();
                if (!TextUtils.isEmpty(strS)) {
                    if (sb.length() > 0) {
                        sb.append(property);
                    }
                    sb.append(strS);
                }
            }
        }
        return (TextUtils.isEmpty(sb) && zBd) ? bbhj.a(this.s, arrayList) : sb.toString();
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final void dp() {
        this.j.U(-1L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MessageData) {
            return Objects.equals(this.j.a, ((MessageData) obj).j.a);
        }
        return false;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int f() {
        return this.j.x;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int g() {
        return this.j.D;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int h() {
        return this.j.l;
    }

    public final int hashCode() {
        MessageIdType messageIdType = this.j.a;
        if (messageIdType != null) {
            return messageIdType.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int i() {
        return this.j.ae;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int j() {
        return this.j.J;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final int k() {
        return this.j.k;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long l() {
        return this.j.u;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long m() {
        return this.j.v;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long n() {
        return this.j.I;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long o() {
        return this.j.i;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long p() {
        return this.j.A;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long q() {
        return this.j.Q;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long r() {
        return this.j.g;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long s() {
        return this.j.q;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final long t() {
        return this.j.P;
    }

    public final String toString() {
        bquu bquuVar = this.j;
        return aG(bquuVar.a, bquuVar.j, this.i);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final Uri u() {
        return this.j.o;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final SelfIdentityId v() {
        return aofa.c(this.j.y);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final aubq w() {
        eieu eieuVarK = eiiy.k("MessageData#getSelfIdentityChatEndpointOrThrow");
        try {
            aubq aubqVar = (aubq) ag().orElseThrow(new Supplier() { // from class: bahc
                @Override // java.util.function.Supplier
                public final Object get() {
                    return new bahn();
                }
            });
            eieuVarK.close();
            return aubqVar;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.j.a().writeToParcel(parcel, i);
        ArrayList arrayList = this.i;
        parcel.writeInt(arrayList.size());
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable((MessagePartCoreData) arrayList.get(i2), i);
        }
        parcel.writeParcelable(this.k, i);
        ckwl ckwlVar = this.l;
        parcel.writeByteArray(ckwlVar != null ? ckwlVar.a.toByteArray() : null);
        clfy clfyVar = this.m;
        parcel.getClass();
        parcel.writeByteArray(clfyVar != null ? clfyVar.a.toByteArray() : null);
        cgvx cgvxVar = this.q;
        parcel.getClass();
        parcel.writeByteArray(cgvxVar != null ? cgvxVar.toByteArray() : null);
        baxt baxtVar = this.r;
        parcel.writeString(baxtVar == null ? null : baxtVar.a);
        ckfm ckfmVar = this.o;
        parcel.getClass();
        parcel.writeByteArray(ckfmVar != null ? ckfmVar.a.toByteArray() : null);
        ckdl ckdlVar = this.n;
        parcel.getClass();
        parcel.writeByteArray(ckdlVar != null ? ckdlVar.a.toByteArray() : null);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final axcm x() {
        axcm axcmVar = this.j.z;
        if (axcmVar != null) {
            return axcmVar;
        }
        awzf awzfVar = (awzf) this.B.b.b();
        String str = this.j.y;
        str.getClass();
        return awzfVar.a(str);
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final MessageCoreData y() {
        MessageCoreData messageCoreDataA = this.u.a();
        MessageData messageData = (MessageData) messageCoreDataA;
        messageData.j = this.j.a().J();
        messageData.k = this.k.e();
        clfy clfyVar = this.m;
        messageData.m = clfyVar != null ? new clfy(clfyVar.a) : null;
        baxt baxtVar = this.r;
        messageData.r = baxtVar != null ? new baxt(baxtVar.a) : null;
        messageData.bA(Optional.of(UUID.randomUUID()));
        return messageCoreDataA;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData
    public final MessageUsageStatisticsData z() {
        return this.k;
    }

    public MessageData(Context context, cogw cogwVar, bveg bvegVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, bahm bahmVar) {
        this.i = new ArrayList();
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        this.y = ekgbVar;
        this.z = ekgbVar;
        this.s = context;
        this.t = cogwVar;
        this.u = bvegVar;
        this.g = fcsuVar;
        this.v = fcsuVar2;
        this.h = fcsuVar3;
        this.w = fcsuVar4;
        this.x = fcsuVar5;
        this.B = bahmVar;
        String[] strArr = MessagesTable.a;
        bquv bquvVar = new bquv();
        this.j = bquvVar;
        bquvVar.ap(129);
        this.j.al(-1);
        this.j.am(null);
        this.j.V(-1L);
        this.j.ah(1L);
        this.k = new MessageUsageStatisticsDataImpl();
    }

    public MessageData(Context context, cogw cogwVar, bahv bahvVar, bveg bvegVar, fcsu fcsuVar, cgvz cgvzVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, bahm bahmVar, int i, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str) {
        this(context, cogwVar, bvegVar, fcsuVar, fcsuVar2, fcsuVar3, fcsuVar4, fcsuVar5, bahmVar, conversationIdType, aoet.b(selfIdentityId), selfIdentityId, 3, i, aH(bahvVar, str));
        if (i != 0) {
            if (i == 1) {
                this.j.C(null);
                this.j.ap(129);
            } else {
                if (i == 3 || i == 6 || i == 7) {
                    return;
                }
                throw new IllegalArgumentException("Unsupported message type: " + i + ", " + ay(i));
            }
        }
    }

    public MessageData(Context context, cogw cogwVar, bahv bahvVar, bveg bvegVar, fcsu fcsuVar, cgvz cgvzVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, bahm bahmVar, Uri uri, ConversationIdType conversationIdType, String str, SelfIdentityId selfIdentityId, String str2, String str3, long j, long j2, boolean z, boolean z2, long j3) {
        this(context, cogwVar, bahvVar, bvegVar, fcsuVar, cgvzVar, fcsuVar2, fcsuVar3, fcsuVar4, fcsuVar5, bahmVar, conversationIdType, str, selfIdentityId, 100, 0, aH(bahvVar, str2), j2, j, z, z2);
        bquu bquuVar = this.j;
        bquuVar.ao(uri);
        bquuVar.C(str3);
        this.j.as(j3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MessageData(android.content.Context r17, defpackage.cogw r18, defpackage.bahv r19, defpackage.bveg r20, defpackage.fcsu r21, defpackage.cgvz r22, defpackage.fcsu r23, defpackage.fcsu r24, defpackage.fcsu r25, defpackage.fcsu r26, defpackage.bahm r27, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r28, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId r29, defpackage.aubq r30, java.lang.String r31, java.lang.String r32) {
        /*
            r16 = this;
            java.lang.String r11 = defpackage.aoet.b(r29)
            int r0 = defpackage.ekgb.d
            r14 = 3
            ekgb r15 = defpackage.ekoe.a
            r13 = 3
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r20
            r4 = r21
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r12 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            boolean r1 = android.text.TextUtils.isEmpty(r31)
            if (r1 != 0) goto Lc7
            int r1 = r32.hashCode()
            r2 = 622719353(0x251df179, float:1.3699393E-16)
            java.lang.String r3 = "application/vnd.gsma.botsuggestion.response.v1.0+json"
            r4 = 1
            if (r1 == r2) goto L4b
            r2 = 817335912(0x30b78e68, float:1.3355477E-9)
            if (r1 == r2) goto L3f
            r2 = r32
            goto L55
        L3f:
            java.lang.String r1 = "text/plain"
            r2 = r32
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L55
            r1 = 0
            goto L56
        L4b:
            r2 = r32
            boolean r1 = r2.equals(r3)
            if (r1 == 0) goto L55
            r1 = r4
            goto L56
        L55:
            r1 = -1
        L56:
            if (r1 == 0) goto Lba
            if (r1 != r4) goto Lae
            r9 = r27
            fcsu r1 = r9.d
            java.lang.Object r1 = r1.b()
            arwb r1 = (defpackage.arwb) r1
            bahx r1 = defpackage.bahy.D()
            r2 = r1
            bacm r2 = (defpackage.bacm) r2
            r5 = r31
            r2.b = r5
            r2.c = r3
            elha r2 = defpackage.elha.SUGGESTED_REPLY_RESPONSE
            r1.n(r2)
            bahy r1 = r1.q()
            r2 = r19
            com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r1 = r2.c(r1)
            com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse r2 = com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponseDeserializer.deserializeFromJson(r5)
            if (r2 == 0) goto L9b
            com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse$ConversationSuggestionResponseType r2 = r2.type
            com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse$ConversationSuggestionResponseType r3 = com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestionResponse.ConversationSuggestionResponseType.ACTION
            if (r2 != r3) goto L9b
            elha r2 = defpackage.elha.SUGGESTED_ACTION_RESPONSE
            if (r2 != 0) goto L92
            elha r2 = defpackage.elha.UNKNOWN
        L92:
            bscl r3 = r1.f
            int r2 = r2.a()
            r3.U(r2)
        L9b:
            java.util.ArrayList r2 = r0.i
            r2.add(r1)
            elha r1 = r1.K()
            elha r2 = defpackage.elha.SUGGESTED_ACTION_RESPONSE
            if (r1 != r2) goto Lc7
            bquu r1 = r0.j
            r1.w(r4)
            goto Lc7
        Lae:
            java.lang.String r1 = "Unsupported content type: "
            java.lang.String r1 = r1.concat(r2)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>(r1)
            throw r2
        Lba:
            r2 = r19
            r5 = r31
            java.util.ArrayList r1 = r0.i
            com.google.android.apps.messaging.shared.datamodel.data.MessagePartData r2 = r2.i(r5)
            r1.add(r2)
        Lc7:
            bquu r1 = r0.j
            r2 = r30
            java.lang.String r2 = r2.d
            r1.aj(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.messaging.shared.datamodel.data.MessageData.<init>(android.content.Context, cogw, bahv, bveg, fcsu, cgvz, fcsu, fcsu, fcsu, fcsu, bahm, com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId, aubq, java.lang.String, java.lang.String):void");
    }

    public MessageData(Context context, cogw cogwVar, bahv bahvVar, bveg bvegVar, fcsu fcsuVar, cgvz cgvzVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, bahm bahmVar, ConversationIdType conversationIdType, String str, aubq aubqVar) {
        this(context, cogwVar, bvegVar, fcsuVar, fcsuVar2, fcsuVar3, fcsuVar4, fcsuVar5, bahmVar, conversationIdType, (String) null, (SelfIdentityId) null, 3, 0, aH(bahvVar, str));
        this.j.aj(aubqVar.d);
    }

    public MessageData(Context context, cogw cogwVar, bahv bahvVar, bveg bvegVar, fcsu fcsuVar, cgvz cgvzVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, bahm bahmVar, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, String str, String str2, boolean z) {
        this(context, cogwVar, bvegVar, fcsuVar, fcsuVar2, fcsuVar3, fcsuVar4, fcsuVar5, bahmVar, conversationIdType, aoet.b(selfIdentityId), selfIdentityId, 3, 1, aH(bahvVar, str));
        this.j.C(str2);
        this.j.ap(true != z ? 129 : 130);
    }

    public MessageData(Context context, cogw cogwVar, bahv bahvVar, bveg bvegVar, fcsu fcsuVar, cgvz cgvzVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, bahm bahmVar, ConversationIdType conversationIdType, String str, SelfIdentityId selfIdentityId, int i, int i2, List list, long j, long j2, boolean z, boolean z2) {
        this(context, cogwVar, bvegVar, fcsuVar, fcsuVar2, fcsuVar3, fcsuVar4, fcsuVar5, bahmVar, conversationIdType, str, selfIdentityId, i, i2, list);
        bquu bquuVar = this.j;
        bquuVar.aa(j);
        bquuVar.ak(j2);
        bquuVar.H(z);
        bquuVar.Z(z2);
    }

    public MessageData(Context context, cogw cogwVar, bveg bvegVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, bahm bahmVar, ConversationIdType conversationIdType, String str, SelfIdentityId selfIdentityId, int i, int i2, List list) {
        this(context, cogwVar, bvegVar, fcsuVar, fcsuVar2, fcsuVar3, fcsuVar4, fcsuVar5, bahmVar);
        long epochMilli = cogwVar.f().toEpochMilli();
        bquu bquuVar = this.j;
        bquuVar.m(conversationIdType);
        bquuVar.ai(TextUtils.isEmpty(str) ? aoet.b(selfIdentityId) : str);
        bquuVar.ag(aoet.a(selfIdentityId));
        bquuVar.aq(i);
        bquuVar.P(i2);
        bquuVar.aa(epochMilli);
        bquuVar.r(Optional.ofNullable(null));
        bquuVar.ak(epochMilli);
        if ((i2 == 0 || i2 == 1) && (i == 3 || i == 4)) {
            this.j.av(bvec.TRANSPORT_NOT_SELECTED);
        }
        this.i.addAll(list);
    }

    public MessageData(Context context, cogw cogwVar, bahv bahvVar, bveg bvegVar, fcsu fcsuVar, cgvz cgvzVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, bahm bahmVar, basd basdVar, String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, int i2, String str2, long j, boolean z, boolean z2, long j2, long j3) {
        this(context, cogwVar, bahvVar, bvegVar, fcsuVar, cgvzVar, fcsuVar2, fcsuVar3, fcsuVar4, fcsuVar5, bahmVar, conversationIdType, str, selfIdentityId, i, 3, aH(bahvVar, str2), j3, j2, z, z2);
        bquu bquuVar = this.j;
        bquuVar.W(basdVar);
        bquuVar.L(basdVar);
        bquuVar.X(null);
        bquuVar.an(j);
        bquuVar.y(i2);
        bquuVar.A(Long.MAX_VALUE);
        bquuVar.S(128);
        if (i == 104 || i == 6) {
            this.j.ae(j3);
        }
    }

    public MessageData(Context context, cogw cogwVar, bahv bahvVar, bveg bvegVar, fcsu fcsuVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, bahm bahmVar, MessagesTable.BindData bindData, List list) {
        this.i = new ArrayList();
        int i = ekgb.d;
        ekgb ekgbVar = ekoe.a;
        this.y = ekgbVar;
        this.z = ekgbVar;
        this.s = context;
        this.t = cogwVar;
        this.u = bvegVar;
        this.g = fcsuVar;
        this.v = fcsuVar2;
        this.h = fcsuVar3;
        this.w = fcsuVar4;
        this.x = fcsuVar5;
        this.B = bahmVar;
        this.j = bindData.J();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.i.add(bahvVar.e((PartsTable.BindData) it.next()));
        }
        this.k = new MessageUsageStatisticsDataImpl();
    }

    public MessageData(Context context, cogw cogwVar, bahv bahvVar, bveg bvegVar, fcsu fcsuVar, cgvz cgvzVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, bahm bahmVar, String str, long j, long j2, basd basdVar, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, int i2, boolean z, boolean z2, long j3, long j4, String str3, String str4) {
        this(context, cogwVar, bahvVar, bvegVar, fcsuVar, cgvzVar, fcsuVar2, fcsuVar3, fcsuVar4, fcsuVar5, bahmVar, basdVar, str2, selfIdentityId, conversationIdType, i, i2, (String) null, j, z, z2, j3, j4);
        this.j.V(-1L);
        this.j.A(j2);
        bahx bahxVarD = bahy.D();
        bacm bacmVar = (bacm) bahxVarD;
        bacmVar.c = str;
        bahxVarD.o(j);
        bacmVar.j = str3;
        if (str4 != null) {
            bacmVar.k = str4;
        }
        this.i.add(bahvVar.c(bahxVarD.q()));
    }

    public MessageData(Context context, cogw cogwVar, bahv bahvVar, bveg bvegVar, fcsu fcsuVar, cgvz cgvzVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, bahm bahmVar, String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, long j, String str2) {
        this(context, cogwVar, bahvVar, bvegVar, fcsuVar, cgvzVar, fcsuVar2, fcsuVar3, fcsuVar4, fcsuVar5, bahmVar, conversationIdType, str, selfIdentityId, i, e(i), dq(bahvVar, i, str2), j, j, true, dr(i));
        bquu bquuVar = this.j;
        bquuVar.A(Long.MAX_VALUE);
        bquuVar.S(128);
    }

    public MessageData(Context context, cogw cogwVar, bahv bahvVar, bveg bvegVar, fcsu fcsuVar, cgvz cgvzVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, bahm bahmVar, String str, ConversationIdType conversationIdType, String str2, SelfIdentityId selfIdentityId, String str3, String str4, long j, long j2, boolean z, boolean z2, int i, String str5) {
        this(context, cogwVar, bahvVar, bvegVar, fcsuVar, cgvzVar, fcsuVar2, fcsuVar3, fcsuVar4, fcsuVar5, bahmVar, conversationIdType, str2, selfIdentityId, i, 4, aH(bahvVar, str3), j2, j, z, z2);
        bquu bquuVar = this.j;
        bquuVar.h(str);
        bquuVar.C(str4);
        bquuVar.n(str5);
        bquuVar.B(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MessageData(Context context, cogw cogwVar, bahv bahvVar, bveg bvegVar, fcsu fcsuVar, cgvz cgvzVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, bahm bahmVar, String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, long j, long j2, clmw clmwVar, baro baroVar) {
        bahx bahxVarD = bahy.D();
        String strEncodeToString = Base64.encodeToString(clmwVar.toByteArray(), 3);
        strEncodeToString.getClass();
        bacm bacmVar = (bacm) bahxVarD;
        bacmVar.b = strEncodeToString;
        bacmVar.c = "application/x-end-of-emergency-proto";
        bahxVarD.n(elha.TEXT_PART);
        this(context, cogwVar, bahvVar, bvegVar, fcsuVar, cgvzVar, fcsuVar2, fcsuVar3, fcsuVar4, fcsuVar5, bahmVar, conversationIdType, str, selfIdentityId, i, 7, (List) ekgb.r(bahvVar.c(bahxVarD.q())), j2, j, true, true);
        this.j.ao(null);
        this.j.af(baroVar);
    }

    public MessageData(Context context, cogw cogwVar, bahv bahvVar, bveg bvegVar, fcsu fcsuVar, cgvz cgvzVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, bahm bahmVar, String str, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, boolean z, boolean z2, long j, long j2, String str3) {
        this(context, cogwVar, bahvVar, bvegVar, fcsuVar, cgvzVar, fcsuVar2, fcsuVar3, fcsuVar4, fcsuVar5, bahmVar, conversationIdType, str2, selfIdentityId, i, 0, aH(bahvVar, str3), j2, j, z, z2);
        this.j.ao(str == null ? null : Uri.parse(str));
    }

    public MessageData(Context context, cogw cogwVar, bahv bahvVar, bveg bvegVar, fcsu fcsuVar, cgvz cgvzVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, bahm bahmVar, String str, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, int i, boolean z, boolean z2, long j, long j2, String str2, baro baroVar) {
        this(context, cogwVar, bahvVar, bvegVar, fcsuVar, cgvzVar, fcsuVar2, fcsuVar3, fcsuVar4, fcsuVar5, bahmVar, conversationIdType, str, selfIdentityId, i, 7, aH(bahvVar, str2), j2, j, z, z2);
        this.j.ao(null);
        if (baroVar != null) {
            this.j.af(baroVar);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MessageData(Context context, cogw cogwVar, bahv bahvVar, bveg bvegVar, fcsu fcsuVar, cgvz cgvzVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, bahm bahmVar, String str, String str2, SelfIdentityId selfIdentityId, ConversationIdType conversationIdType, boolean z, int i, String str3, String str4, int i2, String str5, boolean z2, boolean z3, long j, int i3, long j2, long j3, long j4, String str6, bvdz bvdzVar, long j5) {
        this(context, cogwVar, bahvVar, bvegVar, fcsuVar, cgvzVar, fcsuVar2, fcsuVar3, fcsuVar4, fcsuVar5, bahmVar, conversationIdType, str2, selfIdentityId, i, true == z ? 2 : 1, ekoe.a, j4, j3, z2, z3);
        int i4 = ekgb.d;
        bquu bquuVar = this.j;
        bquuVar.z(str3);
        bquuVar.D(str4);
        bquuVar.ao(str == null ? null : Uri.parse(str));
        bquuVar.ap(i2);
        bquuVar.an(j);
        bquuVar.C(str5);
        bquuVar.A(j2);
        bquuVar.S(i3);
        bquuVar.B(str6);
        bquuVar.at(bvdzVar);
        bquuVar.as(j5);
        if (i == 104 || i == 6) {
            this.j.ae(j4);
        }
    }

    public MessageData(Context context, cogw cogwVar, bahv bahvVar, bveg bvegVar, fcsu fcsuVar, cgvz cgvzVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, bahm bahmVar, ConversationIdType conversationIdType, int i, long j, MessageIdType messageIdType) {
        this(context, cogwVar, bahvVar, bvegVar, fcsuVar, cgvzVar, fcsuVar2, fcsuVar4, fcsuVar5, fcsuVar6, bahmVar, conversationIdType, ((SelfIdentityIdImpl) ((bbdl) fcsuVar3.b()).d().f()).a, ((bbdl) fcsuVar3.b()).d().f(), i, e(i), dq(bahvVar, i, null), j, j, true, dr(i));
        bquu bquuVar = this.j;
        bquuVar.A(Long.MAX_VALUE);
        bquuVar.S(128);
        if (((Boolean) ((cczi) f.get()).e()).booleanValue()) {
            ekhx ekhxVar = avbn.b;
            Integer numValueOf = Integer.valueOf(i);
            ejwl.a(ekhxVar.contains(numValueOf));
            if (avbn.c.contains(numValueOf)) {
                boolean z = false;
                if (messageIdType != null && !messageIdType.c()) {
                    z = true;
                }
                ejwl.a(z);
                this.j.O(messageIdType);
            }
        }
    }
}
