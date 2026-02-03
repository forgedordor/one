package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ibk implements htz, fcyf {
    public static final ibj a = new ibj();
    public final hmw b;

    public ibk(hmw hmwVar) {
        this.b = hmwVar;
    }

    @Override // defpackage.htz
    public final List a() {
        return this.b.U();
    }

    public final void b(Throwable th, final Object obj) {
        ibg.a(th, new fdae() { // from class: ibi
            @Override // defpackage.fdae
            public final Object invoke() {
                ibq ibqVar;
                List list;
                hmw hmwVar = this.a.b;
                if (!hmwVar.q) {
                    return fcvo.a;
                }
                final Object obj2 = obj;
                hra hraVar = hmwVar.c;
                fdap fdapVar = new fdap() { // from class: hmo
                    @Override // defpackage.fdap
                    public final Object invoke(Object obj3) {
                        Object obj4 = obj2;
                        boolean z = true;
                        if (obj3 != obj4) {
                            hqu hquVar = obj3 instanceof hqu ? (hqu) obj3 : null;
                            if ((hquVar != null ? hquVar.a : null) != obj4) {
                                z = false;
                            }
                        }
                        return Boolean.valueOf(z);
                    }
                };
                hqz hqzVarC = hraVar.c();
                try {
                    fdcg fdcgVar = new fdcg();
                    loop0: while (true) {
                        int i = fdcgVar.a;
                        ibqVar = null;
                        if (i >= hraVar.b) {
                            break;
                        }
                        if (hqzVarC.B(i) && ((Boolean) fdapVar.invoke(hqzVarC.o(fdcgVar.a))).booleanValue()) {
                            ibq ibqVar2 = new ibq(fdcgVar.a, null);
                            hqzVarC.r();
                            ibqVar = ibqVar2;
                            break;
                        }
                        int i2 = fdcgVar.a;
                        int[] iArr = hqzVarC.b;
                        int iE = hrc.e(iArr, i2);
                        int i3 = i2 + 1;
                        int i4 = (i3 < hqzVarC.c ? iArr[(i3 * 5) + 4] : hqzVarC.d) - iE;
                        for (int i5 = 0; i5 < i4; i5++) {
                            if (((Boolean) fdapVar.invoke(hqzVarC.l(fdcgVar.a, i5))).booleanValue()) {
                                ibqVar = new ibq(fdcgVar.a, Integer.valueOf(i5));
                                break loop0;
                            }
                        }
                        fdcgVar.a++;
                    }
                    if (ibqVar == null) {
                        return fcvo.a;
                    }
                    boolean z = hmwVar.q;
                    int i6 = ibqVar.a;
                    Integer num = ibqVar.b;
                    if (z) {
                        hqzVarC = hraVar.c();
                        try {
                            List listB = ibe.b(hqzVarC, i6, num);
                            hqzVarC.r();
                            list = listB;
                        } finally {
                        }
                    } else {
                        list = fcvo.a;
                    }
                    return fcva.ah(list, hmwVar.U());
                } finally {
                }
            }
        });
    }

    @Override // defpackage.fcyh
    public final <R> R fold(R r, fdat<? super R, ? super fcyf, ? extends R> fdatVar) {
        return (R) fcye.a(this, r, fdatVar);
    }

    @Override // defpackage.fcyf, defpackage.fcyh
    public final <E extends fcyf> E get(fcyg<E> fcygVar) {
        return (E) fcye.b(this, fcygVar);
    }

    @Override // defpackage.fcyf
    public final fcyg<?> getKey() {
        return a;
    }

    @Override // defpackage.fcyh
    public final fcyh minusKey(fcyg<?> fcygVar) {
        return fcye.c(this, fcygVar);
    }

    @Override // defpackage.fcyh
    public final fcyh plus(fcyh fcyhVar) {
        return fcye.d(this, fcyhVar);
    }
}
