package defpackage;

import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atff extends fcyz implements fdat {
    final /* synthetic */ atfx a;
    final /* synthetic */ ContentType b;
    final /* synthetic */ Uri c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atff(fcxy fcxyVar, atfx atfxVar, ContentType contentType, Uri uri) {
        super(2, fcxyVar);
        this.a = atfxVar;
        this.b = contentType;
        this.c = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atff) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(this.a.e.l(this.b.toString(), this.c));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        atff atffVar = new atff(fcxyVar, this.a, this.b, this.c);
        atffVar.d = obj;
        return atffVar;
    }
}
