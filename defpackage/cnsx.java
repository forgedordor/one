package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.Telephony;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnsx implements Closeable, AutoCloseable {
    public final String d;
    public final String e;
    public final String f;
    private final Context j;
    private final aipo k;
    private final cnsz l;
    private final ains m;
    private final apub n;
    private final cmqj o;
    private cnss p;
    private cnss q;
    private final String r;
    private final fcsu s;
    public static final cqce a = cqce.g("Bugle", "SyncCursorPair");
    private static final ekrg g = ekrg.c("com/google/android/apps/messaging/shared/telephony/forwardsync/SyncCursorPair");
    static final cczi b = cdag.e(cdag.b, "forward_sync_spot_sync_limit", 1000);
    private static final String h = String.format(Locale.US, "(%s NOTNULL)", MessagesTable.c.o);
    public static final String c = String.format(Locale.US, "(%s NOTNULL)", MessagesTable.c.a);
    private static final String[] i = {"count()"};

    public cnsx(Context context, aipo aipoVar, ains ainsVar, cnsz cnszVar, cmqj cmqjVar, fcsu fcsuVar, apub apubVar, long j, long j2) {
        this.j = context;
        this.k = aipoVar;
        this.m = ainsVar;
        this.l = cnszVar;
        this.n = apubVar;
        this.s = fcsuVar;
        this.o = cmqjVar;
        long j3 = j < 0 ? j : (j / 1000) * 1000;
        long j4 = j2 < 0 ? j2 : ((j2 + 999) / 1000) * 1000;
        String str = c;
        bran branVar = MessagesTable.c;
        long j5 = j4;
        long j6 = j3;
        this.r = t(str, branVar.i.toString(), j6, j5);
        this.d = t(h, branVar.i.toString(), j6, j5);
        this.e = t(s(cmqjVar), "date", j6, j5);
        this.f = t(r(cmqjVar), "date", j3 / 1000, j5 / 1000);
    }

    public static int b(final String str) {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("+isSynchronized");
        brdrVarD.h(new Function() { // from class: cnsq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                cqce cqceVar = cnsx.a;
                brecVar.ar(new dqxm(str));
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return brdrVarD.b().h();
    }

    public static final void l(List list, List list2, ctz ctzVar, cmoa cmoaVar, cmsk cmskVar) {
        String str;
        long j;
        String str2;
        long j2;
        if (cmoaVar.a() == 1) {
            cmny cmnyVar = (cmny) cmoaVar;
            cmnyVar.l = true;
            ctzVar.f(cmnyVar.b, cmnyVar);
            list2.add(cmnyVar);
            j = cmnyVar.i;
            str = cmnyVar.a;
        } else {
            if (cmoaVar.a() == 0) {
                cmoc cmocVar = (cmoc) cmoaVar;
                cmocVar.k = true;
                list.add(cmocVar);
                long j3 = cmocVar.i;
                str2 = cmocVar.b;
                j2 = j3;
                cmskVar.a(cmmo.c, j2, str2, Integer.valueOf(cmoaVar.e()));
            }
            cqbd cqbdVarE = a.e();
            cqbdVarE.I("Tried to add message with unknown protocol");
            cqbdVarE.y("protocol", cmoaVar.a());
            cqbdVarE.r();
            str = null;
            j = -1;
        }
        str2 = str;
        j2 = j;
        cmskVar.a(cmmo.c, j2, str2, Integer.valueOf(cmoaVar.e()));
    }

    private static int m(ArrayList arrayList, ctz ctzVar, ArrayList arrayList2) {
        return arrayList.size() + ctzVar.b() + arrayList2.size();
    }

    private static int n(Cursor cursor) {
        if (cursor == null || !cursor.moveToFirst()) {
            throw new IllegalArgumentException(a.a(cursor != null ? cursor.getCount() == 0 ? "empty" : "" : "null", "Cannot get count from ", " cursor"));
        }
        return cursor.getInt(0);
    }

    private static final long o(cmnu cmnuVar) {
        return cmnuVar.c() / 1000;
    }

    private static dzfh p(int i2, int i3) {
        return i2 >= i3 ? new dzfh("ForwardSync::ScanOneBatch::FullUpdates") : i2 > 0 ? new dzfh("ForwardSync::ScanOneBatch::SomeUpdates") : new dzfh("ForwardSync::ScanOneBatch::NoUpdates");
    }

    private static String q(Set set, final String str) {
        return String.format("(%s IN (%s))", "_id", (String) Collection.EL.stream(set).filter(new Predicate() { // from class: cnse
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
            public final boolean test(Object obj) throws NumberFormatException {
                Uri uri = (Uri) obj;
                cqce cqceVar = cnsx.a;
                if (!str.equals(uri.getAuthority())) {
                    return false;
                }
                if (uri.getPathSegments().size() != 1) {
                    cqbd cqbdVarE = cnsx.a.e();
                    cqbdVarE.I("Found message URI with number of path segments != 1.");
                    cqbdVarE.A("Uri", uri);
                    cqbdVarE.r();
                    return false;
                }
                try {
                    Long.parseLong(uri.getPathSegments().get(0));
                    return true;
                } catch (NumberFormatException unused) {
                    cqbd cqbdVarE2 = cnsx.a.e();
                    cqbdVarE2.I("Failed to parse message id from message Uri.");
                    cqbdVarE2.A("Uri", uri);
                    cqbdVarE2.r();
                    return false;
                }
            }
        }).map(new Function() { // from class: cnsj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cqce cqceVar = cnsx.a;
                return ((Uri) obj).getPathSegments().get(0);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(", ")));
    }

    private static String r(cmqj cmqjVar) {
        return cmqjVar.B();
    }

    private static String s(cmqj cmqjVar) {
        return cmqjVar.E();
    }

    private static String t(String str, String str2, long j, long j2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (j > 0) {
            sb.append(" AND ");
            sb.append(str2);
            sb.append(">=");
            sb.append(j);
        }
        if (j2 > 0) {
            sb.append(" AND ");
            sb.append(str2);
            sb.append("<");
            sb.append(j2);
        }
        if (!TextUtils.isEmpty(null) && !TextUtils.isEmpty(null)) {
            sb.append(" AND null=null");
        }
        return sb.toString();
    }

    private static final boolean u(cmoa cmoaVar, final cmnv cmnvVar) {
        boolean z;
        if (Objects.equals(cmoaVar.d(), cmnvVar.b)) {
            return true;
        }
        int iA = cmoaVar.a();
        int i2 = cmnvVar.a;
        if (iA == i2 || (cmoaVar.a() == 1 && i2 == 3)) {
            if (cmoaVar.a() == 1) {
                cmny cmnyVar = (cmny) cmoaVar;
                if (!ejwk.c(cmnyVar.o)) {
                    String str = cmnvVar.g;
                    if (!ejwk.c(str) && Objects.equals(cmnyVar.o, str)) {
                        return true;
                    }
                }
                bsje bsjeVarC = PartsTable.c();
                bsjeVarC.A("allPartsMatch");
                bsjeVarC.h(new Function() { // from class: cnsh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bsjl bsjlVar = (bsjl) obj;
                        cqce cqceVar = cnsx.a;
                        bsjlVar.n(cmnvVar.d);
                        return bsjlVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                ekgb ekgbVarZ = bsjeVarC.b().z();
                List<cmnz> list = cmnyVar.x;
                if (list.size() == ekgbVarZ.size()) {
                    loop0: while (true) {
                        for (final cmnz cmnzVar : list) {
                            z = z && Collection.EL.stream(ekgbVarZ).anyMatch(new Predicate() { // from class: cnsi
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
                                    PartsTable.BindData bindData = (PartsTable.BindData) obj;
                                    cqce cqceVar = cnsx.a;
                                    String str2 = cmnzVar.f;
                                    return str2 == null || str2.equals(bindData.L());
                                }
                            });
                        }
                    }
                    if (z) {
                        return true;
                    }
                }
            } else if (cmoaVar.a() == 0 && Objects.equals(((cmoc) cmoaVar).e, cmnvVar.f)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean v(cmnv cmnvVar, Set set, Set set2) {
        if (!ejwk.c(cmnvVar.b)) {
            return false;
        }
        Stream map = Collection.EL.stream(set2).map(new Function() { // from class: cnsl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                cqce cqceVar = cnsx.a;
                return ((cnrv) obj).b();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i2 = ekgb.d;
        ekgb ekgbVar = (ekgb) map.collect(ekcv.a);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            cmoa cmoaVar = (cmoa) it.next();
            if (u(cmoaVar, cmnvVar) && !ekgbVar.contains(cmoaVar)) {
                set2.add(new cnql(cmnvVar, cmoaVar));
                return true;
            }
        }
        return false;
    }

    public final int a() {
        brap brapVar = ((cnsv) this.p).a;
        if (brapVar == null) {
            return 0;
        }
        return brapVar.getCount();
    }

    public final int c() {
        brap brapVar = ((cnsv) this.p).a;
        if (brapVar == null) {
            return 0;
        }
        return brapVar.getPosition();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        cnsv cnsvVar;
        brap brapVar;
        cnss cnssVar = this.p;
        if (cnssVar != null && (brapVar = (cnsvVar = (cnsv) cnssVar).a) != null) {
            brapVar.close();
            cnsvVar.a = null;
        }
        cnss cnssVar2 = this.q;
        if (cnssVar2 != null) {
            cnsw cnswVar = (cnsw) cnssVar2;
            Cursor cursor = cnswVar.a;
            if (cursor != null) {
                cursor.close();
                cnswVar.a = null;
            }
            Cursor cursor2 = cnswVar.b;
            if (cursor2 != null) {
                cursor2.close();
                cnswVar.b = null;
            }
        }
    }

    public final int d() {
        cnsw cnswVar = (cnsw) this.q;
        Cursor cursor = cnswVar.a;
        int count = cursor == null ? 0 : cursor.getCount();
        Cursor cursor2 = cnswVar.b;
        return count + (cursor2 != null ? cursor2.getCount() : 0);
    }

    public final int e(String str, String str2) {
        Context context = this.j;
        ainv ainvVarB = this.k.b("Bugle.Telephony.Query.Count.Latency");
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = Telephony.Sms.CONTENT_URI;
        String[] strArr = i;
        Cursor cursorC = cdzz.c(contentResolver, uri, strArr, str, null, null);
        try {
            axie.l(cursorC);
            ainvVarB.c();
            int iN = n(cursorC);
            if (cursorC != null) {
                cursorC.close();
            }
            aipo aipoVar = this.k;
            Context context2 = this.j;
            ainv ainvVarB2 = aipoVar.b("Bugle.Telephony.Query.Count.Latency");
            cursorC = cdzz.c(context2.getContentResolver(), Telephony.Mms.CONTENT_URI, strArr, str2, null, null);
            try {
                axie.l(cursorC);
                ainvVarB2.c();
                int iN2 = n(cursorC);
                if (cursorC != null) {
                    cursorC.close();
                }
                return iN + iN2;
            } finally {
            }
        } finally {
        }
    }

    public final int f() {
        cnsw cnswVar = (cnsw) this.q;
        Cursor cursor = cnswVar.a;
        int position = cursor == null ? 0 : cursor.getPosition();
        return (position + (cnswVar.b != null ? r0.getPosition() : 0)) - 1;
    }

    final cmnv g() {
        cnsv cnsvVar = (cnsv) this.p;
        brap brapVar = cnsvVar.a;
        if (brapVar == null || !brapVar.moveToNext()) {
            return null;
        }
        cnsx cnsxVar = cnsvVar.b;
        brap brapVar2 = cnsvVar.a;
        if (brapVar2 == null) {
            return null;
        }
        Uri uriO = brapVar2.o();
        String strI = brapVar2.I();
        String strDe = brapVar2.de("parts_expression");
        MessageIdType messageIdTypeQ = brapVar2.q();
        int iC = brapVar2.c();
        String string = uriO != null ? uriO.toString() : null;
        long jL = brapVar2.l();
        ConversationIdType conversationIdTypeP = brapVar2.p();
        brapVar2.e();
        brapVar2.C();
        return new cmnv(messageIdTypeQ, iC, string, jL, conversationIdTypeP, strDe, strI);
    }

    final cmoa h(Set set, cmsk cmskVar) {
        cmoa cmoaVar;
        cnsw cnswVar = (cnsw) this.q;
        cmoa cmoaVar2 = cnswVar.c;
        if (cmoaVar2 == null || (cmoaVar = cnswVar.d) == null) {
            if (cmoaVar2 != null) {
                cnswVar.c = cnswVar.b();
            } else {
                cmoaVar2 = cnswVar.d;
                cnswVar.d = cnswVar.a();
            }
        } else if (((cmoc) cmoaVar2).f >= ((cmny) cmoaVar).g) {
            cnswVar.c = cnswVar.b();
        } else {
            cnswVar.d = cnswVar.a();
            cmoaVar2 = cmoaVar;
        }
        if (cmoaVar2 != null && !((Boolean) avos.a.e()).booleanValue()) {
            long jF = cmoaVar2.f();
            cmtz cmtzVarA = cmskVar.a(cmol.a, jF, ejwk.b(cmoaVar2.d()), Integer.valueOf(cmoaVar2.e()));
            long j = cmtzVarA.a;
            if (j != jF && j != -1 && jF != -1) {
                set.add(new cnqm(jF, cmtzVarA));
            }
        }
        if (cmoaVar2 != null && cmoaVar2.c() == 0) {
            this.m.e("Bugle.Telephony.ForwardSync.SyncCursorPair.ReadTelephonyMessageWithTimestampZero", cmoaVar2 instanceof cmny ? 1 : 0);
        }
        return cmoaVar2;
    }

    public final void i(int i2) {
        this.p = new cnsv(this, this.r);
        cnsz cnszVar = this.l;
        Context context = (Context) cnszVar.a.b();
        context.getClass();
        aipo aipoVar = (aipo) cnszVar.b.b();
        aipoVar.getClass();
        cmof cmofVar = (cmof) cnszVar.c.b();
        cmofVar.getClass();
        cmqj cmqjVar = (cmqj) cnszVar.d.b();
        cmqjVar.getClass();
        this.q = new cnsw(context, aipoVar, cmofVar, cmqjVar, this.e, this.f, i2);
    }

    public final boolean j() {
        String str = this.e;
        String str2 = this.f;
        try {
            int iB = b(this.d);
            int iE = e(str, str2);
            boolean z = iB == iE;
            if (z) {
                cqbd cqbdVarA = a.a();
                cqbdVarA.I("Same number of local and remote messages.");
                cqbdVarA.y("count", iB);
                cqbdVarA.r();
                return z;
            }
            cqbd cqbdVarC = a.c();
            cqbdVarC.I("Not in sync.");
            cqbdVarC.y("localCount", iB);
            cqbdVarC.y("remoteCount", iE);
            cqbdVarC.r();
            return z;
        } catch (Exception e) {
            cqbd cqbdVarB = a.b();
            cqbdVarB.I("failed to query local or remote message counts");
            cqbdVarB.s(e);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006e A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:8:0x005b, B:17:0x006e, B:20:0x007f, B:25:0x0092, B:31:0x00b5, B:33:0x00bd, B:36:0x00c5, B:37:0x00c7, B:39:0x00d2, B:41:0x00f2, B:43:0x0104, B:49:0x0118, B:65:0x015e, B:67:0x0167, B:69:0x016d, B:73:0x0176, B:75:0x0186, B:77:0x0195, B:79:0x0199, B:46:0x010e), top: B:196:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f A[Catch: all -> 0x0062, TryCatch #1 {all -> 0x0062, blocks: (B:8:0x005b, B:17:0x006e, B:20:0x007f, B:25:0x0092, B:31:0x00b5, B:33:0x00bd, B:36:0x00c5, B:37:0x00c7, B:39:0x00d2, B:41:0x00f2, B:43:0x0104, B:49:0x0118, B:65:0x015e, B:67:0x0167, B:69:0x016d, B:73:0x0176, B:75:0x0186, B:77:0x0195, B:79:0x0199, B:46:0x010e), top: B:196:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b5 A[Catch: all -> 0x0062, TRY_ENTER, TryCatch #1 {all -> 0x0062, blocks: (B:8:0x005b, B:17:0x006e, B:20:0x007f, B:25:0x0092, B:31:0x00b5, B:33:0x00bd, B:36:0x00c5, B:37:0x00c7, B:39:0x00d2, B:41:0x00f2, B:43:0x0104, B:49:0x0118, B:65:0x015e, B:67:0x0167, B:69:0x016d, B:73:0x0176, B:75:0x0186, B:77:0x0195, B:79:0x0199, B:46:0x010e), top: B:196:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long k(int r34, int r35, java.util.ArrayList r36, java.util.ArrayList r37, final defpackage.ctz r38, final java.util.ArrayList r39, java.util.Set r40, java.util.Set r41, final defpackage.cmsk r42, java.util.ArrayList r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1098
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cnsx.k(int, int, java.util.ArrayList, java.util.ArrayList, ctz, java.util.ArrayList, java.util.Set, java.util.Set, cmsk, java.util.ArrayList):long");
    }

    public cnsx(Context context, aipo aipoVar, ains ainsVar, cnsz cnszVar, cmqj cmqjVar, fcsu fcsuVar, apub apubVar, Set set) {
        this.j = context;
        this.k = aipoVar;
        this.m = ainsVar;
        this.l = cnszVar;
        this.n = apubVar;
        this.s = fcsuVar;
        this.o = cmqjVar;
        int size = set.size();
        cczi ccziVar = b;
        int iIntValue = ((Integer) ccziVar.e()).intValue();
        int size2 = set.size();
        Object objE = ccziVar.e();
        if (size <= iIntValue) {
            String[] strArr = MessagesTable.a;
            brec brecVar = new brec();
            brecVar.ab(set);
            this.r = new brdv(brecVar).a(dqxp.b());
            brec brecVar2 = new brec();
            brecVar2.ab(set);
            this.d = new brdv(brecVar2).a(dqxp.b());
            this.e = String.format("%s AND %s", s(cmqjVar), q(set, "sms"));
            this.f = String.format("%s AND %s", r(cmqjVar), q(set, "mms"));
            return;
        }
        throw new ejyc(ejxq.a("Spot sync size exceeds limit: [%s] > [%s]", Integer.valueOf(size2), objE));
    }
}
