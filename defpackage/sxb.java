package defpackage;

import android.os.ParcelFileDescriptor;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sxb extends fcyz implements fdat {
    int a;
    final /* synthetic */ svy b;
    final /* synthetic */ ParcelFileDescriptor c;
    final /* synthetic */ fdci d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sxb(fcxy fcxyVar, svy svyVar, ParcelFileDescriptor parcelFileDescriptor, fdci fdciVar) {
        super(2, fcxyVar);
        this.b = svyVar;
        this.c = parcelFileDescriptor;
        this.d = fdciVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((sxb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2 = fcyl.a;
        try {
            try {
                if (this.a != 0) {
                    fctl.b(obj);
                } else {
                    fctl.b(obj);
                    svy svyVar = this.b;
                    ParcelFileDescriptor parcelFileDescriptor = this.c;
                    parcelFileDescriptor.getClass();
                    this.a = 1;
                    Object objA = fdin.a(eicg.a(svyVar.b), new svx(null, svyVar, parcelFileDescriptor), this);
                    if (objA != obj2) {
                        objA = fctx.a;
                    }
                    if (objA == obj2) {
                        return obj2;
                    }
                }
                this.b.b();
                return fctx.a;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                throw new sxf(e2, (svz) this.d.a);
            }
        } catch (Throwable th) {
            this.b.b();
            throw th;
        }
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        sxb sxbVar = new sxb(fcxyVar, this.b, this.c, this.d);
        sxbVar.e = obj;
        return sxbVar;
    }
}
