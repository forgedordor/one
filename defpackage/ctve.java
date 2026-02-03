package defpackage;

import com.google.android.apps.messaging.startchat.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctve extends fcyz implements fdat {
    final /* synthetic */ boolean a;
    final /* synthetic */ ctvo b;
    final /* synthetic */ ChipData c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ctve(fcxy fcxyVar, boolean z, ctvo ctvoVar, ChipData chipData) {
        super(2, fcxyVar);
        this.a = z;
        this.b = ctvoVar;
        this.c = chipData;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ctve) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return false;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        ctve ctveVar = new ctve(fcxyVar, this.a, this.b, this.c);
        ctveVar.d = obj;
        return ctveVar;
    }
}
