package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class crym extends fcyz implements fdat {
    int a;
    final /* synthetic */ cryo b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ csnx d;
    final /* synthetic */ cryl e;
    final /* synthetic */ eofr f;
    final /* synthetic */ eofg g;
    final /* synthetic */ int h;
    final /* synthetic */ int i;
    final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crym(cryo cryoVar, ConversationIdType conversationIdType, csnx csnxVar, cryl crylVar, int i, eofr eofrVar, int i2, int i3, eofg eofgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = cryoVar;
        this.c = conversationIdType;
        this.d = csnxVar;
        this.e = crylVar;
        this.h = i;
        this.f = eofrVar;
        this.i = i2;
        this.j = i3;
        this.g = eofgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((crym) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r0.d != false) goto L27;
     */
    @Override // defpackage.fcyt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crym.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new crym(this.b, this.c, this.d, this.e, this.h, this.f, this.i, this.j, this.g, fcxyVar);
    }
}
