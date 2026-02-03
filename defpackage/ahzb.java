package defpackage;

import java.io.File;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahzb extends fcyz implements fdat {
    int a;
    final /* synthetic */ ahzi b;
    final /* synthetic */ UUID c;
    final /* synthetic */ File d;
    final /* synthetic */ szf e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahzb(fcxy fcxyVar, ahzi ahziVar, UUID uuid, File file, szf szfVar) {
        super(2, fcxyVar);
        this.b = ahziVar;
        this.c = uuid;
        this.d = file;
        this.e = szfVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahzb) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e8, code lost:
    
        if (r1.g(r3, r11.k, r10) != r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d4  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahzb.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ahzb ahzbVar = new ahzb(fcxyVar, this.b, this.c, this.d, this.e);
        ahzbVar.f = obj;
        return ahzbVar;
    }
}
