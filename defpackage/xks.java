package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xks implements dqdi {
    public static final cczi a = cdag.j(cdag.b, "vm_satellite_max_file_size_override", 307200);
    public final dogg b;
    public final int c;
    public final int d;
    public final fdvc e;
    public final fdvc f;
    private final aqtu g;
    private final fduj h;
    private final cliy i;
    private final fdvc j;

    public xks(fdjx fdjxVar, fduj fdujVar, aqtu aqtuVar, fduj fdujVar2, cliy cliyVar) {
        int iIntValue;
        int iIntValue2;
        fdjxVar.getClass();
        fdujVar.getClass();
        aqtuVar.getClass();
        cliyVar.getClass();
        this.g = aqtuVar;
        this.h = fdujVar2;
        this.i = cliyVar;
        cczv cczvVar = aonl.a;
        this.b = ((Boolean) cczvVar.e()).booleanValue() ? doft.a : dofr.a;
        if (((Boolean) cczvVar.e()).booleanValue()) {
            Object objE = aonl.e.e();
            objE.getClass();
            iIntValue = ((Number) objE).intValue();
        } else {
            iIntValue = 12200;
        }
        this.c = iIntValue;
        if (((Boolean) cczvVar.e()).booleanValue()) {
            Object objE2 = aonl.d.e();
            objE2.getClass();
            iIntValue2 = ((Number) objE2).intValue();
        } else {
            iIntValue2 = 8000;
        }
        this.d = iIntValue2;
        fdpl fdplVarA = fdqq.a(new fdua(new xkl(new xki(fdujVar)), aqtuVar.a() ? fdqq.a(new xka(fdujVar2)) : fdqq.a(new xkd(cliyVar.h())), new xkf(null)));
        fdus fdusVar = fdur.a;
        fdvc fdvcVarB = fdtg.b(fdplVarA, fdjxVar, fdusVar, null);
        this.e = fdvcVarB;
        fdvc fdvcVarB2 = fdtg.b(fdqq.a(new xkr(new xko(fdujVar))), fdjxVar, fdusVar, false);
        this.j = fdvcVarB2;
        this.f = fdtg.b(fdqq.a(new fdua(fdvcVarB2, fdvcVarB, new xke(this, null))), fdjxVar, fdusVar, null);
    }

    public static final Duration a(Duration duration, Duration duration2) {
        return duration2.multipliedBy(duration.dividedBy(duration2));
    }
}
