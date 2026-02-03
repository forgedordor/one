package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxts extends fcyz implements fdat {
    final /* synthetic */ File a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cxts(fcxy fcxyVar, File file, int i, int i2) {
        super(2, fcxyVar);
        this.a = file;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cxts) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return fcva.D(fdey.g(fdey.l(fdey.h(fczv.a(new BufferedReader(new InputStreamReader(new FileInputStream(this.a), fdfy.a), 8192)), this.b), this.c)));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        cxts cxtsVar = new cxts(fcxyVar, this.a, this.b, this.c);
        cxtsVar.d = obj;
        return cxtsVar;
    }
}
