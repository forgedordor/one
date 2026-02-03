package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dser implements dsea {
    private final dsbr a;
    private final ConnectivityManager b;

    public dser(Context context, dsbr dsbrVar) {
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.a = dsbrVar;
    }

    private final boolean c() {
        NetworkInfo activeNetworkInfo = this.b.getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // defpackage.dsea
    public final dsdz a() {
        return dsdz.NETWORK;
    }

    @Override // defpackage.ejug
    public final /* bridge */ /* synthetic */ boolean b(Object obj, Object obj2) {
        etom etomVar = (etom) obj;
        dsec dsecVar = (dsec) obj2;
        etmv etmvVar = etomVar.c;
        if (etmvVar == null) {
            etmvVar = etmv.a;
        }
        etgo etgoVarB = etgo.b(etmvVar.c);
        if (etgoVarB == null) {
            etgoVarB = etgo.CONNECTIVITY_UNKNOWN;
        }
        int iOrdinal = etgoVarB.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    if (!c()) {
                        this.a.c(dsecVar.a(), "Offline but want online", new Object[0]);
                    }
                    return c();
                }
                dsbr dsbrVar = this.a;
                dsbi dsbiVarA = dsecVar.a();
                etmv etmvVar2 = etomVar.c;
                if (etmvVar2 == null) {
                    etmvVar2 = etmv.a;
                }
                etgo etgoVarB2 = etgo.b(etmvVar2.c);
                if (etgoVarB2 == null) {
                    etgoVarB2 = etgo.CONNECTIVITY_UNKNOWN;
                }
                dsbrVar.d(dsbiVarA, "Invalid Connectivity value: %s", etgoVarB2);
                return true;
            }
            if (c()) {
                this.a.c(dsecVar.a(), "Online but want offline", new Object[0]);
            }
            if (c()) {
                return false;
            }
        }
        return true;
    }
}
