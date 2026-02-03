package defpackage;

import android.database.Cursor;
import android.database.CursorWrapper;
import android.os.CancellationSignal;
import android.util.Log;
import defpackage.dqpd;
import defpackage.dqpo;
import defpackage.dqqj;
import defpackage.dqwl;
import defpackage.dqws;
import j$.util.Map;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqqf<C extends dqqj<C, Q, B, D, CR>, Q extends dqwl<C, Q, B, D, CR>, B extends dqws<C, Q, B, D, CR>, D extends dqpd<C, Q, B, D, CR>, CR extends dqpo<CR>> extends CursorWrapper {
    static final ejxk a = ejxk.b('|');
    public static final /* synthetic */ int j = 0;
    private static final ekgb k;
    private static final int[] l;
    private static final long[] m;
    private static final boolean[] n;
    private static final float[] o;
    private static final double[] p;
    private static final byte[][] q;
    private static final long[] r;
    public final dqwl b;
    public final dqsy c;
    protected final dqtm d;
    protected Map e;
    public String[] f;
    public dqxe[] g;
    public final Map h;
    protected final int[] i;
    private final AtomicLong s;
    private final AtomicInteger t;

    static {
        int i = ekgb.d;
        k = ekoe.a;
        l = new int[0];
        m = new long[0];
        n = new boolean[0];
        o = new float[0];
        p = new double[0];
        q = new byte[0][];
        r = new long[]{-1};
    }

    public dqqf(dqsy dqsyVar, Cursor cursor, String[] strArr, dqxe[] dqxeVarArr, String[] strArr2, dqwj dqwjVar, dqtm dqtmVar, dqwl dqwlVar) {
        super(cursor);
        this.s = new AtomicLong(Thread.currentThread().getId());
        this.h = new HashMap();
        this.t = new AtomicInteger();
        if (cursor instanceof dqqf) {
            ((dqqf) cursor).di();
        }
        di();
        this.b = dqwlVar;
        int i = 0;
        boolean z = dqwlVar == null ? false : ((dqoy) dqwlVar.e).y;
        if (this.e == null) {
            this.e = new HashMap();
            int length = strArr2.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                this.e.put(dqwjVar.apply(strArr2[i2]), Integer.valueOf(i3));
                i2++;
                i3++;
            }
        }
        this.c = dqsyVar;
        this.f = strArr;
        this.g = dqxeVarArr;
        this.i = new int[strArr2.length];
        this.d = dqtmVar;
        HashMap map = new HashMap();
        for (Map.Entry entry : this.e.entrySet()) {
            map.put(z ? dqru.h((String) entry.getKey()) : (String) entry.getKey(), (Integer) entry.getValue());
        }
        Arrays.fill(this.i, -1);
        if (z) {
            while (i < strArr.length) {
                int iIntValue = ((Integer) Map.EL.getOrDefault(map, dqru.h(strArr[i]), -1)).intValue();
                if (iIntValue >= 0) {
                    this.i[iIntValue] = i;
                }
                i++;
            }
            return;
        }
        while (i < strArr.length) {
            String str = strArr[i];
            if (map.containsKey(str)) {
                this.i[((Integer) map.get(str)).intValue()] = i;
            }
            i++;
        }
    }

    private final void a() {
        if (((Boolean) ((dqoj) dqru.c).d.get()).booleanValue() && this.t.get() > 0) {
            throw new ConcurrentModificationException("unable to set cursor position while binding");
        }
    }

    private final void c() {
        if (((Boolean) ((dqoj) dqru.c).b.get()).booleanValue() && this.s.get() != Thread.currentThread().getId()) {
            throw new IllegalStateException("multi-threaded access to cursor");
        }
    }

    protected static final void dA(int i, Object[] objArr, ejxr ejxrVar) {
        if (objArr != null) {
            dqru.q(i, objArr.length, ejxrVar);
        }
    }

    protected static final void dB(int i, boolean[] zArr, ejxr ejxrVar) {
        if (zArr != null) {
            dqru.q(i, zArr.length, ejxrVar);
        }
    }

    protected static final long[] dC(String str) {
        return str == null ? r : dt(str);
    }

    public static final byte[][] dD(String str) {
        byte[] bArr;
        List<String> listDf = df(str);
        if (listDf.isEmpty()) {
            return q;
        }
        byte[][] bArr2 = new byte[listDf.size()][];
        int i = 0;
        for (String str2 : listDf) {
            int i2 = i + 1;
            if (!str2.equals("NULL")) {
                int length = str2.length();
                if (length >= 3 && str2.charAt(0) == 'X' && str2.charAt(1) == '\'' && str2.charAt(length - 1) == '\'') {
                    int i3 = length - 3;
                    if ((i3 & 1) == 0) {
                        int i4 = i3 >> 1;
                        byte[] bArr3 = new byte[i4];
                        for (int i5 = 0; i5 < i4; i5++) {
                            int i6 = i5 + i5;
                            bArr3[i5] = (byte) Short.parseShort(str2.substring(i6 + 2, i6 + 4), 16);
                        }
                        bArr = bArr3;
                    }
                }
                throw new IllegalArgumentException("invalid blob string: ".concat(String.valueOf(str2)));
            }
            bArr = null;
            bArr2[i] = bArr;
            i = i2;
        }
        return bArr2;
    }

    protected static final List df(String str) {
        return (str == null || str.length() == 0) ? k : a.i(str);
    }

    protected static final double[] dq(String str) throws NumberFormatException {
        List<String> listDf = df(str);
        if (listDf.isEmpty()) {
            return p;
        }
        double[] dArr = new double[listDf.size()];
        int i = 0;
        for (String str2 : listDf) {
            double d = 0.0d;
            if (str2 != null && !str2.equals("NULL")) {
                try {
                    d = Double.parseDouble(str2);
                } catch (NumberFormatException unused) {
                    d = Double.NaN;
                }
            }
            dArr[i] = d;
            i++;
        }
        return dArr;
    }

    protected static final float[] dr(String str) throws NumberFormatException {
        List<String> listDf = df(str);
        if (listDf.isEmpty()) {
            return o;
        }
        float[] fArr = new float[listDf.size()];
        int i = 0;
        for (String str2 : listDf) {
            float f = 0.0f;
            if (str2 != null && !str2.equals("NULL")) {
                try {
                    f = Float.parseFloat(str2);
                } catch (NumberFormatException unused) {
                    f = Float.NaN;
                }
            }
            fArr[i] = f;
            i++;
        }
        return fArr;
    }

    public static final int[] ds(String str) throws NumberFormatException {
        int i;
        List<String> listDf = df(str);
        if (listDf.isEmpty()) {
            return l;
        }
        int[] iArr = new int[listDf.size()];
        int i2 = 0;
        for (String str2 : listDf) {
            if (str2 == null || str2.equals("NULL")) {
                i = 0;
            } else {
                try {
                    i = Integer.parseInt(str2);
                } catch (NumberFormatException unused) {
                }
            }
            iArr[i2] = i;
            i2++;
        }
        return iArr;
    }

    public static final long[] dt(String str) throws NumberFormatException {
        List<String> listDf = df(str);
        if (listDf.isEmpty()) {
            return m;
        }
        long[] jArr = new long[listDf.size()];
        int i = 0;
        for (String str2 : listDf) {
            long j2 = 0;
            if (str2 != null && !str2.equals("NULL")) {
                try {
                    j2 = Long.parseLong(str2);
                } catch (NumberFormatException unused) {
                }
            }
            jArr[i] = j2;
            i++;
        }
        return jArr;
    }

    public static final String[] du(String str) {
        boolean z;
        char cCharAt;
        String[] strArr = dqww.a;
        if (str == null || str.length() == 0) {
            return dqww.a;
        }
        ArrayList arrayList = new ArrayList();
        try {
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            int length2 = -1;
            while (true) {
                boolean z2 = true;
                length2++;
                if (length2 >= length) {
                    return (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
                char cCharAt2 = str.charAt(length2);
                if (cCharAt2 == '\'') {
                    while (true) {
                        int i = length2 + 1;
                        if (i >= length) {
                            length2 = i;
                            break;
                        }
                        char cCharAt3 = str.charAt(i);
                        if (cCharAt3 == '\'') {
                            char cCharAt4 = i < length + (-1) ? str.charAt(length2 + 2) : (char) 0;
                            if (cCharAt4 == '\'') {
                                length2 += 2;
                                cCharAt3 = '\'';
                            } else {
                                if (cCharAt4 != '|' && cCharAt4 != 0) {
                                    Log.w("DatabaseAnnotationProcessor", "Failed to parse quoted string {REDACTED STRING } at position " + i + "; expected a divider character(|), end of string but found (" + cCharAt4 + ")");
                                    throw new IllegalArgumentException("malformed string; expected quote character");
                                }
                                dqww.a(arrayList, sb);
                                sb.setLength(0);
                                length2 += 2;
                            }
                        } else {
                            length2 = i;
                        }
                        sb.append(cCharAt3);
                    }
                } else {
                    ekqg ekqgVarListIterator = dqww.b.entrySet().listIterator();
                    while (true) {
                        if (!ekqgVarListIterator.hasNext()) {
                            z = false;
                            break;
                        }
                        Map.Entry entry = (Map.Entry) ekqgVarListIterator.next();
                        String str2 = (String) entry.getKey();
                        if (str.substring(length2, Math.min(str.length(), length2 + str2.length())).equals(str2)) {
                            String str3 = (String) entry.getValue();
                            if (true == str3.equals("@null")) {
                                str3 = null;
                            }
                            arrayList.add(str3);
                            length2 += str2.length();
                            z = true;
                        }
                    }
                    if (z || "-0123456789.".indexOf(cCharAt2) < 0) {
                        z2 = z;
                    } else {
                        sb.append(cCharAt2);
                        while (true) {
                            length2++;
                            if (length2 >= length || (cCharAt = str.charAt(length2)) == '|') {
                                break;
                            }
                            sb.append(cCharAt);
                        }
                        dqww.a(arrayList, sb);
                        sb.setLength(0);
                    }
                    if (!z2) {
                        Log.w("DatabaseAnnotationProcessor", "Failed to parse quoted string {REDACTED STRING } at position " + length2 + "; expected a quote char('), but found (" + cCharAt2 + ")");
                        throw new IllegalArgumentException("malformed string; expected quote character");
                    }
                }
            }
        } catch (IllegalArgumentException unused) {
            return dqww.a;
        }
    }

    public static final boolean[] dv(String str) {
        List<String> listDf = df(str);
        if (listDf.isEmpty()) {
            return n;
        }
        boolean[] zArr = new boolean[listDf.size()];
        int i = 0;
        for (String str2 : listDf) {
            zArr[i] = (str2 == null || str2.equals("NULL")) ? false : str2.equals("1");
            i++;
        }
        return zArr;
    }

    protected static final void dw(int i, double[] dArr, ejxr ejxrVar) {
        if (dArr != null) {
            dqru.q(i, dArr.length, ejxrVar);
        }
    }

    protected static final void dx(int i, float[] fArr, ejxr ejxrVar) {
        if (fArr != null) {
            dqru.q(i, fArr.length, ejxrVar);
        }
    }

    protected static final void dy(int i, int[] iArr, ejxr ejxrVar) {
        if (iArr != null) {
            dqru.q(i, iArr.length, ejxrVar);
        }
    }

    protected static final void dz(int i, long[] jArr, ejxr ejxrVar) {
        if (jArr != null) {
            dqru.q(i, jArr.length, ejxrVar);
        }
    }

    protected abstract dqpd b();

    public final int cO(int i, String[] strArr) {
        int i2 = this.i[i];
        if (i2 != -1) {
            return i2;
        }
        throw new IllegalArgumentException("column " + strArr[i] + " is not part of the projection.");
    }

    public final int cP() {
        return super.getCount();
    }

    public final dqpd cQ() {
        return cR(new dqpx(this));
    }

    public final dqpd cR(final Supplier supplier) {
        return (dqpd) dd(new Supplier() { // from class: dqqc
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.Supplier
            public final Object get() {
                dqpd dqpdVar = (dqpd) supplier.get();
                dqqf dqqfVar = this.a;
                dqpdVar.c((dqqj) dqqfVar);
                dqtm dqtmVar = dqqfVar.d;
                dqpdVar.cQ = dqtmVar.b;
                if (dqtmVar != null) {
                    dqqfVar.dg(dqtmVar.c(), dqpdVar);
                }
                return dqpdVar;
            }
        });
    }

    public final dqpd cS() {
        dqpx dqpxVar = new dqpx(this);
        if (moveToNext()) {
            return cR(dqpxVar);
        }
        return null;
    }

    public final dqpd cT() {
        try {
            if (getCount() <= 1) {
                dqpd dqpdVarCR = moveToFirst() ? cR(new dqpx(this)) : null;
                close();
                return dqpdVarCR;
            }
            throw new IllegalStateException("query found " + getCount() + " rows");
        } catch (Throwable th) {
            try {
                close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final dqpd cU() {
        try {
            boolean zMoveToFirst = moveToFirst();
            if (getCount() == 1 && zMoveToFirst) {
                dqpd dqpdVarCR = cR(new dqpx(this));
                close();
                return dqpdVarCR;
            }
            throw new IllegalStateException("query found " + getCount() + " rows");
        } catch (Throwable th) {
            try {
                close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final dqqe cV() {
        ArrayList arrayList = new ArrayList();
        int columnCount = getWrappedCursor().getColumnCount() - this.f.length;
        for (int i = 0; i < columnCount; i++) {
            int length = this.f.length + i;
            if (length >= getWrappedCursor().getColumnCount()) {
                throw new IllegalArgumentException("offset out of range");
            }
            arrayList.add(getWrappedCursor().getString(length));
        }
        HashMap map = new HashMap();
        dqxe[] dqxeVarArr = this.g;
        if (dqxeVarArr != null) {
            int i2 = 0;
            for (dqxe dqxeVar : dqxeVarArr) {
                if (dqxeVar instanceof dqof) {
                    map.put(((dqof) dqxeVar).a, Integer.valueOf(i2));
                    i2++;
                }
            }
        }
        return new dqqe(arrayList, map);
    }

    public final dqqj cW(String str) {
        return (dqqj) this.h.get(str);
    }

    public final ekgb cX() {
        return cZ(new dqpx(this));
    }

    public final ekgb cY(dqqd dqqdVar) {
        ekgb ekgbVarG;
        try {
            di();
            if (moveToFirst()) {
                int i = ekgb.d;
                ekfw ekfwVar = new ekfw();
                do {
                    ekfwVar.h(db(dqqdVar));
                } while (moveToNext());
                c();
                ekgbVarG = ekfwVar.g();
            } else {
                int i2 = ekgb.d;
                ekgbVarG = ekoe.a;
            }
            close();
            return ekgbVarG;
        } catch (Throwable th) {
            try {
                close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ekgb cZ(Supplier supplier) {
        ekgb ekgbVarG;
        CancellationSignal cancellationSignal;
        try {
            di();
            if (moveToFirst()) {
                int i = ekgb.d;
                ekfw ekfwVar = new ekfw();
                do {
                    ekfwVar.h(cR(supplier));
                    dqwl dqwlVar = this.b;
                    if (dqwlVar != null && (cancellationSignal = dqwlVar.r) != null && cancellationSignal.isCanceled()) {
                        throw new dqxu();
                    }
                } while (moveToNext());
                c();
                ekgbVarG = ekfwVar.g();
            } else {
                int i2 = ekgb.d;
                ekgbVarG = ekoe.a;
            }
            close();
            return ekgbVarG;
        } catch (Throwable th) {
            try {
                close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final Stream da() {
        final dqqd dqqdVar = new dqqd() { // from class: dqpw
            @Override // defpackage.dqqd
            public final Object a(Object obj) {
                int i = dqqf.j;
                return obj;
            }
        };
        di();
        Object objDc = dc(dqqdVar);
        if (objDc == null) {
            close();
            return Stream.CC.empty();
        }
        final boolean[] zArr = {false};
        return Stream.CC.iterate(objDc, new Predicate() { // from class: dqpy
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
                int i = dqqf.j;
                return obj != null;
            }
        }, new UnaryOperator() { // from class: dqpz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                boolean[] zArr2 = zArr;
                dqqf dqqfVar = this.a;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    dqqfVar.di();
                }
                Object objDc2 = dqqfVar.dc(dqqdVar);
                if (objDc2 == null) {
                    dqqfVar.close();
                }
                return objDc2;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).onClose(new Runnable() { // from class: dqqa
            @Override // java.lang.Runnable
            public final void run() {
                this.a.close();
            }
        });
    }

    public final Object db(final dqqd dqqdVar) {
        return dd(new Supplier() { // from class: dqqb
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.function.Supplier
            public final Object get() {
                dqqf dqqfVar = this.a;
                dqpd dqpdVarB = dqqfVar.b();
                dqpdVarB.c((dqqj) dqqfVar);
                dqtm dqtmVar = dqqfVar.d;
                dqpdVarB.cQ = dqtmVar.b;
                if (dqtmVar != null) {
                    dqqfVar.dg(dqtmVar.c(), dqpdVarB);
                }
                return dqqdVar.a(dqpdVarB);
            }
        });
    }

    public final Object dc(dqqd dqqdVar) {
        if (moveToNext()) {
            return db(dqqdVar);
        }
        return null;
    }

    public final Object dd(Supplier supplier) {
        try {
            this.t.incrementAndGet();
            return supplier.get();
        } finally {
            this.t.decrementAndGet();
        }
    }

    public final String de(String str) {
        dqxe[] dqxeVarArr = this.g;
        if (dqxeVarArr != null) {
            int i = 0;
            for (dqxe dqxeVar : dqxeVarArr) {
                if ((dqxeVar instanceof dqof) && ((dqof) dqxeVar).a.equals(str)) {
                    return getWrappedCursor().getString(this.f.length + i);
                }
                i++;
            }
        }
        throw new IllegalArgumentException("unknown as expression: ".concat(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    final void dg(ekgb ekgbVar, dqpd dqpdVar) {
        for (int i = 0; i < ((ekoe) ekgbVar).c; i++) {
            dqth dqthVar = (dqth) ekgbVar.get(i);
            String str = dqthVar.e;
            dqqf dqqfVar = (dqqf) ((dqqj) this).cW(str);
            ekgb ekgbVarFI = dqqfVar.fI(dqthVar);
            ekfw ekfwVar = new ekfw();
            ekfwVar.h(dqqfVar.b());
            ekfwVar.j(ekgbVarFI);
            dqpdVar.cO.put(str, ekfwVar.g());
            dqpdVar.cP.put(str, dqthVar);
            dg(dqthVar.a.m.c(), dqpdVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void dh(dqtm dqtmVar, ekgb ekgbVar, boolean z) {
        for (int i = 0; i < ((ekoe) ekgbVar).c; i++) {
            ((dqth) ekgbVar.get(i)).a(this.c, this, dqtmVar, z);
        }
    }

    public final void di() {
        this.s.set(Thread.currentThread().getId());
    }

    public final boolean dj(int i) {
        return this.i[i] != -1;
    }

    public final boolean dk(String str) {
        dqxe[] dqxeVarArr = this.g;
        if (dqxeVarArr != null) {
            for (dqxe dqxeVar : dqxeVarArr) {
                if ((dqxeVar instanceof dqof) && ((dqof) dqxeVar).a.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean dl() {
        a();
        return super.moveToFirst();
    }

    public final boolean dm() {
        a();
        return super.moveToLast();
    }

    public final boolean dn() {
        a();
        return super.moveToNext();
    }

    /* renamed from: do, reason: not valid java name */
    public final boolean m434do(int i) {
        a();
        return super.moveToPosition(i);
    }

    public final boolean dp() {
        a();
        return super.moveToPrevious();
    }

    public ekgb fI(dqth dqthVar) {
        throw new IllegalStateException("shouldn't get here");
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getCount() {
        dqsy dqsyVar = this.c;
        return dqsyVar == null ? super.getCount() : dqsyVar.c(this);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToFirst() {
        a();
        c();
        dqsy dqsyVar = this.c;
        return dqsyVar == null ? dl() : dqsyVar.G(this);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToLast() {
        a();
        c();
        dqsy dqsyVar = this.c;
        return dqsyVar == null ? dm() : dqsyVar.H(this);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToNext() {
        a();
        c();
        dqsy dqsyVar = this.c;
        return dqsyVar == null ? dn() : dqsyVar.I(this);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPosition(int i) {
        a();
        c();
        dqsy dqsyVar = this.c;
        return dqsyVar == null ? m434do(i) : dqsyVar.J(this, i);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPrevious() {
        a();
        c();
        dqsy dqsyVar = this.c;
        return dqsyVar == null ? dp() : dqsyVar.K(this);
    }
}
