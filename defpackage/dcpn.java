package defpackage;

import android.content.Context;
import com.google.android.gms.droidguard.DroidGuardResultsRequest;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcpn {
    public final dcpy a;
    public final ejxr b;

    public dcpn(final Context context) {
        dcpy dcpyVar = new dcpy(context);
        ejxr ejxrVarA = ejxx.a(new ejxr() { // from class: dcpm
            @Override // defpackage.ejxr
            public final Object get() {
                Context context2 = context;
                dzzh.f(context2);
                return new dcqi(context2, dcrw.a(context2));
            }
        });
        dzzh.f(context);
        this.a = dcpyVar;
        this.b = ejxrVarA;
    }

    public static String a(Context context, String str, Map map) {
        return new dcpn(context).b(str, map, null);
    }

    public final String b(String str, Map map, DroidGuardResultsRequest droidGuardResultsRequest) {
        if (!fbat.b()) {
            dcpy dcpyVar = this.a;
            return (String) new dcpt(dcpyVar, str, droidGuardResultsRequest, map).b(dcpyVar.b);
        }
        dcqi dcqiVar = (dcqi) this.b.get();
        try {
            return ((dcrm) degc.f(dcqiVar.b.a(str, map, dcqi.a(droidGuardResultsRequest)))).a();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return dcqi.b(dcqiVar.a, e);
        } catch (ExecutionException e2) {
            Context context = dcqiVar.a;
            Throwable cause = e2.getCause();
            Throwable cause2 = e2;
            if (cause != null) {
                cause2 = e2.getCause();
            }
            return dcqi.b(context, cause2);
        }
    }
}
