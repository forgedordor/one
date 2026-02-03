package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dnzi extends fcyz implements fdat {
    int a;
    final /* synthetic */ dnzl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnzi(dnzl dnzlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dnzlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnzi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            dnzl dnzlVar = this.b;
            if (!dnzlVar.b()) {
                return fctx.a;
            }
            fdoa fdoaVar = dnzlVar.d;
            if (fdoaVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            fdoaVar.e(null);
            fdkf fdkfVar = dnzlVar.c;
            if (fdkfVar == null) {
                throw new IllegalStateException("Required value was null.");
            }
            this.a = 1;
            obj = fdkfVar.c(this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        int iIntValue = ((Number) obj).intValue();
        rcl rclVarA = this.b.a();
        if (rclVarA.d) {
            rclVarA.d = false;
            try {
                rclVarA.e.write(59);
                rclVarA.e.flush();
            } catch (IOException unused) {
            }
            rclVarA.a = 0;
            rclVarA.e = null;
            rclVarA.f = null;
            rclVarA.g = null;
            rclVarA.h = null;
            rclVarA.i = null;
            rclVarA.j = true;
        }
        dnzl dnzlVar2 = this.b;
        dnzlVar2.d = null;
        dnzlVar2.c = null;
        ((ekrd) dnzl.a.h().h("com/google/android/libraries/compose/gif/encoder/GifEncoder$finish$2", "invokeSuspend", 81, "GifEncoder.kt")).r("Finished encoding GIF with %d frames.", iIntValue);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnzi(this.b, fcxyVar);
    }
}
