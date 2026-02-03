package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hec implements dyb {
    public static final hyr a = hxu.a(new fdat() { // from class: hdz
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            hyr hyrVar = hec.a;
            hdy hdyVar = ((hec) obj2).b;
            return fcva.g(Integer.valueOf(hdyVar.j()), Float.valueOf(hdyVar.c()), Integer.valueOf(hdyVar.b()));
        }
    }, new fdap() { // from class: hea
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            final List list = (List) obj;
            Object obj2 = list.get(0);
            obj2.getClass();
            int iIntValue = ((Integer) obj2).intValue();
            Object obj3 = list.get(1);
            obj3.getClass();
            return new hec(iIntValue, ((Float) obj3).floatValue(), new fdae() { // from class: heb
                @Override // defpackage.fdae
                public final Object invoke() {
                    hyr hyrVar = hec.a;
                    Object obj4 = list.get(2);
                    obj4.getClass();
                    Integer num = (Integer) obj4;
                    num.intValue();
                    return num;
                }
            });
        }
    });
    public final hdy b;

    public hec(int i, float f, fdae fdaeVar) {
        this.b = new hdy(i, f, fdaeVar);
    }

    @Override // defpackage.dyb
    public final float a(float f) {
        return this.b.a(f);
    }

    @Override // defpackage.dyb
    public final Object e(dod dodVar, fdat fdatVar, fcxy fcxyVar) throws Throwable {
        Object objR = etv.r(this.b, dodVar, fdatVar, fcxyVar);
        return objR == fcyl.a ? objR : fctx.a;
    }

    @Override // defpackage.dyb
    public final /* synthetic */ boolean g() {
        return true;
    }

    @Override // defpackage.dyb
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // defpackage.dyb
    public final boolean i() {
        return this.b.i();
    }
}
