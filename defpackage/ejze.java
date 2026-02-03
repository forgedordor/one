package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
class ejze {
    public static final ejze a;
    public static final ejze b;
    public static final ejze c;
    public static final ejze d;
    public static final ejze e;
    public static final ejze f;
    public static final ejze g;
    public static final ejze h;
    static final ejze[] i;
    private static final /* synthetic */ ejze[] j;

    static {
        ejze ejzeVar = new ejze("STRONG", 0);
        a = ejzeVar;
        ejze ejzeVar2 = new ejze() { // from class: ejyy
            @Override // defpackage.ejze
            public final ekal a(ejzq ejzqVar, ekal ekalVar, ekal ekalVar2, Object obj) {
                ekal ekalVarA = super.a(ejzqVar, ekalVar, ekalVar2, obj);
                c(ekalVar, ekalVarA);
                return ekalVarA;
            }
        };
        b = ejzeVar2;
        ejze ejzeVar3 = new ejze() { // from class: ejyz
            @Override // defpackage.ejze
            public final ekal a(ejzq ejzqVar, ekal ekalVar, ekal ekalVar2, Object obj) {
                ekal ekalVarA = super.a(ejzqVar, ekalVar, ekalVar2, obj);
                d(ekalVar, ekalVarA);
                return ekalVarA;
            }
        };
        c = ejzeVar3;
        ejze ejzeVar4 = new ejze() { // from class: ejza
            @Override // defpackage.ejze
            public final ekal a(ejzq ejzqVar, ekal ekalVar, ekal ekalVar2, Object obj) {
                ekal ekalVarA = super.a(ejzqVar, ekalVar, ekalVar2, obj);
                c(ekalVar, ekalVarA);
                d(ekalVar, ekalVarA);
                return ekalVarA;
            }
        };
        d = ejzeVar4;
        ejze ejzeVar5 = new ejze("WEAK", 4);
        e = ejzeVar5;
        ejze ejzeVar6 = new ejze() { // from class: ejzb
            @Override // defpackage.ejze
            public final ekal a(ejzq ejzqVar, ekal ekalVar, ekal ekalVar2, Object obj) {
                ekal ekalVarA = super.a(ejzqVar, ekalVar, ekalVar2, obj);
                c(ekalVar, ekalVarA);
                return ekalVarA;
            }
        };
        f = ejzeVar6;
        ejze ejzeVar7 = new ejze() { // from class: ejzc
            @Override // defpackage.ejze
            public final ekal a(ejzq ejzqVar, ekal ekalVar, ekal ekalVar2, Object obj) {
                ekal ekalVarA = super.a(ejzqVar, ekalVar, ekalVar2, obj);
                d(ekalVar, ekalVarA);
                return ekalVarA;
            }
        };
        g = ejzeVar7;
        ejze ejzeVar8 = new ejze() { // from class: ejzd
            @Override // defpackage.ejze
            public final ekal a(ejzq ejzqVar, ekal ekalVar, ekal ekalVar2, Object obj) {
                ekal ekalVarA = super.a(ejzqVar, ekalVar, ekalVar2, obj);
                c(ekalVar, ekalVarA);
                d(ekalVar, ekalVarA);
                return ekalVarA;
            }
        };
        h = ejzeVar8;
        j = new ejze[]{ejzeVar, ejzeVar2, ejzeVar3, ejzeVar4, ejzeVar5, ejzeVar6, ejzeVar7, ejzeVar8};
        i = new ejze[]{ejzeVar, ejzeVar2, ejzeVar3, ejzeVar4, ejzeVar5, ejzeVar6, ejzeVar7, ejzeVar8};
    }

    public ejze(String str, int i2) {
    }

    static final void c(ekal ekalVar, ekal ekalVar2) {
        ekalVar2.k(ekalVar.b());
        ekak.c(ekalVar.h(), ekalVar2);
        ekak.c(ekalVar2, ekalVar.f());
        ekak.e(ekalVar);
    }

    static final void d(ekal ekalVar, ekal ekalVar2) {
        ekalVar2.q(ekalVar.c());
        ekak.d(ekalVar.i(), ekalVar2);
        ekak.d(ekalVar2, ekalVar.g());
        ekak.f(ekalVar);
    }

    public static ejze[] values() {
        return (ejze[]) j.clone();
    }

    public ekal a(ejzq ejzqVar, ekal ekalVar, ekal ekalVar2, Object obj) {
        return b(ejzqVar, obj, ekalVar.a(), ekalVar2);
    }

    final ekal b(ejzq ejzqVar, Object obj, int i2, ekal ekalVar) {
        switch (ordinal()) {
            case 0:
                return new ejzv(obj, i2, ekalVar);
            case 1:
                return new ejzt(obj, i2, ekalVar);
            case 2:
                return new ejzx(obj, i2, ekalVar);
            case 3:
                return new ejzu(obj, i2, ekalVar);
            case 4:
                return new ekad(ejzqVar.h, obj, i2, ekalVar);
            case 5:
                return new ekab(ejzqVar.h, obj, i2, ekalVar);
            case 6:
                return new ekaf(ejzqVar.h, obj, i2, ekalVar);
            case 7:
                return new ekac(ejzqVar.h, obj, i2, ekalVar);
            default:
                throw null;
        }
    }
}
