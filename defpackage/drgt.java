package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class drgt implements fbni {
    private static drgt a;
    private final ejxr b;

    public drgt(ejxr ejxrVar) {
        this.b = ejxrVar;
    }

    public static synchronized drgt b() {
        if (a == null) {
            a = new drgt(new ejxr() { // from class: drgn
                @Override // defpackage.ejxr
                public final Object get() {
                    return true;
                }
            });
        }
        return a;
    }

    @Override // defpackage.fbni
    public final fbnh a(fbrk fbrkVar, fbnc fbncVar, fbnd fbndVar) {
        drgs drgsVar;
        if (!((Boolean) this.b.get()).booleanValue()) {
            return fbndVar.a(fbrkVar, fbncVar);
        }
        dzfh dzfhVar = (dzfh) fbncVar.h(drgj.a);
        if (dzfhVar == null) {
            drgsVar = new drgs(new dzrm("https://" + fbndVar.b() + "/" + fbrkVar.b));
        } else {
            drgsVar = new drgs(dzrm.a(fbndVar.b(), dzfhVar));
        }
        return new drgp(fbndVar.a(fbrkVar, fbncVar.g(drgsVar)), drgsVar);
    }
}
