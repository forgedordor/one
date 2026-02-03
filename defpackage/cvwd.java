package defpackage;

import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvwd extends fcyz implements fdba {
    public /* synthetic */ Object a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public /* synthetic */ Object f;
    public /* synthetic */ Object g;
    public /* synthetic */ Object h;
    public final /* synthetic */ cvwe i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvwd(cvwe cvweVar, fcxy fcxyVar) {
        super(9, fcxyVar);
        this.i = cvweVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ajlk, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ?? r1 = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        Object obj5 = this.e;
        Object obj6 = this.f;
        Object obj7 = this.g;
        Object obj8 = this.h;
        fcww fcwwVar = new fcww((byte[]) null);
        if (obj2 != null) {
            String strM = r1.m();
            if (strM == null) {
                strM = new String();
            }
            String str = strM;
            dihq dihqVar = (dihq) obj2;
            djrr djrrVar = dihqVar.b;
            fcwwVar.add(new cvxb(new dkeg(str, null, dihqVar.a, null, null, djrrVar != null ? new dkdk(djrrVar) : null, null, dihqVar.k, 90)));
        }
        if (obj7 != null) {
            dihq dihqVar2 = (dihq) obj7;
            djrr djrrVar2 = dihqVar2.b;
            fcwwVar.add(new cvxb(new dkeg(dihqVar2.a, null, null, null, null, djrrVar2 != null ? new dkdk(djrrVar2) : null, null, dihqVar2.k, 94)));
        }
        cvwe cvweVar = this.i;
        arpr arprVar = cvweVar.b;
        if (arprVar.a() && obj8 != null) {
            dihq dihqVar3 = (dihq) obj8;
            djrr djrrVar3 = dihqVar3.b;
            fcwwVar.add(new cvxb(new dkeg(dihqVar3.a, null, null, null, null, djrrVar3 != null ? new dkdk(djrrVar3) : null, null, dihqVar3.k, 94)));
        }
        dihq dihqVar4 = (dihq) obj3;
        String str2 = dihqVar4.a;
        djrr djrrVar4 = dihqVar4.b;
        fcwwVar.add(new cvxb(new dkeg(str2, null, null, null, null, djrrVar4 != null ? new dkdk(djrrVar4) : null, null, dihqVar4.k, 94)));
        if (obj6 != null) {
            String string = cvweVar.a.getString(R.string.report_spam);
            string.getClass();
            fcwwVar.add(new cvxb(new dkeg(string, null, null, null, null, new dkdk(djrr.dp), null, ((dihq) obj6).k, 94), 2));
        }
        if (arprVar.a()) {
            if (obj5 != null) {
                dihq dihqVar5 = (dihq) obj5;
                djrr djrrVar5 = dihqVar5.b;
                fcwwVar.add(new cvxb(new dkeg(dihqVar5.a, null, null, null, null, djrrVar5 != null ? new dkdk(djrrVar5) : null, null, dihqVar5.k, 94), 2));
            }
        } else if (obj4 != null) {
            dihq dihqVar6 = (dihq) obj4;
            djrr djrrVar6 = dihqVar6.b;
            fcwwVar.add(new cvxb(new dkeg(dihqVar6.a, null, null, null, null, djrrVar6 != null ? new dkdk(djrrVar6) : null, null, dihqVar6.k, 94), 2));
        }
        return new cvvy(ekfv.a(fcva.a(fcwwVar)));
    }
}
