package defpackage;

import androidx.compose.foundation.MarqueeModifierElement;
import j$.time.Duration;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cynh implements fdau {
    final /* synthetic */ long a;
    final /* synthetic */ String b;
    final /* synthetic */ List c;
    final /* synthetic */ fdat d;
    final /* synthetic */ Duration e;

    public cynh(long j, String str, List list, fdat fdatVar, Duration duration) {
        this.a = j;
        this.b = str;
        this.c = list;
        this.d = fdatVar;
        this.e = duration;
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hml hmlVar = (hml) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ((edp) obj).getClass();
        if ((iIntValue & 17) == 16 && hmlVar.I()) {
            hmlVar.s();
        } else {
            ico icoVar = ics.e;
            ics icsVarA = efm.a(icoVar, 1);
            long j = this.a;
            String str = this.b;
            List<fcti> list = this.c;
            fdat fdatVar = this.d;
            Duration duration = this.e;
            ixm ixmVarA = egk.a(ecr.a, ibw.m, hmlVar, 0);
            int iA = cyng.a(hmg.b(hmlVar));
            hxi hxiVarN = hmlVar.N();
            ics icsVarB = icj.b(hmlVar, icsVarA);
            fdae fdaeVar = jbb.a;
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            fdat fdatVar2 = jbb.e;
            hsk.b(hmlVar, ixmVarA, fdatVar2);
            fdat fdatVar3 = jbb.d;
            hsk.b(hmlVar, hxiVarN, fdatVar3);
            fdat fdatVar4 = jbb.f;
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA))) {
                Integer numValueOf = Integer.valueOf(iA);
                hmlVar.y(numValueOf);
                hmlVar.h(numValueOf, fdatVar4);
            }
            fdat fdatVar5 = jbb.c;
            hsk.b(hmlVar, icsVarB, fdatVar5);
            ics icsVarA2 = egp.a.a(efy.f(icoVar, 14.0f, 10.0f, 14.0f, 14.0f), 1.0f, true);
            ixm ixmVarA2 = edl.a(ecr.c, ibw.j, hmlVar, 0);
            int iA2 = cyng.a(hmg.b(hmlVar));
            hxi hxiVarN2 = hmlVar.N();
            ics icsVarB2 = icj.b(hmlVar, icsVarA2);
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA2, fdatVar2);
            hsk.b(hmlVar, hxiVarN2, fdatVar3);
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA2))) {
                Integer numValueOf2 = Integer.valueOf(iA2);
                hmlVar.y(numValueOf2);
                hmlVar.h(numValueOf2, fdatVar4);
            }
            hsk.b(hmlVar, icsVarB2, fdatVar5);
            dthx.b(str, efy.j(icoVar, 0.0f, 0.0f, 0.0f, 6.0f, 7).a(new MarqueeModifierElement(true != dns.a(0) ? 0 : 1200, dnt.a)), glz.a(hmlVar).s, 0L, null, null, 0L, null, 0L, 2, false, 1, 0, null, glz.d(hmlVar).h, hmlVar, 48, 3120, 55288);
            hmlVar.v(877811565);
            for (fcti fctiVar : list) {
                cyni.d((String) fctiVar.a, fctiVar.b, hmlVar, 0);
            }
            hmlVar.o();
            fdatVar.a(hmlVar, 0);
            hmlVar.n();
            ics icsVarP = egq.p(egq.b(efy.d(dkl.a(icoVar, j, ikj.a), 4.0f), 1.0f), 94.0f, 100.0f);
            ixm ixmVarA3 = ecz.a(ibw.a, false);
            int iA3 = cyng.a(hmg.b(hmlVar));
            hxi hxiVarN3 = hmlVar.N();
            ics icsVarB3 = icj.b(hmlVar, icsVarP);
            hmlVar.M();
            hmlVar.x();
            if (hmlVar.H()) {
                hmlVar.j(fdaeVar);
            } else {
                hmlVar.z();
            }
            hsk.b(hmlVar, ixmVarA3, fdatVar2);
            hsk.b(hmlVar, hxiVarN3, fdatVar3);
            if (hmlVar.H() || !fdbq.f(hmlVar.f(), Integer.valueOf(iA3))) {
                Integer numValueOf3 = Integer.valueOf(iA3);
                hmlVar.y(numValueOf3);
                hmlVar.h(numValueOf3, fdatVar4);
            }
            hsk.b(hmlVar, icsVarB3, fdatVar5);
            edf edfVar = edf.a;
            dthx.b(cyni.a(duration), edfVar.a(icoVar, ibw.e), ije.d, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, jyq.y(glz.d(hmlVar).j, 0L, 0L, kcc.h, null, kbj.d, null, 0L, null, 0, 0, 0L, null, null, 0, 16777179), hmlVar, 384, 0, 65528);
            hmlVar.n();
            hmlVar.n();
        }
        return fctx.a;
    }
}
