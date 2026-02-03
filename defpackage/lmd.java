package defpackage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lmd extends fcyz implements fdap {
    Object a;
    Object b;
    int c;
    final /* synthetic */ lme d;
    final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmd(lme lmeVar, Object obj, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.d = lmeVar;
        this.e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Exception {
        ?? r1;
        Throwable th;
        Object obj2;
        fcyl fcylVar = fcyl.a;
        try {
            if (this.c != 0) {
                obj2 = this.b;
                r1 = this.a;
                try {
                    fctl.b(obj);
                    r1 = r1;
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        fczl.a(r1, th);
                        throw th3;
                    }
                }
            } else {
                fctl.b(obj);
                FileOutputStream fileOutputStream = new FileOutputStream(this.d.a);
                Object obj3 = this.e;
                try {
                    lna lnaVar = new lna(fileOutputStream);
                    this.a = fileOutputStream;
                    this.b = fileOutputStream;
                    this.c = 1;
                    ((evuh) obj3).writeTo(lnaVar);
                    if (fctx.a == fcylVar) {
                        return fcylVar;
                    }
                    obj2 = fileOutputStream;
                    r1 = obj2;
                } catch (Throwable th4) {
                    r1 = fileOutputStream;
                    th = th4;
                    throw th;
                }
            }
            ((FileOutputStream) obj2).getFD().sync();
            fczl.a(r1, null);
            return fctx.a;
        } catch (Exception e) {
            if (e instanceof FileNotFoundException) {
                throw llq.a(this.d.a.getParent(), e);
            }
            throw e;
        }
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new lmd(this.d, this.e, (fcxy) obj).b(fctx.a);
    }
}
