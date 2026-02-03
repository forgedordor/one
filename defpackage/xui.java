package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xui extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ xuj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xui(xuj xujVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = xujVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        xui xuiVar = new xui(this.c, (fcxy) obj3);
        xuiVar.a = (ekgb) obj;
        xuiVar.b = (Map) obj2;
        return xuiVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r1 = this.a;
        ?? r2 = this.b;
        ResolvedRecipient resolvedRecipient = (ResolvedRecipient) fcva.P(r1);
        final alqm alqmVarG = resolvedRecipient != null ? resolvedRecipient.g() : null;
        if (alqmVarG == null || !alqmVarG.v() || alqmVarG.e().isEmpty()) {
            return null;
        }
        boolean zV = alqmVarG.v();
        final xuj xujVar = this.c;
        xtt[] xttVarArr = new xtt[5];
        amqj amqjVar = (amqj) r2.get(amrb.b);
        xttVarArr[0] = new xtt("XMS Session: ".concat(xujVar.c(amqjVar != null ? amqjVar.e : null)), false, null, new fdae() { // from class: xuc
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, 14);
        amqj amqjVar2 = (amqj) r2.get(amrb.a);
        xttVarArr[1] = new xtt("RCS Session: ".concat(xujVar.c(amqjVar2 != null ? amqjVar2.e : null)), false, null, new fdae() { // from class: xud
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, 14);
        xttVarArr[2] = new xtt("Reset XMS Session", false, null, new fdae() { // from class: xue
            @Override // defpackage.fdae
            public final Object invoke() {
                String str = ((aubq) alqmVarG.e().get()).d;
                str.getClass();
                xuj xujVar2 = xujVar;
                auvw.k(xujVar2.a, null, null, new xub(xujVar2, str, null), 3);
                return fctx.a;
            }
        }, 14);
        xttVarArr[3] = new xtt("Reset RCS Session", false, null, new fdae() { // from class: xuf
            @Override // defpackage.fdae
            public final Object invoke() {
                String str = ((aubq) alqmVarG.e().get()).d;
                str.getClass();
                xuj xujVar2 = xujVar;
                auvw.k(xujVar2.a, null, null, new xua(xujVar2, str, null), 3);
                return fctx.a;
            }
        }, 14);
        xttVarArr[4] = new xtt("Reset All Sessions", false, null, new fdae() { // from class: xug
            @Override // defpackage.fdae
            public final Object invoke() {
                String str = ((aubq) alqmVarG.e().get()).d;
                str.getClass();
                xuj xujVar2 = xujVar;
                auvw.k(xujVar2.a, null, null, new xtz(xujVar2, str, null), 3);
                return fctx.a;
            }
        }, 14);
        return new xtt("Emergency RCS Debug Tool", zV, fcva.g(xttVarArr), new fdae() { // from class: xuh
            @Override // defpackage.fdae
            public final Object invoke() {
                return fctx.a;
            }
        }, 2);
    }
}
