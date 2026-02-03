package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xyb implements fdpl {
    final /* synthetic */ fdpl a;
    final /* synthetic */ Map b;
    final /* synthetic */ xxe c;
    final /* synthetic */ int d;
    final /* synthetic */ fdjx e;
    final /* synthetic */ xye f;

    public xyb(fdpl fdplVar, Map map, xxe xxeVar, int i, fdjx fdjxVar, xye xyeVar) {
        this.a = fdplVar;
        this.b = map;
        this.c = xxeVar;
        this.d = i;
        this.e = fdjxVar;
        this.f = xyeVar;
    }

    @Override // defpackage.fdpl
    public final Object a(fdpm fdpmVar, fcxy fcxyVar) {
        Object objA = this.a.a(new xya(fdpmVar, this.b, this.c, this.d, this.e, this.f), fcxyVar);
        return objA == fcyl.a ? objA : fctx.a;
    }
}
