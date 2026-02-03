package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hdy extends etv {
    public static final /* synthetic */ int b = 0;
    public final hox a;

    static {
        hxu.a(new fdat() { // from class: hdw
            @Override // defpackage.fdat
            public final Object a(Object obj, Object obj2) {
                hdy hdyVar = (hdy) obj2;
                int i = hdy.b;
                return fcva.g(Integer.valueOf(hdyVar.j()), Float.valueOf(fddu.e(hdyVar.c(), -0.5f, 0.5f)), hdyVar.a.a());
            }
        }, new fdap() { // from class: hdx
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                final List list = (List) obj;
                Object obj2 = list.get(0);
                obj2.getClass();
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                obj3.getClass();
                return new hdy(iIntValue, ((Float) obj3).floatValue(), new fdae() { // from class: hdv
                    @Override // defpackage.fdae
                    public final Object invoke() {
                        int i = hdy.b;
                        Object obj4 = list.get(2);
                        obj4.getClass();
                        Integer num = (Integer) obj4;
                        num.intValue();
                        return num;
                    }
                });
            }
        });
    }

    public hdy(int i, float f, fdae fdaeVar) {
        super(i, f);
        this.a = new hpl(fdaeVar, hsi.a);
    }

    @Override // defpackage.etv
    public final int b() {
        return ((Number) ((fdae) this.a.a()).invoke()).intValue();
    }
}
