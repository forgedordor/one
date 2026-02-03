package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.IInterface;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class efaj<E> {
    public static final cczv a = cdag.p(160342172);
    public static final cczv b = cdag.p(184728843);
    private static final cczv h = cdag.p(181200999);
    public final Class c;
    public final Object d = new Object();
    public final Context e;
    public Object f;
    public fcsu g;
    private final efaq i;
    private final int j;
    private final efal k;
    private final dhip l;
    private ServiceConnection m;
    private final ServiceConnection n;

    /* compiled from: PG */
    public interface a {
        efan ea();

        fcsu gr();
    }

    public efaj(Class<E> cls, Context context, efaq efaqVar, int i, Optional<efal> optional) {
        efai efaiVar = new efai(this);
        this.n = efaiVar;
        cqaz.l(context);
        this.c = cls;
        this.e = context;
        this.i = efaqVar;
        this.j = i;
        this.k = optional.orElse(new efad());
        this.l = new dhip(String.format("JibeServiceBase<%s>", cls.getSimpleName()));
        try {
            a aVar = (a) ehli.a(context, a.class);
            eigp eigpVar = (eigp) aVar.ea().a.b();
            eigpVar.getClass();
            cls.getClass();
            this.m = new efam(eigpVar, cls, efaiVar);
            this.g = aVar.gr();
        } catch (Exception unused) {
            this.m = this.n;
        }
    }

    private final void h() {
        this.f = null;
        try {
            this.e.unbindService(this.m);
        } catch (Exception e) {
            cqca.p("RcsClientLib", e, "Unexpected error when trying to unbind " + this.c.getCanonicalName() + ": " + e.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected final Object a() throws efar {
        RuntimeException runtimeException = new RuntimeException();
        dhip dhipVar = this.l;
        dhja.t(runtimeException, dhipVar, "Actively accessing legacy Rcs services", new Object[0]);
        if (!((Boolean) h.e()).booleanValue()) {
            return this.f;
        }
        Object obj = this.f;
        if (!isConnected(obj)) {
            throw new efar(getClass().getSimpleName());
        }
        dhja.m(dhipVar, "JibeServiceBase#checkPreconditions(jibeServiceInterface) thread trace", new Object[0]);
        return obj;
    }

    protected void b() throws efar {
        if (!isConnected()) {
            throw new efar();
        }
        dhja.m(this.l, "JibeServiceBase#checkPreconditions thread trace", new Object[0]);
    }

    public boolean bindToJibeServiceInBugle() {
        Intent intentB = dhhj.b(this.c.getName());
        intentB.putExtra("expected_version", this.j);
        return this.e.bindService(intentB, this.m, 1);
    }

    protected final void c(efap efapVar) {
        cqca.o("RcsClientLib", "Service failed to connect with reason: %s", efapVar);
        synchronized (this.d) {
            h();
        }
        this.i.d(getClass().getName(), efapVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean connect() {
        /*
            r10 = this;
            boolean r0 = defpackage.dfog.L()
            if (r0 == 0) goto Lcc
            boolean r0 = r10.f()
            java.lang.String r1 = "RcsClientLib"
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L22
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            java.lang.String r0 = "Service is deprecated skipping connection attempt: %s"
            defpackage.cqca.o(r1, r0, r3)
            return r2
        L22:
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = r0.getSimpleName()
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r4[r2] = r0
            java.lang.String r0 = "Connecting %s"
            defpackage.cqca.j(r1, r0, r4)
            java.lang.String r0 = r10.getRcsServiceClass()
            android.content.Context r4 = r10.e
            boolean r5 = defpackage.dhka.k(r4)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            if (r0 == 0) goto L45
            r7 = r3
            goto L46
        L45:
            r7 = r2
        L46:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r8 = 2
            java.lang.Object[] r9 = new java.lang.Object[r8]
            r9[r2] = r6
            r9[r3] = r7
            java.lang.String r2 = "shouldUseCarrierServicesJibeService: %b, CarrierServices rcs service found: %b"
            defpackage.cqca.j(r1, r2, r9)
            if (r5 == 0) goto L7a
            if (r0 == 0) goto L79
            java.lang.Class r1 = r10.c
            java.lang.String r1 = r1.getName()
            android.content.Intent r0 = defpackage.dhhj.a(r0, r1)
            int r1 = r10.j
            java.lang.String r2 = "expected_version"
            r0.putExtra(r2, r1)
            ewee r1 = r10.getServiceNameLoggingEnum()
            r10.g(r1, r8)
            android.content.ServiceConnection r1 = r10.m
            boolean r0 = r4.bindService(r0, r1, r3)
            goto Lba
        L79:
            r0 = 0
        L7a:
            boolean r2 = defpackage.dfog.y()
            if (r2 == 0) goto L8f
            if (r0 == 0) goto L8f
            java.lang.Class r2 = r10.c
            java.lang.String r2 = r2.getName()
            android.content.Intent r0 = defpackage.dhhj.a(r0, r2)
            r4.stopService(r0)
        L8f:
            boolean r0 = defpackage.dhka.d(r4)
            if (r0 == 0) goto La4
            java.lang.String r0 = "Starting Bugle JibeService."
            defpackage.cqca.c(r1, r0)
            java.lang.String r0 = "com.google.android.ims.JibeService"
            android.content.Intent r0 = defpackage.dhhj.b(r0)
            r4.startService(r0)
            goto Laf
        La4:
            boolean r0 = defpackage.dhka.e(r4)
            if (r0 != 0) goto Laf
            java.lang.String r0 = "Can't start Bugle JibeService in the background."
            defpackage.cqca.n(r1, r0)
        Laf:
            ewee r0 = r10.getServiceNameLoggingEnum()
            r10.g(r0, r8)
            boolean r0 = r10.bindToJibeServiceInBugle()
        Lba:
            if (r0 != 0) goto Lcb
            efaq r1 = r10.i
            java.lang.Class r2 = r10.getClass()
            java.lang.String r2 = r2.getName()
            efap r3 = defpackage.efap.UNKNOWN
            r1.d(r2, r3)
        Lcb:
            return r0
        Lcc:
            efak r0 = new efak
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efaj.connect():boolean");
    }

    protected void d(String str) {
        cqca.j("RcsClientLib", "%s connected", str);
        this.i.e(str);
    }

    public void disconnect() {
        cqca.j("RcsClientLib", "Disconnecting %s", getClass().getSimpleName());
        synchronized (this.d) {
            h();
        }
    }

    protected void e(String str) {
        cqca.o("RcsClientLib", "%s disconnected", str);
        this.i.f(str);
    }

    protected boolean f() {
        throw null;
    }

    public final void g(ewee eweeVar, int i) {
        this.k.a(eweeVar, i);
    }

    public String getRcsServiceClass() {
        Intent intent = new Intent("com.google.android.ims.START_RCS_ENGINE");
        intent.setPackage("com.google.android.ims");
        List<ResolveInfo> listQueryIntentServices = this.e.getPackageManager().queryIntentServices(intent, 128);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            cqca.n("RcsClientLib", "No CS.apk RCS service found. Is RCS running in Bugle?");
            return null;
        }
        if (listQueryIntentServices.size() == 1) {
            return listQueryIntentServices.get(0).serviceInfo.name;
        }
        cqca.g("RcsClientLib", "There should be one and only one RCS service. Number of services: %d", Integer.valueOf(listQueryIntentServices.size()));
        return null;
    }

    public abstract String getRcsServiceMetaDataKey();

    public ServiceConnection getServiceConnection() {
        return this.m;
    }

    public efaq getServiceListener() {
        return this.i;
    }

    public ewee getServiceNameLoggingEnum() {
        return ewee.UNKNOWN_SERVICE;
    }

    public boolean isConnected() {
        synchronized (this.d) {
            Object obj = this.f;
            if (obj == null) {
                return false;
            }
            boolean zPingBinder = ((IInterface) obj).asBinder().pingBinder();
            if (!zPingBinder) {
                cqca.j("RcsClientLib", "isConnected:binding is broken for %s", getClass().getSimpleName());
            }
            return zPingBinder;
        }
    }

    public boolean isConnected(E e) {
        synchronized (this.d) {
            if (e == null) {
                return false;
            }
            boolean zPingBinder = ((IInterface) e).asBinder().pingBinder();
            if (!zPingBinder) {
                cqca.o("RcsClientLib", "isConnected:binding is broken for %s", getClass().getSimpleName());
            }
            return zPingBinder;
        }
    }
}
