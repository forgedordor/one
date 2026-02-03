package defpackage;

import com.google.android.rcs.client.messaging.data.MessageReceipt;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccpx extends fcyz implements fdat {
    int a;
    final /* synthetic */ cbum b;
    final /* synthetic */ evqs c;
    final /* synthetic */ Integer d;
    final /* synthetic */ String e;
    final /* synthetic */ ccqf f;
    final /* synthetic */ MessageReceipt g;
    final /* synthetic */ atys h;
    private /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccpx(fcxy fcxyVar, cbum cbumVar, evqs evqsVar, Integer num, String str, ccqf ccqfVar, MessageReceipt messageReceipt, atys atysVar) {
        super(2, fcxyVar);
        this.b = cbumVar;
        this.c = evqsVar;
        this.d = num;
        this.e = str;
        this.f = ccqfVar;
        this.g = messageReceipt;
        this.h = atysVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ccpx) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0136, code lost:
    
        if (r0.b.b(r4, r23) == r7) goto L44;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccpx.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ccpx ccpxVar = new ccpx(fcxyVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
        ccpxVar.i = obj;
        return ccpxVar;
    }
}
