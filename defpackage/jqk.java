package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jqk {
    public static final Object a(jbf jbfVar, fdae fdaeVar, fcxy fcxyVar) {
        Object obj;
        ivy ivyVarB;
        Object objE;
        jee jeeVar;
        if (jbfVar.D().C) {
            if (!jbfVar.D().C) {
                itw.d("visitAncestors called on an unattached node");
            }
            icr icrVar = jbfVar.D().v;
            jcr jcrVarD = jbg.d(jbfVar);
            loop0: while (true) {
                obj = null;
                if (jcrVarD == null) {
                    break;
                }
                if ((jcrVarD.v.f.u & 524288) != 0) {
                    while (icrVar != null) {
                        if ((icrVar.t & 524288) != 0) {
                            icr icrVarA = icrVar;
                            hum humVar = null;
                            while (icrVarA != null) {
                                if (icrVarA instanceof jqi) {
                                    obj = icrVarA;
                                    break loop0;
                                }
                                if ((icrVarA.t & 524288) != 0 && (icrVarA instanceof jbi)) {
                                    int i = 0;
                                    for (icr icrVar2 = ((jbi) icrVarA).E; icrVar2 != null; icrVar2 = icrVar2.w) {
                                        if ((icrVar2.t & 524288) != 0) {
                                            i++;
                                            if (i == 1) {
                                                icrVarA = icrVar2;
                                            } else {
                                                if (humVar == null) {
                                                    humVar = new hum(new icr[16]);
                                                }
                                                if (icrVarA != null) {
                                                    humVar.n(icrVarA);
                                                }
                                                humVar.n(icrVar2);
                                                icrVarA = null;
                                            }
                                        }
                                    }
                                    if (i != 1) {
                                    }
                                }
                                icrVarA = jbg.a(humVar);
                            }
                        }
                        icrVar = icrVar.v;
                    }
                }
                jcrVarD = jcrVarD.s();
                icrVar = (jcrVarD == null || (jeeVar = jcrVarD.v) == null) ? null : jeeVar.e;
            }
            jqi jqiVar = (jqi) obj;
            if (jqiVar != null && (objE = jqiVar.e((ivyVarB = jbg.b(jbfVar)), new jqj(fdaeVar, ivyVarB), fcxyVar)) == fcyl.a) {
                return objE;
            }
        }
        return fctx.a;
    }
}
