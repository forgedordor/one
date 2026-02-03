package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hma implements hoq {
    public final Object a;
    public final hwu b;
    public cuu c;
    public cuu d;
    private final fdae f;
    private Throwable g;

    public hma() {
        this(null);
    }

    @Override // defpackage.hoq
    public final Object a(fdap fdapVar, fcxy fcxyVar) {
        int i;
        int i2;
        fdae fdaeVar;
        int i3;
        fdiu fdiuVar = new fdiu(fcym.c(fcxyVar), 1);
        fdiuVar.B();
        hly hlyVar = new hly(fdapVar, fdiuVar);
        fdcg fdcgVar = new fdcg();
        fdcgVar.a = -1;
        synchronized (this.a) {
            Throwable th = this.g;
            if (th != null) {
                fdiuVar.w(fctl.a(th));
            } else {
                hwu hwuVar = this.b;
                do {
                    i = hwuVar.get();
                    i2 = i + 1;
                } while (!hwuVar.compareAndSet(i, i2));
                int i4 = 134217727 & i2;
                fdcgVar.a = (i2 >>> 27) & 15;
                this.c.h(hlyVar);
                fdiuVar.d(new hlz(hlyVar, this, fdcgVar));
                if (i4 == 1 && (fdaeVar = this.f) != null) {
                    try {
                        fdaeVar.invoke();
                    } catch (Throwable th2) {
                        synchronized (this.a) {
                            if (this.g == null) {
                                this.g = th2;
                                cuu cuuVar = this.c;
                                Object[] objArr = cuuVar.b;
                                int i5 = cuuVar.c;
                                for (int i6 = 0; i6 < i5; i6++) {
                                    fdis fdisVar = ((hly) objArr[i6]).b;
                                    if (fdisVar != null) {
                                        fdisVar.w(fctl.a(th2));
                                    }
                                }
                                this.c.c();
                                hwu hwuVar2 = this.b;
                                do {
                                    i3 = hwuVar2.get();
                                } while (!hwuVar2.compareAndSet(i3, hlx.a(((i3 >>> 27) & 15) + 1)));
                            }
                        }
                    }
                }
            }
        }
        return fdiuVar.m();
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
    public final /* synthetic */ fcyg getKey() {
        return hoq.e;
    }

    @Override // defpackage.fcyh
    public final fcyh minusKey(fcyg<?> fcygVar) {
        return fcye.c(this, fcygVar);
    }

    @Override // defpackage.fcyh
    public final fcyh plus(fcyh fcyhVar) {
        return fcye.d(this, fcyhVar);
    }

    public hma(fdae fdaeVar) {
        this.f = fdaeVar;
        this.a = new Object();
        this.b = new hwu();
        this.c = new cuu((byte[]) null);
        this.d = new cuu((byte[]) null);
    }
}
