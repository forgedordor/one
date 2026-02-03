package defpackage;

import android.net.Uri;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnzr extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ dnzt c;
    final /* synthetic */ Uri d;
    final /* synthetic */ int e;
    final /* synthetic */ dnzg f;
    final /* synthetic */ dmmx g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dnzr(dnzt dnztVar, Uri uri, int i, dnzg dnzgVar, dmmx dmmxVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = dnztVar;
        this.d = uri;
        this.e = i;
        this.f = dnzgVar;
        this.g = dmmxVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dnzr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object obj2;
        fcyl fcylVar = fcyl.a;
        int i = this.b;
        if (i == 0) {
            fctl.b(obj);
            dnzt dnztVar = this.c;
            if (!(dnztVar.f instanceof dnzo)) {
                throw new IllegalStateException("Cannot start recording when already recording.");
            }
            dndk dndkVar = dnztVar.e;
            Uri uri = this.d;
            this.b = 1;
            obj = dndkVar.e(uri, this);
            if (obj != fcylVar) {
            }
            return fcylVar;
        }
        if (i != 1) {
            obj2 = this.a;
            fctl.b(obj);
            dnzt dnztVar2 = this.c;
            dmmx dmmxVar = this.g;
            fdlr fdlrVarD = fdil.d(dnztVar2.b, null, fdjz.b, new dnzq(dnztVar2, dmmxVar, null), 1);
            dnztVar2.f = new dnzn(this.d, fdlrVarD, (OutputStream) obj2);
            fdlrVarD.z();
            return fctx.a;
        }
        fctl.b(obj);
        dnzt dnztVar3 = this.c;
        int i2 = this.e;
        dnzg dnzgVar = this.f;
        OutputStream outputStream = (OutputStream) obj;
        this.a = outputStream;
        this.b = 2;
        dnzl dnzlVar = dnztVar3.d;
        Object objA = fdin.a(dnzlVar.b.hE(), new dnzk(dnzlVar, i2, outputStream, dnzgVar, null), this);
        if (objA != fcylVar) {
            objA = fctx.a;
        }
        if (objA != fcylVar) {
            obj2 = outputStream;
            dnzt dnztVar22 = this.c;
            dmmx dmmxVar2 = this.g;
            fdlr fdlrVarD2 = fdil.d(dnztVar22.b, null, fdjz.b, new dnzq(dnztVar22, dmmxVar2, null), 1);
            dnztVar22.f = new dnzn(this.d, fdlrVarD2, (OutputStream) obj2);
            fdlrVarD2.z();
            return fctx.a;
        }
        return fcylVar;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new dnzr(this.c, this.d, this.e, this.f, this.g, fcxyVar);
    }
}
