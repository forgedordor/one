package defpackage;

import androidx.car.app.model.Alert;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evra implements evut {
    public final evqz a;
    public int b;
    public int c = 0;
    private int d;

    private evra(evqz evqzVar) {
        evth.e(evqzVar, "input");
        this.a = evqzVar;
        evqzVar.f = this;
    }

    private final void Q(Object obj, evuz evuzVar, evrr evrrVar) {
        int i = this.d;
        this.d = evwj.c(evwj.a(this.b), 4);
        try {
            evuzVar.i(obj, this, evrrVar);
            if (this.b == this.d) {
            } else {
                throw new evtj("Failed to parse the message.");
            }
        } finally {
            this.d = i;
        }
    }

    private final void R(Object obj, evuz evuzVar, evrr evrrVar) throws evtj {
        evqz evqzVar = this.a;
        int iN = evqzVar.n();
        evqzVar.O();
        int iE = evqzVar.e(iN);
        evqzVar.b++;
        evuzVar.i(obj, this, evrrVar);
        evqzVar.z(0);
        evqzVar.b--;
        evqzVar.A(iE);
    }

    private final void S(int i) throws evtj {
        if (this.a.d() != i) {
            throw new evtj("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final void T(int i) throws evtj {
        if ((i & 3) != 0) {
            throw new evtj("Failed to parse the message.");
        }
    }

    private static final void U(int i) throws evtj {
        if ((i & 7) != 0) {
            throw new evtj("Failed to parse the message.");
        }
    }

    public static evra p(evqz evqzVar) {
        evra evraVar = evqzVar.f;
        return evraVar != null ? evraVar : new evra(evqzVar);
    }

    @Override // defpackage.evut
    public final void A(List list) throws evtj {
        int iM;
        int iM2;
        if (list instanceof evsq) {
            evsq evsqVar = (evsq) list;
            int iB = evwj.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new evti();
                }
                evqz evqzVar = this.a;
                int iD = evqzVar.d() + evqzVar.n();
                do {
                    evsqVar.h(evqzVar.f());
                } while (evqzVar.d() < iD);
                S(iD);
                return;
            }
            do {
                evqz evqzVar2 = this.a;
                evsqVar.h(evqzVar2.f());
                if (evqzVar2.C()) {
                    return;
                } else {
                    iM2 = evqzVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = evwj.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new evti();
                }
                evqz evqzVar3 = this.a;
                int iD2 = evqzVar3.d() + evqzVar3.n();
                do {
                    list.add(Integer.valueOf(evqzVar3.f()));
                } while (evqzVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                evqz evqzVar4 = this.a;
                list.add(Integer.valueOf(evqzVar4.f()));
                if (evqzVar4.C()) {
                    return;
                } else {
                    iM = evqzVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.evut
    public final void B(List list) throws evtj {
        int iM;
        int iM2;
        if (list instanceof evsq) {
            evsq evsqVar = (evsq) list;
            int iB = evwj.b(this.b);
            if (iB == 2) {
                evqz evqzVar = this.a;
                int iN = evqzVar.n();
                T(iN);
                int iD = evqzVar.d() + iN;
                do {
                    evsqVar.h(evqzVar.g());
                } while (evqzVar.d() < iD);
                return;
            }
            if (iB != 5) {
                throw new evti();
            }
            do {
                evqz evqzVar2 = this.a;
                evsqVar.h(evqzVar2.g());
                if (evqzVar2.C()) {
                    return;
                } else {
                    iM2 = evqzVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = evwj.b(this.b);
            if (iB2 == 2) {
                evqz evqzVar3 = this.a;
                int iN2 = evqzVar3.n();
                T(iN2);
                int iD2 = evqzVar3.d() + iN2;
                do {
                    list.add(Integer.valueOf(evqzVar3.g()));
                } while (evqzVar3.d() < iD2);
                return;
            }
            if (iB2 != 5) {
                throw new evti();
            }
            do {
                evqz evqzVar4 = this.a;
                list.add(Integer.valueOf(evqzVar4.g()));
                if (evqzVar4.C()) {
                    return;
                } else {
                    iM = evqzVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.evut
    public final void C(List list) throws evtj {
        int iM;
        int iM2;
        if (list instanceof evtv) {
            evtv evtvVar = (evtv) list;
            int iB = evwj.b(this.b);
            if (iB != 1) {
                if (iB != 2) {
                    throw new evti();
                }
                evqz evqzVar = this.a;
                int iN = evqzVar.n();
                U(iN);
                int iD = evqzVar.d() + iN;
                do {
                    evtvVar.g(evqzVar.o());
                } while (evqzVar.d() < iD);
                return;
            }
            do {
                evqz evqzVar2 = this.a;
                evtvVar.g(evqzVar2.o());
                if (evqzVar2.C()) {
                    return;
                } else {
                    iM2 = evqzVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = evwj.b(this.b);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new evti();
                }
                evqz evqzVar3 = this.a;
                int iN2 = evqzVar3.n();
                U(iN2);
                int iD2 = evqzVar3.d() + iN2;
                do {
                    list.add(Long.valueOf(evqzVar3.o()));
                } while (evqzVar3.d() < iD2);
                return;
            }
            do {
                evqz evqzVar4 = this.a;
                list.add(Long.valueOf(evqzVar4.o()));
                if (evqzVar4.C()) {
                    return;
                } else {
                    iM = evqzVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.evut
    public final void D(List list) throws evtj {
        int iM;
        int iM2;
        if (list instanceof evsa) {
            evsa evsaVar = (evsa) list;
            int iB = evwj.b(this.b);
            if (iB == 2) {
                evqz evqzVar = this.a;
                int iN = evqzVar.n();
                T(iN);
                int iD = evqzVar.d() + iN;
                do {
                    evsaVar.h(evqzVar.c());
                } while (evqzVar.d() < iD);
                return;
            }
            if (iB != 5) {
                throw new evti();
            }
            do {
                evqz evqzVar2 = this.a;
                evsaVar.h(evqzVar2.c());
                if (evqzVar2.C()) {
                    return;
                } else {
                    iM2 = evqzVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = evwj.b(this.b);
            if (iB2 == 2) {
                evqz evqzVar3 = this.a;
                int iN2 = evqzVar3.n();
                T(iN2);
                int iD2 = evqzVar3.d() + iN2;
                do {
                    list.add(Float.valueOf(evqzVar3.c()));
                } while (evqzVar3.d() < iD2);
                return;
            }
            if (iB2 != 5) {
                throw new evti();
            }
            do {
                evqz evqzVar4 = this.a;
                list.add(Float.valueOf(evqzVar4.c()));
                if (evqzVar4.C()) {
                    return;
                } else {
                    iM = evqzVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.evut
    public final void E(List list) throws evtj {
        int iM;
        int iM2;
        if (list instanceof evsq) {
            evsq evsqVar = (evsq) list;
            int iB = evwj.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new evti();
                }
                evqz evqzVar = this.a;
                int iD = evqzVar.d() + evqzVar.n();
                do {
                    evsqVar.h(evqzVar.h());
                } while (evqzVar.d() < iD);
                S(iD);
                return;
            }
            do {
                evqz evqzVar2 = this.a;
                evsqVar.h(evqzVar2.h());
                if (evqzVar2.C()) {
                    return;
                } else {
                    iM2 = evqzVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = evwj.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new evti();
                }
                evqz evqzVar3 = this.a;
                int iD2 = evqzVar3.d() + evqzVar3.n();
                do {
                    list.add(Integer.valueOf(evqzVar3.h()));
                } while (evqzVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                evqz evqzVar4 = this.a;
                list.add(Integer.valueOf(evqzVar4.h()));
                if (evqzVar4.C()) {
                    return;
                } else {
                    iM = evqzVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.evut
    public final void F(List list) throws evtj {
        int iM;
        int iM2;
        if (list instanceof evtv) {
            evtv evtvVar = (evtv) list;
            int iB = evwj.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new evti();
                }
                evqz evqzVar = this.a;
                int iD = evqzVar.d() + evqzVar.n();
                do {
                    evtvVar.g(evqzVar.p());
                } while (evqzVar.d() < iD);
                S(iD);
                return;
            }
            do {
                evqz evqzVar2 = this.a;
                evtvVar.g(evqzVar2.p());
                if (evqzVar2.C()) {
                    return;
                } else {
                    iM2 = evqzVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = evwj.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new evti();
                }
                evqz evqzVar3 = this.a;
                int iD2 = evqzVar3.d() + evqzVar3.n();
                do {
                    list.add(Long.valueOf(evqzVar3.p()));
                } while (evqzVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                evqz evqzVar4 = this.a;
                list.add(Long.valueOf(evqzVar4.p()));
                if (evqzVar4.C()) {
                    return;
                } else {
                    iM = evqzVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.evut
    public final void G(List list) throws evtj {
        int iM;
        int iM2;
        if (list instanceof evsq) {
            evsq evsqVar = (evsq) list;
            int iB = evwj.b(this.b);
            if (iB == 2) {
                evqz evqzVar = this.a;
                int iN = evqzVar.n();
                T(iN);
                int iD = evqzVar.d() + iN;
                do {
                    evsqVar.h(evqzVar.k());
                } while (evqzVar.d() < iD);
                return;
            }
            if (iB != 5) {
                throw new evti();
            }
            do {
                evqz evqzVar2 = this.a;
                evsqVar.h(evqzVar2.k());
                if (evqzVar2.C()) {
                    return;
                } else {
                    iM2 = evqzVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = evwj.b(this.b);
            if (iB2 == 2) {
                evqz evqzVar3 = this.a;
                int iN2 = evqzVar3.n();
                T(iN2);
                int iD2 = evqzVar3.d() + iN2;
                do {
                    list.add(Integer.valueOf(evqzVar3.k()));
                } while (evqzVar3.d() < iD2);
                return;
            }
            if (iB2 != 5) {
                throw new evti();
            }
            do {
                evqz evqzVar4 = this.a;
                list.add(Integer.valueOf(evqzVar4.k()));
                if (evqzVar4.C()) {
                    return;
                } else {
                    iM = evqzVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.evut
    public final void H(List list) throws evtj {
        int iM;
        int iM2;
        if (list instanceof evtv) {
            evtv evtvVar = (evtv) list;
            int iB = evwj.b(this.b);
            if (iB != 1) {
                if (iB != 2) {
                    throw new evti();
                }
                evqz evqzVar = this.a;
                int iN = evqzVar.n();
                U(iN);
                int iD = evqzVar.d() + iN;
                do {
                    evtvVar.g(evqzVar.t());
                } while (evqzVar.d() < iD);
                return;
            }
            do {
                evqz evqzVar2 = this.a;
                evtvVar.g(evqzVar2.t());
                if (evqzVar2.C()) {
                    return;
                } else {
                    iM2 = evqzVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = evwj.b(this.b);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new evti();
                }
                evqz evqzVar3 = this.a;
                int iN2 = evqzVar3.n();
                U(iN2);
                int iD2 = evqzVar3.d() + iN2;
                do {
                    list.add(Long.valueOf(evqzVar3.t()));
                } while (evqzVar3.d() < iD2);
                return;
            }
            do {
                evqz evqzVar4 = this.a;
                list.add(Long.valueOf(evqzVar4.t()));
                if (evqzVar4.C()) {
                    return;
                } else {
                    iM = evqzVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.evut
    public final void I(List list) throws evtj {
        int iM;
        int iM2;
        if (list instanceof evsq) {
            evsq evsqVar = (evsq) list;
            int iB = evwj.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new evti();
                }
                evqz evqzVar = this.a;
                int iD = evqzVar.d() + evqzVar.n();
                do {
                    evsqVar.h(evqzVar.l());
                } while (evqzVar.d() < iD);
                S(iD);
                return;
            }
            do {
                evqz evqzVar2 = this.a;
                evsqVar.h(evqzVar2.l());
                if (evqzVar2.C()) {
                    return;
                } else {
                    iM2 = evqzVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = evwj.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new evti();
                }
                evqz evqzVar3 = this.a;
                int iD2 = evqzVar3.d() + evqzVar3.n();
                do {
                    list.add(Integer.valueOf(evqzVar3.l()));
                } while (evqzVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                evqz evqzVar4 = this.a;
                list.add(Integer.valueOf(evqzVar4.l()));
                if (evqzVar4.C()) {
                    return;
                } else {
                    iM = evqzVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.evut
    public final void J(List list) throws evtj {
        int iM;
        int iM2;
        if (list instanceof evtv) {
            evtv evtvVar = (evtv) list;
            int iB = evwj.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new evti();
                }
                evqz evqzVar = this.a;
                int iD = evqzVar.d() + evqzVar.n();
                do {
                    evtvVar.g(evqzVar.u());
                } while (evqzVar.d() < iD);
                S(iD);
                return;
            }
            do {
                evqz evqzVar2 = this.a;
                evtvVar.g(evqzVar2.u());
                if (evqzVar2.C()) {
                    return;
                } else {
                    iM2 = evqzVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = evwj.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new evti();
                }
                evqz evqzVar3 = this.a;
                int iD2 = evqzVar3.d() + evqzVar3.n();
                do {
                    list.add(Long.valueOf(evqzVar3.u()));
                } while (evqzVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                evqz evqzVar4 = this.a;
                list.add(Long.valueOf(evqzVar4.u()));
                if (evqzVar4.C()) {
                    return;
                } else {
                    iM = evqzVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void K(List list, boolean z) throws evti {
        int iM;
        int iM2;
        if (evwj.b(this.b) != 2) {
            throw new evti();
        }
        if ((list instanceof evtq) && !z) {
            evtq evtqVar = (evtq) list;
            do {
                o();
                evtqVar.b();
                evqz evqzVar = this.a;
                if (evqzVar.C()) {
                    return;
                } else {
                    iM2 = evqzVar.m();
                }
            } while (iM2 == this.b);
        } else {
            do {
                list.add(z ? v() : u());
                evqz evqzVar2 = this.a;
                if (evqzVar2.C()) {
                    return;
                } else {
                    iM = evqzVar2.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.evut
    public final void L(List list) throws evtj {
        int iM;
        int iM2;
        if (list instanceof evsq) {
            evsq evsqVar = (evsq) list;
            int iB = evwj.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new evti();
                }
                evqz evqzVar = this.a;
                int iD = evqzVar.d() + evqzVar.n();
                do {
                    evsqVar.h(evqzVar.n());
                } while (evqzVar.d() < iD);
                S(iD);
                return;
            }
            do {
                evqz evqzVar2 = this.a;
                evsqVar.h(evqzVar2.n());
                if (evqzVar2.C()) {
                    return;
                } else {
                    iM2 = evqzVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = evwj.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new evti();
                }
                evqz evqzVar3 = this.a;
                int iD2 = evqzVar3.d() + evqzVar3.n();
                do {
                    list.add(Integer.valueOf(evqzVar3.n()));
                } while (evqzVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                evqz evqzVar4 = this.a;
                list.add(Integer.valueOf(evqzVar4.n()));
                if (evqzVar4.C()) {
                    return;
                } else {
                    iM = evqzVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.evut
    public final void M(List list) throws evtj {
        int iM;
        int iM2;
        if (list instanceof evtv) {
            evtv evtvVar = (evtv) list;
            int iB = evwj.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new evti();
                }
                evqz evqzVar = this.a;
                int iD = evqzVar.d() + evqzVar.n();
                do {
                    evtvVar.g(evqzVar.v());
                } while (evqzVar.d() < iD);
                S(iD);
                return;
            }
            do {
                evqz evqzVar2 = this.a;
                evtvVar.g(evqzVar2.v());
                if (evqzVar2.C()) {
                    return;
                } else {
                    iM2 = evqzVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = evwj.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new evti();
                }
                evqz evqzVar3 = this.a;
                int iD2 = evqzVar3.d() + evqzVar3.n();
                do {
                    list.add(Long.valueOf(evqzVar3.v()));
                } while (evqzVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                evqz evqzVar4 = this.a;
                list.add(Long.valueOf(evqzVar4.v()));
                if (evqzVar4.C()) {
                    return;
                } else {
                    iM = evqzVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    public final void N(int i) throws evti {
        if (evwj.b(this.b) != i) {
            throw new evti();
        }
    }

    @Override // defpackage.evut
    public final boolean O() throws evti {
        N(0);
        return this.a.D();
    }

    @Override // defpackage.evut
    public final boolean P() {
        int i;
        evqz evqzVar = this.a;
        if (evqzVar.C() || (i = this.b) == this.d) {
            return false;
        }
        return evqzVar.E(i);
    }

    @Override // defpackage.evut
    public final double a() throws evti {
        N(1);
        return this.a.b();
    }

    @Override // defpackage.evut
    public final float b() throws evti {
        N(5);
        return this.a.c();
    }

    @Override // defpackage.evut
    public final int c() {
        int iM = this.c;
        if (iM != 0) {
            this.b = iM;
            this.c = 0;
        } else {
            iM = this.a.m();
            this.b = iM;
        }
        return (iM == 0 || iM == this.d) ? Alert.DURATION_SHOW_INDEFINITELY : evwj.a(iM);
    }

    @Override // defpackage.evut
    public final int d() throws evti {
        N(0);
        return this.a.f();
    }

    @Override // defpackage.evut
    public final int e() throws evti {
        N(5);
        return this.a.g();
    }

    @Override // defpackage.evut
    public final int f() throws evti {
        N(0);
        return this.a.h();
    }

    @Override // defpackage.evut
    public final int g() throws evti {
        N(5);
        return this.a.k();
    }

    @Override // defpackage.evut
    public final int h() throws evti {
        N(0);
        return this.a.l();
    }

    @Override // defpackage.evut
    public final int i() throws evti {
        N(0);
        return this.a.n();
    }

    @Override // defpackage.evut
    public final long j() throws evti {
        N(1);
        return this.a.o();
    }

    @Override // defpackage.evut
    public final long k() throws evti {
        N(0);
        return this.a.p();
    }

    @Override // defpackage.evut
    public final long l() throws evti {
        N(1);
        return this.a.t();
    }

    @Override // defpackage.evut
    public final long m() throws evti {
        N(0);
        return this.a.u();
    }

    @Override // defpackage.evut
    public final long n() throws evti {
        N(0);
        return this.a.v();
    }

    @Override // defpackage.evut
    public final evqs o() throws evti {
        N(2);
        return this.a.w();
    }

    public final Object q(evwh evwhVar, Class cls, evrr evrrVar) {
        evwh evwhVar2 = evwh.DOUBLE;
        switch (evwhVar) {
            case DOUBLE:
                return Double.valueOf(a());
            case FLOAT:
                return Float.valueOf(b());
            case INT64:
                return Long.valueOf(k());
            case UINT64:
                return Long.valueOf(n());
            case INT32:
                return Integer.valueOf(f());
            case FIXED64:
                return Long.valueOf(j());
            case FIXED32:
                return Integer.valueOf(e());
            case BOOL:
                return Boolean.valueOf(O());
            case STRING:
                return v();
            case GROUP:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case MESSAGE:
                return t(cls, evrrVar);
            case BYTES:
                return o();
            case UINT32:
                return Integer.valueOf(i());
            case ENUM:
                return Integer.valueOf(d());
            case SFIXED32:
                return Integer.valueOf(g());
            case SFIXED64:
                return Long.valueOf(l());
            case SINT32:
                return Integer.valueOf(h());
            case SINT64:
                return Long.valueOf(m());
        }
    }

    public final Object r(evuz evuzVar, evrr evrrVar) {
        Object objE = evuzVar.e();
        Q(objE, evuzVar, evrrVar);
        evuzVar.g(objE);
        return objE;
    }

    public final Object s(evuz evuzVar, evrr evrrVar) throws evtj {
        Object objE = evuzVar.e();
        R(objE, evuzVar, evrrVar);
        evuzVar.g(objE);
        return objE;
    }

    @Override // defpackage.evut
    public final Object t(Class cls, evrr evrrVar) throws evti {
        N(2);
        return s(evuq.a.a(cls), evrrVar);
    }

    @Override // defpackage.evut
    public final String u() throws evti {
        N(2);
        return this.a.x();
    }

    @Override // defpackage.evut
    public final String v() throws evti {
        N(2);
        return this.a.y();
    }

    @Override // defpackage.evut
    public final void w(Object obj, evuz evuzVar, evrr evrrVar) throws evti {
        N(3);
        Q(obj, evuzVar, evrrVar);
    }

    @Override // defpackage.evut
    public final void x(Object obj, evuz evuzVar, evrr evrrVar) throws evtj {
        N(2);
        R(obj, evuzVar, evrrVar);
    }

    @Override // defpackage.evut
    public final void y(List list) throws evtj {
        int iM;
        int iM2;
        if (list instanceof evqi) {
            evqi evqiVar = (evqi) list;
            int iB = evwj.b(this.b);
            if (iB != 0) {
                if (iB != 2) {
                    throw new evti();
                }
                evqz evqzVar = this.a;
                int iD = evqzVar.d() + evqzVar.n();
                do {
                    evqiVar.f(evqzVar.D());
                } while (evqzVar.d() < iD);
                S(iD);
                return;
            }
            do {
                evqz evqzVar2 = this.a;
                evqiVar.f(evqzVar2.D());
                if (evqzVar2.C()) {
                    return;
                } else {
                    iM2 = evqzVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = evwj.b(this.b);
            if (iB2 != 0) {
                if (iB2 != 2) {
                    throw new evti();
                }
                evqz evqzVar3 = this.a;
                int iD2 = evqzVar3.d() + evqzVar3.n();
                do {
                    list.add(Boolean.valueOf(evqzVar3.D()));
                } while (evqzVar3.d() < iD2);
                S(iD2);
                return;
            }
            do {
                evqz evqzVar4 = this.a;
                list.add(Boolean.valueOf(evqzVar4.D()));
                if (evqzVar4.C()) {
                    return;
                } else {
                    iM = evqzVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }

    @Override // defpackage.evut
    public final void z(List list) throws evtj {
        int iM;
        int iM2;
        if (list instanceof evrh) {
            evrh evrhVar = (evrh) list;
            int iB = evwj.b(this.b);
            if (iB != 1) {
                if (iB != 2) {
                    throw new evti();
                }
                evqz evqzVar = this.a;
                int iN = evqzVar.n();
                U(iN);
                int iD = evqzVar.d() + iN;
                do {
                    evrhVar.h(evqzVar.b());
                } while (evqzVar.d() < iD);
                return;
            }
            do {
                evqz evqzVar2 = this.a;
                evrhVar.h(evqzVar2.b());
                if (evqzVar2.C()) {
                    return;
                } else {
                    iM2 = evqzVar2.m();
                }
            } while (iM2 == this.b);
        } else {
            int iB2 = evwj.b(this.b);
            if (iB2 != 1) {
                if (iB2 != 2) {
                    throw new evti();
                }
                evqz evqzVar3 = this.a;
                int iN2 = evqzVar3.n();
                U(iN2);
                int iD2 = evqzVar3.d() + iN2;
                do {
                    list.add(Double.valueOf(evqzVar3.b()));
                } while (evqzVar3.d() < iD2);
                return;
            }
            do {
                evqz evqzVar4 = this.a;
                list.add(Double.valueOf(evqzVar4.b()));
                if (evqzVar4.C()) {
                    return;
                } else {
                    iM = evqzVar4.m();
                }
            } while (iM == this.b);
            iM2 = iM;
        }
        this.c = iM2;
    }
}
