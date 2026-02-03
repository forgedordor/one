package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctvm extends fcyz implements fdat {
    int a;
    final /* synthetic */ ctvo b;
    final /* synthetic */ ChipData c;
    final /* synthetic */ boolean d;
    final /* synthetic */ aoer e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctvm(fcxy fcxyVar, ctvo ctvoVar, ChipData chipData, boolean z, aoer aoerVar) {
        super(2, fcxyVar);
        this.b = ctvoVar;
        this.c = chipData;
        this.d = z;
        this.e = aoerVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctvm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
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
        boolean z = this.d;
        aoer aoerVar = this.e;
        this.a = 1;
        Object objC = ctvoVar.c(chipData, z, aoerVar, this);
        return objC == fcylVar ? fcylVar : objC;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ctvm ctvmVar = new ctvm(fcxyVar, this.b, this.c, this.d, this.e);
        ctvmVar.f = obj;
        return ctvmVar;
    }
}
