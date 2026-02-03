package defpackage;

import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffdb extends ffdi {
    public static final boolean a;
    private final List c;

    static {
        boolean z = false;
        if (ffdh.b() && Build.VERSION.SDK_INT >= 29) {
            z = true;
        }
        a = z;
    }

    public ffdb() {
        ffdt[] ffdtVarArr = new ffdt[2];
        ffdtVarArr[0] = ffdj.a() ? new ffdk() : null;
        ffdtVarArr[1] = new ffds(ffdq.a);
        List listK = fcur.K(ffdtVarArr);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            if (((ffdt) obj).d()) {
                arrayList.add(obj);
            }
        }
        this.c = arrayList;
    }

    @Override // defpackage.ffdi
    public final String a(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ffdt) next).e(sSLSocket)) {
                break;
            }
        }
        ffdt ffdtVar = (ffdt) next;
        if (ffdtVar != null) {
            return ffdtVar.a(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.ffdi
    public final X509TrustManager b(SSLSocketFactory sSLSocketFactory) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ffdt) next).f(sSLSocketFactory)) {
                break;
            }
        }
        ffdt ffdtVar = (ffdt) next;
        if (ffdtVar != null) {
            return ffdtVar.b(sSLSocketFactory);
        }
        return null;
    }

    @Override // defpackage.ffdi
    public final ffea c(X509TrustManager x509TrustManager) {
        ffdm ffdmVarA = ffdl.a(x509TrustManager);
        return ffdmVarA != null ? ffdmVarA : super.c(x509TrustManager);
    }

    @Override // defpackage.ffdi
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((ffdt) next).e(sSLSocket)) {
                    break;
                }
            }
        }
        ffdt ffdtVar = (ffdt) next;
        if (ffdtVar != null) {
            ffdtVar.c(sSLSocket, str, list);
        }
    }

    @Override // defpackage.ffdi
    public final boolean e(String str) {
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }
}
