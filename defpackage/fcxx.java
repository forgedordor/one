package defpackage;

import java.io.Serializable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fcxx implements Serializable, fcyh {
    private final fcyh a;
    private final fcyf b;

    public fcxx(fcyh fcyhVar, fcyf fcyfVar) {
        fcyhVar.getClass();
        this.a = fcyhVar;
        this.b = fcyfVar;
    }

    private final int a() {
        int i = 2;
        fcxx fcxxVar = this;
        while (true) {
            fcyh fcyhVar = fcxxVar.a;
            fcxxVar = fcyhVar instanceof fcxx ? (fcxx) fcyhVar : null;
            if (fcxxVar == null) {
                return i;
            }
            i++;
        }
    }

    private final boolean b(fcyf fcyfVar) {
        return fdbq.f(get(fcyfVar.getKey()), fcyfVar);
    }

    private final Object writeReplace() {
        int iA = a();
        final fcyh[] fcyhVarArr = new fcyh[iA];
        final fdcg fdcgVar = new fdcg();
        fold(fctx.a, new fdat() { // from class: fcxu
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                fcyf fcyfVar = (fcyf) obj2;
                ((fctx) obj).getClass();
                fcyfVar.getClass();
                fdcg fdcgVar2 = fdcgVar;
                int i = fdcgVar2.a;
                fdcgVar2.a = i + 1;
                fcyhVarArr[i] = fcyfVar;
                return fctx.a;
            }
        });
        if (fdcgVar.a == iA) {
            return new fcxw(fcyhVarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fcxx) {
            fcxx fcxxVar = (fcxx) obj;
            if (fcxxVar.a() == a()) {
                fcxx fcxxVar2 = this;
                while (true) {
                    if (!fcxxVar.b(fcxxVar2.b)) {
                        break;
                    }
                    fcyh fcyhVar = fcxxVar2.a;
                    if (fcyhVar instanceof fcxx) {
                        fcxxVar2 = (fcxx) fcyhVar;
                    } else if (fcxxVar.b((fcyf) fcyhVar)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.fcyh
    public final <R> R fold(R r, fdat<? super R, ? super fcyf, ? extends R> fdatVar) {
        return (R) fdatVar.a(this.a.fold(r, fdatVar), this.b);
    }

    @Override // defpackage.fcyh
    public final <E extends fcyf> E get(fcyg<E> fcygVar) {
        fcygVar.getClass();
        fcxx fcxxVar = this;
        while (true) {
            E e = (E) fcxxVar.b.get(fcygVar);
            if (e != null) {
                return e;
            }
            fcyh fcyhVar = fcxxVar.a;
            if (!(fcyhVar instanceof fcxx)) {
                return (E) fcyhVar.get(fcygVar);
            }
            fcxxVar = (fcxx) fcyhVar;
        }
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b.hashCode();
    }

    @Override // defpackage.fcyh
    public final fcyh minusKey(fcyg<?> fcygVar) {
        fcygVar.getClass();
        fcyf fcyfVar = this.b;
        if (fcyfVar.get(fcygVar) != null) {
            return this.a;
        }
        fcyh fcyhVar = this.a;
        fcyh fcyhVarMinusKey = fcyhVar.minusKey(fcygVar);
        return fcyhVarMinusKey != fcyhVar ? fcyhVarMinusKey == fcyi.a ? fcyfVar : new fcxx(fcyhVarMinusKey, fcyfVar) : this;
    }

    @Override // defpackage.fcyh
    public final fcyh plus(fcyh fcyhVar) {
        return fcyd.a(this, fcyhVar);
    }

    public final String toString() {
        return "[" + fold("", new fdat() { // from class: fcxv
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                String str = (String) obj;
                fcyf fcyfVar = (fcyf) obj2;
                str.getClass();
                fcyfVar.getClass();
                if (str.length() == 0) {
                    return fcyfVar.toString();
                }
                return str + ", " + fcyfVar;
            }
        }) + "]";
    }
}
