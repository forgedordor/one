package defpackage;

/* loaded from: classes2.dex */
public final class vga extends fcyv {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ vgb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vga(vgb vgbVar, fcxy fcxyVar) {
        super(fcxyVar);
        this.c = vgbVar;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fO(null, this);
    }
}
