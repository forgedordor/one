package defpackage;

import com.google.android.apps.messaging.R;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnzz extends fcyz implements fdat {
    int a;
    final /* synthetic */ doaa b;
    final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnzz(doaa doaaVar, int i, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = doaaVar;
        this.c = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnzz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        try {
            if (this.a != 0) {
                fctl.b(obj);
            } else {
                fctl.b(obj);
                doaa doaaVar = this.b;
                int i = this.c;
                this.a = 1;
                if (doaaVar.b(i, this) == fcylVar) {
                    return fcylVar;
                }
            }
        } catch (IOException unused) {
            doaa doaaVar2 = this.b;
            docj.bk(doaaVar2, null, null, doaaVar2.d.compareAndSet(false, true) ? new Integer(R.string.gif_screen_unable_to_show_trending_content) : null, null, null, 27);
        }
        this.b.bL();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnzz(this.b, this.c, fcxyVar);
    }
}
