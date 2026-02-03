package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dyjs extends dyig {
    public final dxxk a;
    public final ddfp c;
    public final ejwi d;
    public final String e;
    public dyjg h;
    public Object i;
    public dyjj j;
    public String k;
    public boolean m;
    public final ejwi n;
    public final lun f = new dyjq(this);
    public final lun g = new dyjr(this);
    public ekgp l = ekoj.a;
    public final ddfs b = new ddfs() { // from class: dyjk
        @Override // defpackage.ddfs
        public final void a(Map map) {
            dyjs dyjsVar = this.a;
            ekgp ekgpVarJ = ekgp.j(map);
            dyjsVar.l = ekgpVarJ;
            dyjsVar.a(dyjsVar.i, ekgpVarJ, dyjsVar.h, dyjsVar.m);
            dyjj dyjjVar = dyjsVar.j;
            if (dyjjVar != null) {
                dyjjVar.b(dyjsVar.l);
            }
        }
    };

    protected dyjs(dxxk dxxkVar, ddfp ddfpVar, ejwi ejwiVar, String str, ejwi ejwiVar2) {
        this.a = dxxkVar;
        this.c = ddfpVar;
        this.d = ejwiVar;
        this.e = str;
        this.n = ejwiVar2;
    }

    public final void a(Object obj, ekgp ekgpVar, dyjg dyjgVar, boolean z) {
        int iA;
        if (dyjgVar == null) {
            return;
        }
        etzz etzzVar = z ? null : (etzz) ejwi.i((ddfh) dymu.a(this.a, obj, ekgpVar, null)).b(new ejvr() { // from class: dyjl
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                euab euabVar = ((ddfh) obj2).b;
                return euabVar == null ? euab.a : euabVar;
            }
        }).b(new ejvr() { // from class: dyjm
            @Override // defpackage.ejvr
            public final Object apply(Object obj2) {
                etzz etzzVar2 = ((euab) obj2).c;
                return etzzVar2 == null ? etzz.a : etzzVar2;
            }
        }).f();
        dyjgVar.B = new lbz() { // from class: dyjn
            @Override // defpackage.lbz
            public final void accept(Object obj2) {
                this.a.k = (String) obj2;
            }
        };
        dyjgVar.C = etzzVar;
        boolean z2 = false;
        if (etzzVar != null && (iA = etzx.a(etzzVar.b)) != 0 && iA == 4) {
            z2 = true;
        }
        dyjgVar.n(z2);
    }
}
