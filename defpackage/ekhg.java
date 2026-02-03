package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekhg extends ekfm {
    public eknt a;
    public boolean b;
    public boolean c;

    public ekhg() {
        this(4);
    }

    public final ekhj a() {
        eknt ekntVar = this.a;
        ekntVar.getClass();
        if (ekntVar.c == 0) {
            return ekom.a;
        }
        if (this.c) {
            this.a = new eknt(ekntVar);
            this.c = false;
        }
        this.b = true;
        return new ekom(this.a);
    }

    public final void b(Iterable iterable) {
        eknt ekntVar = this.a;
        ekntVar.getClass();
        if (!(iterable instanceof ekni)) {
            super.e(iterable);
            return;
        }
        ekni ekniVar = (ekni) iterable;
        eknt ekntVar2 = ekniVar instanceof ekom ? ((ekom) ekniVar).b : ekniVar instanceof ekbm ? ((ekbm) ekniVar).a : null;
        if (ekntVar2 != null) {
            ekntVar.j(Math.max(ekntVar.c, ekntVar2.c));
            for (int iA = ekntVar2.a(); iA >= 0; iA = ekntVar2.e(iA)) {
                d(ekntVar2.i(iA), ekntVar2.c(iA));
            }
            return;
        }
        Set setJ = ekniVar.j();
        eknt ekntVar3 = this.a;
        ekntVar3.j(Math.max(ekntVar3.c, setJ.size()));
        for (eknh eknhVar : ekniVar.j()) {
            d(eknhVar.b(), eknhVar.a());
        }
    }

    public final void d(Object obj, int i) {
        eknt ekntVar = this.a;
        ekntVar.getClass();
        if (i == 0) {
            return;
        }
        if (this.b) {
            this.a = new eknt(ekntVar);
            this.c = false;
        }
        this.b = false;
        obj.getClass();
        eknt ekntVar2 = this.a;
        ekntVar2.p(obj, i + ekntVar2.b(obj));
    }

    @Override // defpackage.ekfm
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final void c(Object obj) {
        d(obj, 1);
    }

    public ekhg(int i) {
        this.b = false;
        this.c = false;
        this.a = new eknt(i);
    }
}
