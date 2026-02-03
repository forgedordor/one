package defpackage;

import com.google.android.apps.messaging.shared.conversation.draft.EditingData;
import j$.time.Instant;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xwz extends fcyz implements fdat {
    int a;
    final /* synthetic */ xxd b;
    final /* synthetic */ fdci c;
    final /* synthetic */ dpfy d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xwz(xxd xxdVar, fdci fdciVar, dpfy dpfyVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = xxdVar;
        this.c = fdciVar;
        this.d = dpfyVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((xwz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object objB;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            objB = obj;
        } else {
            xxd xxdVar = this.b;
            vwj vwjVar = (vwj) xxdVar.e.a();
            vvw vvwVar = new vvw((String) this.c.a, (List) null, (String) null, false, xxdVar.b.b(), (EditingData) null, (Instant) null, false, 0, false, 2030);
            vto vtoVar = new vto(xxdVar.g.a());
            this.a = 1;
            objB = vwjVar.b(vvwVar, vtoVar, this);
            if (objB == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) objB).booleanValue()) {
            this.d.f.e();
            this.b.g.b();
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new xwz(this.b, this.c, this.d, fcxyVar);
    }
}
