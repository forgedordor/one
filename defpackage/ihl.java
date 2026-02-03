package defpackage;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihl {
    public static final Boolean a(FocusTargetNode focusTargetNode, int i, ihu ihuVar, fdap fdapVar) {
        int iOrdinal = focusTargetNode.f().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeB = ihf.b(focusTargetNode);
                if (focusTargetNodeB == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int iOrdinal2 = focusTargetNodeB.f().ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        Boolean boolA = a(focusTargetNodeB, i, ihuVar, fdapVar);
                        if (!fdbq.f(boolA, false)) {
                            return boolA;
                        }
                        if (ihuVar == null) {
                            if (focusTargetNodeB.f() != igx.b) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            FocusTargetNode focusTargetNodeA = ihf.a(focusTargetNodeB);
                            if (focusTargetNodeA == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            ihuVar = ihf.c(focusTargetNodeA);
                        }
                        return Boolean.valueOf(j(focusTargetNode, ihuVar, i, fdapVar));
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new fctg();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (ihuVar == null) {
                    ihuVar = ihf.c(focusTargetNodeB);
                }
                return Boolean.valueOf(j(focusTargetNode, ihuVar, i, fdapVar));
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return (Boolean) (((igo) focusTargetNode.e()).a ? fdapVar.invoke(focusTargetNode) : ihuVar == null ? Boolean.valueOf(b(focusTargetNode, i, fdapVar)) : Boolean.valueOf(d(focusTargetNode, ihuVar, i, fdapVar)));
                }
                throw new fctg();
            }
        }
        return Boolean.valueOf(b(focusTargetNode, i, fdapVar));
    }

    public static final boolean b(FocusTargetNode focusTargetNode, int i, fdap fdapVar) {
        ihu ihuVar;
        hum humVar = new hum(new FocusTargetNode[16]);
        g(focusTargetNode, humVar);
        int i2 = humVar.b;
        if (i2 <= 1) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) (i2 == 0 ? null : humVar.a[0]);
            if (focusTargetNode2 != null) {
                return ((Boolean) fdapVar.invoke(focusTargetNode2)).booleanValue();
            }
        } else {
            if (true == ifq.b(i, 7)) {
                i = 4;
            }
            if (ifq.b(i, 4) || ifq.b(i, 6)) {
                ihu ihuVarC = ihf.c(focusTargetNode);
                float f = ihuVarC.b;
                float f2 = ihuVarC.c;
                ihuVar = new ihu(f, f2, f, f2);
            } else {
                if (!ifq.b(i, 3) && !ifq.b(i, 5)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                ihu ihuVarC2 = ihf.c(focusTargetNode);
                float f3 = ihuVarC2.d;
                float f4 = ihuVarC2.e;
                ihuVar = new ihu(f3, f4, f3, f4);
            }
            FocusTargetNode focusTargetNodeF = f(humVar, ihuVar, i);
            if (focusTargetNodeF != null) {
                return ((Boolean) fdapVar.invoke(focusTargetNodeF)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean c(ihu ihuVar, ihu ihuVar2, ihu ihuVar3, int i) {
        if (!k(ihuVar, i, ihuVar3)) {
            return false;
        }
        if (k(ihuVar2, i, ihuVar3) && !h(ihuVar3, ihuVar, ihuVar2, i)) {
            return !h(ihuVar3, ihuVar2, ihuVar, i) && e(i, ihuVar3, ihuVar) < e(i, ihuVar3, ihuVar2);
        }
        return true;
    }

    public static final boolean d(FocusTargetNode focusTargetNode, ihu ihuVar, int i, fdap fdapVar) {
        FocusTargetNode focusTargetNodeF;
        hum humVar = new hum(new FocusTargetNode[16]);
        if (!focusTargetNode.s.C) {
            itw.d("visitChildren called on an unattached node");
        }
        hum humVar2 = new hum(new icr[16]);
        icr icrVar = focusTargetNode.s;
        icr icrVar2 = icrVar.w;
        if (icrVar2 == null) {
            jbg.j(humVar2, icrVar);
        } else {
            humVar2.n(icrVar2);
        }
        while (true) {
            int i2 = humVar2.b;
            if (i2 == 0) {
                break;
            }
            icr icrVarA = (icr) humVar2.c(i2 - 1);
            if ((icrVarA.u & 1024) == 0) {
                jbg.j(humVar2, icrVarA);
            } else {
                while (true) {
                    if (icrVarA == null) {
                        break;
                    }
                    if ((icrVarA.t & 1024) != 0) {
                        hum humVar3 = null;
                        while (icrVarA != null) {
                            if (icrVarA instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode2 = (FocusTargetNode) icrVarA;
                                if (focusTargetNode2.C) {
                                    humVar.n(focusTargetNode2);
                                }
                            } else if ((icrVarA.t & 1024) != 0 && (icrVarA instanceof jbi)) {
                                int i3 = 0;
                                for (icr icrVar3 = ((jbi) icrVarA).E; icrVar3 != null; icrVar3 = icrVar3.w) {
                                    if ((icrVar3.t & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            icrVarA = icrVar3;
                                        } else {
                                            if (humVar3 == null) {
                                                humVar3 = new hum(new icr[16]);
                                            }
                                            if (icrVarA != null) {
                                                humVar3.n(icrVarA);
                                            }
                                            humVar3.n(icrVar3);
                                            icrVarA = null;
                                        }
                                    }
                                }
                                if (i3 != 1) {
                                }
                            }
                            icrVarA = jbg.a(humVar3);
                        }
                    } else {
                        icrVarA = icrVarA.w;
                    }
                }
            }
        }
        while (humVar.b != 0 && (focusTargetNodeF = f(humVar, ihuVar, i)) != null) {
            if (((igo) focusTargetNodeF.e()).a) {
                return ((Boolean) fdapVar.invoke(focusTargetNodeF)).booleanValue();
            }
            if (j(focusTargetNodeF, ihuVar, i, fdapVar)) {
                return true;
            }
            humVar.m(focusTargetNodeF);
        }
        return false;
    }

    private static final long e(int i, ihu ihuVar, ihu ihuVar2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (ifq.b(i, 3)) {
            f = ihuVar.b;
            f2 = ihuVar2.d;
        } else if (ifq.b(i, 4)) {
            f = ihuVar2.b;
            f2 = ihuVar.d;
        } else if (ifq.b(i, 5)) {
            f = ihuVar.c;
            f2 = ihuVar2.e;
        } else {
            if (!ifq.b(i, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f = ihuVar2.c;
            f2 = ihuVar.e;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (ifq.b(i, 3) || ifq.b(i, 4)) {
            float f7 = ihuVar.c;
            f3 = f7 + ((ihuVar.e - f7) / 2.0f);
            f4 = ihuVar2.c;
            f5 = ihuVar2.e;
        } else {
            if (!ifq.b(i, 5) && !ifq.b(i, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f8 = ihuVar.b;
            f3 = f8 + ((ihuVar.d - f8) / 2.0f);
            f4 = ihuVar2.b;
            f5 = ihuVar2.d;
        }
        float f9 = f3 - (f4 + ((f5 - f4) / 2.0f));
        long j = (long) f6;
        long j2 = (long) f9;
        return (13 * j * j) + (j2 * j2);
    }

    private static final FocusTargetNode f(hum humVar, ihu ihuVar, int i) {
        ihu ihuVarE;
        if (ifq.b(i, 3)) {
            ihuVarE = ihuVar.e((ihuVar.d - ihuVar.b) + 1.0f, 0.0f);
        } else if (ifq.b(i, 4)) {
            ihuVarE = ihuVar.e(-((ihuVar.d - ihuVar.b) + 1.0f), 0.0f);
        } else if (ifq.b(i, 5)) {
            ihuVarE = ihuVar.e(0.0f, (ihuVar.e - ihuVar.c) + 1.0f);
        } else {
            if (!ifq.b(i, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            ihuVarE = ihuVar.e(0.0f, -((ihuVar.e - ihuVar.c) + 1.0f));
        }
        Object[] objArr = humVar.a;
        int i2 = humVar.b;
        FocusTargetNode focusTargetNode = null;
        for (int i3 = 0; i3 < i2; i3++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i3];
            if (ihf.d(focusTargetNode2)) {
                ihu ihuVarC = ihf.c(focusTargetNode2);
                if (c(ihuVarC, ihuVarE, ihuVar, i)) {
                    focusTargetNode = focusTargetNode2;
                    ihuVarE = ihuVarC;
                }
            }
        }
        return focusTargetNode;
    }

    private static final void g(jbf jbfVar, hum humVar) {
        icr icrVar = (icr) jbfVar;
        if (!icrVar.s.C) {
            itw.d("visitChildren called on an unattached node");
        }
        hum humVar2 = new hum(new icr[16]);
        icr icrVar2 = icrVar.s;
        icr icrVar3 = icrVar2.w;
        if (icrVar3 == null) {
            jbg.j(humVar2, icrVar2);
        } else {
            humVar2.n(icrVar3);
        }
        while (true) {
            int i = humVar2.b;
            if (i == 0) {
                return;
            }
            icr icrVarA = (icr) humVar2.c(i - 1);
            if ((icrVarA.u & 1024) == 0) {
                jbg.j(humVar2, icrVarA);
            } else {
                while (true) {
                    if (icrVarA == null) {
                        break;
                    }
                    if ((icrVarA.t & 1024) != 0) {
                        hum humVar3 = null;
                        while (icrVarA != null) {
                            if (icrVarA instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode = (FocusTargetNode) icrVarA;
                                if (focusTargetNode.C && !jbg.d(focusTargetNode).B) {
                                    if (((igo) focusTargetNode.e()).a) {
                                        humVar.n(focusTargetNode);
                                    } else {
                                        g(focusTargetNode, humVar);
                                    }
                                }
                            } else if ((icrVarA.t & 1024) != 0 && (icrVarA instanceof jbi)) {
                                int i2 = 0;
                                for (icr icrVar4 = ((jbi) icrVarA).E; icrVar4 != null; icrVar4 = icrVar4.w) {
                                    if ((icrVar4.t & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            icrVarA = icrVar4;
                                        } else {
                                            if (humVar3 == null) {
                                                humVar3 = new hum(new icr[16]);
                                            }
                                            if (icrVarA != null) {
                                                humVar3.n(icrVarA);
                                            }
                                            humVar3.n(icrVar4);
                                            icrVarA = null;
                                        }
                                    }
                                }
                                if (i2 != 1) {
                                }
                            }
                            icrVarA = jbg.a(humVar3);
                        }
                    } else {
                        icrVarA = icrVarA.w;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final boolean h(defpackage.ihu r9, defpackage.ihu r10, defpackage.ihu r11, int r12) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ihl.h(ihu, ihu, ihu, int):boolean");
    }

    private static final boolean i(ihu ihuVar, int i, ihu ihuVar2) {
        if (ifq.b(i, 3) || ifq.b(i, 4)) {
            return ihuVar.e > ihuVar2.c && ihuVar.c < ihuVar2.e;
        }
        if (ifq.b(i, 5) || ifq.b(i, 6)) {
            return ihuVar.d > ihuVar2.b && ihuVar.b < ihuVar2.d;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    private static final boolean j(FocusTargetNode focusTargetNode, ihu ihuVar, int i, fdap fdapVar) {
        if (d(focusTargetNode, ihuVar, i, fdapVar)) {
            return true;
        }
        ihc ihcVarA = ihb.a(focusTargetNode);
        int i2 = ihcVarA.a;
        Boolean bool = (Boolean) ifm.a(focusTargetNode, i, new ihk(ihcVarA, ((FocusOwnerImpl) ((AndroidComposeView) jbg.f(focusTargetNode)).i).h, focusTargetNode, ihuVar, i, fdapVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean k(ihu ihuVar, int i, ihu ihuVar2) {
        if (ifq.b(i, 3)) {
            float f = ihuVar2.d;
            float f2 = ihuVar.d;
            return (f > f2 || ihuVar2.b >= f2) && ihuVar2.b > ihuVar.b;
        }
        if (ifq.b(i, 4)) {
            float f3 = ihuVar2.b;
            float f4 = ihuVar.b;
            return (f3 < f4 || ihuVar2.d <= f4) && ihuVar2.d < ihuVar.d;
        }
        if (ifq.b(i, 5)) {
            float f5 = ihuVar2.e;
            float f6 = ihuVar.e;
            return (f5 > f6 || ihuVar2.c >= f6) && ihuVar2.c > ihuVar.c;
        }
        if (!ifq.b(i, 6)) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f7 = ihuVar2.c;
        float f8 = ihuVar.c;
        return (f7 < f8 || ihuVar2.e <= f8) && ihuVar2.e < ihuVar.e;
    }
}
