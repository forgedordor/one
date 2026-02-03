package defpackage;

import android.content.Context;
import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzzh {
    public static final /* synthetic */ int e = 0;
    private static volatile dzzg f = null;
    private static volatile boolean g = false;
    final dzzf b;
    final String c;
    public volatile int d = -1;
    private Object k;
    private volatile Object l;
    private final boolean m;
    private volatile boolean n;
    private static final Object a = new Object();
    private static final AtomicReference h = new AtomicReference();
    private static final eaag i = new eaag();
    private static final AtomicInteger j = new AtomicInteger();

    public dzzh(dzzf dzzfVar, String str, Object obj, boolean z) {
        String str2 = dzzfVar.a;
        if (str2 == null && dzzfVar.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str2 != null && dzzfVar.b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.b = dzzfVar;
        this.c = str;
        this.k = obj;
        this.m = z;
        this.n = false;
    }

    public static void e() {
        j.incrementAndGet();
    }

    public static void f(final Context context) {
        if (f != null || context == null) {
            return;
        }
        Object obj = a;
        synchronized (obj) {
            if (f == null) {
                synchronized (obj) {
                    dzzg dzzgVar = f;
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (dzzgVar == null || ((dzxo) dzzgVar).a != context) {
                        if (dzzgVar != null) {
                            dzxr.b();
                            dzzm.b();
                            dzxz.c();
                        }
                        f = new dzxo(context, ejxx.a(new ejxr() { // from class: dzyu
                            @Override // defpackage.ejxr
                            public final Object get() {
                                int i2 = dzzh.e;
                                return dzya.a(context);
                            }
                        }));
                        e();
                    }
                }
            }
        }
    }

    private final String h(String str) {
        return str.isEmpty() ? this.c : str.concat(String.valueOf(this.c));
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:134:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0051 A[PHI: r3
      0x0051: PHI (r3v1 ejwi) = (r3v0 ejwi), (r3v0 ejwi), (r3v4 ejwi) binds: [B:11:0x0027, B:13:0x002e, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063 A[Catch: all -> 0x0266, TryCatch #6 {, blocks: (B:8:0x001e, B:10:0x0022, B:12:0x0029, B:14:0x0030, B:16:0x003c, B:22:0x0058, B:24:0x0063, B:26:0x007a, B:89:0x01be, B:91:0x01c8, B:94:0x01d0, B:96:0x01d6, B:97:0x01dc, B:117:0x0225, B:122:0x0235, B:124:0x023b, B:120:0x022d, B:128:0x0242, B:130:0x0245, B:132:0x024b, B:135:0x0253, B:136:0x0258, B:137:0x025c, B:27:0x008b, B:29:0x0093, B:56:0x010f, B:58:0x0115, B:59:0x0135, B:30:0x00a0, B:31:0x00a2, B:54:0x0101, B:63:0x0148, B:64:0x0149, B:71:0x016a, B:141:0x0263, B:67:0x0160, B:142:0x0264, B:98:0x01dd, B:100:0x01e1, B:102:0x01e9, B:104:0x01f4, B:103:0x01ef, B:105:0x01f6, B:107:0x01fa, B:109:0x01fe, B:111:0x0202, B:114:0x0218, B:115:0x021f, B:116:0x0224, B:72:0x016b, B:74:0x0175, B:78:0x0193, B:82:0x019e, B:84:0x01b6, B:85:0x01b9, B:87:0x01bb, B:75:0x017b, B:77:0x0183, B:80:0x0197, B:32:0x00a3, B:34:0x00ab, B:35:0x00b7, B:37:0x00b9, B:39:0x00c5, B:43:0x00d5, B:45:0x00db, B:52:0x00f6, B:53:0x0100, B:47:0x00e5, B:48:0x00e9, B:49:0x00ef), top: B:159:0x001e, inners: #0, #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5 A[Catch: all -> 0x0146, TRY_LEAVE, TryCatch #4 {, blocks: (B:32:0x00a3, B:34:0x00ab, B:35:0x00b7, B:37:0x00b9, B:39:0x00c5, B:43:0x00d5, B:45:0x00db, B:52:0x00f6, B:53:0x0100, B:47:0x00e5, B:48:0x00e9, B:49:0x00ef), top: B:156:0x00a3, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0149 A[Catch: all -> 0x0266, TryCatch #6 {, blocks: (B:8:0x001e, B:10:0x0022, B:12:0x0029, B:14:0x0030, B:16:0x003c, B:22:0x0058, B:24:0x0063, B:26:0x007a, B:89:0x01be, B:91:0x01c8, B:94:0x01d0, B:96:0x01d6, B:97:0x01dc, B:117:0x0225, B:122:0x0235, B:124:0x023b, B:120:0x022d, B:128:0x0242, B:130:0x0245, B:132:0x024b, B:135:0x0253, B:136:0x0258, B:137:0x025c, B:27:0x008b, B:29:0x0093, B:56:0x010f, B:58:0x0115, B:59:0x0135, B:30:0x00a0, B:31:0x00a2, B:54:0x0101, B:63:0x0148, B:64:0x0149, B:71:0x016a, B:141:0x0263, B:67:0x0160, B:142:0x0264, B:98:0x01dd, B:100:0x01e1, B:102:0x01e9, B:104:0x01f4, B:103:0x01ef, B:105:0x01f6, B:107:0x01fa, B:109:0x01fe, B:111:0x0202, B:114:0x0218, B:115:0x021f, B:116:0x0224, B:72:0x016b, B:74:0x0175, B:78:0x0193, B:82:0x019e, B:84:0x01b6, B:85:0x01b9, B:87:0x01bb, B:75:0x017b, B:77:0x0183, B:80:0x0197, B:32:0x00a3, B:34:0x00ab, B:35:0x00b7, B:37:0x00b9, B:39:0x00c5, B:43:0x00d5, B:45:0x00db, B:52:0x00f6, B:53:0x0100, B:47:0x00e5, B:48:0x00e9, B:49:0x00ef), top: B:159:0x001e, inners: #0, #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01be A[Catch: all -> 0x0266, TRY_ENTER, TryCatch #6 {, blocks: (B:8:0x001e, B:10:0x0022, B:12:0x0029, B:14:0x0030, B:16:0x003c, B:22:0x0058, B:24:0x0063, B:26:0x007a, B:89:0x01be, B:91:0x01c8, B:94:0x01d0, B:96:0x01d6, B:97:0x01dc, B:117:0x0225, B:122:0x0235, B:124:0x023b, B:120:0x022d, B:128:0x0242, B:130:0x0245, B:132:0x024b, B:135:0x0253, B:136:0x0258, B:137:0x025c, B:27:0x008b, B:29:0x0093, B:56:0x010f, B:58:0x0115, B:59:0x0135, B:30:0x00a0, B:31:0x00a2, B:54:0x0101, B:63:0x0148, B:64:0x0149, B:71:0x016a, B:141:0x0263, B:67:0x0160, B:142:0x0264, B:98:0x01dd, B:100:0x01e1, B:102:0x01e9, B:104:0x01f4, B:103:0x01ef, B:105:0x01f6, B:107:0x01fa, B:109:0x01fe, B:111:0x0202, B:114:0x0218, B:115:0x021f, B:116:0x0224, B:72:0x016b, B:74:0x0175, B:78:0x0193, B:82:0x019e, B:84:0x01b6, B:85:0x01b9, B:87:0x01bb, B:75:0x017b, B:77:0x0183, B:80:0x0197, B:32:0x00a3, B:34:0x00ab, B:35:0x00b7, B:37:0x00b9, B:39:0x00c5, B:43:0x00d5, B:45:0x00db, B:52:0x00f6, B:53:0x0100, B:47:0x00e5, B:48:0x00e9, B:49:0x00ef), top: B:159:0x001e, inners: #0, #1, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d0 A[Catch: all -> 0x0266, TryCatch #6 {, blocks: (B:8:0x001e, B:10:0x0022, B:12:0x0029, B:14:0x0030, B:16:0x003c, B:22:0x0058, B:24:0x0063, B:26:0x007a, B:89:0x01be, B:91:0x01c8, B:94:0x01d0, B:96:0x01d6, B:97:0x01dc, B:117:0x0225, B:122:0x0235, B:124:0x023b, B:120:0x022d, B:128:0x0242, B:130:0x0245, B:132:0x024b, B:135:0x0253, B:136:0x0258, B:137:0x025c, B:27:0x008b, B:29:0x0093, B:56:0x010f, B:58:0x0115, B:59:0x0135, B:30:0x00a0, B:31:0x00a2, B:54:0x0101, B:63:0x0148, B:64:0x0149, B:71:0x016a, B:141:0x0263, B:67:0x0160, B:142:0x0264, B:98:0x01dd, B:100:0x01e1, B:102:0x01e9, B:104:0x01f4, B:103:0x01ef, B:105:0x01f6, B:107:0x01fa, B:109:0x01fe, B:111:0x0202, B:114:0x0218, B:115:0x021f, B:116:0x0224, B:72:0x016b, B:74:0x0175, B:78:0x0193, B:82:0x019e, B:84:0x01b6, B:85:0x01b9, B:87:0x01bb, B:75:0x017b, B:77:0x0183, B:80:0x0197, B:32:0x00a3, B:34:0x00ab, B:35:0x00b7, B:37:0x00b9, B:39:0x00c5, B:43:0x00d5, B:45:0x00db, B:52:0x00f6, B:53:0x0100, B:47:0x00e5, B:48:0x00e9, B:49:0x00ef), top: B:159:0x001e, inners: #0, #1, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzzh.b():java.lang.Object");
    }

    public final Object c() {
        if (this.n) {
            synchronized (this) {
                if (this.n) {
                    Object objA = a(this.k);
                    objA.getClass();
                    this.k = objA;
                    this.n = false;
                }
            }
        }
        return this.k;
    }

    public final String d() {
        return h(this.b.d);
    }

    public final void g(Object obj) {
        this.l = obj;
        this.d = Alert.DURATION_SHOW_INDEFINITELY;
        AtomicReference atomicReference = h;
        if (atomicReference.get() == null) {
            ArrayList arrayList = new ArrayList();
            while (!atomicReference.compareAndSet(null, arrayList) && atomicReference.get() == null) {
            }
        }
        Collection collection = (Collection) atomicReference.get();
        collection.getClass();
        collection.add(this);
    }

    public dzzh(dzzf dzzfVar, String str, String str2) {
        String str3 = dzzfVar.a;
        if (str3 == null && dzzfVar.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        if (str3 != null && dzzfVar.b != null) {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
        this.b = dzzfVar;
        this.c = str;
        this.k = str2;
        this.m = true;
        this.n = true;
    }
}
