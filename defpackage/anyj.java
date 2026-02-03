package defpackage;

import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anyj implements anpj {
    public static final eksp a = eksp.c("BugleRecipients");
    public final Set b;
    public final cqtq c;
    private final awlc d;
    private final aswq e;
    private final cqtp f;
    private final fdjx g;
    private final cogw h;
    private final ekgb i;
    private final Duration j;
    private final awhf k;
    private final aszw l;
    private final aszw m;
    private final asxy n;

    public anyj(awlc awlcVar, aswq aswqVar, cqtp cqtpVar, fdjx fdjxVar, cogw cogwVar, ekgb ekgbVar, Duration duration) {
        awlcVar.getClass();
        cqtpVar.getClass();
        fdjxVar.getClass();
        cogwVar.getClass();
        ekgbVar.getClass();
        this.d = awlcVar;
        this.e = aswqVar;
        this.f = cqtpVar;
        this.g = fdjxVar;
        this.h = cogwVar;
        this.i = ekgbVar;
        this.j = duration;
        this.k = new anyi(this);
        ArrayList arrayList = new ArrayList();
        for (Object obj : ekgbVar) {
            if (((alqm) obj).e().isPresent()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(fcva.p(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((aubq) ((alqm) it.next()).e().get());
        }
        this.b = fcva.av(arrayList2);
        this.c = this.f.a(new anyd(this.d, this.k));
        aszs aszsVar = new aszs();
        aszsVar.c(this.j);
        aszsVar.b(this.j);
        aszw aszwVarA = aszsVar.a();
        this.l = aszwVarA;
        aszs aszsVar2 = new aszs();
        aszsVar2.c(this.j);
        aszsVar2.b(this.j);
        aszw aszwVarA2 = aszsVar2.a();
        this.m = aszwVarA2;
        aswq aswqVar2 = this.e;
        aszwVarA.getClass();
        this.n = aswqVar2.a(aszwVarA, aszwVarA2);
    }

    @Override // defpackage.anpj
    public final cquc a(final anpi anpiVar) {
        return this.c.a(new cqtk() { // from class: anya
            @Override // defpackage.cqtk
            public final eiju a(Object obj) {
                eksp ekspVar = anyj.a;
                return anpiVar.a();
            }
        }, "BatchRcsCapabilitiesWithValidityWindowSupplierFactory::register", "BatchRcsCapabilitiesWithValidityWindowSupplierFactory::callback", "BatchRcsCapabilitiesWithValidityWindowSupplierFactory::unregister");
    }

    @Override // defpackage.anpj
    public final eiju b() {
        return auvw.c(this.g, fcyi.a, fdjz.a, new anye(this, null));
    }

    @Override // defpackage.anpj
    public final /* bridge */ /* synthetic */ Object c() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.fcxy r13) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anyj.d(fcxy):java.lang.Object");
    }
}
