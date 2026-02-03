package defpackage;

import j$.util.Optional;
import j$.util.OptionalLong;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atin extends fcyz implements fdat {
    final /* synthetic */ atio a;
    final /* synthetic */ aubq b;
    final /* synthetic */ atha c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atin(fcxy fcxyVar, atio atioVar, aubq aubqVar, atha athaVar) {
        super(2, fcxyVar);
        this.a = atioVar;
        this.b = aubqVar;
        this.c = athaVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atin) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        atio atioVar = this.a;
        atioVar.a.b().openConnection(new URL((String) atioVar.b.a(Optional.ofNullable(this.b), OptionalLong.empty()).orElseThrow()));
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        atin atinVar = new atin(fcxyVar, this.a, this.b, this.c);
        atinVar.d = obj;
        return atinVar;
    }
}
