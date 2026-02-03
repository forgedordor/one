package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ayak extends fcyz implements fdat {
    final /* synthetic */ aybe a;
    final /* synthetic */ fdci b;
    final /* synthetic */ cmny c;
    final /* synthetic */ int d;
    final /* synthetic */ fdce e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayak(fcxy fcxyVar, aybe aybeVar, fdci fdciVar, cmny cmnyVar, int i, fdce fdceVar) {
        super(2, fcxyVar);
        this.a = aybeVar;
        this.b = fdciVar;
        this.c = cmnyVar;
        this.d = i;
        this.e = fdceVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ayak) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        ekgb ekgbVarR;
        fctl.b(obj);
        aybe aybeVar = this.a;
        cscx cscxVar = (cscx) aybeVar.o.b();
        fdci fdciVar = this.b;
        cscxVar.a((MessageCoreData) fdciVar.a, null, null);
        MessageCoreData messageCoreData = (MessageCoreData) fdciVar.a;
        boolean z = this.e.a;
        elof elofVar = (elof) elpg.b.createBuilder();
        elofVar.getClass();
        elofVar.copyOnWrite();
        elpg elpgVar = (elpg) elofVar.instance;
        elpgVar.at = 5;
        elpgVar.e |= 2048;
        elhf.i(2, elofVar);
        cmny cmnyVar = this.c;
        if (cmnyVar != null) {
            boolean z2 = true;
            if (!cmnyVar.m && !z) {
                z2 = false;
            }
            elhf.c(z2, elofVar);
            if (aybeVar.R.a()) {
                new evsz(((elpg) elofVar.instance).X, elpg.a);
                alqm alqmVar = cmnyVar.r;
                if (alqmVar == null || (ekgbVarR = ((aixq) aybeVar.S.b()).a(ekgb.r(alqmVar))) == null) {
                    ekgbVarR = ekgb.r(elns.UNKNOWN_FORMAT);
                    ekgbVarR.getClass();
                }
                elofVar.a(ekgbVarR);
            }
        }
        int i = this.d;
        elhf.h(3, elofVar);
        ((ajhd) aybeVar.m.b()).H(messageCoreData, i, (elof) elhf.a(elofVar).toBuilder());
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ayak ayakVar = new ayak(fcxyVar, this.a, this.b, this.c, this.d, this.e);
        ayakVar.f = obj;
        return ayakVar;
    }
}
