package defpackage;

import android.graphics.Region;
import android.os.Trace;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jsp {
    private static final ihu a = new ihu(0.0f, 0.0f, 10.0f, 10.0f);

    public static final boolean a(jsl jslVar) {
        jer jerVarE = jslVar.e();
        if (jerVarE != null && jerVarE.aB()) {
            return true;
        }
        jsc jscVar = jslVar.c;
        return jscVar.f(jte.p) || jscVar.f(jte.o);
    }

    public static final boolean b(jsl jslVar) {
        if (a(jslVar)) {
            return false;
        }
        jsc jscVar = jslVar.c;
        if (jscVar.b) {
            return true;
        }
        cuz cuzVar = jscVar.a;
        Object[] objArr = cuzVar.b;
        Object[] objArr2 = cuzVar.c;
        long[] jArr = cuzVar.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = i - length;
                    int i3 = 0;
                    while (true) {
                        int i4 = 8 - ((~i2) >>> 31);
                        if (i3 < i4) {
                            if ((255 & j) < 128) {
                                int i5 = (i << 3) + i3;
                                Object obj = objArr[i5];
                                Object obj2 = objArr2[i5];
                                if (((jtn) obj).c) {
                                    return true;
                                }
                            }
                            j >>= 8;
                            i3++;
                        } else if (i4 != 8) {
                            return false;
                        }
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return false;
    }

    public static final ctj c(jso jsoVar) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            jsl jslVarA = jsoVar.a();
            jcr jcrVar = jslVarA.b;
            if (jcrVar.f() && jcrVar.d()) {
                cuh cuhVar = new cuh(48);
                jrz jrzVar = new jrz();
                jrzVar.b(kje.b(jslVarA.c()));
                d(jrzVar, jslVarA, cuhVar, jslVarA, new jrz());
                return cuhVar;
            }
            cuh cuhVar2 = ctk.a;
            cuhVar2.getClass();
            return cuhVar2;
        } finally {
            Trace.endSection();
        }
    }

    private static final void d(jrz jrzVar, jsl jslVar, cuh cuhVar, jsl jslVar2, jrz jrzVar2) {
        jbf jbfVarA;
        ihu ihuVarA;
        jcr jcrVar;
        jcr jcrVar2 = jslVar2.b;
        boolean z = (jcrVar2.f() && jcrVar2.d()) ? false : true;
        Region region = jrzVar.a;
        if (!region.isEmpty() || jslVar2.e == jslVar.e) {
            if (!z || jslVar2.d) {
                jsc jscVar = jslVar2.c;
                if (!jscVar.b || (jbfVarA = jsm.a(jcrVar2)) == null) {
                    jbfVarA = jslVar2.a;
                }
                icr icrVarD = jbfVarA.D();
                Object objA = jsd.a(jscVar, jsa.b);
                if (!icrVarD.s.C) {
                    ihuVarA = ihu.a;
                } else if (objA != null) {
                    jer jerVarE = jbg.e(icrVarD, 8);
                    if (jerVarE.u()) {
                        ivy ivyVarG = ivz.g(jerVarE);
                        ihp ihpVarAe = jerVarE.ae();
                        long jY = jerVarE.Y(jerVarE.aa());
                        int i = (int) (jY >> 32);
                        ihpVarAe.a = -Float.intBitsToFloat(i);
                        int i2 = (int) (jY & 4294967295L);
                        ihpVarAe.b = -Float.intBitsToFloat(i2);
                        ihpVarAe.c = jerVarE.w() + Float.intBitsToFloat(i);
                        ihpVarAe.d = jerVarE.v() + Float.intBitsToFloat(i2);
                        while (true) {
                            if (jerVarE == ivyVarG) {
                                ihuVarA = ihq.a(ihpVarAe);
                                break;
                            }
                            jerVarE.aw(ihpVarAe, false, true);
                            if (ihpVarAe.c()) {
                                ihuVarA = ihu.a;
                                break;
                            } else {
                                jerVarE = jerVarE.x;
                                jerVarE.getClass();
                            }
                        }
                    } else {
                        ihuVarA = ihu.a;
                    }
                } else {
                    ihuVarA = ivz.e(jbg.e(icrVarD, 8));
                }
                kjd kjdVarB = kje.b(ihuVarA);
                jrzVar2.b(kjdVarB);
                int i3 = jslVar2.e;
                if (i3 == jslVar.e) {
                    i3 = -1;
                }
                if (!jrzVar2.a.op(region, Region.Op.INTERSECT)) {
                    if (jslVar2.d) {
                        jsl jslVarH = jslVar2.h();
                        cuhVar.f(i3, new jsn(jslVar2, kje.b((jslVarH == null || (jcrVar = jslVarH.b) == null || !jcrVar.f()) ? a : jslVarH.c())));
                        return;
                    } else {
                        if (i3 == -1) {
                            cuhVar.f(-1, new jsn(jslVar2, jrzVar2.a()));
                            return;
                        }
                        return;
                    }
                }
                cuhVar.f(i3, new jsn(jslVar2, jrzVar2.a()));
                List listJ = jslVar2.j();
                for (int size = listJ.size() - 1; size >= 0; size--) {
                    if (!((jsl) listJ.get(size)).f().f(jte.z)) {
                        d(jrzVar, jslVar, cuhVar, (jsl) listJ.get(size), jrzVar2);
                    }
                }
                if (b(jslVar2)) {
                    region.op(kjdVarB.b, kjdVarB.c, kjdVarB.d, kjdVarB.e, Region.Op.DIFFERENCE);
                }
            }
        }
    }
}
