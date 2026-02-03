package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationManager;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czec implements ddnu, afho {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/ui/mediapicker/c2o/location/picker/LocationAttachmentPickerPresenter");
    public ddnn b;
    public afhs c;
    public WeakReference d;
    public Location e;
    public bxeq f;
    public final ains g;
    private LatLng h;
    private final Context i;
    private final LocationManager j;
    private final crma k;

    public czec(Context context, LocationManager locationManager, crma crmaVar, ains ainsVar, afhs afhsVar) {
        this.i = context;
        this.j = locationManager;
        this.k = crmaVar;
        this.g = ainsVar;
        int i = ddny.a;
        this.b = new ddos(context);
        this.c = afhsVar;
        synchronized (afhs.b) {
            afhsVar.c = new WeakReference(this);
        }
    }

    @Override // defpackage.afho
    public final void a(final String str, final Bitmap bitmap, final int i) {
        cqdq.a.post(new Runnable() { // from class: czdy
            @Override // java.lang.Runnable
            public final void run() {
                czeb czebVar = (czeb) this.a.d.get();
                if (czebVar != null) {
                    int i2 = i;
                    czebVar.ap(str, bitmap, i2);
                }
            }
        });
    }

    @Override // defpackage.afho
    public final void b(eatj eatjVar) {
        this.f = new bxeq(eatjVar, this.h);
        cqdq.a.post(new Runnable() { // from class: czea
            @Override // java.lang.Runnable
            public final void run() {
                czec czecVar = this.a;
                Location location = czecVar.e;
                if (location != null) {
                    new LatLng(location.getLatitude(), czecVar.e.getLongitude()).equals(czecVar.f.a);
                }
                czeb czebVar = (czeb) czecVar.d.get();
                if (czebVar != null) {
                    czebVar.aq(czecVar.f, false);
                }
            }
        });
    }

    public final void c() {
        czeb czebVar = (czeb) this.d.get();
        if (czebVar != null) {
            czebVar.ai();
        }
    }

    public final void d(bxeq bxeqVar) {
        this.f = bxeqVar;
        this.h = bxeqVar.a;
        czeb czebVar = (czeb) this.d.get();
        if (czebVar != null) {
            czebVar.al();
            czebVar.aq(bxeqVar, true);
            czebVar.ao(this.h);
            czebVar.an(this.h);
        }
        this.c.a();
    }

    final void e() {
        Location location = this.e;
        if (location != null) {
            f(new LatLng(location.getLatitude(), location.getLongitude()));
            czeb czebVar = (czeb) this.d.get();
            if (czebVar != null) {
                czebVar.an(this.h);
            }
        }
    }

    public final void f(LatLng latLng) {
        this.h = latLng;
        czeb czebVar = (czeb) this.d.get();
        LatLng latLng2 = this.h;
        LatLngBounds latLngBounds = latLng2 == null ? null : new LatLngBounds(latLng2, latLng2);
        if (czebVar != null) {
            czebVar.ao(this.h);
            czebVar.al();
        }
        this.c.a();
        if (latLngBounds == null) {
            cqdq.a.post(new Runnable() { // from class: czdz
                @Override // java.lang.Runnable
                public final void run() {
                    czeb czebVar2 = (czeb) this.a.d.get();
                    if (czebVar2 != null) {
                        czebVar2.aj();
                    }
                }
            });
            return;
        }
        afhs afhsVar = this.c;
        afhr afhrVar = new afhr(afhsVar, this.h);
        synchronized (afhsVar.d) {
            if (afhsVar.i != null) {
                afhsVar.i.a();
            }
            afhsVar.i = afhrVar;
        }
        auwa.a(afhrVar, afhsVar.f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (java.lang.Integer.parseInt(r2) == 1) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0053 A[PHI: r2 r3
      0x0053: PHI (r2v8 java.lang.String) = (r2v13 java.lang.String), (r2v12 java.lang.String) binds: [B:20:0x0051, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE]
      0x0053: PHI (r3v4 android.database.Cursor) = (r3v3 android.database.Cursor), (r3v5 android.database.Cursor) binds: [B:20:0x0051, B:13:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r9 = this;
            java.lang.ref.WeakReference r0 = r9.d
            java.lang.Object r0 = r0.get()
            r1 = r0
            czeb r1 = (defpackage.czeb) r1
            android.content.Context r0 = r9.i
            boolean r2 = defpackage.afhl.a(r0)
            if (r2 == 0) goto L6f
            android.content.ContentResolver r3 = r0.getContentResolver()
            r2 = 0
            android.net.Uri r4 = defpackage.afhl.b     // Catch: java.lang.Throwable -> L3f java.lang.RuntimeException -> L41
            java.lang.String r0 = "value"
            java.lang.String[] r5 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L3f java.lang.RuntimeException -> L41
            java.lang.String r6 = "name=?"
            java.lang.String r0 = "use_location_for_services"
            java.lang.String[] r7 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L3f java.lang.RuntimeException -> L41
            r8 = 0
            android.database.Cursor r3 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3f java.lang.RuntimeException -> L41
            if (r3 == 0) goto L3c
            boolean r0 = r3.moveToNext()     // Catch: java.lang.RuntimeException -> L3a java.lang.Throwable -> L67
            if (r0 == 0) goto L3c
            r0 = 0
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.RuntimeException -> L3a java.lang.Throwable -> L67
            r2 = r0
            goto L3c
        L3a:
            r0 = move-exception
            goto L43
        L3c:
            if (r3 == 0) goto L56
            goto L53
        L3f:
            r0 = move-exception
            goto L69
        L41:
            r0 = move-exception
            r3 = r2
        L43:
            cqce r4 = defpackage.afhl.a     // Catch: java.lang.Throwable -> L67
            cqbd r4 = r4.e()     // Catch: java.lang.Throwable -> L67
            java.lang.String r5 = "Failed to get 'Use My Location' setting."
            r4.I(r5)     // Catch: java.lang.Throwable -> L67
            r4.s(r0)     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L56
        L53:
            r3.close()
        L56:
            if (r2 != 0) goto L59
            goto L61
        L59:
            int r0 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L61
            r2 = 1
            if (r0 != r2) goto L61
            goto L6f
        L61:
            if (r1 == 0) goto Lcf
            r1.ak()
            return
        L67:
            r0 = move-exception
            r2 = r3
        L69:
            if (r2 == 0) goto L6e
            r2.close()
        L6e:
            throw r0
        L6f:
            android.location.LocationManager r0 = r9.j
            if (r0 == 0) goto Lca
            java.lang.String r2 = "gps"
            boolean r2 = r0.isProviderEnabled(r2)
            if (r2 != 0) goto L83
            java.lang.String r2 = "network"
            boolean r0 = r0.isProviderEnabled(r2)
            if (r0 == 0) goto Lca
        L83:
            crma r0 = r9.k
            boolean r0 = r0.i()
            if (r0 != 0) goto L91
            if (r1 == 0) goto Lcf
            r1.ah()
            return
        L91:
            if (r1 == 0) goto L96
            r1.F()
        L96:
            ekrg r0 = defpackage.czec.a
            ekrw r0 = r0.h()
            ekrd r0 = (defpackage.ekrd) r0
            r1 = 170(0xaa, float:2.38E-43)
            java.lang.String r2 = "LocationAttachmentPickerPresenter.java"
            java.lang.String r3 = "com/google/android/apps/messaging/ui/mediapicker/c2o/location/picker/LocationAttachmentPickerPresenter"
            java.lang.String r4 = "startListeningForCurrentLocation"
            ekrw r0 = r0.h(r3, r4, r1, r2)
            ekrd r0 = (defpackage.ekrd) r0
            java.lang.String r1 = "Requesting current location"
            r0.q(r1)
            ddnn r0 = r9.b
            r1 = 100
            defn r0 = r0.c(r1)
            czdw r1 = new czdw
            r1.<init>()
            r0.a(r1)
            czdx r1 = new czdx
            r1.<init>()
            r0.t(r1)
            return
        Lca:
            if (r1 == 0) goto Lcf
            r1.am()
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czec.g():void");
    }

    @Override // defpackage.ddnu
    public final void h(Location location) {
        this.e = location;
        if (this.h == null) {
            e();
        } else {
            c();
        }
    }
}
