package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xxy extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ xye c;
    final /* synthetic */ fdjx d;
    final /* synthetic */ xxe e;
    final /* synthetic */ Map f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xxy(fcxy fcxyVar, xye xyeVar, fdjx fdjxVar, xxe xxeVar, Map map) {
        super(3, fcxyVar);
        this.c = xyeVar;
        this.d = fdjxVar;
        this.e = xxeVar;
        this.f = map;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xxy xxyVar = new xxy((fcxy) obj3, this.c, this.d, this.e, this.f);
        xxyVar.g = (fdpm) obj;
        xxyVar.b = obj2;
        return xxyVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r2 = this.g;
            int iIntValue = ((Number) this.b).intValue();
            xye xyeVar = this.c;
            fdjx fdjxVar = this.d;
            xxe xxeVar = this.e;
            MessageId messageIdB = ((ajlt) xxeVar.a.get(iIntValue)).b();
            final fduf fdufVarA = fdvf.a("");
            dnjk dnjkVar = new dnjk() { // from class: xvk
                @Override // defpackage.dnjk
                public final void a(String str) {
                    str.getClass();
                    fdufVarA.f(str);
                }
            };
            xvw xvwVar = xyeVar.c;
            dpfy dpfyVar = new dpfy(dnjkVar, xvwVar.h, 2);
            xyb xybVar = new xyb(fdud.a(fdqq.a(new xvr(xvwVar.g)), xvwVar.l, fdufVarA, new xvt(xvwVar, dpfyVar, fdjxVar, messageIdB, null)), this.f, xxeVar, iIntValue, fdjxVar, xyeVar);
            this.a = 1;
            if (fdpy.c(r2, xybVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
