package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csqv extends fcyz implements fdat {
    int a;
    final /* synthetic */ String b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ csrb d;
    final /* synthetic */ int e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public csqv(fcxy fcxyVar, String str, ConversationIdType conversationIdType, csrb csrbVar, int i) {
        super(2, fcxyVar);
        this.b = str;
        this.c = conversationIdType;
        this.d = csrbVar;
        this.e = i;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((csqv) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0165  */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.csqv.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        csqv csqvVar = new csqv(fcxyVar, this.b, this.c, this.d, this.e);
        csqvVar.f = obj;
        return csqvVar;
    }
}
