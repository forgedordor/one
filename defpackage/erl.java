package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class erl extends etv {
    public static final hyr a = hxu.a(new fdat() { // from class: erj
        @Override // defpackage.fdat
        public final Object a(Object obj, Object obj2) {
            erl erlVar = (erl) obj2;
            hyr hyrVar = erl.a;
            return fcva.g(Integer.valueOf(erlVar.j()), Float.valueOf(fddu.e(erlVar.c(), -0.5f, 0.5f)), Integer.valueOf(erlVar.b()));
        }
    }, new fdap() { // from class: erk
        @Override // defpackage.fdap
        public final Object invoke(Object obj) {
            final List list = (List) obj;
            Object obj2 = list.get(0);
            obj2.getClass();
            int iIntValue = ((Integer) obj2).intValue();
            Object obj3 = list.get(1);
            obj3.getClass();
            return new erl(iIntValue, ((Float) obj3).floatValue(), new fdae() { // from class: eri
                @Override // defpackage.fdae
                public final Object invoke() {
                    hyr hyrVar = erl.a;
                    Object obj4 = list.get(2);
                    obj4.getClass();
                    Integer num = (Integer) obj4;
                    num.intValue();
                    return num;
                }
            });
        }
    });
    public final hox b;

    public erl(int i, float f, fdae fdaeVar) {
        super(i, f);
        this.b = new hpl(fdaeVar, hsi.a);
    }

    @Override // defpackage.etv
    public final int b() {
        return ((Number) ((fdae) this.b.a()).invoke()).intValue();
    }
}
