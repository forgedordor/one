package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tbc extends fcyz implements fdat {
    int a;
    final /* synthetic */ tbe b;
    final /* synthetic */ UUID c;
    final /* synthetic */ boolean d;
    final /* synthetic */ dbww e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tbc(fcxy fcxyVar, tbe tbeVar, UUID uuid, boolean z, dbww dbwwVar) {
        super(2, fcxyVar);
        this.b = tbeVar;
        this.c = uuid;
        this.d = z;
        this.e = dbwwVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((tbc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fe, code lost:
    
        if (r15 == r0) goto L44;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r15) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tbc.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        tbc tbcVar = new tbc(fcxyVar, this.b, this.c, this.d, this.e);
        tbcVar.f = obj;
        return tbcVar;
    }
}
