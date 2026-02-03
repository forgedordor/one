package defpackage;

import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmmj extends fcyz implements fdat {
    final /* synthetic */ fdci a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmmj(fdci fdciVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = fdciVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmmj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        OutputStream outputStream = (OutputStream) this.a.a;
        if (outputStream == null) {
            return null;
        }
        outputStream.close();
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dmmj(this.a, fcxyVar);
    }
}
