package defpackage;

import com.google.android.ims.rcsservice.contacts.CapabilitiesUpdateEvent;
import com.google.android.ims.rcsservice.contacts.ContactsServiceResult;
import com.google.android.ims.rcsservice.contacts.ImsCapabilities;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dgxb {
    public dfys a;
    public dgxi b;
    public final dgxf c;
    private final dhgz e;
    private final dfdv f;
    private final ExecutorService g;
    private final crmx i;
    private final dfze j;
    private final Map h = DesugarCollections.synchronizedMap(new HashMap());
    public final AtomicBoolean d = new AtomicBoolean(false);

    public dgxb(dhgz dhgzVar, dfdv dfdvVar, crmx crmxVar, dgxf dgxfVar, ExecutorService executorService, dfze dfzeVar) {
        this.e = dhgzVar;
        this.f = dfdvVar;
        this.i = crmxVar;
        this.c = dgxfVar;
        this.g = executorService;
        this.j = dfzeVar;
    }

    private static ImsCapabilities g() {
        ImsCapabilities imsCapabilities = new ImsCapabilities(dgwx.a);
        imsCapabilities.e(true);
        imsCapabilities.c = true;
        return imsCapabilities;
    }

    public final ContactsServiceResult a(String str) {
        return b(str, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.ims.rcsservice.contacts.ContactsServiceResult b(java.lang.String r14, int r15) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgxb.b(java.lang.String, int):com.google.android.ims.rcsservice.contacts.ContactsServiceResult");
    }

    public final ImsCapabilities c(String str) {
        return dfpk.s() ? g() : (ImsCapabilities) this.c.c(str).orElseGet(new Supplier() { // from class: dgwy
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ImsCapabilities(this.a.c.a);
            }
        });
    }

    public final void d(long j, String str, ImsCapabilities imsCapabilities) {
        this.h.remove(str);
        this.c.e(str, imsCapabilities);
        e(j, str, imsCapabilities);
    }

    public final void e(long j, String str, ImsCapabilities imsCapabilities) {
        if (!imsCapabilities.c) {
            ImsCapabilities imsCapabilitiesC = c(str);
            imsCapabilities.s(imsCapabilitiesC.u());
            imsCapabilities.i(imsCapabilitiesC.B());
        }
        this.f.c(new CapabilitiesUpdateEvent(j, str, dgxd.a(imsCapabilities)), dhjl.CAPABILITIES_DISCOVERY);
    }

    public final void f() {
        this.d.set(false);
        this.h.clear();
    }
}
