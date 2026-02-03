package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ync implements ymx {
    public final ajlt a;
    public final ajlt b;
    public final ajlt c;
    public final ykw d;
    private final cogw e;
    private final fctc f;
    private final fctc g;
    private final fctc h;
    private final fctc i;

    public ync(ajlt ajltVar, ajlt ajltVar2, ajlt ajltVar3, ykw ykwVar, cogw cogwVar) {
        ajltVar.getClass();
        cogwVar.getClass();
        this.a = ajltVar;
        this.b = ajltVar2;
        this.c = ajltVar3;
        this.d = ykwVar;
        this.e = cogwVar;
        this.f = fctd.a(new fdae() { // from class: ymy
            @Override // defpackage.fdae
            public final Object invoke() {
                String strD;
                ajlt ajltVar4 = this.a.a;
                if (ajltVar4.g() instanceof amwf) {
                    amwf amwfVar = (amwf) ajltVar4.g();
                    String strC = amwfVar.c();
                    boolean z = strC == null || strC.length() == 0;
                    boolean z2 = !(amwfVar instanceof amwi) || (strD = ((amwi) amwfVar).d()) == null || strD.length() == 0;
                    if (z && z2) {
                        return new zjm(ajltVar4);
                    }
                }
                return ajltVar4;
            }
        });
        this.g = fctd.a(new fdae() { // from class: ymz
            @Override // defpackage.fdae
            public final Object invoke() {
                ync yncVar = this.a;
                ajlt ajltVarA = yncVar.a();
                ajltVarA.getClass();
                ykw ykwVar2 = yncVar.d;
                ajlt ajltVar4 = yncVar.c;
                ajlt ajltVarA2 = ajltVar4 != null ? ykwVar2.a(ajltVar4) : null;
                ajlt ajltVar5 = yncVar.b;
                ajlt ajltVarA3 = ajltVar5 != null ? ykwVar2.a(ajltVar5) : null;
                dkkh dkkhVar = (ykw.b(ajltVarA, ajltVarA2) || !ykw.b(ajltVarA, ajltVarA3)) ? (ykw.b(ajltVarA, ajltVarA2) && ykw.b(ajltVarA, ajltVarA3)) ? dkkh.c : (!ykw.b(ajltVarA, ajltVarA2) || ykw.b(ajltVarA, ajltVarA3)) ? dkkh.a : dkkh.d : dkkh.b;
                if (yji.a(ajltVarA)) {
                    if (dkkhVar == dkkh.b) {
                        dkkhVar = dkkh.a;
                    } else if (dkkhVar == dkkh.c) {
                        dkkhVar = dkkh.d;
                    }
                }
                return (ajltVarA2 == null || !yji.a(ajltVarA2)) ? dkkhVar : dkkhVar == dkkh.c ? dkkh.b : dkkhVar == dkkh.d ? dkkh.a : dkkhVar;
            }
        });
        this.h = fctd.a(new fdae() { // from class: yna
            @Override // defpackage.fdae
            public final Object invoke() {
                return Boolean.valueOf(this.a.c == null);
            }
        });
        this.i = fctd.a(new fdae() { // from class: ynb
            @Override // defpackage.fdae
            public final Object invoke() {
                return Boolean.valueOf(this.a.b == null);
            }
        });
    }

    @Override // defpackage.ymx
    public final ajlt a() {
        return (ajlt) this.f.a();
    }

    @Override // defpackage.ymx
    public final dkkh b() {
        return (dkkh) this.g.a();
    }

    @Override // defpackage.ymx
    public final boolean c() {
        ajlt ajltVar = this.c;
        return ajltVar == null || a().w() != ajltVar.w();
    }

    @Override // defpackage.ymx
    public final boolean d() {
        return ((Boolean) this.h.a()).booleanValue();
    }

    @Override // defpackage.ymx
    public final boolean e() {
        return ((Boolean) this.i.a()).booleanValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ync)) {
            return false;
        }
        ync yncVar = (ync) obj;
        return fdbq.f(a(), yncVar.a()) && b() == yncVar.b();
    }

    @Override // defpackage.ymx
    public final boolean f() {
        ajlt ajltVar = this.b;
        if (ajltVar == null) {
            return false;
        }
        return ajltVar.o().isAfter(this.e.f().minusSeconds(5L));
    }

    @Override // defpackage.ymx
    public final boolean g() {
        ajlt ajltVar = this.c;
        if (ajltVar == null) {
            return true;
        }
        amvr amvrVarG = ajltVar.g();
        return (amvrVarG instanceof amwh) && ((amwg) fcva.N(((amwh) amvrVarG).a())).b() == 8;
    }

    @Override // defpackage.ymx
    public final boolean h() {
        ajlt ajltVar = this.c;
        return ajltVar == null || Math.abs(a().o().toEpochMilli() - ajltVar.o().toEpochMilli()) >= 3600000;
    }

    public final int hashCode() {
        return (a().hashCode() * 31) + b().hashCode();
    }
}
