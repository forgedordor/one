package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csrh implements koi {
    final /* synthetic */ csrl a;
    final /* synthetic */ String b;
    final /* synthetic */ Map c;

    public csrh(csrl csrlVar, String str, Map map) {
        this.a = csrlVar;
        this.b = str;
        this.c = map;
    }

    @Override // defpackage.koi
    public final Object a(kog kogVar) {
        final csrg csrgVar = new csrg(kogVar);
        dcpn dcpnVar = new dcpn(this.a.b);
        String str = this.b;
        Map map = this.c;
        if (fbat.b()) {
            final dcqi dcqiVar = (dcqi) dcpnVar.b.get();
            dcqiVar.b.a(str, map, dcqi.a(null)).s(new defb() { // from class: dcqh
                @Override // defpackage.defb
                public final void a(defn defnVar) {
                    Context context = dcqiVar.a;
                    Exception excH = defnVar.h();
                    csrgVar.a(excH != null ? dcqi.b(context, excH) : ((defv) defnVar).d ? dcqi.b(context, new CancellationException("Task is canceled")) : ((dcrm) defnVar.i()).a());
                }
            });
            return "TachyonSpamGrpc.getDroidGuardResults";
        }
        final dcpy dcpyVar = dcpnVar.a;
        final dcpu dcpuVar = new dcpu(dcpyVar, str, map, csrgVar);
        final long jA = dcpuVar.e.a();
        dcpyVar.c.postAtTime(new Runnable() { // from class: dcpr
            @Override // java.lang.Runnable
            public final void run() {
                String str2 = "getResults init timeout: " + jA + " ms";
                dcpy dcpyVar2 = dcpyVar;
                Context context = dcpyVar2.a;
                dcqg dcqgVar = dcpyVar2.b;
                dcqe dcqeVar = dcpuVar;
                dcqeVar.e(new dcqd(context, dcqgVar, str2, dcqeVar.g));
            }
        }, dcpuVar, jA + SystemClock.uptimeMillis());
        dcpyVar.b.b(dcpuVar);
        return "TachyonSpamGrpc.getDroidGuardResults";
    }
}
