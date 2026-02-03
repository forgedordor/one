package defpackage;

import android.content.Context;
import java.io.IOException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cmiu implements cmiv {
    private final fcsu a;

    public cmiu(Context context, fcsu fcsuVar) {
        context.getClass();
        fcsuVar.getClass();
        this.a = fcsuVar;
    }

    @Override // defpackage.cmiv
    public final void a(Set set) throws IOException {
        set.getClass();
        eieu eieuVarH = eiiy.h("DittoRegistrationHandler#handleSimLoaded");
        try {
            ((bvit) this.a.b()).j();
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    @Override // defpackage.cmiv
    public final /* synthetic */ void b(Set set) {
    }
}
