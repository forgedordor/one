package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.util.Pair;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.Map;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqru {
    public static Context b;
    public static dqrb c;
    private static String f;
    static final Object a = new Object();
    public static final SettableFuture d = SettableFuture.create();
    private static final Object e = new Object();
    private static final AtomicReference g = new AtomicReference(false);
    private static final Pattern h = Pattern.compile("^SCAN TABLE ([a-zA-Z0-9_]+)$");
    private static final Pattern i = Pattern.compile("^SCAN TABLE ([a-zA-Z0-9_]+).*");
    private static final Pattern j = Pattern.compile("^USE TEMP B-TREE .*");

    /* compiled from: PG */
    public interface a {
        dqrc dC();

        Map fG();

        Map fJ();

        axgj iw();

        void jd();
    }

    public static int[] A(long[] jArr, int[] iArr) {
        HashSet hashSet = new HashSet();
        int[] iArr2 = new int[iArr.length];
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            long j2 = jArr == null ? 0L : jArr[i3];
            if (jArr == null || (j2 != 0 && !hashSet.contains(Long.valueOf(j2)))) {
                hashSet.add(Long.valueOf(j2));
                iArr2[i2] = iArr[i3];
                i2++;
            }
        }
        return Arrays.copyOf(iArr2, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] B(final dqsy dqsyVar, int i2, final boolean z, final BiConsumer biConsumer, final dqpd... dqpdVarArr) {
        if (dqpdVarArr.length == 0) {
            return new long[0];
        }
        Object[] objArr = dqpdVarArr[0];
        if (!(objArr instanceof dqpf)) {
            throw new IllegalArgumentException("not insertable");
        }
        final dqpf dqpfVar = (dqpf) objArr;
        final String strH = dqpfVar.h();
        String strJ = j(i2);
        String strConcat = strJ == null ? "" : strJ.concat(" ");
        final String str = "INSERT " + strConcat + dqpfVar.f();
        return (long[]) dqsyVar.q(new dqsb("bulkInsertImpl-", strH), new ejxr() { // from class: dqrk
            /* JADX WARN: Code restructure failed: missing block: B:105:0x0210, code lost:
            
                throw new java.lang.IllegalStateException("table " + r5 + " does not have an integer primary key autoincrement");
             */
            /* JADX WARN: Code restructure failed: missing block: B:106:0x0211, code lost:
            
                r5 = 0;
                r3 = null;
             */
            /* JADX WARN: Code restructure failed: missing block: B:107:0x0214, code lost:
            
                if (r12 <= 0) goto L109;
             */
            /* JADX WARN: Code restructure failed: missing block: B:108:0x0216, code lost:
            
                r9 = 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:109:0x0219, code lost:
            
                r9 = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:110:0x021a, code lost:
            
                r0.a(r9);
             */
            /* JADX WARN: Code restructure failed: missing block: B:111:0x021d, code lost:
            
                return r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x0177, code lost:
            
                r17 = 0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x017d, code lost:
            
                if (r3 == false) goto L106;
             */
            /* JADX WARN: Code restructure failed: missing block: B:75:0x017f, code lost:
            
                r1 = r8.g();
             */
            /* JADX WARN: Code restructure failed: missing block: B:76:0x0183, code lost:
            
                if (r1 == null) goto L104;
             */
            /* JADX WARN: Code restructure failed: missing block: B:77:0x0185, code lost:
            
                r3 = new long[r14];
                r1 = r4.e(java.lang.String.format(java.util.Locale.US, "/*EXEMPT-FROM-QUERY-PLAN-CHECK*\/SELECT %s FROM %s ORDER BY %s DESC LIMIT %d", r1, r5, r1, java.lang.Integer.valueOf(r14)), null);
             */
            /* JADX WARN: Code restructure failed: missing block: B:78:0x01a5, code lost:
            
                r4 = r1.getCount() - 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x01af, code lost:
            
                if (r1.moveToNext() == false) goto L150;
             */
            /* JADX WARN: Code restructure failed: missing block: B:81:0x01b1, code lost:
            
                r5 = r17;
                r3[r4] = r1.getLong(r5);
             */
            /* JADX WARN: Code restructure failed: missing block: B:82:0x01b9, code lost:
            
                r4 = r4 - 1;
                r17 = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:83:0x01be, code lost:
            
                r5 = r17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x01c0, code lost:
            
                if (r1 == null) goto L86;
             */
            /* JADX WARN: Code restructure failed: missing block: B:85:0x01c2, code lost:
            
                r1.close();
             */
            /* JADX WARN: Code restructure failed: missing block: B:87:0x01cb, code lost:
            
                if (defpackage.dqru.c.u() == false) goto L107;
             */
            /* JADX WARN: Code restructure failed: missing block: B:89:0x01ce, code lost:
            
                if (r14 != r2.length) goto L91;
             */
            /* JADX WARN: Code restructure failed: missing block: B:90:0x01d0, code lost:
            
                r1 = 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:91:0x01d3, code lost:
            
                r1 = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:92:0x01d4, code lost:
            
                defpackage.ejwl.l(r1);
                r1 = r5;
             */
            /* JADX WARN: Code restructure failed: missing block: B:93:0x01d8, code lost:
            
                if (r1 >= r14) goto L151;
             */
            /* JADX WARN: Code restructure failed: missing block: B:94:0x01da, code lost:
            
                r6.accept(r2[r1], java.lang.Long.valueOf(r3[r1]));
             */
            /* JADX WARN: Code restructure failed: missing block: B:95:0x01e5, code lost:
            
                r1 = r1 + 1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:96:0x01e8, code lost:
            
                r0 = move-exception;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:124:0x016f A[SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00bc A[Catch: all -> 0x021e, TryCatch #2 {all -> 0x021e, blocks: (B:16:0x0053, B:18:0x0056, B:19:0x0068, B:24:0x0070, B:26:0x008f, B:29:0x0098, B:30:0x00a1, B:31:0x00a4, B:33:0x00aa, B:35:0x00b6, B:37:0x00bc, B:38:0x00d7, B:40:0x00dd, B:42:0x00e7, B:43:0x00ed, B:45:0x00f1, B:46:0x00f7, B:48:0x00fb, B:50:0x00ff, B:52:0x0103, B:56:0x010a, B:57:0x010e, B:59:0x0112, B:62:0x0117, B:63:0x012e, B:64:0x012f, B:65:0x0139, B:66:0x0143, B:69:0x0150, B:70:0x016e, B:71:0x016f, B:72:0x0176, B:75:0x017f, B:77:0x0185, B:85:0x01c2, B:86:0x01c5, B:88:0x01cd, B:92:0x01d4, B:94:0x01da, B:110:0x021a, B:103:0x01f4, B:102:0x01f1, B:104:0x01f5, B:105:0x0210, B:99:0x01ec, B:78:0x01a5, B:79:0x01ab, B:81:0x01b1), top: B:122:0x0053, inners: #0, #1 }] */
            @Override // defpackage.ejxr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() {
                /*
                    Method dump skipped, instructions count: 580
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dqrk.get():java.lang.Object");
            }
        }, dqsx.c().a());
    }

    public static long[] C(long[] jArr, long[] jArr2) {
        HashSet hashSet = new HashSet();
        long[] jArr3 = new long[jArr2.length];
        int i2 = 0;
        for (int i3 = 0; i3 < jArr2.length; i3++) {
            long j2 = jArr == null ? 0L : jArr[i3];
            if (jArr == null || (j2 != 0 && !hashSet.contains(Long.valueOf(j2)))) {
                hashSet.add(Long.valueOf(j2));
                jArr3[i2] = jArr2[i3];
                i2++;
            }
        }
        return Arrays.copyOf(jArr3, i2);
    }

    public static Object[] D(long[] jArr, Object[] objArr, Object[] objArr2) {
        if (jArr == null) {
            return objArr;
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < objArr.length; i2++) {
            long j2 = jArr[i2];
            if (j2 != 0) {
                Long lValueOf = Long.valueOf(j2);
                if (!hashSet.contains(lValueOf)) {
                    hashSet.add(lValueOf);
                    arrayList.add(objArr[i2]);
                }
            }
        }
        return arrayList.toArray(objArr2);
    }

    public static boolean[] E(long[] jArr, boolean[] zArr) {
        HashSet hashSet = new HashSet();
        boolean[] zArr2 = new boolean[zArr.length];
        int i2 = 0;
        for (int i3 = 0; i3 < zArr.length; i3++) {
            long j2 = jArr == null ? 0L : jArr[i3];
            if (jArr == null || (j2 != 0 && !hashSet.contains(Long.valueOf(j2)))) {
                hashSet.add(Long.valueOf(j2));
                zArr2[i2] = zArr[i3];
                i2++;
            }
        }
        return Arrays.copyOf(zArr2, i2);
    }

    public static byte[][] F(long[] jArr, byte[][] bArr) {
        HashSet hashSet = new HashSet();
        byte[][] bArr2 = new byte[bArr.length][];
        int i2 = 0;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            long j2 = jArr == null ? 0L : jArr[i3];
            if (jArr == null || (j2 != 0 && !hashSet.contains(Long.valueOf(j2)))) {
                hashSet.add(Long.valueOf(j2));
                bArr2[i2] = bArr[i3];
                i2++;
            }
        }
        return (byte[][]) Arrays.copyOf(bArr2, i2);
    }

    public static axgj G() {
        return ((a) ehli.a(b, a.class)).iw();
    }

    public static double[] H(double[] dArr) {
        HashSet hashSet = new HashSet();
        double[] dArr2 = new double[dArr.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < dArr.length) {
            hashSet.add(-1L);
            dArr2[i3] = dArr[i2];
            i2++;
            i3++;
        }
        return Arrays.copyOf(dArr2, i3);
    }

    public static float[] I(float[] fArr) {
        HashSet hashSet = new HashSet();
        float[] fArr2 = new float[fArr.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < fArr.length) {
            hashSet.add(0L);
            fArr2[i3] = fArr[i2];
            i2++;
            i3++;
        }
        return Arrays.copyOf(fArr2, i3);
    }

    public static void J(dqsy dqsyVar, String str) {
        dqsyVar.v("DROP TABLE ".concat(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void K(defpackage.dqsy r19, java.lang.String r20, java.lang.String r21, java.lang.String[] r22, java.lang.String[] r23) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqru.K(dqsy, java.lang.String, java.lang.String, java.lang.String[], java.lang.String[]):void");
    }

    public static void L() {
        dqrb dqrbVar = c;
        a aVar = (a) ehli.a(b, a.class);
        if (((Boolean) ((dqoj) dqrbVar).k.get()).booleanValue()) {
            aVar.jd();
        } else {
            aVar.jd();
        }
    }

    public static int a(dqsy dqsyVar) {
        return ((dqom) dqsyVar.j()).g;
    }

    @Deprecated
    public static long b(dqsy dqsyVar, String str, dqpd dqpdVar, Function function, final Consumer consumer) {
        ContentValues contentValues = new ContentValues();
        dqpdVar.b(contentValues);
        dqtz dqtzVarH = dqua.a().h(dqsyVar, str, dqpdVar);
        Long l = (Long) function.apply(new dqon(contentValues, new Consumer() { // from class: dqre
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                Context context = dqru.b;
                consumer.z((Long) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                return Consumer$CC.$default$andThen(this, consumer2);
            }
        }));
        long jLongValue = l.longValue();
        consumer.z(l);
        dqtzVarH.a(jLongValue != -1);
        return jLongValue;
    }

    public static dqpd c(final dqwl dqwlVar) {
        ejxr ejxrVar = new ejxr() { // from class: dqrd
            @Override // defpackage.ejxr
            public final Object get() {
                dqpd dqpdVarCS;
                Context context = dqru.b;
                dqwl dqwlVar2 = dqwlVar;
                dqqj dqqjVarP = dqwlVar2.p();
                try {
                    int count = dqqjVarP.getCount();
                    if (count == 0) {
                        dqpdVarCS = null;
                    } else {
                        if (count != 1) {
                            throw new IllegalStateException("queried for more than 1 row on unique column: " + dqqjVarP.getCount() + " rows; " + dqwlVar2.G(dqxp.b()));
                        }
                        dqpdVarCS = dqqjVarP.cS();
                    }
                    dqqjVarP.close();
                    return dqpdVarCS;
                } catch (Throwable th) {
                    try {
                        dqqjVarP.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        };
        L();
        dqwlVar.J();
        return (dqpd) dqyt.a(ejxrVar);
    }

    public static dqse d(SQLiteDatabase sQLiteDatabase, String str, String[] strArr, Set set) {
        String strReplace = str.replace(" IN ()", " IN ('x', 'y', 'z')");
        dqse dqseVar = new dqse();
        boolean zContains = strReplace.contains(" LIMIT ");
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("EXPLAIN QUERY PLAN ".concat(String.valueOf(strReplace)), strArr);
        try {
            int columnIndex = cursorRawQuery.getColumnIndex("detail");
            StringBuilder sb = new StringBuilder();
            String strGroup = null;
            boolean z = false;
            boolean z2 = true;
            while (cursorRawQuery.moveToNext()) {
                String string = cursorRawQuery.getString(columnIndex);
                sb.append(string);
                if (z2 && zContains) {
                    Matcher matcher = i.matcher(string);
                    if (matcher.matches() && !set.contains(matcher.group(1))) {
                        z = true;
                    }
                    sb.append("\n");
                } else {
                    Matcher matcher2 = h.matcher(string);
                    if (matcher2.matches()) {
                        if (matcher2.groupCount() > 0) {
                            strGroup = matcher2.group(1);
                        }
                        sb.append(" <<<<<<<<<< QUERY PLAN WARNING");
                        if (set.contains(strGroup)) {
                            sb.append(" (exempted)");
                        } else {
                            dqseVar.b = true;
                        }
                    }
                    if (z && j.matcher(string).matches()) {
                        sb.append(" <<<<<<<<<< QUERY PLAN WARNING");
                        dqseVar.b = true;
                    }
                    sb.append("\n");
                }
                z2 = false;
            }
            dqseVar.a = sb.toString();
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            return dqseVar;
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                try {
                    cursorRawQuery.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static dqsy e(String str) {
        dqsy dqsyVar;
        ejwl.m(((dqoj) c).j, "not primary process");
        a aVar = (a) ehli.a(b, a.class);
        return (!y() || (dqsyVar = (dqsy) aVar.dC().a.get(str)) == null) ? (dqsy) aVar.fG().get(str) : dqsyVar;
    }

    static ekgb f(dqpo[] dqpoVarArr) {
        int i2 = ekgb.d;
        ekfw ekfwVar = new ekfw();
        for (dqpo dqpoVar : dqpoVarArr) {
            ekfwVar.h(dqpoVar.toString());
        }
        return ekfwVar.g();
    }

    public static Object g(dqsy dqsyVar, String str, final dqsh dqshVar, final dqsf dqsfVar, final dqsg dqsgVar) {
        Object obj = dqshVar.get();
        if (dqsfVar.apply(obj).booleanValue()) {
            G().a(str.concat("-slowpath"));
            return dqsyVar.p("optimisticUpdate", new ejxr() { // from class: dqrl
                @Override // defpackage.ejxr
                public final Object get() {
                    Context context = dqru.b;
                    dqsf dqsfVar2 = dqsfVar;
                    Object obj2 = dqshVar.get();
                    return dqsfVar2.apply(obj2).booleanValue() ? dqsgVar.apply(obj2) : obj2;
                }
            });
        }
        G().a(str.concat("-fastpath"));
        return obj;
    }

    public static String h(String str) {
        int iIndexOf = str.indexOf(" AS ");
        return iIndexOf >= 0 ? str.substring(iIndexOf + 4) : str;
    }

    public static String i(byte[] bArr) {
        if (bArr == null) {
            return "NULL";
        }
        StringBuilder sb = new StringBuilder("X'");
        StringBuilder sb2 = new StringBuilder();
        for (byte b2 : bArr) {
            sb2.append(String.format("%02X", Byte.valueOf(b2)));
        }
        sb.append((CharSequence) sb2);
        sb.append("'");
        return sb.toString();
    }

    public static String j(int i2) {
        if (i2 == 1) {
            return "OR ROLLBACK";
        }
        if (i2 == 2) {
            return "OR ABORT";
        }
        if (i2 == 3) {
            return "OR FAIL";
        }
        if (i2 == 4) {
            return "OR IGNORE";
        }
        if (i2 != 5) {
            return null;
        }
        return "OR REPLACE";
    }

    public static String k(ContentValues contentValues, Map map, dqxp dqxpVar) {
        StringBuilder sb = new StringBuilder();
        for (String str : contentValues.keySet()) {
            Object obj = contentValues.get(str);
            String strValueOf = obj == null ? "null" : obj instanceof Boolean ? String.valueOf(((Boolean) obj).booleanValue() ? 1 : 0) : obj instanceof Number ? obj.toString() : obj instanceof byte[] ? i((byte[]) obj) : DatabaseUtils.sqlEscapeString(obj.toString());
            sb.append(str);
            sb.append("=");
            sb.append(strValueOf);
            sb.append(",");
        }
        if (map != null) {
            for (String str2 : map.keySet()) {
                sb.append(str2);
                sb.append("=");
                sb.append(((dqxe) map.get(str2)).ai(dqxpVar));
                sb.append(",");
            }
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public static String l(SQLiteDatabase sQLiteDatabase) {
        String str;
        synchronized (e) {
            if (f == null) {
                if (sQLiteDatabase != null) {
                    try {
                        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT sqlite_version()", null);
                        try {
                            cursorRawQuery.moveToFirst();
                            f = cursorRawQuery.getString(0);
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                        } finally {
                        }
                    } catch (Throwable th) {
                        f = defpackage.a.J(th, "error: ");
                    }
                } else {
                    f = "not open";
                }
            }
            str = f;
        }
        return str;
    }

    public static String m(String[] strArr) {
        return new ejwc(",").f(strArr);
    }

    public static String n(String str) {
        if (!str.contains("group_concat") || str.contains(" AS ")) {
            return str;
        }
        int iAbs = Math.abs(str.hashCode());
        if (iAbs < 0) {
            iAbs = 0;
        }
        return str + " AS gen_as_" + iAbs;
    }

    public static String o(String str) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split("\\.", 2);
        if (strArrSplit.length == 2) {
            return strArrSplit[1];
        }
        throw new IllegalArgumentException("malformed qualified column:".concat(str));
    }

    public static List p(Object obj, Class cls) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < Array.getLength(obj); i2++) {
            arrayList.add(cls.cast(Array.get(obj, i2)));
        }
        return arrayList;
    }

    public static void q(int i2, int i3, ejxr ejxrVar) {
        if (((Boolean) ((dqoj) c).c.get()).booleanValue() && i3 != i2) {
            throw new IllegalStateException(String.format("unexpected array size %s; expected %s; raw column value: %s", Integer.valueOf(i3), Integer.valueOf(i2), ejxrVar.get()));
        }
    }

    public static void r(dqsy dqsyVar, String str) {
        Cursor cursorQuery = dqsyVar.h().query("sqlite_master", new String[]{"sql"}, "type = 'table' AND name = ?", new String[]{str}, null, null, null);
        try {
            int count = cursorQuery.getCount();
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (count != 0) {
                dqsyVar.v("DELETE FROM ".concat(str));
            }
            L();
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            try {
                cursorQuery.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public static void s(dqsy dqsyVar, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        eieu eieuVarK = eiiy.k("DatabaseWrapperImpl.deferredRunnables");
        try {
            EnumMap enumMap = new EnumMap(dqss.class);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                dqsv dqsvVar = (dqsv) it.next();
                ((List) Map.EL.computeIfAbsent(enumMap, dqsvVar.a, new Function() { // from class: dqri
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        Context context = dqru.b;
                        return new ArrayList();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                })).add(dqsvVar);
            }
            ArrayList<Pair> arrayList = new ArrayList();
            for (dqss dqssVar : dqss.values()) {
                if (enumMap.containsKey(dqssVar)) {
                    arrayList.add(Pair.create(dqssVar, (List) enumMap.get(dqssVar)));
                }
            }
            for (final Pair pair : arrayList) {
                Runnable runnable = new Runnable() { // from class: dqrj
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context = dqru.b;
                        Iterator it2 = ((List) pair.second).iterator();
                        while (it2.hasNext()) {
                            ((dqsv) it2.next()).b();
                        }
                    }
                };
                if (pair.first == dqss.NO_TXN || pair.first == dqss.NO_TXN_EXCLUDING_SCOPE) {
                    eieu eieuVarK2 = eiiy.k("DatabaseWrapperImpl::run-after-complete-no-txn");
                    try {
                        runnable.run();
                        eieuVarK2.close();
                    } catch (Throwable th) {
                        try {
                            eieuVarK2.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    dqsyVar.w("run-after-complete-in-txn", runnable);
                }
            }
            eieuVarK.close();
        } catch (Throwable th3) {
            try {
                eieuVarK.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static void t(boolean z) {
        g.set(Boolean.valueOf(z));
    }

    public static void u(ContentValues contentValues, String str, long j2) {
        if (j2 != 0) {
            contentValues.put(str, Long.valueOf(j2));
        } else {
            contentValues.putNull(str);
        }
    }

    public static void v(ContentValues contentValues, String str, String str2) {
        if (str2 == null) {
            contentValues.putNull(str);
        } else {
            contentValues.put(str, str2);
        }
    }

    public static void w(dqsy dqsyVar, String str, String str2) {
        dqsyVar.v("DROP INDEX IF EXISTS ".concat(str));
        dqsyVar.v(str2);
    }

    public static void x(String str, int i2) {
        throw new IllegalStateException(String.format(Locale.US, defpackage.a.a(str, "column ", " is not available in schema version %d"), Integer.valueOf(i2)));
    }

    static boolean y() {
        return ((Boolean) g.get()).booleanValue() || ((Boolean) ((dqoj) c).f.get()).booleanValue();
    }

    public static byte[] z(String str) {
        if (str == null || str.equals("NULL")) {
            return null;
        }
        if (!str.startsWith("X'") || !str.endsWith("'")) {
            throw new IllegalArgumentException("invalid blob");
        }
        String strSubstring = str.substring(2, str.length() - 1);
        int length = strSubstring.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("invalid blob");
        }
        int i2 = length / 2;
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = i3 + i3;
            bArr[i3] = (byte) Integer.parseInt(strSubstring.substring(i4, i4 + 2), 16);
        }
        return bArr;
    }
}
