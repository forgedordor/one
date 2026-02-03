package defpackage;

import android.content.Context;
import com.google.android.gms.googlehelp.internal.common.IGoogleHelpService;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class ddde extends dcgp {
    public ddde(dcfq dcfqVar) {
        super(ddck.c, dcfqVar);
    }

    @Override // defpackage.dcgp
    protected final /* bridge */ /* synthetic */ void b(dcev dcevVar) {
        dddk dddkVar = (dddk) dcevVar;
        Context context = dddkVar.c;
        d((IGoogleHelpService) dddkVar.w());
    }

    @Override // defpackage.dcgp, defpackage.dcgq
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        super.m((dcfx) obj);
    }

    protected abstract void d(IGoogleHelpService iGoogleHelpService);
}
