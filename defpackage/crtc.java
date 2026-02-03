package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crtc extends fcyz implements fdat {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ crtd e;
    final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crtc(crtd crtdVar, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.e = crtdVar;
        this.f = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crtc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        Object obj3;
        feav feavVar;
        fcyl fcylVar = fcyl.a;
        if (this.d != 0) {
            obj3 = this.c;
            obj2 = this.b;
            Object obj4 = this.a;
            fctl.b(obj);
            feavVar = obj4;
        } else {
            fctl.b(obj);
            obj2 = this.e;
            String str = this.f;
            feav feavVar2 = crtd.a;
            this.a = feavVar2;
            this.b = obj2;
            this.c = str;
            this.d = 1;
            if (feavVar2.b(this) == fcylVar) {
                return fcylVar;
            }
            obj3 = str;
            feavVar = feavVar2;
        }
        try {
            feav feavVar3 = crtd.a;
            Context context = ((crtd) obj2).c;
            kyg.e(context, ekgb.r(obj3));
            kyg.d(context, ekgb.r(obj3));
            feavVar.d();
            return fctx.a;
        } catch (Throwable th) {
            feavVar.d();
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crtc(this.e, this.f, fcxyVar);
    }
}
