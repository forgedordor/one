package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crfp extends fcyz implements fdat {
    int a;
    final /* synthetic */ crgd b;
    final /* synthetic */ MessageCoreData c;
    final /* synthetic */ List d;
    Object e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crfp(fcxy fcxyVar, crgd crgdVar, MessageCoreData messageCoreData, List list) {
        super(2, fcxyVar);
        this.b = crgdVar;
        this.c = messageCoreData;
        this.d = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crfp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0080, code lost:
    
        if (r10 != r0) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b6 A[LOOP:0: B:21:0x01b0->B:23:0x01b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01fd  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crfp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        crfp crfpVar = new crfp(fcxyVar, this.b, this.c, this.d);
        crfpVar.f = obj;
        return crfpVar;
    }
}
