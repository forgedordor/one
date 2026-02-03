package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axwd extends fcyz implements fdat {
    final /* synthetic */ axwp a;
    final /* synthetic */ Uri b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public axwd(fcxy fcxyVar, axwp axwpVar, Uri uri) {
        super(2, fcxyVar);
        this.a = axwpVar;
        this.b = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axwd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        File fileE = bxlh.e(this.a.c, this.b);
        long length = 0;
        byte[] bArrB = null;
        if (fileE != null) {
            try {
                bArrB = eleh.b(fileE);
            } catch (FileNotFoundException e) {
                cqbd cqbdVarB = axwp.a.b();
                cqbdVarB.I("MMS download file not found:");
                cqbdVarB.I(fileE);
                cqbdVarB.s(e);
            } catch (IOException e2) {
                cqbd cqbdVarB2 = axwp.a.b();
                cqbdVarB2.I("Error reading MMS download file:");
                cqbdVarB2.I(fileE);
                cqbdVarB2.s(e2);
            }
        }
        if (bArrB != null) {
            length = bArrB.length;
        }
        if (fileE != null && fileE.exists()) {
            fileE.delete();
            cqbd cqbdVarA = axwp.a.a();
            cqbdVarA.I("Deleted temp file with downloaded MMS pdu:");
            cqbdVarA.I(fileE);
            cqbdVarA.r();
        }
        return new axvs(bArrB, length);
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        axwd axwdVar = new axwd(fcxyVar, this.a, this.b);
        axwdVar.c = obj;
        return axwdVar;
    }
}
