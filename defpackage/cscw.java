package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cscw extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ cscx c;
    final /* synthetic */ MessageCoreData d;
    final /* synthetic */ Integer e;
    final /* synthetic */ eyga f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cscw(cscx cscxVar, MessageCoreData messageCoreData, Integer num, eyga eygaVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = cscxVar;
        this.d = messageCoreData;
        this.e = num;
        this.f = eygaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cscw) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x010c, code lost:
    
        if (r0 == r10) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f1  */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [csch, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cscw.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cscw(this.c, this.d, this.e, this.f, fcxyVar);
    }
}
