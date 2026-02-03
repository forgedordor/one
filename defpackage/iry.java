package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iry extends irm {
    private final String c;

    public iry(isa isaVar) {
        super(isaVar, null);
        this.c = "androidx.compose.ui.input.pointer.PointerHoverIcon";
    }

    @Override // defpackage.jgg
    public final /* synthetic */ Object dZ() {
        return this.c;
    }

    @Override // defpackage.irm
    public final void f(isa isaVar) {
        jhv jhvVarI = i();
        if (jhvVarI != null) {
            if (isaVar == null) {
                isaVar = irz.a;
            }
            jhvVarI.a = isaVar;
            jjb.a.a(jhvVarI.c, jhvVarI.a);
        }
    }

    @Override // defpackage.irm
    public final boolean h(int i) {
        return (ita.b(i, 3) || ita.b(i, 4)) ? false : true;
    }
}
