package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class owi {
    public static final int a(owg owgVar, owf owfVar, owg owgVar2, int i) {
        int iA;
        owgVar.getClass();
        owfVar.getClass();
        owgVar2.getClass();
        if (!owfVar.b) {
            return fddu.h(i, fddu.r(0, owgVar2.f()));
        }
        int iE = i - owgVar.e();
        int iA2 = owgVar.a();
        if (iE >= 0 && iE < iA2) {
            for (int i2 = 0; i2 < 30; i2++) {
                int i3 = ((i2 / 2) * (i2 % 2 == 1 ? -1 : 1)) + iE;
                if (i3 >= 0 && i3 < owgVar.a() && (iA = owfVar.a.a(i3)) != -1) {
                    return iA + owgVar2.e();
                }
            }
        }
        return fddu.h(i, fddu.r(0, owgVar2.f()));
    }

    public static final owf b(owg owgVar, owg owgVar2, mr mrVar) {
        owgVar.getClass();
        owgVar2.getClass();
        mq mqVarA = mv.a(new owh(owgVar, owgVar2, mrVar, owgVar.a(), owgVar2.a()));
        boolean z = false;
        fcvy it = fddu.r(0, owgVar.a()).iterator();
        while (true) {
            if (!((fddp) it).a) {
                break;
            }
            if (mqVarA.a(it.a()) != -1) {
                z = true;
                break;
            }
        }
        return new owf(mqVarA, z);
    }

    public static final void c(owg owgVar, mw mwVar, owg owgVar2, owf owfVar) {
        owgVar.getClass();
        mwVar.getClass();
        owgVar2.getClass();
        owfVar.getClass();
        if (!owfVar.b) {
            int iMax = Math.max(owgVar.e(), owgVar2.e());
            int iMin = Math.min(owgVar.e() + owgVar.a(), owgVar2.e() + owgVar2.a());
            int i = iMin - iMax;
            if (i > 0) {
                mwVar.d(iMax, i);
                mwVar.b(iMax, i);
            }
            int iMin2 = Math.min(iMax, iMin);
            int iMax2 = Math.max(iMax, iMin);
            ops.a(mwVar, iMin2, iMax2, fddu.g(owgVar.e(), owgVar2.f()), fddu.g(owgVar.e() + owgVar.a(), owgVar2.f()), opr.a);
            ops.a(mwVar, iMin2, iMax2, fddu.g(owgVar2.e(), owgVar.f()), fddu.g(owgVar2.e() + owgVar2.a(), owgVar.f()), opr.b);
            int iF = owgVar2.f() - owgVar.f();
            if (iF > 0) {
                mwVar.b(owgVar.f(), iF);
                return;
            } else {
                if (iF < 0) {
                    mwVar.d(owgVar.f() + iF, -iF);
                    return;
                }
                return;
            }
        }
        osa osaVar = new osa(owgVar, owgVar2, mwVar);
        owfVar.a.b(osaVar);
        owg owgVar3 = osaVar.a;
        int iMin3 = Math.min(owgVar3.e(), osaVar.d);
        owg owgVar4 = osaVar.b;
        int iE = owgVar4.e() - osaVar.d;
        if (iE > 0) {
            if (iMin3 > 0) {
                osaVar.c.a(0, iMin3, opr.c);
            }
            osaVar.c.b(0, iE);
        } else if (iE < 0) {
            mw mwVar2 = osaVar.c;
            mwVar2.d(0, -iE);
            int i2 = iMin3 + iE;
            if (i2 > 0) {
                mwVar2.a(0, i2, opr.c);
            }
        }
        osaVar.d = owgVar4.e();
        int iMin4 = Math.min(owgVar3.d(), osaVar.e);
        int iD = owgVar4.d();
        int i3 = osaVar.e;
        int i4 = iD - i3;
        int i5 = osaVar.d + osaVar.f + i3;
        int i6 = i5 - iMin4;
        int iF2 = owgVar3.f() - iMin4;
        if (i4 > 0) {
            osaVar.c.b(i5, i4);
        } else if (i4 < 0) {
            osaVar.c.d(i5 + i4, -i4);
            iMin4 += i4;
        }
        if (iMin4 > 0 && i6 != iF2) {
            osaVar.c.a(i6, iMin4, opr.c);
        }
        osaVar.e = owgVar4.d();
    }
}
