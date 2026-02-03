package defpackage;

import android.os.Parcel;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drtv implements drtr {
    public static final /* synthetic */ int c = 0;
    private static final drtz[] d = drtz.values();
    public final String a;
    public final Class b;
    private volatile drtx e;
    private final Object[] f;
    private boolean[] g;
    private Map h;

    public drtv(String str, Class cls) {
        this.a = str;
        this.b = cls;
        this.f = (Object[]) Array.newInstance((Class<?>) cls, d.length);
    }

    private final synchronized drtx j() {
        int length = d.length;
        while (true) {
            length--;
            if (length < 0) {
                return null;
            }
            Object obj = this.f[length];
            if (obj != null && !m(length)) {
                return new drtx(obj, length);
            }
        }
    }

    private static Object k(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        return eldz.e.j((byte[]) obj);
    }

    private final void l() {
        if (drxl.a && this.e == null) {
            throw new IllegalStateException("Flag: " + this.a + " is invalid.");
        }
    }

    private final synchronized boolean m(int i) {
        boolean[] zArr = this.g;
        if (zArr != null) {
            if (zArr[i]) {
                return true;
            }
        }
        return false;
    }

    private static boolean n(int i) {
        return i == 3 || i == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0029, code lost:
    
        if (n(r1) != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void o() {
        /*
            r4 = this;
            monitor-enter(r4)
            drtx r0 = r4.e     // Catch: java.lang.Throwable -> L32
            drtx r1 = r4.j()     // Catch: java.lang.Throwable -> L32
            r4.e = r1     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L30
            if (r1 == 0) goto L30
            java.lang.Object r2 = r1.a     // Catch: java.lang.Throwable -> L32
            java.lang.Object r3 = r0.a     // Catch: java.lang.Throwable -> L32
            boolean r2 = j$.util.Objects.deepEquals(r3, r2)     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto L18
            goto L2b
        L18:
            int r0 = r0.b     // Catch: java.lang.Throwable -> L32
            int r1 = r1.b     // Catch: java.lang.Throwable -> L32
            if (r0 != r1) goto L1f
            goto L30
        L1f:
            boolean r0 = n(r0)     // Catch: java.lang.Throwable -> L32
            if (r0 != 0) goto L2b
            boolean r0 = n(r1)     // Catch: java.lang.Throwable -> L32
            if (r0 == 0) goto L30
        L2b:
            r4.e()     // Catch: java.lang.Throwable -> L32
            monitor-exit(r4)
            return
        L30:
            monitor-exit(r4)
            return
        L32:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L32
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drtv.o():void");
    }

    @Override // defpackage.drtr
    public final synchronized Object a(drtz drtzVar, boolean z) {
        if (!z) {
            return this.f[drtzVar.g];
        }
        if (m(drtzVar.g)) {
            return null;
        }
        return this.f[drtzVar.g];
    }

    @Override // defpackage.drtr
    public final Object b() {
        drtx drtxVar = this.e;
        if (drtxVar != null) {
            return drtxVar.a;
        }
        throw new IllegalStateException("Invalid flag: ".concat(toString()));
    }

    @Override // defpackage.drtr
    public final synchronized void c(drtq drtqVar) {
        f(drtqVar, drlv.b);
    }

    @Override // defpackage.drtr
    public final synchronized void d(drtq drtqVar) {
        l();
        Map map = this.h;
        if (map != null) {
            map.remove(drtqVar);
            if (this.h.isEmpty()) {
                this.h = null;
            }
        }
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ int describeContents() {
        return 0;
    }

    final synchronized void e() {
        Map map = this.h;
        if (map != null) {
            Set setEntrySet = map.entrySet();
            ekhy ekhyVar = new ekhy();
            Iterator it = setEntrySet.iterator();
            while (it.hasNext()) {
                ekhyVar.h((Map.Entry) it.next());
            }
            ekib ekibVarF = ekhyVar.a().f();
            ekqg ekqgVarListIterator = ekibVarF.x().listIterator();
            while (ekqgVarListIterator.hasNext()) {
                Executor executor = (Executor) ekqgVarListIterator.next();
                final ekhx ekhxVarC = ekibVarF.c(executor);
                executor.execute(new Runnable() { // from class: drtu
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i = drtv.c;
                        ekqg ekqgVarListIterator2 = ekhxVarC.listIterator();
                        while (ekqgVarListIterator2.hasNext()) {
                            ((drtq) ekqgVarListIterator2.next()).a();
                        }
                    }
                });
            }
        }
    }

    public final synchronized void f(drtq drtqVar, Executor executor) {
        l();
        if (this.h == null) {
            this.h = new WeakHashMap();
        }
        this.h.put(drtqVar, executor);
    }

    final synchronized void g(drtz drtzVar) {
        if (drtzVar == drtz.DEFAULT) {
            throw new IllegalStateException("Ignoring default value is disallowed [" + this.a + "].");
        }
        if (this.g == null) {
            this.g = new boolean[d.length];
        }
        boolean[] zArr = this.g;
        int i = drtzVar.g;
        zArr[i] = true;
        if (this.f[i] != null && zArr != null) {
            o();
        }
    }

    public final synchronized void h(drtz drtzVar, Object obj) {
        if (drtzVar == drtz.DEFAULT) {
            i(obj);
        } else {
            this.f[drtzVar.g] = obj;
            o();
        }
    }

    final synchronized void i(Object obj) {
        int i = drtz.DEFAULT.g;
        Object[] objArr = this.f;
        Object obj2 = objArr[i];
        if (obj2 != null) {
            if (Objects.deepEquals(obj2, obj)) {
                throw new IllegalStateException("Flag [" + this.a + "] was already created.");
            }
            throw new IllegalStateException("Resetting default value is disallowed [" + this.a + "].");
        }
        objArr[i] = obj;
        o();
    }

    public final synchronized String toString() {
        ejwf ejwfVar;
        String simpleName = this.b.getSimpleName();
        drtx drtxVar = this.e;
        ejwfVar = new ejwf(this.a);
        ejwfVar.b(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, simpleName);
        ejwfVar.b("finalValue", drtxVar != null ? k(drtxVar.a) : null);
        for (drtz drtzVar : d) {
            Object objA = a(drtzVar, true);
            if (objA != null) {
                ejwfVar.b(drtzVar.name(), k(objA));
            }
        }
        return ejwfVar.toString();
    }

    @Override // android.os.Parcelable
    public final /* synthetic */ void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
    }
}
