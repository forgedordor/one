package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import j$.util.Optional;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgxf {
    private static final long c = TimeUnit.SECONDS.toMillis(1);
    public long a;
    public long b;
    private final dfdd d;
    private final LinkedHashMap e;
    private boolean f;
    private final Handler g;

    public dgxf(dfdd dfddVar) {
        long j = ImsCapabilities.k;
        this.a = j;
        this.b = j;
        this.f = false;
        this.g = f();
        this.e = new LinkedHashMap(10, 0.5f, false);
        this.d = dfddVar;
    }

    private static synchronized Handler f() {
        Looper looperMyLooper;
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        return new Handler(looperMyLooper);
    }

    private final void g() {
        if (!this.f && this.e.size() > 0) {
            this.g.postDelayed(new Runnable() { // from class: dgxe
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d();
                }
            }, c);
            this.f = true;
        }
    }

    public final dgwx a() {
        return new dgwx(this.b);
    }

    final dgwx b() {
        return new dgwx(this.a);
    }

    public final synchronized Optional c(String str) {
        LinkedHashMap linkedHashMap = this.e;
        ImsCapabilities imsCapabilities = (ImsCapabilities) linkedHashMap.get(str);
        if (imsCapabilities != null) {
            dhja.o("Found cached capabilities for %s: %s", dhiz.PHONE_NUMBER.c(str), imsCapabilities);
            return Optional.of(imsCapabilities);
        }
        dfic dficVarF = this.d.f(str);
        ImsCapabilities imsCapabilities2 = new ImsCapabilities(this.a);
        if (dficVarF.b == 2) {
            imsCapabilities2.e(true);
            imsCapabilities2.c = dficVarF.d;
            imsCapabilities2.g = dficVarF.e;
            imsCapabilities2.i(dficVarF.a(dfib.HTTP_FT));
            imsCapabilities2.s(dficVarF.a(dfib.STICKERS));
            imsCapabilities2.k(dficVarF.a(dfib.LOCATION_PUSH));
            imsCapabilities2.o(dficVarF.a(dfib.IP_VIDEO_CALL_ONLY));
            imsCapabilities2.m(dficVarF.a(dfib.IP_CALL));
            imsCapabilities2.e = dficVarF.c;
            imsCapabilities2.g(dficVarF.a(dfib.FILE_TRANSFER_VIA_SMS));
            imsCapabilities2.l(dficVarF.a(dfib.LOCATION_VIA_SMS));
            dfib dfibVar = dfib.UP_2_0;
            imsCapabilities2.p(dficVarF.a(dfibVar));
            imsCapabilities2.r(dficVarF.a(dfibVar));
        }
        if (dfic.a.equals(dficVarF)) {
            dhja.o("Found no cached capabilities for %s", dhiz.PHONE_NUMBER.c(str));
            return Optional.empty();
        }
        dhja.o("Found cached capabilities for %s in database: %s", dhiz.PHONE_NUMBER.c(str), imsCapabilities2);
        if (str != null) {
            linkedHashMap.put(str, imsCapabilities2);
        }
        return Optional.of(imsCapabilities2);
    }

    final synchronized void d() {
        this.f = false;
        LinkedHashMap linkedHashMap = this.e;
        if (linkedHashMap.size() == 0) {
            dhja.c("The cache is empty. Nothing to do.", new Object[0]);
            return;
        }
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ImsCapabilities imsCapabilities = (ImsCapabilities) it.next();
            if (!imsCapabilities.N()) {
                dhja.c("Removing item %s", imsCapabilities);
                it.remove();
            }
        }
        g();
    }

    public final synchronized void e(String str, ImsCapabilities imsCapabilities) {
        int i = 1;
        if (TextUtils.isEmpty(str)) {
            dhja.q("Unable to cache capabilities for empty MSISDN: %s", imsCapabilities);
            return;
        }
        dfdd dfddVar = this.d;
        if (true == imsCapabilities.y()) {
            i = 2;
        }
        dfddVar.j(str, i, imsCapabilities);
        LinkedHashMap linkedHashMap = this.e;
        linkedHashMap.remove(str);
        linkedHashMap.put(str, imsCapabilities);
        g();
    }
}
