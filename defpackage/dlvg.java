package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlvg extends fcyz implements fdat {
    final /* synthetic */ dlvl a;
    final /* synthetic */ dlvp b;
    final /* synthetic */ Uri c;
    final /* synthetic */ Bundle d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlvg(dlvl dlvlVar, dlvp dlvpVar, Uri uri, Bundle bundle, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = dlvlVar;
        this.b = dlvpVar;
        this.c = uri;
        this.d = bundle;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlvg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Uri uri = this.c;
        String strA = dngu.a(uri);
        StringBuilder sb = new StringBuilder("ofList for ");
        sb.append(strA);
        sb.append(" with ");
        Bundle bundle = this.d;
        sb.append(bundle);
        return dlvl.b(this.b, sb.toString(), false, new dlvf(this.a, uri, bundle));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dlvg(this.a, this.b, this.c, this.d, fcxyVar);
    }
}
