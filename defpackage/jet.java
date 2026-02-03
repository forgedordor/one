package defpackage;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jet {
    private static final cuq a;

    static {
        int i = cvf.a;
        a = new cuq((byte[]) null);
    }

    public static final int a(icq icqVar) {
        int i = true == (icqVar instanceof iwj) ? 3 : 1;
        if (icqVar instanceof ifa) {
            i |= 4;
        }
        if (icqVar instanceof jsg) {
            i |= 8;
        }
        if (icqVar instanceof iss) {
            i |= 16;
        }
        if ((icqVar instanceof izx) || (icqVar instanceof jae)) {
            i |= 32;
        }
        if (icqVar instanceof ifr) {
            i |= 4096;
        }
        if (icqVar instanceof igc) {
            i |= 2048;
        }
        if (icqVar instanceof ixx) {
            i |= 256;
        }
        if (icqVar instanceof iyh) {
            i |= 64;
        }
        if ((icqVar instanceof iya) || (icqVar instanceof iyd)) {
            i |= 128;
        }
        return icqVar instanceof jqi ? 524288 | i : i;
    }

    public static final int b(icr icrVar) {
        int i = icrVar.t;
        if (i != 0) {
            return i;
        }
        cuq cuqVar = a;
        Class<?> cls = icrVar.getClass();
        int iE = cuqVar.e(cls);
        if (iE >= 0) {
            return cuqVar.c[iE];
        }
        int i2 = true == (icrVar instanceof jcd) ? 3 : 1;
        if (icrVar instanceof jbp) {
            i2 |= 4;
        }
        if (icrVar instanceof jfy) {
            i2 |= 8;
        }
        if (icrVar instanceof jfv) {
            i2 |= 16;
        }
        if (icrVar instanceof jac) {
            i2 |= 32;
        }
        if (icrVar instanceof jfs) {
            i2 |= 64;
        }
        if (icrVar instanceof jcb) {
            i2 |= 128;
        }
        if (icrVar instanceof jbr) {
            i2 |= 256;
        }
        if (icrVar instanceof iuh) {
            i2 |= 512;
        }
        if (icrVar instanceof FocusTargetNode) {
            i2 |= 1024;
        }
        if (icrVar instanceof igp) {
            i2 |= 2048;
        }
        if (icrVar instanceof ift) {
            i2 |= 4096;
        }
        if (icrVar instanceof iql) {
            i2 |= 8192;
        }
        if (icrVar instanceof itu) {
            i2 |= 16384;
        }
        if (icrVar instanceof jbd) {
            i2 |= 32768;
        }
        if (icrVar instanceof iqo) {
            i2 |= 131072;
        }
        if (icrVar instanceof jgg) {
            i2 |= 262144;
        }
        if (icrVar instanceof jqi) {
            i2 |= 524288;
        }
        if (icrVar instanceof jfc) {
            i2 |= 1048576;
        }
        if (icrVar instanceof iqf) {
            i2 |= 2097152;
        }
        cuqVar.c(cls, i2);
        return i2;
    }

    public static final int c(icr icrVar) {
        if (!(icrVar instanceof jbi)) {
            return b(icrVar);
        }
        jbi jbiVar = (jbi) icrVar;
        int iC = jbiVar.D;
        for (icr icrVar2 = jbiVar.E; icrVar2 != null; icrVar2 = icrVar2.w) {
            iC |= c(icrVar2);
        }
        return iC;
    }

    public static final void d(icr icrVar) {
        if (!icrVar.C) {
            itw.d("autoInvalidateInsertedNode called on unattached node");
        }
        e(icrVar, -1, 1);
    }

    public static final void e(icr icrVar, int i, int i2) {
        if (!(icrVar instanceof jbi)) {
            i(icrVar, i & icrVar.t, i2);
            return;
        }
        jbi jbiVar = (jbi) icrVar;
        int i3 = jbiVar.D;
        i(icrVar, i3 & i, i2);
        int i4 = (~i3) & i;
        for (icr icrVar2 = jbiVar.E; icrVar2 != null; icrVar2 = icrVar2.w) {
            e(icrVar2, i4, i2);
        }
    }

    public static final void f(icr icrVar) {
        if (!icrVar.C) {
            itw.d("autoInvalidateRemovedNode called on unattached node");
        }
        e(icrVar, -1, 2);
    }

    public static final void g(icr icrVar) {
        if (!icrVar.C) {
            itw.d("autoInvalidateUpdatedNode called on unattached node");
        }
        e(icrVar, -1, 0);
    }

    public static final boolean h(int i) {
        return (i & 128) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void i(icr icrVar, int i, int i2) {
        if (i2 != 0 || icrVar.dN()) {
            if ((i & 2) != 0 && (icrVar instanceof jcd)) {
                jci.b((jcd) icrVar);
                if (i2 == 2) {
                    jbg.e(icrVar, 2).at();
                }
            }
            if ((i & 128) != 0 && (icrVar instanceof jcb) && i2 != 2) {
                jbg.d(icrVar).Q();
            }
            if ((i & 256) != 0 && (icrVar instanceof jbr) && i2 != 2) {
                jcr jcrVarD = jbg.d(icrVar);
                if (!jcrVarD.ak() && !jcrVarD.an() && !jcrVarD.A) {
                    jcv.a(jcrVarD).y(jcrVarD);
                }
            }
            if ((i & 4) != 0 && (icrVar instanceof jbp)) {
                jbq.a((jbp) icrVar);
            }
            if ((i & 8) != 0 && (icrVar instanceof jfy)) {
                jbg.d(icrVar).o = true;
            }
            if ((i & 64) != 0 && (icrVar instanceof jfs)) {
                jcw jcwVar = jbg.d((jfs) icrVar).w;
                jcwVar.o.q = true;
                jdm jdmVar = jcwVar.p;
                if (jdmVar != null) {
                    jdmVar.t = true;
                }
            }
            if ((i & 2048) != 0 && (icrVar instanceof igp)) {
                igp igpVar = (igp) icrVar;
                jau.b = null;
                igpVar.v(jau.a);
                if (jau.b != null) {
                    if (!igpVar.D().C) {
                        itw.d("visitChildren called on an unattached node");
                    }
                    hum humVar = new hum(new icr[16]);
                    icr icrVar2 = igpVar.D().w;
                    if (icrVar2 == null) {
                        jbg.j(humVar, igpVar.D());
                    } else {
                        humVar.n(icrVar2);
                    }
                    while (true) {
                        int i3 = humVar.b;
                        if (i3 == 0) {
                            break;
                        }
                        icr icrVarA = (icr) humVar.c(i3 - 1);
                        if ((icrVarA.u & 1024) == 0) {
                            jbg.j(humVar, icrVarA);
                        } else {
                            while (true) {
                                if (icrVarA == null) {
                                    break;
                                }
                                if ((icrVarA.t & 1024) != 0) {
                                    hum humVar2 = null;
                                    while (icrVarA != null) {
                                        if (icrVarA instanceof FocusTargetNode) {
                                            FocusTargetNode focusTargetNode = (FocusTargetNode) icrVarA;
                                            ify ifyVar = ((FocusOwnerImpl) ((AndroidComposeView) jbg.f(focusTargetNode)).i).d;
                                            ifyVar.a(ifyVar.c, focusTargetNode);
                                        } else if ((icrVarA.t & 1024) != 0 && (icrVarA instanceof jbi)) {
                                            int i4 = 0;
                                            for (icr icrVar3 = ((jbi) icrVarA).E; icrVar3 != null; icrVar3 = icrVar3.w) {
                                                if ((icrVar3.t & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        icrVarA = icrVar3;
                                                    } else {
                                                        if (humVar2 == null) {
                                                            humVar2 = new hum(new icr[16]);
                                                        }
                                                        if (icrVarA != null) {
                                                            humVar2.n(icrVarA);
                                                        }
                                                        humVar2.n(icrVar3);
                                                        icrVarA = null;
                                                    }
                                                }
                                            }
                                            if (i4 != 1) {
                                            }
                                        }
                                        icrVarA = jbg.a(humVar2);
                                    }
                                } else {
                                    icrVarA = icrVarA.w;
                                }
                            }
                        }
                    }
                }
            }
            if ((i & 4096) == 0 || !(icrVar instanceof ift)) {
                return;
            }
            ift iftVar = (ift) icrVar;
            ify ifyVar2 = ((FocusOwnerImpl) ((AndroidComposeView) jbg.f(iftVar)).i).d;
            ifyVar2.a(ifyVar2.d, iftVar);
        }
    }
}
