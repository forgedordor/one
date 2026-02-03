package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xec extends fcyz implements fdat {
    int a;
    final /* synthetic */ wlk b;
    final /* synthetic */ xee c;
    final /* synthetic */ dltd d;
    final /* synthetic */ fdap e;
    final /* synthetic */ vvl f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xec(wlk wlkVar, xee xeeVar, dltd dltdVar, fdap fdapVar, vvl vvlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = wlkVar;
        this.c = xeeVar;
        this.d = dltdVar;
        this.e = fdapVar;
        this.f = vvlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xec) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                long j = this.b.b / 1024;
                afzc afzcVar = this.c.a;
                doju dojuVar = (doju) this.d;
                Uri uri = Uri.parse(dojuVar.b);
                uri.getClass();
                aggj aggjVar = new aggj(uri, j, dojuVar.c, dojuVar.d);
                this.a = 1;
                obj = afzcVar.f(aggjVar, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
            }
            Uri uri2 = (Uri) obj;
            if (uri2 != null) {
                fdap fdapVar = this.e;
                vvl vvlVar = this.f;
                doig doigVarA = dohx.a("video/*");
                if (doigVarA == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                fdapVar.invoke(new vvo(vvlVar, doigVarA, uri2, null, new dlsx("com.samsung.app.newtrim", 2)));
            }
        } catch (RuntimeException unused) {
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xec(this.b, this.c, this.d, this.e, this.f, fcxyVar);
    }
}
