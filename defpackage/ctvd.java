package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctvd extends fcyz implements fdat {
    int a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ctvo c;
    final /* synthetic */ ChipData d;
    final /* synthetic */ aoer e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctvd(fcxy fcxyVar, boolean z, ctvo ctvoVar, ChipData chipData, aoer aoerVar) {
        super(2, fcxyVar);
        this.b = z;
        this.c = ctvoVar;
        this.d = chipData;
        this.e = aoerVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctvd) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i != 0) {
            return obj;
        }
        if (!this.b) {
            return false;
        }
        ctvo ctvoVar = this.c;
        ChipData chipData = this.d;
        aoer aoerVar = this.e;
        this.a = 1;
        Object objD = ctvoVar.d(chipData.a, aoerVar, this);
        return objD == fcylVar ? fcylVar : objD;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ctvd ctvdVar = new ctvd(fcxyVar, this.b, this.c, this.d, this.e);
        ctvdVar.f = obj;
        return ctvdVar;
    }
}
