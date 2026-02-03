package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csjp extends fcyz implements fdat {
    Object a;
    int b;
    final /* synthetic */ MessageIdType c;
    final /* synthetic */ csjq d;
    final /* synthetic */ List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csjp(MessageIdType messageIdType, csjq csjqVar, List list, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.c = messageIdType;
        this.d = csjqVar;
        this.e = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csjp) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0141, code lost:
    
        if (r0.b(r11, r19) == r10) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csjp.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new csjp(this.c, this.d, this.e, fcxyVar);
    }
}
