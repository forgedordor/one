package defpackage;

import java.util.LinkedHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ojg {
    public static final lxk a;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        fdap fdapVar = new fdap() { // from class: ojf
            @Override // defpackage.fdap
            public final Object invoke(Object obj) {
                lxk lxkVar = ojg.a;
                ((lyp) obj).getClass();
                return new oje();
            }
        };
        int i = fdcj.a;
        lyr.b(new fdbi(oje.class), fdapVar, linkedHashMap);
        a = lyr.a(linkedHashMap);
    }
}
