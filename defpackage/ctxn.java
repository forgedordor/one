package defpackage;

import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctxn extends fcyz implements fdat {
    int a;
    final /* synthetic */ List b;
    final /* synthetic */ ctxr c;
    final /* synthetic */ aoer d;
    final /* synthetic */ String e;
    final /* synthetic */ Uri f;
    Object g;
    Object h;
    Object i;
    Object j;
    Object k;
    private /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctxn(fcxy fcxyVar, List list, ctxr ctxrVar, aoer aoerVar, String str, Uri uri) {
        super(2, fcxyVar);
        this.b = list;
        this.c = ctxrVar;
        this.d = aoerVar;
        this.e = str;
        this.f = uri;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctxn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:96)
        */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x00bd: MOVE (r11 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]) (LINE:190), block:B:26:0x00bc */
    @Override // defpackage.fcyt
    public final java.lang.Object b(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctxn.b(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ctxn ctxnVar = new ctxn(fcxyVar, this.b, this.c, this.d, this.e, this.f);
        ctxnVar.l = obj;
        return ctxnVar;
    }
}
