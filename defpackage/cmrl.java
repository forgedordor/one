package defpackage;

import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Matcher;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmrl implements cmqj, cmrp {
    private final fcsu A;
    private final fcsu B;
    private final fcsu C;
    private final fcsu D;
    private final fcsu E;
    private final fcsu F;
    private final fcsu G;
    private final fcsu H;
    private final fcsu I;
    private final fcsu J;
    private final fcsu K;
    private final fcsu L;
    private final fcsu M;
    private final fcsu N;
    private final fcsu O;
    private final fcsu P;
    private final fcsu Q;
    private final fcsu R;
    private final Optional S;
    private final fcsu T;
    private final fcsu U;
    private final eosc V;
    private final eosc W;
    private final fcsu X;
    private final fcsu Y;
    private final fcsu Z;
    private final fcsu aa;
    private final fcsu ab;
    private final fcsu ac;
    public final fcsu h;
    public final fcsu i;
    public final fcsu j;
    public final fcsu k;
    public final apsl l;
    public final fcsu m;
    private Boolean q = null;
    private Boolean r = null;
    private final Context s;
    private final fcsu t;
    private final cogw u;
    private final egxv v;
    private final fcsu w;
    private final fcsu x;
    private final fcsu y;
    private final fcsu z;
    public static final cczi c = cdag.q(178041157, "handle_empty_recipients_from_telephony");
    public static final eksp d = eksp.c("Bugle");
    private static final cqce n = cqce.g("Bugle", "TelephonyManagerInterface");
    private static final String o = String.format(Locale.US, "((%s IN (%d, %d, %d, %d, %d)) AND (%s>=0))", BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, 1, 4, 6, 5, 2, "thread_id");
    private static final String p = String.format(Locale.US, "((%s IN (%d, %d, %d, %d)) AND (%s IN (%d, %d, %d)) AND (%s>=0))", "msg_box", 1, 4, 2, 5, "m_type", 128, 130, 132, "thread_id");
    static final String[] e = {"_id", "recipient_ids"};
    static final Uri f = Telephony.Threads.CONTENT_URI.buildUpon().appendQueryParameter("simple", "true").build();
    static final String[] g = {"archived"};

    public cmrl(Context context, egxv egxvVar, fcsu fcsuVar, cogw cogwVar, fcsu fcsuVar2, fcsu fcsuVar3, fcsu fcsuVar4, fcsu fcsuVar5, fcsu fcsuVar6, fcsu fcsuVar7, fcsu fcsuVar8, fcsu fcsuVar9, fcsu fcsuVar10, fcsu fcsuVar11, fcsu fcsuVar12, fcsu fcsuVar13, fcsu fcsuVar14, fcsu fcsuVar15, fcsu fcsuVar16, fcsu fcsuVar17, fcsu fcsuVar18, fcsu fcsuVar19, fcsu fcsuVar20, fcsu fcsuVar21, fcsu fcsuVar22, fcsu fcsuVar23, fcsu fcsuVar24, fcsu fcsuVar25, fcsu fcsuVar26, Optional optional, fcsu fcsuVar27, fcsu fcsuVar28, eosc eoscVar, eosc eoscVar2, fcsu fcsuVar29, fcsu fcsuVar30, fcsu fcsuVar31, fcsu fcsuVar32, fcsu fcsuVar33, fcsu fcsuVar34, fcsu fcsuVar35, apsl apslVar, fcsu fcsuVar36) {
        this.s = context;
        this.v = egxvVar;
        this.t = fcsuVar;
        this.u = cogwVar;
        this.w = fcsuVar2;
        this.x = fcsuVar3;
        this.y = fcsuVar4;
        this.z = fcsuVar5;
        this.A = fcsuVar6;
        this.B = fcsuVar7;
        this.C = fcsuVar8;
        this.D = fcsuVar9;
        this.E = fcsuVar10;
        this.F = fcsuVar11;
        this.G = fcsuVar12;
        this.H = fcsuVar13;
        this.I = fcsuVar14;
        this.h = fcsuVar15;
        this.i = fcsuVar16;
        this.j = fcsuVar17;
        this.J = fcsuVar18;
        this.K = fcsuVar19;
        this.L = fcsuVar22;
        this.M = fcsuVar23;
        this.N = fcsuVar20;
        this.O = fcsuVar21;
        this.P = fcsuVar24;
        this.Q = fcsuVar25;
        this.R = fcsuVar26;
        this.S = optional;
        this.T = fcsuVar27;
        this.U = fcsuVar28;
        this.V = eoscVar;
        this.W = eoscVar2;
        this.k = fcsuVar29;
        this.X = fcsuVar30;
        this.Y = fcsuVar31;
        this.Z = fcsuVar32;
        this.aa = fcsuVar33;
        this.ab = fcsuVar34;
        this.ac = fcsuVar35;
        this.l = apslVar;
        this.m = fcsuVar36;
    }

    private final String aA(long j, String str, String[] strArr) {
        Cursor cursorQuery;
        if (j <= 0 || (cursorQuery = aq().query(f, e, str, strArr, null)) == null) {
            return null;
        }
        while (cursorQuery.moveToNext()) {
            try {
                if (j == cursorQuery.getLong(0)) {
                    return cursorQuery.getString(1);
                }
            } finally {
                cursorQuery.close();
            }
        }
        return null;
    }

    private final void aB(Uri uri, Uri uri2, String str) {
        if (uri != null) {
            int iA = a(uri, "Bugle.Telephony.Delete.Message.Latency");
            cqbd cqbdVarA = n.a();
            cqbdVarA.I(str);
            cqbdVarA.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            cqbdVarA.A("updatedMessageUri", uri2);
            cqbdVarA.y("count", iA);
            cqbdVarA.r();
        }
    }

    private static boolean aC(List list) {
        return Collection.EL.stream(list).map(new Function() { // from class: cmra
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cczi ccziVar = cmrl.c;
                cczv cczvVar = alvx.a;
                return ejwk.b(((alqm) obj).p(((Boolean) new alvr().get()).booleanValue()));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).anyMatch(new Predicate() { // from class: cmrb
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
                return cssr.g((String) obj);
            }
        });
    }

    private final boolean aD(Uri uri) {
        Uri uri2;
        cqaz.l(uri);
        cqaz.k(!TextUtils.isEmpty("date_sent"));
        try {
            uri2 = uri;
            try {
                Cursor cursorC = cdzz.c(aq(), uri2, new String[]{"date_sent"}, null, null, a.x("date_sent", " ASC LIMIT 1"));
                if (cursorC != null) {
                    cursorC.close();
                }
                return true;
            } catch (SQLiteException e2) {
                e = e2;
                SQLiteException sQLiteException = e;
                cqbd cqbdVarE = n.e();
                cqbdVarE.I("date_sent in");
                cqbdVarE.I(uri2);
                cqbdVarE.I("does not exist");
                cqbdVarE.s(sQLiteException);
                return false;
            }
        } catch (SQLiteException e3) {
            e = e3;
            uri2 = uri;
        }
    }

    private final boolean aE(long j, long j2, Uri uri) {
        String[] strArr;
        String str;
        if (as(j, "thread_id", uri) == 0) {
            return true;
        }
        ContentResolver contentResolver = this.s.getContentResolver();
        if (j2 != Long.MAX_VALUE) {
            strArr = new String[]{Long.toString(j), Long.toString(j2)};
            str = "thread_id=? AND date<=?";
        } else {
            strArr = new String[]{Long.toString(j)};
            str = "thread_id=?";
        }
        return au(contentResolver, uri, str, strArr, "Bugle.Telephony.Delete.SmsBulk.Latency") > 0;
    }

    private final void aF(long[] jArr) {
        String[] strArr;
        int length = jArr.length;
        if (length == 0) {
            return;
        }
        Uri[] uriArr = {Telephony.Mms.CONTENT_URI, Telephony.Sms.CONTENT_URI};
        for (int i = 0; i < 2; i++) {
            Uri uri = uriArr[i];
            ainv ainvVarB = ((aipo) this.x.b()).b(true != uri.equals(Telephony.Mms.CONTENT_URI) ? "Bugle.Telephony.Delete.SmsBulk.Latency" : "Bugle.Telephony.Delete.MmsBulk.Latency");
            int i2 = 0;
            while (i2 < length) {
                int i3 = i2 + 128;
                int iMin = Math.min(i3, length) - i2;
                String str = String.format(Locale.US, "%s IN %s", "_id", ar(iMin));
                if (iMin <= 0) {
                    strArr = null;
                } else {
                    String[] strArr2 = new String[iMin];
                    for (int i4 = 0; i4 < iMin; i4++) {
                        strArr2[i4] = Long.toString(jArr[i2 + i4]);
                    }
                    strArr = strArr2;
                }
                at(aq(), uri, str, strArr);
                i2 = i3;
            }
            ainvVarB.c();
        }
    }

    private final int aG(final ContentResolver contentResolver, final Uri uri, final ContentValues contentValues, final String[] strArr) {
        Optional optionalA = ((cmro) this.ac.b()).a(new fdae() { // from class: cmqu
            public final /* synthetic */ String e = "thread_id=? AND read=0 AND date<=?";

            @Override // defpackage.fdae
            public final Object invoke() {
                cmrl cmrlVar = this.a;
                ContentResolver contentResolver2 = contentResolver;
                Uri uri2 = uri;
                ContentValues contentValues2 = contentValues;
                String str = this.e;
                String[] strArr2 = strArr;
                return cmrlVar.l.a() ? Integer.valueOf(cmrlVar.ap(contentResolver2, uri2, contentValues2, str, strArr2)) : Integer.valueOf(contentResolver2.update(uri2, contentValues2, str, strArr2));
            }
        });
        if (optionalA.isPresent()) {
            return ((Integer) optionalA.get()).intValue();
        }
        return 0;
    }

    private final int aH(ContentResolver contentResolver, Uri uri, ContentValues contentValues, String str) {
        ainv ainvVarB = ((aipo) this.x.b()).b(str);
        int iB = cdzz.b(contentResolver, uri, contentValues, null, null);
        ainvVarB.c();
        aK(uri);
        return iB;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.ekgb aI(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmrl.aI(java.lang.String):ekgb");
    }

    private final Uri aJ(Context context, lx lxVar, int i, String str, long j, long j2, String str2, boolean z, String str3) {
        SQLiteException sQLiteException;
        String str4;
        lj ljVar;
        final Uri uriG;
        Uri uri = null;
        try {
            try {
                try {
                    uriG = ((ceae) this.M.b()).g(lxVar, Telephony.Mms.Inbox.CONTENT_URI, i, str, j, null);
                } catch (lj e2) {
                    ljVar = e2;
                }
            } catch (lj e3) {
                str4 = "TelephonyManagerInterfaceImpl.java";
                ljVar = e3;
            }
        } catch (SQLiteException e4) {
            sQLiteException = e4;
        }
        try {
            ContentValues contentValues = new ContentValues(3);
            if (this.q == null) {
                this.q = Boolean.valueOf(aD(Telephony.Mms.CONTENT_URI));
            }
            if (this.q.booleanValue()) {
                contentValues.put("date_sent", Long.valueOf(lxVar.a.b(133)));
            }
            contentValues.put("date", Long.valueOf(j2));
            contentValues.put("ct_l", str2);
            long jB = lxVar.a.b(142);
            if (jB > 0) {
                contentValues.put("m_size", Long.valueOf(jB));
            }
            if (z && !TextUtils.isEmpty(str3) && crad.d()) {
                contentValues.put("m_id", str3);
            }
            apsl apslVar = this.l;
            if (apslVar.a()) {
                aH(context.getContentResolver(), uriG, contentValues, "Bugle.Telephony.Update.Field.Latency");
            } else {
                ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Update.Field.Latency");
                cdzz.b(context.getContentResolver(), uriG, contentValues, null, null);
                ainvVarB.c();
            }
            cqbd cqbdVarA = n.a();
            cqbdVarA.I("Inserted MMS message into telephony.");
            cqbdVarA.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uriG);
            cqbdVarA.r();
            if (z) {
                if (apslVar.a()) {
                    ((awlc) this.T.b()).d(new Consumer() { // from class: cmqv
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            cczi ccziVar = cmrl.c;
                            ((cmvv) obj).g(uriG);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return uriG;
                }
                this.S.ifPresent(new Consumer() { // from class: cmqx
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        cczi ccziVar = cmrl.c;
                        ((cmvv) ((fcsu) obj).b()).g(uriG);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return uriG;
            }
            if (apslVar.a()) {
                ((awlc) this.T.b()).d(new Consumer() { // from class: cmqy
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        cczi ccziVar = cmrl.c;
                        ((cmvv) obj).d(uriG);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return uriG;
            }
            this.S.ifPresent(new Consumer() { // from class: cmqz
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    cczi ccziVar = cmrl.c;
                    ((cmvv) ((fcsu) obj).b()).d(uriG);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return uriG;
        } catch (SQLiteException e5) {
            sQLiteException = e5;
            uri = uriG;
            ((eksl) ((eksl) ((eksl) d.i()).g(sQLiteException)).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "insertReceivedMessageInMmsTables", (char) 2627, "TelephonyManagerInterfaceImpl.java")).q("update mms received message failure");
            return uri;
        } catch (lj e6) {
            ljVar = e6;
            uri = uriG;
            str4 = "TelephonyManagerInterfaceImpl.java";
            ((eksl) ((eksl) ((eksl) d.i()).g(ljVar)).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "insertReceivedMessageInMmsTables", (char) 2624, str4)).q("persist mms received message failure");
            return uri;
        }
    }

    private final void aK(final Uri uri) {
        if (this.l.a()) {
            ((awlc) this.T.b()).d(new Consumer() { // from class: cmri
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    cczi ccziVar = cmrl.c;
                    ((cmvv) obj).k(uri);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            this.S.ifPresent(new Consumer() { // from class: cmrj
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    cczi ccziVar = cmrl.c;
                    ((cmvv) ((fcsu) obj).b()).k(uri);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        }
    }

    public static final String ar(int i) {
        if (i <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder("(?");
        for (int i2 = 0; i2 < i - 1; i2++) {
            sb.append(",?");
        }
        sb.append(")");
        return sb.toString();
    }

    private final int as(long j, String str, Uri uri) {
        String[] strArr;
        String strConcat;
        String[] strArr2;
        ContentResolver contentResolver = this.s.getContentResolver();
        Cursor cursorQuery = null;
        if (j == -1 || str == null) {
            strArr = new String[]{"_id"};
            strConcat = null;
            strArr2 = null;
        } else {
            strArr = new String[]{str};
            String[] strArr3 = {Long.toString(j)};
            strConcat = str.concat("=?");
            strArr2 = strArr3;
        }
        String[] strArr4 = strArr;
        try {
            ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Query.Count.Latency");
            cursorQuery = contentResolver.query(uri, strArr4, strConcat, strArr2, null);
            axie.l(cursorQuery);
            ainvVarB.c();
            int count = cursorQuery != null ? cursorQuery.getCount() : 0;
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return count;
        } finally {
        }
    }

    private final int at(ContentResolver contentResolver, final Uri uri, String str, String[] strArr) {
        try {
            ejwl.l(!(uri.getPathSegments().isEmpty() && str == null));
            int iDelete = contentResolver.delete(uri, str, strArr);
            cqbd cqbdVarC = n.c();
            cqbdVarC.I("Deleted messages from telephony");
            cqbdVarC.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            cqbdVarC.A("batchSelection", str);
            cqbdVarC.C("batchSelectionArgs", strArr);
            cqbdVarC.y("deletedCount", iDelete);
            cqbdVarC.r();
            if (iDelete > 0) {
                if (this.l.a()) {
                    ((awlc) this.T.b()).d(new Consumer() { // from class: cmre
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void z(Object obj) {
                            cczi ccziVar = cmrl.c;
                            ((cmvv) obj).b(uri);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return iDelete;
                }
                this.S.ifPresent(new Consumer() { // from class: cmrf
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        cczi ccziVar = cmrl.c;
                        ((cmvv) ((fcsu) obj).b()).b(uri);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            return iDelete;
        } catch (SQLiteException e2) {
            if (!((Boolean) cmvu.a.e()).booleanValue()) {
                throw e2;
            }
            cqbd cqbdVarB = n.b();
            cqbdVarB.I("Could not delete messages from telephony");
            cqbdVarB.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            cqbdVarB.s(e2);
            return 0;
        } catch (IllegalArgumentException e3) {
            cqbd cqbdVarB2 = n.b();
            cqbdVarB2.I("Could not delete messages from telephony");
            cqbdVarB2.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            cqbdVarB2.s(e3);
            return 0;
        } catch (Exception e4) {
            cqbd cqbdVarB3 = n.b();
            cqbdVarB3.I("Could not delete messages from telephony");
            cqbdVarB3.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            cqbdVarB3.s(e4);
            return 0;
        }
    }

    private final int au(ContentResolver contentResolver, Uri uri, String str, String[] strArr, String str2) {
        ainv ainvVarB = ((aipo) this.x.b()).b(str2);
        int iAt = at(contentResolver, uri, str, strArr);
        ainvVarB.c();
        return iAt;
    }

    private final int av(ContentResolver contentResolver, Uri uri, ContentValues contentValues, String str, String[] strArr, String str2) {
        ainv ainvVarB = ((aipo) this.x.b()).b(str2);
        int iUpdate = contentResolver.update(uri, contentValues, str, strArr);
        ainvVarB.c();
        aK(uri);
        return iUpdate;
    }

    private static long aw(Uri uri) {
        if (uri == null) {
            return -1L;
        }
        try {
            return ContentUris.parseId(uri);
        } catch (NumberFormatException | UnsupportedOperationException unused) {
            return -1L;
        }
    }

    private final Uri ax(Context context, lh lhVar, int i, String str, long j, String str2, Map map) {
        lj ljVar;
        Uri uri = null;
        try {
            Uri uriG = ((ceae) this.M.b()).g(lhVar, Telephony.Mms.Sent.CONTENT_URI, i, str, j, map);
            try {
                ContentValues contentValues = new ContentValues(3);
                contentValues.put("read", (Integer) 1);
                contentValues.put("seen", (Integer) 1);
                if (!TextUtils.isEmpty(str2) && crad.d()) {
                    contentValues.put("m_id", str2);
                }
                if (this.l.a()) {
                    aH(context.getContentResolver(), uriG, contentValues, "Bugle.Telephony.Update.Mms.Seen.Latency");
                    return uriG;
                }
                ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Update.Mms.Seen.Latency");
                cdzz.b(context.getContentResolver(), uriG, contentValues, null, null);
                ainvVarB.c();
                return uriG;
            } catch (lj e2) {
                ljVar = e2;
                uri = uriG;
                ((eksl) ((eksl) ((eksl) d.i()).g(ljVar)).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "insertSendReqInternal", (char) 1308, "TelephonyManagerInterfaceImpl.java")).q("persist mms sent message failure");
                return uri;
            }
        } catch (lj e3) {
            ljVar = e3;
        }
    }

    private final Uri ay(Context context, List list, final MessageCoreData messageCoreData, ceah ceahVar, long j, int i, String str, long j2, byte[] bArr, final boolean z) {
        final Uri uriL;
        byte[] bytes = bArr;
        eieu eieuVarK = eiiy.k("TelephonyManagerInterface.insertSendingMmsMessage");
        try {
            if (((Boolean) ((cczi) chxx.a.get()).e()).booleanValue() && !z && bytes != null && new String(bytes, StandardCharsets.US_ASCII).length() > 40) {
                ((eksl) ((eksl) d.j()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "insertSendingMessageInMmsTables", 1466, "TelephonyManagerInterfaceImpl.java")).q("MMS transaction IDs that are longer than 40 characters can not be sent over the network. Updating MMS Transaction ID as empty string");
                bytes = "".getBytes(StandardCharsets.US_ASCII);
                ((ains) this.Q.b()).c("Bugle.TelephonyManagerInterface.MmsSend.PduTransactionIdCheck.Failure.Count");
            }
            lz lzVarT = T((String[]) list.toArray(new String[list.size()]), messageCoreData, ceahVar, 604800L, messageCoreData.b(), j2, bytes);
            Uri uri = null;
            if (lzVarT != null) {
                HashMap map = new HashMap();
                if (z) {
                    uriL = ax(context, lzVarT, i, str, j, messageCoreData.F().b, map);
                    map = map;
                } else {
                    uriL = l(context, lzVarT, i, str, j, map);
                }
                if (uriL != null) {
                    final Uri uriWithAppendedId = ContentUris.withAppendedId(Telephony.Mms.CONTENT_URI, ContentUris.parseId(uriL));
                    final HashMap map2 = new HashMap();
                    for (MessagePartCoreData messagePartCoreData : messageCoreData.M()) {
                        Uri uriT = messagePartCoreData.t();
                        if (uriT != null) {
                            map2.put(uriT, messagePartCoreData);
                        }
                    }
                    if (map2.size() != map.size()) {
                        cqbd cqbdVarE = n.e();
                        cqbdVarE.I("Can't update content uri for all parts.");
                        cqbdVarE.d(messageCoreData.C());
                        cqbdVarE.w(messageCoreData.t());
                        cqbdVarE.y("partCount", map2.size());
                        cqbdVarE.y("updatedPartCount", map.size());
                        cqbdVarE.r();
                    }
                    final HashMap map3 = map;
                    uri = uriWithAppendedId;
                    ((dqsn) this.L.b()).d("TelephonyManagerInterface#updateMessageAndPartsUriFromTelephony", new Runnable() { // from class: cmqp
                        @Override // java.lang.Runnable
                        public final void run() {
                            cmrl cmrlVar = this.a;
                            baxe baxeVar = (baxe) cmrlVar.i.b();
                            MessageCoreData messageCoreData2 = messageCoreData;
                            ConversationIdType conversationIdTypeA = messageCoreData2.A();
                            MessageIdType messageIdTypeC = messageCoreData2.C();
                            String[] strArr = MessagesTable.a;
                            brdu brduVar = new brdu();
                            brduVar.ap("updateMessageAndPartsUriFromTelephony");
                            brduVar.S(uriWithAppendedId);
                            baxeVar.V(conversationIdTypeA, messageIdTypeC, brduVar);
                            for (Map.Entry entry : map3.entrySet()) {
                                Map map4 = map2;
                                MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) map4.get(entry.getKey());
                                if (messagePartCoreData2 != null) {
                                    ((bbae) cmrlVar.h.b()).e(messageCoreData2, messagePartCoreData2, messagePartCoreData2.t(), (Uri) entry.getValue());
                                }
                            }
                            ((baqi) cmrlVar.j.b()).b(messageCoreData2.A(), false, bvdk.UNARCHIVED);
                        }
                    });
                    final boolean z2 = false;
                    if (messageCoreData.cl() && !messageCoreData.cE()) {
                        z2 = true;
                    }
                    cqbd cqbdVarA = n.a();
                    cqbdVarA.I("Inserted outgoing");
                    cqbdVarA.I(z ? "RCS" : "MMS");
                    cqbdVarA.I(z2 ? "file transfer" : " text message");
                    cqbdVarA.I("into telephony.");
                    cqbdVarA.A("outboxUri", uriL);
                    cqbdVarA.r();
                    messageCoreData.aI();
                    if (this.l.a()) {
                        ((awlc) this.T.b()).d(new Consumer() { // from class: cmqs
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                cmvv cmvvVar = (cmvv) obj;
                                cczi ccziVar = cmrl.c;
                                if (z) {
                                    Uri uri2 = uriL;
                                    if (z2) {
                                        cmvvVar.h(uri2);
                                    } else {
                                        cmvvVar.g(uri2);
                                    }
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    } else {
                        this.S.ifPresent(new Consumer() { // from class: cmqt
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void z(Object obj) {
                                fcsu fcsuVar = (fcsu) obj;
                                cczi ccziVar = cmrl.c;
                                if (z) {
                                    Uri uri2 = uriL;
                                    if (z2) {
                                        ((cmvv) fcsuVar.b()).h(uri2);
                                    } else {
                                        ((cmvv) fcsuVar.b()).g(uri2);
                                    }
                                }
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                } else {
                    n.n("failed to persist message into telephony");
                }
            }
            eieuVarK.close();
            return uri;
        } catch (Throwable th) {
            try {
                eieuVarK.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    private static axcy az(bbdl bbdlVar, SelfIdentityId selfIdentityId) {
        axcy axcyVarE = bbdlVar.e(selfIdentityId);
        return axcyVarE == null ? bbdlVar.d() : axcyVarE;
    }

    @Override // defpackage.cmqj
    public final String A(cmtz cmtzVar, String str) {
        return (String) ah(cmtzVar, str).map(new Function() { // from class: cmrk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cczv cczvVar = alvx.a;
                return ((alqm) obj).k(((Boolean) new aluj().get()).booleanValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(null);
    }

    @Override // defpackage.cmqj
    public final String B() {
        return p;
    }

    @Override // defpackage.cmqj
    public final String C(long j) {
        String strAA = aA(j, "_id=?", new String[]{String.valueOf(j)});
        if (strAA == null) {
            strAA = aA(j, null, null);
        }
        if (TextUtils.isEmpty(strAA) && j > 0) {
            ((ains) this.Q.b()).c("Bugle.Telephony.Thread.Recipients.LookupFailed");
        }
        return strAA;
    }

    @Override // defpackage.cmqj
    public final String D(cnqj cnqjVar) {
        return C(cnqk.a(cnqjVar));
    }

    @Override // defpackage.cmqj
    public final String E() {
        return o;
    }

    @Override // defpackage.cmqj
    public final Map F() {
        HashMap map = new HashMap();
        Cursor cursorQuery = aq().query(f, e, null, null, null);
        while (cursorQuery != null) {
            try {
                if (!cursorQuery.moveToNext()) {
                    break;
                }
                int columnIndex = cursorQuery.getColumnIndex("recipient_ids");
                ejwl.x(columnIndex, cursorQuery.getColumnCount());
                String string = cursorQuery.getString(columnIndex);
                string.getClass();
                if (ejxk.b(' ').i(string).size() <= 1) {
                    List listU = U(string);
                    if (listU.size() != 1) {
                        cqbd cqbdVarE = n.e();
                        cqbdVarE.I("More than one messaging identity returned for a single recipient ID.");
                        cqbdVarE.A("recipientId", string);
                        cqbdVarE.N("identities", listU);
                        cqbdVarE.r();
                    } else {
                        ciuw ciuwVar = (ciuw) this.U.b();
                        alqm alqmVar = (alqm) listU.get(0);
                        cczv cczvVar = alvx.a;
                        if (ciuwVar.b(ejwk.b(alqmVar.i(((Boolean) new alvr().get()).booleanValue())))) {
                            int columnIndex2 = cursorQuery.getColumnIndex("_id");
                            ejwl.x(columnIndex2, cursorQuery.getColumnCount());
                            long j = cursorQuery.getLong(columnIndex2);
                            cqbd cqbdVarA = n.a();
                            cqbdVarA.I("Found a RCS group conversation");
                            cqbdVarA.z("threadId", j);
                            cqbdVarA.N("identity", listU.get(0));
                            cqbdVarA.r();
                            map.put(Long.valueOf(j), (alqm) listU.get(0));
                        }
                    }
                }
            } finally {
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return map;
    }

    @Override // defpackage.cmqj
    public final void G(Context context, Uri uri) {
        ContentValues contentValues = new ContentValues(1);
        contentValues.putNull("st");
        if (this.l.a()) {
            aH(context.getContentResolver(), uri, contentValues, "Bugle.Telephony.Update.Mms.Status.Latency");
            return;
        }
        ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Update.Mms.Status.Latency");
        cdzz.b(context.getContentResolver(), uri, contentValues, null, null);
        ainvVarB.c();
    }

    @Override // defpackage.cmqj
    public final void H(ctz ctzVar) {
        int iB = ctzVar.b();
        int i = 0;
        while (i < iB) {
            int i2 = i + 128;
            int iMin = Math.min(i2, iB) - i;
            String str = String.format(Locale.US, "%s != '%s' AND %s IN %s", "ct", "application/smil", "mid", ar(iMin));
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < iMin; i3++) {
                int i4 = i + i3;
                List list = ((cmny) ctzVar.e(i4)).x;
                if (((cmny) ctzVar.e(i4)).x.isEmpty()) {
                    arrayList.add(Long.toString(((cmny) ctzVar.e(i4)).b));
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            Cursor cursorC = cdzz.c(this.s.getContentResolver(), cmqj.a, cmnz.a, str, (String[]) arrayList.toArray(new String[arrayList.size()]), null);
            axie.l(cursorC);
            if (cursorC != null) {
                while (cursorC.moveToNext()) {
                    try {
                        cmnz cmnzVarA = ((cmoe) this.H.b()).a();
                        cmnzVarA.b(cursorC, false);
                        cmny cmnyVar = (cmny) ctzVar.d(cmnzVarA.d);
                        if (cmnyVar != null && (!cmnzVarA.e() || !TextUtils.isEmpty(cmnzVarA.f))) {
                            cmnyVar.i(cmnzVarA);
                        }
                    } finally {
                        cursorC.close();
                    }
                }
            }
            i = i2;
        }
    }

    @Override // defpackage.cmqj
    public final void I(long j, long j2) {
        ContentValues contentValues = new ContentValues(1);
        long j3 = j2 / 1000;
        if (j3 == 0) {
            ((ains) this.Q.b()).e("Bugle.Telephony.Timestamp0.Mms", 5);
            j3 = 0;
        }
        contentValues.put("date", Long.valueOf(j3));
        if (this.l.a()) {
            av(aq(), Telephony.Mms.CONTENT_URI, contentValues, "_id=?", new String[]{Long.toString(j)}, "Bugle.Telephony.Update.Field.Latency");
            return;
        }
        ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Update.Field.Latency");
        aq().update(Telephony.Mms.CONTENT_URI, contentValues, "_id=?", new String[]{Long.toString(j)});
        ainvVarB.c();
    }

    @Override // defpackage.cmqj
    @Deprecated
    public final void J(Uri uri, String str) {
        int iAH;
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("tr_id", str);
            if (this.l.a()) {
                iAH = aH(this.s.getContentResolver(), uri, contentValues, "Bugle.Telephony.Update.Field.Latency");
            } else {
                ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Update.Field.Latency");
                int iB = cdzz.b(this.s.getContentResolver(), uri, contentValues, null, null);
                ainvVarB.c();
                iAH = iB;
            }
            if (iAH == 1) {
                ((eksl) ((eksl) d.h()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionIdLegacy", 4115, "TelephonyManagerInterfaceImpl.java")).t("Updated MMS transaction ID. Message URI: %s", uri);
            } else if (iAH > 1) {
                ((eksl) ((eksl) d.j()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionIdLegacy", 4117, "TelephonyManagerInterfaceImpl.java")).t("Multiple MMS transaction IDs updated. Message URI: %s", uri);
            } else {
                ((eksl) ((eksl) d.j()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionIdLegacy", 4121, "TelephonyManagerInterfaceImpl.java")).t("Failed to update MMS transaction ID. Message URI: %s", uri);
            }
        } catch (SQLiteException | IllegalArgumentException e2) {
            ((eksl) ((eksl) ((eksl) d.j()).g(e2)).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionIdLegacy", (char) 4124, "TelephonyManagerInterfaceImpl.java")).q("Update MMS Transaction ID failure");
        }
    }

    @Override // defpackage.cmqj
    public final void K(Uri uri, int i, long j) {
        if (uri == null) {
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", Integer.valueOf(i));
        if (O()) {
            contentValues.put("date_sent", Long.valueOf(j));
        }
        if (this.l.a()) {
            av(aq(), uri, contentValues, null, null, "Bugle.Telephony.Update.Field.Latency");
            return;
        }
        ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Update.Field.Latency");
        aq().update(uri, contentValues, null, null);
        ainvVarB.c();
    }

    @Override // defpackage.cmqj
    @Deprecated
    public final void L(long j, boolean z) {
        if (!((crmx) this.E.b()).G()) {
            cqbd cqbdVarE = n.e();
            cqbdVarE.I("Not default SMS app. Cannot update archive status of thread in Telephony.");
            cqbdVarE.B("isArchived", z);
            cqbdVarE.z("threadId", j);
            cqbdVarE.r();
            return;
        }
        if (!((crma) this.t.b()).p()) {
            cqbd cqbdVarE2 = n.e();
            cqbdVarE2.I("No SMS permissions. Cannot update archive status of thread in Telephony.");
            cqbdVarE2.B("isArchived", z);
            cqbdVarE2.z("threadId", j);
            cqbdVarE2.r();
            return;
        }
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("archived", Integer.valueOf(z ? 1 : 0));
        try {
        } catch (Exception e2) {
            e = e2;
        }
        try {
            if (this.l.a()) {
                av(aq(), Telephony.Threads.CONTENT_URI, contentValues, "_id=?", new String[]{Long.toString(j)}, "Bugle.Telephony.Update.FieldBulk.Latency");
                return;
            }
            ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Update.FieldBulk.Latency");
            aq().update(Telephony.Threads.CONTENT_URI, contentValues, "_id=?", new String[]{Long.toString(j)});
            ainvVarB.c();
        } catch (Exception e3) {
            e = e3;
            cqbd cqbdVarB = n.b();
            cqbdVarB.I("Error updating archive status of thread in Telephony. Missing Archive column?");
            cqbdVarB.B("isArchived", z);
            cqbdVarB.z("threadId", j);
            cqbdVarB.s(e);
        }
    }

    @Override // defpackage.cmqj
    public final void M(cnqj cnqjVar, boolean z) {
        L(cnqk.a(cnqjVar), z);
    }

    @Override // defpackage.cmqj
    public final boolean N(long j, long j2) {
        ((cmot) this.B.b()).j();
        return aE(j, j2, Telephony.Sms.CONTENT_URI) || aE(j, j2 != Long.MAX_VALUE ? j2 / 1000 : Long.MAX_VALUE, Telephony.Mms.CONTENT_URI);
    }

    @Override // defpackage.cmqj
    public final boolean O() {
        if (this.r == null) {
            this.r = Boolean.valueOf(aD(Telephony.Sms.CONTENT_URI));
        }
        return this.r.booleanValue();
    }

    @Override // defpackage.cmqj
    public final boolean P(cnqj cnqjVar) {
        Uri.Builder builderBuildUpon = Telephony.Threads.CONTENT_URI.buildUpon();
        builderBuildUpon.appendPath(String.valueOf(cnqk.a(cnqjVar))).appendPath("recipients");
        try {
            Cursor cursorQuery = aq().query(builderBuildUpon.build(), g, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        boolean z = cursorQuery.getInt(0) == 1;
                        cursorQuery.close();
                        return z;
                    }
                } finally {
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception e2) {
            cqbd cqbdVarB = n.b();
            cqbdVarB.I("Error getting the archived status of a thread in Telephony.");
            cqbdVarB.A("threadId", cnqjVar);
            cqbdVarB.s(e2);
        }
        return false;
    }

    @Override // defpackage.cmqj
    public final boolean Q(Context context, Uri uri, int i, long j) {
        Throwable th;
        ContentResolver contentResolver;
        ContentValues contentValues;
        long j2;
        Uri uri2;
        int iAv;
        try {
            contentResolver = context.getContentResolver();
            contentValues = new ContentValues();
            j2 = j / 1000;
            contentValues.put("msg_box", Integer.valueOf(i));
            if (j2 == 0) {
                try {
                    ((ains) this.Q.b()).e("Bugle.Telephony.Timestamp0.Mms", 4);
                    j2 = 0;
                } catch (SQLiteException | IllegalArgumentException e2) {
                    th = e2;
                    n.o("update mms message failure", th);
                    return false;
                }
            }
            contentValues.put("date", Long.valueOf(j2));
        } catch (SQLiteException | IllegalArgumentException e3) {
            e = e3;
        }
        try {
            if (this.l.a()) {
                uri2 = uri;
                iAv = av(contentResolver, uri2, contentValues, null, null, "Bugle.Telephony.Update.Field.Latency");
            } else {
                uri2 = uri;
                ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Update.Field.Latency");
                int iUpdate = contentResolver.update(uri2, contentValues, null, null);
                ainvVarB.c();
                aK(uri2);
                iAv = iUpdate;
            }
            if (iAv != 1) {
                return false;
            }
            cqbd cqbdVarA = n.a();
            cqbdVarA.I("Updated sending MMS.");
            cqbdVarA.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri2);
            cqbdVarA.y("box", i);
            cqbdVarA.z("date (secs since epoch)", j2);
            cqbdVarA.r();
            return true;
        } catch (SQLiteException e4) {
            e = e4;
            th = e;
            n.o("update mms message failure", th);
            return false;
        } catch (IllegalArgumentException e5) {
            e = e5;
            th = e;
            n.o("update mms message failure", th);
            return false;
        }
    }

    @Override // defpackage.cmqj
    public final boolean R(Uri uri, String str) {
        int iAH;
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("tr_id", str);
            if (this.l.a()) {
                iAH = aH(this.s.getContentResolver(), uri, contentValues, "Bugle.Telephony.Update.Field.Latency");
            } else {
                ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Update.Field.Latency");
                int iB = cdzz.b(this.s.getContentResolver(), uri, contentValues, null, null);
                ainvVarB.c();
                iAH = iB;
            }
            if (iAH <= 0) {
                ((eksl) ((eksl) d.j()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionId", 4157, "TelephonyManagerInterfaceImpl.java")).t("Failed to update MMS transaction ID. Message URI: %s", uri);
                return false;
            }
            if (iAH == 1) {
                ((eksl) ((eksl) d.h()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionId", 4162, "TelephonyManagerInterfaceImpl.java")).t("Updated MMS transaction ID. Message URI: %s", uri);
            } else {
                ((eksl) ((eksl) d.j()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionId", 4164, "TelephonyManagerInterfaceImpl.java")).t("Multiple MMS transaction IDs updated. Message URI: %s", uri);
            }
            return true;
        } catch (SQLiteException | IllegalArgumentException e2) {
            ((eksl) ((eksl) ((eksl) d.j()).g(e2)).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "updateMmsTransactionId", (char) 4169, "TelephonyManagerInterfaceImpl.java")).q("Update MMS Transaction ID failure");
            return false;
        }
    }

    @Override // defpackage.cmqj
    public final String[] S(Context context, ll llVar) {
        byte[] bArrF = llVar.f();
        if (bArrF == null) {
            return null;
        }
        String str = new String(bArrF);
        long epochMilli = this.u.f().toEpochMilli() / 1000;
        String[] strArr = {Integer.toString(130), Long.toString(epochMilli), Long.toString((-604800) + epochMilli), Long.toString(epochMilli + 604800), str};
        ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Query.Mms.Latency");
        try {
            Cursor cursorC = cdzz.c(context.getContentResolver(), Telephony.Mms.CONTENT_URI, new String[]{"_id"}, "((m_type<>?) OR (exp>?)) AND (date>?) AND (date<?) AND (ct_l=?)", strArr, null);
            try {
                axie.l(cursorC);
                ainvVarB.c();
                cursorC.getClass();
                int count = cursorC.getCount();
                if (count <= 0) {
                    cursorC.close();
                    return null;
                }
                int iMin = Math.min(count, 32);
                String[] strArr2 = new String[iMin];
                for (int i = 0; cursorC.moveToNext() && i < iMin; i++) {
                    String string = cursorC.getString(0);
                    string.getClass();
                    strArr2[i] = string;
                }
                cursorC.close();
                return strArr2;
            } finally {
            }
        } catch (SQLiteException e2) {
            n.o("query failure.", e2);
            return null;
        }
    }

    @Override // defpackage.cmqj
    public final lz T(String[] strArr, MessageCoreData messageCoreData, ceah ceahVar, long j, int i, long j2, byte[] bArr) {
        int length;
        if (strArr == null || (length = strArr.length) <= 0) {
            throw new IllegalArgumentException("MMS sendReq no recipient");
        }
        String[] strArr2 = new String[length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            if (cssc.a(str)) {
                strArr2[i2] = str;
            } else if (str != null) {
                int length2 = str.length();
                StringBuilder sb = new StringBuilder(length2);
                for (int i3 = 0; i3 < length2; i3++) {
                    char cCharAt = str.charAt(i3);
                    if (Character.isLetterOrDigit(cCharAt) || cCharAt == '+' || cCharAt == '*') {
                        sb.append(cCharAt);
                    } else if (cCharAt == '#') {
                        cCharAt = '#';
                        sb.append(cCharAt);
                    }
                }
                strArr2[i2] = sb.toString();
            }
        }
        try {
            lz lzVar = new lz();
            axcy axcyVarAz = az((bbdl) this.X.b(), messageCoreData.v());
            final alrj alrjVar = (alrj) this.k.b();
            Optional optionalB = axcyVarAz.b();
            alrjVar.getClass();
            Optional map = optionalB.map(new Function() { // from class: axcx
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return alrjVar.k((alqm) obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            if (map.isPresent()) {
                alqm alqmVar = (alqm) map.get();
                cczv cczvVar = alvx.a;
                String strM = alqmVar.m(((Boolean) new alvd().get()).booleanValue());
                cqbd cqbdVarD = n.d();
                cqbdVarD.I("createSendReq: from");
                cqbdVarD.k(strM);
                cqbdVarD.r();
                lzVar.b(new lg(ejwk.b(strM)));
            }
            lg[] lgVarArrF = lg.f(strArr2);
            if (lgVarArrF != null) {
                lzVar.a.n(lgVarArrF);
            }
            if (!TextUtils.isEmpty(messageCoreData.av())) {
                lzVar.g(new lg(messageCoreData.av()));
            }
            lzVar.f(j2 / 1000);
            lzVar.b = ceahVar.b;
            long j3 = ceahVar.a;
            lq lqVar = lzVar.a;
            lqVar.h(j3, 142);
            lqVar.j("personal".getBytes(), 138);
            lqVar.h(j, 136);
            lzVar.a.i(i, 143);
            lqVar.i(129, 134);
            lqVar.i(129, 144);
            if (messageCoreData.cX()) {
                lzVar.e();
            }
            if (bArr != null) {
                lzVar.h(bArr);
            }
            return lzVar;
        } catch (lj e2) {
            ((eksl) ((eksl) ((eksl) d.i()).g(e2)).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "createMmsSendReq", (char) 1739, "TelephonyManagerInterfaceImpl.java")).q("MmsException creating sendReq PDU");
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0013 A[SYNTHETIC] */
    @Override // defpackage.cmqj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List U(java.lang.String r12) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmrl.U(java.lang.String):java.util.List");
    }

    @Override // defpackage.cmqj
    public final Uri V(Context context, lx lxVar, int i, String str, long j, long j2, String str2, int i2) {
        long j3;
        if (j2 == 0) {
            ((ains) this.Q.b()).e("Bugle.Telephony.Timestamp0.Mms", 2);
            j3 = 0;
        } else {
            j3 = j2;
        }
        return aJ(context, lxVar, i, str, j, j3, null, true, str2);
    }

    @Override // defpackage.cmqj
    public final Uri W(Context context, List list, MessageCoreData messageCoreData, ceah ceahVar, long j, int i, String str, long j2) {
        return ay(context, list, messageCoreData, ceahVar, j, i, str, j2, null, false);
    }

    @Override // defpackage.cmqj
    public final void X(long j, long j2) {
        ContentResolver contentResolverAq;
        String[] strArr;
        ContentValues contentValues;
        apsl apslVar;
        cmrl cmrlVar;
        int iAv;
        int iAv2;
        cqaz.e(-1L, j);
        cqaz.e(-1L, j2);
        try {
            contentResolverAq = aq();
            strArr = new String[]{Long.toString(j)};
            contentValues = new ContentValues(2);
            contentValues.put("thread_id", Long.valueOf(j2));
            apslVar = this.l;
        } catch (SQLiteException | IllegalArgumentException e2) {
            e = e2;
        }
        try {
            if (apslVar.a()) {
                cmrlVar = this;
                iAv = cmrlVar.av(contentResolverAq, Telephony.Sms.CONTENT_URI, contentValues, "thread_id=?", strArr, "Bugle.Telephony.Update.FieldBulk.Latency");
            } else {
                cmrlVar = this;
                ainv ainvVarB = ((aipo) cmrlVar.x.b()).b("Bugle.Telephony.Update.FieldBulk.Latency");
                int iUpdate = contentResolverAq.update(Telephony.Sms.CONTENT_URI, contentValues, "thread_id=?", strArr);
                ainvVarB.c();
                aK(Telephony.Sms.CONTENT_URI);
                iAv = iUpdate;
            }
            if (apslVar.a()) {
                iAv2 = cmrlVar.av(contentResolverAq, Telephony.Mms.CONTENT_URI, contentValues, "thread_id=?", strArr, "Bugle.Telephony.Update.FieldBulk.Latency");
            } else {
                ainv ainvVarB2 = ((aipo) cmrlVar.x.b()).b("Bugle.Telephony.Update.FieldBulk.Latency");
                int iUpdate2 = contentResolverAq.update(Telephony.Mms.CONTENT_URI, contentValues, "thread_id=?", strArr);
                ainvVarB2.c();
                aK(Telephony.Mms.CONTENT_URI);
                iAv2 = iUpdate2;
            }
            contentResolverAq.notifyChange(Telephony.Sms.CONTENT_URI, null);
            contentResolverAq.notifyChange(Telephony.Mms.CONTENT_URI, null);
            cqbd cqbdVarA = n.a();
            cqbdVarA.I("Moved messages.");
            cqbdVarA.y("smsCount", iAv);
            cqbdVarA.y("mmsCount", iAv2);
            cqbdVarA.z("oldThreadId", j);
            cqbdVarA.z("newThreadId", j2);
            cqbdVarA.r();
        } catch (SQLiteException e3) {
            e = e3;
            n.o("move message failure ", e);
        } catch (IllegalArgumentException e4) {
            e = e4;
            n.o("move message failure ", e);
        }
    }

    @Override // defpackage.cmqj
    public final void Y(Uri uri) {
        if (!((crmx) this.E.b()).G() || !((crma) this.t.b()).p()) {
            cqbd cqbdVarE = n.e();
            cqbdVarE.I("Has no permission to set read status in Telephony.");
            cqbdVarE.A("messageUri", uri);
            cqbdVarE.r();
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("read", (Integer) 1);
        contentValues.put("seen", (Integer) 1);
        ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Update.Field.Latency");
        int iUpdate = aq().update(uri, contentValues, "read=0", null);
        ainvVarB.c();
        aK(uri);
        if (iUpdate > 1) {
            cqbd cqbdVarE2 = n.e();
            cqbdVarE2.I(a.g(iUpdate, "Unexpectedly marked more than one message as read: "));
            cqbdVarE2.A("messageUri", uri);
            cqbdVarE2.r();
        }
    }

    @Override // defpackage.cmqj
    public final void Z(Context context, Uri uri, long j) {
        Uri uri2;
        int iAv;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            ContentValues contentValues = new ContentValues(1);
            long j2 = j / 1000;
            contentValues.put("exp", Long.valueOf(j2));
            try {
                if (this.l.a()) {
                    uri2 = uri;
                    iAv = av(contentResolver, uri2, contentValues, null, null, "Bugle.Telephony.Update.Field.Latency");
                } else {
                    uri2 = uri;
                    ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Update.Field.Latency");
                    int iUpdate = contentResolver.update(uri2, contentValues, null, null);
                    ainvVarB.c();
                    aK(uri2);
                    iAv = iUpdate;
                }
                if (iAv == 1) {
                    return;
                }
                cqbd cqbdVarE = n.e();
                cqbdVarE.I("updateMmsMessageExpiry - Expect one, but updated.");
                cqbdVarE.y("cnt", iAv);
                cqbdVarE.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri2);
                cqbdVarE.z("expiry (secs since epoch)", j2);
                cqbdVarE.r();
            } catch (SQLiteException e2) {
                e = e2;
                n.o("update mms message expiry failure", e);
            } catch (IllegalArgumentException e3) {
                e = e3;
                n.o("update mms message expiry failure", e);
            }
        } catch (SQLiteException | IllegalArgumentException e4) {
            e = e4;
        }
    }

    @Override // defpackage.cmqj
    public final int a(Uri uri, String str) {
        return au(aq(), uri, null, null, str);
    }

    @Override // defpackage.cmqj
    public final chvf aa(Context context, Uri uri, ly lyVar) {
        lq lqVar = lyVar.a;
        int iA = lqVar.a(146);
        int i = 2;
        ContentValues contentValues = new ContentValues(2);
        contentValues.put("resp_st", Integer.valueOf(iA));
        byte[] bArrK = lqVar.k(139);
        if (bArrK != null && bArrK.length > 0) {
            contentValues.put("m_id", ceae.c(bArrK));
        }
        if (this.l.a()) {
            aH(context.getContentResolver(), uri, contentValues, "Bugle.Telephony.Update.Field.Latency");
        } else {
            ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Update.Field.Latency");
            cdzz.b(context.getContentResolver(), uri, contentValues, null, null);
            ainvVarB.c();
        }
        if (iA == 128) {
            i = 0;
        } else if (iA == 192 || iA == 195 || iA == 196) {
            cqbd cqbdVarE = n.e();
            cqbdVarE.I("Response status indicates transient error, setting message send status to AUTO_RETRY");
            cqbdVarE.y("responseStatus", iA);
            cqbdVarE.r();
            i = 1;
        } else {
            cqbd cqbdVarB = n.b();
            cqbdVarB.I("failed to send message. respStatus: 0x");
            cqbdVarB.v(Integer.toHexString(iA));
            cqbdVarB.r();
        }
        chve chveVarJ = chvf.j(i, iA);
        ((chue) chveVarJ).c = uri;
        return chveVarJ.a();
    }

    @Override // defpackage.cmqj
    public final boolean ab(Uri uri, int i, long j) {
        ContentValues contentValues;
        Uri uri2;
        int iAv;
        try {
            contentValues = new ContentValues(2);
            contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, Integer.valueOf(i));
            contentValues.put("date", Long.valueOf(j));
        } catch (SQLiteException | IllegalArgumentException e2) {
            e = e2;
        }
        try {
            if (this.l.a()) {
                uri2 = uri;
                iAv = av(aq(), uri2, contentValues, null, null, "Bugle.Telephony.Update.Field.Latency");
            } else {
                uri2 = uri;
                ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Update.Field.Latency");
                int iUpdate = aq().update(uri2, contentValues, null, null);
                ainvVarB.c();
                aK(uri2);
                iAv = iUpdate;
            }
            if (iAv != 1) {
                return false;
            }
            cqbd cqbdVarA = n.a();
            cqbdVarA.I("Updated sending SMS.");
            cqbdVarA.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri2);
            cqbdVarA.y(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, i);
            cqbdVarA.z("date (ms since epoch)", j);
            cqbdVarA.r();
            return true;
        } catch (SQLiteException e3) {
            e = e3;
            n.o("update sms message failure", e);
            return false;
        } catch (IllegalArgumentException e4) {
            e = e4;
            n.o("update sms message failure", e);
            return false;
        }
    }

    @Override // defpackage.cmqj
    public final void ac(Uri uri, long j) throws IOException {
        ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Query.Field.Latency");
        Cursor cursorQuery = aq().query(uri, new String[]{"thread_id", "date"}, null, null, null);
        axie.l(cursorQuery);
        ainvVarB.c();
        try {
            if (cursorQuery == null) {
                cqbd cqbdVarB = n.b();
                cqbdVarB.I("Error finding thread for");
                cqbdVarB.I(uri);
                cqbdVarB.r();
            } else if (cursorQuery.getCount() != 1) {
                cqbd cqbdVarB2 = n.b();
                cqbdVarB2.I("Found");
                cqbdVarB2.G(cursorQuery.getCount());
                cqbdVarB2.I("threads for");
                cqbdVarB2.I(uri);
                cqbdVarB2.r();
            } else if (cursorQuery.moveToFirst()) {
                int columnIndex = cursorQuery.getColumnIndex("thread_id");
                ejwl.x(columnIndex, cursorQuery.getColumnCount());
                long j2 = cursorQuery.getLong(columnIndex);
                long j3 = j(j2, j);
                cqbd cqbdVarA = n.a();
                cqbdVarA.H(j3);
                cqbdVarA.I("messages as read for thread");
                cqbdVarA.H(j2);
                cqbdVarA.r();
            } else {
                cqbd cqbdVarB3 = n.b();
                cqbdVarB3.I("Failed to advance cursor for");
                cqbdVarB3.I(uri);
                cqbdVarB3.r();
            }
        } finally {
            cqdo.a(cursorQuery);
        }
    }

    @Override // defpackage.cmqj
    public final void ad() {
        String str = String.format(Locale.US, "%s AND (%s IN (SELECT %s FROM part WHERE %s))", p, "_id", "mid", String.format(Locale.US, "((%s LIKE '%s') OR (%s LIKE '%s') OR (%s LIKE '%s') OR (%s='%s'))", "ct", "image/%", "ct", "video/%", "ct", "audio/%", "ct", "application/ogg"));
        ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Query.PartsBulk.Latency");
        Cursor cursorQuery = aq().query(Telephony.Mms.CONTENT_URI, new String[]{"_id"}, str, null, null);
        axie.l(cursorQuery);
        ainvVarB.c();
        if (cursorQuery != null) {
            long[] jArr = new long[cursorQuery.getCount()];
            int i = 0;
            while (cursorQuery.moveToNext()) {
                try {
                    int i2 = i + 1;
                    jArr[i] = cursorQuery.getLong(0);
                    i = i2;
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
            cursorQuery.close();
            aF(jArr);
        }
    }

    @Override // defpackage.cmqj
    public final void ae(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (cqmz.t(uri) || cqmz.s(uri)) {
                String lastPathSegment = uri.getLastPathSegment();
                if (lastPathSegment != null) {
                    arrayList.add(Long.valueOf(Long.parseLong(lastPathSegment)));
                }
            }
        }
        long[] jArr = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr[i] = ((Long) arrayList.get(i)).longValue();
        }
        aF(jArr);
    }

    @Override // defpackage.cmqj
    public final Optional af(long j) {
        String strC = C(j);
        return strC == null ? Optional.empty() : Optional.of(ekgb.n(U(strC)));
    }

    @Override // defpackage.cmqj
    public final List ag(String str) {
        Uri uriWithAppendedPath = Uri.withAppendedPath(Uri.parse(str), "addr");
        ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Query.Addr.Latency");
        Cursor cursorC = cdzz.c(this.s.getContentResolver(), uriWithAppendedPath, avbn.b(), null, null, null);
        axie.l(cursorC);
        ainvVarB.c();
        if (cursorC == null) {
            return new ArrayList();
        }
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorC.moveToNext()) {
                alqm alqmVarX = ((alrj) this.k.b()).x(((cmnx) this.P.b()).a(cursorC));
                if (!arrayList.contains(alqmVarX) && !((bbdl) this.X.b()).j(alqmVarX)) {
                    arrayList.add(alqmVarX);
                }
            }
            return arrayList;
        } finally {
            cursorC.close();
        }
    }

    @Override // defpackage.cmqj
    public final Optional ah(cmtz cmtzVar, String str) {
        if (cmtzVar != null) {
            ArrayList arrayList = cmtzVar.b;
            if (arrayList.size() == 1) {
                alqm alqmVar = (alqm) arrayList.get(0);
                cczv cczvVar = alvx.a;
                if (!((chwl) this.z.b()).f(alqmVar.k(((Boolean) new alvr().get()).booleanValue()))) {
                    return Optional.ofNullable(alqmVar);
                }
            }
        }
        ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Query.Addr.Latency");
        Cursor cursorC = cdzz.c(aq(), Uri.withAppendedPath(Uri.parse(str), "addr"), avbn.b(), "type=137", null, null);
        axie.l(cursorC);
        ainvVarB.c();
        if (cursorC != null) {
            try {
                if (cursorC.moveToFirst()) {
                    Optional optionalOf = Optional.of(((cmnx) this.P.b()).a(cursorC));
                    cursorC.close();
                    return optionalOf;
                }
                cursorC.close();
            } finally {
            }
        }
        return Optional.empty();
    }

    @Override // defpackage.cmqj
    public final cmqi ai(Uri uri) {
        alqm alqmVarF;
        ContentResolver contentResolverAq = aq();
        Uri uriWithAppendedPath = Uri.withAppendedPath(uri, "addr");
        ekgb ekgbVar = avbn.h;
        Cursor cursorC = cdzz.c(contentResolverAq, uriWithAppendedPath, (String[]) ekgbVar.toArray(new String[((ekoe) ekgbVar).c]), "type=137 OR type=151 OR type=130", null, null);
        axie.l(cursorC);
        ekhv ekhvVar = new ekhv();
        ekhv ekhvVar2 = new ekhv();
        ekhv ekhvVar3 = new ekhv();
        ekhv ekhvVar4 = new ekhv();
        if (cursorC != null) {
            while (cursorC.moveToNext()) {
                try {
                    try {
                        alqmVarF = ((cmnx) this.P.b()).a(cursorC);
                    } catch (cmnw e2) {
                        ((eksl) ((eksl) ((eksl) d.j()).g(e2)).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "getRawMmsSenderAndRecipientsObject", 4330, "TelephonyManagerInterfaceImpl.java")).q("Error loading MMS recipient from Telephony.");
                        alqmVarF = ((alrj) this.k.b()).f();
                    }
                    String strB = ejwk.b(alqmVarF.n());
                    int i = cursorC.getInt(2);
                    if (i == 130) {
                        ekhvVar2.c(strB);
                    } else if (i == 137) {
                        ekhvVar3.c(strB);
                        ekhvVar4.c(alqmVarF);
                    } else if (i == 151) {
                        ekhvVar.c(strB);
                    }
                } finally {
                    cursorC.close();
                }
            }
        }
        return new cmmn(ekhvVar3.g(), ekhvVar.g(), ekhvVar2.g(), ekhvVar4.g());
    }

    @Override // defpackage.cmqj
    public final Optional aj(cnqj cnqjVar) {
        return cnqjVar.d() ? Optional.empty() : af(cnqjVar.a());
    }

    @Override // defpackage.cmqj
    public final Uri ak(Context context, Uri uri, int i, String str, String str2, long j, int i2, int i3, cnqj cnqjVar, Optional optional) {
        long jA = cnqk.a(cnqjVar);
        try {
            ContentResolver contentResolver = context.getContentResolver();
            Long lValueOf = Long.valueOf(j);
            cqce cqceVar = n;
            cqbd cqbdVarA = cqceVar.a();
            cqbdVarA.I("add message to uri.");
            cqbdVarA.k(str);
            cqbdVarA.m(i);
            cqbdVarA.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
            cqbdVarA.B("read", true);
            cqbdVarA.B("notified", true);
            cqbdVarA.y("status", i2);
            cqbdVarA.y(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, i3);
            cqbdVarA.A("subject", null);
            cqbdVarA.r();
            ContentValues contentValues = new ContentValues(7);
            contentValues.put("address", str);
            contentValues.put("date", lValueOf);
            contentValues.put("read", (Integer) 1);
            contentValues.put("seen", (Integer) 1);
            contentValues.put("subject", chxx.g(optional));
            contentValues.put("body", str2);
            contentValues.put("sub_id", Integer.valueOf(i));
            if (i2 != -1) {
                contentValues.put("status", (Integer) 0);
            }
            contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, Integer.valueOf(i3));
            if (jA != -1) {
                contentValues.put("thread_id", Long.valueOf(jA));
            }
            ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Insert.Sms.Latency");
            Uri uriInsert = contentResolver.insert(uri, contentValues);
            ainvVarB.c();
            if (uriInsert == null) {
                cqbd cqbdVarA2 = cqceVar.a();
                cqbdVarA2.I("Cannot insert SMS message into telephony.");
                cqbdVarA2.y(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, i3);
                cqbdVarA2.r();
                return null;
            }
            final Uri uriWithAppendedId = ContentUris.withAppendedId(Telephony.Sms.CONTENT_URI, ContentUris.parseId(uriInsert));
            cqbd cqbdVarA3 = cqceVar.a();
            cqbdVarA3.I("Inserted SMS message into telephony.");
            cqbdVarA3.y(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, i3);
            cqbdVarA3.A("messageUri", uriInsert);
            cqbdVarA3.A("result", uriWithAppendedId);
            cqbdVarA3.z("threadId", jA);
            cqbdVarA3.r();
            if (this.l.a()) {
                ((awlc) this.T.b()).d(new Consumer() { // from class: cmrg
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void z(Object obj) {
                        cczi ccziVar = cmrl.c;
                        ((cmvv) obj).j(uriWithAppendedId);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return uriWithAppendedId;
            }
            this.S.ifPresent(new Consumer() { // from class: cmrh
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void z(Object obj) {
                    cczi ccziVar = cmrl.c;
                    ((cmvv) ((fcsu) obj).b()).j(uriWithAppendedId);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            return uriWithAppendedId;
        } catch (SQLiteException | IllegalArgumentException e2) {
            n.o("persist sms message failure", e2);
            return null;
        }
    }

    final int al(Throwable th) {
        Throwable cause = th.getCause();
        if (cause != null) {
            return al(cause);
        }
        String message = th.getMessage();
        if (message == null) {
            return 1;
        }
        if (message.contains("SmsSender: empty destination address")) {
            return 10010;
        }
        if (message.contains("SmsSender: empty text message")) {
            return 10011;
        }
        if (message.contains("SmsSender: fails to divide message")) {
            return 10012;
        }
        if (message.contains("Invalid destinationAddress")) {
            return 10000;
        }
        if (message.contains("Invalid message body")) {
            return 10001;
        }
        return message.contains("caught exception in sending") ? 10002 : 1;
    }

    @Override // defpackage.cmrp
    public final int am() {
        return ao() + an();
    }

    @Override // defpackage.cmrp
    public final int an() {
        return as(-1L, null, Telephony.Mms.CONTENT_URI);
    }

    @Override // defpackage.cmrp
    public final int ao() {
        return as(-1L, null, Telephony.Sms.CONTENT_URI);
    }

    public final int ap(ContentResolver contentResolver, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int iUpdate = contentResolver.update(uri, contentValues, str, strArr);
        aK(uri);
        return iUpdate;
    }

    final ContentResolver aq() {
        return this.s.getContentResolver();
    }

    @Override // defpackage.cmqj
    public final int b(long j) {
        ContentResolver contentResolverAq = aq();
        return au(contentResolverAq, Telephony.Sms.CONTENT_URI, String.format(Locale.US, "%s AND (%s<=%d)", o, "date", Long.valueOf(j)), null, "Bugle.Telephony.Delete.SmsBulk.Latency") + au(contentResolverAq, Telephony.Mms.CONTENT_URI, String.format(Locale.US, "%s AND (%s<=%d)", p, "date", Long.valueOf(j / 1000)), null, "Bugle.Telephony.Delete.MmsBulk.Latency");
    }

    @Override // defpackage.cmqj
    public final int c(ContentResolver contentResolver, String str, String str2) {
        ContentValues contentValues = new ContentValues(1);
        contentValues.put("address", str2);
        Uri uriBuild = b.buildUpon().appendPath(str).build();
        if (this.l.a()) {
            return ap(contentResolver, uriBuild, contentValues, null, null);
        }
        int iUpdate = contentResolver.update(uriBuild, contentValues, null, null);
        aK(uriBuild);
        return iUpdate;
    }

    @Override // defpackage.cmqj
    public final /* synthetic */ long d(Context context, String str) {
        return f(context, cmol.a, str);
    }

    @Override // defpackage.cmqj
    public final /* synthetic */ long e(Context context, java.util.Collection collection) {
        return g(context, cmol.a, collection);
    }

    @Override // defpackage.cmqj
    public final long f(Context context, cmmp cmmpVar, String str) {
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        awci awciVar = (awci) this.aa.b();
        fcsu fcsuVar = awciVar.a;
        fcsu fcsuVar2 = awciVar.b;
        fcsu fcsuVar3 = awciVar.c;
        Function functionM178m = aky$$ExternalSyntheticApiModelOutline0.m178m(awciVar.d.b());
        functionM178m.getClass();
        fcsu fcsuVar4 = awciVar.e;
        fcsu fcsuVar5 = awciVar.f;
        avoj avojVar = (avoj) awciVar.g.b();
        avojVar.getClass();
        return i(context, cmmpVar, hashSet, new awch(fcsuVar, fcsuVar2, fcsuVar3, functionM178m, fcsuVar4, fcsuVar5, avojVar, "TelephonyManagerInterfaceImpl#getOrCreateThreadId"));
    }

    @Override // defpackage.cmqj
    public final long g(Context context, cmmp cmmpVar, java.util.Collection collection) {
        return i(context, cmmpVar, collection, ((awci) this.aa.b()).a());
    }

    @Override // defpackage.cmqj
    public final long h(Context context, cmmp cmmpVar, String str, awch awchVar) {
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        return i(context, cmmpVar, hashSet, awchVar);
    }

    @Override // defpackage.cmqj
    public final long i(Context context, cmmp cmmpVar, final java.util.Collection collection, final awch awchVar) {
        Throwable th;
        cmtu cmtuVarB;
        ((cmmq) this.Y.b()).a(cmmpVar);
        eieu eieuVarK = eiiy.k("TelephonyManagerInterface.getOrCreateThreadId");
        try {
            ArrayList<String> arrayList = new ArrayList(collection);
            Cursor cursorQuery = null;
            if (arrayList.size() == 1) {
                String str = (String) ekis.l(arrayList);
                eieu eieuVarK2 = eiiy.k("TelephonyManagerInterfaceImpl#getThreadIdFromExistingRbmBot");
                try {
                    if (TextUtils.isEmpty(str) || !str.contains("@")) {
                        eieuVarK2.close();
                        cmtuVarB = null;
                    } else {
                        cmtuVarB = cmpf.b(((bbca) this.I.b()).c(str));
                        eieuVarK2.close();
                    }
                    if (cmtuVarB != null) {
                        arrayList.remove(str);
                        arrayList.add(((chwl) this.z.b()).b(cmtuVarB));
                    }
                } finally {
                }
            }
            cmsj cmsjVar = (cmsj) this.R.b();
            Uri.Builder builderBuildUpon = cmsj.a.buildUpon();
            for (String str2 : arrayList) {
                Matcher matcher = cmsj.b.matcher(str2);
                String strGroup = matcher.matches() ? matcher.group(2) : str2;
                cqce cqceVar = cmvy.a;
                if (!alwh.i(strGroup)) {
                    strGroup = cmsjVar.c.e(str2);
                }
                builderBuildUpon.appendQueryParameter("recipient", strGroup);
            }
            Uri uriBuild = builderBuildUpon.build();
            ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Query.Threads.Latency");
            try {
                cursorQuery = context.getContentResolver().query(uriBuild, new String[]{"_id"}, null, null, null);
                th = null;
            } catch (SQLiteException | IllegalArgumentException e2) {
                th = e2;
            }
            axie.l(cursorQuery);
            ainvVarB.c();
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        final long j = cursorQuery.getLong(0);
                        if (j == -1) {
                            eksl ekslVar = (eksl) d.i();
                            ekslVar.Z(eksk.FULL);
                            ((eksl) ekslVar.h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "getOrCreateThreadId", 979, "TelephonyManagerInterfaceImpl.java")).t("Telephony.getOrCreateThreadId returned thread -1 for %s", cqcv.b(collection.toString()));
                            ((cden) this.Z.b()).a(new Throwable("Messages detected that thread id returned -1 from Telephony", new cgew())).k(auvh.b(), eoqg.a);
                            j = -1;
                        } else {
                            eijx.g(new Callable() { // from class: cmqw
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    Optional optionalAj = this.a.aj(new cnqj(j));
                                    int i = ekgb.d;
                                    return (ekgb) optionalAj.orElse(ekoe.a);
                                }
                            }, this.W).h(new ejvr() { // from class: cmrc
                                @Override // defpackage.ejvr
                                public final Object apply(Object obj) {
                                    cczi ccziVar = cmrl.c;
                                    Stream stream = Collection.EL.stream(collection);
                                    final awch awchVar2 = awchVar;
                                    Stream map = stream.map(new Function() { // from class: cmqm
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            cczi ccziVar2 = cmrl.c;
                                            return ((avog) awchVar2.a((String) obj2)).a;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    int i = ekgb.d;
                                    Collector collector = ekcv.a;
                                    ((eksl) ((eksl) cmrl.d.h()).h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "logGetOrCreateThreadIdToFlogger", 1050, "TelephonyManagerInterfaceImpl.java")).I("Telephony.getOrCreateThreadId returned thread %s for %s, matching canonical %s", Long.valueOf(j), (ekgb) map.collect(collector), (ekgb) Collection.EL.stream((ekgb) obj).map(new Function() { // from class: cmqn
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            return ((alqm) obj2).n();
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }).map(new Function() { // from class: cmqo
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo536andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj2) {
                                            cczi ccziVar2 = cmrl.c;
                                            return ((avog) awchVar2.a(String.valueOf((String) obj2))).a;
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    }).collect(collector));
                                    return null;
                                }
                            }, this.V).k(auvh.b(), eoqg.a);
                        }
                        cursorQuery.close();
                        eieuVarK.close();
                        return j;
                    }
                    eksl ekslVar2 = (eksl) d.i();
                    ekslVar2.Z(eksk.FULL);
                    ((eksl) ekslVar2.h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "getOrCreateThreadId", 995, "TelephonyManagerInterfaceImpl.java")).t("Telephony.getOrCreateThreadId returned no rows for %s", cqcv.b(collection.toString()));
                    cursorQuery.close();
                } finally {
                }
            }
            eksl ekslVar3 = (eksl) d.i();
            ekslVar3.Z(eksk.FULL);
            ((eksl) ekslVar3.h("com/google/android/apps/messaging/shared/sms/TelephonyManagerInterfaceImpl", "getOrCreateThreadId", 1002, "TelephonyManagerInterfaceImpl.java")).t("Telephony.getOrCreateThreadId returned null for %s", cqcv.b(collection.toString()));
            cgex cgexVar = new cgex(th);
            ((cden) this.Z.b()).a(cgexVar).k(auvh.b(), eoqg.a);
            Log.e("Bugle", "Unable to allocate thread ID [legacy log]", cgexVar);
            throw cgexVar;
        } finally {
        }
    }

    @Override // defpackage.cmqj
    public final long j(long j, long j2) throws Throwable {
        long epochMilli;
        Cursor cursorQuery;
        long epochMilli2 = 0;
        if (!((crmx) this.E.b()).G()) {
            cqbd cqbdVarE = n.e();
            cqbdVarE.I("Not default SMS app. Cannot set thread in Telephony DB to read status.");
            cqbdVarE.z("threadId", j);
            cqbdVarE.r();
            return 0L;
        }
        if (!((crma) this.t.b()).p()) {
            cqbd cqbdVarE2 = n.e();
            cqbdVarE2.I("No SMS permissions. Cannot set thread in Telephony DB to read status.");
            cqbdVarE2.z("threadId", j);
            cqbdVarE2.r();
            return 0L;
        }
        ContentResolver contentResolverAq = aq();
        ContentValues contentValues = new ContentValues();
        contentValues.put("read", (Integer) 1);
        contentValues.put("seen", (Integer) 1);
        cqce cqceVar = n;
        if (cqceVar.t(2)) {
            cogw cogwVar = this.u;
            epochMilli = cogwVar.f().toEpochMilli();
            cqceVar.q("updateSmsReadStatus - starting");
            try {
                String strU = a.u(j, "thread_id=");
                ainv ainvVarB = ((aipo) this.x.b()).b("Bugle.Telephony.Query.Count.Latency");
                cursorQuery = contentResolverAq.query(Telephony.Sms.CONTENT_URI, null, strU, null, null);
                try {
                    axie.l(cursorQuery);
                    ainvVarB.c();
                    cqbd cqbdVarD = cqceVar.d();
                    cqbdVarD.I("updateSmsReadStatus.");
                    cqbdVarD.y("sms count", cursorQuery != null ? cursorQuery.getCount() : 0);
                    cqbdVarD.z("time", cogwVar.f().toEpochMilli() - epochMilli);
                    cqbdVarD.r();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                cursorQuery = null;
            }
        } else {
            epochMilli = 0;
        }
        String[] strArr = {Long.toString(j), Long.toString(j2)};
        fcsu fcsuVar = this.x;
        ainv ainvVarB2 = ((aipo) fcsuVar.b()).b("Bugle.Telephony.Update.FieldBulk.Latency");
        int iAG = aG(contentResolverAq, Telephony.Sms.CONTENT_URI, contentValues, strArr);
        ainvVarB2.c();
        aK(Telephony.Sms.CONTENT_URI);
        if (cqceVar.t(2)) {
            epochMilli2 = this.u.f().toEpochMilli();
            cqbd cqbdVarD2 = cqceVar.d();
            cqbdVarD2.I("updateSmsReadStatus - sms update time:");
            cqbdVarD2.H(epochMilli2 - epochMilli);
            cqbdVarD2.r();
        }
        String[] strArr2 = {Long.toString(j), Long.toString(j2 / 1000)};
        ainv ainvVarB3 = ((aipo) fcsuVar.b()).b("Bugle.Telephony.Update.FieldBulk.Latency");
        int iAG2 = aG(contentResolverAq, Telephony.Mms.CONTENT_URI, contentValues, strArr2);
        ainvVarB3.c();
        aK(Telephony.Mms.CONTENT_URI);
        if (cqceVar.t(2)) {
            cqbd cqbdVarD3 = cqceVar.d();
            cqbdVarD3.I("updateSmsReadStatus -mms update time:");
            cqbdVarD3.H(this.u.f().toEpochMilli() - epochMilli2);
            cqbdVarD3.r();
        }
        return iAG + iAG2;
    }

    @Override // defpackage.cmqj
    public final Uri k(Context context, lx lxVar, int i, String str, long j, long j2, String str2) {
        long j3;
        if (j2 == 0) {
            ((ains) this.Q.b()).e("Bugle.Telephony.Timestamp0.Mms", 3);
            j3 = 0;
        } else {
            j3 = j2;
        }
        return aJ(context, lxVar, i, str, j, j3, str2, false, null);
    }

    @Override // defpackage.cmqj
    public final Uri l(Context context, lh lhVar, int i, String str, long j, Map map) {
        return ax(context, lhVar, i, str, j, null, map);
    }

    @Override // defpackage.cmqj
    public final Uri m(Context context, List list, MessageCoreData messageCoreData, ceah ceahVar, long j, int i, String str, long j2, byte[] bArr) {
        return ay(context, list, messageCoreData, ceahVar, j, i, str, j2, bArr, true);
    }

    @Override // defpackage.cmqj
    public final Uri n(bbdl bbdlVar, MessageCoreData messageCoreData, long j) {
        Uri uriAk;
        Uri uriU = messageCoreData.u();
        if (uriU != null && cqmz.t(uriU)) {
            return uriU;
        }
        String strAs = messageCoreData.as();
        if (strAs == null) {
            uriAk = null;
        } else {
            axcy axcyVarAz = az(bbdlVar, messageCoreData.v());
            int iE = axcyVarAz != null ? axcyVarAz.e() : -1;
            cnqj cnqjVarA = ((bxjh) this.K.b()).a(messageCoreData.A());
            ArrayList arrayListA = ((baqt) this.J.b()).a(messageCoreData.A(), messageCoreData.cw());
            ejyb.a(!arrayListA.isEmpty());
            ejyb.a(arrayListA.size() == 1);
            String str = (String) arrayListA.get(0);
            Context context = this.s;
            Uri uri = Telephony.Sms.CONTENT_URI;
            messageCoreData.aI();
            uriAk = ak(context, uri, iE, str, strAs, j, -1, 2, cnqjVarA, messageCoreData.ae());
        }
        if (uriAk != null) {
            if (!messageCoreData.cY()) {
                aB(uriU, uriAk, "move MMS to SMS.");
            }
            return uriAk;
        }
        cqbd cqbdVarA = n.a();
        cqbdVarA.I("moveFallbackMessageToSms fails to insert SMS message.");
        cqbdVarA.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uriU);
        cqbdVarA.r();
        return uriU;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        if (r2.toString().equals(r0.b) == false) goto L26;
     */
    @Override // defpackage.cmqj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri o(defpackage.bbdl r14, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r15) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmrl.o(bbdl, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData):android.net.Uri");
    }

    @Override // defpackage.cmqj
    public final chvf p(Context context, Uri uri, int i, String str, String str2, Uri uri2, boolean z, long j, Bundle bundle, long j2) throws cmor {
        Parcelable parcelable;
        int i2;
        String string = uri2.toString();
        if (TextUtils.isEmpty(string)) {
            n.n("Download from empty content location URL");
            return chvf.j(3, 0).a();
        }
        try {
            fcsu fcsuVar = this.N;
            if (((cqjy) fcsuVar.b()).q() && bxlf.j(uri2, context)) {
                cqbd cqbdVarA = n.a();
                cqbdVarA.I("Reading MMS from dump file:");
                cqbdVarA.I(uri2);
                cqbdVarA.r();
                try {
                    return q(context, uri, i, str, str2, string, z, j, cmoq.a(((cqjy) fcsuVar.b()).s(uri2.getPathSegments().get(1), context)), j2);
                } catch (cmor e2) {
                    e = e2;
                    parcelable = uri;
                    cqbd cqbdVarB = n.b();
                    cqbdVarB.I("failed to download message");
                    cqbdVarB.I(parcelable);
                    cqbdVarB.s(e);
                    i2 = e.a;
                    return chvf.j(i2, 0).a();
                } catch (li e3) {
                    e = e3;
                    parcelable = uri;
                    cqbd cqbdVarB2 = n.b();
                    cqbdVarB2.I("failed to download message");
                    cqbdVarB2.I(parcelable);
                    cqbdVarB2.s(e);
                    i2 = 2;
                    return chvf.j(i2, 0).a();
                }
            }
            parcelable = uri;
            try {
                cqce cqceVar = n;
                cqbd cqbdVarA2 = cqceVar.a();
                cqbdVarA2.I("Downloading MMS.");
                cqbdVarA2.A("notification message", parcelable);
                cqbdVarA2.r();
                if (i < 0) {
                    cqceVar.n("Incoming MMS came from unknown SIM");
                    throw new cmor(3, "Message from unknown SIM");
                }
                bundle.putParcelable("notification_uri", parcelable);
                bundle.putInt("sub_id", i);
                bundle.putString("sub_phone_number", str);
                bundle.putString("transaction_id", str2);
                bundle.putString("content_location", string);
                bundle.putBoolean("auto_download", z);
                bundle.putLong("received_timestamp", j);
                cmos cmosVar = (cmos) this.C.b();
                Uri uri3 = Uri.parse(string);
                Uri uriD = bxlh.d(context);
                Intent intentB = cmosVar.e.b(uri3, uriD, bundle, j2);
                ajft ajftVarE = ((ajhd) cmosVar.f.b()).e();
                if (ajftVarE != null) {
                    ajftVarE.c(0, uriD);
                }
                ky kyVar = cmosVar.g;
                intentB.putExtra("mms_api", 1);
                cqbd cqbdVarC = ky.a.c();
                cqbdVarC.I("downloading MMS. ");
                cqbdVarC.w(j2);
                cqbdVarC.r();
                PendingIntent broadcast = PendingIntent.getBroadcast(context, 0, intentB, crag.a | VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
                int iA = la.a(i);
                SmsManager smsManagerForSubscriptionId = SmsManager.getSmsManagerForSubscriptionId(iA);
                if (craf.e) {
                    smsManagerForSubscriptionId.downloadMultimediaMessage(context, string, uriD, kyVar.a(iA), broadcast, j2);
                } else {
                    smsManagerForSubscriptionId.downloadMultimediaMessage(context, string, uriD, kyVar.a(iA), broadcast);
                }
                return chvf.i;
            } catch (cmor e4) {
                e = e4;
                cqbd cqbdVarB3 = n.b();
                cqbdVarB3.I("failed to download message");
                cqbdVarB3.I(parcelable);
                cqbdVarB3.s(e);
                i2 = e.a;
                return chvf.j(i2, 0).a();
            } catch (li e5) {
                e = e5;
                cqbd cqbdVarB22 = n.b();
                cqbdVarB22.I("failed to download message");
                cqbdVarB22.I(parcelable);
                cqbdVarB22.s(e);
                i2 = 2;
                return chvf.j(i2, 0).a();
            }
        } catch (cmor e6) {
            e = e6;
            parcelable = uri;
        } catch (li e7) {
            e = e7;
            parcelable = uri;
        }
        return chvf.j(i2, 0).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018b  */
    /* JADX WARN: Type inference failed for: r0v11, types: [alqm, java.lang.Object] */
    @Override // defpackage.cmqj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.chvf q(android.content.Context r14, android.net.Uri r15, int r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20, long r21, defpackage.lx r23, long r24) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmrl.q(android.content.Context, android.net.Uri, int, java.lang.String, java.lang.String, java.lang.String, boolean, long, lx, long):chvf");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02b1 A[Catch: Exception -> 0x02c1, TryCatch #2 {Exception -> 0x02c1, blocks: (B:14:0x006f, B:17:0x0090, B:19:0x0096, B:20:0x00a0, B:22:0x00d8, B:24:0x00e2, B:25:0x00e9, B:27:0x00ef, B:29:0x00ff, B:31:0x0105, B:35:0x0121, B:37:0x0129, B:39:0x0131, B:41:0x013b, B:44:0x014a, B:46:0x0150, B:50:0x015e, B:51:0x0161, B:55:0x017b, B:57:0x0181, B:59:0x0191, B:61:0x0197, B:76:0x01fc, B:79:0x021d, B:81:0x0229, B:82:0x0237, B:95:0x0293, B:98:0x02a3, B:99:0x02a8, B:100:0x02a9, B:101:0x02b0, B:102:0x02b1, B:103:0x02b8, B:54:0x0176, B:104:0x02b9, B:105:0x02c0, B:86:0x0242, B:88:0x025e, B:90:0x026f, B:89:0x0268, B:91:0x0274, B:93:0x027a, B:94:0x0288), top: B:112:0x006f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0176 A[Catch: Exception -> 0x02c1, TryCatch #2 {Exception -> 0x02c1, blocks: (B:14:0x006f, B:17:0x0090, B:19:0x0096, B:20:0x00a0, B:22:0x00d8, B:24:0x00e2, B:25:0x00e9, B:27:0x00ef, B:29:0x00ff, B:31:0x0105, B:35:0x0121, B:37:0x0129, B:39:0x0131, B:41:0x013b, B:44:0x014a, B:46:0x0150, B:50:0x015e, B:51:0x0161, B:55:0x017b, B:57:0x0181, B:59:0x0191, B:61:0x0197, B:76:0x01fc, B:79:0x021d, B:81:0x0229, B:82:0x0237, B:95:0x0293, B:98:0x02a3, B:99:0x02a8, B:100:0x02a9, B:101:0x02b0, B:102:0x02b1, B:103:0x02b8, B:54:0x0176, B:104:0x02b9, B:105:0x02c0, B:86:0x0242, B:88:0x025e, B:90:0x026f, B:89:0x0268, B:91:0x0274, B:93:0x027a, B:94:0x0288), top: B:112:0x006f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0181 A[Catch: Exception -> 0x02c1, TryCatch #2 {Exception -> 0x02c1, blocks: (B:14:0x006f, B:17:0x0090, B:19:0x0096, B:20:0x00a0, B:22:0x00d8, B:24:0x00e2, B:25:0x00e9, B:27:0x00ef, B:29:0x00ff, B:31:0x0105, B:35:0x0121, B:37:0x0129, B:39:0x0131, B:41:0x013b, B:44:0x014a, B:46:0x0150, B:50:0x015e, B:51:0x0161, B:55:0x017b, B:57:0x0181, B:59:0x0191, B:61:0x0197, B:76:0x01fc, B:79:0x021d, B:81:0x0229, B:82:0x0237, B:95:0x0293, B:98:0x02a3, B:99:0x02a8, B:100:0x02a9, B:101:0x02b0, B:102:0x02b1, B:103:0x02b8, B:54:0x0176, B:104:0x02b9, B:105:0x02c0, B:86:0x0242, B:88:0x025e, B:90:0x026f, B:89:0x0268, B:91:0x0274, B:93:0x027a, B:94:0x0288), top: B:112:0x006f, inners: #1 }] */
    @Override // defpackage.cmqj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.chvf r(defpackage.alqm r27, java.lang.String r28, android.net.Uri r29, int r30, java.lang.String r31, boolean r32, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r33, long r34) throws defpackage.cmty {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmrl.r(alqm, java.lang.String, android.net.Uri, int, java.lang.String, boolean, com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType, long):chvf");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [cmoc] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // defpackage.cmqj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cmnu s(android.net.Uri r10, int r11) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r0 = r10.getAuthority()
            java.lang.String r1 = "sms"
            boolean r2 = r1.equals(r0)
            r3 = 1
            if (r2 != 0) goto L17
            java.lang.String r2 = "mms"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L16
            goto L17
        L16:
            r3 = 0
        L17:
            defpackage.cqaz.k(r3)
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L34
            java.lang.String[] r1 = defpackage.cmoc.h(r9)
            fcsu r2 = r9.x
            java.lang.Object r2 = r2.b()
            aipo r2 = (defpackage.aipo) r2
            java.lang.String r3 = "Bugle.Telephony.Query.Sms.Latency"
            ainv r2 = r2.b(r3)
            r5 = r1
            goto L48
        L34:
            fcsu r1 = r9.x
            java.lang.String[] r2 = defpackage.cmny.n()
            java.lang.Object r1 = r1.b()
            aipo r1 = (defpackage.aipo) r1
            java.lang.String r3 = "Bugle.Telephony.Query.Mms.Latency"
            ainv r1 = r1.b(r3)
            r5 = r2
            r2 = r1
        L48:
            r1 = 0
            android.content.Context r3 = r9.s     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L86
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L86
            r7 = 0
            r8 = 0
            r6 = 0
            r4 = r10
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L86
            defpackage.axie.l(r10)     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9e
            r2.c()     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9e
            if (r10 == 0) goto L98
            boolean r2 = r10.moveToFirst()     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9e
            if (r2 == 0) goto L98
            if (r0 == 0) goto L77
            fcsu r0 = r9.ab     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9e
            java.lang.Object r0 = r0.b()     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9e
            cmof r0 = (defpackage.cmof) r0     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9e
            cmoc r0 = r0.a()     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9e
            r0.g(r10, r11)     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9e
            goto L7b
        L77:
            cmny r0 = defpackage.cmny.h(r10, r11)     // Catch: java.lang.Exception -> L7f java.lang.Throwable -> L9e
        L7b:
            r10.close()
            return r0
        L7f:
            r0 = move-exception
            r11 = r0
            goto L8a
        L82:
            r0 = move-exception
            r10 = r0
            r11 = r10
            goto La1
        L86:
            r0 = move-exception
            r10 = r0
            r11 = r10
            r10 = r1
        L8a:
            cqce r0 = defpackage.cmrl.n     // Catch: java.lang.Throwable -> L9e
            cqbd r0 = r0.b()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r2 = "load telephony message failed"
            r0.I(r2)     // Catch: java.lang.Throwable -> L9e
            r0.s(r11)     // Catch: java.lang.Throwable -> L9e
        L98:
            if (r10 == 0) goto L9d
            r10.close()
        L9d:
            return r1
        L9e:
            r0 = move-exception
            r11 = r0
            r1 = r10
        La1:
            if (r1 == 0) goto La6
            r1.close()
        La6:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmrl.s(android.net.Uri, int):cmnu");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    @Override // defpackage.cmqj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cmny t(android.net.Uri r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmrl.t(android.net.Uri):cmny");
    }

    @Override // defpackage.cmqj
    public final /* synthetic */ cmtz u(long j, String str, Integer num) {
        return w(cmol.a, j, str, num);
    }

    @Override // defpackage.cmqj
    public final /* synthetic */ cmtz v(cnqj cnqjVar, String str, Integer num) {
        return x(cmol.a, cnqjVar, str, num);
    }

    @Override // defpackage.cmqj
    @Deprecated
    public final cmtz w(cmmp cmmpVar, long j, String str, Integer num) {
        return x(cmmpVar, cnqj.b(j), str, num);
    }

    @Override // defpackage.cmqj
    @Deprecated
    public final cmtz x(cmmp cmmpVar, cnqj cnqjVar, String str, Integer num) throws NumberFormatException {
        List listU;
        ((cmmq) this.Y.b()).a(cmmpVar);
        String strD = D(cnqjVar);
        boolean zP = P(cnqjVar);
        if (TextUtils.isEmpty(strD)) {
            cqbd cqbdVarE = n.e();
            cqbdVarE.I("No recipient ids found using thread lookup, trying again with message lookup.");
            cqbdVarE.A("threadId", cnqjVar);
            cqbdVarE.r();
            listU = aI(str);
            if (!listU.isEmpty()) {
                ((ains) this.Q.b()).c("Bugle.Telephony.ThreadData.Recipients.UsedMessageInsteadOfThread");
            }
        } else {
            listU = U(strD);
        }
        if (listU.isEmpty()) {
            cqbd cqbdVarE2 = n.e();
            cqbdVarE2.I("No recipients found.");
            cqbdVarE2.A("threadId", cnqjVar);
            cqbdVarE2.r();
            ((ains) this.Q.b()).c("Bugle.Telephony.ThreadData.Recipients.Empty");
            return new cmtz(cnqk.a(cnqjVar), new ArrayList(), zP);
        }
        if (((Boolean) c.e()).booleanValue() && aC(listU)) {
            fcsu fcsuVar = this.Q;
            ((ains) fcsuVar.b()).c("Bugle.Telephony.ThreadData.Recipients.EmptyRecipientString");
            ekgb ekgbVarAI = aI(str);
            int i = ((ekoe) ekgbVarAI).c;
            int size = listU.size();
            boolean z = i == size;
            if (i == size) {
                listU = ekgbVarAI;
            }
            if (aC(listU)) {
                listU = (ekgb) Collection.EL.stream(listU).map(new Function() { // from class: cmql
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        alqm alqmVar = (alqm) obj;
                        cczv cczvVar = alvx.a;
                        return cssr.g(alqmVar.p(((Boolean) new alvr().get()).booleanValue())) ? ((alrj) this.a.k.b()).n("ʼUNKNOWN_SENDER!ʼ") : alqmVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(ekcv.a);
            } else if (z) {
                ((ains) fcsuVar.b()).c("Bugle.Telephony.ThreadData.Recipients.UsedMessageToFixEmptyRecipient");
            }
        }
        if (listU.size() == 1) {
            alqm alqmVar = (alqm) listU.get(0);
            cczv cczvVar = alvx.a;
            String strK = alqmVar.k(((Boolean) new alvr().get()).booleanValue());
            fcsu fcsuVar2 = this.z;
            if (((chwl) fcsuVar2.b()).f(strK) || ((chwl) fcsuVar2.b()).e(strK)) {
                return ((Boolean) ((cczi) chwq.a.get()).e()).booleanValue() ? ((chvp) this.A.b()).e(cnqjVar, strK, str, num) : ((chwq) this.y.b()).j(cnqk.a(cnqjVar), strK, str, num);
            }
        }
        Stream map = Collection.EL.stream(listU).map(new Function() { // from class: cmrd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cczi ccziVar = cmrl.c;
                cczv cczvVar2 = alvx.a;
                return ejwk.b(((alqm) obj).k(((Boolean) new alvr().get()).booleanValue()));
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = ekgb.d;
        long jH = ((cmot) this.B.b()).h(cmmpVar, (List) map.collect(ekcv.a));
        if (jH != -1) {
            cnqjVar = cnqj.b(jH);
        }
        return new cmtz(cnqk.a(cnqjVar), listU, zP);
    }

    @Override // defpackage.cmqj
    public final eiju y() {
        return eiju.g(this.v.f(Telephony.MmsSms.CONTENT_URI, new Bundle()));
    }

    @Override // defpackage.cmqj
    public final String z(long j) {
        Cursor cursorQuery;
        try {
            cursorQuery = aq().query(ContentUris.withAppendedId(b, j), null, null, null, null);
        } catch (RuntimeException unused) {
            cqbd cqbdVarB = n.b();
            cqbdVarB.I("getCanonicalAddressFromRecipientId: failed for id");
            cqbdVarB.H(j);
            cqbdVarB.r();
            cursorQuery = null;
        }
        Cursor cursor = cursorQuery;
        if (cursor == null) {
            return "";
        }
        try {
            if (cursor.moveToFirst()) {
                return cursor.getString(0);
            }
            if (cursor.moveToNext()) {
                cqbd cqbdVarA = n.a();
                cqbdVarA.I("getCanonicalAddressFromRecipientId found more than one result for id");
                cqbdVarA.H(j);
                cqbdVarA.r();
            }
            return "";
        } finally {
            cursor.close();
        }
    }
}
