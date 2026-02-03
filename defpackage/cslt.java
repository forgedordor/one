package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cslt extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ cslz c;
    final /* synthetic */ Uri d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cslt(cslz cslzVar, Uri uri, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cslzVar;
        this.d = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cslt) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ?? r0;
        fcyl fcylVar = fcyl.a;
        if (this.b != 0) {
            r0 = this.a;
            try {
                fctl.b(obj);
                r0 = r0;
            } catch (Throwable th) {
                th = th;
                try {
                    throw th;
                } catch (Throwable th2) {
                    fczl.a(r0, th);
                    throw th2;
                }
            }
        } else {
            fctl.b(obj);
            cslz cslzVar = this.c;
            ParcelFileDescriptor parcelFileDescriptorD = cslzVar.d(this.d);
            try {
                dhyu dhyuVar = (dhyu) cslzVar.c.b();
                this.a = parcelFileDescriptorD;
                this.b = 1;
                obj = dhyuVar.b(1, parcelFileDescriptorD, 2, this);
                if (obj == fcylVar) {
                    return fcylVar;
                }
                r0 = parcelFileDescriptorD;
            } catch (Throwable th3) {
                th = th3;
                r0 = parcelFileDescriptorD;
                throw th;
            }
        }
        dhyt dhytVar = (dhyt) obj;
        fczl.a(r0, null);
        return dhytVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cslt(this.c, this.d, fcxyVar);
    }
}
