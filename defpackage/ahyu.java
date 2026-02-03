package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahyu extends fcyz implements fdap {
    int a;
    final /* synthetic */ ahzi b;
    final /* synthetic */ UUID c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahyu(ahzi ahziVar, UUID uuid, fcxy fcxyVar) {
        super(1, fcxyVar);
        this.b = ahziVar;
        this.c = uuid;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ahzi ahziVar = this.b;
            ahyt ahytVar = new ahyt(ahziVar, this.c, null);
            this.a = 1;
            if (fdin.a(ahziVar.g, ahytVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fdap
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new ahyu(this.b, this.c, (fcxy) obj).b(fctx.a);
    }
}
