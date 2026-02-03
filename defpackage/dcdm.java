package defpackage;

import android.content.Context;
import com.google.android.gms.cobalt.LogOccurrenceRequest;
import com.google.android.gms.cobalt.internal.ICobaltLoggerService;
import com.google.android.gms.common.Feature;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcdm extends dcfm implements dcdc {
    private static final dcfd m;
    private static final dceu n;
    private static final dcfe o;
    public final int a;
    public final int b;

    static {
        dcfd dcfdVar = new dcfd();
        m = dcfdVar;
        dcdk dcdkVar = new dcdk();
        n = dcdkVar;
        o = new dcfe("CobaltLogger.API", dcdkVar, dcfdVar);
    }

    public dcdm(Context context, dcde dcdeVar) {
        super(context, o, dcdeVar, dcfl.a);
        this.a = dcdeVar.a;
        this.b = dcdeVar.b;
    }

    @Override // defpackage.dcdc
    public final defn a(final int i, final int[] iArr) {
        dciz dcizVar = new dciz();
        dcizVar.b = new Feature[]{dcdf.a};
        dcizVar.b();
        dcizVar.a = new dcir() { // from class: dcdj
            @Override // defpackage.dcir
            public final void a(Object obj, Object obj2) {
                dcdl dcdlVar = new dcdl((defr) obj2);
                LogOccurrenceRequest logOccurrenceRequest = new LogOccurrenceRequest();
                dcdm dcdmVar = this.a;
                logOccurrenceRequest.a = dcdmVar.a;
                logOccurrenceRequest.b = dcdmVar.b;
                logOccurrenceRequest.c = i;
                logOccurrenceRequest.d = 1L;
                logOccurrenceRequest.e = iArr;
                ((ICobaltLoggerService) ((dcdi) obj).w()).logOccurrence(logOccurrenceRequest, dcdlVar);
            }
        };
        return i(dcizVar.a());
    }
}
