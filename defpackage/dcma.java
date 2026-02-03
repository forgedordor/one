package defpackage;

import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.service.IClientTelemetryService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcma extends dcfm implements dclr {
    public static final /* synthetic */ int a = 0;
    private static final dcfd b;
    private static final dceu m;
    private static final dcfe n;

    static {
        dcfd dcfdVar = new dcfd();
        b = dcfdVar;
        dclz dclzVar = new dclz();
        m = dclzVar;
        n = new dcfe("ClientTelemetry.API", dclzVar, dcfdVar);
    }

    public dcma(Context context, dcls dclsVar) {
        super(context, n, dclsVar, dcfl.a);
    }

    @Override // defpackage.dclr
    public final defn a(final TelemetryData telemetryData) {
        dciz dcizVar = new dciz();
        dcizVar.b = new Feature[]{dcbx.a};
        dcizVar.b();
        dcizVar.a = new dcir() { // from class: dcly
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                int i = dcma.a;
                ((IClientTelemetryService) ((dcmb) obj).w()).recordData(telemetryData);
                ((defr) obj2).b(null);
            }
        };
        return i(dcizVar.a());
    }
}
