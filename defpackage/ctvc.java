package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctvc extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctvo b;
    final /* synthetic */ ChipData c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctvc(fcxy fcxyVar, ctvo ctvoVar, ChipData chipData) {
        super(2, fcxyVar);
        this.b = ctvoVar;
        this.c = chipData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctvc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        ctvo ctvoVar = this.b;
        ChipData chipData = this.c;
        this.a = 1;
        Object objF = ctvoVar.f(chipData.a, this);
        return objF == fcylVar ? fcylVar : objF;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ctvc ctvcVar = new ctvc(fcxyVar, this.b, this.c);
        ctvcVar.d = obj;
        return ctvcVar;
    }
}
