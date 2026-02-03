package defpackage;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ihj {
    public static final boolean a(FocusTargetNode focusTargetNode, fdap fdapVar) {
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
                        if (a(focusTargetNodeB, fdapVar) || d(focusTargetNode, focusTargetNodeB, 2, fdapVar)) {
                            return true;
                        }
                        return ((igo) focusTargetNodeB.e()).a && ((Boolean) fdapVar.invoke(focusTargetNodeB)).booleanValue();
                    }
                    if (iOrdinal2 != 2) {
                        if (iOrdinal2 != 3) {
                            throw new fctg();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                return d(focusTargetNode, focusTargetNodeB, 2, fdapVar);
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new fctg();
                }
                if (e(focusTargetNode, fdapVar)) {
                    return true;
                }
                return ((igo) focusTargetNode.e()).a && ((Boolean) fdapVar.invoke(focusTargetNode)).booleanValue();
            }
        }
        return e(focusTargetNode, fdapVar);
    }

    public static final boolean b(FocusTargetNode focusTargetNode, fdap fdapVar) {
        int iOrdinal = focusTargetNode.f().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                FocusTargetNode focusTargetNodeB = ihf.b(focusTargetNode);
                if (focusTargetNodeB != null) {
                    return b(focusTargetNodeB, fdapVar) || d(focusTargetNode, focusTargetNodeB, 1, fdapVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return ((igo) focusTargetNode.e()).a ? ((Boolean) fdapVar.invoke(focusTargetNode)).booleanValue() : f(focusTargetNode, fdapVar);
                }
                throw new fctg();
            }
        }
        return f(focusTargetNode, fdapVar);
    }

    public static final boolean c(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, fdap fdapVar) {
        icr icrVar;
        jee jeeVar;
        if (focusTargetNode.f() != igx.b) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        hum humVar = new hum(new FocusTargetNode[16]);
        if (!focusTargetNode.s.C) {
            itw.d("visitChildren called on an unattached node");
        }
        hum humVar2 = new hum(new icr[16]);
        icr icrVar2 = focusTargetNode.s;
        icr icrVar3 = icrVar2.w;
        if (icrVar3 == null) {
            jbg.j(humVar2, icrVar2);
        } else {
            humVar2.n(icrVar3);
        }
        while (true) {
            int i2 = humVar2.b;
            icrVar = null;
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
                                humVar.n((FocusTargetNode) icrVarA);
                            } else if ((icrVarA.t & 1024) != 0 && (icrVarA instanceof jbi)) {
                                int i3 = 0;
                                for (icr icrVar4 = ((jbi) icrVarA).E; icrVar4 != null; icrVar4 = icrVar4.w) {
                                    if ((icrVar4.t & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
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
        humVar.j(ihh.a);
        if (ifq.b(i, 1)) {
            fddq fddqVarR = fddu.r(0, humVar.b);
            int i4 = fddqVarR.a;
            int i5 = fddqVarR.b;
            if (i4 <= i5) {
                boolean zF = false;
                while (true) {
                    if (zF) {
                        FocusTargetNode focusTargetNode3 = (FocusTargetNode) humVar.a[i4];
                        if (ihf.d(focusTargetNode3) && b(focusTargetNode3, fdapVar)) {
                            return true;
                        }
                    }
                    zF |= fdbq.f(humVar.a[i4], focusTargetNode2);
                    if (i4 == i5) {
                        break;
                    }
                    i4++;
                }
            }
        } else {
            if (!ifq.b(i, 2)) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            fddq fddqVarR2 = fddu.r(0, humVar.b);
            int i6 = fddqVarR2.a;
            int i7 = fddqVarR2.b;
            if (i6 <= i7) {
                boolean zF2 = false;
                while (true) {
                    if (zF2) {
                        FocusTargetNode focusTargetNode4 = (FocusTargetNode) humVar.a[i7];
                        if (ihf.d(focusTargetNode4) && a(focusTargetNode4, fdapVar)) {
                            return true;
                        }
                    }
                    zF2 |= fdbq.f(humVar.a[i7], focusTargetNode2);
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
            }
        }
        if (!ifq.b(i, 1) && ((igo) focusTargetNode.e()).a) {
            if (!focusTargetNode.s.C) {
                itw.d("visitAncestors called on an unattached node");
            }
            icr icrVar5 = focusTargetNode.s.v;
            jcr jcrVarD = jbg.d(focusTargetNode);
            loop5: while (true) {
                if (jcrVarD == null) {
                    break;
                }
                if ((jcrVarD.v.f.u & 1024) != 0) {
                    while (icrVar5 != null) {
                        if ((icrVar5.t & 1024) != 0) {
                            icr icrVarA2 = icrVar5;
                            hum humVar4 = null;
                            while (icrVarA2 != null) {
                                if (icrVarA2 instanceof FocusTargetNode) {
                                    icrVar = icrVarA2;
                                    break loop5;
                                }
                                if ((icrVarA2.t & 1024) != 0 && (icrVarA2 instanceof jbi)) {
                                    int i8 = 0;
                                    for (icr icrVar6 = ((jbi) icrVarA2).E; icrVar6 != null; icrVar6 = icrVar6.w) {
                                        if ((icrVar6.t & 1024) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                icrVarA2 = icrVar6;
                                            } else {
                                                if (humVar4 == null) {
                                                    humVar4 = new hum(new icr[16]);
                                                }
                                                if (icrVarA2 != null) {
                                                    humVar4.n(icrVarA2);
                                                }
                                                humVar4.n(icrVar6);
                                                icrVarA2 = null;
                                            }
                                        }
                                    }
                                    if (i8 != 1) {
                                    }
                                }
                                icrVarA2 = jbg.a(humVar4);
                            }
                        }
                        icrVar5 = icrVar5.v;
                    }
                }
                jcrVarD = jcrVarD.s();
                icrVar5 = (jcrVarD == null || (jeeVar = jcrVarD.v) == null) ? null : jeeVar.e;
            }
            if (icrVar != null) {
                return ((Boolean) fdapVar.invoke(focusTargetNode)).booleanValue();
            }
        }
        return false;
    }

    private static final boolean d(FocusTargetNode focusTargetNode, FocusTargetNode focusTargetNode2, int i, fdap fdapVar) {
        if (c(focusTargetNode, focusTargetNode2, i, fdapVar)) {
            return true;
        }
        ihc ihcVarA = ihb.a(focusTargetNode);
        int i2 = ihcVarA.a;
        Boolean bool = (Boolean) ifm.a(focusTargetNode, i, new ihi(ihcVarA, ((FocusOwnerImpl) ((AndroidComposeView) jbg.f(focusTargetNode)).i).h, focusTargetNode, focusTargetNode2, i, fdapVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    private static final boolean e(FocusTargetNode focusTargetNode, fdap fdapVar) {
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
            int i = humVar2.b;
            if (i == 0) {
                break;
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
                                humVar.n((FocusTargetNode) icrVarA);
                            } else if ((icrVarA.t & 1024) != 0 && (icrVarA instanceof jbi)) {
                                int i2 = 0;
                                for (icr icrVar3 = ((jbi) icrVarA).E; icrVar3 != null; icrVar3 = icrVar3.w) {
                                    if ((icrVar3.t & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
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
        humVar.j(ihh.a);
        int i3 = humVar.b - 1;
        Object[] objArr = humVar.a;
        if (i3 < objArr.length) {
            while (i3 >= 0) {
                FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i3];
                if (ihf.d(focusTargetNode2) && a(focusTargetNode2, fdapVar)) {
                    return true;
                }
                i3--;
            }
        }
        return false;
    }

    private static final boolean f(FocusTargetNode focusTargetNode, fdap fdapVar) {
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
            int i = humVar2.b;
            if (i == 0) {
                break;
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
                                humVar.n((FocusTargetNode) icrVarA);
                            } else if ((icrVarA.t & 1024) != 0 && (icrVarA instanceof jbi)) {
                                int i2 = 0;
                                for (icr icrVar3 = ((jbi) icrVarA).E; icrVar3 != null; icrVar3 = icrVar3.w) {
                                    if ((icrVar3.t & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
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
        humVar.j(ihh.a);
        Object[] objArr = humVar.a;
        int i3 = humVar.b;
        for (int i4 = 0; i4 < i3; i4++) {
            FocusTargetNode focusTargetNode2 = (FocusTargetNode) objArr[i4];
            if (ihf.d(focusTargetNode2) && b(focusTargetNode2, fdapVar)) {
                return true;
            }
        }
        return false;
    }
}
