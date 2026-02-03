package defpackage;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihe {
    public static final boolean a(FocusTargetNode focusTargetNode) {
        hum humVar;
        jee jeeVar;
        jee jeeVar2;
        FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) ((AndroidComposeView) jbg.f(focusTargetNode)).i;
        FocusTargetNode focusTargetNode2 = focusOwnerImpl.h;
        igx igxVarF = focusTargetNode.f();
        if (focusTargetNode2 == focusTargetNode) {
            focusTargetNode.i(igxVarF, igxVarF);
            return true;
        }
        int i = 0;
        hum humVar2 = null;
        if (focusTargetNode2 == null && !((Boolean) ((FocusOwnerImpl) ((AndroidComposeView) jbg.f(focusTargetNode)).i).a.a(null, null)).booleanValue()) {
            return false;
        }
        if (focusTargetNode2 != null) {
            humVar = new hum(new FocusTargetNode[16]);
            if (!focusTargetNode2.s.C) {
                itw.d("visitAncestors called on an unattached node");
            }
            icr icrVar = focusTargetNode2.s.v;
            jcr jcrVarD = jbg.d(focusTargetNode2);
            while (jcrVarD != null) {
                if ((jcrVarD.v.f.u & 1024) != 0) {
                    while (icrVar != null) {
                        if ((icrVar.t & 1024) != 0) {
                            hum humVar3 = humVar2;
                            icr icrVarA = icrVar;
                            while (icrVarA != null) {
                                if (icrVarA instanceof FocusTargetNode) {
                                    humVar.n((FocusTargetNode) icrVarA);
                                } else if ((icrVarA.t & 1024) != 0 && (icrVarA instanceof jbi)) {
                                    int i2 = 0;
                                    for (icr icrVar2 = ((jbi) icrVarA).E; icrVar2 != null; icrVar2 = icrVar2.w) {
                                        if ((icrVar2.t & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                icrVarA = icrVar2;
                                            } else {
                                                if (humVar3 == null) {
                                                    humVar3 = new hum(new icr[16]);
                                                }
                                                if (icrVarA != null) {
                                                    humVar3.n(icrVarA);
                                                }
                                                humVar3.n(icrVar2);
                                                icrVarA = null;
                                            }
                                        }
                                    }
                                    if (i2 != 1) {
                                    }
                                }
                                icrVarA = jbg.a(humVar3);
                            }
                        }
                        icrVar = icrVar.v;
                        humVar2 = null;
                    }
                }
                jcrVarD = jcrVarD.s();
                if (jcrVarD == null || (jeeVar2 = jcrVarD.v) == null) {
                    humVar2 = null;
                    icrVar = null;
                } else {
                    icrVar = jeeVar2.e;
                    humVar2 = null;
                }
            }
        } else {
            humVar = null;
        }
        hum humVar4 = new hum(new FocusTargetNode[16]);
        if (!focusTargetNode.s.C) {
            itw.d("visitAncestors called on an unattached node");
        }
        icr icrVar3 = focusTargetNode.s.v;
        jcr jcrVarD2 = jbg.d(focusTargetNode);
        int i3 = 1;
        while (jcrVarD2 != null) {
            if ((jcrVarD2.v.f.u & 1024) != 0) {
                while (icrVar3 != null) {
                    if ((icrVar3.t & 1024) != 0) {
                        icr icrVarA2 = icrVar3;
                        hum humVar5 = null;
                        while (icrVarA2 != null) {
                            if (icrVarA2 instanceof FocusTargetNode) {
                                FocusTargetNode focusTargetNode3 = (FocusTargetNode) icrVarA2;
                                Boolean boolValueOf = humVar != null ? Boolean.valueOf(humVar.m(focusTargetNode3)) : null;
                                if (boolValueOf == null || !boolValueOf.booleanValue()) {
                                    humVar4.n(focusTargetNode3);
                                }
                                i3 &= focusTargetNode3 == focusTargetNode2 ? i : 1;
                            } else {
                                if ((icrVarA2.t & 1024) != 0 && (icrVarA2 instanceof jbi)) {
                                    int i4 = i;
                                    for (icr icrVar4 = ((jbi) icrVarA2).E; icrVar4 != null; icrVar4 = icrVar4.w) {
                                        if ((icrVar4.t & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                icrVarA2 = icrVar4;
                                            } else {
                                                if (humVar5 == null) {
                                                    humVar5 = new hum(new icr[16]);
                                                }
                                                if (icrVarA2 != null) {
                                                    humVar5.n(icrVarA2);
                                                }
                                                humVar5.n(icrVar4);
                                                icrVarA2 = null;
                                            }
                                        }
                                    }
                                    if (i4 != 1) {
                                    }
                                }
                                i = 0;
                            }
                            icrVarA2 = jbg.a(humVar5);
                            i = 0;
                        }
                    }
                    icrVar3 = icrVar3.v;
                    i = 0;
                }
            }
            jcrVarD2 = jcrVarD2.s();
            if (jcrVarD2 == null || (jeeVar = jcrVarD2.v) == null) {
                i = 0;
                icrVar3 = null;
            } else {
                icrVar3 = jeeVar.e;
                i = 0;
            }
        }
        if (i3 != 0 && focusTargetNode2 != null && !b(focusTargetNode2, false)) {
            return false;
        }
        jex.a(focusTargetNode, new ihd(focusTargetNode));
        int iOrdinal = focusTargetNode.f().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                ((AndroidComposeView) jbg.f(focusTargetNode)).i.e(focusTargetNode);
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new fctg();
                }
                ((AndroidComposeView) jbg.f(focusTargetNode)).i.e(focusTargetNode);
            }
        }
        if (humVar != null) {
            int i5 = humVar.b - 1;
            Object[] objArr = humVar.a;
            if (i5 < objArr.length) {
                while (i5 >= 0) {
                    FocusTargetNode focusTargetNode4 = (FocusTargetNode) objArr[i5];
                    if (focusOwnerImpl.h != focusTargetNode) {
                        return false;
                    }
                    focusTargetNode4.i(igx.b, igx.d);
                    i5--;
                }
            }
        }
        int i6 = humVar4.b - 1;
        Object[] objArr2 = humVar4.a;
        if (i6 < objArr2.length) {
            while (i6 >= 0) {
                FocusTargetNode focusTargetNode5 = (FocusTargetNode) objArr2[i6];
                if (focusOwnerImpl.h != focusTargetNode) {
                    return false;
                }
                focusTargetNode5.i(focusTargetNode5 == focusTargetNode2 ? igx.a : igx.d, igx.b);
                i6--;
            }
        }
        if (focusOwnerImpl.h != focusTargetNode) {
            return false;
        }
        focusTargetNode.i(igxVarF, igx.a);
        return focusOwnerImpl.h == focusTargetNode;
    }

    public static final boolean b(FocusTargetNode focusTargetNode, boolean z) {
        int iOrdinal = focusTargetNode.f().ordinal();
        if (iOrdinal == 0) {
            ((AndroidComposeView) jbg.f(focusTargetNode)).i.e(null);
            focusTargetNode.i(igx.a, igx.d);
            return true;
        }
        if (iOrdinal == 1) {
            FocusTargetNode focusTargetNodeB = ihf.b(focusTargetNode);
            if (focusTargetNodeB != null && !b(focusTargetNodeB, z)) {
                return false;
            }
            focusTargetNode.i(igx.b, igx.d);
            return true;
        }
        if (iOrdinal != 2) {
            if (iOrdinal == 3) {
                return true;
            }
            throw new fctg();
        }
        if (!z) {
            return z;
        }
        ((AndroidComposeView) jbg.f(focusTargetNode)).i.e(null);
        focusTargetNode.i(igx.c, igx.d);
        return true;
    }

    public static final int c(FocusTargetNode focusTargetNode, int i) {
        int iOrdinal = focusTargetNode.f().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                int iC = c(e(focusTargetNode), i);
                if (iC == 1) {
                    iC = 0;
                }
                if (iC != 0) {
                    return iC;
                }
                if (focusTargetNode.a) {
                    return 1;
                }
                focusTargetNode.a = true;
                try {
                    igl iglVarE = focusTargetNode.e();
                    ifn ifnVar = new ifn(i);
                    ihb.b(focusTargetNode);
                    ige igeVar = ((AndroidComposeView) jbg.f(focusTargetNode)).i;
                    FocusTargetNode focusTargetNode2 = ((FocusOwnerImpl) igeVar).h;
                    ((igo) iglVarE).k.invoke(ifnVar);
                    FocusTargetNode focusTargetNode3 = ((FocusOwnerImpl) igeVar).h;
                    if (ifnVar.b) {
                        return 2;
                    }
                    if (focusTargetNode2 == focusTargetNode3 || focusTargetNode3 == null) {
                        return 1;
                    }
                    return igr.c == igr.b ? 2 : 3;
                } finally {
                    focusTargetNode.a = false;
                }
            }
            if (iOrdinal == 2) {
                return 2;
            }
            if (iOrdinal != 3) {
                throw new fctg();
            }
        }
        return 1;
    }

    public static final int d(FocusTargetNode focusTargetNode, int i) {
        icr icrVar;
        jee jeeVar;
        int iOrdinal = focusTargetNode.f().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return c(e(focusTargetNode), i);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new fctg();
                }
                if (!focusTargetNode.s.C) {
                    itw.d("visitAncestors called on an unattached node");
                }
                icr icrVar2 = focusTargetNode.s.v;
                jcr jcrVarD = jbg.d(focusTargetNode);
                loop0: while (true) {
                    icrVar = null;
                    if (jcrVarD == null) {
                        break;
                    }
                    if ((jcrVarD.v.f.u & 1024) != 0) {
                        while (icrVar2 != null) {
                            if ((icrVar2.t & 1024) != 0) {
                                icr icrVarA = icrVar2;
                                hum humVar = null;
                                while (icrVarA != null) {
                                    if (icrVarA instanceof FocusTargetNode) {
                                        icrVar = icrVarA;
                                        break loop0;
                                    }
                                    if ((icrVarA.t & 1024) != 0 && (icrVarA instanceof jbi)) {
                                        int i2 = 0;
                                        for (icr icrVar3 = ((jbi) icrVarA).E; icrVar3 != null; icrVar3 = icrVar3.w) {
                                            if ((icrVar3.t & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    icrVarA = icrVar3;
                                                } else {
                                                    if (humVar == null) {
                                                        humVar = new hum(new icr[16]);
                                                    }
                                                    if (icrVarA != null) {
                                                        humVar.n(icrVarA);
                                                    }
                                                    humVar.n(icrVar3);
                                                    icrVarA = null;
                                                }
                                            }
                                        }
                                        if (i2 != 1) {
                                        }
                                    }
                                    icrVarA = jbg.a(humVar);
                                }
                            }
                            icrVar2 = icrVar2.v;
                        }
                    }
                    jcrVarD = jcrVarD.s();
                    icrVar2 = (jcrVarD == null || (jeeVar = jcrVarD.v) == null) ? null : jeeVar.e;
                }
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) icrVar;
                if (focusTargetNode2 == null) {
                    return 1;
                }
                int iOrdinal2 = focusTargetNode2.f().ordinal();
                if (iOrdinal2 == 0) {
                    return f(focusTargetNode2, i);
                }
                if (iOrdinal2 == 1) {
                    return d(focusTargetNode2, i);
                }
                if (iOrdinal2 == 2) {
                    return 2;
                }
                if (iOrdinal2 != 3) {
                    throw new fctg();
                }
                int iD = d(focusTargetNode2, i);
                int i3 = iD != 1 ? iD : 0;
                return i3 == 0 ? f(focusTargetNode2, i) : i3;
            }
        }
        return 1;
    }

    private static final FocusTargetNode e(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNodeB = ihf.b(focusTargetNode);
        if (focusTargetNodeB != null) {
            return focusTargetNodeB;
        }
        throw new IllegalArgumentException("ActiveParent with no focused child");
    }

    private static final int f(FocusTargetNode focusTargetNode, int i) {
        if (!focusTargetNode.b) {
            focusTargetNode.b = true;
            try {
                igl iglVarE = focusTargetNode.e();
                ifn ifnVar = new ifn(i);
                ihb.b(focusTargetNode);
                ige igeVar = ((AndroidComposeView) jbg.f(focusTargetNode)).i;
                FocusTargetNode focusTargetNode2 = ((FocusOwnerImpl) igeVar).h;
                ((igo) iglVarE).j.invoke(ifnVar);
                FocusTargetNode focusTargetNode3 = ((FocusOwnerImpl) igeVar).h;
                boolean z = ifnVar.b;
                int i2 = 2;
                if (!z) {
                    if (focusTargetNode2 != focusTargetNode3 && focusTargetNode3 != null) {
                        if (igr.c != igr.b) {
                            i2 = 3;
                        }
                    }
                }
                return i2;
            } finally {
                focusTargetNode.b = false;
            }
        }
        return 1;
    }
}
