package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bzg implements bzl {
    private final bir b;
    private final bkf c;
    private final int d;
    private final Map e = new HashMap();
    private final Map f = new HashMap();

    public bzg(bir birVar, int i) {
        lcg.b(true, "Not a supported video capabilities source: 0");
        this.b = birVar;
        int i2 = i == 2 ? 2 : 1;
        this.d = i2;
        bkf bkfVarG = birVar.g();
        if (i2 != 2) {
            if (new bxa(bkfVarG, 1).c().isEmpty()) {
                bbs.f("RecorderVideoCapabilities", "Camera EncoderProfilesProvider doesn't contain any supported Quality.");
                bkfVarG = new cha(birVar, Arrays.asList(bxo.d, bxo.c, bxo.b));
            }
            bly blyVar = ccu.a;
            bkf chcVar = new chc(new chb(bkfVarG, blyVar, birVar), blyVar);
            Iterator it = birVar.p().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                azv azvVar = (azv) it.next();
                Integer numValueOf = Integer.valueOf(azvVar.h);
                int i3 = azvVar.i;
                if (numValueOf.equals(3) && i3 == 10) {
                    chcVar = new cba(chcVar);
                    break;
                }
            }
            bkfVarG = new chd(chcVar, birVar, blyVar);
        } else if (!birVar.v()) {
            bkfVarG = bkf.a;
        }
        this.c = bkfVarG;
        for (azv azvVar2 : birVar.p()) {
            bxa bxaVar = new bxa(new cbe(this.c, azvVar2), this.d);
            if (!bxaVar.c().isEmpty()) {
                this.e.put(azvVar2, bxaVar);
            }
        }
        birVar.w();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006f A[EDGE_INSN: B:45:0x006f->B:33:0x006f BREAK  A[LOOP:0: B:14:0x0035->B:46:0x0035], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0035 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bxa a(defpackage.azv r9) {
        /*
            r8 = this;
            boolean r0 = r9.b()
            if (r0 == 0) goto Lf
            java.util.Map r0 = r8.e
            java.lang.Object r9 = r0.get(r9)
            bxa r9 = (defpackage.bxa) r9
            return r9
        Lf:
            java.util.Map r0 = r8.f
            boolean r1 = r0.containsKey(r9)
            if (r1 != 0) goto L84
            java.util.Map r1 = r8.e
            java.util.Set r1 = r1.keySet()
            r9.getClass()
            r1.getClass()
            boolean r2 = r9.b()
            r3 = 0
            if (r2 == 0) goto L31
            boolean r1 = r1.contains(r9)
            if (r1 != 0) goto L72
            goto L80
        L31:
            java.util.Iterator r1 = r1.iterator()
        L35:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6e
            java.lang.Object r2 = r1.next()
            r4 = r2
            azv r4 = (defpackage.azv) r4
            boolean r5 = r4.b()
            java.lang.String r6 = "Fully specified range is not actually fully specified."
            defpackage.lcg.d(r5, r6)
            int r5 = r9.i
            if (r5 != 0) goto L50
            goto L54
        L50:
            int r7 = r4.i
            if (r5 != r7) goto L35
        L54:
            boolean r5 = r4.b()
            defpackage.lcg.d(r5, r6)
            int r5 = r9.h
            if (r5 != 0) goto L60
            goto L6f
        L60:
            int r4 = r4.h
            r6 = 2
            if (r5 != r6) goto L6b
            r5 = 1
            if (r4 == r5) goto L69
            goto L6f
        L69:
            r4 = r5
            r5 = r6
        L6b:
            if (r5 != r4) goto L35
            goto L6f
        L6e:
            r2 = r3
        L6f:
            if (r2 != 0) goto L72
            goto L80
        L72:
            bkf r1 = r8.c
            cbe r2 = new cbe
            r2.<init>(r1, r9)
            int r1 = r8.d
            bxa r3 = new bxa
            r3.<init>(r2, r1)
        L80:
            r0.put(r9, r3)
            return r3
        L84:
            java.lang.Object r9 = r0.get(r9)
            bxa r9 = (defpackage.bxa) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bzg.a(azv):bxa");
    }

    @Override // defpackage.bzl
    public final cbg b(Size size, azv azvVar) {
        bxa bxaVarA = a(azvVar);
        if (bxaVarA == null) {
            return null;
        }
        bxo bxoVarA = bxaVarA.a(size);
        bbs.a("CapabilitiesByQuality", a.i(size, bxoVarA, "Using supported quality of ", " for size "));
        if (bxoVarA == bxo.h) {
            return null;
        }
        cbg cbgVarB = bxaVarA.b(bxoVarA);
        if (cbgVarB != null) {
            return cbgVarB;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    @Override // defpackage.bzl
    public final cbg c(bxo bxoVar, azv azvVar) {
        bxa bxaVarA = a(azvVar);
        if (bxaVarA == null) {
            return null;
        }
        return bxaVarA.b(bxoVar);
    }

    @Override // defpackage.bzl
    public final List d(azv azvVar) {
        bxa bxaVarA = a(azvVar);
        return bxaVarA == null ? new ArrayList() : bxaVarA.c();
    }

    @Override // defpackage.bzl
    public final Set e(bxo bxoVar, azv azvVar) {
        if (this.d != 2) {
            return this.b.q();
        }
        cbg cbgVarC = c(bxoVar, azvVar);
        if (cbgVarC == null) {
            return Collections.EMPTY_SET;
        }
        int iE = 0;
        for (bki bkiVar : cbgVarC.d()) {
            if (bkiVar.e() > iE) {
                iE = bkiVar.e();
            }
        }
        Set<Range> setR = this.b.r(cbgVarC.f().k());
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Range range : setR) {
            if (((Integer) range.getUpper()).intValue() <= iE && ((Integer) range.getLower()).equals(range.getUpper())) {
                linkedHashSet.add(range);
            }
        }
        return linkedHashSet;
    }
}
