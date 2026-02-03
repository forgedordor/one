package defpackage;

import com.google.android.apps.messaging.R;
import java.io.IOException;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctny extends fcyz implements fdau {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ ctoc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctny(ctoc ctocVar, fcxy fcxyVar) {
        super(3, fcxyVar);
        this.c = ctocVar;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ctny ctnyVar = new ctny(this.c, (fcxy) obj3);
        ctnyVar.a = (agqo) obj;
        ctnyVar.b = (cudx) obj2;
        return ctnyVar.b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        Object obj2 = this.a;
        Object obj3 = this.b;
        List list = obj2 != null ? ((agqo) obj2).b : null;
        if (list == null || list.contains(agqp.c) || list.contains(agqp.d) || list.contains(agqp.e) || list.contains(agqp.f) || (!((Boolean) ((cczi) crbf.aE.get()).e()).booleanValue() && ((cudx) obj3).d.a())) {
            return null;
        }
        final ctoc ctocVar = this.c;
        fcsu fcsuVar = ctocVar.d;
        String strS = ((cgsa) fcsuVar.b()).s();
        String string = ctocVar.a.getString(R.string.penpal_row_subtitle);
        string.getClass();
        final cudx cudxVar = (cudx) obj3;
        return new ctoe(strS, string, new dkrk(new dkpf(((cgsa) fcsuVar.b()).c(), null, null, 0, null, 30), null, 0, 0, 0.0f, null, 62), new fdae() { // from class: ctnx
            @Override // defpackage.fdae
            public final Object invoke() throws IOException {
                ctoc ctocVar2 = ctocVar;
                eigp eigpVar = ctocVar2.f;
                cudx cudxVar2 = cudxVar;
                eieh eiehVarA = eigpVar.a("PenpalRowUiAdapterImpl#onClick");
                try {
                    auvw.k(ctocVar2.c, ctocVar2.b, null, new ctnz(ctocVar2, cudxVar2, null), 2);
                    agxy agxyVar = (agxy) ctocVar2.g.b();
                    encu encuVar = (encu) encw.a.createBuilder();
                    encuVar.getClass();
                    envz.b(3, encuVar);
                    agxyVar.a(envz.a(encuVar));
                    fczl.a(eiehVarA, null);
                    return fctx.a;
                } finally {
                }
            }
        });
    }
}
