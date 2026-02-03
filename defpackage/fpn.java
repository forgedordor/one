package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpn {
    public final fnw a;

    public fpn(fpo fpoVar) {
        int i = fpj.a;
        this.a = new fnw(fpoVar, new fdae() { // from class: fpk
            @Override // defpackage.fdae
            public final Object invoke() {
                kio kioVarA = this.a.a();
                int i2 = fpj.a;
                return Float.valueOf(kioVarA.en(400.0f));
            }
        });
    }

    public final kio a() {
        throw new IllegalArgumentException(a.h(this, "The density on DrawerState (", ") was not set. Did you use DrawerState with the Drawer composable?"));
    }
}
