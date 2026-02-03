package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hya implements hqt {
    public hyr a;
    public hyk b;
    public String c;
    public Object d;
    public Object[] e;
    public hyl f;
    private final fdae g = new fdae() { // from class: hxz
        @Override // defpackage.fdae
        public final Object invoke() {
            hya hyaVar = this.a;
            hyr hyrVar = hyaVar.a;
            Object obj = hyaVar.d;
            if (obj != null) {
                return hyrVar.b(hyaVar, obj);
            }
            throw new IllegalArgumentException("Value should be initialized");
        }
    };

    public hya(hyr hyrVar, hyk hykVar, String str, Object obj, Object[] objArr) {
        this.a = hyrVar;
        this.b = hykVar;
        this.c = str;
        this.d = obj;
        this.e = objArr;
    }

    public final void a() {
        String strC;
        hyk hykVar = this.b;
        if (this.f != null) {
            throw new IllegalArgumentException("entry(" + this.f + ") is not null");
        }
        if (hykVar != null) {
            fdae fdaeVar = this.g;
            Object objInvoke = fdaeVar.invoke();
            if (objInvoke == null || hykVar.d(objInvoke)) {
                this.f = hykVar.e(this.c, fdaeVar);
                return;
            }
            if (objInvoke instanceof hzy) {
                hzy hzyVar = (hzy) objInvoke;
                if (hzyVar.f() == hpb.a || hzyVar.f() == hsi.a || hzyVar.f() == hqr.a) {
                    strC = "MutableState containing " + hzyVar.a() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    strC = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                strC = hxy.c(objInvoke);
            }
            throw new IllegalArgumentException(strC);
        }
    }

    @Override // defpackage.hqt
    public final void g() {
        hyl hylVar = this.f;
        if (hylVar != null) {
            hylVar.a();
        }
    }

    @Override // defpackage.hqt
    public final void h() {
        hyl hylVar = this.f;
        if (hylVar != null) {
            hylVar.a();
        }
    }

    @Override // defpackage.hqt
    public final void i() {
        a();
    }
}
