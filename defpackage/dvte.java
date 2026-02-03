package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import com.android.vcard.VCardConstants;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvte implements dwws {
    public static final /* synthetic */ int i = 0;
    private static final String j = "messages INNER JOIN conversations ON conversation_row_id = ".concat(dvtr.b("conversations", "id"));
    public final dwje a;
    public final dwhr b;
    final long c;
    public final ejwi e;
    public final dvtm h;
    private final Context k;
    private final dvrc l;
    private LruCache m;
    public final ekgb d = ekgb.r(dwqq.INCOMING_RECEIVED);
    public final eosc f = dvht.b().a;
    final Executor g = new eoss(Executors.newSingleThreadExecutor());

    public dvte(Context context, dwje dwjeVar, dwhr dwhrVar, dvrc dvrcVar, dvtm dvtmVar, long j2, ejwi ejwiVar) {
        this.k = context.getApplicationContext();
        this.b = dwhrVar;
        this.l = dvrcVar;
        this.e = ejwiVar;
        this.h = dvtmVar;
        this.c = j2;
        this.a = dwjeVar;
    }

    private static final Pair aA(String str, dwpk dwpkVar) {
        String str2;
        String str3 = dvtr.b(str, "lighter_id_normalized_id") + " =? AND " + dvtr.b(str, "lighter_id_type") + " =? AND " + dvtr.b(str, "lighter_id_app_name") + " =? ";
        String[] strArr = {dwpkVar.b() == dwpj.EMAIL ? dvhq.a(dwpkVar.d()) : dwpkVar.d(), Integer.toString(dwpkVar.b().f), dwpkVar.e()};
        if (dwpkVar.c().g()) {
            str2 = str3 + " AND " + dvtr.b(str, "lighter_handler_id") + " =? ";
            strArr = (String[]) eknr.a(strArr, (String) dwpkVar.c().c());
        } else {
            str2 = str3 + " AND " + dvtr.b(str, "lighter_handler_id") + " is NULL ";
        }
        return Pair.create(str2, strArr);
    }

    private static final String aB() {
        return "((conversations INNER JOIN contacts AS o ON owner_row_id = " + dvtr.b("o", "id") + ") LEFT JOIN contacts AS c ON other_contact_row_id = " + dvtr.b("c", "id") + ")";
    }

    private static final Pair aC(dwpk dwpkVar) {
        return aA("contacts", dwpkVar);
    }

    private final dvwh aD(dwpx dwpxVar, dwqv[] dwqvVarArr) {
        String str;
        String[] strArr;
        String[] strArrH;
        String str2;
        int i2 = 0;
        if (dwpxVar.e() == dwpu.GROUP) {
            str = "((" + j + ") LEFT JOIN contacts ON sender_contact_row_id = " + dvtr.b("contacts", "id") + ")";
            strArr = new String[]{dwpxVar.d().b(), dwpxVar.d().a()};
            strArrH = dvtr.h(dvtr.i("messages", dvwt.a), dvtr.i("contacts", dvwm.a));
            str2 = "conversation_group_id = ? AND conversation_group_app_name = ?";
        } else {
            str = "(((" + j + ") LEFT JOIN contacts AS s ON sender_contact_row_id = " + dvtr.b("s", "id") + ") INNER JOIN contacts AS o ON other_contact_row_id = " + dvtr.b("o", "id") + ")";
            Pair pairAA = aA("o", dwpxVar.c());
            String str3 = (String) pairAA.first;
            strArr = (String[]) pairAA.second;
            strArrH = dvtr.h(dvtr.i("messages", dvwt.a), dvtr.i("s", dvwm.a));
            str2 = str3;
        }
        int length = dwqvVarArr.length;
        String str4 = str2 + " AND rendering_type IN (" + TextUtils.join(", ", Collections.nCopies(2, '?')) + ")";
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 2);
        while (true) {
            int length2 = dwqvVarArr.length;
            if (i2 >= 2) {
                dvwg dvwgVarJ = dvwh.j();
                dvwgVarJ.c(k(str));
                dvvw dvvwVar = (dvvw) dvwgVarJ;
                dvvwVar.a = ekgb.p(strArrH);
                dvvwVar.b = str4;
                dvvwVar.c = ekgb.p(strArr2);
                dvvwVar.d = "server_timestamp_us DESC";
                dvwgVarJ.b(1);
                return dvwgVarJ.a();
            }
            strArr2[strArr.length + i2] = Integer.toString(dwqvVarArr[i2].f);
            i2++;
        }
    }

    public static final Pair am(dwxj dwxjVar) {
        String[] strArr;
        String str = "lighter_id_normalized_id =? AND lighter_id_type =? AND lighter_id_app_name =?";
        if (dwxjVar.b() == dwpu.ONE_TO_ONE) {
            dwpk dwpkVarC = dwxjVar.c();
            strArr = new String[]{dwpkVarC.b() == dwpj.EMAIL ? dvhq.a(dwpkVarC.d()) : dwpkVarC.d(), Integer.toString(((dvug) dvui.a.fM(dwpkVarC.b())).g), dwpkVarC.e()};
            if (dwpkVarC.c().g()) {
                strArr = (String[]) eknr.a(strArr, (String) dwpkVarC.c().c());
                str = "lighter_id_normalized_id =? AND lighter_id_type =? AND lighter_id_app_name =? AND lighter_handler_id =?";
            }
        } else {
            strArr = new String[]{dwxjVar.a().b(), Integer.toString(dvug.GROUP.g), dwxjVar.a().a()};
        }
        return Pair.create(str, strArr);
    }

    public static final boolean ao(int i2) {
        return i2 > 0;
    }

    private final long aq(String str, String str2) {
        Cursor cursorH = this.h.h(k(str), new String[]{a.a(str2, "MAX(", ")")}, null, new String[0], null, null);
        try {
            long j2 = cursorH.moveToFirst() ? cursorH.getLong(0) : 0L;
            if (cursorH != null) {
                cursorH.close();
            }
            return j2;
        } catch (Throwable th) {
            if (cursorH == null) {
                throw th;
            }
            try {
                cursorH.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    private final long ar(final dwpo dwpoVar) {
        return ((Long) dvtq.a(this.h, new Callable() { // from class: dvrg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dwpo dwpoVar2 = dwpoVar;
                dwpx dwpxVar = ((dwna) dwpoVar2).a;
                dvte dvteVar = this.a;
                long jF = dvteVar.f(dwpxVar.a());
                ejwi ejwiVarJ = dwpxVar.e() == dwpu.ONE_TO_ONE ? ejwi.j(Long.valueOf(dvteVar.f(dwpxVar.c()))) : ejud.a;
                ContentValues contentValues = new ContentValues();
                dwmz dwmzVar = new dwmz(dwpoVar2);
                dvhn.a();
                dwmzVar.g(System.currentTimeMillis());
                dwpo dwpoVarA = dwmzVar.a();
                contentValues.put("conversation_properties", dvul.e(dwpoVarA));
                dwna dwnaVar = (dwna) dwpoVarA;
                contentValues.put("conversation_app_data", dvul.d(new HashMap(dwnaVar.i)));
                dwpx dwpxVar2 = dwnaVar.a;
                contentValues.put("conversation_type", Integer.valueOf(dwpxVar2.e().c));
                contentValues.put("local_update_timestamp_ms", Long.valueOf(dwnaVar.o));
                if (dwpxVar2.e() == dwpu.GROUP) {
                    contentValues.put("conversation_group_id", dwpxVar2.d().b());
                    contentValues.put("conversation_group_app_name", dwpxVar2.d().a());
                }
                if (ejwiVarJ.g()) {
                    contentValues.put("other_contact_row_id", (Long) ejwiVarJ.c());
                }
                Long lValueOf = Long.valueOf(jF);
                contentValues.put("owner_row_id", lValueOf);
                contentValues.put("update_timestamp_us", (Long) 0L);
                long jC = dvteVar.h.c(dvteVar.k("conversations"), contentValues, 0);
                dvteVar.ah(1, dwpxVar2);
                dvteVar.M();
                ArrayList arrayList = new ArrayList();
                arrayList.add(lValueOf);
                if (ejwiVarJ.g()) {
                    arrayList.add(ejwiVarJ.c());
                }
                dvteVar.D(dwpxVar2, jC, arrayList);
                return Long.valueOf(jC);
            }
        })).longValue();
    }

    private final dvwh as(dwxj dwxjVar) {
        Pair pairAm = am(dwxjVar);
        dvwg dvwgVarJ = dvwh.j();
        dvwgVarJ.c(k("blocks"));
        dvvw dvvwVar = (dvvw) dvwgVarJ;
        dvvwVar.a = ekgb.p(dvwk.a);
        dvvwVar.b = (String) pairAm.first;
        dvvwVar.c = ekgb.p((String[]) pairAm.second);
        dvvwVar.d = null;
        return dvwgVarJ.a();
    }

    private final dvwh at(dwpk dwpkVar) {
        Pair pairAC = aC(dwpkVar);
        String str = (String) pairAC.first;
        String[] strArr = (String[]) pairAC.second;
        dvwg dvwgVarJ = dvwh.j();
        dvwgVarJ.c(k("contacts"));
        dvvw dvvwVar = (dvvw) dvwgVarJ;
        dvvwVar.a = ekgb.p(dvwm.a);
        dvvwVar.b = str;
        dvvwVar.c = ekgb.p(strArr);
        dvvwVar.d = null;
        return dvwgVarJ.a();
    }

    private final dvwh au(dwpx dwpxVar) {
        String[] strArr;
        String str;
        dwpu dwpuVarE = dwpxVar.e();
        dwpu dwpuVar = dwpu.GROUP;
        if (dwpuVarE == dwpuVar) {
            strArr = new String[]{String.valueOf(dwpuVar.c), dwpxVar.d().b(), dwpxVar.d().a()};
            str = "conversation_type = ? AND conversation_group_id = ? AND conversation_group_app_name = ?";
        } else {
            Pair pairAA = aA("c", dwpxVar.c());
            String strValueOf = String.valueOf((String) pairAA.first);
            String[] strArr2 = (String[]) eknr.b(new String[]{String.valueOf(dwpu.ONE_TO_ONE.c)}, (String[]) pairAA.second, String.class);
            String strConcat = "conversation_type = ?AND ".concat(strValueOf);
            strArr = strArr2;
            str = strConcat;
        }
        Pair pairCreate = Pair.create(str, strArr);
        String str2 = (String) pairCreate.first;
        String[] strArr3 = (String[]) pairCreate.second;
        String strAB = aB();
        String[] strArrI = dvtr.i("conversations", dvwq.b);
        String[] strArr4 = dvwm.a;
        String[] strArrH = dvtr.h(strArrI, dvtr.i("o", strArr4), dvtr.i("c", strArr4));
        dvwg dvwgVarJ = dvwh.j();
        dvwgVarJ.c(k(strAB));
        ekgb ekgbVarP = ekgb.p(strArrH);
        dvvw dvvwVar = (dvvw) dvwgVarJ;
        dvvwVar.a = ekgbVarP;
        dvvwVar.b = str2;
        dvvwVar.c = ekgb.p(strArr3);
        dvvwVar.d = null;
        return dvwgVarJ.a();
    }

    private final synchronized dwwy av(dvwh dvwhVar) {
        LruCache lruCache = this.m;
        if (lruCache != null) {
            return (dwwy) lruCache.get(dvwhVar);
        }
        synchronized (this) {
            int iA = (int) fbeo.a();
            if (this.m == null && iA > 0) {
                this.m = new LruCache(iA);
            }
        }
        return null;
    }

    private final dwwy aw(final dvwh dvwhVar, final Context context, final ejvr ejvrVar, final Uri uri) {
        dwwy dwwyVar;
        Exception exc;
        Callable callable = new Callable() { // from class: dvrx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new dvwe(context, ejvrVar, this.a.h, uri, dvwhVar);
            }
        };
        dwwy dwwyVarAv = av(dvwhVar);
        if (dwwyVarAv != null) {
            return dwwyVarAv;
        }
        try {
            dwwyVar = (dwwy) callable.call();
        } catch (Exception e) {
            dwwyVar = dwwyVarAv;
            exc = e;
        }
        try {
            ay(dvwhVar, dwwyVar);
            return dwwyVar;
        } catch (Exception e2) {
            exc = e2;
            dvhv.d("SQLiteMessagingStore", "Error creating monitor", exc);
            return dwwyVar;
        }
    }

    private final Object ax(dvwh dvwhVar, ejvr ejvrVar) {
        dvvx dvvxVar = (dvvx) dvwhVar;
        ekgb ekgbVar = dvvxVar.b;
        String[] strArr = ekgbVar == null ? null : (String[]) ekgbVar.toArray(new String[((ekoe) ekgbVar).c]);
        ekgb ekgbVar2 = dvvxVar.d;
        String[] strArr2 = ekgbVar2 != null ? (String[]) ekgbVar2.toArray(new String[((ekoe) ekgbVar2).c]) : null;
        int i2 = dvvxVar.f;
        int i3 = dvtr.a;
        Cursor cursorH = this.h.h(dvvxVar.a, strArr, dvvxVar.c, strArr2, dvvxVar.e, "0, " + (i2 >= 0 ? String.valueOf(i2) : "2147483647"));
        try {
            dvhv.a("SQLiteMessagingStore", "Reading query result with the given cursor reader");
            Object objApply = ejvrVar.apply(cursorH);
            if (cursorH != null) {
                cursorH.close();
            }
            return objApply;
        } finally {
        }
    }

    private final synchronized void ay(dvwh dvwhVar, dwwy dwwyVar) {
        LruCache lruCache = this.m;
        if (lruCache != null) {
            lruCache.put(dvwhVar, dwwyVar);
            return;
        }
        int iA = (int) fbeo.a();
        if (this.m != null || iA <= 0) {
            return;
        }
        LruCache lruCache2 = new LruCache(iA);
        this.m = lruCache2;
        lruCache2.put(dvwhVar, dwwyVar);
    }

    private final void az(final dwqw dwqwVar, final boolean z) {
        int i2 = ((dwnq) dwqwVar).r;
        final ContentValues contentValuesJ = j(dwqwVar);
        if (i2 == 1) {
            contentValuesJ.put("needs_delivery_receipt", (Boolean) true);
        } else {
            contentValuesJ.put("needs_delivery_receipt", (Boolean) false);
        }
        dvtq.b(this.h, new Runnable() { // from class: dvrh
            /* JADX WARN: Removed duplicated region for block: B:12:0x0060 A[PHI: r0
              0x0060: PHI (r0v14 dwqq) = (r0v11 dwqq), (r0v15 dwqq) binds: [B:14:0x006c, B:11:0x005e] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00af  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r12 = this;
                    boolean r0 = r3
                    dwqw r1 = r2
                    if (r0 == 0) goto L14
                    r0 = r1
                    dwnq r0 = (defpackage.dwnq) r0
                    long r2 = r0.d
                    java.lang.Long r0 = java.lang.Long.valueOf(r2)
                    ejwi r0 = defpackage.ejwi.j(r0)
                    goto L16
                L14:
                    ejud r0 = defpackage.ejud.a
                L16:
                    android.content.ContentValues r2 = r4
                    dwnq r1 = (defpackage.dwnq) r1
                    dwpx r3 = r1.c
                    dvte r4 = r12.a
                    long r5 = r4.h(r3, r0)
                    java.lang.Long r0 = java.lang.Long.valueOf(r5)
                    java.lang.String r3 = "conversation_row_id"
                    r2.put(r3, r0)
                    dwpk r0 = r1.b
                    long r5 = r4.f(r0)
                    java.lang.Long r0 = java.lang.Long.valueOf(r5)
                    java.lang.String r3 = "sender_contact_row_id"
                    r2.put(r3, r0)
                    java.lang.String r0 = r1.a
                    java.lang.String r3 = "messages"
                    android.net.Uri r6 = r4.k(r3)
                    java.lang.String r5 = "message_status"
                    java.lang.String[] r7 = new java.lang.String[]{r5}
                    java.lang.String[] r9 = new java.lang.String[]{r0}
                    dvtm r5 = r4.h
                    r10 = 0
                    r11 = 0
                    java.lang.String r8 = "message_id = ?"
                    android.database.Cursor r5 = r5.h(r6, r7, r8, r9, r10, r11)
                    boolean r0 = r5.moveToFirst()     // Catch: java.lang.Throwable -> Lc1
                    r6 = 0
                    if (r0 != 0) goto L64
                    r0 = 0
                    if (r5 == 0) goto L6f
                L60:
                    r5.close()
                    goto L6f
                L64:
                    int r0 = r5.getInt(r6)     // Catch: java.lang.Throwable -> Lc1
                    dwqq r0 = defpackage.dwqq.a(r0)     // Catch: java.lang.Throwable -> Lc1
                    if (r5 == 0) goto L6f
                    goto L60
                L6f:
                    dvtm r5 = r4.h
                    android.net.Uri r3 = r4.k(r3)
                    r7 = 5
                    long r2 = r5.c(r3, r2, r7)
                    r7 = 0
                    int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                    if (r2 < 0) goto Lb9
                    java.lang.String r2 = r1.a
                    r4.Q(r2)
                    dwpx r2 = r1.c
                    r4.K(r2)
                    r3 = 1
                    if (r0 == 0) goto L96
                    dwqq r5 = r1.g
                    boolean r5 = r0.equals(r5)
                    if (r5 != 0) goto L96
                    r6 = r3
                L96:
                    ekgb r5 = r4.d
                    dwqq r1 = r1.g
                    boolean r7 = r5.contains(r1)
                    if (r7 != 0) goto La9
                    if (r6 == 0) goto Lb5
                    boolean r5 = r5.contains(r0)
                    if (r5 == 0) goto Laf
                    goto Laa
                La9:
                    r3 = r6
                Laa:
                    r4.P(r2)
                    if (r3 == 0) goto Lb5
                Laf:
                    r4.R(r0)
                    r4.ap(r2)
                Lb5:
                    r4.R(r1)
                    return
                Lb9:
                    android.database.sqlite.SQLiteException r0 = new android.database.sqlite.SQLiteException
                    java.lang.String r1 = "Failed to save message."
                    r0.<init>(r1)
                    throw r0
                Lc1:
                    r0 = move-exception
                    r1 = r0
                    if (r5 == 0) goto Lcd
                    r5.close()     // Catch: java.lang.Throwable -> Lc9
                    goto Lcd
                Lc9:
                    r0 = move-exception
                    r1.addSuppressed(r0)
                Lcd:
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dvrh.run():void");
            }
        });
    }

    public static ContentValues j(dwqw dwqwVar) {
        ContentValues contentValues = new ContentValues();
        dwnq dwnqVar = (dwnq) dwqwVar;
        contentValues.put("message_id", dwnqVar.a);
        contentValues.put("message_type", Integer.valueOf(dwnqVar.r - 1));
        contentValues.put("message_status", Integer.valueOf(dwnqVar.g.p));
        contentValues.put("server_timestamp_us", Long.valueOf(dwnqVar.d));
        contentValues.put("capability", Integer.valueOf(dwnqVar.j));
        contentValues.put("rendering_type", Integer.valueOf(dwnqVar.k.a().f));
        contentValues.put("filterable_flags", Integer.valueOf(dwnqVar.m));
        try {
            contentValues.put("message_properties", dvhy.i(dvuu.b(dwqwVar)));
            return contentValues;
        } catch (IOException e) {
            dvhv.d("SQLiteMessagingStore", "Failed to serialize message profile.", e);
            throw new SQLiteException("Fali to serialize message profile", e);
        }
    }

    @Override // defpackage.dwws
    public final ekgb A(final dwpx dwpxVar, final dwqq dwqqVar, final dwqq dwqqVar2) {
        if (!dwqqVar.equals(dwqqVar2)) {
            return (ekgb) dvtq.a(this.h, new Callable() { // from class: dvry
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    ContentValues contentValues = new ContentValues();
                    dwqq dwqqVar3 = dwqqVar2;
                    contentValues.put("message_status", Integer.valueOf(dwqqVar3.p));
                    dvte dvteVar = this.a;
                    dwpx dwpxVar2 = dwpxVar;
                    String string = Long.toString(dvteVar.c(dwpxVar2));
                    dwqq dwqqVar4 = dwqqVar;
                    String[] strArr = {string, Integer.toString(dwqqVar4.p)};
                    int i2 = ekgb.d;
                    ekfw ekfwVar = new ekfw();
                    dvtm dvtmVar = dvteVar.h;
                    Cursor cursorH = dvtmVar.h(dvteVar.k("messages"), new String[]{"message_id"}, "conversation_row_id = ? AND message_status = ?", strArr, null, null);
                    try {
                        if (cursorH.moveToFirst()) {
                            dvtmVar.b(dvteVar.k("messages"), contentValues, "conversation_row_id = ? AND message_status = ?", strArr);
                            do {
                                String string2 = cursorH.getString(0);
                                ekfwVar.h(string2);
                                dvteVar.Q(string2);
                                dvteVar.ap(dwpxVar2);
                            } while (cursorH.moveToNext());
                            dvteVar.Z(dwpxVar2);
                            ekgb ekgbVar = dvteVar.d;
                            if (ekgbVar.contains(dwqqVar3) || ekgbVar.contains(dwqqVar4)) {
                                dvteVar.P(dwpxVar2);
                            }
                            dvteVar.K(dwpxVar2);
                            dvteVar.R(dwqqVar4);
                            dvteVar.R(dwqqVar3);
                        }
                        ekgb ekgbVarG = ekfwVar.g();
                        if (cursorH != null) {
                            cursorH.close();
                        }
                        return ekgbVarG;
                    } catch (Throwable th) {
                        if (cursorH == null) {
                            throw th;
                        }
                        try {
                            cursorH.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
            });
        }
        int i2 = ekgb.d;
        return ekoe.a;
    }

    @Override // defpackage.dwws
    public final ekgp B(long j2) {
        final String[] strArr = {"1", Long.toString(j2)};
        return (ekgp) dvtq.a(this.h, new Callable() { // from class: dvsb
            public final /* synthetic */ String b = "needs_delivery_receipt = ? AND server_timestamp_us > ?";

            @Override // java.util.concurrent.Callable
            public final Object call() {
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                dvte dvteVar = this.a;
                String str = this.b;
                String[] strArr2 = strArr;
                Cursor cursorH = dvteVar.h.h(dvteVar.k("messages"), new String[]{"message_id", "conversation_row_id"}, str, strArr2, null, null);
                try {
                    if (cursorH.moveToFirst()) {
                        do {
                            long j3 = cursorH.getLong(1);
                            String string = cursorH.getString(0);
                            Long lValueOf = Long.valueOf(j3);
                            if (!map2.containsKey(lValueOf)) {
                                map2.put(lValueOf, new ArrayList());
                            }
                            ((List) map2.get(lValueOf)).add(string);
                        } while (cursorH.moveToNext());
                    }
                    if (cursorH != null) {
                        cursorH.close();
                    }
                    for (Long l : map2.keySet()) {
                        ejwi ejwiVarR = dvteVar.r(l.longValue());
                        for (String str2 : (List) map2.get(l)) {
                            if (ejwiVarR.g()) {
                                if (!map.containsKey(((dwna) ejwiVarR.c()).a)) {
                                    map.put(((dwna) ejwiVarR.c()).a, new ArrayList());
                                }
                                ((List) map.get(((dwna) ejwiVarR.c()).a)).add(str2);
                            } else {
                                dvhv.f("SQLiteMessagingStore", "Conversation decoding failed");
                            }
                        }
                    }
                    ekgi ekgiVar = new ekgi();
                    for (dwpx dwpxVar : map.keySet()) {
                        ekgiVar.i(dwpxVar, ekgb.n((Collection) map.get(dwpxVar)));
                    }
                    return ekgiVar.c();
                } catch (Throwable th) {
                    if (cursorH == null) {
                        throw th;
                    }
                    try {
                        cursorH.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
        });
    }

    @Override // defpackage.dwws
    public final void C(final dwpx dwpxVar, final List list) {
        dvtq.b(this.h, new Runnable() { // from class: dvrl
            @Override // java.lang.Runnable
            public final void run() {
                dvte dvteVar = this.a;
                dwpx dwpxVar2 = dwpxVar;
                long jC = dvteVar.c(dwpxVar2);
                if (jC == -1) {
                    dvhv.c("SQLiteMessagingStore", "Could not find conversation with the given id.");
                    return;
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(dvteVar.f((dwpk) it.next())));
                }
                dvteVar.D(dwpxVar2, jC, arrayList);
            }
        });
    }

    public final void D(final dwpx dwpxVar, final long j2, final List list) {
        dvtq.b(this.h, new Runnable() { // from class: dvsd
            @Override // java.lang.Runnable
            public final void run() {
                Iterator it = list.iterator();
                while (true) {
                    dvte dvteVar = this.a;
                    if (!it.hasNext()) {
                        dvteVar.O(dwpxVar);
                        return;
                    }
                    long j3 = j2;
                    Long l = (Long) it.next();
                    l.longValue();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("conversation_row_id", Long.valueOf(j3));
                    contentValues.put("contact_row_id", l);
                    dvteVar.h.c(dvteVar.k("participants"), contentValues, 5);
                }
            }
        });
    }

    @Override // defpackage.dwws
    public final void E(final dwpx dwpxVar) {
        dvtq.b(this.h, new Runnable() { // from class: dvsc
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                dwpx dwpxVar2 = dwpxVar;
                ejwi ejwiVarF = dwpxVar2.f();
                if (!ejwiVarF.g()) {
                    dvhv.f("SQLiteMessagingStore", "Failed converting conversationId to json: ".concat(String.valueOf(String.valueOf(dwpxVar2))));
                    return;
                }
                dvte dvteVar = this.a;
                if (dvteVar.h.a(dvteVar.k("deleted_conversations"), "conversation_id_string = ?", new String[]{((JSONObject) ejwiVarF.c()).toString()}) < 0) {
                    dvhv.c("SQLiteMessagingStore", "Failed to delete from deleted_conversations table.");
                }
            }
        });
    }

    @Override // defpackage.dwws
    public final void F(final dwpx dwpxVar, final long j2) {
        final long jC = c(dwpxVar);
        final String strValueOf = String.valueOf(jC);
        Integer[] numArr = {Integer.valueOf(dwqq.OUTGOING_PENDING_SEND.p), Integer.valueOf(dwqq.OUTGOING_SENDING.p)};
        Integer[] numArr2 = {Integer.valueOf(dwqq.OUTGOING_FAILED_SEND.p), Integer.valueOf(dwqq.LOCAL.p)};
        final String str = "conversation_row_id = ?  AND server_timestamp_us <= ? AND message_status NOT IN (" + TextUtils.join(", ", numArr) + ")";
        final String[] strArr = {strValueOf, String.valueOf(j2)};
        final String str2 = "conversation_row_id = ?  AND message_status IN ( " + TextUtils.join(", ", numArr2) + ") ";
        final String[] strArr2 = {strValueOf};
        dvtq.b(this.h, new Runnable() { // from class: dvrs
            @Override // java.lang.Runnable
            public final void run() {
                dvte dvteVar = this.a;
                Uri uriK = dvteVar.k("messages");
                String str3 = str;
                String[] strArr3 = strArr;
                dvtm dvtmVar = dvteVar.h;
                int iA = dvtmVar.a(uriK, str3, strArr3) + dvtmVar.a(dvteVar.k("messages"), str2, strArr2);
                dvteVar.Y(jC);
                String str4 = strValueOf;
                Cursor cursorH = dvtmVar.h(dvteVar.k("messages"), new String[]{"message_id"}, "conversation_row_id = ?", new String[]{str4}, null, "1");
                try {
                    if (!cursorH.moveToFirst()) {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("update_timestamp_us", (Long) (-1L));
                        dvtmVar.b(dvteVar.k("conversations"), contentValues, "id = ?", new String[]{String.valueOf(str4)});
                    }
                    if (cursorH != null) {
                        cursorH.close();
                    }
                    dvtm dvtmVar2 = dvteVar.h;
                    cursorH = dvtmVar2.h(dvteVar.k("conversations"), new String[]{"last_deleted_timestamp_us"}, "id = ?", new String[]{str4}, null, null);
                    try {
                        if (cursorH.moveToFirst()) {
                            long j3 = cursorH.getLong(0);
                            long j4 = j2;
                            if (j3 < j4) {
                                ContentValues contentValues2 = new ContentValues();
                                contentValues2.put("last_deleted_timestamp_us", Long.valueOf(j4));
                                dvtmVar2.b(dvteVar.k("conversations"), contentValues2, "id = ?", new String[]{String.valueOf(str4)});
                            }
                        }
                        if (cursorH != null) {
                            cursorH.close();
                        }
                        dwpx dwpxVar2 = dwpxVar;
                        dvteVar.K(dwpxVar2);
                        dvteVar.M();
                        dvteVar.ah(iA, dwpxVar2);
                    } finally {
                    }
                } finally {
                }
            }
        });
    }

    @Override // defpackage.dwws
    public final void G() {
        try {
            final SQLiteDatabase writableDatabase = this.l.getWritableDatabase();
            writableDatabase.setForeignKeyConstraintsEnabled(false);
            final Runnable runnable = new Runnable() { // from class: dvrj
                @Override // java.lang.Runnable
                public final void run() {
                    int i2 = dvte.i;
                    dvtr.d(writableDatabase);
                }
            };
            Callable callable = new Callable() { // from class: dvtp
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    runnable.run();
                    return null;
                }
            };
            dvia.b();
            try {
                try {
                    writableDatabase.beginTransaction();
                    callable.call();
                    writableDatabase.setTransactionSuccessful();
                    if (writableDatabase.inTransaction()) {
                        writableDatabase.endTransaction();
                    }
                    writableDatabase.setForeignKeyConstraintsEnabled(true);
                } catch (Exception e) {
                    throw new dvtn(e);
                }
            } catch (Throwable th) {
                if (writableDatabase.inTransaction()) {
                    writableDatabase.endTransaction();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            dvhv.d("SQLiteMessagingStore", "Unable to get writable database due to ", e2);
        }
    }

    @Override // defpackage.dwws
    public final void H(final dwpx dwpxVar, final List list) {
        dvtq.b(this.h, new Runnable() { // from class: dvsy
            @Override // java.lang.Runnable
            public final void run() {
                final dvte dvteVar = this.a;
                final dwpx dwpxVar2 = dwpxVar;
                final long jC = dvteVar.c(dwpxVar2);
                if (jC == -1) {
                    dvhv.c("SQLiteMessagingStore", "Could not find conversation with the given id.");
                    return;
                }
                List list2 = list;
                final ArrayList arrayList = new ArrayList();
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    long jB = dvteVar.b((dwpk) it.next());
                    if (jB != -1) {
                        arrayList.add(Long.valueOf(jB));
                    }
                }
                dvtq.b(dvteVar.h, new Runnable() { // from class: dvsl
                    @Override // java.lang.Runnable
                    public final void run() {
                        Iterator it2 = arrayList.iterator();
                        while (true) {
                            dvte dvteVar2 = dvteVar;
                            if (!it2.hasNext()) {
                                dvteVar2.O(dwpxVar2);
                                return;
                            }
                            long j2 = jC;
                            long jLongValue = ((Long) it2.next()).longValue();
                            if (dvteVar2.h.a(dvteVar2.k("participants"), "conversation_row_id =? AND contact_row_id =?", new String[]{Long.toString(j2), Long.toString(jLongValue)}) < 0) {
                                dvhv.c("SQLiteMessagingStore", a.F(j2, jLongValue, "Failed to kick participant,  Contact Row ID: ", " from Conversation Row ID: "));
                            }
                        }
                    }
                });
            }
        });
    }

    @Override // defpackage.dwws
    public final void I(List list) {
        final ContentValues contentValues = new ContentValues();
        int i2 = 0;
        contentValues.put("needs_delivery_receipt", (Boolean) false);
        while (i2 < list.size()) {
            int iMin = Math.min(i2 + 998, list.size());
            List listSubList = list.subList(i2, iMin);
            final String[] strArr = new String[listSubList.size()];
            final String strA = a.a(dvtr.c(listSubList.size()), "message_id IN (", ")");
            listSubList.toArray(strArr);
            dvtq.b(this.h, new Runnable() { // from class: dvrz
                @Override // java.lang.Runnable
                public final void run() {
                    dvte dvteVar = this.a;
                    dvteVar.h.b(dvteVar.k("messages"), contentValues, strA, strArr);
                }
            });
            i2 = iMin;
        }
    }

    public final void J(int i2, dwpf dwpfVar) {
        dwmw dwmwVar = (dwmw) dwpfVar;
        dwpk dwpkVar = dwmwVar.a;
        dvwi.a().b(dvwf.b(this.c, dwpkVar));
        if (fbel.b()) {
            dvhv.a("SQLiteMessagingStore", "Sending one to one conversation profile updated event");
            String strAB = aB();
            Pair pairAA = aA("c", dwpkVar);
            String strValueOf = String.valueOf((String) pairAA.first);
            String[] strArr = (String[]) eknr.b(new String[]{String.valueOf(dwpu.ONE_TO_ONE.c)}, (String[]) pairAA.second, String.class);
            String[] strArrI = dvtr.i("conversations", dvwq.b);
            String[] strArr2 = dvwm.a;
            Cursor cursorH = this.h.h(k(strAB), dvtr.h(strArrI, dvtr.i("o", strArr2), dvtr.i("c", strArr2)), "conversation_type = ?AND ".concat(strValueOf), strArr, null, null);
            try {
                final ejwi ejwiVarA = dvul.a(cursorH);
                if (cursorH != null) {
                    cursorH.close();
                }
                if (!ejwiVarA.g() || dvju.b((dwpo) ejwiVarA.c())) {
                    dvhv.a("SQLiteMessagingStore", "one to one conversation profile no need to update");
                    ListenableFuture listenableFuture = eorv.a;
                } else {
                    dwhr dwhrVar = this.b;
                    dwhp dwhpVarM = m();
                    dwhpVarM.d(((dwna) ejwiVarA.c()).a);
                    dwhpVarM.g(90);
                    dwhpVarM.f(493);
                    dwhrVar.b(dwhpVarM.a());
                    eooh.f(eork.l(new Runnable() { // from class: dvru
                        /* JADX WARN: Type inference failed for: r2v2, types: [dvjb, java.lang.Object] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            dwpx dwpxVar = ((dwna) ejwiVarA.c()).a;
                            dvte dvteVar = this.a;
                            ((ejwt) dvteVar.e).a.b(dvteVar.a, dwpxVar);
                        }
                    }, this.g), Exception.class, new ejvr() { // from class: dvrv
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            dvhv.b("SQLiteMessagingStore", "One to one conversation profile updated event receiver throws exception", (Exception) obj);
                            dvte dvteVar = this.a;
                            dwhp dwhpVarM2 = dvteVar.m();
                            dwhpVarM2.d(((dwna) ejwiVarA.c()).a);
                            dwhpVarM2.g(90);
                            dwhpVarM2.f(494);
                            dvteVar.b.b(dwhpVarM2.a());
                            return null;
                        }
                    }, this.f);
                }
            } finally {
            }
        }
        final dwpk dwpkVar2 = dwmwVar.a;
        dvhv.a("SQLiteMessagingStore", "Sending contact updated event");
        if (!ao(i2)) {
            dvhv.a("SQLiteMessagingStore", "Contact updated event is not sent");
            ListenableFuture listenableFuture2 = eorv.a;
            return;
        }
        dwhr dwhrVar2 = this.b;
        dwhp dwhpVarM2 = m();
        dwhpVarM2.c(dwpkVar2);
        dwhpVarM2.g(90);
        dwhpVarM2.f(499);
        dwhrVar2.b(dwhpVarM2.a());
        Runnable runnable = new Runnable() { // from class: dvta
            /* JADX WARN: Type inference failed for: r0v3, types: [dvjb, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                ((ejwt) this.a.e).a.c();
            }
        };
        eosc eoscVar = this.f;
        eooh.f(eork.l(runnable, eoscVar), Exception.class, new ejvr() { // from class: dvtb
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dvhv.b("SQLiteMessagingStore", "Contact updated event receiver throws exception", (Exception) obj);
                dvte dvteVar = this.a;
                dwhp dwhpVarM3 = dvteVar.m();
                dwhpVarM3.c(dwpkVar2);
                dwhpVarM3.g(90);
                dwhpVarM3.f(500);
                dvteVar.b.b(dwhpVarM3.a());
                return null;
            }
        }, eoscVar);
    }

    public final void K(dwpx dwpxVar) {
        ag(dwpxVar);
        N(dwpxVar);
    }

    public final void L(dwpx dwpxVar) {
        dvwi.a().b(dvwf.c(this.c, dwpxVar));
    }

    public final void M() {
        dvwi.a().b(dvwf.f("conversations", "REGISTRATION", String.valueOf(this.c), "CONVERSATION_LIST_PATH"));
    }

    public final void N(dwpx dwpxVar) {
        dvwi.a().b(dvwf.d(this.c, dwpxVar));
    }

    public final void O(dwpx dwpxVar) {
        dvwi.a().b(dvwf.e(this.c, dwpxVar));
    }

    public final void P(dwpx dwpxVar) {
        dvwi.a().b(dvwf.f("messages", "REGISTRATION", String.valueOf(this.c), "UNREAD_COUNT_FOR_CONVERSATION_PATH", String.valueOf(dwpxVar.hashCode())));
    }

    public final void Q(String str) {
        dvwi.a().b(dvwf.f("messages", "REGISTRATION", String.valueOf(this.c), "MESSAGES_PATH", String.valueOf(str)));
    }

    public final void R(dwqq dwqqVar) {
        dvwi.a().b(dvwf.f("messages", "REGISTRATION", String.valueOf(this.c), "MESSAGES_STATUS_COUNT_FOR_ACCOUNT_PATH", String.valueOf(dwqqVar)));
    }

    public final void S(final dwxj dwxjVar, final boolean z) {
        dvtq.b(this.h, new Runnable() { // from class: dvsi
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                dwxj dwxjVar2 = dwxjVar;
                final boolean z2 = z;
                final dvte dvteVar = this.a;
                if (z2) {
                    dvtm dvtmVar = dvteVar.h;
                    Uri uriK = dvteVar.k("blocks");
                    ContentValues contentValues = new ContentValues();
                    if (dwxjVar2.b() == dwpu.ONE_TO_ONE) {
                        dvug dvugVar = (dvug) dvui.a.fM(dwxjVar2.c().b());
                        contentValues.put("lighter_id_id", dwxjVar2.c().d());
                        contentValues.put("lighter_id_normalized_id", dvugVar == dvug.EMAIL ? dvhq.a(dwxjVar2.c().d()) : dwxjVar2.c().d());
                        contentValues.put("lighter_id_type", Integer.valueOf(dvugVar.g));
                        contentValues.put("lighter_handler_id", (String) dwxjVar2.c().c().e(""));
                        contentValues.put("lighter_id_app_name", dwxjVar2.c().e());
                    } else {
                        contentValues.put("lighter_id_type", Integer.toString(dvug.GROUP.g));
                        contentValues.put("lighter_id_id", dwxjVar2.a().b());
                        contentValues.put("lighter_id_normalized_id", dwxjVar2.a().b());
                        contentValues.put("lighter_id_app_name", dwxjVar2.a().a());
                        contentValues.put("lighter_handler_id", "");
                    }
                    if (dvtmVar.c(uriK, contentValues, 5) <= 0) {
                        return;
                    }
                } else {
                    Pair pairAm = dvte.am(dwxjVar2);
                    if (dvteVar.h.a(dvteVar.k("blocks"), (String) pairAm.first, (String[]) pairAm.second) <= 0) {
                        return;
                    }
                }
                ArrayList<dwpx> arrayList = new ArrayList();
                ekgb ekgbVarG = dvteVar.a.c().g();
                int i2 = ((ekoe) ekgbVarG).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    dwpk dwpkVar = (dwpk) ekgbVarG.get(i3);
                    dwir dwirVar = new dwir();
                    dwirVar.c(dwpkVar);
                    if (dwxjVar2.b() == dwpu.ONE_TO_ONE) {
                        dwirVar.e(dwxjVar2.c());
                    } else {
                        dwirVar.d(dwxjVar2.a());
                    }
                    dwpx dwpxVarA = dwirVar.a();
                    if (dvteVar.c(dwpxVarA) != -1) {
                        arrayList.add(dwpxVarA);
                    }
                }
                for (final dwpx dwpxVar : arrayList) {
                    dvteVar.Z(dwpxVar);
                    dvhv.a("SQLiteMessagingStore", "Sending block status updated event");
                    dwhr dwhrVar = dvteVar.b;
                    dwhp dwhpVarM = dvteVar.m();
                    dwhpVarM.d(dwpxVar);
                    dwhpVarM.g(90);
                    dwhpVarM.f(495);
                    dwhrVar.b(dwhpVarM.a());
                    eooh.f(eork.l(new Runnable() { // from class: dvst
                        /* JADX WARN: Type inference failed for: r0v3, types: [dvjb, java.lang.Object] */
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((ejwt) dvteVar.e).a.d(dwpxVar, z2);
                        }
                    }, dvteVar.g), Exception.class, new ejvr() { // from class: dvsu
                        @Override // defpackage.ejvr
                        public final Object apply(Object obj) {
                            dvhv.b("SQLiteMessagingStore", "Block status event receiver throws exception", (Exception) obj);
                            dvte dvteVar2 = dvteVar;
                            dwhp dwhpVarM2 = dvteVar2.m();
                            dwhpVarM2.d(dwpxVar);
                            dwhpVarM2.g(90);
                            dwhpVarM2.f(496);
                            dvteVar2.b.b(dwhpVarM2.a());
                            return null;
                        }
                    }, dvteVar.f);
                }
                dvwi.a().b(dvwf.a(dvteVar.c, dwxjVar2));
            }
        });
    }

    @Override // defpackage.dwws
    public final void T(final List list) {
        dvtq.b(this.h, new Runnable() { // from class: dvsp
            /* JADX WARN: Removed duplicated region for block: B:8:0x002a A[PHI: r6
              0x002a: PHI (r6v9 long) = (r6v1 long), (r6v10 long) binds: [B:10:0x0032, B:7:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 281
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dvsp.run():void");
            }
        });
    }

    @Override // defpackage.dwws
    public final void U(final dwpx dwpxVar, final dwpc... dwpcVarArr) {
        dvtq.b(this.h, new Runnable() { // from class: dvrr
            @Override // java.lang.Runnable
            public final void run() {
                dvte dvteVar = this.a;
                dwpx dwpxVar2 = dwpxVar;
                long jH = dvteVar.h(dwpxVar2, ejud.a);
                int i2 = 0;
                boolean zContains = false;
                long j2 = 0;
                while (true) {
                    dwpc[] dwpcVarArr2 = dwpcVarArr;
                    if (i2 >= dwpcVarArr2.length) {
                        dvteVar.ag(dwpxVar2);
                        if (zContains) {
                            dvteVar.P(dwpxVar2);
                        }
                        dvteVar.h(dwpxVar2, ejwi.j(Long.valueOf(j2)));
                        return;
                    }
                    dwpc dwpcVar = dwpcVarArr2[i2];
                    dwqw dwqwVarA = dwpcVar.a();
                    dwnq dwnqVar = (dwnq) dwqwVarA;
                    long j3 = dwnqVar.d;
                    if (j2 < j3) {
                        j2 = j3;
                    }
                    ContentValues contentValuesJ = dvte.j(dwqwVarA);
                    contentValuesJ.put("needs_delivery_receipt", (Boolean) dwpcVar.b().e(false));
                    contentValuesJ.put("conversation_row_id", Long.valueOf(jH));
                    contentValuesJ.put("sender_contact_row_id", Long.valueOf(dvteVar.f(dwnqVar.b)));
                    if (dvteVar.h.c(dvteVar.k("messages"), contentValuesJ, 5) < 0) {
                        throw new SQLiteException("Failed to save message.");
                    }
                    dvteVar.Q(dwnqVar.a);
                    dvteVar.N(dwnqVar.c);
                    zContains |= dvteVar.d.contains(dwnqVar.g);
                    if (dwpcVar.c().g()) {
                        dvhv.a("SQLiteMessagingStore", "Saving suggestion list for cloud message");
                        dvteVar.l((dwsg) dwpcVar.c().c());
                    }
                    i2++;
                }
            }
        });
    }

    @Override // defpackage.dwws
    public final void V(dwqw dwqwVar) {
        az(dwqwVar, true);
    }

    @Override // defpackage.dwws
    public final void W(dwqw dwqwVar) {
        az(dwqwVar, false);
    }

    public final void X(long j2, Long l) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("update_timestamp_us", l);
        if (this.h.b(k("conversations"), contentValues, "id = ?", new String[]{String.valueOf(j2)}) < 0) {
            throw new SQLiteException("Failed to update conversation.");
        }
        M();
    }

    public final void Y(long j2) {
        ContentValues contentValues = new ContentValues();
        dvhn.a();
        contentValues.put("local_update_timestamp_ms", Long.valueOf(System.currentTimeMillis()));
        if (this.h.b(k("conversations"), contentValues, "id = ?", new String[]{String.valueOf(j2)}) < 0) {
            throw new SQLiteException("Failed to update conversation local update timestamp.");
        }
    }

    public final void Z(dwpx dwpxVar) {
        Y(c(dwpxVar));
    }

    @Override // defpackage.dwws
    public final int a(long j2, long j3) {
        if (j2 >= j3) {
            dvhv.c("SQLiteMessagingStore", " Delete message in range not possible. Invalid time range.");
            return 0;
        }
        final String str = "message_status NOT IN (" + TextUtils.join(", ", new Integer[]{Integer.valueOf(dwqq.OUTGOING_PENDING_SEND.p), Integer.valueOf(dwqq.OUTGOING_SENDING.p), Integer.valueOf(dwqq.OUTGOING_FAILED_SEND.p)}) + ") AND server_timestamp_us BETWEEN ? AND ? ";
        final String[] strArr = {String.valueOf(j2), String.valueOf(j3)};
        return ((Integer) dvtq.a(this.h, new Callable() { // from class: dvsm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dvte dvteVar = this.a;
                int iA = dvteVar.h.a(dvteVar.k("messages"), str, strArr);
                dvteVar.M();
                return Integer.valueOf(iA);
            }
        })).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dwws
    public final void aa(final ekgb ekgbVar) {
        if (ekgbVar.isEmpty()) {
            return;
        }
        ekgi ekgiVar = new ekgi();
        final HashSet hashSet = new HashSet();
        int i2 = ((ekoe) ekgbVar).c;
        for (int i3 = 0; i3 < i2; i3++) {
            dwqw dwqwVar = (dwqw) ekgbVar.get(i3);
            ContentValues contentValues = new ContentValues();
            try {
                byte[] bArrI = dvhy.i(dvuu.b(dwqwVar));
                contentValues.put("rendering_type", Integer.valueOf(dwqwVar.j().a().f));
                contentValues.put("message_properties", bArrI);
                contentValues.put("capability", Integer.valueOf(dwqwVar.a()));
                ekgiVar.i(dwqwVar.r(), contentValues);
            } catch (IOException unused) {
                dvhv.c("SQLiteMessagingStore", "Could not update message properties in database due to serialization error.");
            }
        }
        final ekgp ekgpVarC = ekgiVar.c();
        dvtq.b(this.h, new Runnable() { // from class: dvro
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Set set;
                dvte dvteVar;
                int i4 = 0;
                while (true) {
                    ekgb ekgbVar2 = ekgbVar;
                    set = hashSet;
                    dvteVar = this.a;
                    if (i4 >= ((ekoe) ekgbVar2).c) {
                        break;
                    }
                    ekgp ekgpVar = ekgpVarC;
                    dwqw dwqwVar2 = (dwqw) ekgbVar2.get(i4);
                    dvteVar.h.b(dvteVar.k("messages"), (ContentValues) ekgpVar.get(dwqwVar2.r()), "message_id = ?", new String[]{dwqwVar2.r()});
                    dvteVar.Q(dwqwVar2.r());
                    set.add(dwqwVar2.f());
                    i4++;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    dvteVar.K((dwpx) it.next());
                }
            }
        });
    }

    @Override // defpackage.dwws
    public final void ab(List list, dwqq dwqqVar, dwqq dwqqVar2) {
        if (list.isEmpty() || dwqqVar.equals(dwqqVar2)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((dwqw) it.next()).r());
        }
        final ContentValues contentValues = new ContentValues();
        contentValues.put("message_status", Integer.valueOf(dwqqVar2.p));
        int i2 = 0;
        while (i2 < arrayList.size()) {
            int iMin = Math.min(i2 + 997, arrayList.size());
            final List listSubList = arrayList.subList(i2, iMin);
            final String[] strArr = new String[listSubList.size() + 1];
            listSubList.toArray(strArr);
            strArr[listSubList.size()] = Integer.toString(dwqqVar.p);
            dvtq.a(this.h, new Callable() { // from class: dvrw
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dvte dvteVar = this.a;
                    List list2 = listSubList;
                    Uri uriK = dvteVar.k("messages");
                    String strA = a.a(dvtr.c(list2.size()), "message_id IN (", ") AND message_status = ?");
                    return Integer.valueOf(dvteVar.h.b(uriK, contentValues, strA, strArr));
                }
            });
            i2 = iMin;
        }
        HashSet<dwpx> hashSet = new HashSet();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            dwqw dwqwVar = (dwqw) it2.next();
            if (dwqwVar.i().equals(dwqqVar)) {
                hashSet.add(dwqwVar.f());
                Q(dwqwVar.r());
                dwpx dwpxVarF = dwqwVar.f();
                dwqwVar.r();
                ap(dwpxVarF);
            }
        }
        ekgb ekgbVar = this.d;
        boolean z = ekgbVar.contains(dwqqVar2) || ekgbVar.contains(dwqqVar);
        for (dwpx dwpxVar : hashSet) {
            Z(dwpxVar);
            K(dwpxVar);
            if (z) {
                P(dwpxVar);
            }
        }
        R(dwqqVar);
        R(dwqqVar2);
    }

    @Override // defpackage.dwws
    public final void ac(final dwpx dwpxVar, List list, List list2, final dwqq dwqqVar) {
        if (list.isEmpty()) {
            return;
        }
        HashSet hashSet = new HashSet(list2);
        final ContentValues contentValues = new ContentValues();
        contentValues.put("message_status", Integer.valueOf(dwqqVar.p));
        int size = hashSet.size();
        final HashSet<dwqq> hashSet2 = new HashSet();
        int i2 = 0;
        while (i2 < list.size()) {
            int iMin = Math.min((998 - size) + i2, list.size());
            List listSubList = list.subList(i2, iMin);
            final String[] strArr = new String[listSubList.size() + hashSet.size()];
            final String str = "message_id IN (" + dvtr.c(listSubList.size()) + ") AND message_status IN (" + dvtr.c(hashSet.size()) + ")";
            listSubList.toArray(strArr);
            Iterator it = hashSet.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                strArr[listSubList.size() + i3] = Integer.toString(((dwqq) it.next()).p);
                i3++;
            }
            dvtq.b(this.h, new Runnable() { // from class: dvss
                @Override // java.lang.Runnable
                public final void run() {
                    dvte dvteVar = this.a;
                    String str2 = str;
                    String[] strArr2 = strArr;
                    dvtm dvtmVar = dvteVar.h;
                    Cursor cursorH = dvtmVar.h(dvteVar.k("messages"), new String[]{"message_id", "message_status"}, str2, strArr2, null, null);
                    ContentValues contentValues2 = contentValues;
                    dwqq dwqqVar2 = dwqqVar;
                    Set set = hashSet2;
                    dwpx dwpxVar2 = dwpxVar;
                    try {
                        if (cursorH.moveToFirst()) {
                            dvtmVar.b(dvteVar.k("messages"), contentValues2, str2, strArr2);
                            do {
                                String string = cursorH.getString(0);
                                dwqq dwqqVarA = dwqq.a(cursorH.getInt(1));
                                if (!dwqqVarA.equals(dwqqVar2)) {
                                    set.add(dwqqVarA);
                                    dvteVar.Q(string);
                                    dvteVar.ap(dwpxVar2);
                                }
                            } while (cursorH.moveToNext());
                        }
                        if (cursorH != null) {
                            cursorH.close();
                        }
                    } catch (Throwable th) {
                        if (cursorH == null) {
                            throw th;
                        }
                        try {
                            cursorH.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
            });
            i2 = iMin;
        }
        Z(dwpxVar);
        ekgb ekgbVar = this.d;
        boolean zContains = ekgbVar.contains(dwqqVar);
        for (dwqq dwqqVar2 : hashSet2) {
            R(dwqqVar2);
            zContains = zContains || ekgbVar.contains(dwqqVar2);
        }
        if (!hashSet2.isEmpty()) {
            R(dwqqVar);
        }
        if (zContains) {
            P(dwpxVar);
        }
        K(dwpxVar);
    }

    @Override // defpackage.dwws
    public final void ad(final dwqw dwqwVar, final long j2) {
        final ContentValues contentValues = new ContentValues();
        contentValues.put("server_timestamp_us", Long.valueOf(j2));
        dvtq.b(this.h, new Runnable() { // from class: dvsg
            @Override // java.lang.Runnable
            public final void run() {
                dwnq dwnqVar = (dwnq) dwqwVar;
                String str = dwnqVar.a;
                dvte dvteVar = this.a;
                ContentValues contentValues2 = contentValues;
                dvteVar.h.b(dvteVar.k("messages"), contentValues2, "message_id = ?", new String[]{str});
                long jC = dvteVar.c(dwnqVar.c);
                if (jC == -1) {
                    dvhv.c("SQLiteMessagingStore", "Message time updated for non existent conversation");
                } else {
                    dvteVar.X(jC, Long.valueOf(j2));
                    dvteVar.Y(jC);
                }
            }
        });
        dwnq dwnqVar = (dwnq) dwqwVar;
        Q(dwnqVar.a);
        K(dwnqVar.c);
    }

    @Override // defpackage.dwws
    public final boolean ae(final String str) {
        return ((Boolean) dvtq.a(this.h, new Callable() { // from class: dvtc
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dvte dvteVar = this.a;
                Cursor cursorH = dvteVar.h.h(dvteVar.k("messages"), new String[]{"id"}, "message_id = ?", new String[]{str}, null, null);
                try {
                    Boolean boolValueOf = Boolean.valueOf(cursorH.getCount() != 0);
                    if (cursorH != null) {
                        cursorH.close();
                    }
                    return boolValueOf;
                } catch (Throwable th) {
                    if (cursorH == null) {
                        throw th;
                    }
                    try {
                        cursorH.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
        })).booleanValue();
    }

    @Override // defpackage.dwws
    public final boolean af(final dwpx dwpxVar, final evqs evqsVar) {
        return ((Boolean) dvtq.a(this.h, new Callable() { // from class: dvrq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dvte dvteVar = this.a;
                dwpx dwpxVar2 = dwpxVar;
                long jC = dvteVar.c(dwpxVar2);
                if (jC == -1) {
                    dvhv.a("SQLiteMessagingStore", "insertOrGetConversationRowId, conversation does not exist: ".concat(dwpxVar2.toString()));
                    jC = dvteVar.h(dwpxVar2, ejud.a);
                    if (jC == -1) {
                        dvhv.a("SQLiteMessagingStore", "insertOrGetConversationRowId, conversation could not be created: ".concat(dwpxVar2.toString()));
                        jC = -1;
                    }
                }
                boolean z = false;
                if (jC != -1) {
                    ejwi ejwiVarR = dvteVar.r(jC);
                    if (ejwiVarR.g()) {
                        evqs evqsVar2 = evqsVar;
                        dwmz dwmzVar = new dwmz((dwpo) ejwiVarR.c());
                        dwmzVar.e(evqsVar2);
                        dwpo dwpoVarA = dwmzVar.a();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("conversation_properties", dvul.e(dwpoVarA));
                        int iB = dvteVar.h.b(dvteVar.k("conversations"), contentValues, "id = ?", new String[]{String.valueOf(jC)});
                        if (iB < 0) {
                            dvhv.c("SQLiteMessagingStore", "Failed to update conversation.");
                        } else {
                            dvteVar.Y(jC);
                            dwpx dwpxVar3 = ((dwna) dwpoVarA).a;
                            dvteVar.ah(iB, dwpxVar3);
                            dvteVar.L(dwpxVar3);
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
            }
        })).booleanValue();
    }

    public final void ag(final dwpx dwpxVar) {
        dvhv.a("SQLiteMessagingStore", "Sending conversation messages updated event");
        dwhp dwhpVarM = m();
        dwhpVarM.d(dwpxVar);
        dwhpVarM.g(90);
        dwhpVarM.f(497);
        this.b.b(dwhpVarM.a());
        eooh.f(eork.l(new Runnable() { // from class: dvsn
            /* JADX WARN: Type inference failed for: r1v2, types: [dvjb, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                dvte dvteVar = this.a;
                ((ejwt) dvteVar.e).a.a(dvteVar.a, dwpxVar);
            }
        }, this.g), Exception.class, new ejvr() { // from class: dvso
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dvhv.b("SQLiteMessagingStore", "Conversation messages updated event receiver throws exception", (Exception) obj);
                dvte dvteVar = this.a;
                dwhp dwhpVarM2 = dvteVar.m();
                dwhpVarM2.d(dwpxVar);
                dwhpVarM2.g(90);
                dwhpVarM2.f(498);
                dvteVar.b.b(dwhpVarM2.a());
                return null;
            }
        }, this.f);
    }

    public final void ah(int i2, final dwpx dwpxVar) {
        dvhv.a("SQLiteMessagingStore", "Sending conversation updated event");
        if (!ao(i2)) {
            dvhv.a("SQLiteMessagingStore", "Conversation updated event is not sent");
            ListenableFuture listenableFuture = eorv.a;
            return;
        }
        dwhr dwhrVar = this.b;
        dwhp dwhpVarM = m();
        dwhpVarM.d(dwpxVar);
        dwhpVarM.g(90);
        dwhpVarM.f(493);
        dwhrVar.b(dwhpVarM.a());
        eooh.f(eork.l(new Runnable() { // from class: dvsw
            /* JADX WARN: Type inference failed for: r1v2, types: [dvjb, java.lang.Object] */
            @Override // java.lang.Runnable
            public final void run() {
                dvte dvteVar = this.a;
                ((ejwt) dvteVar.e).a.b(dvteVar.a, dwpxVar);
            }
        }, this.g), Exception.class, new ejvr() { // from class: dvsx
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dvhv.b("SQLiteMessagingStore", "conversation updated event receiver throws exception", (Exception) obj);
                dvte dvteVar = this.a;
                dwhp dwhpVarM2 = dvteVar.m();
                dwhpVarM2.d(dwpxVar);
                dwhpVarM2.g(90);
                dwhpVarM2.f(494);
                dvteVar.b.b(dwhpVarM2.a());
                return null;
            }
        }, this.f);
    }

    @Override // defpackage.dwws
    public final dwwy ai(dwpx dwpxVar) {
        String[] strArr;
        String str;
        String str2;
        String[] strArrI;
        if (dwpxVar.e() == dwpu.ONE_TO_ONE) {
            str2 = "(((participants INNER JOIN contacts AS c ON contact_row_id = " + dvtr.b("c", "id") + ") INNER JOIN conversations ON conversation_row_id = " + dvtr.b("conversations", "id") + ") INNER JOIN contacts AS o ON other_contact_row_id = " + dvtr.b("o", "id") + ")";
            strArrI = dvtr.i("c", dvwm.a);
            Pair pairAA = aA("o", dwpxVar.c());
            str = (String) pairAA.first;
            strArr = (String[]) pairAA.second;
        } else {
            String str3 = "((participants INNER JOIN conversations ON conversation_row_id = " + dvtr.b("conversations", "id") + ") INNER JOIN contacts ON contact_row_id = " + dvtr.b("contacts", "id") + ")";
            String[] strArrI2 = dvtr.i("contacts", dvwm.a);
            strArr = new String[]{dwpxVar.d().b(), dwpxVar.d().a()};
            str = "conversation_group_id = ? AND conversation_group_app_name = ?";
            str2 = str3;
            strArrI = strArrI2;
        }
        dvwg dvwgVarJ = dvwh.j();
        dvwgVarJ.c(k(str2));
        dvvw dvvwVar = (dvvw) dvwgVarJ;
        dvvwVar.a = ekgb.p(strArrI);
        dvvwVar.b = str;
        dvvwVar.c = ekgb.p(strArr);
        dvvwVar.d = null;
        return aw(dvwgVarJ.a(), this.k, new ejvr() { // from class: dvsj
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                Cursor cursor = (Cursor) obj;
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                while (cursor.moveToNext()) {
                    ejwi ejwiVarC = dvuk.c(cursor);
                    if (ejwiVarC.g()) {
                        ekfwVar.h(ejwiVarC.c());
                    } else {
                        dvhv.c("ContactCursors", "error parsing row in list");
                    }
                }
                return ekfwVar.g();
            }
        }, dvwf.e(this.c, dwpxVar));
    }

    @Override // defpackage.dwws
    public final void aj(final dwpf dwpfVar) {
        ((Long) dvtq.a(this.h, new Callable() { // from class: dvse
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dvte dvteVar = this.a;
                dwpf dwpfVar2 = dwpfVar;
                long jB = dvteVar.b(((dwmw) dwpfVar2).a);
                if (jB == -1) {
                    return Long.valueOf(dvteVar.g(dwpfVar2));
                }
                int iB = dvteVar.h.b(dvteVar.k("contacts"), dvuk.a(dwpfVar2), "id = ?", new String[]{String.valueOf(jB)});
                if (iB < 0) {
                    throw new SQLiteException("Failed to update contact.");
                }
                dvteVar.J(iB, dwpfVar2);
                return Long.valueOf(jB);
            }
        })).longValue();
    }

    @Override // defpackage.dwws
    public final void ak(final dwpo dwpoVar) {
        ((Long) dvtq.a(this.h, new Callable() { // from class: dvrk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(this.a.i(dwpoVar, false));
            }
        })).longValue();
    }

    @Override // defpackage.dwws
    public final void al(final dwpo dwpoVar) {
        ((Long) dvtq.a(this.h, new Callable() { // from class: dvsr
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Long.valueOf(this.a.i(dwpoVar, true));
            }
        })).longValue();
    }

    @Override // defpackage.dwws
    public final dwwy an(final dwpx dwpxVar, dwqv[] dwqvVarArr) {
        return aw(aD(dwpxVar, dwqvVarArr), this.k, new ejvr() { // from class: dvsq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                ekgb ekgbVarG;
                Cursor cursor = (Cursor) obj;
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                boolean zMoveToFirst = cursor.moveToFirst();
                dwpx dwpxVar2 = dwpxVar;
                if (zMoveToFirst) {
                    do {
                        try {
                            ekfwVar.h(new dvud(dvuu.a(dwpxVar2, cursor)));
                        } catch (Exception unused) {
                            dwhp dwhpVarR = dwhq.r();
                            dwhpVarR.g(10032);
                            dwhpVarR.d(dwpxVar2);
                            ekfwVar.h(new dvuc(dwhpVarR.a()));
                        }
                    } while (cursor.moveToNext());
                    ekgbVarG = ekfwVar.g();
                } else {
                    ekgbVarG = ekfwVar.g();
                }
                ekgb ekgbVarD = dvun.d(ekgbVarG);
                int i3 = ((ekoe) ekgbVarD).c;
                for (int i4 = 0; i4 < i3; i4++) {
                    dvte dvteVar = this.a;
                    dvteVar.b.b((dwhq) ekgbVarD.get(i4));
                }
                return dvun.e(ekgbVarG);
            }
        }, dvwf.d(this.c, dwpxVar));
    }

    public final void ap(final dwpx dwpxVar) {
        dvhv.a("SQLiteMessagingStore", "Sending messages status updated event");
        dwhp dwhpVarM = m();
        dwhpVarM.d(dwpxVar);
        dwhpVarM.g(90);
        dwhpVarM.f(511);
        this.b.b(dwhpVarM.a());
        eooh.f(eork.l(new Runnable() { // from class: dvrn
            @Override // java.lang.Runnable
            public final void run() {
                int i2 = dvte.i;
            }
        }, this.g), Exception.class, new ejvr() { // from class: dvrp
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                dvhv.g("SQLiteMessagingStore", "Conversation messages status updated event receiver throws exception", (Exception) obj);
                dvte dvteVar = this.a;
                dwhp dwhpVarM2 = dvteVar.m();
                dwhpVarM2.d(dwpxVar);
                dwhpVarM2.g(90);
                dwhpVarM2.f(512);
                dvteVar.b.b(dwhpVarM2.a());
                return null;
            }
        }, this.f);
    }

    public final long b(dwpk dwpkVar) {
        Pair pairAC = aC(dwpkVar);
        Cursor cursorH = this.h.h(k("contacts"), new String[]{"id"}, (String) pairAC.first, (String[]) pairAC.second, null, null);
        try {
            long j2 = !cursorH.moveToFirst() ? -1L : cursorH.getLong(0);
            if (cursorH != null) {
                cursorH.close();
            }
            return j2;
        } catch (Throwable th) {
            if (cursorH == null) {
                throw th;
            }
            try {
                cursorH.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final long c(dwpx dwpxVar) {
        String[] strArr;
        String str;
        long j2 = -1;
        if (dwpxVar.e() == dwpu.GROUP) {
            str = "conversation_group_id = ? AND conversation_group_app_name = ?";
            strArr = new String[]{dwpxVar.d().b(), dwpxVar.d().a()};
        } else {
            long jB = b(dwpxVar.c());
            if (jB == -1) {
                return -1L;
            }
            strArr = new String[]{String.valueOf(jB)};
            str = "other_contact_row_id = ?";
        }
        Cursor cursorH = this.h.h(k("conversations"), new String[]{"id"}, str, strArr, null, null);
        try {
            if (cursorH.moveToFirst()) {
                j2 = cursorH.getLong(0);
            }
            if (cursorH != null) {
                cursorH.close();
            }
            return j2;
        } finally {
        }
    }

    @Override // defpackage.dwws
    public final long d() {
        return Math.max(aq("conversations", "local_update_timestamp_ms"), aq("deleted_conversations", "local_delete_timestamp_ms"));
    }

    @Override // defpackage.dwws
    public final long e() {
        Cursor cursorH = this.h.h(k("messages"), new String[]{"server_timestamp_us"}, "message_status NOT IN (" + TextUtils.join(", ", dwqq.o) + ")", new String[0], "server_timestamp_us DESC", "1");
        try {
            long j2 = !cursorH.moveToFirst() ? 0L : cursorH.getLong(0);
            if (cursorH != null) {
                cursorH.close();
            }
            return j2;
        } catch (Throwable th) {
            if (cursorH == null) {
                throw th;
            }
            try {
                cursorH.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final long f(final dwpk dwpkVar) {
        return ((Long) dvtq.a(this.h, new Callable() { // from class: dvsh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dvte dvteVar = this.a;
                dwpk dwpkVar2 = dwpkVar;
                long jB = dvteVar.b(dwpkVar2);
                if (jB == -1) {
                    dwpe dwpeVarK = dwpf.k();
                    dwpeVarK.c(dwpkVar2);
                    dwpeVarK.e(-1L);
                    int i2 = ekgb.d;
                    dwpeVarK.j(ekoe.a);
                    jB = dvteVar.g(dwpeVarK.a());
                }
                return Long.valueOf(jB);
            }
        })).longValue();
    }

    public final long g(final dwpf dwpfVar) {
        final ContentValues contentValuesA = dvuk.a(dwpfVar);
        return ((Long) dvtq.a(this.h, new Callable() { // from class: dvsz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dvte dvteVar = this.a;
                long jC = dvteVar.h.c(dvteVar.k("contacts"), contentValuesA, 0);
                if (jC < 0) {
                    throw new SQLiteException("Failed to save contact.");
                }
                dvteVar.J(1, dwpfVar);
                return Long.valueOf(jC);
            }
        })).longValue();
    }

    final long h(dwpx dwpxVar, ejwi ejwiVar) {
        long jC = c(dwpxVar);
        if (jC == -1) {
            dwpn dwpnVarR = dwpo.r();
            dwpnVarR.f(dwpxVar);
            dwpnVarR.h(-1L);
            dwpnVarR.b(new HashMap());
            dwpnVarR.c(dwpxVar.e() == dwpu.ONE_TO_ONE);
            jC = ar(dwpnVarR.a());
        }
        if (ejwiVar.g()) {
            X(jC, (Long) ejwiVar.c());
            Y(jC);
        }
        return jC;
    }

    public final long i(dwpo dwpoVar, boolean z) {
        byte[] bArrI;
        dwna dwnaVar = (dwna) dwpoVar;
        long jC = c(dwnaVar.a);
        if (jC == -1) {
            return ar(dwpoVar);
        }
        ejwi ejwiVarR = r(jC);
        if (z && ejwiVarR.g() && ((dwna) ejwiVarR.c()).f != -1) {
            return jC;
        }
        ContentValues contentValues = new ContentValues();
        if (ejwiVarR.g()) {
            try {
                HashMap mapC = dvul.c((dwpo) ejwiVarR.c());
                dvul.f(mapC, dwpoVar);
                bArrI = dvhy.i(mapC);
            } catch (IOException e) {
                dvhv.d("ConversationCursors", "Failed to serialize conversation properties.", e);
                bArrI = new byte[0];
            }
            contentValues.put("conversation_properties", bArrI);
        } else {
            contentValues.put("conversation_properties", dvul.e(dwpoVar));
        }
        contentValues.put("conversation_app_data", dvul.d(new HashMap(dwnaVar.i)));
        dvhn.a();
        contentValues.put("local_update_timestamp_ms", Long.valueOf(System.currentTimeMillis()));
        int iB = this.h.b(k("conversations"), contentValues, "id = ?", new String[]{String.valueOf(jC)});
        if (iB < 0) {
            dvhv.c("SQLiteMessagingStore", "Failed to update conversation.");
            return -1L;
        }
        dwpx dwpxVar = dwnaVar.a;
        ah(iB, dwpxVar);
        L(dwpxVar);
        M();
        return jC;
    }

    public final Uri k(String str) {
        String strValueOf = String.valueOf(this.k.getPackageName());
        return dvtr.a(strValueOf.concat(".lighter.data"), "MESSAGING", str, Long.toString(this.c));
    }

    @Override // defpackage.dwws
    public final Pair l(final dwsg dwsgVar) {
        return (Pair) dvtq.a(this.h, new Callable() { // from class: dvsv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dvte dvteVar = this.a;
                dwsg dwsgVar2 = dwsgVar;
                String strE = dwsgVar2.e();
                ejwi ejwiVarT = dvteVar.t(strE);
                if (!ejwiVarT.g()) {
                    dvhv.c("SQLiteMessagingStore", "Trying to save a SuggestionList whose Message has not been saved.");
                    return Pair.create(false, false);
                }
                ejwi ejwiVarS = dvteVar.s(strE, "conversation_row_id");
                if (!ejwiVarS.g()) {
                    dvhv.c("SQLiteMessagingStore", "Message exists without conversationId.");
                    return Pair.create(false, true);
                }
                ejwi ejwiVarR = dvteVar.r(((Long) ejwiVarS.c()).longValue());
                if (!ejwiVarR.g()) {
                    dvhv.c("SQLiteMessagingStore", "Message exists without conversation.");
                    return Pair.create(false, true);
                }
                Object objC = ejwiVarR.c();
                dwna dwnaVar = (dwna) objC;
                ejwi ejwiVar = dwnaVar.j;
                if (ejwiVar.g()) {
                    ejwi ejwiVarT2 = dvteVar.t(((dwsg) ejwiVar.c()).e());
                    if (ejwiVarT2.g() && ((Long) ejwiVarT.c()).longValue() < ((Long) ejwiVarT2.c()).longValue()) {
                        return Pair.create(false, true);
                    }
                }
                dwmz dwmzVar = new dwmz((dwpo) objC);
                dwmzVar.a = ejwi.j(dwsgVar2);
                dwpo dwpoVarA = dwmzVar.a();
                ContentValues contentValues = new ContentValues();
                contentValues.put("conversation_properties", dvul.e(dwpoVarA));
                int iB = dvteVar.h.b(dvteVar.k("conversations"), contentValues, "id = ?", new String[]{ejwiVarS.c().toString()});
                if (iB < 0) {
                    dvhv.c("SQLiteMessagingStore", "Failed to update conversation.");
                    return Pair.create(false, true);
                }
                dwpx dwpxVar = dwnaVar.a;
                dvteVar.ah(iB, dwpxVar);
                dvteVar.L(dwpxVar);
                return Pair.create(true, true);
            }
        });
    }

    public final dwhp m() {
        dwje dwjeVar = this.a;
        dwhp dwhpVarR = dwhq.r();
        dwhpVarR.n(dwjeVar.c().f());
        dwhpVarR.o(dwjeVar.d().E());
        return dwhpVarR;
    }

    @Override // defpackage.dwws
    public final dwov n(dwpx dwpxVar) {
        dwhp dwhpVarM = m();
        dwhpVarM.d(dwpxVar);
        dwhpVarM.g(91);
        dwhpVarM.f(612);
        this.b.b(dwhpVarM.a());
        try {
            return (dwov) ax(as(dwxi.a(dwpxVar)), new dvsf());
        } catch (RuntimeException e) {
            dwhr dwhrVar = this.b;
            dwhp dwhpVarM2 = m();
            dwhpVarM2.d(dwpxVar);
            dwhpVarM2.g(91);
            dwhpVarM2.f(613);
            dwhrVar.b(dwhpVarM2.a());
            throw e;
        }
    }

    @Override // defpackage.dwws
    public final dwwy o(dwxj dwxjVar) {
        return aw(as(dwxjVar), this.k, new dvsf(), dvwf.a(this.c, dwxjVar));
    }

    @Override // defpackage.dwws
    public final dwwy p(dwpk dwpkVar) {
        return aw(at(dwpkVar), this.k, new dvsa(), dvwf.b(this.c, dwpkVar));
    }

    @Override // defpackage.dwws
    public final dwwy q(dwpx dwpxVar) {
        return aw(au(dwpxVar), this.k, new dvrm(), dvwf.c(this.c, dwpxVar));
    }

    public final ejwi r(long j2) {
        String[] strArr = {Long.toString(j2)};
        String strAB = aB();
        String[] strArrI = dvtr.i("conversations", dvwq.b);
        String[] strArr2 = dvwm.a;
        Cursor cursorH = this.h.h(k(strAB), dvtr.h(strArrI, dvtr.i("o", strArr2), dvtr.i("c", strArr2)), "conversations.id = ?", strArr, null, null);
        try {
            if (cursorH.moveToFirst()) {
                ejwi ejwiVarA = dvul.a(cursorH);
                if (cursorH != null) {
                    cursorH.close();
                }
                return ejwiVarA;
            }
            dvhv.f("SQLiteMessagingStore", "Conversation lookup failed");
            if (cursorH != null) {
                cursorH.close();
            }
            return ejud.a;
        } catch (Throwable th) {
            if (cursorH == null) {
                throw th;
            }
            try {
                cursorH.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final ejwi s(String str, String str2) {
        Cursor cursorH = this.h.h(k("messages"), new String[]{str2}, "message_id = ?", new String[]{str}, null, null);
        try {
            if (cursorH.moveToFirst()) {
                ejwi ejwiVarJ = ejwi.j(Long.valueOf(cursorH.getLong(0)));
                if (cursorH != null) {
                    cursorH.close();
                }
                return ejwiVarJ;
            }
            ejud ejudVar = ejud.a;
            if (cursorH != null) {
                cursorH.close();
            }
            return ejudVar;
        } catch (Throwable th) {
            if (cursorH == null) {
                throw th;
            }
            try {
                cursorH.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final ejwi t(String str) {
        return s(str, "server_timestamp_us");
    }

    @Override // defpackage.dwws
    public final ejwi u(dwpk dwpkVar) {
        dwhp dwhpVarM = m();
        dwhpVarM.c(dwpkVar);
        dwhpVarM.g(91);
        dwhpVarM.f(605);
        this.b.b(dwhpVarM.a());
        try {
            return (ejwi) ax(at(dwpkVar), new dvsa());
        } catch (RuntimeException e) {
            dwhr dwhrVar = this.b;
            dwhp dwhpVarM2 = m();
            dwhpVarM2.c(dwpkVar);
            dwhpVarM2.g(91);
            dwhpVarM2.f(606);
            dwhrVar.b(dwhpVarM2.a());
            throw e;
        }
    }

    @Override // defpackage.dwws
    public final ejwi v(dwpx dwpxVar) {
        dwhp dwhpVarM = m();
        dwhpVarM.d(dwpxVar);
        dwhpVarM.g(91);
        dwhpVarM.f(601);
        this.b.b(dwhpVarM.a());
        try {
            return (ejwi) ax(au(dwpxVar), new dvrm());
        } catch (RuntimeException e) {
            dwhr dwhrVar = this.b;
            dwhp dwhpVarM2 = m();
            dwhpVarM2.d(dwpxVar);
            dwhpVarM2.g(91);
            dwhpVarM2.f(602);
            dwhrVar.b(dwhpVarM2.a());
            throw e;
        }
    }

    @Override // defpackage.dwws
    public final ejwi w(final dwpx dwpxVar) {
        dwhp dwhpVarM = m();
        dwhpVarM.d(dwpxVar);
        dwhpVarM.g(91);
        dwhpVarM.f(603);
        this.b.b(dwhpVarM.a());
        try {
            return (ejwi) ax(aD(dwpxVar, dwqv.e), new ejvr() { // from class: dvsk
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Cursor cursor = (Cursor) obj;
                    int i2 = dvte.i;
                    if (cursor.moveToFirst()) {
                        return ejwi.j(dvuu.a(dwpxVar, cursor));
                    }
                    dvhv.a("SQLiteMessagingStore", "no messages found in the conversation");
                    return ejud.a;
                }
            });
        } catch (RuntimeException e) {
            dwhr dwhrVar = this.b;
            dwhp dwhpVarM2 = m();
            dwhpVarM2.d(dwpxVar);
            dwhpVarM2.g(91);
            dwhpVarM2.f(604);
            dwhrVar.b(dwhpVarM2.a());
            throw e;
        }
    }

    @Override // defpackage.dwws
    public final ekgb x(final dwpx dwpxVar, final dwqq dwqqVar, final long j2) {
        return (ekgb) dvtq.a(this.h, new Callable() { // from class: dvrt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                dvte dvteVar = this.a;
                String[] strArr = {Long.toString(dvteVar.c(dwpxVar)), Integer.toString(dwqqVar.p), Long.toString(j2)};
                int i2 = ekgb.d;
                ekfw ekfwVar = new ekfw();
                Cursor cursorH = dvteVar.h.h(dvteVar.k("messages"), new String[]{"message_id"}, "conversation_row_id = ? AND message_status = ? AND server_timestamp_us > ?", strArr, null, null);
                try {
                    if (cursorH.moveToFirst()) {
                        do {
                            ekfwVar.h(cursorH.getString(0));
                        } while (cursorH.moveToNext());
                    }
                    ekgb ekgbVarG = ekfwVar.g();
                    if (cursorH != null) {
                        cursorH.close();
                    }
                    return ekgbVarG;
                } catch (Throwable th) {
                    if (cursorH == null) {
                        throw th;
                    }
                    try {
                        cursorH.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
        });
    }

    @Override // defpackage.dwws
    public final ekgb y(long j2, long j3) {
        dwhp dwhpVarM = m();
        dwhpVarM.g(91);
        dwhpVarM.f(609);
        this.b.b(dwhpVarM.a());
        try {
            String[] strArr = {String.valueOf(j2), String.valueOf(j3)};
            dvwg dvwgVarJ = dvwh.j();
            dvwgVarJ.c(k("deleted_conversations"));
            ((dvvw) dvwgVarJ).a = dvwo.a;
            ((dvvw) dvwgVarJ).b = "local_delete_timestamp_ms BETWEEN ? AND ?";
            ((dvvw) dvwgVarJ).c = ekgb.p(strArr);
            ((dvvw) dvwgVarJ).d = "local_delete_timestamp_ms ASC";
            return (ekgb) ax(dvwgVarJ.a(), new ejvr() { // from class: dvtd
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    Long lValueOf;
                    JSONObject jSONObject;
                    ejwi ejwiVarJ;
                    dwir dwirVar;
                    ejwi ejwiVarF;
                    Cursor cursor = (Cursor) obj;
                    boolean zMoveToFirst = cursor.moveToFirst();
                    dvte dvteVar = this.a;
                    if (!zMoveToFirst) {
                        dvhv.a("SQLiteMessagingStore", "no deleted conversations found");
                        int i2 = ekgb.d;
                        return ekoe.a;
                    }
                    int i3 = ekgb.d;
                    ekfw ekfwVar = new ekfw();
                    do {
                        try {
                            try {
                                String string = cursor.getString(dvwn.a(2));
                                lValueOf = Long.valueOf(cursor.getLong(dvwn.a(3)));
                                jSONObject = new JSONObject(string);
                                try {
                                    dwirVar = new dwir();
                                    ejwiVarF = dwpk.f(jSONObject.getJSONObject("OWNER"));
                                } catch (JSONException unused) {
                                    dvhv.c("ConversationId", "failed to convert JSONObject to ConversationId");
                                    ejwiVarJ = ejud.a;
                                }
                            } catch (RuntimeException e) {
                                e = e;
                                dvhv.d("SQLiteMessagingStore", "Unable to parse the conversation id json object from a string.", e);
                                dwhr dwhrVar = dvteVar.b;
                                dwhp dwhpVarM2 = dvteVar.m();
                                dwhpVarM2.g(91);
                                dwhpVarM2.f(611);
                                dwhrVar.b(dwhpVarM2.a());
                            }
                        } catch (JSONException e2) {
                            e = e2;
                            dvhv.d("SQLiteMessagingStore", "Unable to parse the conversation id json object from a string.", e);
                            dwhr dwhrVar2 = dvteVar.b;
                            dwhp dwhpVarM22 = dvteVar.m();
                            dwhpVarM22.g(91);
                            dwhpVarM22.f(611);
                            dwhrVar2.b(dwhpVarM22.a());
                        }
                        if (ejwiVarF.g()) {
                            dwirVar.c((dwpk) ejwiVarF.c());
                            int iOrdinal = dwpu.a(jSONObject.getInt(VCardConstants.PARAM_TYPE)).ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal == 1) {
                                    ejwi ejwiVarC = dwpr.c(jSONObject.getJSONObject("GROUP"));
                                    if (ejwiVarC.g()) {
                                        dwirVar.d((dwpr) ejwiVarC.c());
                                    } else {
                                        ejwiVarJ = ejud.a;
                                    }
                                }
                                ejwiVarJ = ejwi.j(dwirVar.a());
                            } else {
                                ejwi ejwiVarF2 = dwpk.f(jSONObject.getJSONObject("OTHER_PARTICIPANT"));
                                if (ejwiVarF2.g()) {
                                    dwirVar.e((dwpk) ejwiVarF2.c());
                                    ejwiVarJ = ejwi.j(dwirVar.a());
                                } else {
                                    ejwiVarJ = ejud.a;
                                }
                            }
                        } else {
                            ejwiVarJ = ejud.a;
                        }
                        if (ejwiVarJ.g()) {
                            ekfwVar.h(Pair.create(ejwiVarJ.c(), lValueOf));
                        } else {
                            dvhv.c("SQLiteMessagingStore", "ConversationId.fromJSONObject returned empty optional");
                            dwhr dwhrVar3 = dvteVar.b;
                            dwhp dwhpVarM3 = dvteVar.m();
                            dwhpVarM3.g(91);
                            dwhpVarM3.f(611);
                            dwhrVar3.b(dwhpVarM3.a());
                        }
                    } while (cursor.moveToNext());
                    return ekfwVar.g();
                }
            });
        } catch (RuntimeException e) {
            dvhv.d("SQLiteMessagingStore", "Query deleted conversations within time range failed", e);
            dwhr dwhrVar = this.b;
            dwhp dwhpVarM2 = m();
            dwhpVarM2.g(91);
            dwhpVarM2.f(610);
            dwhrVar.b(dwhpVarM2.a());
            throw e;
        }
    }

    @Override // defpackage.dwws
    public final ekgb z(long j2, long j3) {
        dwhp dwhpVarM = m();
        dwhpVarM.g(91);
        dwhpVarM.f(607);
        this.b.b(dwhpVarM.a());
        try {
            String[] strArr = {String.valueOf(j2), String.valueOf(j3)};
            dvwg dvwgVarJ = dvwh.j();
            dvwgVarJ.c(k(aB()));
            String[] strArrI = dvtr.i("conversations", dvwq.b);
            String[] strArr2 = dvwm.a;
            ((dvvw) dvwgVarJ).a = ekgb.p(dvtr.h(strArrI, dvtr.i("o", strArr2), dvtr.i("c", strArr2)));
            ((dvvw) dvwgVarJ).b = "local_update_timestamp_ms BETWEEN ? AND ?";
            ((dvvw) dvwgVarJ).c = ekgb.p(strArr);
            ((dvvw) dvwgVarJ).d = "local_update_timestamp_ms ASC";
            return (ekgb) ax(dvwgVarJ.a(), new ejvr() { // from class: dvri
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.ejvr
                public final Object apply(Object obj) {
                    ekgb ekgbVarG;
                    Cursor cursor = (Cursor) obj;
                    int i2 = ekgb.d;
                    ekfw ekfwVar = new ekfw();
                    if (cursor.moveToFirst()) {
                        do {
                            try {
                                ejwi ejwiVarA = dvul.a(cursor);
                                if (ejwiVarA.g()) {
                                    ekfwVar.h(new dvud(ejwiVarA.c()));
                                } else {
                                    dwhp dwhpVarR = dwhq.r();
                                    dwhpVarR.g(10031);
                                    ekfwVar.h(new dvuc(dwhpVarR.a()));
                                }
                            } catch (Exception unused) {
                                dwhp dwhpVarR2 = dwhq.r();
                                dwhpVarR2.g(10031);
                                ekfwVar.h(new dvuc(dwhpVarR2.a()));
                            }
                        } while (cursor.moveToNext());
                        ekgbVarG = ekfwVar.g();
                    } else {
                        ekgbVarG = ekfwVar.g();
                    }
                    ekgb ekgbVarD = dvun.d(ekgbVarG);
                    int i3 = ((ekoe) ekgbVarD).c;
                    for (int i4 = 0; i4 < i3; i4++) {
                        dvte dvteVar = this.a;
                        dvteVar.b.b((dwhq) ekgbVarD.get(i4));
                    }
                    return dvun.e(ekgbVarG);
                }
            });
        } catch (RuntimeException e) {
            dvhv.d("SQLiteMessagingStore", "Query updated conversations within time range failed", e);
            dwhr dwhrVar = this.b;
            dwhp dwhpVarM2 = m();
            dwhpVarM2.g(91);
            dwhpVarM2.f(608);
            dwhrVar.b(dwhpVarM2.a());
            throw e;
        }
    }
}
